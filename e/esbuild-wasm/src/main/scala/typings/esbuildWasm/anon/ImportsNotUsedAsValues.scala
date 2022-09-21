package typings.esbuildWasm.anon

import typings.esbuildWasm.esbuildWasmStrings.error
import typings.esbuildWasm.esbuildWasmStrings.preserve
import typings.esbuildWasm.esbuildWasmStrings.remove
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportsNotUsedAsValues extends StObject {
  
  var importsNotUsedAsValues: js.UndefOr[remove | preserve | error] = js.undefined
  
  var jsxFactory: js.UndefOr[String] = js.undefined
  
  var jsxFragmentFactory: js.UndefOr[String] = js.undefined
  
  var preserveValueImports: js.UndefOr[Boolean] = js.undefined
  
  var useDefineForClassFields: js.UndefOr[Boolean] = js.undefined
}
object ImportsNotUsedAsValues {
  
  inline def apply(): ImportsNotUsedAsValues = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportsNotUsedAsValues]
  }
  
  extension [Self <: ImportsNotUsedAsValues](x: Self) {
    
    inline def setImportsNotUsedAsValues(value: remove | preserve | error): Self = StObject.set(x, "importsNotUsedAsValues", value.asInstanceOf[js.Any])
    
    inline def setImportsNotUsedAsValuesUndefined: Self = StObject.set(x, "importsNotUsedAsValues", js.undefined)
    
    inline def setJsxFactory(value: String): Self = StObject.set(x, "jsxFactory", value.asInstanceOf[js.Any])
    
    inline def setJsxFactoryUndefined: Self = StObject.set(x, "jsxFactory", js.undefined)
    
    inline def setJsxFragmentFactory(value: String): Self = StObject.set(x, "jsxFragmentFactory", value.asInstanceOf[js.Any])
    
    inline def setJsxFragmentFactoryUndefined: Self = StObject.set(x, "jsxFragmentFactory", js.undefined)
    
    inline def setPreserveValueImports(value: Boolean): Self = StObject.set(x, "preserveValueImports", value.asInstanceOf[js.Any])
    
    inline def setPreserveValueImportsUndefined: Self = StObject.set(x, "preserveValueImports", js.undefined)
    
    inline def setUseDefineForClassFields(value: Boolean): Self = StObject.set(x, "useDefineForClassFields", value.asInstanceOf[js.Any])
    
    inline def setUseDefineForClassFieldsUndefined: Self = StObject.set(x, "useDefineForClassFields", js.undefined)
  }
}
