package typings.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf

import typings.googleCloudTextToSpeech.buildProtosProtosMod.google.api.FieldBehavior
import typings.googleCloudTextToSpeech.buildProtosProtosMod.google.api.IResourceReference
import typings.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.FieldOptions.CType
import typings.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.FieldOptions.JSType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a FieldOptions. */
trait IFieldOptions extends StObject {
  
  /** FieldOptions .google.api.fieldBehavior */
  @JSName(".google.api.fieldBehavior")
  var DotgoogleDotapiDotfieldBehavior: js.UndefOr[js.Array[FieldBehavior] | Null] = js.undefined
  
  /** FieldOptions .google.api.resourceReference */
  @JSName(".google.api.resourceReference")
  var DotgoogleDotapiDotresourceReference: js.UndefOr[IResourceReference | Null] = js.undefined
  
  /** FieldOptions ctype */
  var ctype: js.UndefOr[
    CType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.protobuf.FieldOptions.CType * / any */ String) | Null
  ] = js.undefined
  
  /** FieldOptions deprecated */
  var deprecated: js.UndefOr[Boolean | Null] = js.undefined
  
  /** FieldOptions jstype */
  var jstype: js.UndefOr[
    JSType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.protobuf.FieldOptions.JSType * / any */ String) | Null
  ] = js.undefined
  
  /** FieldOptions lazy */
  var `lazy`: js.UndefOr[Boolean | Null] = js.undefined
  
  /** FieldOptions packed */
  var packed: js.UndefOr[Boolean | Null] = js.undefined
  
  /** FieldOptions uninterpretedOption */
  var uninterpretedOption: js.UndefOr[js.Array[IUninterpretedOption] | Null] = js.undefined
  
  /** FieldOptions unverifiedLazy */
  var unverifiedLazy: js.UndefOr[Boolean | Null] = js.undefined
  
  /** FieldOptions weak */
  var weak: js.UndefOr[Boolean | Null] = js.undefined
}
object IFieldOptions {
  
  inline def apply(): IFieldOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFieldOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IFieldOptions] (val x: Self) extends AnyVal {
    
    inline def setCtype(
      value: CType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.protobuf.FieldOptions.CType * / any */ String)
    ): Self = StObject.set(x, "ctype", value.asInstanceOf[js.Any])
    
    inline def setCtypeNull: Self = StObject.set(x, "ctype", null)
    
    inline def setCtypeUndefined: Self = StObject.set(x, "ctype", js.undefined)
    
    inline def setDeprecated(value: Boolean): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
    
    inline def setDeprecatedNull: Self = StObject.set(x, "deprecated", null)
    
    inline def setDeprecatedUndefined: Self = StObject.set(x, "deprecated", js.undefined)
    
    inline def setDotgoogleDotapiDotfieldBehavior(value: js.Array[FieldBehavior]): Self = StObject.set(x, ".google.api.fieldBehavior", value.asInstanceOf[js.Any])
    
    inline def setDotgoogleDotapiDotfieldBehaviorNull: Self = StObject.set(x, ".google.api.fieldBehavior", null)
    
    inline def setDotgoogleDotapiDotfieldBehaviorUndefined: Self = StObject.set(x, ".google.api.fieldBehavior", js.undefined)
    
    inline def setDotgoogleDotapiDotfieldBehaviorVarargs(value: FieldBehavior*): Self = StObject.set(x, ".google.api.fieldBehavior", js.Array(value*))
    
    inline def setDotgoogleDotapiDotresourceReference(value: IResourceReference): Self = StObject.set(x, ".google.api.resourceReference", value.asInstanceOf[js.Any])
    
    inline def setDotgoogleDotapiDotresourceReferenceNull: Self = StObject.set(x, ".google.api.resourceReference", null)
    
    inline def setDotgoogleDotapiDotresourceReferenceUndefined: Self = StObject.set(x, ".google.api.resourceReference", js.undefined)
    
    inline def setJstype(
      value: JSType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.protobuf.FieldOptions.JSType * / any */ String)
    ): Self = StObject.set(x, "jstype", value.asInstanceOf[js.Any])
    
    inline def setJstypeNull: Self = StObject.set(x, "jstype", null)
    
    inline def setJstypeUndefined: Self = StObject.set(x, "jstype", js.undefined)
    
    inline def setLazy(value: Boolean): Self = StObject.set(x, "lazy", value.asInstanceOf[js.Any])
    
    inline def setLazyNull: Self = StObject.set(x, "lazy", null)
    
    inline def setLazyUndefined: Self = StObject.set(x, "lazy", js.undefined)
    
    inline def setPacked(value: Boolean): Self = StObject.set(x, "packed", value.asInstanceOf[js.Any])
    
    inline def setPackedNull: Self = StObject.set(x, "packed", null)
    
    inline def setPackedUndefined: Self = StObject.set(x, "packed", js.undefined)
    
    inline def setUninterpretedOption(value: js.Array[IUninterpretedOption]): Self = StObject.set(x, "uninterpretedOption", value.asInstanceOf[js.Any])
    
    inline def setUninterpretedOptionNull: Self = StObject.set(x, "uninterpretedOption", null)
    
    inline def setUninterpretedOptionUndefined: Self = StObject.set(x, "uninterpretedOption", js.undefined)
    
    inline def setUninterpretedOptionVarargs(value: IUninterpretedOption*): Self = StObject.set(x, "uninterpretedOption", js.Array(value*))
    
    inline def setUnverifiedLazy(value: Boolean): Self = StObject.set(x, "unverifiedLazy", value.asInstanceOf[js.Any])
    
    inline def setUnverifiedLazyNull: Self = StObject.set(x, "unverifiedLazy", null)
    
    inline def setUnverifiedLazyUndefined: Self = StObject.set(x, "unverifiedLazy", js.undefined)
    
    inline def setWeak(value: Boolean): Self = StObject.set(x, "weak", value.asInstanceOf[js.Any])
    
    inline def setWeakNull: Self = StObject.set(x, "weak", null)
    
    inline def setWeakUndefined: Self = StObject.set(x, "weak", js.undefined)
  }
}
