package typings.expo

import typings.react.mod.ReactInstance
import typings.react.mod.RefObject
import typings.reactNativeViewShot.mod.CaptureOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo/build/takeSnapshotAsync/captureRef", JSImport.Namespace)
@js.native
object captureRefMod extends js.Object {
  def default[T](viewRef: ReactInstance): js.Promise[String] = js.native
  def default[T](viewRef: ReactInstance, options: CaptureOptions): js.Promise[String] = js.native
  def default[T](viewRef: RefObject[T]): js.Promise[String] = js.native
  def default[T](viewRef: RefObject[T], options: CaptureOptions): js.Promise[String] = js.native
}

