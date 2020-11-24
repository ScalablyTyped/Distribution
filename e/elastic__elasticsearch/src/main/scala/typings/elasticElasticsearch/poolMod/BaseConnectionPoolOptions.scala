package typings.elasticElasticsearch.poolMod

import typings.elasticElasticsearch.anon.TypeofConnection
import typings.elasticElasticsearch.connectionMod.AgentOptions
import typings.node.tlsMod.SecureContextOptions
import typings.node.urlMod.URL_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseConnectionPoolOptions extends js.Object {
  
  var Connection: TypeofConnection = js.native
  
  var agent: js.UndefOr[AgentOptions] = js.native
  
  var auth: js.UndefOr[BasicAuth | ApiKeyAuth] = js.native
  
  def emit(event: String, args: js.Any*): Boolean = js.native
  def emit(event: js.Symbol, args: js.Any*): Boolean = js.native
  
  var proxy: js.UndefOr[String | URL_] = js.native
  
  var ssl: js.UndefOr[SecureContextOptions] = js.native
}
