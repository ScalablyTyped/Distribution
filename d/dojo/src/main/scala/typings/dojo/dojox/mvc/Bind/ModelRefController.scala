package typings.dojo.dojox.mvc.Bind

import typings.dojo.AnonUnwatch
import typings.dojo.dojoStrings.model
import typings.dojo.dojoStrings.ownProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/mvc/Bind.ModelRefController.html
  *
  * A controller that keeps a reference to dojo/Stateful-based data model.
  * Does the following on behalf of such model:
  *
  * Provides data from model via dojo/Stateful get() interface
  * Stores data to model via dojo/Stateful set() interface
  * Watches for change in model via dojo/Stateful watch() interface (The callback is called when there is a change in data model, as well as when the data model itself is replaced with different one)
  * Can also be used to do some application-specific stuffs upon change in properties in model, by defining setter functions.
  * Doing so will help keep models and widgets free from application-specific logic, and will help keep application logic free from specifics of models and widgets.
  * Such kind of setter functions can be defined in the same manner as widgets (_setXXXAttr()).
  *
  * NOTE - If this class is used with a widget by data-dojo-mixins, make sure putting the widget in data-dojo-type and putting this class to data-dojo-mixins.
  *
  */
@JSGlobal("dojox.mvc.Bind.ModelRefController")
@js.native
class ModelRefController ()
  extends typings.dojo.dojox.mvc.Controller {
  /**
    * The data model.
    *
    */
  var model: js.Object = js.native
  /**
    * List of property names owned by this controller, instead of the data model.
    *
    */
  var ownProps: js.Object = js.native
  @JSName("get")
  def get_model(property: model): js.Object = js.native
  @JSName("get")
  def get_ownProps(property: ownProps): js.Object = js.native
  /**
    * Returns true if this controller itself owns the given property.
    *
    * @param name The property name.
    */
  def hasControllerProperty(name: String): Boolean = js.native
  @JSName("set")
  def set_model(property: model, value: js.Object): Unit = js.native
  @JSName("set")
  def set_ownProps(property: ownProps, value: js.Object): Unit = js.native
  @JSName("watch")
  def watch_model(
    property: model,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_ownProps(
    property: ownProps,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): AnonUnwatch = js.native
}

