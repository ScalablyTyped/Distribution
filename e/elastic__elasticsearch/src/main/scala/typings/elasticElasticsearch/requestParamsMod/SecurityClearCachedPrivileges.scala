package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityClearCachedPrivileges
  extends StObject
     with Generic {
  
  var application: String | js.Array[String]
}
object SecurityClearCachedPrivileges {
  
  @scala.inline
  def apply(application: String | js.Array[String]): SecurityClearCachedPrivileges = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityClearCachedPrivileges]
  }
  
  @scala.inline
  implicit class SecurityClearCachedPrivilegesMutableBuilder[Self <: SecurityClearCachedPrivileges] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: String | js.Array[String]): Self = StObject.set(x, "application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationVarargs(value: String*): Self = StObject.set(x, "application", js.Array(value :_*))
  }
}
