package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPreservedState extends StObject {
  
  /**
    * Preserved disks defined for this instance. This map is keyed with the device names of the disks.
    */
  var disks: js.UndefOr[StringDictionary[SchemaPreservedStatePreservedDisk] | Null] = js.undefined
  
  /**
    * Preserved external IPs defined for this instance. This map is keyed with the name of the network interface.
    */
  var externalIPs: js.UndefOr[StringDictionary[SchemaPreservedStatePreservedNetworkIp] | Null] = js.undefined
  
  /**
    * Preserved internal IPs defined for this instance. This map is keyed with the name of the network interface.
    */
  var internalIPs: js.UndefOr[StringDictionary[SchemaPreservedStatePreservedNetworkIp] | Null] = js.undefined
  
  /**
    * Preserved metadata defined for this instance.
    */
  var metadata: js.UndefOr[StringDictionary[String] | Null] = js.undefined
}
object SchemaPreservedState {
  
  inline def apply(): SchemaPreservedState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPreservedState]
  }
  
  extension [Self <: SchemaPreservedState](x: Self) {
    
    inline def setDisks(value: StringDictionary[SchemaPreservedStatePreservedDisk]): Self = StObject.set(x, "disks", value.asInstanceOf[js.Any])
    
    inline def setDisksNull: Self = StObject.set(x, "disks", null)
    
    inline def setDisksUndefined: Self = StObject.set(x, "disks", js.undefined)
    
    inline def setExternalIPs(value: StringDictionary[SchemaPreservedStatePreservedNetworkIp]): Self = StObject.set(x, "externalIPs", value.asInstanceOf[js.Any])
    
    inline def setExternalIPsNull: Self = StObject.set(x, "externalIPs", null)
    
    inline def setExternalIPsUndefined: Self = StObject.set(x, "externalIPs", js.undefined)
    
    inline def setInternalIPs(value: StringDictionary[SchemaPreservedStatePreservedNetworkIp]): Self = StObject.set(x, "internalIPs", value.asInstanceOf[js.Any])
    
    inline def setInternalIPsNull: Self = StObject.set(x, "internalIPs", null)
    
    inline def setInternalIPsUndefined: Self = StObject.set(x, "internalIPs", js.undefined)
    
    inline def setMetadata(value: StringDictionary[String]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataNull: Self = StObject.set(x, "metadata", null)
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
  }
}
