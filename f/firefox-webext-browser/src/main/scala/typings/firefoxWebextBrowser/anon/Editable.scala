package typings.firefoxWebextBrowser.anon

import typings.firefoxWebextBrowser.browser.contextMenus.ContextType
import typings.firefoxWebextBrowser.browser.extension.ViewType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Editable extends js.Object {
  /** A list of all contexts that apply to the menu. */
  var contexts: js.Array[ContextType] = js.native
  var editable: Boolean = js.native
  var frameUrl: js.UndefOr[String] = js.native
  var linkText: js.UndefOr[String] = js.native
  var linkUrl: js.UndefOr[String] = js.native
  var mediaType: js.UndefOr[String] = js.native
  /** A list of IDs of the menu items that were shown. */
  var menuIds: Double | js.Array[String] = js.native
  var pageUrl: js.UndefOr[String] = js.native
  var selectionText: js.UndefOr[String] = js.native
  var srcUrl: js.UndefOr[String] = js.native
  var targetElementId: js.UndefOr[Double] = js.native
  var viewType: js.UndefOr[ViewType] = js.native
}

object Editable {
  @scala.inline
  def apply(contexts: js.Array[ContextType], editable: Boolean, menuIds: Double | js.Array[String]): Editable = {
    val __obj = js.Dynamic.literal(contexts = contexts.asInstanceOf[js.Any], editable = editable.asInstanceOf[js.Any], menuIds = menuIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[Editable]
  }
  @scala.inline
  implicit class EditableOps[Self <: Editable] (val x: Self) extends AnyVal {
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
    def setContextsVarargs(value: ContextType*): Self = this.set("contexts", js.Array(value :_*))
    @scala.inline
    def setContexts(value: js.Array[ContextType]): Self = this.set("contexts", value.asInstanceOf[js.Any])
    @scala.inline
    def setEditable(value: Boolean): Self = this.set("editable", value.asInstanceOf[js.Any])
    @scala.inline
    def setMenuIdsVarargs(value: String*): Self = this.set("menuIds", js.Array(value :_*))
    @scala.inline
    def setMenuIds(value: Double | js.Array[String]): Self = this.set("menuIds", value.asInstanceOf[js.Any])
    @scala.inline
    def setFrameUrl(value: String): Self = this.set("frameUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrameUrl: Self = this.set("frameUrl", js.undefined)
    @scala.inline
    def setLinkText(value: String): Self = this.set("linkText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinkText: Self = this.set("linkText", js.undefined)
    @scala.inline
    def setLinkUrl(value: String): Self = this.set("linkUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinkUrl: Self = this.set("linkUrl", js.undefined)
    @scala.inline
    def setMediaType(value: String): Self = this.set("mediaType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMediaType: Self = this.set("mediaType", js.undefined)
    @scala.inline
    def setPageUrl(value: String): Self = this.set("pageUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageUrl: Self = this.set("pageUrl", js.undefined)
    @scala.inline
    def setSelectionText(value: String): Self = this.set("selectionText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectionText: Self = this.set("selectionText", js.undefined)
    @scala.inline
    def setSrcUrl(value: String): Self = this.set("srcUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSrcUrl: Self = this.set("srcUrl", js.undefined)
    @scala.inline
    def setTargetElementId(value: Double): Self = this.set("targetElementId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetElementId: Self = this.set("targetElementId", js.undefined)
    @scala.inline
    def setViewType(value: ViewType): Self = this.set("viewType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViewType: Self = this.set("viewType", js.undefined)
  }
  
}

