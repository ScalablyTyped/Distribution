package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityClearCachedPrivilegesRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var application: Name
}
object SecurityClearCachedPrivilegesRequest {
  
  inline def apply(application: Name): SecurityClearCachedPrivilegesRequest = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityClearCachedPrivilegesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SecurityClearCachedPrivilegesRequest] (val x: Self) extends AnyVal {
    
    inline def setApplication(value: Name): Self = StObject.set(x, "application", value.asInstanceOf[js.Any])
  }
}
