package typings.dojo.dojox.charting.plot2d

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/charting/plot2d/commonStacked.html
  *
  *
  */
trait commonStacked extends js.Object {
  /**
    *
    * @param series
    */
  def collectStats(series: js.Any): js.Any
  /**
    *
    * @param series
    * @param i
    * @param index
    */
  def getIndexValue(series: js.Any, i: js.Any, index: js.Any): js.Array[_]
  /**
    *
    * @param series
    * @param i
    * @param x
    */
  def getValue(series: js.Any, i: js.Any, x: js.Any): js.Array[_]
}

object commonStacked {
  @scala.inline
  def apply(
    collectStats: js.Any => js.Any,
    getIndexValue: (js.Any, js.Any, js.Any) => js.Array[_],
    getValue: (js.Any, js.Any, js.Any) => js.Array[_]
  ): commonStacked = {
    val __obj = js.Dynamic.literal(collectStats = js.Any.fromFunction1(collectStats), getIndexValue = js.Any.fromFunction3(getIndexValue), getValue = js.Any.fromFunction3(getValue))
  
    __obj.asInstanceOf[commonStacked]
  }
}

