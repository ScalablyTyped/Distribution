package typings
package fancyboxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FancyBoxButtonTypes extends js.Object {
  var close: java.lang.String
  var download: java.lang.String
  var fullScreen: java.lang.String
  var share: java.lang.String
  var slideShow: java.lang.String
  var thumbs: java.lang.String
  var zoom: java.lang.String
}

object FancyBoxButtonTypes {
  @scala.inline
  def apply(
    close: java.lang.String,
    download: java.lang.String,
    fullScreen: java.lang.String,
    share: java.lang.String,
    slideShow: java.lang.String,
    thumbs: java.lang.String,
    zoom: java.lang.String
  ): FancyBoxButtonTypes = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("close")(close)
    __obj.updateDynamic("download")(download)
    __obj.updateDynamic("fullScreen")(fullScreen)
    __obj.updateDynamic("share")(share)
    __obj.updateDynamic("slideShow")(slideShow)
    __obj.updateDynamic("thumbs")(thumbs)
    __obj.updateDynamic("zoom")(zoom)
    __obj.asInstanceOf[FancyBoxButtonTypes]
  }
}

