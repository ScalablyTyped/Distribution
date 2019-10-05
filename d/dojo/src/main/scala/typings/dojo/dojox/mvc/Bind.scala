package typings.dojo.dojox.mvc

import typings.dojo.Anon_Unwatch
import typings.dojo.Fn_NewValue
import typings.dojo.Fn_NewValueOldValue
import typings.dojo.Fn_NewValueOldValueProperty
import typings.dojo.Fn_NewValueOldValuePropertyFunction
import typings.dojo.Fn_NewValueOldValuePropertyNumber
import typings.dojo.dijit._WidgetBase
import typings.dojo.dojo.Stateful
import typings.dojo.dojo.store.DataStore
import typings.dojo.dojo.store.api.Store.PutDirectives
import typings.dojo.dojo.store.api.Store.QueryOptions
import typings.dojo.dojoStrings.`data-mvc-bindings`
import typings.dojo.dojoStrings.`data-mvc-child-bindings`
import typings.dojo.dojoStrings.`data-mvc-child-mixins`
import typings.dojo.dojoStrings.`data-mvc-child-props`
import typings.dojo.dojoStrings.`data-mvc-child-type`
import typings.dojo.dojoStrings.attachScope
import typings.dojo.dojoStrings.bindings
import typings.dojo.dojoStrings.childBindings
import typings.dojo.dojoStrings.childClz
import typings.dojo.dojoStrings.childMixins
import typings.dojo.dojoStrings.childParams
import typings.dojo.dojoStrings.childType
import typings.dojo.dojoStrings.children
import typings.dojo.dojoStrings.contextRequire
import typings.dojo.dojoStrings.cursor
import typings.dojo.dojoStrings.cursorId
import typings.dojo.dojoStrings.cursorIndex
import typings.dojo.dojoStrings.dataBindAttr
import typings.dojo.dojoStrings.exprchar
import typings.dojo.dojoStrings.getPlainValueOptions
import typings.dojo.dojoStrings.getStatefulOptions
import typings.dojo.dojoStrings.holdModelUntilCommit
import typings.dojo.dojoStrings.idProperty
import typings.dojo.dojoStrings.index
import typings.dojo.dojoStrings.model
import typings.dojo.dojoStrings.originalModel
import typings.dojo.dojoStrings.ownProps
import typings.dojo.dojoStrings.partialRebuild
import typings.dojo.dojoStrings.removeRepeatNode
import typings.dojo.dojoStrings.searchContainerNode
import typings.dojo.dojoStrings.sourceModel
import typings.dojo.dojoStrings.store
import typings.dojo.dojoStrings.style
import typings.dojo.dojoStrings.target
import typings.dojo.dojoStrings.templatePath
import typings.dojo.dojoStrings.templateString
import typings.dojo.dojoStrings.useParent
import typings.dojo.dojoStrings.valid
import typings.dojo.dojoStrings.value
import typings.dojo.dojoStrings.widgetsInTemplate
import typings.std.HTMLDocument
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/mvc/Bind.html
  *
  *
  */
