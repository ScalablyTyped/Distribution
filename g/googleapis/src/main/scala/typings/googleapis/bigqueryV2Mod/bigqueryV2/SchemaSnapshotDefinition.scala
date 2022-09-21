package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSnapshotDefinition extends StObject {
  
  /**
    * [Required] Reference describing the ID of the table that was snapshot.
    */
  var baseTableReference: js.UndefOr[SchemaTableReference] = js.undefined
  
  /**
    * [Required] The time at which the base table was snapshot. This value is reported in the JSON response using RFC3339 format.
    */
  var snapshotTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaSnapshotDefinition {
  
  inline def apply(): SchemaSnapshotDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSnapshotDefinition]
  }
  
  extension [Self <: SchemaSnapshotDefinition](x: Self) {
    
    inline def setBaseTableReference(value: SchemaTableReference): Self = StObject.set(x, "baseTableReference", value.asInstanceOf[js.Any])
    
    inline def setBaseTableReferenceUndefined: Self = StObject.set(x, "baseTableReference", js.undefined)
    
    inline def setSnapshotTime(value: String): Self = StObject.set(x, "snapshotTime", value.asInstanceOf[js.Any])
    
    inline def setSnapshotTimeNull: Self = StObject.set(x, "snapshotTime", null)
    
    inline def setSnapshotTimeUndefined: Self = StObject.set(x, "snapshotTime", js.undefined)
  }
}
