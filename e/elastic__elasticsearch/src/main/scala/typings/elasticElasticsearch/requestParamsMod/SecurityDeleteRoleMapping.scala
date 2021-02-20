package typings.elasticElasticsearch.requestParamsMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.wait_for
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SecurityDeleteRoleMapping extends Generic {
  
  var name: String = js.native
  
  var refresh: js.UndefOr[wait_for | Boolean] = js.native
}
object SecurityDeleteRoleMapping {
  
  @scala.inline
  def apply(name: String): SecurityDeleteRoleMapping = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityDeleteRoleMapping]
  }
  
  @scala.inline
  implicit class SecurityDeleteRoleMappingMutableBuilder[Self <: SecurityDeleteRoleMapping] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefresh(value: wait_for | Boolean): Self = StObject.set(x, "refresh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefreshUndefined: Self = StObject.set(x, "refresh", js.undefined)
  }
}
