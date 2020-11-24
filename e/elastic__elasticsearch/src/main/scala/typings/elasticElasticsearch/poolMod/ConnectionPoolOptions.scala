package typings.elasticElasticsearch.poolMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.none
import typings.elasticElasticsearch.elasticElasticsearchStrings.optimistic
import typings.elasticElasticsearch.elasticElasticsearchStrings.ping
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectionPoolOptions extends BaseConnectionPoolOptions {
  
  var pingTimeout: js.UndefOr[Double] = js.native
  
  var resurrectStrategy: js.UndefOr[ping | optimistic | none] = js.native
  
  var sniffEnabled: js.UndefOr[Boolean] = js.native
}
