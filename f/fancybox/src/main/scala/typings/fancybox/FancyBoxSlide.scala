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
    forcedDuration: js.UndefOr[Double] = js.undefined,
    index: js.UndefOr[Double] = js.undefined,
    opts: FancyBoxOptions = null,
    thumb: js.Any = null,
    `type`: image | `inline` | ajax | iframe | html = null
  ): FancyBoxSlide = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], isComplete = isComplete.asInstanceOf[js.Any], isLoaded = isLoaded.asInstanceOf[js.Any], isLoading = isLoading.asInstanceOf[js.Any], isRevealed = isRevealed.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if ($content != null) __obj.updateDynamic("$content")($content.asInstanceOf[js.Any])
    if ($iframe != null) __obj.updateDynamic("$iframe")($iframe.asInstanceOf[js.Any])
    if ($image != null) __obj.updateDynamic("$image")($image.asInstanceOf[js.Any])
    if ($slide != null) __obj.updateDynamic("$slide")($slide.asInstanceOf[js.Any])
    if ($spinner != null) __obj.updateDynamic("$spinner")($spinner.asInstanceOf[js.Any])
    if ($thumb != null) __obj.updateDynamic("$thumb")($thumb.asInstanceOf[js.Any])
    if (contentSource != null) __obj.updateDynamic("contentSource")(contentSource.asInstanceOf[js.Any])
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (!js.isUndefined(forcedDuration)) __obj.updateDynamic("forcedDuration")(forcedDuration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index.get.asInstanceOf[js.Any])
    if (opts != null) __obj.updateDynamic("opts")(opts.asInstanceOf[js.Any])
    if (thumb != null) __obj.updateDynamic("thumb")(thumb.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FancyBoxSlide]
  }
}

