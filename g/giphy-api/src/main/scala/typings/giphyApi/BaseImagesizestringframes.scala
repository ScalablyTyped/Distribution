package typings.giphyApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined giphy-api.giphy-api.BaseImage & {  size  :string,   frames  :string,   mp4  :string,   mp4_size  :string,   webp  :string,   webp_size  :string} */
trait BaseImagesizestringframes extends js.Object {
  var frames: String
  var height: String
  var mp4: String
  var mp4_size: String
  var size: String
  var url: String
  var webp: String
  var webp_size: String
  var width: String
}

object BaseImagesizestringframes {
  @scala.inline
  def apply(
    frames: String,
    height: String,
    mp4: String,
    mp4_size: String,
    size: String,
    url: String,
    webp: String,
    webp_size: String,
    width: String
  ): BaseImagesizestringframes = {
    val __obj = js.Dynamic.literal(frames = frames.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], mp4 = mp4.asInstanceOf[js.Any], mp4_size = mp4_size.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], webp = webp.asInstanceOf[js.Any], webp_size = webp_size.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseImagesizestringframes]
  }
}

