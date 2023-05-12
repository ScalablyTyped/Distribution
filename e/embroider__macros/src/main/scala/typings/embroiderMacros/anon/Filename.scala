package typings.embroiderMacros.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Filename extends StObject {
  
  var filename: String
  
  var meta: ModuleName
  
  var syntax: Builders
}
object Filename {
  
  inline def apply(filename: String, meta: ModuleName, syntax: Builders): Filename = {
    val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], syntax = syntax.asInstanceOf[js.Any])
    __obj.asInstanceOf[Filename]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Filename] (val x: Self) extends AnyVal {
    
    inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    inline def setMeta(value: ModuleName): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setSyntax(value: Builders): Self = StObject.set(x, "syntax", value.asInstanceOf[js.Any])
  }
}
