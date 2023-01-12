package typings.esbuildWasm.mod

import typings.esbuildWasm.anon.PartialLocation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PartialMessage extends StObject {
  
  var detail: js.UndefOr[Any] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var location: js.UndefOr[PartialLocation | Null] = js.undefined
  
  var notes: js.UndefOr[js.Array[PartialNote]] = js.undefined
  
  var pluginName: js.UndefOr[String] = js.undefined
  
  var text: js.UndefOr[String] = js.undefined
}
object PartialMessage {
  
  inline def apply(): PartialMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialMessage] (val x: Self) extends AnyVal {
    
    inline def setDetail(value: Any): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    inline def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLocation(value: PartialLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationNull: Self = StObject.set(x, "location", null)
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setNotes(value: js.Array[PartialNote]): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
    
    inline def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
    
    inline def setNotesVarargs(value: PartialNote*): Self = StObject.set(x, "notes", js.Array(value*))
    
    inline def setPluginName(value: String): Self = StObject.set(x, "pluginName", value.asInstanceOf[js.Any])
    
    inline def setPluginNameUndefined: Self = StObject.set(x, "pluginName", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
