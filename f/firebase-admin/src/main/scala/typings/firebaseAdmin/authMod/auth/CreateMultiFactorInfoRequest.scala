package typings.firebaseAdmin.authMod.auth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface representing base properties of a user enrolled second factor for a
  * `CreateRequest`.
  */
@js.native
trait CreateMultiFactorInfoRequest extends StObject {
  
  /**
    * The optional display name for an enrolled second factor.
    */
  var displayName: js.UndefOr[String] = js.native
  
  /**
    * The type identifier of the second factor. For SMS second factors, this is `phone`.
    */
  var factorId: String = js.native
}
object CreateMultiFactorInfoRequest {
  
  @scala.inline
  def apply(factorId: String): CreateMultiFactorInfoRequest = {
    val __obj = js.Dynamic.literal(factorId = factorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateMultiFactorInfoRequest]
  }
  
  @scala.inline
  implicit class CreateMultiFactorInfoRequestMutableBuilder[Self <: CreateMultiFactorInfoRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setFactorId(value: String): Self = StObject.set(x, "factorId", value.asInstanceOf[js.Any])
  }
}
