package typings.formatjsEcma402Abstract.anon

import typings.formatjsEcma402Abstract.typesDateTimeMod.Formats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FullLong extends StObject {
  
  var full: Formats
  
  var long: Formats
  
  var medium: Formats
  
  var short: Formats
}
object FullLong {
  
  inline def apply(full: Formats, long: Formats, medium: Formats, short: Formats): FullLong = {
    val __obj = js.Dynamic.literal(full = full.asInstanceOf[js.Any], long = long.asInstanceOf[js.Any], medium = medium.asInstanceOf[js.Any], short = short.asInstanceOf[js.Any])
    __obj.asInstanceOf[FullLong]
  }
  
  extension [Self <: FullLong](x: Self) {
    
    inline def setFull(value: Formats): Self = StObject.set(x, "full", value.asInstanceOf[js.Any])
    
    inline def setLong(value: Formats): Self = StObject.set(x, "long", value.asInstanceOf[js.Any])
    
    inline def setMedium(value: Formats): Self = StObject.set(x, "medium", value.asInstanceOf[js.Any])
    
    inline def setShort(value: Formats): Self = StObject.set(x, "short", value.asInstanceOf[js.Any])
  }
}
