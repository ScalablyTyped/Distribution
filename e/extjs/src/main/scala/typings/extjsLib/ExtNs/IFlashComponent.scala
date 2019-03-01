package typings
package extjsLib.ExtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFlashComponent extends IComponent {
  /** [Property] (String) */
  var EXPRESS_INSTALL_URL: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var backgroundColor: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Boolean) */
  var expressInstall: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Object) */
  var flashAttributes: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Object) */
  var flashParams: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Object) */
  var flashVars: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var flashVersion: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Retrieves the id of the SWF object embed element  */
  var getSwfId: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Property] (Ext.Element) */
  var swf: js.UndefOr[IElement] = js.undefined
  /** [Config Option] (String/Number) */
  var swfHeight: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String/Number) */
  var swfWidth: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var url: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var wmode: js.UndefOr[java.lang.String] = js.undefined
}

object IFlashComponent {
  @scala.inline
  def apply(
    EXPRESS_INSTALL_URL: java.lang.String = null,
    IComponent: IComponent = null,
    afterRender: js.Function0[scala.Unit] = null,
    backgroundColor: java.lang.String = null,
    beforeDestroy: js.Function0[scala.Unit] = null,
    expressInstall: js.UndefOr[scala.Boolean] = js.undefined,
    flashAttributes: js.Any = null,
    flashParams: js.Any = null,
    flashVars: js.Any = null,
    flashVersion: java.lang.String = null,
    getSwfId: js.Function0[scala.Unit] = null,
    initComponent: js.Function0[scala.Unit] = null,
    renderTpl: js.Any = null,
    swf: IElement = null,
    swfHeight: js.Any = null,
    swfWidth: js.Any = null,
    url: java.lang.String = null,
    wmode: java.lang.String = null
  ): IFlashComponent = {
    val __obj = js.Dynamic.literal()
    if (EXPRESS_INSTALL_URL != null) __obj.updateDynamic("EXPRESS_INSTALL_URL")(EXPRESS_INSTALL_URL)
    js.Dynamic.global.Object.assign(__obj, IComponent)
    if (afterRender != null) __obj.updateDynamic("afterRender")(afterRender)
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (beforeDestroy != null) __obj.updateDynamic("beforeDestroy")(beforeDestroy)
    if (!js.isUndefined(expressInstall)) __obj.updateDynamic("expressInstall")(expressInstall)
    if (flashAttributes != null) __obj.updateDynamic("flashAttributes")(flashAttributes)
    if (flashParams != null) __obj.updateDynamic("flashParams")(flashParams)
    if (flashVars != null) __obj.updateDynamic("flashVars")(flashVars)
    if (flashVersion != null) __obj.updateDynamic("flashVersion")(flashVersion)
    if (getSwfId != null) __obj.updateDynamic("getSwfId")(getSwfId)
    if (initComponent != null) __obj.updateDynamic("initComponent")(initComponent)
    if (renderTpl != null) __obj.updateDynamic("renderTpl")(renderTpl)
    if (swf != null) __obj.updateDynamic("swf")(swf)
    if (swfHeight != null) __obj.updateDynamic("swfHeight")(swfHeight)
    if (swfWidth != null) __obj.updateDynamic("swfWidth")(swfWidth)
    if (url != null) __obj.updateDynamic("url")(url)
    if (wmode != null) __obj.updateDynamic("wmode")(wmode)
    __obj.asInstanceOf[IFlashComponent]
  }
}

