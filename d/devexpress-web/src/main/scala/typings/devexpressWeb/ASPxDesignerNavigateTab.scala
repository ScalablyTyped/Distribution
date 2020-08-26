package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ASPxDesignerNavigateTab extends js.Object {
  var displayName: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutComputed<string> */ js.Any = js.native
  var isModified: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ js.Any = js.native
  var report: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<any> */ js.Any = js.native
  var undoEngine: ASPxDesignerUndoEngine = js.native
  var url: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<string> */ js.Any = js.native
  def refresh(): Unit = js.native
  def resetIsModified(): Unit = js.native
}

object ASPxDesignerNavigateTab {
  @scala.inline
  def apply(
    displayName: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutComputed<string> */ js.Any,
    isModified: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ js.Any,
    refresh: () => Unit,
    report: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<any> */ js.Any,
    resetIsModified: () => Unit,
    undoEngine: ASPxDesignerUndoEngine,
    url: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<string> */ js.Any
  ): ASPxDesignerNavigateTab = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], isModified = isModified.asInstanceOf[js.Any], refresh = js.Any.fromFunction0(refresh), report = report.asInstanceOf[js.Any], resetIsModified = js.Any.fromFunction0(resetIsModified), undoEngine = undoEngine.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxDesignerNavigateTab]
  }
  @scala.inline
  implicit class ASPxDesignerNavigateTabOps[Self <: ASPxDesignerNavigateTab] (val x: Self) extends AnyVal {
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
    def setDisplayName(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutComputed<string> */ js.Any
    ): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsModified(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ js.Any
    ): Self = this.set("isModified", value.asInstanceOf[js.Any])
    @scala.inline
    def setRefresh(value: () => Unit): Self = this.set("refresh", js.Any.fromFunction0(value))
    @scala.inline
    def setReport(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<any> */ js.Any
    ): Self = this.set("report", value.asInstanceOf[js.Any])
    @scala.inline
    def setResetIsModified(value: () => Unit): Self = this.set("resetIsModified", js.Any.fromFunction0(value))
    @scala.inline
    def setUndoEngine(value: ASPxDesignerUndoEngine): Self = this.set("undoEngine", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<string> */ js.Any
    ): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

