package typings.dockerode.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Replicas extends StObject {
  
  var Replicas: js.UndefOr[Double] = js.undefined
}
object Replicas {
  
  inline def apply(): Replicas = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Replicas]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Replicas] (val x: Self) extends AnyVal {
    
    inline def setReplicas(value: Double): Self = StObject.set(x, "Replicas", value.asInstanceOf[js.Any])
    
    inline def setReplicasUndefined: Self = StObject.set(x, "Replicas", js.undefined)
  }
}
