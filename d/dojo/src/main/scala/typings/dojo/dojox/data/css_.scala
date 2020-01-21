package typings.dojo.dojox.data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/data/css.html
  *
  *
  */
trait css_ extends js.Object {
  /**
    *
    */
  var rules: js.Object
  /**
    *
    * @param initialStylesheets
    */
  def determineContext(initialStylesheets: js.Any): js.Array[_]
  /**
    *
    * @param sheet
    */
  def findStyleSheet(sheet: js.Any): js.Array[_]
  /**
    *
    * @param sheets
    */
  def findStyleSheets(sheets: js.Any): js.Array[_]
}

object css_ {
  @scala.inline
  def apply(
    determineContext: js.Any => js.Array[_],
    findStyleSheet: js.Any => js.Array[_],
    findStyleSheets: js.Any => js.Array[_],
    rules: js.Object
  ): css_ = {
    val __obj = js.Dynamic.literal(determineContext = js.Any.fromFunction1(determineContext), findStyleSheet = js.Any.fromFunction1(findStyleSheet), findStyleSheets = js.Any.fromFunction1(findStyleSheets), rules = rules.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[css_]
  }
}

