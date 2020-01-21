package typings.dojo.dojox.mvc

import typings.dojo.dojo.Stateful
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/mvc/Bind.html
  *
  *
  */
@js.native
trait Bind_ extends js.Object {
  /**
    *
    */
  def EditModelRefController(): Unit = js.native
  /**
    *
    */
  def EditStoreRefController(): Unit = js.native
  /**
    *
    */
  def EditStoreRefListController(): Unit = js.native
  /**
    *
    */
  def Element(): Unit = js.native
  /**
    *
    */
  def Generate(): Unit = js.native
  /**
    *
    */
  def Group(): Unit = js.native
  /**
    *
    */
  def ListController(): Unit = js.native
  /**
    *
    */
  def ModelRefController(): Unit = js.native
  /**
    *
    */
  def Output(): Unit = js.native
  /**
    *
    */
  def Repeat(): Unit = js.native
  /**
    * An inheritance of native JavaScript array, that adds dojo/Stateful capability.
    * Supported methods are:
    *
    * pop() - watchElements() notification is done for the removed elements. watch() notification is done for the length.
    * push() - watchElements() notification is done for the added elements. watch() notification is done for the length.
    * reverse() - watchElements() notification is done, indicating that the change affects all elements.
    * shift() - watchElements() notification is done for the removed elements. watch() notification is done for the length.
    * sort() - watchElements() notification is done, indicating that the change affects all elements.
    * splice() - watchElements() notification is done for the removed/added elements. watch() notification is done for the length. Returns an instance of StatefulArray instead of the native array.
    * unshift() - watchElements() notification is done for the added elements. watch() notification is done for the length.
    * concat() - Returns an instance of StatefulArray instead of the native Array.
    * join() - The length as well as the elements are obtained via stateful getters, instead of direct access.
    * slice() - The length as well as the elements are obtained via stateful getters, instead of direct access.
    * Setting an element to this array via set() - watch() notification is done for the new element as well as the new length.
    * Setting a length to this array via set() - watchElements() notification is done for the removed/added elements. watch() notification is done for the new length.
    *
    * @param a
    */
  def StatefulArray(a: js.Array[_]): js.Any = js.native
  /**
    *
    */
  def StatefulModel(): Unit = js.native
  /**
    *
    */
  def StatefulSeries(): Unit = js.native
  /**
    *
    */
  def StoreRefController(): Unit = js.native
  /**
    *
    */
  def Templated(): Unit = js.native
  /**
    *
    */
  def WidgetList(): Unit = js.native
  /**
    * Returns a pointer to data binding target (a dojo/Stateful property), called at handle, which is used for start synchronization with data binding source (another dojo/Stateful property).
    * Typically used in data-dojo-props so that a widget can synchronize its attribute with another dojo/Stateful, like shown in the example.
    *
    * @param target dojo/Stateful to be synchronized.
    * @param targetProp The property name in target to be synchronized.
    */
  def at(target: String, targetProp: String): js.Any = js.native
  /**
    * Returns a pointer to data binding target (a dojo/Stateful property), called at handle, which is used for start synchronization with data binding source (another dojo/Stateful property).
    * Typically used in data-dojo-props so that a widget can synchronize its attribute with another dojo/Stateful, like shown in the example.
    *
    * @param target dojo/Stateful to be synchronized.
    * @param targetProp The property name in target to be synchronized.
    */
  def at(target: Stateful, targetProp: String): js.Any = js.native
  /**
    * Bind the specified property of the target to the specified
    * property of the source with the supplied transformation.
    *
    * @param source The source dojo/Stateful object for the bind.
    * @param sourceProp The name of the source's property whose change triggers the bind.
    * @param target The target dojo/Stateful object for the bind whoseproperty will be updated with the result of the function.
    * @param targetProp The name of the target's property to be updated with theresult of the function.
    * @param func               OptionalThe optional calculation to be performed to obtain the targetproperty value.
    * @param bindOnlyIfUnequal               OptionalWhether the bind notification should happen only if the old andnew values are unequal (optional, defaults to false).
    */
  def bind(
    source: Stateful,
    sourceProp: String,
    target: Stateful,
    targetProp: String,
    func: js.Function,
    bindOnlyIfUnequal: Boolean
  ): js.Any = js.native
  /**
    * Bind the values at the sources specified in the first argument
    * array such that a composing function in the second argument is
    * called when any of the values changes.
    *
    * @param sourceBindArray The array of dojo/Stateful objects to watch values changes on.
    * @param func The composing function that is called when any of the sourcevalues changes.
    */
  def bindInputs(sourceBindArray: js.Array[Stateful], func: js.Function): js.Array[_] = js.native
  /**
    * Compares two dojo/Stateful objects, by diving into the leaves.
    * Recursively iterates and compares stateful values.
    *
    * @param dst The stateful value to compare with.
    * @param src The stateful value to compare with.
    * @param options The object that defines how two stateful values are compared.
    */
  def equals(dst: js.Any, src: js.Any, options: js.Object): Boolean = js.native
  /**
    * Create a raw value from a dojo/Stateful object.
    * Recursively iterates the stateful value given, and convert them to raw ones.
    *
    * @param value The stateful value.
    * @param options The object that defines how plain value should be created from stateful value.
    */
  def getPlainValue(value: js.Any, options: js.Object): js.Any = js.native
  /**
    * Create a dojo/Stateful object from a raw value.
    * Recursively iterates the raw value given, and convert them to stateful ones.
    *
    * @param value The raw value.
    * @param options The object that defines how model object should be created from plain object hierarchy.
    */
  def getStateful(value: js.Any, options: js.Object): js.Any = js.native
  /**
    * Factory method that instantiates a new data model that view
    * components may bind to.
    * Factory method that returns a client-side data model, which is a
    * tree of dojo/Stateful objects matching the initial data structure
    * passed as input:
    *
    * The mixin property "data" is used to provide a plain JavaScript
    * object directly representing the data structure.
    * The mixin property "store", along with an optional mixin property
    * "query", is used to provide a data store to query to obtain the
    * initial data.
    * This function returns an immediate dojox.mvc.StatefulModel instance or
    * a Promise for such an instance as follows:
    *
    * if args.data: returns immediately
    * if args.store: if store returns immediately, this function returns immediately;
    *   if store returns a Promise, this function returns a model Promise
    *
    * @param args The mixin properties.
    */
  def newStatefulModel(args: js.Object): Unit = js.native
  /**
    * Find a dojo/Stateful for the target.
    * If target is not a string, return target itself.
    * If target is "widget:widgetid", returns the widget whose ID is widgetid.
    * If target is "rel:object.path", or target is other string, returns an object under parent (if specified) or under global scope.
    *
    * @param target The data binding to resolve.
    * @param parent               OptionalThe parent data binding. Used when the data binding is defined inside repeat.
    */
  def resolve(target: String, parent: Stateful): js.Any = js.native
  /**
    * Find a dojo/Stateful for the target.
    * If target is not a string, return target itself.
    * If target is "widget:widgetid", returns the widget whose ID is widgetid.
    * If target is "rel:object.path", or target is other string, returns an object under parent (if specified) or under global scope.
    *
    * @param target The data binding to resolve.
    * @param parent               OptionalThe parent data binding. Used when the data binding is defined inside repeat.
    */
  def resolve(target: Stateful, parent: Stateful): js.Any = js.native
  /**
    * Synchronize two dojo/Stateful properties.
    * Synchronize two dojo/Stateful properties.
    *
    * @param source Source dojo/Stateful to be synchronized.
    * @param sourceProp The property name in source to be synchronized.
    * @param target Target dojo/Stateful to be synchronized.
    * @param targetProp The property name in target to be synchronized.
    * @param options Data binding options.
    */
  def sync(source: Stateful, sourceProp: String, target: Stateful, targetProp: String, options: js.Object): js.Any = js.native
}

