package typings.fancybox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FancyBoxButtonTypes extends js.Object {
  var close: String
  var download: String
  var fullScreen: String
  var share: String
  var slideShow: String
  var thumbs: String
  var zoom: String
}

object FancyBoxButtonTypes {
  @scala.inline
  def apply(
    close: String,
    download: String,
    fullScreen: String,
    share: String,
    slideShow: String,
    thumbs: String,
    zoom: String
  ): FancyBoxButtonTypes = {
    val __obj = js.Dynamic.literal(close = close.asInstanceOf[js.Any], download = download.asInstanceOf[js.Any], fullScreen = fullScreen.asInstanceOf[js.Any], share = share.asInstanceOf[js.Any], slideShow = slideShow.asInstanceOf[js.Any], thumbs = thumbs.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FancyBoxButtonTypes]
  }
}

