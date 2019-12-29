package typings.dojo.dojox.mvc

import typings.dojo.Anon_Unwatch
import typings.dojo.dojo.Stateful
import typings.dojo.dojo.store.DataStore
import typings.dojo.dojoStrings.data
import typings.dojo.dojoStrings.getPlainValueOptions
import typings.dojo.dojoStrings.getStatefulOptions
import typings.dojo.dojoStrings.store
import typings.dojo.dojoStrings.valid
import typings.dojo.dojoStrings.value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/mvc/StatefulModel.html
  *
  * Deprecated.  Use dojox/mvc/getStateful, dojox/mvc/getPlainValue, dojox/mvc/StatefulArray or one of the dojox/mvc//RefControllers instead.
  * The first-class native JavaScript data model based on dojo/Stateful
  * that wraps any data structure(s) that may be relevant for a view,
  * a view portion, a dijit or any custom view layer component.
  * A data model is effectively instantiated with a plain JavaScript
  * object which specifies the initial data structure for the model.
  *
  * var struct = {
  *     order   : "abc123",
  *     shipto  : {
  *         address : "123 Example St, New York, NY",
  *         phone   : "212-000-0000"
  *     },
  *     items : [
  *         { part : "x12345", num : 1 },
  *         { part : "n09876", num : 3 }
  *     ]
  * };
  * var model = dojox/mvc.newStatefulModel({ data : struct });
  * The simple example above shows an inline plain JavaScript object
  * illustrating the data structure to prime the model with, however
  * the underlying data may be made available by other means, such as
  * from the results of a dojo/store or dojo/data query.
  *
  * To deal with stores providing immediate values or Promises, a
  * factory method for model instantiation is provided. This method
  * will either return an immediate model or a model Promise depending
  * on the nature of the store.
  *
  * var model = mvc.newStatefulModel({ store: someStore });
  * The created data model has the following properties:
  *
  * It enables dijits or custom components in the view to "bind" to
  * data within the model. A bind creates a bi-directional update
  * mechanism between the bound view and the underlying data:
  * a) The data model is "live" data i.e. it maintains any updates
  * driven by the view on the underlying data.
  *
  * b) The data model issues updates to portions of the view if the
  * data they bind to is updated in the model. For example, if two
  * dijits are bound to the same part of a data model, updating the
  * value of one in the view will cause the data model to issue an
  * update to the other containing the new value.
  *
  * The data model internally creates a tree of dojo/Stateful
  * objects that matches the input, which is effectively a plain
  * JavaScript object i.e. "pure data". This tree allows dijits or
  * other view components to bind to any node within the data model.
  * Typically, dijits with simple values bind to leaf nodes of the
  * datamodel, whereas containers bind to internal nodes of the
  * datamodel. For example, a datamodel created using the object below
  * will generate the dojo/Stateful tree as shown:
  * var model = dojox/mvc/newStatefulModel({ data : {
  *     prop1   : "foo",
  *     prop2   : {
  *         leaf1   : "bar",
  *         leaf2   : "baz"
  *     }
  * }});
  * // The created dojo/Stateful tree is illustrated below (all nodes are dojo/Stateful objects)
  * //
  * //                  o  (root node)
  * //                 / \
  * //   (prop1 node) o   o (prop2 node)
  * //                   / \
  * //     (leaf1 node) o   o (leaf2 node)
  * //
  * // The root node is accessed using the expression "model" (the var name above). The prop1
  * // node is accessed using the expression "model.prop1", the leaf2 node is accessed using
  * // the expression "model.prop2.leaf2" and so on.
  * Each of the dojo/Stateful nodes in the model may store data as well
  * as associated "meta-data", which includes things such as whether
  * the data is required or readOnly etc. This meta-data differs from
  * that maintained by, for example, an individual dijit in that this
  * is maintained by the datamodel and may therefore be affected by
  * datamodel-level constraints that span multiple dijits or even
  * additional criteria such as server-side computations.
  * When the model is backed by a dojo/store or dojo/data query, the
  * client-side updates can be persisted once the client is ready to
  * "submit" the changes (which may include both value changes or
  * structural changes - adds/deletes). The datamodel allows control
  * over when the underlying data is persisted i.e. this can be more
  * incremental or batched per application needs.
  *
  * There need not be a one-to-one association between a datamodel and
  * a view or portion thereof. For example, multiple datamodels may
  * back the dijits in a view. Indeed, this may be useful where the
  * binding data comes from a number of data sources or queries, for
  * example. Just as well, dijits from multiple portions of the view
  * may be bound to a single datamodel.
  *
  * Finally, requiring this class also enables all dijits to become data
  * binding aware. The data binding is commonly specified declaratively
  * via the "ref" property in the "data-dojo-props" attribute value.
  *
  * To illustrate, the following is the "Hello World" of such data-bound
  * widget examples:
  *
  *
  * <script>
  *     var model;
  *     require(["dojox/mvc", "dojo/parser"], function(mvc, parser){
  *         model = mvc.newStatefulModel({ data : {
  *             hello : "Hello World"
  *         }});
  *         parser.parse();
  *     });
  * </script>
  * <input id="helloInput" data-dojo-type="dijit/form/TextBox"
  *     data-dojo-props="ref: 'model.hello'">
  * Such data binding awareness for dijits is added by extending the
  * dijit/_WidgetBase class to include data binding capabilities
  * provided by dojox/mvc/_DataBindingMixin, and this class declares a
  * dependency on dojox/mvc/_DataBindingMixin.
  *
  * The presence of a data model and the data-binding capabilities
  * outlined above support the flexible development of a number of MVC
  * patterns on the client. As an example, CRUD operations can be
  * supported with minimal application code.
  *
  * @param args The mixin properties.
  */
