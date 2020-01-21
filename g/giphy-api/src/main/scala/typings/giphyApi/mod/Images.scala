package typings.giphyApi.mod

import typings.giphyApi.AnonFrames
import typings.giphyApi.AnonHeight
import typings.giphyApi.AnonMp4
import typings.giphyApi.AnonMp4String
import typings.giphyApi.AnonSize
import typings.giphyApi.AnonSizeString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Images extends js.Object {
  var downsized: BaseImage with AnonSizeString
  var downsized_large: BaseImage with AnonSizeString
  var downsized_medium: BaseImage with AnonSizeString
  var downsized_small: BaseImage with AnonSizeString
  var downsized_still: BaseImage
  var fixed_height: BaseImage with AnonMp4
  var fixed_height_downsampled: BaseImage with AnonSize
  var fixed_height_small: BaseImage with AnonMp4
  var fixed_height_small_still: BaseImage
  var fixed_height_still: BaseImage
  var fixed_width: BaseImage with AnonMp4
  var fixed_width_downsampled: BaseImage with AnonSize
  var fixed_width_small: BaseImage with AnonMp4
  var fixed_width_small_still: BaseImage
  var fixed_width_still: BaseImage
  var looping: AnonMp4String
  var original: BaseImage with AnonFrames
  var original_still: BaseImage
  var preview: AnonHeight
  var preview_gif: BaseImage with AnonSizeString
}

object Images {
  @scala.inline
  def apply(
    downsized: BaseImage with AnonSizeString,
    downsized_large: BaseImage with AnonSizeString,
    downsized_medium: BaseImage with AnonSizeString,
    downsized_small: BaseImage with AnonSizeString,
    downsized_still: BaseImage,
    fixed_height: BaseImage with AnonMp4,
    fixed_height_downsampled: BaseImage with AnonSize,
    fixed_height_small: BaseImage with AnonMp4,
    fixed_height_small_still: BaseImage,
    fixed_height_still: BaseImage,
    fixed_width: BaseImage with AnonMp4,
    fixed_width_downsampled: BaseImage with AnonSize,
    fixed_width_small: BaseImage with AnonMp4,
    fixed_width_small_still: BaseImage,
    fixed_width_still: BaseImage,
    looping: AnonMp4String,
    original: BaseImage with AnonFrames,
    original_still: BaseImage,
    preview: AnonHeight,
    preview_gif: BaseImage with AnonSizeString
  ): Images = {
    val __obj = js.Dynamic.literal(downsized = downsized.asInstanceOf[js.Any], downsized_large = downsized_large.asInstanceOf[js.Any], downsized_medium = downsized_medium.asInstanceOf[js.Any], downsized_small = downsized_small.asInstanceOf[js.Any], downsized_still = downsized_still.asInstanceOf[js.Any], fixed_height = fixed_height.asInstanceOf[js.Any], fixed_height_downsampled = fixed_height_downsampled.asInstanceOf[js.Any], fixed_height_small = fixed_height_small.asInstanceOf[js.Any], fixed_height_small_still = fixed_height_small_still.asInstanceOf[js.Any], fixed_height_still = fixed_height_still.asInstanceOf[js.Any], fixed_width = fixed_width.asInstanceOf[js.Any], fixed_width_downsampled = fixed_width_downsampled.asInstanceOf[js.Any], fixed_width_small = fixed_width_small.asInstanceOf[js.Any], fixed_width_small_still = fixed_width_small_still.asInstanceOf[js.Any], fixed_width_still = fixed_width_still.asInstanceOf[js.Any], looping = looping.asInstanceOf[js.Any], original = original.asInstanceOf[js.Any], original_still = original_still.asInstanceOf[js.Any], preview = preview.asInstanceOf[js.Any], preview_gif = preview_gif.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Images]
  }
}

