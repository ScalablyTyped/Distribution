package typings.googleapis.appengineV1betaMod.appengineV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Machine resources for a version.
  */
@js.native
trait SchemaResources extends StObject {
  
  /**
    * Number of CPU cores needed.
    */
  var cpu: js.UndefOr[Double] = js.native
  
  /**
    * Disk size (GB) needed.
    */
  var diskGb: js.UndefOr[Double] = js.native
  
  /**
    * Memory (GB) needed.
    */
  var memoryGb: js.UndefOr[Double] = js.native
  
  /**
    * User specified volumes.
    */
  var volumes: js.UndefOr[js.Array[SchemaVolume]] = js.native
}
object SchemaResources {
  
  @scala.inline
  def apply(): SchemaResources = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResources]
  }
  
  @scala.inline
  implicit class SchemaResourcesMutableBuilder[Self <: SchemaResources] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCpu(value: Double): Self = StObject.set(x, "cpu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCpuUndefined: Self = StObject.set(x, "cpu", js.undefined)
    
    @scala.inline
    def setDiskGb(value: Double): Self = StObject.set(x, "diskGb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiskGbUndefined: Self = StObject.set(x, "diskGb", js.undefined)
    
    @scala.inline
    def setMemoryGb(value: Double): Self = StObject.set(x, "memoryGb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemoryGbUndefined: Self = StObject.set(x, "memoryGb", js.undefined)
    
    @scala.inline
    def setVolumes(value: js.Array[SchemaVolume]): Self = StObject.set(x, "volumes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumesUndefined: Self = StObject.set(x, "volumes", js.undefined)
    
    @scala.inline
    def setVolumesVarargs(value: SchemaVolume*): Self = StObject.set(x, "volumes", js.Array(value :_*))
  }
}
