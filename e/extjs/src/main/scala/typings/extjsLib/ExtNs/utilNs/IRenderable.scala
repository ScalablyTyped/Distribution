package typings
package extjsLib.ExtNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRenderable
  extends extjsLib.ExtNs.IBase {
  /** [Method] Allows addition of behavior after rendering is complete  */
  var afterRender: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Handles autoRender  */
  var doAutoRender: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Ensures that this component is attached to document body
  		* @param runLayout Boolean True to run the component's layout.
  		*/
  var ensureAttachedToBody: js.UndefOr[js.Function1[/* runLayout */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] This function takes the position argument passed to onRender and returns a DOM element that you can use in the insert
  		* @param position String/Number/Ext.dom.Element/HTMLElement Index, element id or element you want to put this component before.
  		* @returns HTMLElement DOM element that you can use in the insertBefore
  		*/
  var getInsertPosition: js.UndefOr[js.Function1[/* position */ js.UndefOr[js.Any], stdLib.HTMLElement]] = js.undefined
  /** [Method] Initialized the renderData to be used when rendering the renderTpl
  		* @returns Object Object with keys and values that are going to be applied to the renderTpl
  		*/
  var initRenderData: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Template method called when this Component s DOM structure is created
  		* @param parentNode Ext.core.Element The parent Element in which this Component's encapsulating element is contained.
  		* @param containerIdx Number The index within the parent Container's child collection of this Component.
  		*/
  var onRender: js.UndefOr[
    js.Function2[
      /* parentNode */ js.UndefOr[extjsLib.ExtNs.coreNs.IElement], 
      /* containerIdx */ js.UndefOr[scala.Double], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Renders the Component into the passed HTML element
  		* @param container Ext.Element/HTMLElement/String The element this Component should be rendered into. If it is being created from existing markup, this should be omitted.
  		* @param position String/Number The element ID or DOM node index within the container before which this component will be inserted (defaults to appending to the end of the container)
  		*/
  var render: js.UndefOr[
    js.Function2[/* container */ js.UndefOr[js.Any], /* position */ js.UndefOr[js.Any], scala.Unit]
  ] = js.undefined
}

object IRenderable {
  @scala.inline
  def apply(
    afterRender: js.Function0[scala.Unit] = null,
    alias: extjsLib.ExtNs.Array = null,
    alternateClassName: js.Any = null,
    callOverridden: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callParent: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callSuper: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    config: js.Any = null,
    doAutoRender: js.Function0[scala.Unit] = null,
    ensureAttachedToBody: js.Function1[/* runLayout */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    extend: java.lang.String = null,
    getInitialConfig: js.Function1[/* name */ js.UndefOr[java.lang.String], _] = null,
    getInsertPosition: js.Function1[/* position */ js.UndefOr[js.Any], stdLib.HTMLElement] = null,
    inheritableStatics: js.Any = null,
    initConfig: js.Function1[/* config */ js.UndefOr[js.Any], IRenderable] = null,
    initRenderData: js.Function0[_] = null,
    mixins: js.Any = null,
    onRender: js.Function2[
      /* parentNode */ js.UndefOr[extjsLib.ExtNs.coreNs.IElement], 
      /* containerIdx */ js.UndefOr[scala.Double], 
      scala.Unit
    ] = null,
    render: js.Function2[/* container */ js.UndefOr[js.Any], /* position */ js.UndefOr[js.Any], scala.Unit] = null,
    requires: extjsLib.ExtNs.Array = null,
    self: extjsLib.ExtNs.IClass = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    statics: js.Any = null,
    uses: extjsLib.ExtNs.Array = null
  ): IRenderable = {
    val __obj = js.Dynamic.literal()
    if (afterRender != null) __obj.updateDynamic("afterRender")(afterRender)
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(callOverridden)
    if (callParent != null) __obj.updateDynamic("callParent")(callParent)
    if (callSuper != null) __obj.updateDynamic("callSuper")(callSuper)
    if (config != null) __obj.updateDynamic("config")(config)
    if (doAutoRender != null) __obj.updateDynamic("doAutoRender")(doAutoRender)
    if (ensureAttachedToBody != null) __obj.updateDynamic("ensureAttachedToBody")(ensureAttachedToBody)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(getInitialConfig)
    if (getInsertPosition != null) __obj.updateDynamic("getInsertPosition")(getInsertPosition)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(initConfig)
    if (initRenderData != null) __obj.updateDynamic("initRenderData")(initRenderData)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (onRender != null) __obj.updateDynamic("onRender")(onRender)
    if (render != null) __obj.updateDynamic("render")(render)
    if (requires != null) __obj.updateDynamic("requires")(requires)
    if (self != null) __obj.updateDynamic("self")(self)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[IRenderable]
  }
}

