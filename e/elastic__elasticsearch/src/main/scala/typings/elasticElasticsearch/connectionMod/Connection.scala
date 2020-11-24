package typings.elasticElasticsearch.connectionMod

import typings.hpagent.mod.HttpProxyAgent
import typings.hpagent.mod.HttpsProxyAgent
import typings.node.httpMod.Agent
import typings.node.httpMod.ClientRequest
import typings.node.httpMod.IncomingMessage
import typings.node.urlMod.URL_
import typings.node.utilMod.InspectOptions
import typings.std.Error
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Connection extends js.Object {
  
  def apply(`object`: js.Any, options: InspectOptions): String = js.native
  
  var _agent: Agent | typings.node.httpsMod.Agent | HttpProxyAgent | HttpsProxyAgent = js.native
  
  var _openRequests: Double = js.native
  
  var _status: String = js.native
  
  def buildRequestObject(params: js.Any): /* import warning: importer.ImportType#apply Failed type conversion: node.http.ClientRequestArgs[/ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify inspect.custom * / any] */ js.Any = js.native
  
  def close(): Connection = js.native
  
  var deadCount: Double = js.native
  
  var headers: Record[String, _] = js.native
  
  var id: String = js.native
  
  var makeRequest: js.Any = js.native
  
  def request(
    params: RequestOptions,
    callback: js.Function2[/* err */ Error | Null, /* response */ IncomingMessage | Null, Unit]
  ): ClientRequest = js.native
  
  var resurrectTimeout: Double = js.native
  
  var roles: ConnectionRoles = js.native
  
  def setRole(role: String, enabled: Boolean): Connection = js.native
  
  var ssl: typings.node.tlsMod.ConnectionOptions | Null = js.native
  
  var status: String = js.native
  
  def toJSON(): js.Any = js.native
  
  var url: URL_ = js.native
}
