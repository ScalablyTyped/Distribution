package typings.esbuild.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransformOptions
  extends StObject
     with CommonOptions {
  
  /** Documentation: https://esbuild.github.io/api/#banner */
  var banner: js.UndefOr[String] = js.undefined
  
  /** Documentation: https://esbuild.github.io/api/#footer */
  var footer: js.UndefOr[String] = js.undefined
  
  /** Documentation: https://esbuild.github.io/api/#loader */
  var loader: js.UndefOr[Loader] = js.undefined
  
  /** Documentation: https://esbuild.github.io/api/#sourcefile */
  var sourcefile: js.UndefOr[String] = js.undefined
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
  }
}
