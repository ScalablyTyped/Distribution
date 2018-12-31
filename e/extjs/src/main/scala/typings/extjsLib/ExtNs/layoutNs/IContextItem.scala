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

