package typings
package giphyDashApiLib.giphyDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Images extends js.Object {
  var downsized: BaseImage with giphyDashApiLib.Anon_SizeString
  var downsized_large: BaseImage with giphyDashApiLib.Anon_SizeString
  var downsized_medium: BaseImage with giphyDashApiLib.Anon_SizeString
  var downsized_small: BaseImage with giphyDashApiLib.Anon_SizeString
  var downsized_still: BaseImage
  var fixed_height: BaseImage with giphyDashApiLib.Anon_Mp4
  var fixed_height_downsampled: BaseImage with giphyDashApiLib.Anon_Size
  var fixed_height_small: BaseImage with giphyDashApiLib.Anon_Mp4
  var fixed_height_small_still: BaseImage
  var fixed_height_still: BaseImage
  var fixed_width: BaseImage with giphyDashApiLib.Anon_Mp4
  var fixed_width_downsampled: BaseImage with giphyDashApiLib.Anon_Size
  var fixed_width_small: BaseImage with giphyDashApiLib.Anon_Mp4
  var fixed_width_small_still: BaseImage
  var fixed_width_still: BaseImage
  var looping: giphyDashApiLib.Anon_Mp4String
  var original: BaseImage with giphyDashApiLib.Anon_Frames
  var original_still: BaseImage
  var preview: giphyDashApiLib.Anon_Height
  var preview_gif: BaseImage with giphyDashApiLib.Anon_SizeString
}

object Images {
  @scala.inline
  def apply(
    downsized: BaseImage with giphyDashApiLib.Anon_SizeString,
    downsized_large: BaseImage with giphyDashApiLib.Anon_SizeString,
    downsized_medium: BaseImage with giphyDashApiLib.Anon_SizeString,
    downsized_small: BaseImage with giphyDashApiLib.Anon_SizeString,
    downsized_still: BaseImage,
    fixed_height: BaseImage with giphyDashApiLib.Anon_Mp4,
    fixed_height_downsampled: BaseImage with giphyDashApiLib.Anon_Size,
    fixed_height_small: BaseImage with giphyDashApiLib.Anon_Mp4,
    fixed_height_small_still: BaseImage,
    fixed_height_still: BaseImage,
    fixed_width: BaseImage with giphyDashApiLib.Anon_Mp4,
    fixed_width_downsampled: BaseImage with giphyDashApiLib.Anon_Size,
    fixed_width_small: BaseImage with giphyDashApiLib.Anon_Mp4,
    fixed_width_small_still: BaseImage,
    fixed_width_still: BaseImage,
    looping: giphyDashApiLib.Anon_Mp4String,
    original: BaseImage with giphyDashApiLib.Anon_Frames,
    original_still: BaseImage,
    preview: giphyDashApiLib.Anon_Height,
    preview_gif: BaseImage with giphyDashApiLib.Anon_SizeString
  ): Images = {
    val __obj = js.Dynamic.literal(downsized = downsized, downsized_large = downsized_large, downsized_medium = downsized_medium, downsized_small = downsized_small, downsized_still = downsized_still, fixed_height = fixed_height, fixed_height_downsampled = fixed_height_downsampled, fixed_height_small = fixed_height_small, fixed_height_small_still = fixed_height_small_still, fixed_height_still = fixed_height_still, fixed_width = fixed_width, fixed_width_downsampled = fixed_width_downsampled, fixed_width_small = fixed_width_small, fixed_width_small_still = fixed_width_small_still, fixed_width_still = fixed_width_still, looping = looping, original = original, original_still = original_still, preview = preview, preview_gif = preview_gif)
  
    __obj.asInstanceOf[Images]
  }
}

