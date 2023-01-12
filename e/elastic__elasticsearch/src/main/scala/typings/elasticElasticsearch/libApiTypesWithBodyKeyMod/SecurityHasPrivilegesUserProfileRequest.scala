package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.elasticElasticsearch.anon.Privileges
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityHasPrivilegesUserProfileRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  /** @deprecated The use of the 'body' key has been deprecated, move the nested keys to the top level object. */
  var body: js.UndefOr[Privileges] = js.undefined
}
object SecurityHasPrivilegesUserProfileRequest {
  
  inline def apply(): SecurityHasPrivilegesUserProfileRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecurityHasPrivilegesUserProfileRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SecurityHasPrivilegesUserProfileRequest] (val x: Self) extends AnyVal {
    
    inline def setBody(value: Privileges): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
  }
}
