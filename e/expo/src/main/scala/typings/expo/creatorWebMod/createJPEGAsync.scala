package typings.expo.creatorWebMod

import typings.reactNativeViewShot.mod.CaptureOptions
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo/build/takeSnapshotAsync/Creator.web", "createJPEGAsync")
@js.native
object createJPEGAsync extends js.Object {
  def apply(element: Element, hasQualityOptions: CaptureOptions): js.Promise[String] = js.native
}

