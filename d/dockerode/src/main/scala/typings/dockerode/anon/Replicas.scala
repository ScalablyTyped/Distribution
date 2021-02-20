package typings.dockerode.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Replicas extends StObject {
  
  var Replicas: js.UndefOr[Double] = js.native
}
object Replicas {
  
  @scala.inline
  def apply(): Replicas = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Replicas]
  }
  
  @scala.inline
  implicit class ReplicasMutableBuilder[Self <: Replicas] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReplicas(value: Double): Self = StObject.set(x, "Replicas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicasUndefined: Self = StObject.set(x, "Replicas", js.undefined)
  }
}
