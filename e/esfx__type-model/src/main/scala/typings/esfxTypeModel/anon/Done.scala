package typings.esfxTypeModel.anon

import typings.esfxTypeModel.esfxTypeModelBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Done extends StObject {
  
  var done: `false`
  
  var value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
}
object Done {
  
  inline def apply(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Done = {
    val __obj = js.Dynamic.literal(done = false, value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Done]
  }
  
  extension [Self <: Done](x: Self) {
    
    inline def setDone(value: `false`): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
    
    inline def setValue(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
