package typings.dockerode.anon

import typings.dockerode.mod.VolumeInspectInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Volumes extends StObject {
  
  var Volumes: js.Array[VolumeInspectInfo]
  
  var Warnings: js.Array[String]
}
object Volumes {
  
  inline def apply(Volumes: js.Array[VolumeInspectInfo], Warnings: js.Array[String]): Volumes = {
    val __obj = js.Dynamic.literal(Volumes = Volumes.asInstanceOf[js.Any], Warnings = Warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[Volumes]
  }
  
  extension [Self <: Volumes](x: Self) {
    
    inline def setVolumes(value: js.Array[VolumeInspectInfo]): Self = StObject.set(x, "Volumes", value.asInstanceOf[js.Any])
    
    inline def setVolumesVarargs(value: VolumeInspectInfo*): Self = StObject.set(x, "Volumes", js.Array(value :_*))
    
    inline def setWarnings(value: js.Array[String]): Self = StObject.set(x, "Warnings", value.asInstanceOf[js.Any])
    
    inline def setWarningsVarargs(value: String*): Self = StObject.set(x, "Warnings", js.Array(value :_*))
  }
}
