package typings.extjs.Ext

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object container {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.extjs.Ext.IClass because Already inherited
  - typings.extjs.Ext.IBase because Already inherited
  - typings.extjs.Ext.IQueryable because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined child, down, query, queryBy, queryById */ trait IAbstractContainer
    extends StObject
       with IComponent {
    
    /** [Config Option] (String/Number) */
    var activeItem: js.UndefOr[js.Any] = js.undefined
    
    /** [Method] Adds Component s to this Container
      * @param component Ext.Component[]|Object[]/Ext.Component.../Object... Either one or more Components to add or an Array of Components to add. See items for additional information.
      * @returns Ext.Component[]/Ext.Component The Components that were added.
      */
    var add: js.UndefOr[js.Function1[/* component */ js.UndefOr[js.Any], js.Any]] = js.undefined
    
    /** [Method] Invoked after the Container has laid out and rendered if necessary its child Components
      * @param layout Ext.layout.container.Container
      */
    var afterLayout: js.UndefOr[
        js.Function1[/* layout */ js.UndefOr[typings.extjs.Ext.layout.container.IContainer], Unit]
      ] = js.undefined
    
    /** [Config Option] (Boolean) */
    var autoDestroy: js.UndefOr[Boolean] = js.undefined
    
    /** [Config Option] (String[]) */
    var bubbleEvents: js.UndefOr[Array] = js.undefined
    
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
      ] = js.undefined
    
    /** [Method] Retrieves the first direct child of this container which matches the passed selector or component
      * @param selector String/Ext.Component An Ext.ComponentQuery selector. If no selector is specified, the first child will be returned.
      * @returns Object Ext.Component The matching child Ext.Component (or null if no match was found).
      */
    var child: js.UndefOr[js.Function1[js.UndefOr[js.Any], js.Any]] = js.undefined
    
    /** [Method] Determines whether the passed Component is either an immediate child of this Container or whether it is a descendant
      * @param comp Ext.Component The Component to test.
      * @param deep Boolean Pass true to test for the Component being a descendant at any level.
      * @returns Boolean true if the passed Component is contained at the specified level.
      */
    var contains: js.UndefOr[
        js.Function2[/* comp */ js.UndefOr[IComponent], /* deep */ js.UndefOr[Boolean], Boolean]
      ] = js.undefined
    
    /** [Config Option] (String) */
    var defaultType: js.UndefOr[java.lang.String] = js.undefined
    
    /** [Config Option] (Object/Function) */
    var defaults: js.UndefOr[js.Any] = js.undefined
    
    /** [Config Option] (Boolean) */
    var detachOnRemove: js.UndefOr[Boolean] = js.undefined
    
    /** [Method] Inherit docs Disable all immediate children that was previously disabled Override disable because onDisable only gets
      * @returns Ext.container.AbstractContainer this
      */
    @JSName("disable")
    var disable_IAbstractContainer: js.UndefOr[js.Function0[this.type]] = js.undefined
    
    /** [Method] Manually force this container s layout to be recalculated
      * @returns Ext.container.Container this
      */
    var doLayout: js.UndefOr[js.Function0[typings.extjs.Ext.container.IContainer]] = js.undefined
    
    /** [Method] Retrieves the first descendant of this container which matches the passed selector
      * @param selector String/Ext.Component An Ext.ComponentQuery selector or Ext.Component. If no selector is specified, the first child will be returned.
      * @returns Object Ext.Component The matching descendant Ext.Component (or null if no match was found).
      */
    var down: js.UndefOr[js.Function1[js.UndefOr[js.Any], js.Any]] = js.undefined
    
    /** [Method] Examines this container s items property and gets a direct child component of this container
      * @param comp String/Number This parameter may be any of the following:  a String : representing the itemId or id of the child component. a Number : representing the position of the child component within the items property For additional information see Ext.util.MixedCollection.get.
      * @returns Ext.Component The component (if found).
      */
    var getComponent: js.UndefOr[js.Function1[/* comp */ js.UndefOr[js.Any], IComponent]] = js.undefined
    
    /** [Method] Returns the layout instance currently associated with this Container
      * @returns Ext.layout.container.Container The layout
      */
    var getLayout: js.UndefOr[js.Function0[typings.extjs.Ext.layout.container.IContainer]] = js.undefined
    
    /** [Method] Used by ComponentQuery child and down to retrieve all of the items which can potentially be considered a child of th
      * @param deep Object
      */
    var getRefItems: js.UndefOr[js.Function1[/* deep */ js.UndefOr[js.Any], Unit]] = js.undefined
    
    /** [Method] Inserts a Component into this Container at a specified index
      * @param index Number The index at which the Component will be inserted into the Container's items collection
      * @param component Ext.Component/Object The child Component to insert. Ext uses lazy rendering, and will only render the inserted Component should it become necessary. A Component config object may be passed in order to avoid the overhead of constructing a real Component object if lazy rendering might mean that the inserted Component will not be rendered immediately. To take advantage of this 'lazy instantiation', set the Ext.Component.xtype config property to the registered type of the Component wanted. For a list of all available xtypes, see Ext.enums.Widget.
      * @returns Ext.Component component The Component (or config object) that was inserted with the Container's default config values applied.
      */
    var insert: js.UndefOr[
        js.Function2[/* index */ js.UndefOr[Double], /* component */ js.UndefOr[js.Any], IComponent]
      ] = js.undefined
    
    /** [Method] Determines whether this Container is an ancestor of the passed Component
      * @param possibleDescendant Ext.Component The Component to test for presence within this Container's subtree.
      */
    var isAncestor: js.UndefOr[js.Function1[/* possibleDescendant */ js.UndefOr[IComponent], Unit]] = js.undefined
    
    /** [Config Option] (Object/Object[]) */
    var items: js.UndefOr[js.Any] = js.undefined
    
    /** [Config Option] (Ext.enums.Layout/Object) */
    var layout: js.UndefOr[js.Any] = js.undefined
    
    /** [Method] Moves a Component within the Container
      * @param fromIdx Number/Ext.Component The index/component to move.
      * @param toIdx Number The new index for the Component.
      * @returns Ext.Component component The Component that was moved.
      */
    @JSName("move")
    var move_IAbstractContainer: js.UndefOr[
        js.Function2[/* fromIdx */ js.UndefOr[js.Any], /* toIdx */ js.UndefOr[Double], IComponent]
      ] = js.undefined
    
    /** [Method] This method is invoked after a new Component has been added
      * @param component Ext.Component
      * @param position Number
      */
    var onAdd: js.UndefOr[
        js.Function2[/* component */ js.UndefOr[IComponent], /* position */ js.UndefOr[Double], Unit]
      ] = js.undefined
    
    /** [Method] This method is invoked before adding a new child Component
      * @param item Ext.Component
      */
    var onBeforeAdd: js.UndefOr[js.Function1[/* item */ js.UndefOr[IComponent], Unit]] = js.undefined
    
    /** [Method] Called after the component is moved this method is empty by default but can be implemented by any subclass that need  */
    @JSName("onPosition")
    var onPosition_IAbstractContainer: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** [Method] This method is invoked after a new Component has been removed
      * @param component Ext.Component
      * @param autoDestroy Boolean
      */
    var onRemove: js.UndefOr[
        js.Function2[/* component */ js.UndefOr[IComponent], /* autoDestroy */ js.UndefOr[Boolean], Unit]
      ] = js.undefined
    
    /** [Method] Allows addition of behavior to the resize operation  */
    @JSName("onResize")
    var onResize_IAbstractContainer: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** [Method] Retrieves all descendant components which match the passed selector
      * @param selector String Selector complying to an Ext.ComponentQuery selector. If no selector is specified all items will be returned.
      * @returns Ext.Component[] Components which matched the selector
      */
    var query: js.UndefOr[js.Function1[js.UndefOr[java.lang.String], Array]] = js.undefined
    
    /** [Method] Retrieves all descendant components which match the passed function
      * @param fn Function The matcher function. It will be called with a single argument, the component being tested.
      * @param scope Object The scope in which to run the function. If not specified, it will default to the active component.
      * @returns Ext.Component[] Components matched by the passed function
      */
    var queryBy: js.UndefOr[js.Function2[js.UndefOr[js.Any], js.UndefOr[js.Any], Array]] = js.undefined
    
    /** [Method] Finds a component at any level under this container matching the id itemId
      * @param id String The id to find
      * @returns Ext.Component The matching id, null if not found
      */
    var queryById: js.UndefOr[js.Function1[js.UndefOr[java.lang.String], IComponent]] = js.undefined
    
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
      ] = js.undefined
    
    /** [Method] Removes all components from this container
      * @param autoDestroy Boolean True to automatically invoke the removed Component's Ext.Component.destroy function. Defaults to the value of this Container's autoDestroy config.
      * @returns Ext.Component[] Array of the removed components
      */
    var removeAll: js.UndefOr[js.Function1[/* autoDestroy */ js.UndefOr[Boolean], Array]] = js.undefined
    
    /** [Config Option] (Boolean) */
    var suspendLayout: js.UndefOr[Boolean] = js.undefined
  }
  object IAbstractContainer {
    
    inline def apply(): IAbstractContainer = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IAbstractContainer]
    }
    
    extension [Self <: IAbstractContainer](x: Self) {
      
      inline def setActiveItem(value: js.Any): Self = StObject.set(x, "activeItem", value.asInstanceOf[js.Any])
      
      inline def setActiveItemUndefined: Self = StObject.set(x, "activeItem", js.undefined)
      
      inline def setAdd(value: /* component */ js.UndefOr[js.Any] => js.Any): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
      
      inline def setAddUndefined: Self = StObject.set(x, "add", js.undefined)
      
      inline def setAfterLayout(value: /* layout */ js.UndefOr[typings.extjs.Ext.layout.container.IContainer] => Unit): Self = StObject.set(x, "afterLayout", js.Any.fromFunction1(value))
      
      inline def setAfterLayoutUndefined: Self = StObject.set(x, "afterLayout", js.undefined)
      
      inline def setAutoDestroy(value: Boolean): Self = StObject.set(x, "autoDestroy", value.asInstanceOf[js.Any])
      
      inline def setAutoDestroyUndefined: Self = StObject.set(x, "autoDestroy", js.undefined)
      
      inline def setBubbleEvents(value: Array): Self = StObject.set(x, "bubbleEvents", value.asInstanceOf[js.Any])
      
      inline def setBubbleEventsUndefined: Self = StObject.set(x, "bubbleEvents", js.undefined)
      
      inline def setCascade(
        value: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* args */ js.UndefOr[Array]) => typings.extjs.Ext.IContainer
      ): Self = StObject.set(x, "cascade", js.Any.fromFunction3(value))
      
      inline def setCascadeUndefined: Self = StObject.set(x, "cascade", js.undefined)
      
      inline def setChild(value: js.UndefOr[js.Any] => js.Any): Self = StObject.set(x, "child", js.Any.fromFunction1(value))
      
      inline def setChildUndefined: Self = StObject.set(x, "child", js.undefined)
      
      inline def setContains(value: (/* comp */ js.UndefOr[IComponent], /* deep */ js.UndefOr[Boolean]) => Boolean): Self = StObject.set(x, "contains", js.Any.fromFunction2(value))
      
      inline def setContainsUndefined: Self = StObject.set(x, "contains", js.undefined)
      
      inline def setDefaultType(value: java.lang.String): Self = StObject.set(x, "defaultType", value.asInstanceOf[js.Any])
      
      inline def setDefaultTypeUndefined: Self = StObject.set(x, "defaultType", js.undefined)
      
      inline def setDefaults(value: js.Any): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
      
      inline def setDefaultsUndefined: Self = StObject.set(x, "defaults", js.undefined)
      
      inline def setDetachOnRemove(value: Boolean): Self = StObject.set(x, "detachOnRemove", value.asInstanceOf[js.Any])
      
      inline def setDetachOnRemoveUndefined: Self = StObject.set(x, "detachOnRemove", js.undefined)
      
      inline def setDisable(value: () => IAbstractContainer): Self = StObject.set(x, "disable", js.Any.fromFunction0(value))
      
      inline def setDisableUndefined: Self = StObject.set(x, "disable", js.undefined)
      
      inline def setDoLayout(value: () => typings.extjs.Ext.container.IContainer): Self = StObject.set(x, "doLayout", js.Any.fromFunction0(value))
      
      inline def setDoLayoutUndefined: Self = StObject.set(x, "doLayout", js.undefined)
      
      inline def setDown(value: js.UndefOr[js.Any] => js.Any): Self = StObject.set(x, "down", js.Any.fromFunction1(value))
      
      inline def setDownUndefined: Self = StObject.set(x, "down", js.undefined)
      
      inline def setGetComponent(value: /* comp */ js.UndefOr[js.Any] => IComponent): Self = StObject.set(x, "getComponent", js.Any.fromFunction1(value))
      
      inline def setGetComponentUndefined: Self = StObject.set(x, "getComponent", js.undefined)
      
      inline def setGetLayout(value: () => typings.extjs.Ext.layout.container.IContainer): Self = StObject.set(x, "getLayout", js.Any.fromFunction0(value))
      
      inline def setGetLayoutUndefined: Self = StObject.set(x, "getLayout", js.undefined)
      
      inline def setGetRefItems(value: /* deep */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "getRefItems", js.Any.fromFunction1(value))
      
      inline def setGetRefItemsUndefined: Self = StObject.set(x, "getRefItems", js.undefined)
      
      inline def setInsert(value: (/* index */ js.UndefOr[Double], /* component */ js.UndefOr[js.Any]) => IComponent): Self = StObject.set(x, "insert", js.Any.fromFunction2(value))
      
      inline def setInsertUndefined: Self = StObject.set(x, "insert", js.undefined)
      
      inline def setIsAncestor(value: /* possibleDescendant */ js.UndefOr[IComponent] => Unit): Self = StObject.set(x, "isAncestor", js.Any.fromFunction1(value))
      
      inline def setIsAncestorUndefined: Self = StObject.set(x, "isAncestor", js.undefined)
      
      inline def setItems(value: js.Any): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setLayout(value: js.Any): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
      
      inline def setMove(value: (/* fromIdx */ js.UndefOr[js.Any], /* toIdx */ js.UndefOr[Double]) => IComponent): Self = StObject.set(x, "move", js.Any.fromFunction2(value))
      
      inline def setMoveUndefined: Self = StObject.set(x, "move", js.undefined)
      
      inline def setOnAdd(value: (/* component */ js.UndefOr[IComponent], /* position */ js.UndefOr[Double]) => Unit): Self = StObject.set(x, "onAdd", js.Any.fromFunction2(value))
      
      inline def setOnAddUndefined: Self = StObject.set(x, "onAdd", js.undefined)
      
      inline def setOnBeforeAdd(value: /* item */ js.UndefOr[IComponent] => Unit): Self = StObject.set(x, "onBeforeAdd", js.Any.fromFunction1(value))
      
      inline def setOnBeforeAddUndefined: Self = StObject.set(x, "onBeforeAdd", js.undefined)
      
      inline def setOnPosition(value: () => Unit): Self = StObject.set(x, "onPosition", js.Any.fromFunction0(value))
      
      inline def setOnPositionUndefined: Self = StObject.set(x, "onPosition", js.undefined)
      
      inline def setOnRemove(value: (/* component */ js.UndefOr[IComponent], /* autoDestroy */ js.UndefOr[Boolean]) => Unit): Self = StObject.set(x, "onRemove", js.Any.fromFunction2(value))
      
      inline def setOnRemoveUndefined: Self = StObject.set(x, "onRemove", js.undefined)
      
      inline def setOnResize(value: () => Unit): Self = StObject.set(x, "onResize", js.Any.fromFunction0(value))
      
      inline def setOnResizeUndefined: Self = StObject.set(x, "onResize", js.undefined)
      
      inline def setQuery(value: js.UndefOr[java.lang.String] => Array): Self = StObject.set(x, "query", js.Any.fromFunction1(value))
      
      inline def setQueryBy(value: (js.UndefOr[js.Any], js.UndefOr[js.Any]) => Array): Self = StObject.set(x, "queryBy", js.Any.fromFunction2(value))
      
      inline def setQueryById(value: js.UndefOr[java.lang.String] => IComponent): Self = StObject.set(x, "queryById", js.Any.fromFunction1(value))
      
      inline def setQueryByIdUndefined: Self = StObject.set(x, "queryById", js.undefined)
      
      inline def setQueryByUndefined: Self = StObject.set(x, "queryBy", js.undefined)
      
      inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      inline def setRemove(value: (/* component */ js.UndefOr[js.Any], /* autoDestroy */ js.UndefOr[Boolean]) => IComponent): Self = StObject.set(x, "remove", js.Any.fromFunction2(value))
      
      inline def setRemoveAll(value: /* autoDestroy */ js.UndefOr[Boolean] => Array): Self = StObject.set(x, "removeAll", js.Any.fromFunction1(value))
      
      inline def setRemoveAllUndefined: Self = StObject.set(x, "removeAll", js.undefined)
      
      inline def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
      
      inline def setSuspendLayout(value: Boolean): Self = StObject.set(x, "suspendLayout", value.asInstanceOf[js.Any])
      
      inline def setSuspendLayoutUndefined: Self = StObject.set(x, "suspendLayout", js.undefined)
    }
  }
  
  trait IButtonGroup
    extends StObject
       with typings.extjs.Ext.panel.IPanel {
    
    /** [Config Option] (Number) */
    var columns: js.UndefOr[Double] = js.undefined
    
    /** [Config Option] (String) */
    var defaultButtonUI: js.UndefOr[java.lang.String] = js.undefined
    
    /** [Method] private
      * @param component Object
      */
    @JSName("onBeforeAdd")
    var onBeforeAdd_IButtonGroup: js.UndefOr[js.Function1[/* component */ js.UndefOr[js.Any], Unit]] = js.undefined
  }
  object IButtonGroup {
    
    inline def apply(): typings.extjs.Ext.container.IButtonGroup = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.extjs.Ext.container.IButtonGroup]
    }
    
    extension [Self <: typings.extjs.Ext.container.IButtonGroup](x: Self) {
      
      inline def setColumns(value: Double): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      inline def setDefaultButtonUI(value: java.lang.String): Self = StObject.set(x, "defaultButtonUI", value.asInstanceOf[js.Any])
      
      inline def setDefaultButtonUIUndefined: Self = StObject.set(x, "defaultButtonUI", js.undefined)
      
      inline def setOnBeforeAdd(value: /* component */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "onBeforeAdd", js.Any.fromFunction1(value))
      
      inline def setOnBeforeAddUndefined: Self = StObject.set(x, "onBeforeAdd", js.undefined)
    }
  }
  
  trait IContainer
    extends StObject
       with IAbstractContainer {
    
    /** [Config Option] (Number/Object) */
    var anchorSize: js.UndefOr[js.Any] = js.undefined
    
    /** [Method] Return the immediate child Component in which the passed element is located
      * @param el Ext.Element/HTMLElement/String The element to test (or ID of element).
      * @param deep Boolean If true, returns the deepest descendant Component which contains the passed element.
      * @returns Ext.Component The child item which contains the passed element.
      */
    var getChildByElement: js.UndefOr[
        js.Function2[/* el */ js.UndefOr[js.Any], /* deep */ js.UndefOr[Boolean], IComponent]
      ] = js.undefined
  }
  object IContainer {
    
    inline def apply(): typings.extjs.Ext.container.IContainer = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.extjs.Ext.container.IContainer]
    }
    
    extension [Self <: typings.extjs.Ext.container.IContainer](x: Self) {
      
      inline def setAnchorSize(value: js.Any): Self = StObject.set(x, "anchorSize", value.asInstanceOf[js.Any])
      
      inline def setAnchorSizeUndefined: Self = StObject.set(x, "anchorSize", js.undefined)
      
      inline def setGetChildByElement(value: (/* el */ js.UndefOr[js.Any], /* deep */ js.UndefOr[Boolean]) => IComponent): Self = StObject.set(x, "getChildByElement", js.Any.fromFunction2(value))
      
      inline def setGetChildByElementUndefined: Self = StObject.set(x, "getChildByElement", js.undefined)
    }
  }
  
  trait IDockingContainer
    extends StObject
       with IBase {
    
    /** [Method] Adds docked item s to the container
      * @param component Object/Object[] The Component or array of components to add. The components must include a 'dock' parameter on each component to indicate where it should be docked ('top', 'right', 'bottom', 'left').
      * @param pos Number The index at which the Component will be added
      * @returns Ext.Component[] The added components.
      */
    var addDocked: js.UndefOr[
        js.Function2[/* component */ js.UndefOr[js.Any], /* pos */ js.UndefOr[Double], Array]
      ] = js.undefined
    
    /** [Config Option] (Object) */
    var defaultDockWeights: js.UndefOr[js.Any] = js.undefined
    
    /** [Method] Finds a docked component by id itemId or position
      * @param comp String/Number The id, itemId or position of the docked component (see getComponent for details)
      * @returns Ext.Component The docked component (if found)
      */
    var getDockedComponent: js.UndefOr[js.Function1[/* comp */ js.UndefOr[js.Any], IComponent]] = js.undefined
    
    /** [Method] Retrieves an array of all currently docked Components
      * @param selector String A ComponentQuery selector string to filter the returned items.
      * @param beforeBody Boolean An optional flag to limit the set of items to only those before the body (true) or after the body (false). All components are returned by default.
      * @returns Ext.Component[] The array of docked components meeting the specified criteria.
      */
    var getDockedItems: js.UndefOr[
        js.Function2[
          /* selector */ js.UndefOr[java.lang.String], 
          /* beforeBody */ js.UndefOr[Boolean], 
          Array
        ]
      ] = js.undefined
    
    /** [Method] Inserts docked item s to the panel at the indicated position
      * @param pos Number The index at which the Component will be inserted
      * @param component Object/Object[] The Component or array of components to add. The components must include a 'dock' paramater on each component to indicate where it should be docked ('top', 'right', 'bottom', 'left').
      */
    var insertDocked: js.UndefOr[
        js.Function2[/* pos */ js.UndefOr[Double], /* component */ js.UndefOr[js.Any], Unit]
      ] = js.undefined
    
    /** [Method] Invoked after a docked item is added to the Panel
      * @param component Ext.Component
      */
    var onDockedAdd: js.UndefOr[js.Function1[/* component */ js.UndefOr[IComponent], Unit]] = js.undefined
    
    /** [Method] Invoked after a docked item is removed from the Panel
      * @param component Ext.Component
      */
    var onDockedRemove: js.UndefOr[js.Function1[/* component */ js.UndefOr[IComponent], Unit]] = js.undefined
    
    /** [Method] Removes the docked item from the panel
      * @param item Ext.Component The Component to remove.
      * @param autoDestroy Boolean Destroy the component after removal.
      */
    var removeDocked: js.UndefOr[
        js.Function2[/* item */ js.UndefOr[IComponent], /* autoDestroy */ js.UndefOr[Boolean], Unit]
      ] = js.undefined
  }
  object IDockingContainer {
    
    inline def apply(): IDockingContainer = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDockingContainer]
    }
    
    extension [Self <: IDockingContainer](x: Self) {
      
      inline def setAddDocked(value: (/* component */ js.UndefOr[js.Any], /* pos */ js.UndefOr[Double]) => Array): Self = StObject.set(x, "addDocked", js.Any.fromFunction2(value))
      
      inline def setAddDockedUndefined: Self = StObject.set(x, "addDocked", js.undefined)
      
      inline def setDefaultDockWeights(value: js.Any): Self = StObject.set(x, "defaultDockWeights", value.asInstanceOf[js.Any])
      
      inline def setDefaultDockWeightsUndefined: Self = StObject.set(x, "defaultDockWeights", js.undefined)
      
      inline def setGetDockedComponent(value: /* comp */ js.UndefOr[js.Any] => IComponent): Self = StObject.set(x, "getDockedComponent", js.Any.fromFunction1(value))
      
      inline def setGetDockedComponentUndefined: Self = StObject.set(x, "getDockedComponent", js.undefined)
      
      inline def setGetDockedItems(
        value: (/* selector */ js.UndefOr[java.lang.String], /* beforeBody */ js.UndefOr[Boolean]) => Array
      ): Self = StObject.set(x, "getDockedItems", js.Any.fromFunction2(value))
      
      inline def setGetDockedItemsUndefined: Self = StObject.set(x, "getDockedItems", js.undefined)
      
      inline def setInsertDocked(value: (/* pos */ js.UndefOr[Double], /* component */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "insertDocked", js.Any.fromFunction2(value))
      
      inline def setInsertDockedUndefined: Self = StObject.set(x, "insertDocked", js.undefined)
      
      inline def setOnDockedAdd(value: /* component */ js.UndefOr[IComponent] => Unit): Self = StObject.set(x, "onDockedAdd", js.Any.fromFunction1(value))
      
      inline def setOnDockedAddUndefined: Self = StObject.set(x, "onDockedAdd", js.undefined)
      
      inline def setOnDockedRemove(value: /* component */ js.UndefOr[IComponent] => Unit): Self = StObject.set(x, "onDockedRemove", js.Any.fromFunction1(value))
      
      inline def setOnDockedRemoveUndefined: Self = StObject.set(x, "onDockedRemove", js.undefined)
      
      inline def setRemoveDocked(value: (/* item */ js.UndefOr[IComponent], /* autoDestroy */ js.UndefOr[Boolean]) => Unit): Self = StObject.set(x, "removeDocked", js.Any.fromFunction2(value))
      
      inline def setRemoveDockedUndefined: Self = StObject.set(x, "removeDocked", js.undefined)
    }
  }
  
  type IMonitor = IBase
  
  trait IViewport
    extends StObject
       with typings.extjs.Ext.container.IContainer {
    
    /** [Property] (Boolean) */
    var isViewport: js.UndefOr[Boolean] = js.undefined
    
    /** [Method] Template method called when this Component s DOM structure is created  */
    @JSName("onRender")
    var onRender_IViewport: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object IViewport {
    
    inline def apply(): typings.extjs.Ext.container.IViewport = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.extjs.Ext.container.IViewport]
    }
    
    extension [Self <: typings.extjs.Ext.container.IViewport](x: Self) {
      
      inline def setIsViewport(value: Boolean): Self = StObject.set(x, "isViewport", value.asInstanceOf[js.Any])
      
      inline def setIsViewportUndefined: Self = StObject.set(x, "isViewport", js.undefined)
      
      inline def setOnRender(value: () => Unit): Self = StObject.set(x, "onRender", js.Any.fromFunction0(value))
      
      inline def setOnRenderUndefined: Self = StObject.set(x, "onRender", js.undefined)
    }
  }
}
