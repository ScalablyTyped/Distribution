package typings
package giphyDashApiLib.giphyDashApiMod.giphyApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Images extends js.Object {
  var downsized: giphyDashApiLib.giphyDashApiMod.BaseImage with giphyDashApiLib.Anon_SizeString
  var downsized_large: giphyDashApiLib.giphyDashApiMod.BaseImage with giphyDashApiLib.Anon_SizeString
  var downsized_medium: giphyDashApiLib.giphyDashApiMod.BaseImage with giphyDashApiLib.Anon_SizeString
  var downsized_small: giphyDashApiLib.giphyDashApiMod.BaseImage with giphyDashApiLib.Anon_SizeString
  var downsized_still: giphyDashApiLib.giphyDashApiMod.BaseImage
  var fixed_height: giphyDashApiLib.giphyDashApiMod.BaseImage with giphyDashApiLib.Anon_Mp4
  var fixed_height_downsampled: giphyDashApiLib.giphyDashApiMod.BaseImage with giphyDashApiLib.Anon_Size
  var fixed_height_small: giphyDashApiLib.giphyDashApiMod.BaseImage with giphyDashApiLib.Anon_Mp4
  var fixed_height_small_still: giphyDashApiLib.giphyDashApiMod.BaseImage
  var fixed_height_still: giphyDashApiLib.giphyDashApiMod.BaseImage
  var fixed_width: giphyDashApiLib.giphyDashApiMod.BaseImage with giphyDashApiLib.Anon_Mp4
  var fixed_width_downsampled: giphyDashApiLib.giphyDashApiMod.BaseImage with giphyDashApiLib.Anon_Size
  var fixed_width_small: giphyDashApiLib.giphyDashApiMod.BaseImage with giphyDashApiLib.Anon_Mp4
  var fixed_width_small_still: giphyDashApiLib.giphyDashApiMod.BaseImage
  var fixed_width_still: giphyDashApiLib.giphyDashApiMod.BaseImage
  var looping: giphyDashApiLib.Anon_Mp4String
  var original: giphyDashApiLib.giphyDashApiMod.BaseImage with giphyDashApiLib.Anon_Frames
  var original_still: giphyDashApiLib.giphyDashApiMod.BaseImage
  var preview: giphyDashApiLib.Anon_Height
  var preview_gif: giphyDashApiLib.giphyDashApiMod.BaseImage with giphyDashApiLib.Anon_SizeString
}

object Images {
  @scala.inline
  def apply(
    downsized: giphyDashApiLib.giphyDashApiMod.BaseImage with giphyDashApiLib.Anon_SizeString,
    downsized_large: giphyDashApiLib.giphyDashApiMod.BaseImage with giphyDashApiLib.Anon_SizeString,
    downsized_medium: giphyDashApiLib.giphyDashApiMod.BaseImage with giphyDashApiLib.Anon_SizeString,
    downsized_small: giphyDashApiLib.giphyDashApiMod.BaseImage with giphyDashApiLib.Anon_SizeString,
    downsized_still: giphyDashApiLib.giphyDashApiMod.BaseImage,
    fixed_height: giphyDashApiLib.giphyDashApiMod.BaseImage with giphyDashApiLib.Anon_Mp4,
    fixed_height_downsampled: giphyDashApiLib.giphyDashApiMod.BaseImage with giphyDashApiLib.Anon_Size,
    fixed_height_small: giphyDashApiLib.giphyDashApiMod.BaseImage with giphyDashApiLib.Anon_Mp4,
    fixed_height_small_still: giphyDashApiLib.giphyDashApiMod.BaseImage,
    fixed_height_still: giphyDashApiLib.giphyDashApiMod.BaseImage,
    fixed_width: giphyDashApiLib.giphyDashApiMod.BaseImage with giphyDashApiLib.Anon_Mp4,
    fixed_width_downsampled: giphyDashApiLib.giphyDashApiMod.BaseImage with giphyDashApiLib.Anon_Size,
    fixed_width_small: giphyDashApiLib.giphyDashApiMod.BaseImage with giphyDashApiLib.Anon_Mp4,
    fixed_width_small_still: giphyDashApiLib.giphyDashApiMod.BaseImage,
    fixed_width_still: giphyDashApiLib.giphyDashApiMod.BaseImage,
    looping: giphyDashApiLib.Anon_Mp4String,
    original: giphyDashApiLib.giphyDashApiMod.BaseImage with giphyDashApiLib.Anon_Frames,
    original_still: giphyDashApiLib.giphyDashApiMod.BaseImage,
    preview: giphyDashApiLib.Anon_Height,
    preview_gif: giphyDashApiLib.giphyDashApiMod.BaseImage with giphyDashApiLib.Anon_SizeString
  ): Images = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("downsized")(downsized)
    __obj.updateDynamic("downsized_large")(downsized_large)
    __obj.updateDynamic("downsized_medium")(downsized_medium)
    __obj.updateDynamic("downsized_small")(downsized_small)
    __obj.updateDynamic("downsized_still")(downsized_still)
    __obj.updateDynamic("fixed_height")(fixed_height)
    __obj.updateDynamic("fixed_height_downsampled")(fixed_height_downsampled)
    __obj.updateDynamic("fixed_height_small")(fixed_height_small)
    __obj.updateDynamic("fixed_height_small_still")(fixed_height_small_still)
    __obj.updateDynamic("fixed_height_still")(fixed_height_still)
    __obj.updateDynamic("fixed_width")(fixed_width)
    __obj.updateDynamic("fixed_width_downsampled")(fixed_width_downsampled)
    __obj.updateDynamic("fixed_width_small")(fixed_width_small)
    __obj.updateDynamic("fixed_width_small_still")(fixed_width_small_still)
    __obj.updateDynamic("fixed_width_still")(fixed_width_still)
    __obj.updateDynamic("looping")(looping)
    __obj.updateDynamic("original")(original)
    __obj.updateDynamic("original_still")(original_still)
    __obj.updateDynamic("preview")(preview)
    __obj.updateDynamic("preview_gif")(preview_gif)
    __obj.asInstanceOf[Images]
  }
}

