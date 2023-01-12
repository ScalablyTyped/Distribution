package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityPutPrivilegesRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  /** @deprecated The use of the 'body' key has been deprecated, use 'privileges' instead. */
  var body: js.UndefOr[Record[String, Record[String, SecurityPutPrivilegesActions]]] = js.undefined
  
  var refresh: js.UndefOr[Refresh] = js.undefined
}
object SecurityPutPrivilegesRequest {
  
  inline def apply(): SecurityPutPrivilegesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecurityPutPrivilegesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SecurityPutPrivilegesRequest] (val x: Self) extends AnyVal {
    
    inline def setBody(value: Record[String, Record[String, SecurityPutPrivilegesActions]]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setRefresh(value: Refresh): Self = StObject.set(x, "refresh", value.asInstanceOf[js.Any])
    
    inline def setRefreshUndefined: Self = StObject.set(x, "refresh", js.undefined)
  }
}
