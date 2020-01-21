package typings.dojo.dojox.mvc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/mvc/_DataBindingMixin.html
  *
  * Deprecated.  Use dojox/mvc/at for data binding.
  * Provides the ability for dijits or custom view components to become
  * data binding aware.
  * Data binding awareness enables dijits or other view layer
  * components to bind to locations within a client-side data model,
  * which is commonly an instance of the dojox/mvc/StatefulModel class. A
  * bind is a bi-directional update mechanism which is capable of
  * synchronizing value changes between the bound dijit or other view
  * component and the specified location within the data model, as well
  * as changes to other properties such as "valid", "required",
  * "readOnly" etc.
  *
  * The data binding is commonly specified declaratively via the "ref"
  * property in the "data-dojo-props" attribute value.
  *
  * Consider the following simple example:
  *
  * <script>
  *     var model;
  *     require(["dijit/StatefulModel", "dojo/parser"], function(StatefulModel, parser){
  *         model = new StatefulModel({ data : {
  *             hello : "Hello World"
  *         }});
  *         parser.parse();
  *     });
  * </script>
  * <input id="hello1" data-dojo-type="dijit/form/TextBox"
  *     data-dojo-props="ref: model.hello"></input>
  * <input id="hello2" data-dojo-type="dijit/form/TextBox"
  *     data-dojo-props="ref: model.hello"></input>
  * In the above example, both dijit/form/TextBox instances (with IDs
  * "hello1" and "hello2" respectively) are bound to the same reference
  * location in the data model i.e. "hello" via the "ref" expression
  * "model.hello". Both will have an initial value of "Hello World".
  * Thereafter, a change in the value of either of the two textboxes
  * will cause an update of the value in the data model at location
  * "hello" which will in turn cause a matching update of the value in
  * the other textbox.
  *
  */
@JSGlobal("dojox.mvc._DataBindingMixin")
@js.native
class DataBindingMixin () extends js.Object {
  /**
    * The read only value of the resolved data binding for this widget.
    * This may be a result of resolving various relative refs along
    * the parent axis.
    *
    */
  var binding: js.Object = js.native
  /**
    * The value of the data binding expression passed declaratively by
    * the developer. This usually references a location within an
    * existing datamodel and may be a relative reference based on the
    * parent / container data binding (dot-separated string).
    *
    */
  var ref: String = js.native
  /**
    * Returns the validity of the data binding.
    * This function is meant to provide an API bridge to the dijit API.
    * Validity of data-bound dijits is a function of multiple concerns:
    *
    * The validity of the value as ascertained by the data binding
    * and constraints specified in the data model (usually semantic).
    * The validity of the value as ascertained by the widget itself
    * based on widget constraints (usually syntactic).
    * In order for dijits to function correctly in data-bound
    * environments, it is imperative that their isValid() functions
    * assess the model validity of the data binding via the
    * this.inherited(arguments) hierarchy and declare any values
    * failing the test as invalid.
    *
    */
  def isValid(): js.Any = js.native
}

