package typings.extjs.Ext

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFlashComponent extends IComponent {
  /** [Property] (String) */
  var EXPRESS_INSTALL_URL: js.UndefOr[java.lang.String] = js.native
  /** [Config Option] (String) */
  var backgroundColor: js.UndefOr[java.lang.String] = js.native
  /** [Config Option] (Boolean) */
  var expressInstall: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Object) */
  var flashAttributes: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Object) */
  var flashParams: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Object) */
  var flashVars: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String) */
  var flashVersion: js.UndefOr[java.lang.String] = js.native
  /** [Method] Retrieves the id of the SWF object embed element  */
  var getSwfId: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Property] (Ext.Element) */
  var swf: js.UndefOr[IElement] = js.native
  /** [Config Option] (String/Number) */
  var swfHeight: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String/Number) */
  var swfWidth: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String) */
  var url: js.UndefOr[java.lang.String] = js.native
  /** [Config Option] (String) */
  var wmode: js.UndefOr[java.lang.String] = js.native
}

object IFlashComponent {
  @scala.inline
  def apply(): IFlashComponent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFlashComponent]
  }
  @scala.inline
  implicit class IFlashComponentOps[Self <: IFlashComponent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEXPRESS_INSTALL_URL(value: java.lang.String): Self = this.set("EXPRESS_INSTALL_URL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEXPRESS_INSTALL_URL: Self = this.set("EXPRESS_INSTALL_URL", js.undefined)
    @scala.inline
    def setBackgroundColor(value: java.lang.String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    @scala.inline
    def setExpressInstall(value: Boolean): Self = this.set("expressInstall", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpressInstall: Self = this.set("expressInstall", js.undefined)
    @scala.inline
    def setFlashAttributes(value: js.Any): Self = this.set("flashAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlashAttributes: Self = this.set("flashAttributes", js.undefined)
    @scala.inline
    def setFlashParams(value: js.Any): Self = this.set("flashParams", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlashParams: Self = this.set("flashParams", js.undefined)
    @scala.inline
    def setFlashVars(value: js.Any): Self = this.set("flashVars", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlashVars: Self = this.set("flashVars", js.undefined)
    @scala.inline
    def setFlashVersion(value: java.lang.String): Self = this.set("flashVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlashVersion: Self = this.set("flashVersion", js.undefined)
    @scala.inline
    def setGetSwfId(value: () => Unit): Self = this.set("getSwfId", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetSwfId: Self = this.set("getSwfId", js.undefined)
    @scala.inline
    def setSwf(value: IElement): Self = this.set("swf", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSwf: Self = this.set("swf", js.undefined)
    @scala.inline
    def setSwfHeight(value: js.Any): Self = this.set("swfHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSwfHeight: Self = this.set("swfHeight", js.undefined)
    @scala.inline
    def setSwfWidth(value: js.Any): Self = this.set("swfWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSwfWidth: Self = this.set("swfWidth", js.undefined)
    @scala.inline
    def setUrl(value: java.lang.String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    @scala.inline
    def setWmode(value: java.lang.String): Self = this.set("wmode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWmode: Self = this.set("wmode", js.undefined)
  }
  
}

