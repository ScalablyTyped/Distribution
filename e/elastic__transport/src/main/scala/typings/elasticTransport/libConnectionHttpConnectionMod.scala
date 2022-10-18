package typings.elasticTransport

import typings.elasticTransport.anon.FnCall
import typings.elasticTransport.anon.FnCallUrlOptionsCallback
import typings.elasticTransport.libConnectionBaseConnectionMod.ConnectionOptions
import typings.elasticTransport.libConnectionBaseConnectionMod.ConnectionRequestOptions
import typings.elasticTransport.libConnectionBaseConnectionMod.ConnectionRequestParams
import typings.hpagent.mod.HttpProxyAgent
import typings.hpagent.mod.HttpsProxyAgent
import typings.node.httpMod.Agent
import typings.node.httpMod.ClientRequestArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libConnectionHttpConnectionMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.elasticTransport.libConnectionMod.Connection because Already inherited */ @JSImport("@elastic/transport/lib/connection/HttpConnection", JSImport.Default)
  @js.native
  open class default protected () extends HttpConnection {
    def this(opts: ConnectionOptions) = this()
  }
  
  @js.native
  trait HttpConnection
    extends typings.elasticTransport.libConnectionBaseConnectionMod.default {
    
    var agent: js.UndefOr[Agent | typings.node.httpsMod.Agent | HttpProxyAgent | HttpsProxyAgent] = js.native
    
    def buildRequestObject(params: ConnectionRequestParams, options: ConnectionRequestOptions): ClientRequestArgs = js.native
    
    var makeRequest: FnCall | FnCallUrlOptionsCallback = js.native
  }
}
