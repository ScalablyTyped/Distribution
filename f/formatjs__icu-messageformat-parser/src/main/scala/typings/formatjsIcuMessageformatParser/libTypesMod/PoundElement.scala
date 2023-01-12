package typings.formatjsIcuMessageformatParser.libTypesMod

import typings.formatjsIcuMessageformatParser.libTypesMod.TYPE.pound
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PoundElement
  extends StObject
     with _MessageFormatElement {
  
  var location: js.UndefOr[Location] = js.undefined
  
  var `type`: pound
}
object PoundElement {
  
  inline def apply(`type`: pound): PoundElement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PoundElement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PoundElement] (val x: Self) extends AnyVal {
    
    inline def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setType(value: pound): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
