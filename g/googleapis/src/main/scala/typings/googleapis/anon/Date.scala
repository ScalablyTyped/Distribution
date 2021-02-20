package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Date extends StObject {
  
  var date: js.UndefOr[String] = js.native
  
  var reasons: js.UndefOr[js.Array[FilteringCount]] = js.native
}
object Date {
  
  @scala.inline
  def apply(): Date = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Date]
  }
  
  @scala.inline
  implicit class DateMutableBuilder[Self <: Date] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    @scala.inline
    def setReasons(value: js.Array[FilteringCount]): Self = StObject.set(x, "reasons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonsUndefined: Self = StObject.set(x, "reasons", js.undefined)
    
    @scala.inline
    def setReasonsVarargs(value: FilteringCount*): Self = StObject.set(x, "reasons", js.Array(value :_*))
  }
}
