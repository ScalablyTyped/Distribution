package typings.formatjsEcma402Abstract.anon

import typings.formatjsEcma402Abstract.libTypesDateTimeMod.Formats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Full extends StObject {
  
  var full: Formats
  
  var long: Formats
  
  var medium: Formats
  
  var short: Formats
}
object Full {
  
  inline def apply(full: Formats, long: Formats, medium: Formats, short: Formats): Full = {
    val __obj = js.Dynamic.literal(full = full.asInstanceOf[js.Any], long = long.asInstanceOf[js.Any], medium = medium.asInstanceOf[js.Any], short = short.asInstanceOf[js.Any])
    __obj.asInstanceOf[Full]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Full] (val x: Self) extends AnyVal {
    
    inline def setFull(value: Formats): Self = StObject.set(x, "full", value.asInstanceOf[js.Any])
    
    inline def setLong(value: Formats): Self = StObject.set(x, "long", value.asInstanceOf[js.Any])
    
    inline def setMedium(value: Formats): Self = StObject.set(x, "medium", value.asInstanceOf[js.Any])
    
    inline def setShort(value: Formats): Self = StObject.set(x, "short", value.asInstanceOf[js.Any])
  }
}
