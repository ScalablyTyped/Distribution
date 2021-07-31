package typings.dockerode.mod

import typings.dockerode.anon.MaxConcurrent
import typings.dockerode.anon.Replicas
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceMode extends StObject {
  
  var Global: js.UndefOr[js.Object] = js.undefined
  
  var GlobalJob: js.UndefOr[js.Object] = js.undefined
  
  var Replicated: js.UndefOr[Replicas] = js.undefined
  
  var ReplicatedJob: js.UndefOr[MaxConcurrent] = js.undefined
}
object ServiceMode {
  
  @scala.inline
  def apply(): ServiceMode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceMode]
  }
  
  @scala.inline
  implicit class ServiceModeMutableBuilder[Self <: ServiceMode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGlobal(value: js.Object): Self = StObject.set(x, "Global", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalJob(value: js.Object): Self = StObject.set(x, "GlobalJob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalJobUndefined: Self = StObject.set(x, "GlobalJob", js.undefined)
    
    @scala.inline
    def setGlobalUndefined: Self = StObject.set(x, "Global", js.undefined)
    
    @scala.inline
    def setReplicated(value: Replicas): Self = StObject.set(x, "Replicated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicatedJob(value: MaxConcurrent): Self = StObject.set(x, "ReplicatedJob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicatedJobUndefined: Self = StObject.set(x, "ReplicatedJob", js.undefined)
    
    @scala.inline
    def setReplicatedUndefined: Self = StObject.set(x, "Replicated", js.undefined)
  }
}
