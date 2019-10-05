package typings.dojo.dojox.drawing.util

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/drawing/util/typeset.html
  *
  *
  */
trait typeset extends js.Object {
  /**
    *
    * @param inText
    */
  def convertHTML(inText: js.Any): js.Any
  /**
    *
    * @param inText
    */
  def convertLaTeX(inText: js.Any): js.Any
}

object typeset {
  @scala.inline
  def apply(convertHTML: js.Any => js.Any, convertLaTeX: js.Any => js.Any): typeset = {
    val __obj = js.Dynamic.literal(convertHTML = js.Any.fromFunction1(convertHTML), convertLaTeX = js.Any.fromFunction1(convertLaTeX))
  
    __obj.asInstanceOf[typeset]
  }
}

