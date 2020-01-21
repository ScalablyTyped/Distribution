package typings.expo.creatorWebMod

import typings.reactNativeViewShot.mod.CaptureOptions
import typings.std.Blob
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo/build/takeSnapshotAsync/Creator.web", "createBlobAsync")
@js.native
object createBlobAsync extends js.Object {
  def apply(element: Element, hasQualityOptions: CaptureOptions): js.Promise[Blob] = js.native
}

