package typings.esbuildWasm.mod

import typings.esbuildWasm.anon.CompilerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransformOptions
  extends StObject
     with CommonOptions {
  
  var banner: js.UndefOr[String] = js.undefined
  
  var footer: js.UndefOr[String] = js.undefined
  
  var loader: js.UndefOr[Loader] = js.undefined
  
  var sourcefile: js.UndefOr[String] = js.undefined
  
  var tsconfigRaw: js.UndefOr[String | CompilerOptions] = js.undefined
}
object TransformOptions {
  
  inline def apply(): TransformOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransformOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TransformOptions] (val x: Self) extends AnyVal {
    
    inline def setBanner(value: String): Self = StObject.set(x, "banner", value.asInstanceOf[js.Any])
    
    inline def setBannerUndefined: Self = StObject.set(x, "banner", js.undefined)
    
    inline def setFooter(value: String): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
    
    inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
    
    inline def setLoader(value: Loader): Self = StObject.set(x, "loader", value.asInstanceOf[js.Any])
    
    inline def setLoaderUndefined: Self = StObject.set(x, "loader", js.undefined)
    
    inline def setSourcefile(value: String): Self = StObject.set(x, "sourcefile", value.asInstanceOf[js.Any])
    
    inline def setSourcefileUndefined: Self = StObject.set(x, "sourcefile", js.undefined)
    
    inline def setTsconfigRaw(value: String | CompilerOptions): Self = StObject.set(x, "tsconfigRaw", value.asInstanceOf[js.Any])
    
    inline def setTsconfigRawUndefined: Self = StObject.set(x, "tsconfigRaw", js.undefined)
  }
}
