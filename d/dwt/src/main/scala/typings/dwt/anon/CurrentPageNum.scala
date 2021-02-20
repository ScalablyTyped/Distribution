package typings.dwt.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CurrentPageNum extends StObject {
  
  var currentPageNum: js.UndefOr[Double] = js.native
}
object CurrentPageNum {
  
  @scala.inline
  def apply(): CurrentPageNum = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CurrentPageNum]
  }
  
  @scala.inline
  implicit class CurrentPageNumMutableBuilder[Self <: CurrentPageNum] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrentPageNum(value: Double): Self = StObject.set(x, "currentPageNum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentPageNumUndefined: Self = StObject.set(x, "currentPageNum", js.undefined)
  }
}
