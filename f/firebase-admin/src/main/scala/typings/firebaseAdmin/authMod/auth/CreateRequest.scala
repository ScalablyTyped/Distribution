package typings.firebaseAdmin.authMod.auth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface representing the properties to set on a new user record to be
  * created.
  */
@js.native
trait CreateRequest extends UpdateRequest {
  
  /**
    * The user's multi-factor related properties.
    */
  @JSName("multiFactor")
  var multiFactor_CreateRequest: js.UndefOr[MultiFactorCreateSettings] = js.native
  
  /**
    * The user's `uid`.
    */
  var uid: js.UndefOr[String] = js.native
}
object CreateRequest {
  
  @scala.inline
  def apply(): CreateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateRequest]
  }
  
  @scala.inline
  implicit class CreateRequestMutableBuilder[Self <: CreateRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMultiFactor(value: MultiFactorCreateSettings): Self = StObject.set(x, "multiFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiFactorUndefined: Self = StObject.set(x, "multiFactor", js.undefined)
    
    @scala.inline
    def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
  }
}
