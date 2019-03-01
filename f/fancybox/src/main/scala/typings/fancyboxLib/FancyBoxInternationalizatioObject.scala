package typings
package fancyboxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FancyBoxInternationalizatioObject extends js.Object {
  var CLOSE: js.UndefOr[java.lang.String] = js.undefined
  var DOWNLOAD: js.UndefOr[java.lang.String] = js.undefined
  var ERROR: js.UndefOr[java.lang.String] = js.undefined
  var FULL_SCREEN: js.UndefOr[java.lang.String] = js.undefined
  var NEXT: js.UndefOr[java.lang.String] = js.undefined
  var PLAY_START: js.UndefOr[java.lang.String] = js.undefined
  var PLAY_STOP: js.UndefOr[java.lang.String] = js.undefined
  var PREV: js.UndefOr[java.lang.String] = js.undefined
  var SHARE: js.UndefOr[java.lang.String] = js.undefined
  var THUMBS: js.UndefOr[java.lang.String] = js.undefined
  var ZOOM: js.UndefOr[java.lang.String] = js.undefined
}

object FancyBoxInternationalizatioObject {
  @scala.inline
  def apply(
    CLOSE: java.lang.String = null,
    DOWNLOAD: java.lang.String = null,
    ERROR: java.lang.String = null,
    FULL_SCREEN: java.lang.String = null,
    NEXT: java.lang.String = null,
    PLAY_START: java.lang.String = null,
    PLAY_STOP: java.lang.String = null,
    PREV: java.lang.String = null,
    SHARE: java.lang.String = null,
    THUMBS: java.lang.String = null,
    ZOOM: java.lang.String = null
  ): FancyBoxInternationalizatioObject = {
    val __obj = js.Dynamic.literal()
    if (CLOSE != null) __obj.updateDynamic("CLOSE")(CLOSE)
    if (DOWNLOAD != null) __obj.updateDynamic("DOWNLOAD")(DOWNLOAD)
    if (ERROR != null) __obj.updateDynamic("ERROR")(ERROR)
    if (FULL_SCREEN != null) __obj.updateDynamic("FULL_SCREEN")(FULL_SCREEN)
    if (NEXT != null) __obj.updateDynamic("NEXT")(NEXT)
    if (PLAY_START != null) __obj.updateDynamic("PLAY_START")(PLAY_START)
    if (PLAY_STOP != null) __obj.updateDynamic("PLAY_STOP")(PLAY_STOP)
    if (PREV != null) __obj.updateDynamic("PREV")(PREV)
    if (SHARE != null) __obj.updateDynamic("SHARE")(SHARE)
    if (THUMBS != null) __obj.updateDynamic("THUMBS")(THUMBS)
    if (ZOOM != null) __obj.updateDynamic("ZOOM")(ZOOM)
    __obj.asInstanceOf[FancyBoxInternationalizatioObject]
  }
}

