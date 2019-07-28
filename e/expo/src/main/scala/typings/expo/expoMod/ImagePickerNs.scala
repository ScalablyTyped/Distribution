package typings.expo.expoMod

import typings.expo.Anon_Cancelled
import typings.expo.Anon_CancelledFalse
import typings.expo.expoMod.ImagePickerNs.CameraOptions
import typings.expo.expoMod.ImagePickerNs.ImageInfo
import typings.expo.expoMod.ImagePickerNs.ImageLibraryOptions
import typings.expo.expoMod.ImagePickerNs.ImageResult
import typings.expo.expoMod.ImagePickerNs._MediaTypeOptions
import typings.expo.expoStrings.All
import typings.expo.expoStrings.Images
import typings.expo.expoStrings.Videos
import typings.expo.expoStrings.image
import typings.expo.expoStrings.video
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo", "ImagePicker")
@js.native
object ImagePickerNs extends js.Object {
  trait CameraOptions extends js.Object {
    var allowsEditing: js.UndefOr[Boolean] = js.undefined
    var aspect: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
    var base64: js.UndefOr[Boolean] = js.undefined
    var exif: js.UndefOr[Boolean] = js.undefined
    var quality: js.UndefOr[Double] = js.undefined
  }
  
  trait ImageInfo extends js.Object {
    var base64: js.UndefOr[String] = js.undefined
    var duration: js.UndefOr[Double] = js.undefined
    var exif: js.UndefOr[js.Object] = js.undefined
    var height: Double
    var `type`: video | image
    var uri: String
    var width: Double
  }
  
  trait ImageLibraryOptions extends js.Object {
    var allowsEditing: js.UndefOr[Boolean] = js.undefined
    var aspect: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
    var base64: js.UndefOr[Boolean] = js.undefined
    var exif: js.UndefOr[Boolean] = js.undefined
    var mediaTypes: js.UndefOr[All | Videos | Images] = js.undefined
    var quality: js.UndefOr[Double] = js.undefined
  }
  
  trait _MediaTypeOptions extends js.Object {
    var All: typings.expo.expoStrings.All
    var Images: typings.expo.expoStrings.Images
    var Videos: typings.expo.expoStrings.Videos
  }
  
  val MediaTypeOptions: _MediaTypeOptions = js.native
  /**
    * require Permissions.CAMERA_ROLL
    */
  def launchCameraAsync(): js.Promise[ImageResult] = js.native
  def launchCameraAsync(options: CameraOptions): js.Promise[ImageResult] = js.native
  /**
    * require Permissions.CAMERA_ROLL
    */
  def launchImageLibraryAsync(): js.Promise[ImageResult] = js.native
  def launchImageLibraryAsync(options: ImageLibraryOptions): js.Promise[ImageResult] = js.native
  type ImageResult = Anon_Cancelled | (Anon_CancelledFalse with ImageInfo)
}

