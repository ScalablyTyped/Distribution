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
    val __obj = js.Dynamic.literal(close = close, download = download, fullScreen = fullScreen, share = share, slideShow = slideShow, thumbs = thumbs, zoom = zoom)
  
    __obj.asInstanceOf[FancyBoxButtonTypes]
  }
}

