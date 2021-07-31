package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.connectionMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Aborted[TContext] extends StObject {
  
  var aborted: Boolean
  
  var attempts: Double
  
  var connection: default
  
  var context: TContext
  
  var name: String | js.Symbol
  
  var request: Options
  
  var sniff: js.UndefOr[Hosts] = js.undefined
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
  implicit class AbortedMutableBuilder[Self <: Aborted[?], TContext] (val x: Self & Aborted[TContext]) extends AnyVal {
    
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
