package typings.deviceUuid.mod

import typings.deviceUuid.deviceUuidBooleans.`false`
import typings.deviceUuid.deviceUuidStrings.CaptiveNetwork
import typings.deviceUuid.deviceUuidStrings.Silk
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("device-uuid", "DeviceUUID")
@js.native
class DeviceUUID () extends js.Object {
  
  var Agent: typings.deviceUuid.mod.Agent = js.native
  
  var DefaultAgent: Agent = js.native
  
  def get(): String = js.native
  def get(customData: Record[String, String | Boolean]): String = js.native
  
  def getBrowser(s: String): String = js.native
  
  def getBrowserVersion(s: String): js.UndefOr[String] = js.native
  
  def getCPU(): Unit = js.native
  
  def getColorDepth(): Unit = js.native
  
  /** [sic] */
  def getLaguage(): Unit = js.native
  
  def getOS(s: String): String = js.native
  
  def getPixelDepth(): Unit = js.native
  
  def getPlatform(s: String): String = js.native
  
  def getScreenResolution(): Unit = js.native
  
  var options: Options = js.native
  
  def parse(): Agent = js.native
  def parse(source: String): Agent = js.native
  
  def reset(): DeviceUUID = js.native
  
  def testAndroidTablet(): Unit = js.native
  
  def testBot(): Unit = js.native
  
  def testCaptiveNetwork(): `false` | CaptiveNetwork = js.native
  
  def testCompatibilityMode(): Unit = js.native
  
  def testKindleFire(): String | `false` = js.native
  
  def testMobile(): Unit = js.native
  
  def testNginxGeoIP(headers: Headers): Unit = js.native
  
  def testSilk(): `false` | Silk = js.native
  
  def testSmartTV(): Unit = js.native
  
  def testTablet(): Unit = js.native
  
  def testTouchSupport(): Unit = js.native
  
  var version: String = js.native
}
