package typings.dockerEvents

import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("docker-events", JSImport.Namespace)
  @js.native
  class ^ () extends DockerEvents {
    def this(options: DockerEventsOptions) = this()
  }
  
  @js.native
  trait DockerEvents extends EventEmitter {
    
    def start(): Unit = js.native
    
    def stop(): Unit = js.native
  }
  
  trait DockerEventsOptions extends StObject {
    
    var docker: typings.dockerode.mod.^
  }
  object DockerEventsOptions {
    
    @scala.inline
    def apply(docker: typings.dockerode.mod.^): DockerEventsOptions = {
      val __obj = js.Dynamic.literal(docker = docker.asInstanceOf[js.Any])
      __obj.asInstanceOf[DockerEventsOptions]
    }
    
    @scala.inline
    implicit class DockerEventsOptionsMutableBuilder[Self <: DockerEventsOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDocker(value: typings.dockerode.mod.^): Self = StObject.set(x, "docker", value.asInstanceOf[js.Any])
    }
  }
}
