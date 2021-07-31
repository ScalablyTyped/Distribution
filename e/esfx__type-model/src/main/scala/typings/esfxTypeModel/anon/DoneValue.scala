package typings.esfxTypeModel.anon

import typings.esfxTypeModel.esfxTypeModelBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DoneValue extends StObject {
  
  var done: `true`
  
  var value: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
  ] = js.undefined
}
object DoneValue {
  
  @scala.inline
  def apply(): DoneValue = {
    val __obj = js.Dynamic.literal(done = true)
    __obj.asInstanceOf[DoneValue]
  }
  
  @scala.inline
  implicit class DoneValueMutableBuilder[Self <: DoneValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDone(value: `true`): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
