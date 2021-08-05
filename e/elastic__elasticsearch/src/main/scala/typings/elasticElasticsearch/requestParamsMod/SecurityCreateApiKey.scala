package typings.elasticElasticsearch.requestParamsMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.wait_for
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityCreateApiKey[T]
  extends StObject
     with Generic {
  
  var body: T
  
  var refresh: js.UndefOr[wait_for | Boolean] = js.undefined
}
object SecurityCreateApiKey {
  
  inline def apply[T](body: T): SecurityCreateApiKey[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityCreateApiKey[T]]
  }
  
  extension [Self <: SecurityCreateApiKey[?], T](x: Self & SecurityCreateApiKey[T]) {
    
    inline def setBody(value: T): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setRefresh(value: wait_for | Boolean): Self = StObject.set(x, "refresh", value.asInstanceOf[js.Any])
    
    inline def setRefreshUndefined: Self = StObject.set(x, "refresh", js.undefined)
  }
}