@JSGlobal("dojox.mvc.StatefulModel")
@js.native
class StatefulModel_ protected () extends Stateful {
  def this(args: js.Object) = this()
  /**
    * The plain JavaScript object / data structure used to initialize
    * this model. At any point in time, it holds the lasted saved model
    * state.
    * Either data or store property must be provided.
    *
    */
  var data: js.Object = js.native
  /**
    * An object that defines how plain value should be created from model object.
    *
    */
  var getPlainValueOptions: js.Object = js.native
  /**
    * An object that defines how model object should be created from plain object hierarchy.
    *
    */
  var getStatefulOptions: js.Object = js.native
  /**
    * The data store from where to retrieve initial data for this model.
    * An optional query may also be provided along with this store.
    * Either data or store property must be provided.
    *
    */
  var store: js.Object = js.native
  /**
    * Whether this model deems the associated data to be valid.
    *
    */
  var valid: Boolean = js.native
  /**
    * The associated value (if this is a leaf node). The value of
    * intermediate nodes in the model is not defined.
    *
    */
  var value: js.Object = js.native
  /**
    * Adds a dojo/Stateful tree represented by the given
    * dojox/mvc/StatefulModel at the given property name.
    * In case of arrays, the property names are indices passed
    * as Strings. An addition of such a dojo/Stateful node
    * results in right-shifting any trailing sibling nodes.
    *
    * @param name The property name to use whose value will become the givendijit/Stateful tree.
    * @param stateful The dojox/mvc/StatefulModel to insert.
    */
  def add(name: String, stateful: Stateful): Unit = js.native
  /**
    * Commits this data model:
    *
    * Saves the current state such that a subsequent reset will not
    * undo any prior changes.
    * Persists client-side changes to the data store, if a store
    * has been supplied as a parameter or at instantiation.
    *
    * @param store dojo/store/DataStoreOptional dojo/store/DataStore to use for this commit, if noneprovided but one was provided at instantiation time, that storewill be used instead.
    */
  def commit(): Unit = js.native
  def commit(store: DataStore): Unit = js.native
  @JSName("get")
  def get_data(property: data): js.Object = js.native
  @JSName("get")
  def get_getPlainValueOptions(property: getPlainValueOptions): js.Object = js.native
  @JSName("get")
  def get_getStatefulOptions(property: getStatefulOptions): js.Object = js.native
  @JSName("get")
  def get_store(property: store): js.Object = js.native
  @JSName("get")
  def get_valid(property: valid): Boolean = js.native
  @JSName("get")
  def get_value(property: value): js.Object = js.native
  /**
    * Removes the dojo/Stateful tree at the given property name.
    * In case of arrays, the property names are indices passed
    * as Strings. A removal of such a dojo/Stateful node
    * results in left-shifting any trailing sibling nodes.
    *
    * @param name The property name from where the tree will be removed.
    */
  def remove(name: String): Unit = js.native
  /**
    * Resets this data model values to its original state.
    * Structural changes to the data model (such as adds or removes)
    * are not restored.
    *
    */
  def reset(): Unit = js.native
  @JSName("set")
  def set_data(property: data, value: js.Object): Unit = js.native
  @JSName("set")
  def set_getPlainValueOptions(property: getPlainValueOptions, value: js.Object): Unit = js.native
  @JSName("set")
  def set_getStatefulOptions(property: getStatefulOptions, value: js.Object): Unit = js.native
  @JSName("set")
  def set_store(property: store, value: js.Object): Unit = js.native
  @JSName("set")
  def set_valid(property: valid, value: Boolean): Unit = js.native
  @JSName("set")
  def set_value(property: value, value: js.Object): Unit = js.native
  /**
    * Removes and then adds some elements to this array.
    * Updates the removed/added elements, as well as the length, as stateful.
    *
    * @param idx The index where removal/addition should be done.
    * @param n How many elements to be removed at idx.
    */
  def splice(idx: Double, n: Double): js.Any = js.native
  /**
    * Produces a plain JavaScript object representation of the data
    * currently within this data model.
    *
    */
  def toPlainObject(): js.Any = js.native
  @JSName("watch")
  def watch_data(
    property: data,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_getPlainValueOptions(
    property: getPlainValueOptions,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_getStatefulOptions(
    property: getStatefulOptions,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_store(
    property: store,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_valid(
    property: valid,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_value(
    property: value,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): Anon_Unwatch = js.native
}

