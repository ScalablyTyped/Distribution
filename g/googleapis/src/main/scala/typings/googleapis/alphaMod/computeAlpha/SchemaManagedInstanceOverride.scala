package typings.googleapis.alphaMod.computeAlpha

import typings.googleapis.anon.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Overrides of stateful properties for a given instance
  */
trait SchemaManagedInstanceOverride extends StObject {
  
  /**
    * Disk overrides defined for this instance. According to documentation the
    * maximum number of disks attached to an instance is 128:
    * https://cloud.google.com/compute/docs/disks/ However, compute API defines
    * the limit at 140, so this is what we check.
    */
  var disks: js.UndefOr[js.Array[SchemaManagedInstanceOverrideDiskOverride]] = js.undefined
  
  /**
    * Metadata overrides defined for this instance. TODO(b/69785416) validate
    * the total length is &lt;9 KB
    */
  var metadata: js.UndefOr[js.Array[Key]] = js.undefined
  
  /**
    * [Output Only] Indicates where does the override come from.
    */
  var origin: js.UndefOr[String] = js.undefined
}
object SchemaManagedInstanceOverride {
  
  inline def apply(): SchemaManagedInstanceOverride = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaManagedInstanceOverride]
  }
  
  extension [Self <: SchemaManagedInstanceOverride](x: Self) {
    
    inline def setDisks(value: js.Array[SchemaManagedInstanceOverrideDiskOverride]): Self = StObject.set(x, "disks", value.asInstanceOf[js.Any])
    
    inline def setDisksUndefined: Self = StObject.set(x, "disks", js.undefined)
    
    inline def setDisksVarargs(value: SchemaManagedInstanceOverrideDiskOverride*): Self = StObject.set(x, "disks", js.Array(value :_*))
    
    inline def setMetadata(value: js.Array[Key]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setMetadataVarargs(value: Key*): Self = StObject.set(x, "metadata", js.Array(value :_*))
    
    inline def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
  }
}
