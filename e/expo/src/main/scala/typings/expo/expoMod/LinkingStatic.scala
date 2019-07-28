package typings.expo.expoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LinkingStatic
  extends typings.reactDashNative.reactDashNativeMod.LinkingStatic {
  def makeUrl(path: String): String = js.native
  def makeUrl(path: String, queryParams: HashMap): String = js.native
  def parse(url: String): LinkInfo = js.native
  def parseInitialURLAsync(): js.Promise[LinkInfo] = js.native
}

