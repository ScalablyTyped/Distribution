package typings.featherlight.Featherlight

import typings.featherlight.JQuery
import typings.jquery.JQueryEventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Config extends js.Object {
  var afterClose: js.UndefOr[js.Function1[/* event */ JQueryEventObject, _]] = js.native
  var afterContent: js.UndefOr[js.Function1[/* event */ JQueryEventObject, _]] = js.native
  var afterOpen: js.UndefOr[js.Function1[/* event */ JQueryEventObject, _]] = js.native
  var ajax: js.UndefOr[String] = js.native
  var background: js.UndefOr[String] = js.native
  var beforeClose: js.UndefOr[js.Function1[/* event */ JQueryEventObject, _]] = js.native
  var beforeContent: js.UndefOr[js.Function1[/* event */ JQueryEventObject, _]] = js.native
  var beforeOpen: js.UndefOr[js.Function1[/* event */ JQueryEventObject, _]] = js.native
  var closeIcon: js.UndefOr[String] = js.native
  var closeOnClick: js.UndefOr[Boolean | String] = js.native
  var closeOnEsc: js.UndefOr[Boolean] = js.native
  var closeSpeed: js.UndefOr[Double | String] = js.native
  var closeTrigger: js.UndefOr[String] = js.native
  var contentFilters: js.UndefOr[js.Any] = js.native
  var filter: js.UndefOr[String] = js.native
  var html: js.UndefOr[String] = js.native
  var image: js.UndefOr[String] = js.native
  var jquery: js.UndefOr[JQuery] = js.native
  var loading: js.UndefOr[String] = js.native
  var namespace: js.UndefOr[String] = js.native
  var onKeyUp: js.UndefOr[js.Function1[/* event */ JQueryEventObject, _]] = js.native
  var onResize: js.UndefOr[js.Function1[/* event */ JQueryEventObject, _]] = js.native
  var openSpeed: js.UndefOr[Double | String] = js.native
  var openTrigger: js.UndefOr[String] = js.native
  var otherClose: js.UndefOr[String] = js.native
  var persist: js.UndefOr[Boolean | String] = js.native
  var resetCss: js.UndefOr[Boolean] = js.native
  var root: js.UndefOr[String] = js.native
  var targetAttr: js.UndefOr[String] = js.native
  var text: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[String] = js.native
  var variant: js.UndefOr[String] = js.native
}

object Config {
  @scala.inline
  def apply(): Config = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Config]
  }
  @scala.inline
  implicit class ConfigOps[Self <: Config] (val x: Self) extends AnyVal {
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
    def setAfterClose(value: /* event */ JQueryEventObject => _): Self = this.set("afterClose", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAfterClose: Self = this.set("afterClose", js.undefined)
    @scala.inline
    def setAfterContent(value: /* event */ JQueryEventObject => _): Self = this.set("afterContent", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAfterContent: Self = this.set("afterContent", js.undefined)
    @scala.inline
    def setAfterOpen(value: /* event */ JQueryEventObject => _): Self = this.set("afterOpen", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAfterOpen: Self = this.set("afterOpen", js.undefined)
    @scala.inline
    def setAjax(value: String): Self = this.set("ajax", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAjax: Self = this.set("ajax", js.undefined)
    @scala.inline
    def setBackground(value: String): Self = this.set("background", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackground: Self = this.set("background", js.undefined)
    @scala.inline
    def setBeforeClose(value: /* event */ JQueryEventObject => _): Self = this.set("beforeClose", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBeforeClose: Self = this.set("beforeClose", js.undefined)
    @scala.inline
    def setBeforeContent(value: /* event */ JQueryEventObject => _): Self = this.set("beforeContent", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBeforeContent: Self = this.set("beforeContent", js.undefined)
    @scala.inline
    def setBeforeOpen(value: /* event */ JQueryEventObject => _): Self = this.set("beforeOpen", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBeforeOpen: Self = this.set("beforeOpen", js.undefined)
    @scala.inline
    def setCloseIcon(value: String): Self = this.set("closeIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloseIcon: Self = this.set("closeIcon", js.undefined)
    @scala.inline
    def setCloseOnClick(value: Boolean | String): Self = this.set("closeOnClick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloseOnClick: Self = this.set("closeOnClick", js.undefined)
    @scala.inline
    def setCloseOnEsc(value: Boolean): Self = this.set("closeOnEsc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloseOnEsc: Self = this.set("closeOnEsc", js.undefined)
    @scala.inline
    def setCloseSpeed(value: Double | String): Self = this.set("closeSpeed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloseSpeed: Self = this.set("closeSpeed", js.undefined)
    @scala.inline
    def setCloseTrigger(value: String): Self = this.set("closeTrigger", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloseTrigger: Self = this.set("closeTrigger", js.undefined)
    @scala.inline
    def setContentFilters(value: js.Any): Self = this.set("contentFilters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentFilters: Self = this.set("contentFilters", js.undefined)
    @scala.inline
    def setFilter(value: String): Self = this.set("filter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    @scala.inline
    def setHtml(value: String): Self = this.set("html", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHtml: Self = this.set("html", js.undefined)
    @scala.inline
    def setImage(value: String): Self = this.set("image", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    @scala.inline
    def setJquery(value: JQuery): Self = this.set("jquery", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJquery: Self = this.set("jquery", js.undefined)
    @scala.inline
    def setLoading(value: String): Self = this.set("loading", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoading: Self = this.set("loading", js.undefined)
    @scala.inline
    def setNamespace(value: String): Self = this.set("namespace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNamespace: Self = this.set("namespace", js.undefined)
    @scala.inline
    def setOnKeyUp(value: /* event */ JQueryEventObject => _): Self = this.set("onKeyUp", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnKeyUp: Self = this.set("onKeyUp", js.undefined)
    @scala.inline
    def setOnResize(value: /* event */ JQueryEventObject => _): Self = this.set("onResize", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnResize: Self = this.set("onResize", js.undefined)
    @scala.inline
    def setOpenSpeed(value: Double | String): Self = this.set("openSpeed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpenSpeed: Self = this.set("openSpeed", js.undefined)
    @scala.inline
    def setOpenTrigger(value: String): Self = this.set("openTrigger", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpenTrigger: Self = this.set("openTrigger", js.undefined)
    @scala.inline
    def setOtherClose(value: String): Self = this.set("otherClose", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOtherClose: Self = this.set("otherClose", js.undefined)
    @scala.inline
    def setPersist(value: Boolean | String): Self = this.set("persist", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePersist: Self = this.set("persist", js.undefined)
    @scala.inline
    def setResetCss(value: Boolean): Self = this.set("resetCss", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResetCss: Self = this.set("resetCss", js.undefined)
    @scala.inline
    def setRoot(value: String): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    @scala.inline
    def setTargetAttr(value: String): Self = this.set("targetAttr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetAttr: Self = this.set("targetAttr", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setVariant(value: String): Self = this.set("variant", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVariant: Self = this.set("variant", js.undefined)
  }
  
}

