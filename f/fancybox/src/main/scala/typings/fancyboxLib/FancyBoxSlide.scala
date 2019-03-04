package typings
package fancyboxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FancyBoxSlide extends FancyBoxGroupItemWithFilledProps {
  @JSName("$content")
  var $content: js.UndefOr[JQuery] = js.undefined
  @JSName("$iframe")
  var $iframe: js.UndefOr[JQuery] = js.undefined
  @JSName("$image")
  var $image: js.UndefOr[JQuery] = js.undefined
  @JSName("$slide")
  var $slide: js.UndefOr[JQuery] = js.undefined
  @JSName("$spinner")
  var $spinner: js.UndefOr[JQuery] = js.undefined
  var contentSource: js.UndefOr[java.lang.String] = js.undefined
  var forcedDuration: js.UndefOr[scala.Double] = js.undefined
  var height: scala.Double
  var isComplete: scala.Boolean
  var isLoaded: scala.Boolean
  var isLoading: scala.Boolean
  var isRevealed: scala.Boolean
  var pos: scala.Double
  var width: scala.Double
}

object FancyBoxSlide {
  @scala.inline
  def apply(
    height: scala.Double,
    isComplete: scala.Boolean,
    isLoaded: scala.Boolean,
    isLoading: scala.Boolean,
    isRevealed: scala.Boolean,
    pos: scala.Double,
    src: java.lang.String,
    width: scala.Double,
    $content: JQuery = null,
    $iframe: JQuery = null,
    $image: JQuery = null,
    $slide: JQuery = null,
    $spinner: JQuery = null,
    $thumb: JQuery = null,
    contentSource: java.lang.String = null,
    contentType: java.lang.String = null,
    forcedDuration: scala.Int | scala.Double = null,
    index: scala.Int | scala.Double = null,
    opts: FancyBoxOptions = null,
    thumb: js.Any = null,
    `type`: fancyboxLib.fancyboxLibStrings.image | fancyboxLib.fancyboxLibStrings.`inline` | fancyboxLib.fancyboxLibStrings.ajax | fancyboxLib.fancyboxLibStrings.iframe | fancyboxLib.fancyboxLibStrings.html = null
  ): FancyBoxSlide = {
    val __obj = js.Dynamic.literal(height = height, isComplete = isComplete, isLoaded = isLoaded, isLoading = isLoading, isRevealed = isRevealed, pos = pos, src = src, width = width)
    if ($content != null) __obj.updateDynamic("$content")($content)
    if ($iframe != null) __obj.updateDynamic("$iframe")($iframe)
    if ($image != null) __obj.updateDynamic("$image")($image)
    if ($slide != null) __obj.updateDynamic("$slide")($slide)
    if ($spinner != null) __obj.updateDynamic("$spinner")($spinner)
    if ($thumb != null) __obj.updateDynamic("$thumb")($thumb)
    if (contentSource != null) __obj.updateDynamic("contentSource")(contentSource)
    if (contentType != null) __obj.updateDynamic("contentType")(contentType)
    if (forcedDuration != null) __obj.updateDynamic("forcedDuration")(forcedDuration.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (opts != null) __obj.updateDynamic("opts")(opts)
    if (thumb != null) __obj.updateDynamic("thumb")(thumb)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FancyBoxSlide]
  }
}

