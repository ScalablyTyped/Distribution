package typings.extjs.Ext.dom.abstractelement

import typings.extjs.Ext.Array
import typings.extjs.Ext.IClass
import typings.extjs.Ext.IElementLoader
import typings.extjs.Ext.dd.IDD
import typings.extjs.Ext.dd.IDDProxy
import typings.extjs.Ext.dd.IDDTarget
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFly
  extends typings.extjs.Ext.dom.IElement {
  /** [Property] (Boolean) */
  var isFly: js.UndefOr[Boolean] = js.undefined
}

object IFly {
  @scala.inline
  def apply(
    ASCLASS: Int | Double = null,
    DISPLAY: Int | Double = null,
    OFFSETS: Int | Double = null,
    VISIBILITY: Int | Double = null,
    addCls: /* className */ js.UndefOr[js.Any] => typings.extjs.Ext.dom.IElement = null,
    addClsOnClick: (/* className */ js.UndefOr[java.lang.String], /* testFn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => IFly = null,
    addClsOnFocus: (/* className */ js.UndefOr[java.lang.String], /* testFn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => IFly = null,
    addClsOnOver: (/* className */ js.UndefOr[java.lang.String], /* testFn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => IFly = null,
    addKeyListener: (/* key */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => typings.extjs.Ext.util.IKeyMap = null,
    addKeyMap: /* config */ js.UndefOr[js.Any] => typings.extjs.Ext.util.IKeyMap = null,
    addListener: (/* eventName */ js.UndefOr[java.lang.String], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => IFly = null,
    alias: Array = null,
    alternateClassName: js.Any = null,
    animate: /* config */ js.UndefOr[js.Any] => IFly = null,
    appendChild: (/* el */ js.UndefOr[js.Any], /* returnDom */ js.UndefOr[Boolean]) => IFly = null,
    appendTo: /* el */ js.UndefOr[js.Any] => IFly = null,
    applyStyles: /* styles */ js.UndefOr[js.Any] => typings.extjs.Ext.dom.IElement = null,
    autoBoxAdjust: js.UndefOr[Boolean] = js.undefined,
    blur: () => IFly = null,
    boxWrap: /* clazz */ js.UndefOr[java.lang.String] => IFly = null,
    cacheScrollValues: () => _ = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    center: /* centerIn */ js.UndefOr[js.Any] => Unit = null,
    child: (/* selector */ js.UndefOr[java.lang.String], /* returnDom */ js.UndefOr[Boolean]) => _ = null,
    clean: /* forceReclean */ js.UndefOr[Boolean] => Unit = null,
    clearListeners: () => IFly = null,
    clearOpacity: () => IFly = null,
    clearPositioning: /* value */ js.UndefOr[java.lang.String] => IFly = null,
    clip: () => IFly = null,
    config: js.Any = null,
    contains: /* el */ js.UndefOr[js.Any] => Boolean = null,
    createChild: (/* config */ js.UndefOr[js.Any], /* insertBefore */ js.UndefOr[HTMLElement], /* returnDom */ js.UndefOr[Boolean]) => IFly = null,
    createProxy: (/* config */ js.UndefOr[js.Any], /* renderTo */ js.UndefOr[js.Any], /* matchBox */ js.UndefOr[Boolean]) => IFly = null,
    createShim: () => IFly = null,
    defaultUnit: java.lang.String = null,
    destroy: () => Unit = null,
    dom: HTMLElement = null,
    down: (/* selector */ js.UndefOr[java.lang.String], /* returnDom */ js.UndefOr[Boolean]) => _ = null,
    enableDisplayMode: /* display */ js.UndefOr[java.lang.String] => IFly = null,
    extend: java.lang.String = null,
    fadeIn: /* options */ js.UndefOr[js.Any] => IFly = null,
    fadeOut: /* options */ js.UndefOr[js.Any] => IFly = null,
    findParent: (/* selector */ js.UndefOr[java.lang.String], /* limit */ js.UndefOr[js.Any], /* returnEl */ js.UndefOr[Boolean]) => HTMLElement = null,
    findParentNode: (/* selector */ js.UndefOr[java.lang.String], /* limit */ js.UndefOr[js.Any], /* returnEl */ js.UndefOr[Boolean]) => HTMLElement = null,
    first: (/* selector */ js.UndefOr[java.lang.String], /* returnDom */ js.UndefOr[Boolean]) => _ = null,
    focus: /* defer */ js.UndefOr[Double] => IFly = null,
    focusable: () => Boolean = null,
    frame: (/* color */ js.UndefOr[java.lang.String], /* count */ js.UndefOr[Double], /* options */ js.UndefOr[js.Any]) => IFly = null,
    getActiveElement: () => HTMLElement = null,
    getAttribute: (/* name */ js.UndefOr[java.lang.String], /* namespace */ js.UndefOr[java.lang.String]) => java.lang.String = null,
    getAttributeNS: (/* namespace */ js.UndefOr[java.lang.String], /* name */ js.UndefOr[java.lang.String]) => java.lang.String = null,
    getBorderWidth: /* side */ js.UndefOr[java.lang.String] => Double = null,
    getBottom: /* local */ js.UndefOr[Boolean] => Double = null,
    getById: (/* id */ js.UndefOr[java.lang.String], /* asDom */ js.UndefOr[Boolean]) => Unit = null,
    getCenterXY: () => Array = null,
    getColor: (/* attr */ js.UndefOr[java.lang.String], /* defaultValue */ js.UndefOr[java.lang.String], /* prefix */ js.UndefOr[java.lang.String]) => Unit = null,
    getComputedHeight: () => Double = null,
    getComputedWidth: () => Double = null,
    getFrameWidth: /* sides */ js.UndefOr[java.lang.String] => Double = null,
    getHTML: () => Unit = null,
    getHeight: /* contentHeight */ js.UndefOr[Boolean] => Double = null,
    getInitialConfig: /* name */ js.UndefOr[java.lang.String] => _ = null,
    getLeft: /* local */ js.UndefOr[Boolean] => Double = null,
    getLoader: () => IElementLoader = null,
    getLocalX: () => Double = null,
    getLocalXY: () => Array = null,
    getLocalY: () => Double = null,
    getMargin: /* sides */ js.UndefOr[java.lang.String] => _ = null,
    getPadding: /* side */ js.UndefOr[java.lang.String] => Double = null,
    getPageBox: /* asRegion */ js.UndefOr[Boolean] => _ = null,
    getPositioning: /* autoPx */ js.UndefOr[Boolean] => _ = null,
    getRight: /* local */ js.UndefOr[Boolean] => Double = null,
    getScroll: () => _ = null,
    getScrollLeft: () => Double = null,
    getScrollTop: () => Double = null,
    getSize: /* contentSize */ js.UndefOr[Boolean] => _ = null,
    getStyle: (/* property */ js.UndefOr[js.Any], /* inline */ js.UndefOr[Boolean]) => _ = null,
    getStyleSize: () => _ = null,
    getTextWidth: (/* text */ js.UndefOr[java.lang.String], /* min */ js.UndefOr[Double], /* max */ js.UndefOr[Double]) => Double = null,
    getTop: /* local */ js.UndefOr[Boolean] => Double = null,
    getValue: /* asNumber */ js.UndefOr[Boolean] => _ = null,
    getViewSize: () => _ = null,
    getWidth: /* contentWidth */ js.UndefOr[Boolean] => Double = null,
    getX: () => Double = null,
    getXY: () => Array = null,
    getY: () => Double = null,
    ghost: (/* anchor */ js.UndefOr[java.lang.String], /* options */ js.UndefOr[js.Any]) => IFly = null,
    hasCls: /* className */ js.UndefOr[java.lang.String] => Boolean = null,
    hide: /* animate */ js.UndefOr[js.Any] => IFly = null,
    highlight: (/* color */ js.UndefOr[java.lang.String], /* options */ js.UndefOr[js.Any]) => IFly = null,
    hover: (/* overFn */ js.UndefOr[js.Any], /* outFn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => IFly = null,
    id: java.lang.String = null,
    inheritableStatics: js.Any = null,
    initConfig: /* config */ js.UndefOr[js.Any] => IFly = null,
    initDD: (/* group */ js.UndefOr[java.lang.String], /* config */ js.UndefOr[js.Any], /* overrides */ js.UndefOr[js.Any]) => IDD = null,
    initDDProxy: (/* group */ js.UndefOr[java.lang.String], /* config */ js.UndefOr[js.Any], /* overrides */ js.UndefOr[js.Any]) => IDDProxy = null,
    initDDTarget: (/* group */ js.UndefOr[java.lang.String], /* config */ js.UndefOr[js.Any], /* overrides */ js.UndefOr[js.Any]) => IDDTarget = null,
    insertAfter: /* el */ js.UndefOr[js.Any] => IFly = null,
    insertBefore: /* el */ js.UndefOr[js.Any] => IFly = null,
    insertFirst: /* el */ js.UndefOr[js.Any] => IFly = null,
    insertHtml: (/* where */ js.UndefOr[java.lang.String], /* html */ js.UndefOr[java.lang.String], /* returnEl */ js.UndefOr[Boolean]) => _ = null,
    insertSibling: (/* el */ js.UndefOr[js.Any], /* where */ js.UndefOr[java.lang.String], /* returnDom */ js.UndefOr[Boolean]) => IFly = null,
    is: /* selector */ js.UndefOr[java.lang.String] => Boolean = null,
    isBorderBox: () => Boolean = null,
    isDisplayed: () => Boolean = null,
    isFly: js.UndefOr[Boolean] = js.undefined,
    isFocusable: /* asFocusEl */ js.UndefOr[js.Any] => Boolean = null,
    isMasked: () => Boolean = null,
    isScrollable: () => Boolean = null,
    isStyle: (/* style */ js.UndefOr[java.lang.String], /* value */ js.UndefOr[java.lang.String]) => Boolean = null,
    isTransparent: /* prop */ js.UndefOr[java.lang.String] => Boolean = null,
    isVisible: /* deep */ js.UndefOr[Boolean] => Boolean = null,
    last: (/* selector */ js.UndefOr[java.lang.String], /* returnDom */ js.UndefOr[Boolean]) => _ = null,
    load: /* options */ js.UndefOr[js.Any] => IFly = null,
    mask: (/* msg */ js.UndefOr[java.lang.String], /* msgCls */ js.UndefOr[java.lang.String]) => IFly = null,
    mixins: js.Any = null,
    monitorMouseLeave: (/* delay */ js.UndefOr[Double], /* handler */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => _ = null,
    moveTo: (/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double], /* animate */ js.UndefOr[js.Any]) => IFly = null,
    needsTabIndex: () => Unit = null,
    next: (/* selector */ js.UndefOr[java.lang.String], /* returnDom */ js.UndefOr[Boolean]) => _ = null,
    on: (/* eventName */ js.UndefOr[java.lang.String], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => IFly = null,
    originalDisplay: java.lang.String = null,
    parent: (/* selector */ js.UndefOr[java.lang.String], /* returnDom */ js.UndefOr[Boolean]) => _ = null,
    pause: /* seconds */ js.UndefOr[Double] => IFly = null,
    position: (/* pos */ js.UndefOr[java.lang.String], /* zIndex */ js.UndefOr[Double], /* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double]) => Unit = null,
    prev: (/* selector */ js.UndefOr[java.lang.String], /* returnDom */ js.UndefOr[Boolean]) => _ = null,
    puff: /* options */ js.UndefOr[js.Any] => IFly = null,
    purgeAllListeners: () => IFly = null,
    query: /* selector */ js.UndefOr[java.lang.String] => Array = null,
    radioCls: /* className */ js.UndefOr[js.Any] => typings.extjs.Ext.dom.IElement = null,
    relayEvent: (/* eventName */ js.UndefOr[java.lang.String], /* observable */ js.UndefOr[js.Any]) => Unit = null,
    remove: () => Unit = null,
    removeAllListeners: () => IFly = null,
    removeCls: /* className */ js.UndefOr[js.Any] => typings.extjs.Ext.dom.IElement = null,
    removeListener: (/* eventName */ js.UndefOr[java.lang.String], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => IFly = null,
    repaint: () => typings.extjs.Ext.dom.IElement = null,
    replace: /* el */ js.UndefOr[js.Any] => IFly = null,
    replaceCls: (/* oldClassName */ js.UndefOr[java.lang.String], /* newClassName */ js.UndefOr[java.lang.String]) => typings.extjs.Ext.dom.IElement = null,
    replaceWith: /* el */ js.UndefOr[js.Any] => IFly = null,
    requires: Array = null,
    scale: (/* width */ js.UndefOr[Double], /* height */ js.UndefOr[Double], /* options */ js.UndefOr[js.Any]) => IFly = null,
    scroll: (/* direction */ js.UndefOr[java.lang.String], /* distance */ js.UndefOr[Double], /* animate */ js.UndefOr[js.Any]) => Boolean = null,
    scrollBy: (/* deltaX */ js.UndefOr[js.Any], /* deltaY */ js.UndefOr[js.Any], /* animate */ js.UndefOr[js.Any]) => IFly = null,
    scrollIntoView: (/* container */ js.UndefOr[js.Any], /* hscroll */ js.UndefOr[Boolean], /* animate */ js.UndefOr[js.Any], /* highlight */ js.UndefOr[Boolean]) => IFly = null,
    scrollTo: (/* side */ js.UndefOr[java.lang.String], /* value */ js.UndefOr[Double], /* animate */ js.UndefOr[js.Any]) => IFly = null,
    select: (/* selector */ js.UndefOr[java.lang.String], /* unique */ js.UndefOr[Boolean]) => typings.extjs.Ext.ICompositeElement = null,
    selectable: () => IFly = null,
    self: IClass = null,
    serializeForm: /* form */ js.UndefOr[js.Any] => java.lang.String = null,
    set: (/* o */ js.UndefOr[js.Any], /* useSet */ js.UndefOr[Boolean]) => typings.extjs.Ext.dom.IElement = null,
    setBottom: /* bottom */ js.UndefOr[js.Any] => IFly = null,
    setBounds: (/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double], /* width */ js.UndefOr[js.Any], /* height */ js.UndefOr[js.Any], /* animate */ js.UndefOr[js.Any]) => IFly = null,
    setDisplayed: /* value */ js.UndefOr[js.Any] => IFly = null,
    setHTML: /* html */ js.UndefOr[java.lang.String] => typings.extjs.Ext.IElement = null,
    setHeight: /* height */ js.UndefOr[js.Any] => typings.extjs.Ext.dom.IElement = null,
    setLeft: /* left */ js.UndefOr[js.Any] => IFly = null,
    setLeftTop: (/* left */ js.UndefOr[js.Any], /* top */ js.UndefOr[js.Any]) => IFly = null,
    setLocation: (/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double], /* animate */ js.UndefOr[js.Any]) => IFly = null,
    setOpacity: (/* opacity */ js.UndefOr[Double], /* animate */ js.UndefOr[js.Any]) => IFly = null,
    setPositioning: /* posCfg */ js.UndefOr[js.Any] => IFly = null,
    setRight: /* right */ js.UndefOr[js.Any] => IFly = null,
    setScrollLeft: /* left */ js.UndefOr[Double] => IFly = null,
    setScrollTop: /* top */ js.UndefOr[Double] => IFly = null,
    setSize: (/* width */ js.UndefOr[js.Any], /* height */ js.UndefOr[js.Any]) => typings.extjs.Ext.dom.IElement = null,
    setStyle: (/* property */ js.UndefOr[js.Any], /* value */ js.UndefOr[java.lang.String]) => typings.extjs.Ext.dom.IElement = null,
    setTop: /* top */ js.UndefOr[js.Any] => IFly = null,
    setVisibilityMode: /* mode */ js.UndefOr[js.Any] => IFly = null,
    setVisible: (/* visible */ js.UndefOr[Boolean], /* animate */ js.UndefOr[js.Any]) => IFly = null,
    setWidth: /* width */ js.UndefOr[js.Any] => typings.extjs.Ext.dom.IElement = null,
    shift: /* options */ js.UndefOr[js.Any] => IFly = null,
    show: /* animate */ js.UndefOr[js.Any] => IFly = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    slideIn: (/* anchor */ js.UndefOr[java.lang.String], /* options */ js.UndefOr[js.Any]) => IFly = null,
    slideOut: (/* anchor */ js.UndefOr[java.lang.String], /* options */ js.UndefOr[js.Any]) => IFly = null,
    statics: js.Any = null,
    swallowEvent: (/* eventName */ js.UndefOr[js.Any], /* preventDefault */ js.UndefOr[Boolean]) => IFly = null,
    switchOff: /* options */ js.UndefOr[js.Any] => IFly = null,
    toggle: /* animate */ js.UndefOr[js.Any] => IFly = null,
    toggleCls: /* className */ js.UndefOr[java.lang.String] => typings.extjs.Ext.dom.IElement = null,
    un: (/* eventName */ js.UndefOr[java.lang.String], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => IFly = null,
    unclip: () => IFly = null,
    unmask: () => Unit = null,
    unselectable: () => IFly = null,
    up: (/* selector */ js.UndefOr[java.lang.String], /* limit */ js.UndefOr[js.Any], /* returnDom */ js.UndefOr[Boolean]) => typings.extjs.Ext.IElement = null,
    update: (/* html */ js.UndefOr[java.lang.String], /* loadScripts */ js.UndefOr[Boolean], /* callback */ js.UndefOr[js.Any]) => IFly = null,
    uses: Array = null,
    wrap: (/* config */ js.UndefOr[js.Any], /* returnDom */ js.UndefOr[Boolean], /* selector */ js.UndefOr[java.lang.String]) => _ = null
  ): IFly = {
    val __obj = js.Dynamic.literal()
    if (ASCLASS != null) __obj.updateDynamic("ASCLASS")(ASCLASS.asInstanceOf[js.Any])
    if (DISPLAY != null) __obj.updateDynamic("DISPLAY")(DISPLAY.asInstanceOf[js.Any])
    if (OFFSETS != null) __obj.updateDynamic("OFFSETS")(OFFSETS.asInstanceOf[js.Any])
    if (VISIBILITY != null) __obj.updateDynamic("VISIBILITY")(VISIBILITY.asInstanceOf[js.Any])
    if (addCls != null) __obj.updateDynamic("addCls")(js.Any.fromFunction1(addCls))
    if (addClsOnClick != null) __obj.updateDynamic("addClsOnClick")(js.Any.fromFunction3(addClsOnClick))
    if (addClsOnFocus != null) __obj.updateDynamic("addClsOnFocus")(js.Any.fromFunction3(addClsOnFocus))
    if (addClsOnOver != null) __obj.updateDynamic("addClsOnOver")(js.Any.fromFunction3(addClsOnOver))
    if (addKeyListener != null) __obj.updateDynamic("addKeyListener")(js.Any.fromFunction3(addKeyListener))
    if (addKeyMap != null) __obj.updateDynamic("addKeyMap")(js.Any.fromFunction1(addKeyMap))
    if (addListener != null) __obj.updateDynamic("addListener")(js.Any.fromFunction4(addListener))
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (animate != null) __obj.updateDynamic("animate")(js.Any.fromFunction1(animate))
    if (appendChild != null) __obj.updateDynamic("appendChild")(js.Any.fromFunction2(appendChild))
    if (appendTo != null) __obj.updateDynamic("appendTo")(js.Any.fromFunction1(appendTo))
    if (applyStyles != null) __obj.updateDynamic("applyStyles")(js.Any.fromFunction1(applyStyles))
    if (!js.isUndefined(autoBoxAdjust)) __obj.updateDynamic("autoBoxAdjust")(autoBoxAdjust.asInstanceOf[js.Any])
    if (blur != null) __obj.updateDynamic("blur")(js.Any.fromFunction0(blur))
    if (boxWrap != null) __obj.updateDynamic("boxWrap")(js.Any.fromFunction1(boxWrap))
    if (cacheScrollValues != null) __obj.updateDynamic("cacheScrollValues")(js.Any.fromFunction0(cacheScrollValues))
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (center != null) __obj.updateDynamic("center")(js.Any.fromFunction1(center))
    if (child != null) __obj.updateDynamic("child")(js.Any.fromFunction2(child))
    if (clean != null) __obj.updateDynamic("clean")(js.Any.fromFunction1(clean))
    if (clearListeners != null) __obj.updateDynamic("clearListeners")(js.Any.fromFunction0(clearListeners))
    if (clearOpacity != null) __obj.updateDynamic("clearOpacity")(js.Any.fromFunction0(clearOpacity))
    if (clearPositioning != null) __obj.updateDynamic("clearPositioning")(js.Any.fromFunction1(clearPositioning))
    if (clip != null) __obj.updateDynamic("clip")(js.Any.fromFunction0(clip))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (contains != null) __obj.updateDynamic("contains")(js.Any.fromFunction1(contains))
    if (createChild != null) __obj.updateDynamic("createChild")(js.Any.fromFunction3(createChild))
    if (createProxy != null) __obj.updateDynamic("createProxy")(js.Any.fromFunction3(createProxy))
    if (createShim != null) __obj.updateDynamic("createShim")(js.Any.fromFunction0(createShim))
    if (defaultUnit != null) __obj.updateDynamic("defaultUnit")(defaultUnit.asInstanceOf[js.Any])
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (dom != null) __obj.updateDynamic("dom")(dom.asInstanceOf[js.Any])
    if (down != null) __obj.updateDynamic("down")(js.Any.fromFunction2(down))
    if (enableDisplayMode != null) __obj.updateDynamic("enableDisplayMode")(js.Any.fromFunction1(enableDisplayMode))
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (fadeIn != null) __obj.updateDynamic("fadeIn")(js.Any.fromFunction1(fadeIn))
    if (fadeOut != null) __obj.updateDynamic("fadeOut")(js.Any.fromFunction1(fadeOut))
    if (findParent != null) __obj.updateDynamic("findParent")(js.Any.fromFunction3(findParent))
    if (findParentNode != null) __obj.updateDynamic("findParentNode")(js.Any.fromFunction3(findParentNode))
    if (first != null) __obj.updateDynamic("first")(js.Any.fromFunction2(first))
    if (focus != null) __obj.updateDynamic("focus")(js.Any.fromFunction1(focus))
    if (focusable != null) __obj.updateDynamic("focusable")(js.Any.fromFunction0(focusable))
    if (frame != null) __obj.updateDynamic("frame")(js.Any.fromFunction3(frame))
    if (getActiveElement != null) __obj.updateDynamic("getActiveElement")(js.Any.fromFunction0(getActiveElement))
    if (getAttribute != null) __obj.updateDynamic("getAttribute")(js.Any.fromFunction2(getAttribute))
    if (getAttributeNS != null) __obj.updateDynamic("getAttributeNS")(js.Any.fromFunction2(getAttributeNS))
    if (getBorderWidth != null) __obj.updateDynamic("getBorderWidth")(js.Any.fromFunction1(getBorderWidth))
    if (getBottom != null) __obj.updateDynamic("getBottom")(js.Any.fromFunction1(getBottom))
    if (getById != null) __obj.updateDynamic("getById")(js.Any.fromFunction2(getById))
    if (getCenterXY != null) __obj.updateDynamic("getCenterXY")(js.Any.fromFunction0(getCenterXY))
    if (getColor != null) __obj.updateDynamic("getColor")(js.Any.fromFunction3(getColor))
    if (getComputedHeight != null) __obj.updateDynamic("getComputedHeight")(js.Any.fromFunction0(getComputedHeight))
    if (getComputedWidth != null) __obj.updateDynamic("getComputedWidth")(js.Any.fromFunction0(getComputedWidth))
    if (getFrameWidth != null) __obj.updateDynamic("getFrameWidth")(js.Any.fromFunction1(getFrameWidth))
    if (getHTML != null) __obj.updateDynamic("getHTML")(js.Any.fromFunction0(getHTML))
    if (getHeight != null) __obj.updateDynamic("getHeight")(js.Any.fromFunction1(getHeight))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (getLeft != null) __obj.updateDynamic("getLeft")(js.Any.fromFunction1(getLeft))
    if (getLoader != null) __obj.updateDynamic("getLoader")(js.Any.fromFunction0(getLoader))
    if (getLocalX != null) __obj.updateDynamic("getLocalX")(js.Any.fromFunction0(getLocalX))
    if (getLocalXY != null) __obj.updateDynamic("getLocalXY")(js.Any.fromFunction0(getLocalXY))
    if (getLocalY != null) __obj.updateDynamic("getLocalY")(js.Any.fromFunction0(getLocalY))
    if (getMargin != null) __obj.updateDynamic("getMargin")(js.Any.fromFunction1(getMargin))
    if (getPadding != null) __obj.updateDynamic("getPadding")(js.Any.fromFunction1(getPadding))
    if (getPageBox != null) __obj.updateDynamic("getPageBox")(js.Any.fromFunction1(getPageBox))
    if (getPositioning != null) __obj.updateDynamic("getPositioning")(js.Any.fromFunction1(getPositioning))
    if (getRight != null) __obj.updateDynamic("getRight")(js.Any.fromFunction1(getRight))
    if (getScroll != null) __obj.updateDynamic("getScroll")(js.Any.fromFunction0(getScroll))
    if (getScrollLeft != null) __obj.updateDynamic("getScrollLeft")(js.Any.fromFunction0(getScrollLeft))
    if (getScrollTop != null) __obj.updateDynamic("getScrollTop")(js.Any.fromFunction0(getScrollTop))
    if (getSize != null) __obj.updateDynamic("getSize")(js.Any.fromFunction1(getSize))
    if (getStyle != null) __obj.updateDynamic("getStyle")(js.Any.fromFunction2(getStyle))
    if (getStyleSize != null) __obj.updateDynamic("getStyleSize")(js.Any.fromFunction0(getStyleSize))
    if (getTextWidth != null) __obj.updateDynamic("getTextWidth")(js.Any.fromFunction3(getTextWidth))
    if (getTop != null) __obj.updateDynamic("getTop")(js.Any.fromFunction1(getTop))
    if (getValue != null) __obj.updateDynamic("getValue")(js.Any.fromFunction1(getValue))
    if (getViewSize != null) __obj.updateDynamic("getViewSize")(js.Any.fromFunction0(getViewSize))
    if (getWidth != null) __obj.updateDynamic("getWidth")(js.Any.fromFunction1(getWidth))
    if (getX != null) __obj.updateDynamic("getX")(js.Any.fromFunction0(getX))
    if (getXY != null) __obj.updateDynamic("getXY")(js.Any.fromFunction0(getXY))
    if (getY != null) __obj.updateDynamic("getY")(js.Any.fromFunction0(getY))
    if (ghost != null) __obj.updateDynamic("ghost")(js.Any.fromFunction2(ghost))
    if (hasCls != null) __obj.updateDynamic("hasCls")(js.Any.fromFunction1(hasCls))
    if (hide != null) __obj.updateDynamic("hide")(js.Any.fromFunction1(hide))
    if (highlight != null) __obj.updateDynamic("highlight")(js.Any.fromFunction2(highlight))
    if (hover != null) __obj.updateDynamic("hover")(js.Any.fromFunction4(hover))
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (initDD != null) __obj.updateDynamic("initDD")(js.Any.fromFunction3(initDD))
    if (initDDProxy != null) __obj.updateDynamic("initDDProxy")(js.Any.fromFunction3(initDDProxy))
    if (initDDTarget != null) __obj.updateDynamic("initDDTarget")(js.Any.fromFunction3(initDDTarget))
    if (insertAfter != null) __obj.updateDynamic("insertAfter")(js.Any.fromFunction1(insertAfter))
    if (insertBefore != null) __obj.updateDynamic("insertBefore")(js.Any.fromFunction1(insertBefore))
    if (insertFirst != null) __obj.updateDynamic("insertFirst")(js.Any.fromFunction1(insertFirst))
    if (insertHtml != null) __obj.updateDynamic("insertHtml")(js.Any.fromFunction3(insertHtml))
    if (insertSibling != null) __obj.updateDynamic("insertSibling")(js.Any.fromFunction3(insertSibling))
    if (is != null) __obj.updateDynamic("is")(js.Any.fromFunction1(is))
    if (isBorderBox != null) __obj.updateDynamic("isBorderBox")(js.Any.fromFunction0(isBorderBox))
    if (isDisplayed != null) __obj.updateDynamic("isDisplayed")(js.Any.fromFunction0(isDisplayed))
    if (!js.isUndefined(isFly)) __obj.updateDynamic("isFly")(isFly.asInstanceOf[js.Any])
    if (isFocusable != null) __obj.updateDynamic("isFocusable")(js.Any.fromFunction1(isFocusable))
    if (isMasked != null) __obj.updateDynamic("isMasked")(js.Any.fromFunction0(isMasked))
    if (isScrollable != null) __obj.updateDynamic("isScrollable")(js.Any.fromFunction0(isScrollable))
    if (isStyle != null) __obj.updateDynamic("isStyle")(js.Any.fromFunction2(isStyle))
    if (isTransparent != null) __obj.updateDynamic("isTransparent")(js.Any.fromFunction1(isTransparent))
    if (isVisible != null) __obj.updateDynamic("isVisible")(js.Any.fromFunction1(isVisible))
    if (last != null) __obj.updateDynamic("last")(js.Any.fromFunction2(last))
    if (load != null) __obj.updateDynamic("load")(js.Any.fromFunction1(load))
    if (mask != null) __obj.updateDynamic("mask")(js.Any.fromFunction2(mask))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (monitorMouseLeave != null) __obj.updateDynamic("monitorMouseLeave")(js.Any.fromFunction3(monitorMouseLeave))
    if (moveTo != null) __obj.updateDynamic("moveTo")(js.Any.fromFunction3(moveTo))
    if (needsTabIndex != null) __obj.updateDynamic("needsTabIndex")(js.Any.fromFunction0(needsTabIndex))
    if (next != null) __obj.updateDynamic("next")(js.Any.fromFunction2(next))
    if (on != null) __obj.updateDynamic("on")(js.Any.fromFunction4(on))
    if (originalDisplay != null) __obj.updateDynamic("originalDisplay")(originalDisplay.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(js.Any.fromFunction2(parent))
    if (pause != null) __obj.updateDynamic("pause")(js.Any.fromFunction1(pause))
    if (position != null) __obj.updateDynamic("position")(js.Any.fromFunction4(position))
    if (prev != null) __obj.updateDynamic("prev")(js.Any.fromFunction2(prev))
    if (puff != null) __obj.updateDynamic("puff")(js.Any.fromFunction1(puff))
    if (purgeAllListeners != null) __obj.updateDynamic("purgeAllListeners")(js.Any.fromFunction0(purgeAllListeners))
    if (query != null) __obj.updateDynamic("query")(js.Any.fromFunction1(query))
    if (radioCls != null) __obj.updateDynamic("radioCls")(js.Any.fromFunction1(radioCls))
    if (relayEvent != null) __obj.updateDynamic("relayEvent")(js.Any.fromFunction2(relayEvent))
    if (remove != null) __obj.updateDynamic("remove")(js.Any.fromFunction0(remove))
    if (removeAllListeners != null) __obj.updateDynamic("removeAllListeners")(js.Any.fromFunction0(removeAllListeners))
    if (removeCls != null) __obj.updateDynamic("removeCls")(js.Any.fromFunction1(removeCls))
    if (removeListener != null) __obj.updateDynamic("removeListener")(js.Any.fromFunction3(removeListener))
    if (repaint != null) __obj.updateDynamic("repaint")(js.Any.fromFunction0(repaint))
    if (replace != null) __obj.updateDynamic("replace")(js.Any.fromFunction1(replace))
    if (replaceCls != null) __obj.updateDynamic("replaceCls")(js.Any.fromFunction2(replaceCls))
    if (replaceWith != null) __obj.updateDynamic("replaceWith")(js.Any.fromFunction1(replaceWith))
    if (requires != null) __obj.updateDynamic("requires")(requires.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(js.Any.fromFunction3(scale))
    if (scroll != null) __obj.updateDynamic("scroll")(js.Any.fromFunction3(scroll))
    if (scrollBy != null) __obj.updateDynamic("scrollBy")(js.Any.fromFunction3(scrollBy))
    if (scrollIntoView != null) __obj.updateDynamic("scrollIntoView")(js.Any.fromFunction4(scrollIntoView))
    if (scrollTo != null) __obj.updateDynamic("scrollTo")(js.Any.fromFunction3(scrollTo))
    if (select != null) __obj.updateDynamic("select")(js.Any.fromFunction2(select))
    if (selectable != null) __obj.updateDynamic("selectable")(js.Any.fromFunction0(selectable))
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (serializeForm != null) __obj.updateDynamic("serializeForm")(js.Any.fromFunction1(serializeForm))
    if (set != null) __obj.updateDynamic("set")(js.Any.fromFunction2(set))
    if (setBottom != null) __obj.updateDynamic("setBottom")(js.Any.fromFunction1(setBottom))
    if (setBounds != null) __obj.updateDynamic("setBounds")(js.Any.fromFunction5(setBounds))
    if (setDisplayed != null) __obj.updateDynamic("setDisplayed")(js.Any.fromFunction1(setDisplayed))
    if (setHTML != null) __obj.updateDynamic("setHTML")(js.Any.fromFunction1(setHTML))
    if (setHeight != null) __obj.updateDynamic("setHeight")(js.Any.fromFunction1(setHeight))
    if (setLeft != null) __obj.updateDynamic("setLeft")(js.Any.fromFunction1(setLeft))
    if (setLeftTop != null) __obj.updateDynamic("setLeftTop")(js.Any.fromFunction2(setLeftTop))
    if (setLocation != null) __obj.updateDynamic("setLocation")(js.Any.fromFunction3(setLocation))
    if (setOpacity != null) __obj.updateDynamic("setOpacity")(js.Any.fromFunction2(setOpacity))
    if (setPositioning != null) __obj.updateDynamic("setPositioning")(js.Any.fromFunction1(setPositioning))
    if (setRight != null) __obj.updateDynamic("setRight")(js.Any.fromFunction1(setRight))
    if (setScrollLeft != null) __obj.updateDynamic("setScrollLeft")(js.Any.fromFunction1(setScrollLeft))
    if (setScrollTop != null) __obj.updateDynamic("setScrollTop")(js.Any.fromFunction1(setScrollTop))
    if (setSize != null) __obj.updateDynamic("setSize")(js.Any.fromFunction2(setSize))
    if (setStyle != null) __obj.updateDynamic("setStyle")(js.Any.fromFunction2(setStyle))
    if (setTop != null) __obj.updateDynamic("setTop")(js.Any.fromFunction1(setTop))
    if (setVisibilityMode != null) __obj.updateDynamic("setVisibilityMode")(js.Any.fromFunction1(setVisibilityMode))
    if (setVisible != null) __obj.updateDynamic("setVisible")(js.Any.fromFunction2(setVisible))
    if (setWidth != null) __obj.updateDynamic("setWidth")(js.Any.fromFunction1(setWidth))
    if (shift != null) __obj.updateDynamic("shift")(js.Any.fromFunction1(shift))
    if (show != null) __obj.updateDynamic("show")(js.Any.fromFunction1(show))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (slideIn != null) __obj.updateDynamic("slideIn")(js.Any.fromFunction2(slideIn))
    if (slideOut != null) __obj.updateDynamic("slideOut")(js.Any.fromFunction2(slideOut))
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (swallowEvent != null) __obj.updateDynamic("swallowEvent")(js.Any.fromFunction2(swallowEvent))
    if (switchOff != null) __obj.updateDynamic("switchOff")(js.Any.fromFunction1(switchOff))
    if (toggle != null) __obj.updateDynamic("toggle")(js.Any.fromFunction1(toggle))
    if (toggleCls != null) __obj.updateDynamic("toggleCls")(js.Any.fromFunction1(toggleCls))
    if (un != null) __obj.updateDynamic("un")(js.Any.fromFunction3(un))
    if (unclip != null) __obj.updateDynamic("unclip")(js.Any.fromFunction0(unclip))
    if (unmask != null) __obj.updateDynamic("unmask")(js.Any.fromFunction0(unmask))
    if (unselectable != null) __obj.updateDynamic("unselectable")(js.Any.fromFunction0(unselectable))
    if (up != null) __obj.updateDynamic("up")(js.Any.fromFunction3(up))
    if (update != null) __obj.updateDynamic("update")(js.Any.fromFunction3(update))
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    if (wrap != null) __obj.updateDynamic("wrap")(js.Any.fromFunction3(wrap))
    __obj.asInstanceOf[IFly]
  }
}

