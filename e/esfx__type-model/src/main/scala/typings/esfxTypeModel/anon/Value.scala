package typings.esfxTypeModel.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Value extends StObject {
  
  var done: Boolean
  
  var value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
}
object Value {
  
  @scala.inline
  def apply(
    done: Boolean,
    value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
  ): Value = {
    val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
  
  @scala.inline
  implicit class ValueMutableBuilder[Self <: Value] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDone(value: Boolean): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
