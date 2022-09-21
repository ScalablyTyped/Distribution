package typings.googleapis.alphaMod.computeAlpha

import typings.googleapis.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInstantSnapshotsScopedList extends StObject {
  
  /**
    * [Output Only] A list of instantSnapshots contained in this scope.
    */
  var instantSnapshots: js.UndefOr[js.Array[SchemaInstantSnapshot]] = js.undefined
  
  /**
    * [Output Only] Informational warning which replaces the list of instantSnapshots when the list is empty.
    */
  var warning: js.UndefOr[Code | Null] = js.undefined
}
object SchemaInstantSnapshotsScopedList {
  
  inline def apply(): SchemaInstantSnapshotsScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstantSnapshotsScopedList]
  }
  
  extension [Self <: SchemaInstantSnapshotsScopedList](x: Self) {
    
    inline def setInstantSnapshots(value: js.Array[SchemaInstantSnapshot]): Self = StObject.set(x, "instantSnapshots", value.asInstanceOf[js.Any])
    
    inline def setInstantSnapshotsUndefined: Self = StObject.set(x, "instantSnapshots", js.undefined)
    
    inline def setInstantSnapshotsVarargs(value: SchemaInstantSnapshot*): Self = StObject.set(x, "instantSnapshots", js.Array(value*))
    
    inline def setWarning(value: Code): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    inline def setWarningNull: Self = StObject.set(x, "warning", null)
    
    inline def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
  }
}
