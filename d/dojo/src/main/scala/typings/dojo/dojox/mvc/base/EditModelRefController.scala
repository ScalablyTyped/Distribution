package typings.dojo.dojox.mvc.base

import typings.dojo.AnonUnwatch
import typings.dojo.dojoStrings.getPlainValueOptions
import typings.dojo.dojoStrings.getStatefulOptions
import typings.dojo.dojoStrings.holdModelUntilCommit
import typings.dojo.dojoStrings.originalModel
import typings.dojo.dojoStrings.sourceModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/mvc/_base.EditModelRefController.html
  *
  * A child class of dojox/mvc/ModelRefController.
  * Keeps a copy (originalModel) of given data model (sourceModel) so that it can manage the data model of before/after the edit.
  * Has two modes:
  *
  * Directly reflect the edits to sourceModel (holdModelUntilCommit=false)
  * Don't reflect the edits to sourceModel, until commit() is called (holdModelUntilCommit=true)
  * For the 1st case, dojo/Stateful get()/set()/watch() interfaces will work with sourceModel.
  * For the 2nd case, dojo/Stateful get()/set()/watch() interfaces will work with a copy of sourceModel, and sourceModel will be replaced with such copy when commit() is called.
  *
  * NOTE - If this class is used with a widget by data-dojo-mixins, make sure putting the widget in data-dojo-type and putting this class to data-dojo-mixins.
  *
  */
@JSGlobal("dojox.mvc._base.EditModelRefController")
@js.native
class EditModelRefController ()
  extends typings.dojo.dojox.mvc.ModelRefController {
  /**
    * The options to get plain value from stateful object.
    *
    */
  var getPlainValueOptions: js.Object = js.native
  /**
    * The options to get stateful object from plain value.
    *
    */
  var getStatefulOptions: js.Object = js.native
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
  def get_getStatefulOptions(property: getStatefulOptions): js.Object = js.native
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
  def set_getStatefulOptions(property: getStatefulOptions, value: js.Object): Unit = js.native
  @JSName("set")
  def set_holdModelUntilCommit(property: holdModelUntilCommit, value: Boolean): Unit = js.native
  @JSName("set")
  def set_originalModel(property: originalModel, value: js.Object): Unit = js.native
  @JSName("set")
  def set_sourceModel(property: sourceModel, value: js.Object): Unit = js.native
  @JSName("watch")
  def watch_getPlainValueOptions(
    property: getPlainValueOptions,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_getStatefulOptions(
    property: getStatefulOptions,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_holdModelUntilCommit(
    property: holdModelUntilCommit,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_originalModel(
    property: originalModel,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_sourceModel(
    property: sourceModel,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): AnonUnwatch = js.native
}

