package typings.extjs.Ext.flash

import typings.extjs.Ext.IElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IComponent
  extends typings.extjs.Ext.IComponent {
  /** [Property] (String) */
  var EXPRESS_INSTALL_URL: js.UndefOr[String] = js.undefined
  /** [Config Option] (String) */
  var backgroundColor: js.UndefOr[String] = js.undefined
  /** [Config Option] (Boolean) */
  var expressInstall: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Object) */
  var flashAttributes: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Object) */
  var flashParams: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Object) */
  var flashVars: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var flashVersion: js.UndefOr[String] = js.undefined
  /** [Method] Retrieves the id of the SWF object embed element  */
  var getSwfId: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Property] (Ext.Element) */
  var swf: js.UndefOr[IElement] = js.undefined
  /** [Config Option] (String/Number) */
  var swfHeight: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String/Number) */
  var swfWidth: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var url: js.UndefOr[String] = js.undefined
  /** [Config Option] (String) */
  var wmode: js.UndefOr[String] = js.undefined
}

object IComponent {
  @scala.inline
  def apply(
    EXPRESS_INSTALL_URL: String = null,
    IComponent: typings.extjs.Ext.IComponent = null,
    backgroundColor: String = null,
    expressInstall: js.UndefOr[Boolean] = js.undefined,
    flashAttributes: js.Any = null,
    flashParams: js.Any = null,
    flashVars: js.Any = null,
    flashVersion: String = null,
    getSwfId: () => Unit = null,
    swf: IElement = null,
    swfHeight: js.Any = null,
    swfWidth: js.Any = null,
    url: String = null,
    wmode: String = null
  ): IComponent = {
    val __obj = js.Dynamic.literal()
    if (EXPRESS_INSTALL_URL != null) __obj.updateDynamic("EXPRESS_INSTALL_URL")(EXPRESS_INSTALL_URL.asInstanceOf[js.Any])
    if (IComponent != null) js.Dynamic.global.Object.assign(__obj, IComponent)
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (!js.isUndefined(expressInstall)) __obj.updateDynamic("expressInstall")(expressInstall.get.asInstanceOf[js.Any])
    if (flashAttributes != null) __obj.updateDynamic("flashAttributes")(flashAttributes.asInstanceOf[js.Any])
    if (flashParams != null) __obj.updateDynamic("flashParams")(flashParams.asInstanceOf[js.Any])
    if (flashVars != null) __obj.updateDynamic("flashVars")(flashVars.asInstanceOf[js.Any])
    if (flashVersion != null) __obj.updateDynamic("flashVersion")(flashVersion.asInstanceOf[js.Any])
    if (getSwfId != null) __obj.updateDynamic("getSwfId")(js.Any.fromFunction0(getSwfId))
    if (swf != null) __obj.updateDynamic("swf")(swf.asInstanceOf[js.Any])
    if (swfHeight != null) __obj.updateDynamic("swfHeight")(swfHeight.asInstanceOf[js.Any])
    if (swfWidth != null) __obj.updateDynamic("swfWidth")(swfWidth.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (wmode != null) __obj.updateDynamic("wmode")(wmode.asInstanceOf[js.Any])
    __obj.asInstanceOf[IComponent]
  }
}

