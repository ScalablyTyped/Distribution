package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInstantSnapshotsExportRequest extends StObject {
  
  /**
    * Parameters to export the changed blocks.
    */
  var exportParams: js.UndefOr[SchemaInstantSnapshotExportParams] = js.undefined
}
object SchemaInstantSnapshotsExportRequest {
  
  inline def apply(): SchemaInstantSnapshotsExportRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstantSnapshotsExportRequest]
  }
  
  extension [Self <: SchemaInstantSnapshotsExportRequest](x: Self) {
    
    inline def setExportParams(value: SchemaInstantSnapshotExportParams): Self = StObject.set(x, "exportParams", value.asInstanceOf[js.Any])
    
    inline def setExportParamsUndefined: Self = StObject.set(x, "exportParams", js.undefined)
  }
}
