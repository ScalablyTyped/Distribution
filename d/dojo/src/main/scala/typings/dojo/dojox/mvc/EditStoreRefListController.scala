package typings.dojo.dojox.mvc

import typings.dojo.Anon_Unwatch
import typings.dojo.dojoStrings.cursor
import typings.dojo.dojoStrings.cursorId
import typings.dojo.dojoStrings.cursorIndex
import typings.dojo.dojoStrings.idProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/mvc/EditStoreRefListController.html
  *
  * A child class of dojox/mvc/EditStoreRefController, mixed with ListController.
  * It supports Lists in addition to what dojox/mvc/EditStoreRefController does.
  * NOTE - If this class is used with a widget by data-dojo-mixins, make sure putting the widget in data-dojo-type and putting this class to data-dojo-mixins.
  *
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.dojo.dojox.mvc._atBindingMixin because Already inherited
- typings.dojo.dojo.Stateful because Already inherited
- typings.dojo.dojox.mvc._Controller because Already inherited
- typings.dojo.dojox.mvc.ModelRefController because Already inherited
- typings.dojo.dojox.mvc.ListController because Inheritance from two classes. Inlined cursor, set_cursor, get_cursor, watch_cursor, cursorId, set_cursorId, get_cursorId, watch_cursorId, cursorIndex, set_cursorIndex, get_cursorIndex, watch_cursorIndex, set_datamvcbindings, get_datamvcbindings, watch_datamvcbindings, set_dataBindAttr, get_dataBindAttr, watch_dataBindAttr, idProperty, set_idProperty, get_idProperty, watch_idProperty, set_model, get_model, watch_model, set_ownProps, get_ownProps, watch_ownProps, destroy, get, hasControllerProperty, postscript, postscript, set, startup, watch */ @JSGlobal("dojox.mvc.EditStoreRefListController")
@js.native
class EditStoreRefListController () extends EditStoreRefController {
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
  /**
    * Send the change back to the data source for the current index.
    *
    */
  def commitCurrent(): Unit = js.native
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
    callback: js.Function3[js.UndefOr[String], js.UndefOr[js.Object], js.UndefOr[js.Object], Unit]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_cursorId(
    property: cursorId,
    callback: js.Function3[js.UndefOr[String], js.UndefOr[String], js.UndefOr[String], Unit]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_cursorIndex(
    property: cursorIndex,
    callback: js.Function3[js.UndefOr[String], js.UndefOr[Double], js.UndefOr[Double], Unit]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_idProperty(
    property: idProperty,
    callback: js.Function3[js.UndefOr[String], js.UndefOr[String], js.UndefOr[String], Unit]
  ): Anon_Unwatch = js.native
}

