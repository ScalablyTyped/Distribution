package typings.firefoxWebextBrowser.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Count extends StObject {
  
  var count: Double = js.native
  
  var rangeData: js.UndefOr[js.Array[EndOffset]] = js.native
  
  var rectData: js.UndefOr[js.Array[RectsAndTexts]] = js.native
}
object Count {
  
  @scala.inline
  def apply(count: Double): Count = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any])
    __obj.asInstanceOf[Count]
  }
  
  @scala.inline
  implicit class CountMutableBuilder[Self <: Count] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeData(value: js.Array[EndOffset]): Self = StObject.set(x, "rangeData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeDataUndefined: Self = StObject.set(x, "rangeData", js.undefined)
    
    @scala.inline
    def setRangeDataVarargs(value: EndOffset*): Self = StObject.set(x, "rangeData", js.Array(value :_*))
    
    @scala.inline
    def setRectData(value: js.Array[RectsAndTexts]): Self = StObject.set(x, "rectData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRectDataUndefined: Self = StObject.set(x, "rectData", js.undefined)
    
    @scala.inline
    def setRectDataVarargs(value: RectsAndTexts*): Self = StObject.set(x, "rectData", js.Array(value :_*))
  }
}
