package typings.dockerode.mod

import typings.dockerode.dockerodeStrings.http
import typings.dockerode.dockerodeStrings.https
import typings.dockerode.dockerodeStrings.ssh
import typings.node.bufferMod.global.Buffer
import typings.std.PromiseConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DockerOptions extends StObject {
  
  var Promise: js.UndefOr[PromiseConstructor] = js.undefined
  
  var ca: js.UndefOr[String | (js.Array[Buffer | String]) | Buffer] = js.undefined
  
  var cert: js.UndefOr[String | (js.Array[Buffer | String]) | Buffer] = js.undefined
  
  var host: js.UndefOr[String] = js.undefined
  
  var key: js.UndefOr[String | (js.Array[Buffer | KeyObject | String]) | Buffer] = js.undefined
  
  var port: js.UndefOr[Double | String] = js.undefined
  
  var protocol: js.UndefOr[https | http | ssh] = js.undefined
  
  var socketPath: js.UndefOr[String] = js.undefined
  
  var sshAuthAgent: js.UndefOr[String] = js.undefined
  
  var timeout: js.UndefOr[Double] = js.undefined
  
  var username: js.UndefOr[String] = js.undefined
  
  var version: js.UndefOr[String] = js.undefined
}
object DockerOptions {
  
  inline def apply(): DockerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DockerOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DockerOptions] (val x: Self) extends AnyVal {
    
    inline def setCa(value: String | (js.Array[Buffer | String]) | Buffer): Self = StObject.set(x, "ca", value.asInstanceOf[js.Any])
    
    inline def setCaUndefined: Self = StObject.set(x, "ca", js.undefined)
    
    inline def setCaVarargs(value: (Buffer | String)*): Self = StObject.set(x, "ca", js.Array(value*))
    
    inline def setCert(value: String | (js.Array[Buffer | String]) | Buffer): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
    
    inline def setCertUndefined: Self = StObject.set(x, "cert", js.undefined)
    
    inline def setCertVarargs(value: (Buffer | String)*): Self = StObject.set(x, "cert", js.Array(value*))
    
    inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    inline def setKey(value: String | (js.Array[Buffer | KeyObject | String]) | Buffer): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setKeyVarargs(value: (Buffer | KeyObject | String)*): Self = StObject.set(x, "key", js.Array(value*))
    
    inline def setPort(value: Double | String): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    inline def setPromise(value: PromiseConstructor): Self = StObject.set(x, "Promise", value.asInstanceOf[js.Any])
    
    inline def setPromiseUndefined: Self = StObject.set(x, "Promise", js.undefined)
    
    inline def setProtocol(value: https | http | ssh): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
    
    inline def setSocketPath(value: String): Self = StObject.set(x, "socketPath", value.asInstanceOf[js.Any])
    
    inline def setSocketPathUndefined: Self = StObject.set(x, "socketPath", js.undefined)
    
    inline def setSshAuthAgent(value: String): Self = StObject.set(x, "sshAuthAgent", value.asInstanceOf[js.Any])
    
    inline def setSshAuthAgentUndefined: Self = StObject.set(x, "sshAuthAgent", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
