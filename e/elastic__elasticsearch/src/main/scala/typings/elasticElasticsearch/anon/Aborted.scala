package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.connectionMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Aborted[TContext] extends StObject {
  
  var aborted: Boolean = js.native
  
  var attempts: Double = js.native
  
  var connection: default = js.native
  
  var context: TContext = js.native
  
  var name: String | js.Symbol = js.native
  
  var request: Options = js.native
  
  var sniff: js.UndefOr[Hosts] = js.native
}
object Aborted {
  
  @scala.inline
  def apply[TContext](
    aborted: Boolean,
    attempts: Double,
    connection: default,
    context: TContext,
    name: String | js.Symbol,
    request: Options
  ): Aborted[TContext] = {
    val __obj = js.Dynamic.literal(aborted = aborted.asInstanceOf[js.Any], attempts = attempts.asInstanceOf[js.Any], connection = connection.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[Aborted[TContext]]
  }
  
  @scala.inline
  implicit class AbortedMutableBuilder[Self <: Aborted[_], TContext] (val x: Self with Aborted[TContext]) extends AnyVal {
    
    @scala.inline
    def setAborted(value: Boolean): Self = StObject.set(x, "aborted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttempts(value: Double): Self = StObject.set(x, "attempts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnection(value: default): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContext(value: TContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String | js.Symbol): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: Options): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSniff(value: Hosts): Self = StObject.set(x, "sniff", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSniffUndefined: Self = StObject.set(x, "sniff", js.undefined)
  }
}
