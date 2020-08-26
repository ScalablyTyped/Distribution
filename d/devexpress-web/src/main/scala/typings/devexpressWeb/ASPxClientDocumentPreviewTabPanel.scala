package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ASPxClientDocumentPreviewTabPanel extends js.Object {
  var collapsed: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ js.Any = js.native
  var tabs: js.Array[ASPxClientDocumentPreviewTab] = js.native
  var width: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<any> */ js.Any = js.native
}

object ASPxClientDocumentPreviewTabPanel {
  @scala.inline
  def apply(
    collapsed: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ js.Any,
    tabs: js.Array[ASPxClientDocumentPreviewTab],
    width: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<any> */ js.Any
  ): ASPxClientDocumentPreviewTabPanel = {
    val __obj = js.Dynamic.literal(collapsed = collapsed.asInstanceOf[js.Any], tabs = tabs.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientDocumentPreviewTabPanel]
  }
  @scala.inline
  implicit class ASPxClientDocumentPreviewTabPanelOps[Self <: ASPxClientDocumentPreviewTabPanel] (val x: Self) extends AnyVal {
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
    def setCollapsed(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ js.Any
    ): Self = this.set("collapsed", value.asInstanceOf[js.Any])
    @scala.inline
    def setTabsVarargs(value: ASPxClientDocumentPreviewTab*): Self = this.set("tabs", js.Array(value :_*))
    @scala.inline
    def setTabs(value: js.Array[ASPxClientDocumentPreviewTab]): Self = this.set("tabs", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<any> */ js.Any
    ): Self = this.set("width", value.asInstanceOf[js.Any])
  }
  
}

