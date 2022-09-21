package typings.googleapis.alphaMod.computeAlpha

import typings.googleapis.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDisksScopedList extends StObject {
  
  /**
    * [Output Only] A list of disks contained in this scope.
    */
  var disks: js.UndefOr[js.Array[SchemaDisk]] = js.undefined
  
  /**
    * [Output Only] Informational warning which replaces the list of disks when the list is empty.
    */
  var warning: js.UndefOr[Code | Null] = js.undefined
}
object SchemaDisksScopedList {
  
  inline def apply(): SchemaDisksScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDisksScopedList]
  }
  
  extension [Self <: SchemaDisksScopedList](x: Self) {
    
    inline def setDisks(value: js.Array[SchemaDisk]): Self = StObject.set(x, "disks", value.asInstanceOf[js.Any])
    
    inline def setDisksUndefined: Self = StObject.set(x, "disks", js.undefined)
    
    inline def setDisksVarargs(value: SchemaDisk*): Self = StObject.set(x, "disks", js.Array(value*))
    
    inline def setWarning(value: Code): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    inline def setWarningNull: Self = StObject.set(x, "warning", null)
    
    inline def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
  }
}
