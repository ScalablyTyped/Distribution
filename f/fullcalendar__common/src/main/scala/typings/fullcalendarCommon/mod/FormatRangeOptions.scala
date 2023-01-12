package typings.fullcalendarCommon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormatRangeOptions
  extends StObject
     with FormatDateOptions {
  
  var isEndExclusive: js.UndefOr[Boolean] = js.undefined
}
object FormatRangeOptions {
  
  inline def apply(): FormatRangeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormatRangeOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FormatRangeOptions] (val x: Self) extends AnyVal {
    
    inline def setIsEndExclusive(value: Boolean): Self = StObject.set(x, "isEndExclusive", value.asInstanceOf[js.Any])
    
    inline def setIsEndExclusiveUndefined: Self = StObject.set(x, "isEndExclusive", js.undefined)
  }
}
