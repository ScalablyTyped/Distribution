package typings.dojo.dojox.app.utils

import typings.dojo.dojox.app.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/app/utils/constraints.html
  *
  *
  */
trait constraints extends js.Object {
  /**
    * get current all selected children for this view and it's selected subviews
    *
    * @param view the View to get the child from
    * @param selChildren the Array of the subChildren found
    */
  def getAllSelectedChildren(view: View, selChildren: js.Array[_]): js.Any
  /**
    * get current selected child according to the constraint
    *
    * @param view the View to get the child from
    * @param constraint tbe constraint object
    */
  def getSelectedChild(view: View, constraint: js.Object): js.Any
  /**
    *
    * @param constraint
    */
  def register(constraint: js.Any): Unit
  /**
    * set current selected child according to the constraint
    *
    * @param view the View to set the selected child to
    * @param constraint tbe constraint object
    * @param child the child to select
    */
  def setSelectedChild(view: View, constraint: js.Object, child: View): Unit
}

object constraints {
  @scala.inline
  def apply(
    getAllSelectedChildren: (View, js.Array[_]) => js.Any,
    getSelectedChild: (View, js.Object) => js.Any,
    register: js.Any => Unit,
    setSelectedChild: (View, js.Object, View) => Unit
  ): constraints = {
    val __obj = js.Dynamic.literal(getAllSelectedChildren = js.Any.fromFunction2(getAllSelectedChildren), getSelectedChild = js.Any.fromFunction2(getSelectedChild), register = js.Any.fromFunction1(register), setSelectedChild = js.Any.fromFunction3(setSelectedChild))
    __obj.asInstanceOf[constraints]
  }
}

