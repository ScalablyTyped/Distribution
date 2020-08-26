package typings.extjs.Ext.container

import typings.extjs.Ext.Array
import typings.extjs.Ext.IComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.extjs.Ext.IClass because Already inherited
- typings.extjs.Ext.IBase because Already inherited
- typings.extjs.Ext.IQueryable because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined child, down, query, queryBy, queryById */ @js.native
trait IAbstractContainer extends IComponent {
  /** [Config Option] (String/Number) */
  var activeItem: js.UndefOr[js.Any] = js.native
  /** [Method] Adds Component s to this Container
    * @param component Ext.Component[]|Object[]/Ext.Component.../Object... Either one or more Components to add or an Array of Components to add. See items for additional information.
    * @returns Ext.Component[]/Ext.Component The Components that were added.
    */
  var add: js.UndefOr[js.Function1[/* component */ js.UndefOr[js.Any], _]] = js.native
  /** [Method] Invoked after the Container has laid out and rendered if necessary its child Components
    * @param layout Ext.layout.container.Container
    */
  var afterLayout: js.UndefOr[
    js.Function1[/* layout */ js.UndefOr[typings.extjs.Ext.layout.container.IContainer], Unit]
  ] = js.native
  /** [Config Option] (Boolean) */
  var autoDestroy: js.UndefOr[Boolean] = js.native
  /** [Config Option] (String[]) */
  var bubbleEvents: js.UndefOr[Array] = js.native
  /** [Method] Cascades down the component container heirarchy from this component passed in the first call  calling the specified
    * @param fn Function The function to call
    * @param scope Object The scope of the function (defaults to current component)
    * @param args Array The args to call the function with. The current component always passed as the last argument.
    * @returns Ext.Container this
    */
  var cascade: js.UndefOr[
    js.Function3[
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* args */ js.UndefOr[Array], 
      typings.extjs.Ext.IContainer
    ]
  ] = js.native
  /** [Method] Retrieves the first direct child of this container which matches the passed selector or component
    * @param selector String/Ext.Component An Ext.ComponentQuery selector. If no selector is specified, the first child will be returned.
    * @returns Object Ext.Component The matching child Ext.Component (or null if no match was found).
    */
  var child: js.UndefOr[js.Function1[js.UndefOr[js.Any], _]] = js.native
  /** [Method] Determines whether the passed Component is either an immediate child of this Container or whether it is a descendant
    * @param comp Ext.Component The Component to test.
    * @param deep Boolean Pass true to test for the Component being a descendant at any level.
    * @returns Boolean true if the passed Component is contained at the specified level.
    */
  var contains: js.UndefOr[
    js.Function2[/* comp */ js.UndefOr[IComponent], /* deep */ js.UndefOr[Boolean], Boolean]
  ] = js.native
  /** [Config Option] (String) */
  var defaultType: js.UndefOr[String] = js.native
  /** [Config Option] (Object/Function) */
  var defaults: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Boolean) */
  var detachOnRemove: js.UndefOr[Boolean] = js.native
  /** [Method] Inherit docs Disable all immediate children that was previously disabled Override disable because onDisable only gets
    * @returns Ext.container.AbstractContainer this
    */
  @JSName("disable")
  var disable_IAbstractContainer: js.UndefOr[js.Function0[this.type]] = js.native
  /** [Method] Manually force this container s layout to be recalculated
    * @returns Ext.container.Container this
    */
  var doLayout: js.UndefOr[js.Function0[IContainer]] = js.native
  /** [Method] Retrieves the first descendant of this container which matches the passed selector
    * @param selector String/Ext.Component An Ext.ComponentQuery selector or Ext.Component. If no selector is specified, the first child will be returned.
    * @returns Object Ext.Component The matching descendant Ext.Component (or null if no match was found).
    */
  var down: js.UndefOr[js.Function1[js.UndefOr[js.Any], _]] = js.native
  /** [Method] Examines this container s items property and gets a direct child component of this container
    * @param comp String/Number This parameter may be any of the following:  a String : representing the itemId or id of the child component. a Number : representing the position of the child component within the items property For additional information see Ext.util.MixedCollection.get.
    * @returns Ext.Component The component (if found).
    */
  var getComponent: js.UndefOr[js.Function1[/* comp */ js.UndefOr[js.Any], IComponent]] = js.native
  /** [Method] Returns the layout instance currently associated with this Container
    * @returns Ext.layout.container.Container The layout
    */
  var getLayout: js.UndefOr[js.Function0[typings.extjs.Ext.layout.container.IContainer]] = js.native
  /** [Method] Used by ComponentQuery child and down to retrieve all of the items which can potentially be considered a child of th
    * @param deep Object
    */
  var getRefItems: js.UndefOr[js.Function1[/* deep */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Inserts a Component into this Container at a specified index
    * @param index Number The index at which the Component will be inserted into the Container's items collection
    * @param component Ext.Component/Object The child Component to insert. Ext uses lazy rendering, and will only render the inserted Component should it become necessary. A Component config object may be passed in order to avoid the overhead of constructing a real Component object if lazy rendering might mean that the inserted Component will not be rendered immediately. To take advantage of this 'lazy instantiation', set the Ext.Component.xtype config property to the registered type of the Component wanted. For a list of all available xtypes, see Ext.enums.Widget.
    * @returns Ext.Component component The Component (or config object) that was inserted with the Container's default config values applied.
    */
  var insert: js.UndefOr[
    js.Function2[/* index */ js.UndefOr[Double], /* component */ js.UndefOr[js.Any], IComponent]
  ] = js.native
  /** [Method] Determines whether this Container is an ancestor of the passed Component
    * @param possibleDescendant Ext.Component The Component to test for presence within this Container's subtree.
    */
  var isAncestor: js.UndefOr[js.Function1[/* possibleDescendant */ js.UndefOr[IComponent], Unit]] = js.native
  /** [Config Option] (Object/Object[]) */
  var items: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Ext.enums.Layout/Object) */
  var layout: js.UndefOr[js.Any] = js.native
  /** [Method] Moves a Component within the Container
    * @param fromIdx Number/Ext.Component The index/component to move.
    * @param toIdx Number The new index for the Component.
    * @returns Ext.Component component The Component that was moved.
    */
  @JSName("move")
  var move_IAbstractContainer: js.UndefOr[
    js.Function2[/* fromIdx */ js.UndefOr[js.Any], /* toIdx */ js.UndefOr[Double], IComponent]
  ] = js.native
  /** [Method] This method is invoked after a new Component has been added
    * @param component Ext.Component
    * @param position Number
    */
  var onAdd: js.UndefOr[
    js.Function2[/* component */ js.UndefOr[IComponent], /* position */ js.UndefOr[Double], Unit]
  ] = js.native
  /** [Method] This method is invoked before adding a new child Component
    * @param item Ext.Component
    */
  var onBeforeAdd: js.UndefOr[js.Function1[/* item */ js.UndefOr[IComponent], Unit]] = js.native
  /** [Method] Called after the component is moved this method is empty by default but can be implemented by any subclass that need  */
  @JSName("onPosition")
  var onPosition_IAbstractContainer: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] This method is invoked after a new Component has been removed
    * @param component Ext.Component
    * @param autoDestroy Boolean
    */
  var onRemove: js.UndefOr[
    js.Function2[/* component */ js.UndefOr[IComponent], /* autoDestroy */ js.UndefOr[Boolean], Unit]
  ] = js.native
  /** [Method] Allows addition of behavior to the resize operation  */
  @JSName("onResize")
  var onResize_IAbstractContainer: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Retrieves all descendant components which match the passed selector
    * @param selector String Selector complying to an Ext.ComponentQuery selector. If no selector is specified all items will be returned.
    * @returns Ext.Component[] Components which matched the selector
    */
  var query: js.UndefOr[js.Function1[js.UndefOr[String], Array]] = js.native
  /** [Method] Retrieves all descendant components which match the passed function
    * @param fn Function The matcher function. It will be called with a single argument, the component being tested.
    * @param scope Object The scope in which to run the function. If not specified, it will default to the active component.
    * @returns Ext.Component[] Components matched by the passed function
    */
  var queryBy: js.UndefOr[js.Function2[js.UndefOr[js.Any], js.UndefOr[js.Any], Array]] = js.native
  /** [Method] Finds a component at any level under this container matching the id itemId
    * @param id String The id to find
    * @returns Ext.Component The matching id, null if not found
    */
  var queryById: js.UndefOr[js.Function1[js.UndefOr[String], IComponent]] = js.native
  /** [Method] Removes a component from this container
    * @param component Ext.Component/String The component reference or id to remove.
    * @param autoDestroy Boolean True to automatically invoke the removed Component's Ext.Component.destroy function. Defaults to the value of this Container's autoDestroy config.
    * @returns Ext.Component component The Component that was removed.
    */
  var remove: js.UndefOr[
    js.Function2[
      /* component */ js.UndefOr[js.Any], 
      /* autoDestroy */ js.UndefOr[Boolean], 
      IComponent
    ]
  ] = js.native
  /** [Method] Removes all components from this container
    * @param autoDestroy Boolean True to automatically invoke the removed Component's Ext.Component.destroy function. Defaults to the value of this Container's autoDestroy config.
    * @returns Ext.Component[] Array of the removed components
    */
  var removeAll: js.UndefOr[js.Function1[/* autoDestroy */ js.UndefOr[Boolean], Array]] = js.native
  /** [Config Option] (Boolean) */
  var suspendLayout: js.UndefOr[Boolean] = js.native
}

