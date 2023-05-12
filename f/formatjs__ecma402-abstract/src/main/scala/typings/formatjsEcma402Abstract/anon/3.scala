package typings.formatjsEcma402Abstract.anon

import typings.formatjsEcma402Abstract.typesDisplaynamesMod.DateTimeFieldCode
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `3` extends StObject {
  
  var long: Record[DateTimeFieldCode, String]
  
  var narrow: Record[DateTimeFieldCode, String]
  
  var short: Record[DateTimeFieldCode, String]
}
object `3` {
  
  inline def apply(
    long: Record[DateTimeFieldCode, String],
    narrow: Record[DateTimeFieldCode, String],
    short: Record[DateTimeFieldCode, String]
  ): `3` = {
    val __obj = js.Dynamic.literal(long = long.asInstanceOf[js.Any], narrow = narrow.asInstanceOf[js.Any], short = short.asInstanceOf[js.Any])
    __obj.asInstanceOf[`3`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `3`] (val x: Self) extends AnyVal {
    
    inline def setLong(value: Record[DateTimeFieldCode, String]): Self = StObject.set(x, "long", value.asInstanceOf[js.Any])
    
    inline def setNarrow(value: Record[DateTimeFieldCode, String]): Self = StObject.set(x, "narrow", value.asInstanceOf[js.Any])
    
    inline def setShort(value: Record[DateTimeFieldCode, String]): Self = StObject.set(x, "short", value.asInstanceOf[js.Any])
  }
}
