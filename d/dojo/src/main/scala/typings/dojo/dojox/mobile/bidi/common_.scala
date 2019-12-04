package typings.dojo.dojox.mobile.bidi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/mobile/bidi/common.html
  *
  *
  */
@JSName("common")
trait common_ extends js.Object {
  /**
    *
    */
  var MARK: js.Object
  /**
    * Wraps by UCC (Unicode control characters) displayed text according to textDir.
    * There's a dir problem with some HTML elements. For some Android browsers Hebrew text is displayed right to left also
    * when dir is set to LTR.
    * Therefore the only solution is to use UCC to display the text in correct orientation.
    *
    * @param text The text to be wrapped.
    * @param textDir Text direction.
    */
  def enforceTextDirWithUcc(text: js.Any, textDir: js.Any): String
  /**
    * Removes UCC from input string.
    *
    * @param text The text to be stripped from UCC.
    */
  def removeUCCFromText(text: js.Any): js.Any
  /**
    * Sets textDir property to children.
    *
    * @param widget parent widget
    */
  def setTextDirForButtons(widget: js.Any): Unit
}

object common_ {
  @scala.inline
  def apply(
    MARK: js.Object,
    enforceTextDirWithUcc: (js.Any, js.Any) => String,
    removeUCCFromText: js.Any => js.Any,
    setTextDirForButtons: js.Any => Unit
  ): common_ = {
    val __obj = js.Dynamic.literal(MARK = MARK.asInstanceOf[js.Any], enforceTextDirWithUcc = js.Any.fromFunction2(enforceTextDirWithUcc), removeUCCFromText = js.Any.fromFunction1(removeUCCFromText), setTextDirForButtons = js.Any.fromFunction1(setTextDirForButtons))
  
    __obj.asInstanceOf[common_]
  }
}

