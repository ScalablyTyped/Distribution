package typings.esbuildWasm.anon

import typings.esbuildWasm.libBrowserMod.ImportKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait External extends StObject {
  
  var external: js.UndefOr[Boolean] = js.undefined
  
  var kind: ImportKind
  
  var original: js.UndefOr[String] = js.undefined
  
  var path: String
}
object External {
  
  inline def apply(kind: ImportKind, path: String): External = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[External]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: External] (val x: Self) extends AnyVal {
    
    inline def setExternal(value: Boolean): Self = StObject.set(x, "external", value.asInstanceOf[js.Any])
    
    inline def setExternalUndefined: Self = StObject.set(x, "external", js.undefined)
    
    inline def setKind(value: ImportKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setOriginal(value: String): Self = StObject.set(x, "original", value.asInstanceOf[js.Any])
    
    inline def setOriginalUndefined: Self = StObject.set(x, "original", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
