package typings
package extjsLib.ExtNs.containerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- extjsLib.ExtNs.IQueryable because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined child, down, query, queryBy, queryById */ trait IAbstractContainer
  extends extjsLib.ExtNs.IComponent {
  /** [Config Option] (String/Number) */
  var activeItem: js.UndefOr[js.Any] = js.undefined
  /** [Method] Adds Component s to this Container
  		* @param component Ext.Component[]|Object[]/Ext.Component.../Object... Either one or more Components to add or an Array of Components to add. See items for additional information.
  		* @returns Ext.Component[]/Ext.Component The Components that were added.
  		*/
  var add: js.UndefOr[js.Function1[/* component */ js.UndefOr[js.Any], _]] = js.undefined
  /** [Method] Invoked after the Container has laid out and rendered if necessary its child Components
  		* @param layout Ext.layout.container.Container
  		*/
  var afterLayout: js.UndefOr[
    js.Function1[
      /* layout */ js.UndefOr[extjsLib.ExtNs.layoutNs.containerNs.IContainer], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Config Option] (Boolean) */
  var autoDestroy: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (String[]) */
  var bubbleEvents: js.UndefOr[extjsLib.ExtNs.Array] = js.undefined
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
      /* args */ js.UndefOr[extjsLib.ExtNs.Array], 
      extjsLib.ExtNs.IContainer
    ]
  ] = js.undefined
  /** [Method] Retrieves the first direct child of this container which matches the passed selector or component
  		* @param selector String/Ext.Component An Ext.ComponentQuery selector. If no selector is specified, the first child will be returned.
  		* @returns Object Ext.Component The matching child Ext.Component (or null if no match was found).
  		*/
  var child: js.UndefOr[js.Function1[/* selector */ js.UndefOr[js.Any], _]] = js.undefined
  /** [Method] Determines whether the passed Component is either an immediate child of this Container or whether it is a descendant
  		* @param comp Ext.Component The Component to test.
  		* @param deep Boolean Pass true to test for the Component being a descendant at any level.
  		* @returns Boolean true if the passed Component is contained at the specified level.
  		*/
  var contains: js.UndefOr[
    js.Function2[
      /* comp */ js.UndefOr[extjsLib.ExtNs.IComponent], 
      /* deep */ js.UndefOr[scala.Boolean], 
      scala.Boolean
    ]
  ] = js.undefined
  /** [Config Option] (String) */
  var defaultType: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Object/Function) */
  var defaults: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var detachOnRemove: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Inherit docs Disable all immediate children that was previously disabled Override disable because onDisable only gets
  		* @returns Ext.container.AbstractContainer this
  		*/
  @JSName("disable")
  var disable_IAbstractContainer: js.UndefOr[js.Function0[this.type]] = js.undefined
  /** [Method] Manually force this container s layout to be recalculated
  		* @returns Ext.container.Container this
  		*/
  var doLayout: js.UndefOr[js.Function0[IContainer]] = js.undefined
  /** [Method] Retrieves the first descendant of this container which matches the passed selector
  		* @param selector String/Ext.Component An Ext.ComponentQuery selector or Ext.Component. If no selector is specified, the first child will be returned.
  		* @returns Object Ext.Component The matching descendant Ext.Component (or null if no match was found).
  		*/
  var down: js.UndefOr[js.Function1[/* selector */ js.UndefOr[js.Any], _]] = js.undefined
  /** [Method] Examines this container s items property and gets a direct child component of this container
  		* @param comp String/Number This parameter may be any of the following:  a String : representing the itemId or id of the child component. a Number : representing the position of the child component within the items property For additional information see Ext.util.MixedCollection.get.
  		* @returns Ext.Component The component (if found).
  		*/
  var getComponent: js.UndefOr[js.Function1[/* comp */ js.UndefOr[js.Any], extjsLib.ExtNs.IComponent]] = js.undefined
  /** [Method] Returns the layout instance currently associated with this Container
  		* @returns Ext.layout.container.Container The layout
  		*/
  var getLayout: js.UndefOr[js.Function0[extjsLib.ExtNs.layoutNs.containerNs.IContainer]] = js.undefined
  /** [Method] Used by ComponentQuery child and down to retrieve all of the items which can potentially be considered a child of th
  		* @param deep Object
  		*/
  var getRefItems: js.UndefOr[js.Function1[/* deep */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Inserts a Component into this Container at a specified index
  		* @param index Number The index at which the Component will be inserted into the Container's items collection
  		* @param component Ext.Component/Object The child Component to insert. Ext uses lazy rendering, and will only render the inserted Component should it become necessary. A Component config object may be passed in order to avoid the overhead of constructing a real Component object if lazy rendering might mean that the inserted Component will not be rendered immediately. To take advantage of this 'lazy instantiation', set the Ext.Component.xtype config property to the registered type of the Component wanted. For a list of all available xtypes, see Ext.enums.Widget.
  		* @returns Ext.Component component The Component (or config object) that was inserted with the Container's default config values applied.
  		*/
  var insert: js.UndefOr[
    js.Function2[
      /* index */ js.UndefOr[scala.Double], 
      /* component */ js.UndefOr[js.Any], 
      extjsLib.ExtNs.IComponent
    ]
  ] = js.undefined
  /** [Method] Determines whether this Container is an ancestor of the passed Component
  		* @param possibleDescendant Ext.Component The Component to test for presence within this Container's subtree.
  		*/
  var isAncestor: js.UndefOr[
    js.Function1[/* possibleDescendant */ js.UndefOr[extjsLib.ExtNs.IComponent], scala.Unit]
  ] = js.undefined
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
    js.Function2[
      /* fromIdx */ js.UndefOr[js.Any], 
      /* toIdx */ js.UndefOr[scala.Double], 
      extjsLib.ExtNs.IComponent
    ]
  ] = js.undefined
  /** [Method] This method is invoked after a new Component has been added
  		* @param component Ext.Component
  		* @param position Number
  		*/
  var onAdd: js.UndefOr[
    js.Function2[
      /* component */ js.UndefOr[extjsLib.ExtNs.IComponent], 
      /* position */ js.UndefOr[scala.Double], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] This method is invoked before adding a new child Component
  		* @param item Ext.Component
  		*/
  var onBeforeAdd: js.UndefOr[js.Function1[/* item */ js.UndefOr[extjsLib.ExtNs.IComponent], scala.Unit]] = js.undefined
  /** [Method] Called after the component is moved this method is empty by default but can be implemented by any subclass that need  */
  @JSName("onPosition")
  var onPosition_IAbstractContainer: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] This method is invoked after a new Component has been removed
  		* @param component Ext.Component
  		* @param autoDestroy Boolean
  		*/
  var onRemove: js.UndefOr[
    js.Function2[
      /* component */ js.UndefOr[extjsLib.ExtNs.IComponent], 
      /* autoDestroy */ js.UndefOr[scala.Boolean], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Allows addition of behavior to the resize operation  */
  @JSName("onResize")
  var onResize_IAbstractContainer: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Retrieves all descendant components which match the passed selector
  		* @param selector String Selector complying to an Ext.ComponentQuery selector. If no selector is specified all items will be returned.
  		* @returns Ext.Component[] Components which matched the selector
  		*/
  var query: js.UndefOr[js.Function1[/* selector */ js.UndefOr[java.lang.String], extjsLib.ExtNs.Array]] = js.undefined
  /** [Method] Retrieves all descendant components which match the passed function
  		* @param fn Function The matcher function. It will be called with a single argument, the component being tested.
  		* @param scope Object The scope in which to run the function. If not specified, it will default to the active component.
  		* @returns Ext.Component[] Components matched by the passed function
  		*/
  var queryBy: js.UndefOr[
    js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], extjsLib.ExtNs.Array]
  ] = js.undefined
  /** [Method] Finds a component at any level under this container matching the id itemId
  		* @param id String The id to find
  		* @returns Ext.Component The matching id, null if not found
  		*/
  var queryById: js.UndefOr[js.Function1[/* id */ js.UndefOr[java.lang.String], extjsLib.ExtNs.IComponent]] = js.undefined
  /** [Method] Removes a component from this container
  		* @param component Ext.Component/String The component reference or id to remove.
  		* @param autoDestroy Boolean True to automatically invoke the removed Component's Ext.Component.destroy function. Defaults to the value of this Container's autoDestroy config.
  		* @returns Ext.Component component The Component that was removed.
  		*/
  var remove: js.UndefOr[
    js.Function2[
      /* component */ js.UndefOr[js.Any], 
      /* autoDestroy */ js.UndefOr[scala.Boolean], 
      extjsLib.ExtNs.IComponent
    ]
  ] = js.undefined
  /** [Method] Removes all components from this container
  		* @param autoDestroy Boolean True to automatically invoke the removed Component's Ext.Component.destroy function. Defaults to the value of this Container's autoDestroy config.
  		* @returns Ext.Component[] Array of the removed components
  		*/
  var removeAll: js.UndefOr[js.Function1[/* autoDestroy */ js.UndefOr[scala.Boolean], extjsLib.ExtNs.Array]] = js.undefined
  /** [Config Option] (Boolean) */
  var suspendLayout: js.UndefOr[scala.Boolean] = js.undefined
}

