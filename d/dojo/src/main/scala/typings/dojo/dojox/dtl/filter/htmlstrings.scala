package typings.dojo.dojox.dtl.filter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/dtl/filter/htmlstrings.html
  *
  *
  */
trait htmlstrings extends js.Object {
  /**
    * Converts newlines into <p> and <br />s
    *
    * @param value
    */
  def linebreaks(value: js.Any): js.Any
  /**
    * Converts newlines into <br />s
    *
    * @param value
    */
  def linebreaksbr(value: js.Any): js.Any
  /**
    * Removes a space separated list of [X]HTML tags from the output"
    *
    * @param value
    * @param arg
    */
  def removetags(value: js.Any, arg: js.Any): js.Any
  /**
    * Strips all [X]HTML tags
    *
    * @param value
    */
  def striptags(value: js.Any): js.Any
}

object htmlstrings {
  @scala.inline
  def apply(
    linebreaks: js.Any => js.Any,
    linebreaksbr: js.Any => js.Any,
    removetags: (js.Any, js.Any) => js.Any,
    striptags: js.Any => js.Any
  ): htmlstrings = {
    val __obj = js.Dynamic.literal(linebreaks = js.Any.fromFunction1(linebreaks), linebreaksbr = js.Any.fromFunction1(linebreaksbr), removetags = js.Any.fromFunction2(removetags), striptags = js.Any.fromFunction1(striptags))
    __obj.asInstanceOf[htmlstrings]
  }
}