object IAbstractContainer {
  @scala.inline
  def apply(): IAbstractContainer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAbstractContainer]
  }
  @scala.inline
  implicit class IAbstractContainerOps[Self <: IAbstractContainer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setActiveItem(value: js.Any): Self = this.set("activeItem", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActiveItem: Self = this.set("activeItem", js.undefined)
    @scala.inline
    def setAdd(value: /* component */ js.UndefOr[js.Any] => _): Self = this.set("add", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAdd: Self = this.set("add", js.undefined)
    @scala.inline
    def setAfterLayout(value: /* layout */ js.UndefOr[typings.extjs.Ext.layout.container.IContainer] => Unit): Self = this.set("afterLayout", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAfterLayout: Self = this.set("afterLayout", js.undefined)
    @scala.inline
    def setAutoDestroy(value: Boolean): Self = this.set("autoDestroy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoDestroy: Self = this.set("autoDestroy", js.undefined)
    @scala.inline
    def setBubbleEvents(value: Array): Self = this.set("bubbleEvents", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBubbleEvents: Self = this.set("bubbleEvents", js.undefined)
    @scala.inline
    def setCascade(
      value: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* args */ js.UndefOr[Array]) => typings.extjs.Ext.IContainer
    ): Self = this.set("cascade", js.Any.fromFunction3(value))
    @scala.inline
    def deleteCascade: Self = this.set("cascade", js.undefined)
    @scala.inline
    def setChild(value: js.UndefOr[js.Any] => _): Self = this.set("child", js.Any.fromFunction1(value))
    @scala.inline
    def deleteChild: Self = this.set("child", js.undefined)
    @scala.inline
    def setContains(value: (/* comp */ js.UndefOr[IComponent], /* deep */ js.UndefOr[Boolean]) => Boolean): Self = this.set("contains", js.Any.fromFunction2(value))
    @scala.inline
    def deleteContains: Self = this.set("contains", js.undefined)
    @scala.inline
    def setDefaultType(value: String): Self = this.set("defaultType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultType: Self = this.set("defaultType", js.undefined)
    @scala.inline
    def setDefaults(value: js.Any): Self = this.set("defaults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaults: Self = this.set("defaults", js.undefined)
    @scala.inline
    def setDetachOnRemove(value: Boolean): Self = this.set("detachOnRemove", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetachOnRemove: Self = this.set("detachOnRemove", js.undefined)
    @scala.inline
    def setDisable(value: () => IAbstractContainer): Self = this.set("disable", js.Any.fromFunction0(value))
    @scala.inline
    def deleteDisable: Self = this.set("disable", js.undefined)
    @scala.inline
    def setDoLayout(value: () => IContainer): Self = this.set("doLayout", js.Any.fromFunction0(value))
    @scala.inline
    def deleteDoLayout: Self = this.set("doLayout", js.undefined)
    @scala.inline
    def setDown(value: js.UndefOr[js.Any] => _): Self = this.set("down", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDown: Self = this.set("down", js.undefined)
    @scala.inline
    def setGetComponent(value: /* comp */ js.UndefOr[js.Any] => IComponent): Self = this.set("getComponent", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetComponent: Self = this.set("getComponent", js.undefined)
    @scala.inline
    def setGetLayout(value: () => typings.extjs.Ext.layout.container.IContainer): Self = this.set("getLayout", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetLayout: Self = this.set("getLayout", js.undefined)
    @scala.inline
    def setGetRefItems(value: /* deep */ js.UndefOr[js.Any] => Unit): Self = this.set("getRefItems", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetRefItems: Self = this.set("getRefItems", js.undefined)
    @scala.inline
    def setInsert(value: (/* index */ js.UndefOr[Double], /* component */ js.UndefOr[js.Any]) => IComponent): Self = this.set("insert", js.Any.fromFunction2(value))
    @scala.inline
    def deleteInsert: Self = this.set("insert", js.undefined)
    @scala.inline
    def setIsAncestor(value: /* possibleDescendant */ js.UndefOr[IComponent] => Unit): Self = this.set("isAncestor", js.Any.fromFunction1(value))
    @scala.inline
    def deleteIsAncestor: Self = this.set("isAncestor", js.undefined)
    @scala.inline
    def setItems(value: js.Any): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setLayout(value: js.Any): Self = this.set("layout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayout: Self = this.set("layout", js.undefined)
    @scala.inline
    def setMove(value: (/* fromIdx */ js.UndefOr[js.Any], /* toIdx */ js.UndefOr[Double]) => IComponent): Self = this.set("move", js.Any.fromFunction2(value))
    @scala.inline
    def deleteMove: Self = this.set("move", js.undefined)
    @scala.inline
    def setOnAdd(value: (/* component */ js.UndefOr[IComponent], /* position */ js.UndefOr[Double]) => Unit): Self = this.set("onAdd", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnAdd: Self = this.set("onAdd", js.undefined)
    @scala.inline
    def setOnBeforeAdd(value: /* item */ js.UndefOr[IComponent] => Unit): Self = this.set("onBeforeAdd", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnBeforeAdd: Self = this.set("onBeforeAdd", js.undefined)
    @scala.inline
    def setOnPosition(value: () => Unit): Self = this.set("onPosition", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnPosition: Self = this.set("onPosition", js.undefined)
    @scala.inline
    def setOnRemove(value: (/* component */ js.UndefOr[IComponent], /* autoDestroy */ js.UndefOr[Boolean]) => Unit): Self = this.set("onRemove", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnRemove: Self = this.set("onRemove", js.undefined)
    @scala.inline
    def setOnResize(value: () => Unit): Self = this.set("onResize", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnResize: Self = this.set("onResize", js.undefined)
    @scala.inline
    def setQuery(value: js.UndefOr[String] => Array): Self = this.set("query", js.Any.fromFunction1(value))
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
    @scala.inline
    def setQueryBy(value: (js.UndefOr[js.Any], js.UndefOr[js.Any]) => Array): Self = this.set("queryBy", js.Any.fromFunction2(value))
    @scala.inline
    def deleteQueryBy: Self = this.set("queryBy", js.undefined)
    @scala.inline
    def setQueryById(value: js.UndefOr[String] => IComponent): Self = this.set("queryById", js.Any.fromFunction1(value))
    @scala.inline
    def deleteQueryById: Self = this.set("queryById", js.undefined)
    @scala.inline
    def setRemove(value: (/* component */ js.UndefOr[js.Any], /* autoDestroy */ js.UndefOr[Boolean]) => IComponent): Self = this.set("remove", js.Any.fromFunction2(value))
    @scala.inline
    def deleteRemove: Self = this.set("remove", js.undefined)
    @scala.inline
    def setRemoveAll(value: /* autoDestroy */ js.UndefOr[Boolean] => Array): Self = this.set("removeAll", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRemoveAll: Self = this.set("removeAll", js.undefined)
    @scala.inline
    def setSuspendLayout(value: Boolean): Self = this.set("suspendLayout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuspendLayout: Self = this.set("suspendLayout", js.undefined)
  }
  
}

