package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Changes extends StObject {
  
  var changes: js.UndefOr[js.Array[js.Any]] = js.undefined
}
object Changes {
  
  inline def apply(): Changes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Changes]
  }
  
  extension [Self <: Changes](x: Self) {
    
    inline def setChanges(value: js.Array[js.Any]): Self = StObject.set(x, "changes", value.asInstanceOf[js.Any])
    
    inline def setChangesUndefined: Self = StObject.set(x, "changes", js.undefined)
    
    inline def setChangesVarargs(value: js.Any*): Self = StObject.set(x, "changes", js.Array(value :_*))
  }
}
