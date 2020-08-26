package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ASPxDesignerReportDialogBase extends js.Object {
  var buttons: js.Array[_] = js.native
  var height: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<any> */ js.Any = js.native
  var model: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<ASPxDesignerDialogModel> */ js.Any = js.native
  var tab: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<ASPxDesignerNavigateTab> */ js.Any = js.native
  var template: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<string> */ js.Any = js.native
  var title: String = js.native
  var visible: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ js.Any = js.native
  var width: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<any> */ js.Any = js.native
  def cancel(): Unit = js.native
  def customize(template: String, model: ASPxDesignerDialogModel): Unit = js.native
  def show(tab: ASPxDesignerNavigateTab): Unit = js.native
}

object ASPxDesignerReportDialogBase {
  @scala.inline
  def apply(
    buttons: js.Array[_],
    cancel: () => Unit,
    customize: (String, ASPxDesignerDialogModel) => Unit,
    height: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<any> */ js.Any,
    model: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<ASPxDesignerDialogModel> */ js.Any,
    show: ASPxDesignerNavigateTab => Unit,
    tab: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<ASPxDesignerNavigateTab> */ js.Any,
    template: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<string> */ js.Any,
    title: String,
    visible: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ js.Any,
    width: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<any> */ js.Any
  ): ASPxDesignerReportDialogBase = {
    val __obj = js.Dynamic.literal(buttons = buttons.asInstanceOf[js.Any], cancel = js.Any.fromFunction0(cancel), customize = js.Any.fromFunction2(customize), height = height.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], show = js.Any.fromFunction1(show), tab = tab.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxDesignerReportDialogBase]
  }
  @scala.inline
  implicit class ASPxDesignerReportDialogBaseOps[Self <: ASPxDesignerReportDialogBase] (val x: Self) extends AnyVal {
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
    def setButtonsVarargs(value: js.Any*): Self = this.set("buttons", js.Array(value :_*))
    @scala.inline
    def setButtons(value: js.Array[_]): Self = this.set("buttons", value.asInstanceOf[js.Any])
    @scala.inline
    def setCancel(value: () => Unit): Self = this.set("cancel", js.Any.fromFunction0(value))
    @scala.inline
    def setCustomize(value: (String, ASPxDesignerDialogModel) => Unit): Self = this.set("customize", js.Any.fromFunction2(value))
    @scala.inline
    def setHeight(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<any> */ js.Any
    ): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setModel(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<ASPxDesignerDialogModel> */ js.Any
    ): Self = this.set("model", value.asInstanceOf[js.Any])
    @scala.inline
    def setShow(value: ASPxDesignerNavigateTab => Unit): Self = this.set("show", js.Any.fromFunction1(value))
    @scala.inline
    def setTab(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<ASPxDesignerNavigateTab> */ js.Any
    ): Self = this.set("tab", value.asInstanceOf[js.Any])
    @scala.inline
    def setTemplate(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<string> */ js.Any
    ): Self = this.set("template", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setVisible(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ js.Any
    ): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<any> */ js.Any
    ): Self = this.set("width", value.asInstanceOf[js.Any])
  }
  
}

