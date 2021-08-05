package typings.elasticElasticsearch.requestParamsMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.wait_for
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityPutRoleMapping[T]
  extends StObject
     with Generic {
  
  var body: T
  
  var name: String
  
  var refresh: js.UndefOr[wait_for | Boolean] = js.undefined
}
object SecurityPutRoleMapping {
  
  inline def apply[T](body: T, name: String): SecurityPutRoleMapping[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityPutRoleMapping[T]]
  }
  
  extension [Self <: SecurityPutRoleMapping[?], T](x: Self & SecurityPutRoleMapping[T]) {
    
    inline def setBody(value: T): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRefresh(value: wait_for | Boolean): Self = StObject.set(x, "refresh", value.asInstanceOf[js.Any])
    
    inline def setRefreshUndefined: Self = StObject.set(x, "refresh", js.undefined)
  }
}
