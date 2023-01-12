package typings.esbuildWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StdinOptions extends StObject {
  
  var contents: String | js.typedarray.Uint8Array
  
  var loader: js.UndefOr[Loader] = js.undefined
  
  var resolveDir: js.UndefOr[String] = js.undefined
  
  var sourcefile: js.UndefOr[String] = js.undefined
}
object StdinOptions {
  
  inline def apply(contents: String | js.typedarray.Uint8Array): StdinOptions = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any])
    __obj.asInstanceOf[StdinOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StdinOptions] (val x: Self) extends AnyVal {
    
    inline def setContents(value: String | js.typedarray.Uint8Array): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
    
    inline def setLoader(value: Loader): Self = StObject.set(x, "loader", value.asInstanceOf[js.Any])
    
    inline def setLoaderUndefined: Self = StObject.set(x, "loader", js.undefined)
    
    inline def setResolveDir(value: String): Self = StObject.set(x, "resolveDir", value.asInstanceOf[js.Any])
    
    inline def setResolveDirUndefined: Self = StObject.set(x, "resolveDir", js.undefined)
    
    inline def setSourcefile(value: String): Self = StObject.set(x, "sourcefile", value.asInstanceOf[js.Any])
    
    inline def setSourcefileUndefined: Self = StObject.set(x, "sourcefile", js.undefined)
  }
}
