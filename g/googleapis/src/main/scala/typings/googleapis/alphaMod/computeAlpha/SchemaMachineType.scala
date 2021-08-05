package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Machine Type resource. (== resource_for v1.machineTypes ==) (==
  * resource_for beta.machineTypes ==)
  */
trait SchemaMachineType extends StObject {
  
  /**
    * [Output Only] Creation timestamp in RFC3339 text format.
    */
  var creationTimestamp: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] The deprecation status associated with this machine type.
    */
  var deprecated: js.UndefOr[SchemaDeprecationStatus] = js.undefined
  
  /**
    * [Output Only] An optional textual description of the resource.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] The number of virtual CPUs that are available to the
    * instance.
    */
  var guestCpus: js.UndefOr[Double] = js.undefined
  
  /**
    * [Output Only] The unique identifier for the resource. This identifier is
    * defined by the server.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] Whether this machine type has a shared CPU. See Shared-core
    * machine types for more information.
    */
  var isSharedCpu: js.UndefOr[Boolean] = js.undefined
  
  /**
    * [Output Only] The type of the resource. Always compute#machineType for
    * machine types.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] Maximum persistent disks allowed.
    */
  var maximumPersistentDisks: js.UndefOr[Double] = js.undefined
  
  /**
    * [Output Only] Maximum total persistent disks size (GB) allowed.
    */
  var maximumPersistentDisksSizeGb: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] The amount of physical memory available to the instance,
    * defined in MB.
    */
  var memoryMb: js.UndefOr[Double] = js.undefined
  
  /**
    * [Output Only] Name of the resource.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] Server-defined URL for the resource.
    */
  var selfLink: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] Server-defined URL for this resource with the resource id.
    */
  var selfLinkWithId: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] The name of the zone where the machine type resides, such
    * as us-central1-a.
    */
  var zone: js.UndefOr[String] = js.undefined
}
object SchemaMachineType {
  
  inline def apply(): SchemaMachineType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMachineType]
  }
  
  extension [Self <: SchemaMachineType](x: Self) {
    
    inline def setCreationTimestamp(value: String): Self = StObject.set(x, "creationTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCreationTimestampUndefined: Self = StObject.set(x, "creationTimestamp", js.undefined)
    
    inline def setDeprecated(value: SchemaDeprecationStatus): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
    
    inline def setDeprecatedUndefined: Self = StObject.set(x, "deprecated", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setGuestCpus(value: Double): Self = StObject.set(x, "guestCpus", value.asInstanceOf[js.Any])
    
    inline def setGuestCpusUndefined: Self = StObject.set(x, "guestCpus", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIsSharedCpu(value: Boolean): Self = StObject.set(x, "isSharedCpu", value.asInstanceOf[js.Any])
    
    inline def setIsSharedCpuUndefined: Self = StObject.set(x, "isSharedCpu", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setMaximumPersistentDisks(value: Double): Self = StObject.set(x, "maximumPersistentDisks", value.asInstanceOf[js.Any])
    
    inline def setMaximumPersistentDisksSizeGb(value: String): Self = StObject.set(x, "maximumPersistentDisksSizeGb", value.asInstanceOf[js.Any])
    
    inline def setMaximumPersistentDisksSizeGbUndefined: Self = StObject.set(x, "maximumPersistentDisksSizeGb", js.undefined)
    
    inline def setMaximumPersistentDisksUndefined: Self = StObject.set(x, "maximumPersistentDisks", js.undefined)
    
    inline def setMemoryMb(value: Double): Self = StObject.set(x, "memoryMb", value.asInstanceOf[js.Any])
    
    inline def setMemoryMbUndefined: Self = StObject.set(x, "memoryMb", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    inline def setSelfLinkWithId(value: String): Self = StObject.set(x, "selfLinkWithId", value.asInstanceOf[js.Any])
    
    inline def setSelfLinkWithIdUndefined: Self = StObject.set(x, "selfLinkWithId", js.undefined)
    
    inline def setZone(value: String): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
    
    inline def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
  }
}
