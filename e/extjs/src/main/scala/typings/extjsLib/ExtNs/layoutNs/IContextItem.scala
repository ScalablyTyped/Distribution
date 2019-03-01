package typings
package extjsLib.ExtNs.layoutNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IContextItem
  extends extjsLib.ExtNs.IBase {
  /** [Method] Queue the addition of a class name or array of class names to this ContextItem s target when next flushed
  		* @param newCls Object
  		*/
  var addCls: js.UndefOr[js.Function1[/* newCls */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Registers a layout in the block list for the given property
  		* @param layout Ext.layout.Layout
  		* @param propName String The property name that blocked the layout (e.g., 'width').
  		*/
  var block: js.UndefOr[
    js.Function2[
      /* layout */ js.UndefOr[ILayout], 
      /* propName */ js.UndefOr[java.lang.String], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] clears the margin cache so that marginInfo get re read from the dom on the next call to getMarginInfo  This is neede  */
  var clearMarginCache: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Registers a layout in the DOM block list for the given property
  		* @param layout Ext.layout.Layout
  		* @param propName String The property name that blocked the layout (e.g., 'width').
  		*/
  var domBlock: js.UndefOr[
    js.Function2[
      /* layout */ js.UndefOr[ILayout], 
      /* propName */ js.UndefOr[java.lang.String], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Flushes any updates in the dirty collection to the DOM  */
  var flush: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Gets the border information for the element as an object with left top right and bottom properties holding border s
  		* @returns Object
  		*/
  var getBorderInfo: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns a ClassList like object to buffer access to this item s element s classes  */
  var getClassList: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Gets a property of this object if it is correct in the DOM
  		* @param propName String The property name (e.g., 'width').
  		* @returns Object The property value or undefined if not yet set or is dirty.
  		*/
  var getDomProp: js.UndefOr[js.Function1[/* propName */ js.UndefOr[java.lang.String], _]] = js.undefined
  /** [Method] Returns the context item for an owned element
  		* @param nameOrEl String/Ext.dom.Element The element or the name of an owned element
  		* @param owner Ext.layout.container.Container/Ext.Component The owner of the named element if the passed "nameOrEl" parameter is a String. Defaults to this ContextItem's "target" property. For more details on owned elements see childEls and renderSelectors
  		* @returns Ext.layout.ContextItem
  		*/
  var getEl: js.UndefOr[
    js.Function2[/* nameOrEl */ js.UndefOr[js.Any], /* owner */ js.UndefOr[js.Any], this.type]
  ] = js.undefined
  /** [Method] Gets the frame information for the element as an object with left top right and bottom properties holding border
  		* @returns Object
  		*/
  var getFrameInfo: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Gets the margin information for the element as an object with left top right and bottom properties holding margin s
  		* @returns Object
  		*/
  var getMarginInfo: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Gets the padding information for the element as an object with left top right and bottom properties holding padding
  		* @returns Object
  		*/
  var getPaddingInfo: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Gets a property of this object
  		* @param propName String The property name that blocked the layout (e.g., 'width').
  		* @returns Object The property value or undefined if not yet set.
  		*/
  var getProp: js.UndefOr[js.Function1[/* propName */ js.UndefOr[java.lang.String], _]] = js.undefined
  /** [Method] Returns a style for this item
  		* @param styleName String The CSS style name.
  		* @returns Object The value of the DOM style (parsed as necessary).
  		*/
  var getStyle: js.UndefOr[js.Function1[/* styleName */ js.UndefOr[java.lang.String], _]] = js.undefined
  /** [Method] Returns styles for this item
  		* @param styleNames String[] The CSS style names.
  		* @param altNames String[] The alternate names for the returned styles. If given, these names must correspond one-for-one to the styleNames.
  		* @returns Object The values of the DOM styles (parsed as necessary).
  		*/
  var getStyles: js.UndefOr[
    js.Function2[
      /* styleNames */ js.UndefOr[extjsLib.ExtNs.Array], 
      /* altNames */ js.UndefOr[extjsLib.ExtNs.Array], 
      _
    ]
  ] = js.undefined
  /** [Method] Returns true if the given property is correct in the DOM
  		* @param propName String The property name (e.g., 'width').
  		* @returns Boolean
  		*/
  var hasDomProp: js.UndefOr[js.Function1[/* propName */ js.UndefOr[java.lang.String], scala.Boolean]] = js.undefined
  /** [Method] Returns true if the given property has been set
  		* @param propName String The property name (e.g., 'width').
  		* @returns Boolean
  		*/
  var hasProp: js.UndefOr[js.Function1[/* propName */ js.UndefOr[java.lang.String], scala.Boolean]] = js.undefined
  /** [Method] Invalidates the component associated with this item
  		* @param options Object An object describing how to handle the invalidation.
  		*/
  var invalidate: js.UndefOr[js.Function1[/* options */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Recovers a property value from the last computation and restores its value and dirty state
  		* @param propName String The name of the property to recover.
  		* @param oldProps Object The old "props" object from which to recover values.
  		* @param oldDirty Object The old "dirty" object from which to recover state.
  		*/
  var recoverProp: js.UndefOr[
    js.Function3[
      /* propName */ js.UndefOr[java.lang.String], 
      /* oldProps */ js.UndefOr[js.Any], 
      /* oldDirty */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Queue the removal of a class name or array of class names from this ContextItem s target when next flushed
  		* @param removeCls Object
  		*/
  var removeCls: js.UndefOr[js.Function1[/* removeCls */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Removes a cached ContextItem that was created using getEl
  		* @param nameOrEl String/Ext.dom.Element The element or the name of an owned element
  		* @param owner Ext.layout.container.Container/Ext.Component The owner of the named element if the passed "nameOrEl" parameter is a String. Defaults to this ContextItem's "target" property.
  		*/
  var removeEl: js.UndefOr[
    js.Function2[/* nameOrEl */ js.UndefOr[js.Any], /* owner */ js.UndefOr[js.Any], scala.Unit]
  ] = js.undefined
  /** [Method] Queue the setting of a DOM attribute on this ContextItem s target when next flushed
  		* @param name Object
  		* @param value Object
  		*/
  var setAttribute: js.UndefOr[
    js.Function2[/* name */ js.UndefOr[js.Any], /* value */ js.UndefOr[js.Any], scala.Unit]
  ] = js.undefined
  /** [Method] Sets the contentHeight property
  		* @param height Object
  		* @param measured Object
  		*/
  var setContentHeight: js.UndefOr[
    js.Function2[/* height */ js.UndefOr[js.Any], /* measured */ js.UndefOr[js.Any], scala.Unit]
  ] = js.undefined
  /** [Method] Sets the contentWidth and contentHeight properties
  		* @param width Object
  		* @param height Object
  		* @param measured Object
  		*/
  var setContentSize: js.UndefOr[
    js.Function3[
      /* width */ js.UndefOr[js.Any], 
      /* height */ js.UndefOr[js.Any], 
      /* measured */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Sets the contentWidth property
  		* @param width Object
  		* @param measured Object
  		*/
  var setContentWidth: js.UndefOr[
    js.Function2[/* width */ js.UndefOr[js.Any], /* measured */ js.UndefOr[js.Any], scala.Unit]
  ] = js.undefined
  /** [Method] Sets the height and constrains the height to min maxHeight range
  		* @param height Number The height.
  		* @param dirty Boolean Specifies if the value is currently in the DOM. A value of false indicates that the value is already in the DOM.
  		* @returns Number The actual height after constraining.
  		*/
  var setHeight: js.UndefOr[
    js.Function2[
      /* height */ js.UndefOr[scala.Double], 
      /* dirty */ js.UndefOr[scala.Boolean], 
      scala.Double
    ]
  ] = js.undefined
  /** [Method] Sets a property value
  		* @param propName String The property name (e.g., 'width').
  		* @param value Object The new value of the property.
  		* @param dirty Boolean Optionally specifies if the value is currently in the DOM (default is true which indicates the value is not in the DOM and must be flushed at some point).
  		* @returns Number 1 if this call specified the property value, 0 if not.
  		*/
  var setProp: js.UndefOr[
    js.Function3[
      /* propName */ js.UndefOr[java.lang.String], 
      /* value */ js.UndefOr[js.Any], 
      /* dirty */ js.UndefOr[scala.Boolean], 
      scala.Double
    ]
  ] = js.undefined
  /** [Method] Sets the height and constrains the width to min maxWidth range
  		* @param width Number The width.
  		* @param dirty Boolean Specifies if the value is currently in the DOM. A value of false indicates that the value is already in the DOM.
  		* @returns Number The actual width after constraining.
  		*/
  var setWidth: js.UndefOr[
    js.Function2[
      /* width */ js.UndefOr[scala.Double], 
      /* dirty */ js.UndefOr[scala.Boolean], 
      scala.Double
    ]
  ] = js.undefined
  /** [Property] (Object) */
  var state: js.UndefOr[js.Any] = js.undefined
  /** [Property] (Boolean) */
  var wrapsComponent: js.UndefOr[scala.Boolean] = js.undefined
}

object IContextItem {
  @scala.inline
  def apply(
    addCls: js.Function1[/* newCls */ js.UndefOr[js.Any], scala.Unit] = null,
    alias: extjsLib.ExtNs.Array = null,
    alternateClassName: js.Any = null,
    block: js.Function2[
      /* layout */ js.UndefOr[ILayout], 
      /* propName */ js.UndefOr[java.lang.String], 
      scala.Unit
    ] = null,
    callOverridden: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callParent: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callSuper: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    clearMarginCache: js.Function0[scala.Unit] = null,
    config: js.Any = null,
    domBlock: js.Function2[
      /* layout */ js.UndefOr[ILayout], 
      /* propName */ js.UndefOr[java.lang.String], 
      scala.Unit
    ] = null,
    extend: java.lang.String = null,
    flush: js.Function0[scala.Unit] = null,
    getBorderInfo: js.Function0[_] = null,
    getClassList: js.Function0[scala.Unit] = null,
    getDomProp: js.Function1[/* propName */ js.UndefOr[java.lang.String], _] = null,
    getEl: js.Function2[/* nameOrEl */ js.UndefOr[js.Any], /* owner */ js.UndefOr[js.Any], IContextItem] = null,
    getFrameInfo: js.Function0[_] = null,
    getInitialConfig: js.Function1[/* name */ js.UndefOr[java.lang.String], _] = null,
    getMarginInfo: js.Function0[_] = null,
    getPaddingInfo: js.Function0[_] = null,
    getProp: js.Function1[/* propName */ js.UndefOr[java.lang.String], _] = null,
    getStyle: js.Function1[/* styleName */ js.UndefOr[java.lang.String], _] = null,
    getStyles: js.Function2[
      /* styleNames */ js.UndefOr[extjsLib.ExtNs.Array], 
      /* altNames */ js.UndefOr[extjsLib.ExtNs.Array], 
      _
    ] = null,
    hasDomProp: js.Function1[/* propName */ js.UndefOr[java.lang.String], scala.Boolean] = null,
    hasProp: js.Function1[/* propName */ js.UndefOr[java.lang.String], scala.Boolean] = null,
    inheritableStatics: js.Any = null,
    initConfig: js.Function1[/* config */ js.UndefOr[js.Any], IContextItem] = null,
    invalidate: js.Function1[/* options */ js.UndefOr[js.Any], scala.Unit] = null,
    mixins: js.Any = null,
    recoverProp: js.Function3[
      /* propName */ js.UndefOr[java.lang.String], 
      /* oldProps */ js.UndefOr[js.Any], 
      /* oldDirty */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    removeCls: js.Function1[/* removeCls */ js.UndefOr[js.Any], scala.Unit] = null,
    removeEl: js.Function2[/* nameOrEl */ js.UndefOr[js.Any], /* owner */ js.UndefOr[js.Any], scala.Unit] = null,
    requires: extjsLib.ExtNs.Array = null,
    self: extjsLib.ExtNs.IClass = null,
    setAttribute: js.Function2[/* name */ js.UndefOr[js.Any], /* value */ js.UndefOr[js.Any], scala.Unit] = null,
    setContentHeight: js.Function2[/* height */ js.UndefOr[js.Any], /* measured */ js.UndefOr[js.Any], scala.Unit] = null,
    setContentSize: js.Function3[
      /* width */ js.UndefOr[js.Any], 
      /* height */ js.UndefOr[js.Any], 
      /* measured */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    setContentWidth: js.Function2[/* width */ js.UndefOr[js.Any], /* measured */ js.UndefOr[js.Any], scala.Unit] = null,
    setHeight: js.Function2[
      /* height */ js.UndefOr[scala.Double], 
      /* dirty */ js.UndefOr[scala.Boolean], 
      scala.Double
    ] = null,
    setProp: js.Function3[
      /* propName */ js.UndefOr[java.lang.String], 
      /* value */ js.UndefOr[js.Any], 
      /* dirty */ js.UndefOr[scala.Boolean], 
      scala.Double
    ] = null,
    setWidth: js.Function2[
      /* width */ js.UndefOr[scala.Double], 
      /* dirty */ js.UndefOr[scala.Boolean], 
      scala.Double
    ] = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    state: js.Any = null,
    statics: js.Any = null,
    uses: extjsLib.ExtNs.Array = null,
    wrapsComponent: js.UndefOr[scala.Boolean] = js.undefined
  ): IContextItem = {
    val __obj = js.Dynamic.literal()
    if (addCls != null) __obj.updateDynamic("addCls")(addCls)
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (block != null) __obj.updateDynamic("block")(block)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(callOverridden)
    if (callParent != null) __obj.updateDynamic("callParent")(callParent)
    if (callSuper != null) __obj.updateDynamic("callSuper")(callSuper)
    if (clearMarginCache != null) __obj.updateDynamic("clearMarginCache")(clearMarginCache)
    if (config != null) __obj.updateDynamic("config")(config)
    if (domBlock != null) __obj.updateDynamic("domBlock")(domBlock)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (flush != null) __obj.updateDynamic("flush")(flush)
    if (getBorderInfo != null) __obj.updateDynamic("getBorderInfo")(getBorderInfo)
    if (getClassList != null) __obj.updateDynamic("getClassList")(getClassList)
    if (getDomProp != null) __obj.updateDynamic("getDomProp")(getDomProp)
    if (getEl != null) __obj.updateDynamic("getEl")(getEl)
    if (getFrameInfo != null) __obj.updateDynamic("getFrameInfo")(getFrameInfo)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(getInitialConfig)
    if (getMarginInfo != null) __obj.updateDynamic("getMarginInfo")(getMarginInfo)
    if (getPaddingInfo != null) __obj.updateDynamic("getPaddingInfo")(getPaddingInfo)
    if (getProp != null) __obj.updateDynamic("getProp")(getProp)
    if (getStyle != null) __obj.updateDynamic("getStyle")(getStyle)
    if (getStyles != null) __obj.updateDynamic("getStyles")(getStyles)
    if (hasDomProp != null) __obj.updateDynamic("hasDomProp")(hasDomProp)
    if (hasProp != null) __obj.updateDynamic("hasProp")(hasProp)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(initConfig)
    if (invalidate != null) __obj.updateDynamic("invalidate")(invalidate)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (recoverProp != null) __obj.updateDynamic("recoverProp")(recoverProp)
    if (removeCls != null) __obj.updateDynamic("removeCls")(removeCls)
    if (removeEl != null) __obj.updateDynamic("removeEl")(removeEl)
    if (requires != null) __obj.updateDynamic("requires")(requires)
    if (self != null) __obj.updateDynamic("self")(self)
    if (setAttribute != null) __obj.updateDynamic("setAttribute")(setAttribute)
    if (setContentHeight != null) __obj.updateDynamic("setContentHeight")(setContentHeight)
    if (setContentSize != null) __obj.updateDynamic("setContentSize")(setContentSize)
    if (setContentWidth != null) __obj.updateDynamic("setContentWidth")(setContentWidth)
    if (setHeight != null) __obj.updateDynamic("setHeight")(setHeight)
    if (setProp != null) __obj.updateDynamic("setProp")(setProp)
    if (setWidth != null) __obj.updateDynamic("setWidth")(setWidth)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (state != null) __obj.updateDynamic("state")(state)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    if (!js.isUndefined(wrapsComponent)) __obj.updateDynamic("wrapsComponent")(wrapsComponent)
    __obj.asInstanceOf[IContextItem]
  }
}

