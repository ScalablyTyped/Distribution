package typings.expressDashUseragent.expressDashUseragentMod

import typings.express.expressMod.NextFunction
import typings.express.expressMod.Request
import typings.express.expressMod.Response
import typings.expressDashUseragent.expressDashUseragentNumbers.`false`
import typings.expressDashUseragent.expressDashUseragentStrings.CaptiveNetwork
import typings.expressDashUseragent.expressDashUseragentStrings.Silk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-useragent", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val Agent: Details = js.native
  val DefaultAgent: Details = js.native
  val version: String = js.native
  def express(): js.Function3[/* req */ Request, /* res */ Response, /* next */ js.UndefOr[NextFunction], Unit] = js.native
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
}

