package typings.elasticElasticsearch.requestParamsMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.wait_for
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityPutRole[T]
  extends StObject
     with Generic {
  
  var body: T
  
  var name: String
  
  var refresh: js.UndefOr[wait_for | Boolean] = js.undefined
}
object SecurityPutRole {
  
  @scala.inline
  def apply[T](body: T, name: String): SecurityPutRole[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityPutRole[T]]
  }
  
  @scala.inline
  implicit class SecurityPutRoleMutableBuilder[Self <: SecurityPutRole[?], T] (val x: Self & SecurityPutRole[T]) extends AnyVal {
    
    @scala.inline
    def setBody(value: T): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefresh(value: wait_for | Boolean): Self = StObject.set(x, "refresh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefreshUndefined: Self = StObject.set(x, "refresh", js.undefined)
  }
}
