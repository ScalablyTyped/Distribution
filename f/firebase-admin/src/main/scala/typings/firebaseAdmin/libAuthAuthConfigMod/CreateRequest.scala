package typings.firebaseAdmin.libAuthAuthConfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateRequest
  extends StObject
     with UpdateRequest {
  
  /**
    * The user's multi-factor related properties.
    */
  @JSName("multiFactor")
  var multiFactor_CreateRequest: js.UndefOr[MultiFactorCreateSettings] = js.undefined
  
  /**
    * The user's `uid`.
    */
  var uid: js.UndefOr[String] = js.undefined
}
object CreateRequest {
  
  inline def apply(): CreateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateRequest]
  }
  
  extension [Self <: CreateRequest](x: Self) {
    
    inline def setMultiFactor(value: MultiFactorCreateSettings): Self = StObject.set(x, "multiFactor", value.asInstanceOf[js.Any])
    
    inline def setMultiFactorUndefined: Self = StObject.set(x, "multiFactor", js.undefined)
    
    inline def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    
    inline def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
  }
}