@js.native
trait Bind extends js.Object {
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

@JSGlobal("dojox.mvc.Bind")
@js.native
object Bind extends js.Object {
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/mvc/Bind.EditModelRefController.html
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
    def watch_getPlainValueOptions(property: getPlainValueOptions, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_getStatefulOptions(property: getStatefulOptions, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_holdModelUntilCommit(property: holdModelUntilCommit, callback: Fn_NewValue): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_originalModel(property: originalModel, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_sourceModel(property: sourceModel, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/mvc/Bind.EditStoreRefController.html
    *
    * A child class of dojox/mvc/StoreRefController, managing edits.
    * In addition to what dojox/mvc/StoreRefController does, the commit() method sends the data model as well as the removed entries in array to the data store.
    * NOTE - If this class is used with a widget by data-dojo-mixins, make sure putting the widget in data-dojo-type and putting this class to data-dojo-mixins.
    *
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.dojo.dojox.mvc._atBindingMixin because Already inherited
  - typings.dojo.dojo.Stateful because Already inherited
  - typings.dojo.dojox.mvc._Controller because Already inherited
  - typings.dojo.dojox.mvc.ModelRefController because Already inherited
  - typings.dojo.dojox.mvc.EditModelRefController because Inheritance from two classes. Inlined set_datamvcbindings, get_datamvcbindings, watch_datamvcbindings, set_dataBindAttr, get_dataBindAttr, watch_dataBindAttr, getPlainValueOptions, set_getPlainValueOptions, get_getPlainValueOptions, watch_getPlainValueOptions, set_getStatefulOptions, get_getStatefulOptions, watch_getStatefulOptions, holdModelUntilCommit, set_holdModelUntilCommit, get_holdModelUntilCommit, watch_holdModelUntilCommit, set_model, get_model, watch_model, originalModel, set_originalModel, get_originalModel, watch_originalModel, set_ownProps, get_ownProps, watch_ownProps, sourceModel, set_sourceModel, get_sourceModel, watch_sourceModel, cloneModel, commit, destroy, get, hasControllerProperty, postscript, postscript, reset, set, startup, watch */ @js.native
  class EditStoreRefController ()
    extends typings.dojo.dojox.mvc.StoreRefController {
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
    def watch_getPlainValueOptions(property: getPlainValueOptions, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_holdModelUntilCommit(property: holdModelUntilCommit, callback: Fn_NewValue): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_originalModel(property: originalModel, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_sourceModel(property: sourceModel, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/mvc/Bind.EditStoreRefListController.html
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
  - typings.dojo.dojox.mvc.ListController because Inheritance from two classes. Inlined cursor, set_cursor, get_cursor, watch_cursor, cursorId, set_cursorId, get_cursorId, watch_cursorId, cursorIndex, set_cursorIndex, get_cursorIndex, watch_cursorIndex, set_datamvcbindings, get_datamvcbindings, watch_datamvcbindings, set_dataBindAttr, get_dataBindAttr, watch_dataBindAttr, idProperty, set_idProperty, get_idProperty, watch_idProperty, set_model, get_model, watch_model, set_ownProps, get_ownProps, watch_ownProps, destroy, get, hasControllerProperty, postscript, postscript, set, startup, watch */ @js.native
  class EditStoreRefListController ()
    extends typings.dojo.dojox.mvc.EditStoreRefController {
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
    def watch_cursor(property: cursor, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_cursorId(property: cursorId, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_cursorIndex(property: cursorIndex, callback: Fn_NewValueOldValuePropertyNumber): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_idProperty(property: idProperty, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/mvc/Bind.Element.html
    *
    * A widget implicitly created by dojox/mvc/parserExtension.
    * Maps "value" attribute to form element value, innerText/innerHTML to element's innerText/innerHTML, and other attributes to DOM attributes.
    * Also, for form element, updates value (or checked for check box) as user edits.
    *
    * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
    * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
    */
  @js.native
  class Element () extends _WidgetBase {
    def this(params: js.Object) = this()
    def this(params: js.Object, srcNodeRef: HTMLElement) = this()
    /**
      * HTML style attributes as cssText string or name/value hash
      *
      */
    @JSName("style")
    var style_Element: String = js.native
    /**
      * Track specified handles and remove/destroy them when this instance is destroyed, unless they were
      * already removed/destroyed manually.
      *
      */
    def own(): js.Any = js.native
    @JSName("set")
    def set_style(property: style, value: String): Unit = js.native
    @JSName("watch")
    def watch_style(property: style, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/mvc/Bind.Generate.html
    *
    * A container that generates a view based on the data model its bound to.
    * A generate introspects its data binding and creates a view contained in
    * it that allows displaying the bound data. Child dijits or custom view
    * components inside it inherit their parent data binding context from it.
    *
    * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
    * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
    */
  @js.native
  class Generate ()
    extends typings.dojo.dojox.mvc._Container {
    def this(params: js.Object) = this()
    def this(params: js.Object, srcNodeRef: HTMLElement) = this()
    /**
      * The array of data model that is used to render child nodes.
      *
      */
    var children: js.Object = js.native
    @JSName("get")
    def get_children(property: children): js.Object = js.native
    @JSName("set")
    def set_children(property: children, value: js.Object): Unit = js.native
    @JSName("watch")
    def watch_children(property: children, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/mvc/Bind.Group.html
    *
    * A simple model-bound container widget with single-node binding to a data model.
    * A group is usually bound to an intermediate dojo/Stateful node in the data model.
    * Child dijits or custom view components inside a group inherit their parent
    * data binding context from it.
    *
    * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
    * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
    */
  @js.native
  class Group () extends _WidgetBase {
    def this(params: js.Object) = this()
    def this(params: js.Object, srcNodeRef: HTMLElement) = this()
    /**
      * HTML style attributes as cssText string or name/value hash
      *
      */
    @JSName("style")
    var style_Group: String = js.native
    /**
      * The data model used for relative data binding.
      *
      */
    var target: js.Object = js.native
    @JSName("get")
    def get_target(property: target): js.Object = js.native
    /**
      * Track specified handles and remove/destroy them when this instance is destroyed, unless they were
      * already removed/destroyed manually.
      *
      */
    def own(): js.Any = js.native
    @JSName("set")
    def set_style(property: style, value: String): Unit = js.native
    @JSName("set")
    def set_target(property: target, value: js.Object): Unit = js.native
    @JSName("watch")
    def watch_style(property: style, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_target(property: target, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/mvc/Bind.ListController.html
    *
    * A controller working with array model, managing its cursor.
    * NOTE - If this class is used with a widget by data-dojo-mixins, make sure putting the widget in data-dojo-type and putting this class to data-dojo-mixins.
    *
    */
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
    def watch_cursor(property: cursor, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_cursorId(property: cursorId, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_cursorIndex(property: cursorIndex, callback: Fn_NewValueOldValuePropertyNumber): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_idProperty(property: idProperty, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
  }
  
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
  @js.native
  class ModelRefController ()
    extends typings.dojo.dojox.mvc._Controller {
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
    def watch_model(property: model, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_ownProps(property: ownProps, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/mvc/Bind.Output.html
    *
    * A simple widget that displays templated output, parts of which may
    * be data-bound.
    * Simple output example:
    *
    * <span data-dojo-type="dojox/mvc/Output" data-dojo-props="value: at(model, 'balance')"></span>
    * Another simple output example:
    *
    * <span data-dojo-type="dojox/mvc/Output" data-dojo-props="value: at(model, 'balance')">
    *   Your balance is: ${this.value}
    * </span>
    * The output widget being data-bound, if the balance changes in the
    * model, the content within the <span> will be
    * updated accordingly.
    *
    * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
    * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
    */
  @js.native
  class Output () extends _WidgetBase {
    def this(params: js.Object) = this()
    def this(params: js.Object, srcNodeRef: HTMLElement) = this()
    /**
      * Character to use for a substitution expression, for a substitution string like ${this.value}
      * If this class is declared in a template HTML and exprchar is used in in-line template of this class, something other than $ should be specified to avoid conflict with exprchar of outer-template.
      *
      */
    var exprchar: js.Object = js.native
    /**
      * HTML style attributes as cssText string or name/value hash
      *
      */
    @JSName("style")
    var style_Output: String = js.native
    @JSName("get")
    def get_exprchar(property: exprchar): js.Object = js.native
    /**
      * Track specified handles and remove/destroy them when this instance is destroyed, unless they were
      * already removed/destroyed manually.
      *
      */
    def own(): js.Any = js.native
    /**
      * Override and save template from body.
      *
      * @param params
      * @param srcNodeRef
      */
    def postscript(params: js.Any): Unit = js.native
    def postscript(params: js.Any, srcNodeRef: js.Any): Unit = js.native
    @JSName("set")
    def set_exprchar(property: exprchar, value: js.Object): Unit = js.native
    @JSName("set")
    def set_style(property: style, value: String): Unit = js.native
    @JSName("watch")
    def watch_exprchar(property: exprchar, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_style(property: style, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/mvc/Bind.Repeat.html
    *
    * A model-bound container which binds to a collection within a data model
    * and produces a repeating user-interface from a template for each
    * iteration within the collection.
    * A repeat is bound to an intermediate dojo/Stateful node corresponding
    * to an array in the data model. Child dijits or custom view components
    * inside it inherit their parent data binding context from it.
    *
    * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
    * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
    */
  @js.native
  class Repeat ()
    extends typings.dojo.dojox.mvc._Container {
    def this(params: js.Object) = this()
    def this(params: js.Object, srcNodeRef: HTMLElement) = this()
    /**
      * The array of data model that is used to render child nodes.
      *
      */
    var children: js.Object = js.native
    /**
      * An index used to track the current iteration when the repeating UI is
      * produced. This may be used to parameterize the content in the repeat
      * template for the current iteration.
      *
      * For example, consider a collection of search or query results where
      * each item contains a "Name" property used to prime the "Results" data
      * model. Then, the following CRUD-style UI displays all the names in
      * the search results in text boxes where they may be updated or such.
      *
      * <div dojoType="dojox/mvc/Repeat" ref="Results">
      *     <div class="row" dojoType="dojox/mvc/Group" ref="${this.index}">
      *         <label for="nameInput${this.index}">Name:</label>
      *         <input dojoType="dijit/form/TextBox" id="nameInput${this.index}" ref="'Name'"></input>
      *     </div>
      * </div>
      *
      */
    var index: Double = js.native
    /**
      * When true the dom node for the Repeat and Groups within the Repeat
      * will be removed, their children will be placed into the parent node
      * of the Repeat node.  This should be set to true when working with
      * a Repeat inside of a dojox.mobile list.
      *
      */
    var removeRepeatNode: Boolean = js.native
    /**
      * id of the DOM node to use as the parent for the repeating items, similar to useParentId processed a little differently
      *
      */
    var useParent: String = js.native
    @JSName("get")
    def get_children(property: children): js.Object = js.native
    @JSName("get")
    def get_index(property: index): Double = js.native
    @JSName("get")
    def get_removeRepeatNode(property: removeRepeatNode): Boolean = js.native
    @JSName("get")
    def get_useParent(property: useParent): String = js.native
    /**
      *
      * @param params
      * @param srcNodeRef
      */
    def postscript(params: js.Any): Unit = js.native
    def postscript(params: js.Any, srcNodeRef: js.Any): Unit = js.native
    @JSName("set")
    def set_children(property: children, value: js.Object): Unit = js.native
    @JSName("set")
    def set_index(property: index, value: Double): Unit = js.native
    @JSName("set")
    def set_removeRepeatNode(property: removeRepeatNode, value: Boolean): Unit = js.native
    @JSName("set")
    def set_useParent(property: useParent, value: String): Unit = js.native
    @JSName("watch")
    def watch_children(property: children, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_index(property: index, callback: Fn_NewValueOldValuePropertyNumber): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_removeRepeatNode(property: removeRepeatNode, callback: Fn_NewValue): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_useParent(property: useParent, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/mvc/Bind.StatefulModel.html
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
  @js.native
  class StatefulModel protected () extends Stateful {
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
    def get_data(property: typings.dojo.dojoStrings.data): js.Object = js.native
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
    def set_data(property: typings.dojo.dojoStrings.data, value: js.Object): Unit = js.native
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
    def watch_data(property: typings.dojo.dojoStrings.data, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_getPlainValueOptions(property: getPlainValueOptions, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_getStatefulOptions(property: getStatefulOptions, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_store(property: store, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_valid(property: valid, callback: Fn_NewValue): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_value(property: value, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/mvc/Bind.StatefulSeries.html
    *
    * Chart data plugin ("series") that watches for properties specified in dojox/mvc/at handles in the given data.
    * At initialization, and when the properties are updated, creates the data from data given and updates the chart.
    *
    * @param items
    */
  @js.native
  class StatefulSeries protected () extends js.Object {
    def this(items: js.Array[_]) = this()
    /**
      *
      */
    def destroy(): Unit = js.native
    /**
      *
      * @param series
      */
    def setSeriesObject(series: js.Any): Unit = js.native
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/mvc/Bind.StoreRefController.html
    *
    * A child class of dojox.mvc.ModelRefController, which keeps a reference to Dojo Object Store (in store property).
    * Has several methods to work with the store:
    *
    * queryStore(): Runs query() against the store, and creates a data model from retrieved data
    * getStore(): Runs get() against the store, and creates a data model from retrieved data
    * putStore(): Runs put() against the store
    * addStore(): Runs add() against the store
    * removeStore(): Runs remove() against the store
    * dojo.Stateful get()/set()/watch() interfaces in dojox.mvc.StoreRefController will work with the data model from queryStore() or getStore().
    *
    * NOTE - If this class is used with a widget by data-dojo-mixins, make sure putting the widget in data-dojo-type and putting this class to data-dojo-mixins.
    *
    */
  @js.native
  class StoreRefController ()
    extends typings.dojo.dojox.mvc.ModelRefController {
    /**
      * The options to get stateful object from plain value.
      *
      */
    var getStatefulOptions: js.Object = js.native
    /**
      * The Dojo Object Store in use.
      *
      */
    var store: js.Object = js.native
    /**
      * Creates an object, throws an error if the object already exists.
      *
      * @param object The object to store.
      * @param options               OptionalAdditional metadata for storing the data.  Includes an "id" property if a specific id is to be used.
      */
    def addStore(`object`: js.Object, options: PutDirectives): js.Any = js.native
    /**
      * Retrieves an object by its identity.
      *
      * @param id The identity to use to lookup the object.
      * @param options The options for dojo/store.*.get().
      */
    def getStore(id: Double, options: js.Object): js.Any = js.native
    @JSName("get")
    def get_getStatefulOptions(property: getStatefulOptions): js.Object = js.native
    @JSName("get")
    def get_store(property: store): js.Object = js.native
    /**
      * Stores an object.
      *
      * @param object The object to store.
      * @param options               OptionalAdditional metadata for storing the data.  Includes an "id" property if a specific id is to be used.
      */
    def putStore(`object`: js.Object, options: PutDirectives): js.Any = js.native
    /**
      * Queries the store for objects.
      *
      * @param query The query to use for retrieving objects from the store.
      * @param options               OptionalThe optional arguments to apply to the resultset.
      */
    def queryStore(query: js.Object, options: QueryOptions): js.Any = js.native
    /**
      * Deletes an object by its identity
      *
      * @param id The identity to use to delete the object
      * @param options The options for dojo/store//.remove().
      */
    def removeStore(id: Double, options: js.Object): js.Any = js.native
    @JSName("set")
    def set_getStatefulOptions(property: getStatefulOptions, value: js.Object): Unit = js.native
    @JSName("set")
    def set_store(property: store, value: js.Object): Unit = js.native
    @JSName("watch")
    def watch_getStatefulOptions(property: getStatefulOptions, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_store(property: store, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/mvc/Bind.Templated.html
    *
    * A templated widget, mostly the same as dijit/_Templated, but without deprecated features in it.
    *
    * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
    * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.dojo.dijit._AttachMixin because Inheritance from two classes. Inlined 
  - typings.dojo.dijit._WidgetsInTemplateMixin because Inheritance from two classes. Inlined contextRequire, widgetsInTemplate, startup
  - typings.dojo.dijit._TemplatedMixin because Inheritance from two classes. Inlined attachScope, searchContainerNode, templatePath, templateString, buildRendering, destroyRendering, getCachedTemplate, getCachedTemplate */ @js.native
  class Templated () extends _WidgetBase {
    def this(params: js.Object) = this()
    def this(params: js.Object, srcNodeRef: HTMLElement) = this()
    /**
      * Object to which attach points and events will be scoped.  Defaults
      * to 'this'.
      *
      */
    var attachScope: js.Object = js.native
    /**
      * The data binding declaration (or simple parameters) for child widgets.
      *
      */
    var bindings: js.Object = js.native
    /**
      * Used to provide a context require to the dojo/parser in order to be
      * able to use relative MIDs (e.g. ./Widget) in the widget's template.
      *
      */
    var contextRequire: js.Function = js.native
    /**
      *
      */
    var searchContainerNode: Boolean = js.native
    /**
      * HTML style attributes as cssText string or name/value hash
      *
      */
    @JSName("style")
    var style_Templated: String = js.native
    /**
      * Path to template (HTML file) for this widget relative to dojo.baseUrl.
      * Deprecated: use templateString with require([... "dojo/text!..."], ...) instead
      *
      */
    var templatePath: String = js.native
    /**
      * A string that represents the widget template.
      * Use in conjunction with dojo.cache() to load from a file.
      *
      */
    var templateString: String = js.native
    /**
      * Should we parse the template to find widgets that might be
      * declared in markup inside it?  (Remove for 2.0 and assume true)
      *
      */
    var widgetsInTemplate: Boolean = js.native
    /**
      * Static method to get a template based on the templatePath or
      * templateString key
      */
    def getCachedTemplate(): js.Any = js.native
    /**
      * Static method to get a template based on the templatePath or
      * templateString key
      * 
      * @param templateString The template             
      * @param alwaysUseString Don't cache the DOM tree for this template, even if it doesn't have any variables             
      * @param doc               OptionalThe target document.   Defaults to document global if unspecified.             
      */
    def getCachedTemplate(templateString: String, alwaysUseString: Boolean): js.Any = js.native
    def getCachedTemplate(templateString: String, alwaysUseString: Boolean, doc: HTMLDocument): js.Any = js.native
    @JSName("get")
    def get_attachScope(property: attachScope): js.Object = js.native
    @JSName("get")
    def get_bindings(property: bindings): js.Object = js.native
    @JSName("get")
    def get_contextRequire(property: contextRequire): js.Function = js.native
    @JSName("get")
    def get_searchContainerNode(property: searchContainerNode): Boolean = js.native
    @JSName("get")
    def get_templatePath(property: templatePath): String = js.native
    @JSName("get")
    def get_templateString(property: templateString): String = js.native
    @JSName("get")
    def get_widgetsInTemplate(property: widgetsInTemplate): Boolean = js.native
    /**
      * Track specified handles and remove/destroy them when this instance is destroyed, unless they were
      * already removed/destroyed manually.
      *
      */
    def own(): js.Any = js.native
    @JSName("set")
    def set_attachScope(property: attachScope, value: js.Object): Unit = js.native
    @JSName("set")
    def set_bindings(property: bindings, value: js.Object): Unit = js.native
    @JSName("set")
    def set_contextRequire(property: contextRequire, value: js.Function): Unit = js.native
    @JSName("set")
    def set_searchContainerNode(property: searchContainerNode, value: Boolean): Unit = js.native
    @JSName("set")
    def set_style(property: style, value: String): Unit = js.native
    @JSName("set")
    def set_templatePath(property: templatePath, value: String): Unit = js.native
    @JSName("set")
    def set_templateString(property: templateString, value: String): Unit = js.native
    @JSName("set")
    def set_widgetsInTemplate(property: widgetsInTemplate, value: Boolean): Unit = js.native
    @JSName("watch")
    def watch_attachScope(property: attachScope, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_bindings(property: bindings, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_contextRequire(property: contextRequire, callback: Fn_NewValueOldValuePropertyFunction): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_searchContainerNode(property: searchContainerNode, callback: Fn_NewValue): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_style(property: style, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_templatePath(property: templatePath, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_templateString(property: templateString, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_widgetsInTemplate(property: widgetsInTemplate, callback: Fn_NewValue): Anon_Unwatch = js.native
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/mvc/Bind.WidgetList.html
    *
    * A widget that creates child widgets repeatedly based on the children attribute (the repeated data) and childType/childMixins/childParams attributes (determines how to create each child widget).
    *
    * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
    * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.dojo.dijit._Container because Inheritance from two classes. Inlined addChild, addChild, buildRendering, getIndexOfChild, hasChildren, removeChild, removeChild */ @js.native
  class WidgetList () extends _WidgetBase {
    def this(params: js.Object) = this()
    def this(params: js.Object, srcNodeRef: HTMLElement) = this()
    /**
      * Data bindings for child widget.
      *
      */
    var childBindings: js.Object = js.native
    /**
      * The class of the child widget. Takes precedence over childType/childMixins.
      *
      */
    var childClz: js.Function = js.native
    /**
      * The list of module IDs (separated by comma), or a functinon that takes child data as the argument and returns it, of the classes that will be mixed into child widget. childClz takes precedence over childType/this.
      * Can be specified via data-mvc-child-mixins attribute of widget declaration.
      *
      */
    var childMixins: String = js.native
    /**
      * The mixin properties for child widget.
      * Can be specified via data-mvc-child-props attribute of widget declaration.
      * "this" in data-mvc-child-props will have the following properties:
      *
      * parent - This widget's instance.
      * target - The data item in children.
      *
      */
    var childParams: js.Object = js.native
    /**
      * The module ID of child widget, or a function that takes child data as the argument and returns the module ID of child widget. childClz takes precedence over this/childMixins.
      * Can be specified via data-mvc-child-type attribute of widget declaration.
      *
      */
    var childType: String = js.native
    /**
      * The array of data model that is used to render child nodes.
      *
      */
    var children: js.Object = js.native
    /**
      *
      */
    var `data-mvc-child-bindings`: String = js.native
    /**
      *
      */
    var `data-mvc-child-mixins`: String = js.native
    /**
      *
      */
    var `data-mvc-child-props`: String = js.native
    /**
      *
      */
    var `data-mvc-child-type`: String = js.native
    /**
      * If true, only rebuild repeat items for changed elements. Otherwise, rebuild everything if there is a change in children.
      *
      */
    var partialRebuild: Boolean = js.native
    /**
      * HTML style attributes as cssText string or name/value hash
      *
      */
    @JSName("style")
    var style_WidgetList: String = js.native
    /**
      * The template string for each child items. templateString in child widgets take precedence over this.
      *
      */
    var templateString: String = js.native
    /**
      * Makes the given widget a child of this widget.
      * Inserts specified child widget's dom node as a child of this widget's
      * container node, and possibly does other processing (such as layout).
      * 
      * @param widget             
      * @param insertIndex               Optional            
      */
    def addChild(widget: _WidgetBase): Unit = js.native
    /**
      * Makes the given widget a child of this widget.
      * Inserts specified child widget's dom node as a child of this widget's
      * container node, and possibly does other processing (such as layout).
      *
      * @param widget
      * @param insertIndex               Optional
      */
    def addChild(widget: _WidgetBase, insertIndex: Double): Unit = js.native
    /**
      * Gets the index of the child in this container or -1 if not found
      *
      * @param child
      */
    /**
      * Gets the index of the child in this container or -1 if not found
      * 
      * @param child             
      */
    def getIndexOfChild(child: _WidgetBase): js.Any = js.native
    @JSName("get")
    def get_childBindings(property: childBindings): js.Object = js.native
    @JSName("get")
    def get_childClz(property: childClz): js.Function = js.native
    @JSName("get")
    def get_childMixins(property: childMixins): String = js.native
    @JSName("get")
    def get_childParams(property: childParams): js.Object = js.native
    @JSName("get")
    def get_childType(property: childType): String = js.native
    @JSName("get")
    def get_children(property: children): js.Object = js.native
    @JSName("get")
    def get_datamvcchildbindings(property: `data-mvc-child-bindings`): String = js.native
    @JSName("get")
    def get_datamvcchildmixins(property: `data-mvc-child-mixins`): String = js.native
    @JSName("get")
    def get_datamvcchildprops(property: `data-mvc-child-props`): String = js.native
    @JSName("get")
    def get_datamvcchildtype(property: `data-mvc-child-type`): String = js.native
    @JSName("get")
    def get_partialRebuild(property: partialRebuild): Boolean = js.native
    @JSName("get")
    def get_templateString(property: templateString): String = js.native
    /**
      * Returns true if widget has child widgets, i.e. if this.containerNode contains widgets.
      *
      */
    /**
      * Returns true if widget has child widgets, i.e. if this.containerNode contains widgets.
      * 
      */
    def hasChildren(): Boolean = js.native
    /**
      * Track specified handles and remove/destroy them when this instance is destroyed, unless they were
      * already removed/destroyed manually.
      *
      */
    def own(): js.Any = js.native
    /**
      * Removes the passed widget instance from this widget but does
      * not destroy it.  You can also pass in an integer indicating
      * the index within the container to remove (ie, removeChild(5) removes the sixth widget).
      *
      * @param widget
      */
    /**
      * Removes the passed widget instance from this widget but does
      * not destroy it.  You can also pass in an integer indicating
      * the index within the container to remove (ie, removeChild(5) removes the sixth widget).
      * 
      * @param widget             
      */
    def removeChild(widget: Double): Unit = js.native
    /**
      * Removes the passed widget instance from this widget but does
      * not destroy it.  You can also pass in an integer indicating
      * the index within the container to remove (ie, removeChild(5) removes the sixth widget).
      *
      * @param widget
      */
    /**
      * Removes the passed widget instance from this widget but does
      * not destroy it.  You can also pass in an integer indicating
      * the index within the container to remove (ie, removeChild(5) removes the sixth widget).
      * 
      * @param widget             
      */
    def removeChild(widget: _WidgetBase): Unit = js.native
    @JSName("set")
    def set_childBindings(property: childBindings, value: js.Object): Unit = js.native
    @JSName("set")
    def set_childClz(property: childClz, value: js.Function): Unit = js.native
    @JSName("set")
    def set_childMixins(property: childMixins, value: String): Unit = js.native
    @JSName("set")
    def set_childParams(property: childParams, value: js.Object): Unit = js.native
    @JSName("set")
    def set_childType(property: childType, value: String): Unit = js.native
    @JSName("set")
    def set_children(property: children, value: js.Object): Unit = js.native
    @JSName("set")
    def set_datamvcchildbindings(property: `data-mvc-child-bindings`, value: String): Unit = js.native
    @JSName("set")
    def set_datamvcchildmixins(property: `data-mvc-child-mixins`, value: String): Unit = js.native
    @JSName("set")
    def set_datamvcchildprops(property: `data-mvc-child-props`, value: String): Unit = js.native
    @JSName("set")
    def set_datamvcchildtype(property: `data-mvc-child-type`, value: String): Unit = js.native
    @JSName("set")
    def set_partialRebuild(property: partialRebuild, value: Boolean): Unit = js.native
    @JSName("set")
    def set_style(property: style, value: String): Unit = js.native
    @JSName("set")
    def set_templateString(property: templateString, value: String): Unit = js.native
    @JSName("watch")
    def watch_childBindings(property: childBindings, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_childClz(property: childClz, callback: Fn_NewValueOldValuePropertyFunction): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_childMixins(property: childMixins, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_childParams(property: childParams, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_childType(property: childType, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_children(property: children, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_datamvcchildbindings(property: `data-mvc-child-bindings`, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_datamvcchildmixins(property: `data-mvc-child-mixins`, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_datamvcchildprops(property: `data-mvc-child-props`, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_datamvcchildtype(property: `data-mvc-child-type`, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_partialRebuild(property: partialRebuild, callback: Fn_NewValue): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_style(property: style, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_templateString(property: templateString, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/mvc/Bind._Container.html
    *
    *
    * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
    * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
    */
  @js.native
  class _Container () extends _WidgetBase {
    def this(params: js.Object) = this()
    def this(params: js.Object, srcNodeRef: HTMLElement) = this()
    /**
      * Character to use for a substitution expression, for a substitution string like ${this.index}
      * If this class is declared in a template HTML and exprchar is used in in-line template of this class, something other than $ should be specified to avoid conflict with exprchar of outer-template.
      *
      */
    var exprchar: js.Object = js.native
    /**
      * HTML style attributes as cssText string or name/value hash
      *
      */
    @JSName("style")
    var style__Container: String = js.native
    @JSName("get")
    def get_exprchar(property: exprchar): js.Object = js.native
    /**
      * Track specified handles and remove/destroy them when this instance is destroyed, unless they were
      * already removed/destroyed manually.
      *
      */
    def own(): js.Any = js.native
    @JSName("set")
    def set_exprchar(property: exprchar, value: js.Object): Unit = js.native
    @JSName("set")
    def set_style(property: style, value: String): Unit = js.native
    @JSName("watch")
    def watch_exprchar(property: exprchar, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_style(property: style, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/mvc/Bind._Controller.html
    *
    *
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.dojo.dojox.mvc._atBindingMixin because Inheritance from two classes. Inlined `data-mvc-bindings`, dataBindAttr, mixin */ @js.native
  class _Controller () extends Stateful {
    /**
      *
      */
    var `data-mvc-bindings`: String = js.native
    /**
      * The attribute name for data binding.
      *
      */
    var dataBindAttr: String = js.native
    /**
      * The mixin for dijit/_WidgetBase to support data binding.
      *
      */
    var mixin: js.Object = js.native
    /**
      * Stops data binding as this object is destroyed.
      *
      */
    def destroy(): Unit = js.native
    @JSName("get")
    def get_dataBindAttr(property: dataBindAttr): String = js.native
    @JSName("get")
    def get_datamvcbindings(property: `data-mvc-bindings`): String = js.native
    def postscript(params: js.Object, srcNodeRef: String): js.Any = js.native
    def postscript(params: js.Object, srcNodeRef: HTMLElement): js.Any = js.native
    /**
      * If the value given is dojox/mvc/at handle, use it for data binding.
      * Otherwise, if setter function is there, use it.
      * Otherwise, set the value to the data model or to this object.
      *
      * @param name The property name.
      * @param value The property value.
      */
    def set(name: String, value: js.Any): Unit = js.native
    @JSName("set")
    def set_dataBindAttr(property: dataBindAttr, value: String): Unit = js.native
    @JSName("set")
    def set_datamvcbindings(property: `data-mvc-bindings`, value: String): Unit = js.native
    /**
      * Starts up data binding as this object starts up.
      *
      */
    def startup(): Unit = js.native
    @JSName("watch")
    def watch_dataBindAttr(property: dataBindAttr, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_datamvcbindings(property: `data-mvc-bindings`, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/mvc/Bind._DataBindingMixin.html
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
  @js.native
  class _DataBindingMixin () extends js.Object {
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
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/mvc/Bind._InlineTemplateMixin.html
    *
    * A mixin for template widget, which will look for <script type="dojox/mvc/InlineTemplate">
    * and treat the HTML in there as the template string.
    *
    */
  @js.native
  class _InlineTemplateMixin () extends js.Object {
    /**
      *
      */
    def buildRendering(): Unit = js.native
  }
  
}

