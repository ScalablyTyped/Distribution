package typings.googleGax.operationsMod.google.protobuf

import typings.googleGax.operationsMod.google.api.IHttpRule
import typings.googleGax.operationsMod.google.longrunning.IOperationInfo
import typings.googleGax.operationsMod.google.protobuf.MethodOptions.IdempotencyLevel
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
  
  /** MethodOptions .google.longrunning.operationInfo */
  @JSName(".google.longrunning.operationInfo")
  var DotgoogleDotlongrunningDotoperationInfo: js.UndefOr[IOperationInfo | Null] = js.native
  
  /** MethodOptions deprecated */
  var deprecated: js.UndefOr[Boolean | Null] = js.native
  
  /** MethodOptions idempotencyLevel */
  var idempotencyLevel: js.UndefOr[IdempotencyLevel | Null] = js.native
  
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
    def setDotgoogleDotlongrunningDotoperationInfo(value: IOperationInfo): Self = StObject.set(x, ".google.longrunning.operationInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDotgoogleDotlongrunningDotoperationInfoNull: Self = StObject.set(x, ".google.longrunning.operationInfo", null)
    
    @scala.inline
    def setDotgoogleDotlongrunningDotoperationInfoUndefined: Self = StObject.set(x, ".google.longrunning.operationInfo", js.undefined)
    
    @scala.inline
    def setIdempotencyLevel(value: IdempotencyLevel): Self = StObject.set(x, "idempotencyLevel", value.asInstanceOf[js.Any])
    
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
