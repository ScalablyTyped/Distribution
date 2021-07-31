package typings.googleGax.operationsMod.google.protobuf

import typings.googleGax.operationsMod.google.protobuf.FieldOptions.CType
import typings.googleGax.operationsMod.google.protobuf.FieldOptions.JSType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a FieldOptions. */
trait IFieldOptions extends StObject {
  
  /** FieldOptions ctype */
  var ctype: js.UndefOr[CType | Null] = js.undefined
  
  /** FieldOptions deprecated */
  var deprecated: js.UndefOr[Boolean | Null] = js.undefined
  
  /** FieldOptions jstype */
  var jstype: js.UndefOr[JSType | Null] = js.undefined
  
  /** FieldOptions lazy */
  var `lazy`: js.UndefOr[Boolean | Null] = js.undefined
  
  /** FieldOptions packed */
  var packed: js.UndefOr[Boolean | Null] = js.undefined
  
  /** FieldOptions uninterpretedOption */
  var uninterpretedOption: js.UndefOr[js.Array[IUninterpretedOption] | Null] = js.undefined
  
  /** FieldOptions weak */
  var weak: js.UndefOr[Boolean | Null] = js.undefined
}
object IFieldOptions {
  
  @scala.inline
  def apply(): IFieldOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFieldOptions]
  }
  
  @scala.inline
  implicit class IFieldOptionsMutableBuilder[Self <: IFieldOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCtype(value: CType): Self = StObject.set(x, "ctype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCtypeNull: Self = StObject.set(x, "ctype", null)
    
    @scala.inline
    def setCtypeUndefined: Self = StObject.set(x, "ctype", js.undefined)
    
    @scala.inline
    def setDeprecated(value: Boolean): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeprecatedNull: Self = StObject.set(x, "deprecated", null)
    
    @scala.inline
    def setDeprecatedUndefined: Self = StObject.set(x, "deprecated", js.undefined)
    
    @scala.inline
    def setJstype(value: JSType): Self = StObject.set(x, "jstype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJstypeNull: Self = StObject.set(x, "jstype", null)
    
    @scala.inline
    def setJstypeUndefined: Self = StObject.set(x, "jstype", js.undefined)
    
    @scala.inline
    def setLazy(value: Boolean): Self = StObject.set(x, "lazy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLazyNull: Self = StObject.set(x, "lazy", null)
    
    @scala.inline
    def setLazyUndefined: Self = StObject.set(x, "lazy", js.undefined)
    
    @scala.inline
    def setPacked(value: Boolean): Self = StObject.set(x, "packed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackedNull: Self = StObject.set(x, "packed", null)
    
    @scala.inline
    def setPackedUndefined: Self = StObject.set(x, "packed", js.undefined)
    
    @scala.inline
    def setUninterpretedOption(value: js.Array[IUninterpretedOption]): Self = StObject.set(x, "uninterpretedOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUninterpretedOptionNull: Self = StObject.set(x, "uninterpretedOption", null)
    
    @scala.inline
    def setUninterpretedOptionUndefined: Self = StObject.set(x, "uninterpretedOption", js.undefined)
    
    @scala.inline
    def setUninterpretedOptionVarargs(value: IUninterpretedOption*): Self = StObject.set(x, "uninterpretedOption", js.Array(value :_*))
    
    @scala.inline
    def setWeak(value: Boolean): Self = StObject.set(x, "weak", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeakNull: Self = StObject.set(x, "weak", null)
    
    @scala.inline
    def setWeakUndefined: Self = StObject.set(x, "weak", js.undefined)
  }
}
