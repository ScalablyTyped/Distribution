package typings.embroiderSharedInternals.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportedName extends StObject {
  
  var exportedName: String
  
  var module: String
}
object ExportedName {
  
  inline def apply(exportedName: String, module: String): ExportedName = {
    val __obj = js.Dynamic.literal(exportedName = exportedName.asInstanceOf[js.Any], module = module.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportedName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExportedName] (val x: Self) extends AnyVal {
    
    inline def setExportedName(value: String): Self = StObject.set(x, "exportedName", value.asInstanceOf[js.Any])
    
    inline def setModule(value: String): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
  }
}
