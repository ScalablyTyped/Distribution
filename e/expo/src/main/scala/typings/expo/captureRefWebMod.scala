package typings.expo

import typings.reactNativeViewShot.mod.CaptureOptions
import typings.std.Blob
import typings.std.Element
import typings.std.Uint8ClampedArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo/build/takeSnapshotAsync/captureRef.web", JSImport.Namespace)
@js.native
object captureRefWebMod extends js.Object {
  def default(component: Element): js.Promise[String | Uint8ClampedArray | Blob] = js.native
  def default(component: Element, options: CaptureOptions): js.Promise[String | Uint8ClampedArray | Blob] = js.native
}

