package typings.exceljs.mod

import typings.exceljs.exceljsStrings.custom
import typings.exceljs.exceljsStrings.date
import typings.exceljs.exceljsStrings.decimal
import typings.exceljs.exceljsStrings.list
import typings.exceljs.exceljsStrings.textLength
import typings.exceljs.exceljsStrings.whole
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataValidation extends StObject {
  
  var allowBlank: js.UndefOr[Boolean] = js.undefined
  
  var error: js.UndefOr[String] = js.undefined
  
  var errorStyle: js.UndefOr[String] = js.undefined
  
  var errorTitle: js.UndefOr[String] = js.undefined
  
  var formulae: js.Array[js.Any]
  
  var operator: js.UndefOr[DataValidationOperator] = js.undefined
  
  var prompt: js.UndefOr[String] = js.undefined
  
  var promptTitle: js.UndefOr[String] = js.undefined
  
  var showErrorMessage: js.UndefOr[Boolean] = js.undefined
  
  var showInputMessage: js.UndefOr[Boolean] = js.undefined
  
  var `type`: list | whole | decimal | date | textLength | custom
}
object DataValidation {
  
  inline def apply(formulae: js.Array[js.Any], `type`: list | whole | decimal | date | textLength | custom): DataValidation = {
    val __obj = js.Dynamic.literal(formulae = formulae.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataValidation]
  }
  
  extension [Self <: DataValidation](x: Self) {
    
    inline def setAllowBlank(value: Boolean): Self = StObject.set(x, "allowBlank", value.asInstanceOf[js.Any])
    
    inline def setAllowBlankUndefined: Self = StObject.set(x, "allowBlank", js.undefined)
    
    inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorStyle(value: String): Self = StObject.set(x, "errorStyle", value.asInstanceOf[js.Any])
    
    inline def setErrorStyleUndefined: Self = StObject.set(x, "errorStyle", js.undefined)
    
    inline def setErrorTitle(value: String): Self = StObject.set(x, "errorTitle", value.asInstanceOf[js.Any])
    
    inline def setErrorTitleUndefined: Self = StObject.set(x, "errorTitle", js.undefined)
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setFormulae(value: js.Array[js.Any]): Self = StObject.set(x, "formulae", value.asInstanceOf[js.Any])
    
    inline def setFormulaeVarargs(value: js.Any*): Self = StObject.set(x, "formulae", js.Array(value :_*))
    
    inline def setOperator(value: DataValidationOperator): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    inline def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
    
    inline def setPrompt(value: String): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
    
    inline def setPromptTitle(value: String): Self = StObject.set(x, "promptTitle", value.asInstanceOf[js.Any])
    
    inline def setPromptTitleUndefined: Self = StObject.set(x, "promptTitle", js.undefined)
    
    inline def setPromptUndefined: Self = StObject.set(x, "prompt", js.undefined)
    
    inline def setShowErrorMessage(value: Boolean): Self = StObject.set(x, "showErrorMessage", value.asInstanceOf[js.Any])
    
    inline def setShowErrorMessageUndefined: Self = StObject.set(x, "showErrorMessage", js.undefined)
    
    inline def setShowInputMessage(value: Boolean): Self = StObject.set(x, "showInputMessage", value.asInstanceOf[js.Any])
    
    inline def setShowInputMessageUndefined: Self = StObject.set(x, "showInputMessage", js.undefined)
    
    inline def setType(value: list | whole | decimal | date | textLength | custom): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
