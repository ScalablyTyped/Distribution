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
  
  @scala.inline
  def apply(full: Formats, long: Formats, medium: Formats, short: Formats): FullLong = {
    val __obj = js.Dynamic.literal(full = full.asInstanceOf[js.Any], long = long.asInstanceOf[js.Any], medium = medium.asInstanceOf[js.Any], short = short.asInstanceOf[js.Any])
    __obj.asInstanceOf[FullLong]
  }
  
  @scala.inline
  implicit class FullLongMutableBuilder[Self <: FullLong] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFull(value: Formats): Self = StObject.set(x, "full", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLong(value: Formats): Self = StObject.set(x, "long", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMedium(value: Formats): Self = StObject.set(x, "medium", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShort(value: Formats): Self = StObject.set(x, "short", value.asInstanceOf[js.Any])
  }
}
