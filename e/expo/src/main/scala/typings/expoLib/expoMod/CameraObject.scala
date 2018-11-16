package typings
package expoLib.expoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo", "CameraObject")
@js.native
class CameraObject () extends js.Object {
  def getSupportedRatiosAsync(): stdLib.Promise[js.Array[java.lang.String]] = js.native
  def recordAsync(options: RecordingOptions): stdLib.Promise[expoLib.Anon_UriString] = js.native
  def stopRecording(): scala.Unit = js.native
  def takePictureAsync(): stdLib.Promise[PictureResponse] = js.native
  def takePictureAsync(options: PictureOptions): stdLib.Promise[PictureResponse] = js.native
}

