package typings.gatsbyPluginUtils.pluginOptionsSchemaJoiTypeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MutateRegisterOptions extends StObject {
  
  var family: js.UndefOr[js.Any] = js.undefined
  
  var key: js.UndefOr[js.Any] = js.undefined
}
object MutateRegisterOptions {
  
  inline def apply(): MutateRegisterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MutateRegisterOptions]
  }
  
  extension [Self <: MutateRegisterOptions](x: Self) {
    
    inline def setFamily(value: js.Any): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
    
    inline def setFamilyUndefined: Self = StObject.set(x, "family", js.undefined)
    
    inline def setKey(value: js.Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
  }
}
