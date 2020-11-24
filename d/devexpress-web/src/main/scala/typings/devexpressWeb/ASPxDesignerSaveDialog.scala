package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ASPxDesignerSaveDialog extends ASPxDesignerReportDialogBase {
  
  def notSave(): Unit = js.native
  
  def save(url: String): Unit = js.native
  
  var saveReportDialog: ASPxDesignerSaveAsDialog = js.native
}
object ASPxDesignerSaveDialog {
  
  @scala.inline
  def apply(
    buttons: js.Array[_],
    cancel: () => Unit,
    customize: (String, ASPxDesignerDialogModel) => Unit,
    height: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<any> */ js.Any,
    model: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<ASPxDesignerDialogModel> */ js.Any,
    notSave: () => Unit,
    save: String => Unit,
    saveReportDialog: ASPxDesignerSaveAsDialog,
    show: ASPxDesignerNavigateTab => Unit,
    tab: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<ASPxDesignerNavigateTab> */ js.Any,
    template: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<string> */ js.Any,
    title: String,
    visible: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ js.Any,
    width: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<any> */ js.Any
  ): ASPxDesignerSaveDialog = {
    val __obj = js.Dynamic.literal(buttons = buttons.asInstanceOf[js.Any], cancel = js.Any.fromFunction0(cancel), customize = js.Any.fromFunction2(customize), height = height.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], notSave = js.Any.fromFunction0(notSave), save = js.Any.fromFunction1(save), saveReportDialog = saveReportDialog.asInstanceOf[js.Any], show = js.Any.fromFunction1(show), tab = tab.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxDesignerSaveDialog]
  }
  
  @scala.inline
  implicit class ASPxDesignerSaveDialogOps[Self <: ASPxDesignerSaveDialog] (val x: Self) extends AnyVal {
    
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
    def setNotSave(value: () => Unit): Self = this.set("notSave", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSave(value: String => Unit): Self = this.set("save", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSaveReportDialog(value: ASPxDesignerSaveAsDialog): Self = this.set("saveReportDialog", value.asInstanceOf[js.Any])
  }
}
