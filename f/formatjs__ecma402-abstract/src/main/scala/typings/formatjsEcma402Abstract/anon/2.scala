package typings.formatjsEcma402Abstract.anon

import typings.formatjsEcma402Abstract.typesDisplaynamesMod.CalendarCode
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `2` extends StObject {
  
  var long: Record[CalendarCode, String]
  
  var narrow: Record[CalendarCode, String]
  
  var short: Record[CalendarCode, String]
}
object `2` {
  
  inline def apply(
    long: Record[CalendarCode, String],
    narrow: Record[CalendarCode, String],
    short: Record[CalendarCode, String]
  ): `2` = {
    val __obj = js.Dynamic.literal(long = long.asInstanceOf[js.Any], narrow = narrow.asInstanceOf[js.Any], short = short.asInstanceOf[js.Any])
    __obj.asInstanceOf[`2`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `2`] (val x: Self) extends AnyVal {
    
    inline def setLong(value: Record[CalendarCode, String]): Self = StObject.set(x, "long", value.asInstanceOf[js.Any])
    
    inline def setNarrow(value: Record[CalendarCode, String]): Self = StObject.set(x, "narrow", value.asInstanceOf[js.Any])
    
    inline def setShort(value: Record[CalendarCode, String]): Self = StObject.set(x, "short", value.asInstanceOf[js.Any])
  }
}
