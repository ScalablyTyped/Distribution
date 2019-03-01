package typings
package extjsLib.ExtNs.layoutNs.componentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAbstractDock extends IComponent {
  /** [Method] Called before any calculation cycles to reset DOM values and prepare for calculation
  		* @param ownerContext Object
  		*/
  @JSName("beginLayoutCycle")
  var beginLayoutCycle_IAbstractDock: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Called before any calculation cycles to prepare for layout
  		* @param ownerContext Object
  		*/
  @JSName("beginLayout")
  var beginLayout_IAbstractDock: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Called to perform the calculations for this layout
  		* @param ownerContext Object
  		*/
  @JSName("calculate")
  var calculate_IAbstractDock: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Retrieve an ordered and or filtered array of all docked Components
  		* @param order String The desired ordering of the items ('render' or 'visual').
  		* @param beforeBody Boolean An optional flag to limit the set of items to only those before the body (true) or after the body (false). All components are returned by default.
  		* @returns Ext.Component[] An array of components.
  		*/
  var getDockedItems: js.UndefOr[
    js.Function2[
      /* order */ js.UndefOr[java.lang.String], 
      /* beforeBody */ js.UndefOr[scala.Boolean], 
      extjsLib.ExtNs.Array
    ]
  ] = js.undefined
  /** [Method] Returns an object describing how this layout manages the size of the given component
  		* @param item Object
  		* @param ownerSizeModel Object
  		* @returns Ext.layout.SizePolicy An object describing the sizing done by the layout for this item.
  		*/
  @JSName("getItemSizePolicy")
  var getItemSizePolicy_IAbstractDock: js.UndefOr[
    js.Function2[
      /* item */ js.UndefOr[js.Any], 
      /* ownerSizeModel */ js.UndefOr[js.Any], 
      extjsLib.ExtNs.layoutNs.ISizePolicy
    ]
  ] = js.undefined
  /** [Method] Returns an array containing all the visible docked items inside this layout s owner Panel
  		* @returns Array An array containing all the visible docked items of the Panel
  		*/
  @JSName("getLayoutItems")
  var getLayoutItems_IAbstractDock: js.UndefOr[js.Function0[extjsLib.ExtNs.Array]] = js.undefined
  /** [Method] The default weighting of docked items produces this arrangement
  		* @param ownerContext Object
  		* @param horz Object
  		* @param vert Object
  		*/
  var invalidateAxes: js.UndefOr[
    js.Function3[
      /* ownerContext */ js.UndefOr[js.Any], 
      /* horz */ js.UndefOr[js.Any], 
      /* vert */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
}

object IAbstractDock {
  @scala.inline
  def apply(
    afterRemove: js.Function1[/* item */ js.UndefOr[js.Any], scala.Unit] = null,
    alias: extjsLib.ExtNs.Array = null,
    alternateClassName: js.Any = null,
    beginLayout: js.Function1[/* ownerContext */ js.UndefOr[js.Any], scala.Unit] = null,
    beginLayoutCycle: js.Function1[/* ownerContext */ js.UndefOr[js.Any], scala.Unit] = null,
    calculate: js.Function1[/* ownerContext */ js.UndefOr[js.Any], scala.Unit] = null,
    callOverridden: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callParent: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callSuper: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    completeLayout: js.Function1[/* ownerContext */ js.UndefOr[extjsLib.ExtNs.layoutNs.IContextItem], scala.Unit] = null,
    config: js.Any = null,
    configureItem: js.Function1[/* item */ js.UndefOr[extjsLib.ExtNs.IComponent], scala.Unit] = null,
    destroy: js.Function0[scala.Unit] = null,
    done: js.UndefOr[scala.Boolean] = js.undefined,
    extend: java.lang.String = null,
    finalizeLayout: js.Function1[/* ownerContext */ js.UndefOr[extjsLib.ExtNs.layoutNs.IContextItem], scala.Unit] = null,
    finishedLayout: js.Function1[/* ownerContext */ js.UndefOr[js.Any], scala.Unit] = null,
    getDockedItems: js.Function2[
      /* order */ js.UndefOr[java.lang.String], 
      /* beforeBody */ js.UndefOr[scala.Boolean], 
      extjsLib.ExtNs.Array
    ] = null,
    getInitialConfig: js.Function1[/* name */ js.UndefOr[java.lang.String], _] = null,
    getItemSizePolicy: js.Function2[
      /* item */ js.UndefOr[js.Any], 
      /* ownerSizeModel */ js.UndefOr[js.Any], 
      extjsLib.ExtNs.layoutNs.ISizePolicy
    ] = null,
    getLayoutItems: js.Function0[extjsLib.ExtNs.Array] = null,
    getRenderTarget: js.Function0[extjsLib.ExtNs.IElement] = null,
    getTarget: js.Function0[extjsLib.ExtNs.IElement] = null,
    inheritableStatics: js.Any = null,
    initConfig: js.Function1[/* config */ js.UndefOr[js.Any], IAbstractDock] = null,
    initLayout: js.Function0[scala.Unit] = null,
    invalidateAxes: js.Function3[
      /* ownerContext */ js.UndefOr[js.Any], 
      /* horz */ js.UndefOr[js.Any], 
      /* vert */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    isLayout: js.UndefOr[scala.Boolean] = js.undefined,
    isValidParent: js.Function3[
      /* item */ js.UndefOr[js.Any], 
      /* target */ js.UndefOr[js.Any], 
      /* position */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    mixins: js.Any = null,
    notifyOwner: js.Function1[/* ownerContext */ js.UndefOr[js.Any], scala.Unit] = null,
    onContentChange: js.Function1[/* child */ js.UndefOr[extjsLib.ExtNs.IComponent], scala.Boolean] = null,
    renderItems: js.Function2[/* items */ js.UndefOr[js.Any], /* target */ js.UndefOr[js.Any], scala.Unit] = null,
    requires: extjsLib.ExtNs.Array = null,
    self: extjsLib.ExtNs.IClass = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    statics: js.Any = null,
    uses: extjsLib.ExtNs.Array = null
  ): IAbstractDock = {
    val __obj = js.Dynamic.literal()
    if (afterRemove != null) __obj.updateDynamic("afterRemove")(afterRemove)
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (beginLayout != null) __obj.updateDynamic("beginLayout")(beginLayout)
    if (beginLayoutCycle != null) __obj.updateDynamic("beginLayoutCycle")(beginLayoutCycle)
    if (calculate != null) __obj.updateDynamic("calculate")(calculate)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(callOverridden)
    if (callParent != null) __obj.updateDynamic("callParent")(callParent)
    if (callSuper != null) __obj.updateDynamic("callSuper")(callSuper)
    if (completeLayout != null) __obj.updateDynamic("completeLayout")(completeLayout)
    if (config != null) __obj.updateDynamic("config")(config)
    if (configureItem != null) __obj.updateDynamic("configureItem")(configureItem)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (!js.isUndefined(done)) __obj.updateDynamic("done")(done)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (finalizeLayout != null) __obj.updateDynamic("finalizeLayout")(finalizeLayout)
    if (finishedLayout != null) __obj.updateDynamic("finishedLayout")(finishedLayout)
    if (getDockedItems != null) __obj.updateDynamic("getDockedItems")(getDockedItems)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(getInitialConfig)
    if (getItemSizePolicy != null) __obj.updateDynamic("getItemSizePolicy")(getItemSizePolicy)
    if (getLayoutItems != null) __obj.updateDynamic("getLayoutItems")(getLayoutItems)
    if (getRenderTarget != null) __obj.updateDynamic("getRenderTarget")(getRenderTarget)
    if (getTarget != null) __obj.updateDynamic("getTarget")(getTarget)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(initConfig)
    if (initLayout != null) __obj.updateDynamic("initLayout")(initLayout)
    if (invalidateAxes != null) __obj.updateDynamic("invalidateAxes")(invalidateAxes)
    if (!js.isUndefined(isLayout)) __obj.updateDynamic("isLayout")(isLayout)
    if (isValidParent != null) __obj.updateDynamic("isValidParent")(isValidParent)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (notifyOwner != null) __obj.updateDynamic("notifyOwner")(notifyOwner)
    if (onContentChange != null) __obj.updateDynamic("onContentChange")(onContentChange)
    if (renderItems != null) __obj.updateDynamic("renderItems")(renderItems)
    if (requires != null) __obj.updateDynamic("requires")(requires)
    if (self != null) __obj.updateDynamic("self")(self)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[IAbstractDock]
  }
}

