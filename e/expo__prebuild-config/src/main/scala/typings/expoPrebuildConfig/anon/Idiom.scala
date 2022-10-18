package typings.expoPrebuildConfig.anon

import typings.expoPrebuildConfig.buildPluginsIconsAssetContentsMod.ContentsJsonImageIdiom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Idiom extends StObject {
  
  var idiom: ContentsJsonImageIdiom
  
  var sizes: js.Array[Scales]
}
object Idiom {
  
  inline def apply(idiom: ContentsJsonImageIdiom, sizes: js.Array[Scales]): Idiom = {
    val __obj = js.Dynamic.literal(idiom = idiom.asInstanceOf[js.Any], sizes = sizes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Idiom]
  }
  
  extension [Self <: Idiom](x: Self) {
    
    inline def setIdiom(value: ContentsJsonImageIdiom): Self = StObject.set(x, "idiom", value.asInstanceOf[js.Any])
    
    inline def setSizes(value: js.Array[Scales]): Self = StObject.set(x, "sizes", value.asInstanceOf[js.Any])
    
    inline def setSizesVarargs(value: Scales*): Self = StObject.set(x, "sizes", js.Array(value*))
  }
}
