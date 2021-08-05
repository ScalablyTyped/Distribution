package typings.gatsbyPluginUtils.pluginOptionsSchemaJoiTypeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WhenSchemaOptions extends StObject {
  
  /**
    * the alternative schema type if the condition is false. Required if then is missing.
    */
  var otherwise: js.UndefOr[SchemaLike] = js.undefined
  
  /**
    * the alternative schema type if the condition is true. Required if otherwise is missing.
    */
  var `then`: js.UndefOr[SchemaLike] = js.undefined
}
object WhenSchemaOptions {
  
  inline def apply(): WhenSchemaOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WhenSchemaOptions]
  }
  
  extension [Self <: WhenSchemaOptions](x: Self) {
    
    inline def setOtherwise(value: SchemaLike): Self = StObject.set(x, "otherwise", value.asInstanceOf[js.Any])
    
    inline def setOtherwiseNull: Self = StObject.set(x, "otherwise", null)
    
    inline def setOtherwiseUndefined: Self = StObject.set(x, "otherwise", js.undefined)
    
    inline def setThen(value: SchemaLike): Self = StObject.set(x, "then", value.asInstanceOf[js.Any])
    
    inline def setThenNull: Self = StObject.set(x, "then", null)
    
    inline def setThenUndefined: Self = StObject.set(x, "then", js.undefined)
  }
}
