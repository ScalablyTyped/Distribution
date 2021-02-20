package typings.flexmonster.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValueQuery extends NumberQuery {
  
  var bottom: js.UndefOr[Double] = js.native
  
  var top: js.UndefOr[Double] = js.native
}
object ValueQuery {
  
  @scala.inline
  def apply(): ValueQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValueQuery]
  }
  
  @scala.inline
  implicit class ValueQueryMutableBuilder[Self <: ValueQuery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
    
    @scala.inline
    def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
  }
}
