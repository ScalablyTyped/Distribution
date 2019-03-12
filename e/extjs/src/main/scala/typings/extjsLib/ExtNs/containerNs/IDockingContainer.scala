package typings
package extjsLib.ExtNs.containerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDockingContainer
  extends extjsLib.ExtNs.IBase {
  /** [Method] Adds docked item s to the container
  		* @param component Object/Object[] The Component or array of components to add. The components must include a 'dock' parameter on each component to indicate where it should be docked ('top', 'right', 'bottom', 'left').
  		* @param pos Number The index at which the Component will be added
  		* @returns Ext.Component[] The added components.
  		*/
  var addDocked: js.UndefOr[
    js.Function2[
      /* component */ js.UndefOr[js.Any], 
      /* pos */ js.UndefOr[scala.Double], 
      extjsLib.ExtNs.Array
    ]
  ] = js.undefined
  /** [Config Option] (Object) */
  var defaultDockWeights: js.UndefOr[js.Any] = js.undefined
  /** [Method] Finds a docked component by id itemId or position
  		* @param comp String/Number The id, itemId or position of the docked component (see getComponent for details)
  		* @returns Ext.Component The docked component (if found)
  		*/
  var getDockedComponent: js.UndefOr[js.Function1[/* comp */ js.UndefOr[js.Any], extjsLib.ExtNs.IComponent]] = js.undefined
  /** [Method] Retrieves an array of all currently docked Components
  		* @param selector String A ComponentQuery selector string to filter the returned items.
  		* @param beforeBody Boolean An optional flag to limit the set of items to only those before the body (true) or after the body (false). All components are returned by default.
  		* @returns Ext.Component[] The array of docked components meeting the specified criteria.
  		*/
  var getDockedItems: js.UndefOr[
    js.Function2[
      /* selector */ js.UndefOr[java.lang.String], 
      /* beforeBody */ js.UndefOr[scala.Boolean], 
      extjsLib.ExtNs.Array
    ]
  ] = js.undefined
  /** [Method] Inserts docked item s to the panel at the indicated position
  		* @param pos Number The index at which the Component will be inserted
  		* @param component Object/Object[] The Component or array of components to add. The components must include a 'dock' paramater on each component to indicate where it should be docked ('top', 'right', 'bottom', 'left').
  		*/
  var insertDocked: js.UndefOr[
    js.Function2[/* pos */ js.UndefOr[scala.Double], /* component */ js.UndefOr[js.Any], scala.Unit]
  ] = js.undefined
  /** [Method] Invoked after a docked item is added to the Panel
  		* @param component Ext.Component
  		*/
  var onDockedAdd: js.UndefOr[js.Function1[/* component */ js.UndefOr[extjsLib.ExtNs.IComponent], scala.Unit]] = js.undefined
  /** [Method] Invoked after a docked item is removed from the Panel
  		* @param component Ext.Component
  		*/
  var onDockedRemove: js.UndefOr[js.Function1[/* component */ js.UndefOr[extjsLib.ExtNs.IComponent], scala.Unit]] = js.undefined
  /** [Method] Removes the docked item from the panel
  		* @param item Ext.Component The Component to remove.
  		* @param autoDestroy Boolean Destroy the component after removal.
  		*/
  var removeDocked: js.UndefOr[
    js.Function2[
      /* item */ js.UndefOr[extjsLib.ExtNs.IComponent], 
      /* autoDestroy */ js.UndefOr[scala.Boolean], 
      scala.Unit
    ]
  ] = js.undefined
}

object IDockingContainer {
  @scala.inline
  def apply(
    addDocked: (/* component */ js.UndefOr[js.Any], /* pos */ js.UndefOr[scala.Double]) => extjsLib.ExtNs.Array = null,
    alias: extjsLib.ExtNs.Array = null,
    alternateClassName: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    config: js.Any = null,
    defaultDockWeights: js.Any = null,
    extend: java.lang.String = null,
    getDockedComponent: /* comp */ js.UndefOr[js.Any] => extjsLib.ExtNs.IComponent = null,
    getDockedItems: (/* selector */ js.UndefOr[java.lang.String], /* beforeBody */ js.UndefOr[scala.Boolean]) => extjsLib.ExtNs.Array = null,
    getInitialConfig: /* name */ js.UndefOr[java.lang.String] => _ = null,
    inheritableStatics: js.Any = null,
    initConfig: /* config */ js.UndefOr[js.Any] => IDockingContainer = null,
    insertDocked: (/* pos */ js.UndefOr[scala.Double], /* component */ js.UndefOr[js.Any]) => scala.Unit = null,
    mixins: js.Any = null,
    onDockedAdd: /* component */ js.UndefOr[extjsLib.ExtNs.IComponent] => scala.Unit = null,
    onDockedRemove: /* component */ js.UndefOr[extjsLib.ExtNs.IComponent] => scala.Unit = null,
    removeDocked: (/* item */ js.UndefOr[extjsLib.ExtNs.IComponent], /* autoDestroy */ js.UndefOr[scala.Boolean]) => scala.Unit = null,
    requires: extjsLib.ExtNs.Array = null,
    self: extjsLib.ExtNs.IClass = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    statics: js.Any = null,
    uses: extjsLib.ExtNs.Array = null
  ): IDockingContainer = {
    val __obj = js.Dynamic.literal()
    if (addDocked != null) __obj.updateDynamic("addDocked")(js.Any.fromFunction2(addDocked))
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (config != null) __obj.updateDynamic("config")(config)
    if (defaultDockWeights != null) __obj.updateDynamic("defaultDockWeights")(defaultDockWeights)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (getDockedComponent != null) __obj.updateDynamic("getDockedComponent")(js.Any.fromFunction1(getDockedComponent))
    if (getDockedItems != null) __obj.updateDynamic("getDockedItems")(js.Any.fromFunction2(getDockedItems))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (insertDocked != null) __obj.updateDynamic("insertDocked")(js.Any.fromFunction2(insertDocked))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (onDockedAdd != null) __obj.updateDynamic("onDockedAdd")(js.Any.fromFunction1(onDockedAdd))
    if (onDockedRemove != null) __obj.updateDynamic("onDockedRemove")(js.Any.fromFunction1(onDockedRemove))
    if (removeDocked != null) __obj.updateDynamic("removeDocked")(js.Any.fromFunction2(removeDocked))
    if (requires != null) __obj.updateDynamic("requires")(requires)
    if (self != null) __obj.updateDynamic("self")(self)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[IDockingContainer]
  }
}

