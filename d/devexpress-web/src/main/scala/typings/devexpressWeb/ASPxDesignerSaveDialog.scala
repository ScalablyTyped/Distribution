package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ASPxDesignerSaveDialog
  extends StObject
     with ASPxDesignerReportDialogBase {
  
  def notSave(): Unit
  
  def save(url: String): Unit
  
  var saveReportDialog: ASPxDesignerSaveAsDialog
}
object ASPxDesignerSaveDialog {
  
  inline def apply(
    buttons: js.Array[Any],
    cancel: () => Unit,
    customize: (String, ASPxDesignerDialogModel) => Unit,
    height: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<any> */ Any,
    model: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<ASPxDesignerDialogModel> */ Any,
    notSave: () => Unit,
    save: String => Unit,
    saveReportDialog: ASPxDesignerSaveAsDialog,
    show: ASPxDesignerNavigateTab => Unit,
    tab: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<ASPxDesignerNavigateTab> */ Any,
    template: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<string> */ Any,
    title: String,
    visible: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ Any,
    width: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<any> */ Any
  ): ASPxDesignerSaveDialog = {
    val __obj = js.Dynamic.literal(buttons = buttons.asInstanceOf[js.Any], cancel = js.Any.fromFunction0(cancel), customize = js.Any.fromFunction2(customize), height = height.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], notSave = js.Any.fromFunction0(notSave), save = js.Any.fromFunction1(save), saveReportDialog = saveReportDialog.asInstanceOf[js.Any], show = js.Any.fromFunction1(show), tab = tab.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxDesignerSaveDialog]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ASPxDesignerSaveDialog] (val x: Self) extends AnyVal {
    
    inline def setNotSave(value: () => Unit): Self = StObject.set(x, "notSave", js.Any.fromFunction0(value))
    
    inline def setSave(value: String => Unit): Self = StObject.set(x, "save", js.Any.fromFunction1(value))
    
    inline def setSaveReportDialog(value: ASPxDesignerSaveAsDialog): Self = StObject.set(x, "saveReportDialog", value.asInstanceOf[js.Any])
  }
}
