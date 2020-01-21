package typings.dojo.dojox.mvc

import typings.dojo.AnonUnwatch
import typings.dojo.dojoStrings.getPlainValueOptions
import typings.dojo.dojoStrings.holdModelUntilCommit
import typings.dojo.dojoStrings.originalModel
import typings.dojo.dojoStrings.sourceModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/mvc/EditStoreRefController.html
  *
  * A child class of dojox/mvc/StoreRefController, managing edits.
  * In addition to what dojox/mvc/StoreRefController does, the commit() method sends the data model as well as the removed entries in array to the data store.
  * NOTE - If this class is used with a widget by data-dojo-mixins, make sure putting the widget in data-dojo-type and putting this class to data-dojo-mixins.
  *
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.dojo.dojox.mvc.atBindingMixin because Already inherited
- typings.dojo.dojo.Stateful because Already inherited
- typings.dojo.dojox.mvc.Controller because Already inherited
- typings.dojo.dojox.mvc.ModelRefController because Already inherited
- typings.dojo.dojox.mvc.EditModelRefController because Inheritance from two classes. Inlined set_datamvcbindings, get_datamvcbindings, watch_datamvcbindings, set_dataBindAttr, get_dataBindAttr, watch_dataBindAttr, getPlainValueOptions, set_getPlainValueOptions, get_getPlainValueOptions, watch_getPlainValueOptions, set_getStatefulOptions, get_getStatefulOptions, watch_getStatefulOptions, holdModelUntilCommit, set_holdModelUntilCommit, get_holdModelUntilCommit, watch_holdModelUntilCommit, set_model, get_model, watch_model, originalModel, set_originalModel, get_originalModel, watch_originalModel, set_ownProps, get_ownProps, watch_ownProps, sourceModel, set_sourceModel, get_sourceModel, watch_sourceModel, cloneModel, commit, destroy, get, hasControllerProperty, postscript, postscript, reset, set, startup, watch */ @JSGlobal("dojox.mvc.EditStoreRefController")
@js.native
class EditStoreRefController () extends StoreRefController {
  /**
    * The options to get plain value from stateful object.
    *
    */
  var getPlainValueOptions: js.Object = js.native
  /**
    * True not to send the change in model back to sourceModel until commit() is called.
    *
    */
  var holdModelUntilCommit: Boolean = js.native
  /**
    * The data model, that serves as the original data.
    *
    */
  var originalModel: js.Object = js.native
  /**
    *
    */
  var sourceModel: js.Object = js.native
  /**
    * Create a clone object of the data source.
    * Child classes of this controller can override it to achieve its specific needs.
    *
    * @param value The data serving as the data source.
    */
  def cloneModel(value: js.Any): js.Any = js.native
  /**
    * Send the change back to the data source.
    *
    */
  def commit(): Unit = js.native
  @JSName("get")
  def get_getPlainValueOptions(property: getPlainValueOptions): js.Object = js.native
  @JSName("get")
  def get_holdModelUntilCommit(property: holdModelUntilCommit): Boolean = js.native
  @JSName("get")
  def get_originalModel(property: originalModel): js.Object = js.native
  @JSName("get")
  def get_sourceModel(property: sourceModel): js.Object = js.native
  /**
    * Change the model back to its original state.
    *
    */
  def reset(): Unit = js.native
  @JSName("set")
  def set_getPlainValueOptions(property: getPlainValueOptions, value: js.Object): Unit = js.native
  @JSName("set")
  def set_holdModelUntilCommit(property: holdModelUntilCommit, value: Boolean): Unit = js.native
  @JSName("set")
  def set_originalModel(property: originalModel, value: js.Object): Unit = js.native
  @JSName("set")
  def set_sourceModel(property: sourceModel, value: js.Object): Unit = js.native
  @JSName("watch")
  def watch_getPlainValueOptions(
    property: getPlainValueOptions,
    callback: js.Function3[js.UndefOr[String], js.UndefOr[js.Object], js.UndefOr[js.Object], Unit]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_holdModelUntilCommit(
    property: holdModelUntilCommit,
    callback: js.Function3[js.UndefOr[String], js.UndefOr[Boolean], js.UndefOr[Boolean], Unit]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_originalModel(
    property: originalModel,
    callback: js.Function3[js.UndefOr[String], js.UndefOr[js.Object], js.UndefOr[js.Object], Unit]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_sourceModel(
    property: sourceModel,
    callback: js.Function3[js.UndefOr[String], js.UndefOr[js.Object], js.UndefOr[js.Object], Unit]
  ): AnonUnwatch = js.native
}

