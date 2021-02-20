package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Configuration for the peer authentication method.
  */
@js.native
trait SchemaPeerAuthenticationMethod extends StObject {
  
  /**
    * Set if mTLS is used for peer authentication.
    */
  var mtls: js.UndefOr[SchemaMutualTls] = js.native
}
object SchemaPeerAuthenticationMethod {
  
  @scala.inline
  def apply(): SchemaPeerAuthenticationMethod = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPeerAuthenticationMethod]
  }
  
  @scala.inline
  implicit class SchemaPeerAuthenticationMethodMutableBuilder[Self <: SchemaPeerAuthenticationMethod] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMtls(value: SchemaMutualTls): Self = StObject.set(x, "mtls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMtlsUndefined: Self = StObject.set(x, "mtls", js.undefined)
  }
}
