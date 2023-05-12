package typings.esbuildWasm.anon

import typings.esbuildWasm.esbuildWasmStrings.`file-loader`
import typings.esbuildWasm.libBrowserMod.ImportKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Kind extends StObject {
  
  var external: js.UndefOr[Boolean] = js.undefined
  
  var kind: ImportKind | `file-loader`
  
  var path: String
}
object Kind {
  
  inline def apply(kind: ImportKind | `file-loader`, path: String): Kind = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Kind]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Kind] (val x: Self) extends AnyVal {
    
    inline def setExternal(value: Boolean): Self = StObject.set(x, "external", value.asInstanceOf[js.Any])
    
    inline def setExternalUndefined: Self = StObject.set(x, "external", js.undefined)
    
    inline def setKind(value: ImportKind | `file-loader`): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
