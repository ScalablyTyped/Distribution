package typings.esbuildWasm.libBrowserMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutputFile extends StObject {
  
  /** "text" as bytes */
  var contents: js.typedarray.Uint8Array
  
  var path: String
  
  /** "contents" as text */
  var text: String
}
object OutputFile {
  
  inline def apply(contents: js.typedarray.Uint8Array, path: String, text: String): OutputFile = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputFile]
  }
  
  extension [Self <: OutputFile](x: Self) {
    
    inline def setContents(value: js.typedarray.Uint8Array): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
