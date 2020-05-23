package typings.giphyApi.mod

import typings.giphyApi.anon.BaseImagesizestring
import typings.giphyApi.anon.BaseImagesizestringframes
import typings.giphyApi.anon.BaseImagesizestringmp4str
import typings.giphyApi.anon.BaseImagesizestringwebpst
import typings.giphyApi.anon.Height
import typings.giphyApi.anon.Mp4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Images extends js.Object {
  var downsized: BaseImagesizestring
  var downsized_large: BaseImagesizestring
  var downsized_medium: BaseImagesizestring
  var downsized_small: BaseImagesizestring
  var downsized_still: BaseImage
  var fixed_height: BaseImagesizestringmp4str
  var fixed_height_downsampled: BaseImagesizestringwebpst
  var fixed_height_small: BaseImagesizestringmp4str
  var fixed_height_small_still: BaseImage
  var fixed_height_still: BaseImage
  var fixed_width: BaseImagesizestringmp4str
  var fixed_width_downsampled: BaseImagesizestringwebpst
  var fixed_width_small: BaseImagesizestringmp4str
  var fixed_width_small_still: BaseImage
  var fixed_width_still: BaseImage
  var looping: Mp4
  var original: BaseImagesizestringframes
  var original_still: BaseImage
  var preview: Height
  var preview_gif: BaseImagesizestring
}

object Images {
  @scala.inline
  def apply(
    downsized: BaseImagesizestring,
    downsized_large: BaseImagesizestring,
    downsized_medium: BaseImagesizestring,
    downsized_small: BaseImagesizestring,
    downsized_still: BaseImage,
    fixed_height: BaseImagesizestringmp4str,
    fixed_height_downsampled: BaseImagesizestringwebpst,
    fixed_height_small: BaseImagesizestringmp4str,
    fixed_height_small_still: BaseImage,
    fixed_height_still: BaseImage,
    fixed_width: BaseImagesizestringmp4str,
    fixed_width_downsampled: BaseImagesizestringwebpst,
    fixed_width_small: BaseImagesizestringmp4str,
    fixed_width_small_still: BaseImage,
    fixed_width_still: BaseImage,
    looping: Mp4,
    original: BaseImagesizestringframes,
    original_still: BaseImage,
    preview: Height,
    preview_gif: BaseImagesizestring
  ): Images = {
    val __obj = js.Dynamic.literal(downsized = downsized.asInstanceOf[js.Any], downsized_large = downsized_large.asInstanceOf[js.Any], downsized_medium = downsized_medium.asInstanceOf[js.Any], downsized_small = downsized_small.asInstanceOf[js.Any], downsized_still = downsized_still.asInstanceOf[js.Any], fixed_height = fixed_height.asInstanceOf[js.Any], fixed_height_downsampled = fixed_height_downsampled.asInstanceOf[js.Any], fixed_height_small = fixed_height_small.asInstanceOf[js.Any], fixed_height_small_still = fixed_height_small_still.asInstanceOf[js.Any], fixed_height_still = fixed_height_still.asInstanceOf[js.Any], fixed_width = fixed_width.asInstanceOf[js.Any], fixed_width_downsampled = fixed_width_downsampled.asInstanceOf[js.Any], fixed_width_small = fixed_width_small.asInstanceOf[js.Any], fixed_width_small_still = fixed_width_small_still.asInstanceOf[js.Any], fixed_width_still = fixed_width_still.asInstanceOf[js.Any], looping = looping.asInstanceOf[js.Any], original = original.asInstanceOf[js.Any], original_still = original_still.asInstanceOf[js.Any], preview = preview.asInstanceOf[js.Any], preview_gif = preview_gif.asInstanceOf[js.Any])
    __obj.asInstanceOf[Images]
  }
}

