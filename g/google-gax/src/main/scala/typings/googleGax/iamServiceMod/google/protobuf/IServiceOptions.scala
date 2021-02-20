package typings.googleGax.iamServiceMod.google.protobuf

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a ServiceOptions. */
@js.native
trait IServiceOptions extends StObject {
  
  /** ServiceOptions .google.api.defaultHost */
  @JSName(".google.api.defaultHost")
  var DotgoogleDotapiDotdefaultHost: js.UndefOr[String | Null] = js.native
  
  /** ServiceOptions .google.api.oauthScopes */
  @JSName(".google.api.oauthScopes")
  var DotgoogleDotapiDotoauthScopes: js.UndefOr[String | Null] = js.native
  
  /** ServiceOptions deprecated */
  var deprecated: js.UndefOr[Boolean | Null] = js.native
  
  /** ServiceOptions uninterpretedOption */
  var uninterpretedOption: js.UndefOr[js.Array[IUninterpretedOption] | Null] = js.native
}
object IServiceOptions {
  
  @scala.inline
  def apply(): IServiceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IServiceOptions]
  }
  
  @scala.inline
  implicit class IServiceOptionsMutableBuilder[Self <: IServiceOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeprecated(value: Boolean): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeprecatedNull: Self = StObject.set(x, "deprecated", null)
    
    @scala.inline
    def setDeprecatedUndefined: Self = StObject.set(x, "deprecated", js.undefined)
    
    @scala.inline
    def setDotgoogleDotapiDotdefaultHost(value: String): Self = StObject.set(x, ".google.api.defaultHost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDotgoogleDotapiDotdefaultHostNull: Self = StObject.set(x, ".google.api.defaultHost", null)
    
    @scala.inline
    def setDotgoogleDotapiDotdefaultHostUndefined: Self = StObject.set(x, ".google.api.defaultHost", js.undefined)
    
    @scala.inline
    def setDotgoogleDotapiDotoauthScopes(value: String): Self = StObject.set(x, ".google.api.oauthScopes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDotgoogleDotapiDotoauthScopesNull: Self = StObject.set(x, ".google.api.oauthScopes", null)
    
    @scala.inline
    def setDotgoogleDotapiDotoauthScopesUndefined: Self = StObject.set(x, ".google.api.oauthScopes", js.undefined)
    
    @scala.inline
    def setUninterpretedOption(value: js.Array[IUninterpretedOption]): Self = StObject.set(x, "uninterpretedOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUninterpretedOptionNull: Self = StObject.set(x, "uninterpretedOption", null)
    
    @scala.inline
    def setUninterpretedOptionUndefined: Self = StObject.set(x, "uninterpretedOption", js.undefined)
    
    @scala.inline
    def setUninterpretedOptionVarargs(value: IUninterpretedOption*): Self = StObject.set(x, "uninterpretedOption", js.Array(value :_*))
  }
}
