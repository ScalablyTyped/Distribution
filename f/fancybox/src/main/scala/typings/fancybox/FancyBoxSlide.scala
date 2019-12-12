package typings.fancybox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FancyBoxSlide extends FancyBoxGroupItemWithFilledProps {
  @JSName("$content")
  var $content: js.UndefOr[JQuery] = js.native
  @JSName("$iframe")
  var $iframe: js.UndefOr[JQuery] = js.native
  @JSName("$image")
  var $image: js.UndefOr[JQuery] = js.native
  @JSName("$slide")
  var $slide: js.UndefOr[JQuery] = js.native
  @JSName("$spinner")
  var $spinner: js.UndefOr[JQuery] = js.native
  var contentSource: js.UndefOr[String] = js.native
  var forcedDuration: js.UndefOr[Double] = js.native
  var height: Double = js.native
  var isComplete: Boolean = js.native
  var isLoaded: Boolean = js.native
  var isLoading: Boolean = js.native
  var isRevealed: Boolean = js.native
  var pos: Double = js.native
  var width: Double = js.native
}

