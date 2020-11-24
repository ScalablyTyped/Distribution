package typings.expressUseragent.mod

import typings.expressUseragent.expressUseragentBooleans.`false`
import typings.expressUseragent.expressUseragentStrings.CaptiveNetwork
import typings.expressUseragent.expressUseragentStrings.Silk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("express-useragent", "UserAgent")
@js.native
class UserAgent () extends js.Object {
  
  var Agent: Details = js.native
  
  var DefaultAgent: Details = js.native
  
  def getBrowser(string: String): String = js.native
  
  def getBrowserVersion(string: String): String = js.native
  
  def getOS(string: String): String = js.native
  
  def getPlatform(string: String): String = js.native
  
  def parse(source: String): Details = js.native
  
  def reset(): Details = js.native
  
  def testAndroidTablet(): Unit = js.native
  
  def testBot(): Unit = js.native
  
  def testCaptiveNetwork(): CaptiveNetwork | `false` = js.native
  
  def testCompatibilityMode(): Unit = js.native
  
  def testKindleFire(): String | `false` = js.native
  
  def testMobile(): Unit = js.native
  
  def testNginxGeoIP(): Unit = js.native
  
  def testSilk(): Silk | `false` = js.native
  
  def testSmartTV(): Unit = js.native
  
  def testTablet(): Unit = js.native
  
  def testWebkit(): Unit = js.native
  
  var version: String = js.native
}
