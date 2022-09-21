package typings.googleapis.baremetalsolutionV2Mod.baremetalsolutionV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaVolumeConfig extends StObject {
  
  /**
    * The GCP service of the storage volume. Available gcp_service are in https://cloud.google.com/bare-metal/docs/bms-planning.
    */
  var gcpService: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A transient unique identifier to identify a volume within an ProvisioningConfig request.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * LUN ranges to be configured. Set only when protocol is PROTOCOL_FC.
    */
  var lunRanges: js.UndefOr[js.Array[SchemaLunRange]] = js.undefined
  
  /**
    * Machine ids connected to this volume. Set only when protocol is PROTOCOL_FC.
    */
  var machineIds: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Output only. The name of the volume config.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * NFS exports. Set only when protocol is PROTOCOL_NFS.
    */
  var nfsExports: js.UndefOr[js.Array[SchemaNfsExport]] = js.undefined
  
  /**
    * Volume protocol.
    */
  var protocol: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The requested size of this volume, in GB.
    */
  var sizeGb: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Whether snapshots should be enabled.
    */
  var snapshotsEnabled: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The type of this Volume.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
  
  /**
    * User note field, it can be used by customers to add additional information for the BMS Ops team .
    */
  var userNote: js.UndefOr[String | Null] = js.undefined
}
object SchemaVolumeConfig {
  
  inline def apply(): SchemaVolumeConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVolumeConfig]
  }
  
  extension [Self <: SchemaVolumeConfig](x: Self) {
    
    inline def setGcpService(value: String): Self = StObject.set(x, "gcpService", value.asInstanceOf[js.Any])
    
    inline def setGcpServiceNull: Self = StObject.set(x, "gcpService", null)
    
    inline def setGcpServiceUndefined: Self = StObject.set(x, "gcpService", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLunRanges(value: js.Array[SchemaLunRange]): Self = StObject.set(x, "lunRanges", value.asInstanceOf[js.Any])
    
    inline def setLunRangesUndefined: Self = StObject.set(x, "lunRanges", js.undefined)
    
    inline def setLunRangesVarargs(value: SchemaLunRange*): Self = StObject.set(x, "lunRanges", js.Array(value*))
    
    inline def setMachineIds(value: js.Array[String]): Self = StObject.set(x, "machineIds", value.asInstanceOf[js.Any])
    
    inline def setMachineIdsNull: Self = StObject.set(x, "machineIds", null)
    
    inline def setMachineIdsUndefined: Self = StObject.set(x, "machineIds", js.undefined)
    
    inline def setMachineIdsVarargs(value: String*): Self = StObject.set(x, "machineIds", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNfsExports(value: js.Array[SchemaNfsExport]): Self = StObject.set(x, "nfsExports", value.asInstanceOf[js.Any])
    
    inline def setNfsExportsUndefined: Self = StObject.set(x, "nfsExports", js.undefined)
    
    inline def setNfsExportsVarargs(value: SchemaNfsExport*): Self = StObject.set(x, "nfsExports", js.Array(value*))
    
    inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    inline def setProtocolNull: Self = StObject.set(x, "protocol", null)
    
    inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
    
    inline def setSizeGb(value: Double): Self = StObject.set(x, "sizeGb", value.asInstanceOf[js.Any])
    
    inline def setSizeGbNull: Self = StObject.set(x, "sizeGb", null)
    
    inline def setSizeGbUndefined: Self = StObject.set(x, "sizeGb", js.undefined)
    
    inline def setSnapshotsEnabled(value: Boolean): Self = StObject.set(x, "snapshotsEnabled", value.asInstanceOf[js.Any])
    
    inline def setSnapshotsEnabledNull: Self = StObject.set(x, "snapshotsEnabled", null)
    
    inline def setSnapshotsEnabledUndefined: Self = StObject.set(x, "snapshotsEnabled", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUserNote(value: String): Self = StObject.set(x, "userNote", value.asInstanceOf[js.Any])
    
    inline def setUserNoteNull: Self = StObject.set(x, "userNote", null)
    
    inline def setUserNoteUndefined: Self = StObject.set(x, "userNote", js.undefined)
  }
}
