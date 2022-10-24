package typings.esbuildWasm.anon

import typings.esbuildWasm.esbuildWasmStrings.`react-jsx`
import typings.esbuildWasm.esbuildWasmStrings.`react-jsxdev`
import typings.esbuildWasm.esbuildWasmStrings.error
import typings.esbuildWasm.esbuildWasmStrings.preserve
import typings.esbuildWasm.esbuildWasmStrings.react
import typings.esbuildWasm.esbuildWasmStrings.remove
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlwaysStrict extends StObject {
  
  var alwaysStrict: js.UndefOr[Boolean] = js.undefined
  
  var importsNotUsedAsValues: js.UndefOr[remove | preserve | error] = js.undefined
  
  var jsx: js.UndefOr[react | `react-jsx` | `react-jsxdev` | preserve] = js.undefined
  
  var jsxFactory: js.UndefOr[String] = js.undefined
  
  var jsxFragmentFactory: js.UndefOr[String] = js.undefined
  
  var jsxImportSource: js.UndefOr[String] = js.undefined
  
  var preserveValueImports: js.UndefOr[Boolean] = js.undefined
  
  var target: js.UndefOr[String] = js.undefined
  
  var useDefineForClassFields: js.UndefOr[Boolean] = js.undefined
}
object AlwaysStrict {
  
  inline def apply(): AlwaysStrict = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlwaysStrict]
  }
  
  extension [Self <: AlwaysStrict](x: Self) {
    
    inline def setAlwaysStrict(value: Boolean): Self = StObject.set(x, "alwaysStrict", value.asInstanceOf[js.Any])
    
    inline def setAlwaysStrictUndefined: Self = StObject.set(x, "alwaysStrict", js.undefined)
    
    inline def setImportsNotUsedAsValues(value: remove | preserve | error): Self = StObject.set(x, "importsNotUsedAsValues", value.asInstanceOf[js.Any])
    
    inline def setImportsNotUsedAsValuesUndefined: Self = StObject.set(x, "importsNotUsedAsValues", js.undefined)
    
    inline def setJsx(value: react | `react-jsx` | `react-jsxdev` | preserve): Self = StObject.set(x, "jsx", value.asInstanceOf[js.Any])
    
    inline def setJsxFactory(value: String): Self = StObject.set(x, "jsxFactory", value.asInstanceOf[js.Any])
    
    inline def setJsxFactoryUndefined: Self = StObject.set(x, "jsxFactory", js.undefined)
    
    inline def setJsxFragmentFactory(value: String): Self = StObject.set(x, "jsxFragmentFactory", value.asInstanceOf[js.Any])
    
    inline def setJsxFragmentFactoryUndefined: Self = StObject.set(x, "jsxFragmentFactory", js.undefined)
    
    inline def setJsxImportSource(value: String): Self = StObject.set(x, "jsxImportSource", value.asInstanceOf[js.Any])
    
    inline def setJsxImportSourceUndefined: Self = StObject.set(x, "jsxImportSource", js.undefined)
    
    inline def setJsxUndefined: Self = StObject.set(x, "jsx", js.undefined)
    
    inline def setPreserveValueImports(value: Boolean): Self = StObject.set(x, "preserveValueImports", value.asInstanceOf[js.Any])
    
    inline def setPreserveValueImportsUndefined: Self = StObject.set(x, "preserveValueImports", js.undefined)
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def setUseDefineForClassFields(value: Boolean): Self = StObject.set(x, "useDefineForClassFields", value.asInstanceOf[js.Any])
    
    inline def setUseDefineForClassFieldsUndefined: Self = StObject.set(x, "useDefineForClassFields", js.undefined)
  }
}
