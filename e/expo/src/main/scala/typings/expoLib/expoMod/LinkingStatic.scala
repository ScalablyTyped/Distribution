package typings
package expoLib.expoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LinkingStatic
  extends reactDashNativeLib.reactDashNativeMod.LinkingStatic {
  def makeUrl(path: java.lang.String): java.lang.String = js.native
  def makeUrl(path: java.lang.String, queryParams: HashMap): java.lang.String = js.native
  def parse(url: java.lang.String): LinkInfo = js.native
  def parseInitialURLAsync(): stdLib.Promise[LinkInfo] = js.native
}

