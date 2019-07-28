package typings.expo.expoMod

import typings.expo.Anon_Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo", "CameraObject")
@js.native
class CameraObject () extends js.Object {
  def getSupportedRatiosAsync(): js.Promise[js.Array[String]] = js.native
  def recordAsync(options: RecordingOptions): js.Promise[Anon_Uri] = js.native
  def stopRecording(): Unit = js.native
  def takePictureAsync(): js.Promise[PictureResponse] = js.native
  def takePictureAsync(options: PictureOptions): js.Promise[PictureResponse] = js.native
}

