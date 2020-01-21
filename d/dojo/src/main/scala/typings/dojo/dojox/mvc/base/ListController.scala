package typings.dojo.dojox.mvc.base

import typings.dojo.AnonUnwatch
import typings.dojo.dojoStrings.cursor
import typings.dojo.dojoStrings.cursorId
import typings.dojo.dojoStrings.cursorIndex
import typings.dojo.dojoStrings.idProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/mvc/_base.ListController.html
  *
  * A controller working with array model, managing its cursor.
  * NOTE - If this class is used with a widget by data-dojo-mixins, make sure putting the widget in data-dojo-type and putting this class to data-dojo-mixins.
  *
  */
@JSGlobal("dojox.mvc._base.ListController")
@js.native
class ListController ()
  extends typings.dojo.dojox.mvc.ModelRefController {
  /**
    * The selected element in the model array.
    *
    */
  var cursor: js.Object = js.native
  /**
    * The ID of the selected element in the model array.
    *
    */
  var cursorId: String = js.native
  /**
    * The index of the selected element in the model.
    *
    */
  var cursorIndex: Double = js.native
  /**
    * The property name in element in the model array, that works as its identifier.
    *
    */
  var idProperty: String = js.native
  @JSName("get")
  def get_cursor(property: cursor): js.Object = js.native
  @JSName("get")
  def get_cursorId(property: cursorId): String = js.native
  @JSName("get")
  def get_cursorIndex(property: cursorIndex): Double = js.native
  @JSName("get")
  def get_idProperty(property: idProperty): String = js.native
  @JSName("set")
  def set_cursor(property: cursor, value: js.Object): Unit = js.native
  @JSName("set")
  def set_cursorId(property: cursorId, value: String): Unit = js.native
  @JSName("set")
  def set_cursorIndex(property: cursorIndex, value: Double): Unit = js.native
  @JSName("set")
  def set_idProperty(property: idProperty, value: String): Unit = js.native
  @JSName("watch")
  def watch_cursor(
    property: cursor,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_cursorId(
    property: cursorId,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_cursorIndex(
    property: cursorIndex,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_idProperty(
    property: idProperty,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
}

