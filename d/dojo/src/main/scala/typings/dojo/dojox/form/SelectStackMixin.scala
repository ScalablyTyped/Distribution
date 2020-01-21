package typings.dojo.dojox.form

import typings.dojo.dijit.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/form/_SelectStackMixin.html
  *
  * Mix this class in to a dijit.form._FormSelectWidget in order to
  * provide support for "selectable" multiforms.  The widget is pointed
  * to a dijit.layout.StackContainer and will handle displaying and
  * submitting the values of only the appropriate pane.
  *
  * The options for this widget will be automatically set - based on
  * the panes that are in the stack container.  The "title" attribute of
  * the pane will be used for the display of the option.  The "id" attribute
  * of the pane will be used as the value of the option.  In order to
  * avoid running into unique ID constraint issues, a stackPrefix mechanism
  * is provided.
  *
  */
@JSGlobal("dojox.form._SelectStackMixin")
@js.native
class SelectStackMixin () extends js.Object {
  /**
    * The id of the stack that this widget is supposed to control
    *
    */
  var stackId: String = js.native
  /**
    * A prefix to remove from our stack pane ids when setting our options.
    * This exists so that we won't run into unique ID constraints.  For
    * example, if stackPrefix is set to "foo_", and there are three panes
    * in our stack with ids of "foo_a", "foo_b", and "foo_c", then the values
    * of the options created for the stack controller widget will be "a",
    * "b", and "c".  This allows you to have multiple select stack widgets
    * with the same values - without having to have the panes require the
    * same ids.
    *
    */
  var stackPrefix: String = js.native
  /**
    *
    * @param name
    * @param value               Optional
    */
  def attr(name: String, value: js.Object): js.Any = js.native
  /**
    *
    * @param name
    * @param value               Optional
    */
  def attr(name: js.Object, value: js.Object): js.Any = js.native
  /**
    *
    */
  def destroy(): Unit = js.native
  /**
    * Called when the stack container adds a new pane
    *
    * @param pane
    * @param insertIndex               Optional
    */
  def onAddChild(pane: Widget, insertIndex: Double): Unit = js.native
  /**
    * Called when the stack container removes a pane
    *
    * @param pane
    */
  def onRemoveChild(pane: Widget): Unit = js.native
  /**
    * Called when the stack container selects a new pane
    *
    * @param pane
    */
  def onSelectChild(pane: Widget): Unit = js.native
  /**
    * Called when the stack container is started up
    *
    * @param info
    */
  def onStartup(info: js.Object): Unit = js.native
  /**
    *
    */
  def postCreate(): Unit = js.native
  /**
    *
    */
  def postMixInProperties(): Unit = js.native
}

