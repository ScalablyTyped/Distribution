package typings.extjs.Ext.layout

import typings.extjs.Ext.Array
import typings.extjs.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IContextItem extends IBase {
  /** [Method] Queue the addition of a class name or array of class names to this ContextItem s target when next flushed
    * @param newCls Object
    */
  var addCls: js.UndefOr[js.Function1[/* newCls */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Registers a layout in the block list for the given property
    * @param layout Ext.layout.Layout
    * @param propName String The property name that blocked the layout (e.g., 'width').
    */
  var block: js.UndefOr[
    js.Function2[/* layout */ js.UndefOr[ILayout], /* propName */ js.UndefOr[String], Unit]
  ] = js.native
  /** [Method] clears the margin cache so that marginInfo get re read from the dom on the next call to getMarginInfo  This is neede  */
  var clearMarginCache: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Registers a layout in the DOM block list for the given property
    * @param layout Ext.layout.Layout
    * @param propName String The property name that blocked the layout (e.g., 'width').
    */
  var domBlock: js.UndefOr[
    js.Function2[/* layout */ js.UndefOr[ILayout], /* propName */ js.UndefOr[String], Unit]
  ] = js.native
  /** [Method] Flushes any updates in the dirty collection to the DOM  */
  var flush: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Gets the border information for the element as an object with left top right and bottom properties holding border s
    * @returns Object
    */
  var getBorderInfo: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns a ClassList like object to buffer access to this item s element s classes  */
  var getClassList: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Gets a property of this object if it is correct in the DOM
    * @param propName String The property name (e.g., 'width').
    * @returns Object The property value or undefined if not yet set or is dirty.
    */
  var getDomProp: js.UndefOr[js.Function1[/* propName */ js.UndefOr[String], _]] = js.native
  /** [Method] Returns the context item for an owned element
    * @param nameOrEl String/Ext.dom.Element The element or the name of an owned element
    * @param owner Ext.layout.container.Container/Ext.Component The owner of the named element if the passed "nameOrEl" parameter is a String. Defaults to this ContextItem's "target" property. For more details on owned elements see childEls and renderSelectors
    * @returns Ext.layout.ContextItem
    */
  var getEl: js.UndefOr[
    js.Function2[/* nameOrEl */ js.UndefOr[js.Any], /* owner */ js.UndefOr[js.Any], this.type]
  ] = js.native
  /** [Method] Gets the frame information for the element as an object with left top right and bottom properties holding border
    * @returns Object
    */
  var getFrameInfo: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Gets the margin information for the element as an object with left top right and bottom properties holding margin s
    * @returns Object
    */
  var getMarginInfo: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Gets the padding information for the element as an object with left top right and bottom properties holding padding
    * @returns Object
    */
  var getPaddingInfo: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Gets a property of this object
    * @param propName String The property name that blocked the layout (e.g., 'width').
    * @returns Object The property value or undefined if not yet set.
    */
  var getProp: js.UndefOr[js.Function1[/* propName */ js.UndefOr[String], _]] = js.native
  /** [Method] Returns a style for this item
    * @param styleName String The CSS style name.
    * @returns Object The value of the DOM style (parsed as necessary).
    */
  var getStyle: js.UndefOr[js.Function1[/* styleName */ js.UndefOr[String], _]] = js.native
  /** [Method] Returns styles for this item
    * @param styleNames String[] The CSS style names.
    * @param altNames String[] The alternate names for the returned styles. If given, these names must correspond one-for-one to the styleNames.
    * @returns Object The values of the DOM styles (parsed as necessary).
    */
  var getStyles: js.UndefOr[
    js.Function2[/* styleNames */ js.UndefOr[Array], /* altNames */ js.UndefOr[Array], _]
  ] = js.native
  /** [Method] Returns true if the given property is correct in the DOM
    * @param propName String The property name (e.g., 'width').
    * @returns Boolean
    */
  var hasDomProp: js.UndefOr[js.Function1[/* propName */ js.UndefOr[String], Boolean]] = js.native
  /** [Method] Returns true if the given property has been set
    * @param propName String The property name (e.g., 'width').
    * @returns Boolean
    */
  var hasProp: js.UndefOr[js.Function1[/* propName */ js.UndefOr[String], Boolean]] = js.native
  /** [Method] Invalidates the component associated with this item
    * @param options Object An object describing how to handle the invalidation.
    */
  var invalidate: js.UndefOr[js.Function1[/* options */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Recovers a property value from the last computation and restores its value and dirty state
    * @param propName String The name of the property to recover.
    * @param oldProps Object The old "props" object from which to recover values.
    * @param oldDirty Object The old "dirty" object from which to recover state.
    */
  var recoverProp: js.UndefOr[
    js.Function3[
      /* propName */ js.UndefOr[String], 
      /* oldProps */ js.UndefOr[js.Any], 
      /* oldDirty */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  /** [Method] Queue the removal of a class name or array of class names from this ContextItem s target when next flushed
    * @param removeCls Object
    */
  var removeCls: js.UndefOr[js.Function1[/* removeCls */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Removes a cached ContextItem that was created using getEl
    * @param nameOrEl String/Ext.dom.Element The element or the name of an owned element
    * @param owner Ext.layout.container.Container/Ext.Component The owner of the named element if the passed "nameOrEl" parameter is a String. Defaults to this ContextItem's "target" property.
    */
  var removeEl: js.UndefOr[
    js.Function2[/* nameOrEl */ js.UndefOr[js.Any], /* owner */ js.UndefOr[js.Any], Unit]
  ] = js.native
  /** [Method] Queue the setting of a DOM attribute on this ContextItem s target when next flushed
    * @param name Object
    * @param value Object
    */
  var setAttribute: js.UndefOr[
    js.Function2[/* name */ js.UndefOr[js.Any], /* value */ js.UndefOr[js.Any], Unit]
  ] = js.native
  /** [Method] Sets the contentHeight property
    * @param height Object
    * @param measured Object
    */
  var setContentHeight: js.UndefOr[
    js.Function2[/* height */ js.UndefOr[js.Any], /* measured */ js.UndefOr[js.Any], Unit]
  ] = js.native
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
      Unit
    ]
  ] = js.native
  /** [Method] Sets the contentWidth property
    * @param width Object
    * @param measured Object
    */
  var setContentWidth: js.UndefOr[
    js.Function2[/* width */ js.UndefOr[js.Any], /* measured */ js.UndefOr[js.Any], Unit]
  ] = js.native
  /** [Method] Sets the height and constrains the height to min maxHeight range
    * @param height Number The height.
    * @param dirty Boolean Specifies if the value is currently in the DOM. A value of false indicates that the value is already in the DOM.
    * @returns Number The actual height after constraining.
    */
  var setHeight: js.UndefOr[
    js.Function2[/* height */ js.UndefOr[Double], /* dirty */ js.UndefOr[Boolean], Double]
  ] = js.native
  /** [Method] Sets a property value
    * @param propName String The property name (e.g., 'width').
    * @param value Object The new value of the property.
    * @param dirty Boolean Optionally specifies if the value is currently in the DOM (default is true which indicates the value is not in the DOM and must be flushed at some point).
    * @returns Number 1 if this call specified the property value, 0 if not.
    */
  var setProp: js.UndefOr[
    js.Function3[
      /* propName */ js.UndefOr[String], 
      /* value */ js.UndefOr[js.Any], 
      /* dirty */ js.UndefOr[Boolean], 
      Double
    ]
  ] = js.native
  /** [Method] Sets the height and constrains the width to min maxWidth range
    * @param width Number The width.
    * @param dirty Boolean Specifies if the value is currently in the DOM. A value of false indicates that the value is already in the DOM.
    * @returns Number The actual width after constraining.
    */
  var setWidth: js.UndefOr[
    js.Function2[/* width */ js.UndefOr[Double], /* dirty */ js.UndefOr[Boolean], Double]
  ] = js.native
  /** [Property] (Object) */
  var state: js.UndefOr[js.Any] = js.native
  /** [Property] (Boolean) */
  var wrapsComponent: js.UndefOr[Boolean] = js.native
}

object IContextItem {
  @scala.inline
  def apply(): IContextItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IContextItem]
  }
  @scala.inline
  implicit class IContextItemOps[Self <: IContextItem] (val x: Self) extends AnyVal {
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
    def setAddCls(value: /* newCls */ js.UndefOr[js.Any] => Unit): Self = this.set("addCls", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAddCls: Self = this.set("addCls", js.undefined)
    @scala.inline
    def setBlock(value: (/* layout */ js.UndefOr[ILayout], /* propName */ js.UndefOr[String]) => Unit): Self = this.set("block", js.Any.fromFunction2(value))
    @scala.inline
    def deleteBlock: Self = this.set("block", js.undefined)
    @scala.inline
    def setClearMarginCache(value: () => Unit): Self = this.set("clearMarginCache", js.Any.fromFunction0(value))
    @scala.inline
    def deleteClearMarginCache: Self = this.set("clearMarginCache", js.undefined)
    @scala.inline
    def setDomBlock(value: (/* layout */ js.UndefOr[ILayout], /* propName */ js.UndefOr[String]) => Unit): Self = this.set("domBlock", js.Any.fromFunction2(value))
    @scala.inline
    def deleteDomBlock: Self = this.set("domBlock", js.undefined)
    @scala.inline
    def setFlush(value: () => Unit): Self = this.set("flush", js.Any.fromFunction0(value))
    @scala.inline
    def deleteFlush: Self = this.set("flush", js.undefined)
    @scala.inline
    def setGetBorderInfo(value: () => _): Self = this.set("getBorderInfo", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetBorderInfo: Self = this.set("getBorderInfo", js.undefined)
    @scala.inline
    def setGetClassList(value: () => Unit): Self = this.set("getClassList", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetClassList: Self = this.set("getClassList", js.undefined)
    @scala.inline
    def setGetDomProp(value: /* propName */ js.UndefOr[String] => _): Self = this.set("getDomProp", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetDomProp: Self = this.set("getDomProp", js.undefined)
    @scala.inline
    def setGetEl(value: (/* nameOrEl */ js.UndefOr[js.Any], /* owner */ js.UndefOr[js.Any]) => IContextItem): Self = this.set("getEl", js.Any.fromFunction2(value))
    @scala.inline
    def deleteGetEl: Self = this.set("getEl", js.undefined)
    @scala.inline
    def setGetFrameInfo(value: () => _): Self = this.set("getFrameInfo", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetFrameInfo: Self = this.set("getFrameInfo", js.undefined)
    @scala.inline
    def setGetMarginInfo(value: () => _): Self = this.set("getMarginInfo", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetMarginInfo: Self = this.set("getMarginInfo", js.undefined)
    @scala.inline
    def setGetPaddingInfo(value: () => _): Self = this.set("getPaddingInfo", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetPaddingInfo: Self = this.set("getPaddingInfo", js.undefined)
    @scala.inline
    def setGetProp(value: /* propName */ js.UndefOr[String] => _): Self = this.set("getProp", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetProp: Self = this.set("getProp", js.undefined)
    @scala.inline
    def setGetStyle(value: /* styleName */ js.UndefOr[String] => _): Self = this.set("getStyle", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetStyle: Self = this.set("getStyle", js.undefined)
    @scala.inline
    def setGetStyles(value: (/* styleNames */ js.UndefOr[Array], /* altNames */ js.UndefOr[Array]) => _): Self = this.set("getStyles", js.Any.fromFunction2(value))
    @scala.inline
    def deleteGetStyles: Self = this.set("getStyles", js.undefined)
    @scala.inline
    def setHasDomProp(value: /* propName */ js.UndefOr[String] => Boolean): Self = this.set("hasDomProp", js.Any.fromFunction1(value))
    @scala.inline
    def deleteHasDomProp: Self = this.set("hasDomProp", js.undefined)
    @scala.inline
    def setHasProp(value: /* propName */ js.UndefOr[String] => Boolean): Self = this.set("hasProp", js.Any.fromFunction1(value))
    @scala.inline
    def deleteHasProp: Self = this.set("hasProp", js.undefined)
    @scala.inline
    def setInvalidate(value: /* options */ js.UndefOr[js.Any] => Unit): Self = this.set("invalidate", js.Any.fromFunction1(value))
    @scala.inline
    def deleteInvalidate: Self = this.set("invalidate", js.undefined)
    @scala.inline
    def setRecoverProp(
      value: (/* propName */ js.UndefOr[String], /* oldProps */ js.UndefOr[js.Any], /* oldDirty */ js.UndefOr[js.Any]) => Unit
    ): Self = this.set("recoverProp", js.Any.fromFunction3(value))
    @scala.inline
    def deleteRecoverProp: Self = this.set("recoverProp", js.undefined)
    @scala.inline
    def setRemoveCls(value: /* removeCls */ js.UndefOr[js.Any] => Unit): Self = this.set("removeCls", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRemoveCls: Self = this.set("removeCls", js.undefined)
    @scala.inline
    def setRemoveEl(value: (/* nameOrEl */ js.UndefOr[js.Any], /* owner */ js.UndefOr[js.Any]) => Unit): Self = this.set("removeEl", js.Any.fromFunction2(value))
    @scala.inline
    def deleteRemoveEl: Self = this.set("removeEl", js.undefined)
    @scala.inline
    def setSetAttribute(value: (/* name */ js.UndefOr[js.Any], /* value */ js.UndefOr[js.Any]) => Unit): Self = this.set("setAttribute", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSetAttribute: Self = this.set("setAttribute", js.undefined)
    @scala.inline
    def setSetContentHeight(value: (/* height */ js.UndefOr[js.Any], /* measured */ js.UndefOr[js.Any]) => Unit): Self = this.set("setContentHeight", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSetContentHeight: Self = this.set("setContentHeight", js.undefined)
    @scala.inline
    def setSetContentSize(
      value: (/* width */ js.UndefOr[js.Any], /* height */ js.UndefOr[js.Any], /* measured */ js.UndefOr[js.Any]) => Unit
    ): Self = this.set("setContentSize", js.Any.fromFunction3(value))
    @scala.inline
    def deleteSetContentSize: Self = this.set("setContentSize", js.undefined)
    @scala.inline
    def setSetContentWidth(value: (/* width */ js.UndefOr[js.Any], /* measured */ js.UndefOr[js.Any]) => Unit): Self = this.set("setContentWidth", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSetContentWidth: Self = this.set("setContentWidth", js.undefined)
    @scala.inline
    def setSetHeight(value: (/* height */ js.UndefOr[Double], /* dirty */ js.UndefOr[Boolean]) => Double): Self = this.set("setHeight", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSetHeight: Self = this.set("setHeight", js.undefined)
    @scala.inline
    def setSetProp(
      value: (/* propName */ js.UndefOr[String], /* value */ js.UndefOr[js.Any], /* dirty */ js.UndefOr[Boolean]) => Double
    ): Self = this.set("setProp", js.Any.fromFunction3(value))
    @scala.inline
    def deleteSetProp: Self = this.set("setProp", js.undefined)
    @scala.inline
    def setSetWidth(value: (/* width */ js.UndefOr[Double], /* dirty */ js.UndefOr[Boolean]) => Double): Self = this.set("setWidth", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSetWidth: Self = this.set("setWidth", js.undefined)
    @scala.inline
    def setState(value: js.Any): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    @scala.inline
    def setWrapsComponent(value: Boolean): Self = this.set("wrapsComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWrapsComponent: Self = this.set("wrapsComponent", js.undefined)
  }
  
}

