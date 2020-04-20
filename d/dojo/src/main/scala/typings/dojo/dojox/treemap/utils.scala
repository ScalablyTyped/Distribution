package typings.dojo.dojox.treemap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/treemap/_utils.html
  *
  *
  */
trait utils extends js.Object {
  /**
    *
    * @param array
    * @param callback
    */
  def find(array: js.Array[_], callback: js.Function): js.Any
  /**
    *
    * @param items
    * @param groupingFunctions
    * @param measureFunction
    */
  def group(items: js.Array[_], groupingFunctions: js.Array[_], measureFunction: js.Function): js.Object
  /**
    *
    * @param items
    * @param areaFunc
    */
  def initElements(items: js.Any, areaFunc: js.Any): js.Object
  /**
    *
    * @param items
    * @param width
    * @param height
    * @param areaFunc
    * @param rtl
    */
  def solve(items: js.Any, width: js.Any, height: js.Any, areaFunc: js.Any, rtl: js.Any): js.Object
}

object utils {
  @scala.inline
  def apply(
    find: (js.Array[_], js.Function) => js.Any,
    group: (js.Array[_], js.Array[_], js.Function) => js.Object,
    initElements: (js.Any, js.Any) => js.Object,
    solve: (js.Any, js.Any, js.Any, js.Any, js.Any) => js.Object
  ): utils = {
    val __obj = js.Dynamic.literal(find = js.Any.fromFunction2(find), group = js.Any.fromFunction3(group), initElements = js.Any.fromFunction2(initElements), solve = js.Any.fromFunction5(solve))
    __obj.asInstanceOf[utils]
  }
}

