package typings.elasticElasticsearch.requestParamsMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.wait_for
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SecurityPutRoleMapping[T] extends Generic {
  
  var body: T = js.native
  
  var name: String = js.native
  
  var refresh: js.UndefOr[wait_for | Boolean] = js.native
}
object SecurityPutRoleMapping {
  
  @scala.inline
  def apply[T](body: T, name: String): SecurityPutRoleMapping[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityPutRoleMapping[T]]
  }
  
  @scala.inline
  implicit class SecurityPutRoleMappingMutableBuilder[Self <: SecurityPutRoleMapping[_], T] (val x: Self with SecurityPutRoleMapping[T]) extends AnyVal {
    
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
