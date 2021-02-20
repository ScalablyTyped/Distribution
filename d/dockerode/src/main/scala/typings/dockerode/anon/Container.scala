package typings.dockerode.anon

import typings.dockerode.dockerodeStrings.config
import typings.dockerode.dockerodeStrings.container
import typings.dockerode.dockerodeStrings.daemon
import typings.dockerode.dockerodeStrings.image
import typings.dockerode.dockerodeStrings.local
import typings.dockerode.dockerodeStrings.network
import typings.dockerode.dockerodeStrings.node
import typings.dockerode.dockerodeStrings.plugin
import typings.dockerode.dockerodeStrings.secret
import typings.dockerode.dockerodeStrings.service
import typings.dockerode.dockerodeStrings.swarm
import typings.dockerode.dockerodeStrings.volume
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Container extends StObject {
  
  var config: js.UndefOr[String] = js.native
  
  var container: js.UndefOr[js.Array[String]] = js.native
  
  var daemon: js.UndefOr[js.Array[String]] = js.native
  
  var event: js.UndefOr[js.Array[String]] = js.native
  
  var image: js.UndefOr[js.Array[String]] = js.native
  
  var label: js.UndefOr[js.Array[String]] = js.native
  
  var network: js.UndefOr[js.Array[String]] = js.native
  
  var node: js.UndefOr[js.Array[String]] = js.native
  
  var plugin: js.UndefOr[js.Array[String]] = js.native
  
  var scope: js.UndefOr[js.Array[local | swarm]] = js.native
  
  var secret: js.UndefOr[js.Array[String]] = js.native
  
  var service: js.UndefOr[js.Array[String]] = js.native
  
  var `type`: js.UndefOr[
    js.Array[
      container | image | volume | network | daemon | plugin | service | node | secret | config
    ]
  ] = js.native
  
  var volume: js.UndefOr[js.Array[String]] = js.native
}
object Container {
  
  @scala.inline
  def apply(): Container = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Container]
  }
  
  @scala.inline
  implicit class ContainerMutableBuilder[Self <: Container] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfig(value: String): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    @scala.inline
    def setContainer(value: js.Array[String]): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    @scala.inline
    def setContainerVarargs(value: String*): Self = StObject.set(x, "container", js.Array(value :_*))
    
    @scala.inline
    def setDaemon(value: js.Array[String]): Self = StObject.set(x, "daemon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDaemonUndefined: Self = StObject.set(x, "daemon", js.undefined)
    
    @scala.inline
    def setDaemonVarargs(value: String*): Self = StObject.set(x, "daemon", js.Array(value :_*))
    
    @scala.inline
    def setEvent(value: js.Array[String]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    @scala.inline
    def setEventVarargs(value: String*): Self = StObject.set(x, "event", js.Array(value :_*))
    
    @scala.inline
    def setImage(value: js.Array[String]): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    @scala.inline
    def setImageVarargs(value: String*): Self = StObject.set(x, "image", js.Array(value :_*))
    
    @scala.inline
    def setLabel(value: js.Array[String]): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setLabelVarargs(value: String*): Self = StObject.set(x, "label", js.Array(value :_*))
    
    @scala.inline
    def setNetwork(value: js.Array[String]): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkUndefined: Self = StObject.set(x, "network", js.undefined)
    
    @scala.inline
    def setNetworkVarargs(value: String*): Self = StObject.set(x, "network", js.Array(value :_*))
    
    @scala.inline
    def setNode(value: js.Array[String]): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeUndefined: Self = StObject.set(x, "node", js.undefined)
    
    @scala.inline
    def setNodeVarargs(value: String*): Self = StObject.set(x, "node", js.Array(value :_*))
    
    @scala.inline
    def setPlugin(value: js.Array[String]): Self = StObject.set(x, "plugin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPluginUndefined: Self = StObject.set(x, "plugin", js.undefined)
    
    @scala.inline
    def setPluginVarargs(value: String*): Self = StObject.set(x, "plugin", js.Array(value :_*))
    
    @scala.inline
    def setScope(value: js.Array[local | swarm]): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    @scala.inline
    def setScopeVarargs(value: (local | swarm)*): Self = StObject.set(x, "scope", js.Array(value :_*))
    
    @scala.inline
    def setSecret(value: js.Array[String]): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecretUndefined: Self = StObject.set(x, "secret", js.undefined)
    
    @scala.inline
    def setSecretVarargs(value: String*): Self = StObject.set(x, "secret", js.Array(value :_*))
    
    @scala.inline
    def setService(value: js.Array[String]): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
    
    @scala.inline
    def setServiceVarargs(value: String*): Self = StObject.set(x, "service", js.Array(value :_*))
    
    @scala.inline
    def setType(
      value: js.Array[
          container | image | volume | network | daemon | plugin | service | node | secret | config
        ]
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setTypeVarargs(
      value: (container | image | volume | network | daemon | plugin | service | node | secret | config)*
    ): Self = StObject.set(x, "type", js.Array(value :_*))
    
    @scala.inline
    def setVolume(value: js.Array[String]): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeUndefined: Self = StObject.set(x, "volume", js.undefined)
    
    @scala.inline
    def setVolumeVarargs(value: String*): Self = StObject.set(x, "volume", js.Array(value :_*))
  }
}
