package typings
package expoLib.expoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo", "ImagePicker")
@js.native
object ImagePickerNs extends js.Object {
  
  trait CameraOptions extends js.Object {
    var allowsEditing: js.UndefOr[scala.Boolean] = js.undefined
    var aspect: js.UndefOr[js.Tuple2[scala.Double, scala.Double]] = js.undefined
    var base64: js.UndefOr[scala.Boolean] = js.undefined
    var exif: js.UndefOr[scala.Boolean] = js.undefined
    var quality: js.UndefOr[scala.Double] = js.undefined
  }
  
  
  trait ImageInfo extends js.Object {
    var base64: js.UndefOr[java.lang.String] = js.undefined
    var duration: js.UndefOr[scala.Double] = js.undefined
    var exif: js.UndefOr[js.Object] = js.undefined
    var height: scala.Double
    var `type`: expoLib.expoLibStrings.video | expoLib.expoLibStrings.image
    var uri: java.lang.String
    var width: scala.Double
  }
  
  
  trait ImageLibraryOptions extends js.Object {
    var allowsEditing: js.UndefOr[scala.Boolean] = js.undefined
    var aspect: js.UndefOr[js.Tuple2[scala.Double, scala.Double]] = js.undefined
    var base64: js.UndefOr[scala.Boolean] = js.undefined
    var exif: js.UndefOr[scala.Boolean] = js.undefined
    var mediaTypes: js.UndefOr[
        expoLib.expoLibStrings.All | expoLib.expoLibStrings.Videos | expoLib.expoLibStrings.Images
      ] = js.undefined
    var quality: js.UndefOr[scala.Double] = js.undefined
  }
  
  
  trait _MediaTypeOptions extends js.Object {
    var All: expoLib.expoLibStrings.All
    var Images: expoLib.expoLibStrings.Images
    var Videos: expoLib.expoLibStrings.Videos
  }
  
  val MediaTypeOptions: _MediaTypeOptions = js.native
  /**
       * require Permissions.CAMERA_ROLL
       */
  def launchCameraAsync(): stdLib.Promise[ImageResult] = js.native
  /**
       * require Permissions.CAMERA_ROLL
       */
  def launchCameraAsync(options: CameraOptions): stdLib.Promise[ImageResult] = js.native
  /**
       * require Permissions.CAMERA_ROLL
       */
  def launchImageLibraryAsync(): stdLib.Promise[ImageResult] = js.native
  /**
       * require Permissions.CAMERA_ROLL
       */
  def launchImageLibraryAsync(options: ImageLibraryOptions): stdLib.Promise[ImageResult] = js.native
  type ImageResult = expoLib.Anon_Cancelled | (expoLib.Anon_CancelledFalse with ImageInfo)
}

