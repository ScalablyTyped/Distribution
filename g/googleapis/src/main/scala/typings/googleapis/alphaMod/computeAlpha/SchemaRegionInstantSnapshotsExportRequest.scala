package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRegionInstantSnapshotsExportRequest extends StObject {
  
  /**
    * Parameters to export the changed blocks.
    */
  var exportParams: js.UndefOr[SchemaInstantSnapshotExportParams] = js.undefined
}
object SchemaRegionInstantSnapshotsExportRequest {
  
  inline def apply(): SchemaRegionInstantSnapshotsExportRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRegionInstantSnapshotsExportRequest]
  }
  
  extension [Self <: SchemaRegionInstantSnapshotsExportRequest](x: Self) {
    
    inline def setExportParams(value: SchemaInstantSnapshotExportParams): Self = StObject.set(x, "exportParams", value.asInstanceOf[js.Any])
    
    inline def setExportParamsUndefined: Self = StObject.set(x, "exportParams", js.undefined)
  }
}
