package typings.fancybox

import typings.fancybox.fancyboxStrings.`inline`
import typings.fancybox.fancyboxStrings.ajax
import typings.fancybox.fancyboxStrings.html
import typings.fancybox.fancyboxStrings.iframe
import typings.fancybox.fancyboxStrings.image
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
  var contentSource: js.UndefOr[String] = js.undefined
  var forcedDuration: js.UndefOr[Double] = js.undefined
  var height: Double
  var isComplete: Boolean
  var isLoaded: Boolean
  var isLoading: Boolean
  var isRevealed: Boolean
  var pos: Double
  var width: Double
}

object FancyBoxSlide {
  @scala.inline
  def apply(
    height: Double,
    isComplete: Boolean,
    isLoaded: Boolean,
    isLoading: Boolean,
    isRevealed: Boolean,
    pos: Double,
    src: String,
    width: Double,
    $content: JQuery = null,
    $iframe: JQuery = null,
    $image: JQuery = null,
    $slide: JQuery = null,
    $spinner: JQuery = null,
    $thumb: JQuery = null,
    contentSource: String = null,
    contentType: String = null,
    forcedDuration: Int | Double = null,
    index: Int | Double = null,
    opts: FancyBoxOptions = null,
    thumb: js.Any = null,
    `type`: image | `inline` | ajax | iframe | html = null
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

