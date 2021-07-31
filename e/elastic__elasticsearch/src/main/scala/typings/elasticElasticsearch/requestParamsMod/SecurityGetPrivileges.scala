package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityGetPrivileges
  extends StObject
     with Generic {
  
  var application: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
}
object SecurityGetPrivileges {
  
  @scala.inline
  def apply(): SecurityGetPrivileges = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecurityGetPrivileges]
  }
  
  @scala.inline
  implicit class SecurityGetPrivilegesMutableBuilder[Self <: SecurityGetPrivileges] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: String): Self = StObject.set(x, "application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationUndefined: Self = StObject.set(x, "application", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
