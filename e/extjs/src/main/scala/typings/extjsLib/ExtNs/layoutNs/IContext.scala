package typings
package extjsLib.ExtNs.layoutNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IContext
  extends extjsLib.ExtNs.IBase {
  /** [Method] Flushes any pending writes to the DOM by calling each ContextItem in the flushQueue  */
  var flush: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Returns the ContextItem for a component
  		* @param cmp Ext.Component
  		*/
  var getCmp: js.UndefOr[js.Function1[/* cmp */ js.UndefOr[extjsLib.ExtNs.IComponent], scala.Unit]] = js.undefined
  /** [Method] Returns the ContextItem for an element
  		* @param parent Ext.layout.ContextItem
  		* @param el Ext.dom.Element
  		*/
  var getEl: js.UndefOr[
    js.Function2[
      /* parent */ js.UndefOr[IContextItem], 
      /* el */ js.UndefOr[extjsLib.ExtNs.domNs.IElement], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Invalidates one or more components layouts component and container
  		* @param components Ext.Component/Array An array of Components or a single Component.
  		* @param full Boolean True if all properties should be invalidated, otherwise only those calculated by the component should be invalidated.
  		*/
  var invalidate: js.UndefOr[
    js.Function2[
      /* components */ js.UndefOr[js.Any], 
      /* full */ js.UndefOr[scala.Boolean], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Property] (Ext.util.Queue) */
  var layoutQueue: js.UndefOr[extjsLib.ExtNs.utilNs.IQueue] = js.undefined
  /** [Method] Removes the ContextItem for an element from the cache and from the parent s children array
  		* @param parent Ext.layout.ContextItem
  		* @param el Ext.dom.Element
  		*/
  var removeEl: js.UndefOr[
    js.Function2[
      /* parent */ js.UndefOr[IContextItem], 
      /* el */ js.UndefOr[extjsLib.ExtNs.domNs.IElement], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Resets the given layout object
  		* @param layout Object
  		* @param ownerContext Object
  		* @param firstTime Object
  		*/
  var resetLayout: js.UndefOr[
    js.Function3[
      /* layout */ js.UndefOr[js.Any], 
      /* ownerContext */ js.UndefOr[js.Any], 
      /* firstTime */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Runs the layout calculations
  		* @returns Boolean True if all layouts were completed, false if not.
  		*/
  var run: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Performs one layout cycle by calling each layout in the layout queue
  		* @returns Boolean True if some progress was made, false if not.
  		*/
  var runCycle: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Set the size of a component element or composite or an array of components or elements
  		* @param items Ext.Component/Ext.Component[]/Ext.dom.Element/Ext.dom.Element[]/Ext.dom.CompositeElement The item(s) to size.
  		* @param width Number The new width to set (ignored if undefined or NaN).
  		* @param height Number The new height to set (ignored if undefined or NaN).
  		*/
  var setItemSize: js.UndefOr[
    js.Function3[
      /* items */ js.UndefOr[js.Any], 
      /* width */ js.UndefOr[scala.Double], 
      /* height */ js.UndefOr[scala.Double], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Property] (Number) */
  var state: js.UndefOr[scala.Double] = js.undefined
}

object IContext {
  @scala.inline
  def apply(
    alias: extjsLib.ExtNs.Array = null,
    alternateClassName: js.Any = null,
    callOverridden: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callParent: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callSuper: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    config: js.Any = null,
    extend: java.lang.String = null,
    flush: js.Function0[scala.Unit] = null,
    getCmp: js.Function1[/* cmp */ js.UndefOr[extjsLib.ExtNs.IComponent], scala.Unit] = null,
    getEl: js.Function2[
      /* parent */ js.UndefOr[IContextItem], 
      /* el */ js.UndefOr[extjsLib.ExtNs.domNs.IElement], 
      scala.Unit
    ] = null,
    getInitialConfig: js.Function1[/* name */ js.UndefOr[java.lang.String], _] = null,
    inheritableStatics: js.Any = null,
    initConfig: js.Function1[/* config */ js.UndefOr[js.Any], IContext] = null,
    invalidate: js.Function2[
      /* components */ js.UndefOr[js.Any], 
      /* full */ js.UndefOr[scala.Boolean], 
      scala.Unit
    ] = null,
    layoutQueue: extjsLib.ExtNs.utilNs.IQueue = null,
    mixins: js.Any = null,
    removeEl: js.Function2[
      /* parent */ js.UndefOr[IContextItem], 
      /* el */ js.UndefOr[extjsLib.ExtNs.domNs.IElement], 
      scala.Unit
    ] = null,
    requires: extjsLib.ExtNs.Array = null,
    resetLayout: js.Function3[
      /* layout */ js.UndefOr[js.Any], 
      /* ownerContext */ js.UndefOr[js.Any], 
      /* firstTime */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    run: js.Function0[scala.Boolean] = null,
    runCycle: js.Function0[scala.Boolean] = null,
    self: extjsLib.ExtNs.IClass = null,
    setItemSize: js.Function3[
      /* items */ js.UndefOr[js.Any], 
      /* width */ js.UndefOr[scala.Double], 
      /* height */ js.UndefOr[scala.Double], 
      scala.Unit
    ] = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    state: scala.Int | scala.Double = null,
    statics: js.Any = null,
    uses: extjsLib.ExtNs.Array = null
  ): IContext = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(callOverridden)
    if (callParent != null) __obj.updateDynamic("callParent")(callParent)
    if (callSuper != null) __obj.updateDynamic("callSuper")(callSuper)
    if (config != null) __obj.updateDynamic("config")(config)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (flush != null) __obj.updateDynamic("flush")(flush)
    if (getCmp != null) __obj.updateDynamic("getCmp")(getCmp)
    if (getEl != null) __obj.updateDynamic("getEl")(getEl)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(getInitialConfig)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(initConfig)
    if (invalidate != null) __obj.updateDynamic("invalidate")(invalidate)
    if (layoutQueue != null) __obj.updateDynamic("layoutQueue")(layoutQueue)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (removeEl != null) __obj.updateDynamic("removeEl")(removeEl)
    if (requires != null) __obj.updateDynamic("requires")(requires)
    if (resetLayout != null) __obj.updateDynamic("resetLayout")(resetLayout)
    if (run != null) __obj.updateDynamic("run")(run)
    if (runCycle != null) __obj.updateDynamic("runCycle")(runCycle)
    if (self != null) __obj.updateDynamic("self")(self)
    if (setItemSize != null) __obj.updateDynamic("setItemSize")(setItemSize)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[IContext]
  }
}

