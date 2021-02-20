package typings.googleCloudPubsub.protosMod.google.protobuf

import typings.googleCloudPubsub.protosMod.google.api.IHttpRule
import typings.googleCloudPubsub.protosMod.google.protobuf.MethodOptions.IdempotencyLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a MethodOptions. */
@js.native
trait IMethodOptions extends StObject {
  
  /** MethodOptions .google.api.http */
  @JSName(".google.api.http")
  var DotgoogleDotapiDothttp: js.UndefOr[IHttpRule | Null] = js.native
  
  /** MethodOptions .google.api.methodSignature */
  @JSName(".google.api.methodSignature")
  var DotgoogleDotapiDotmethodSignature: js.UndefOr[js.Array[String] | Null] = js.native
  
  /** MethodOptions deprecated */
  var deprecated: js.UndefOr[Boolean | Null] = js.native
  
  /** MethodOptions idempotencyLevel */
  var idempotencyLevel: js.UndefOr[
    IdempotencyLevel | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.protobuf.MethodOptions.IdempotencyLevel * / any */ String) | Null
  ] = js.native
  
  /** MethodOptions uninterpretedOption */
  var uninterpretedOption: js.UndefOr[js.Array[IUninterpretedOption] | Null] = js.native
}
object IMethodOptions {
  
  @scala.inline
  def apply(): IMethodOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMethodOptions]
  }
  
  @scala.inline
  implicit class IMethodOptionsMutableBuilder[Self <: IMethodOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeprecated(value: Boolean): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeprecatedNull: Self = StObject.set(x, "deprecated", null)
    
    @scala.inline
    def setDeprecatedUndefined: Self = StObject.set(x, "deprecated", js.undefined)
    
    @scala.inline
    def setDotgoogleDotapiDothttp(value: IHttpRule): Self = StObject.set(x, ".google.api.http", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDotgoogleDotapiDothttpNull: Self = StObject.set(x, ".google.api.http", null)
    
    @scala.inline
    def setDotgoogleDotapiDothttpUndefined: Self = StObject.set(x, ".google.api.http", js.undefined)
    
    @scala.inline
    def setDotgoogleDotapiDotmethodSignature(value: js.Array[String]): Self = StObject.set(x, ".google.api.methodSignature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDotgoogleDotapiDotmethodSignatureNull: Self = StObject.set(x, ".google.api.methodSignature", null)
    
    @scala.inline
    def setDotgoogleDotapiDotmethodSignatureUndefined: Self = StObject.set(x, ".google.api.methodSignature", js.undefined)
    
    @scala.inline
    def setDotgoogleDotapiDotmethodSignatureVarargs(value: String*): Self = StObject.set(x, ".google.api.methodSignature", js.Array(value :_*))
    
    @scala.inline
    def setIdempotencyLevel(
      value: IdempotencyLevel | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.protobuf.MethodOptions.IdempotencyLevel * / any */ String)
    ): Self = StObject.set(x, "idempotencyLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdempotencyLevelNull: Self = StObject.set(x, "idempotencyLevel", null)
    
    @scala.inline
    def setIdempotencyLevelUndefined: Self = StObject.set(x, "idempotencyLevel", js.undefined)
    
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
