package typings.flexmonster.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimeQuery extends StObject {
  
  var between: js.UndefOr[js.Array[String]] = js.native
  
  var equal: js.UndefOr[String] = js.native
  
  var greater: js.UndefOr[String] = js.native
  
  var greater_equal: js.UndefOr[String] = js.native
  
  var less: js.UndefOr[String] = js.native
  
  var less_equal: js.UndefOr[String] = js.native
  
  var not_between: js.UndefOr[js.Array[String]] = js.native
  
  var not_equal: js.UndefOr[String] = js.native
}
object TimeQuery {
  
  @scala.inline
  def apply(): TimeQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeQuery]
  }
  
  @scala.inline
  implicit class TimeQueryMutableBuilder[Self <: TimeQuery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBetween(value: js.Array[String]): Self = StObject.set(x, "between", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBetweenUndefined: Self = StObject.set(x, "between", js.undefined)
    
    @scala.inline
    def setBetweenVarargs(value: String*): Self = StObject.set(x, "between", js.Array(value :_*))
    
    @scala.inline
    def setEqual(value: String): Self = StObject.set(x, "equal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEqualUndefined: Self = StObject.set(x, "equal", js.undefined)
    
    @scala.inline
    def setGreater(value: String): Self = StObject.set(x, "greater", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGreaterUndefined: Self = StObject.set(x, "greater", js.undefined)
    
    @scala.inline
    def setGreater_equal(value: String): Self = StObject.set(x, "greater_equal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGreater_equalUndefined: Self = StObject.set(x, "greater_equal", js.undefined)
    
    @scala.inline
    def setLess(value: String): Self = StObject.set(x, "less", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLessUndefined: Self = StObject.set(x, "less", js.undefined)
    
    @scala.inline
    def setLess_equal(value: String): Self = StObject.set(x, "less_equal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLess_equalUndefined: Self = StObject.set(x, "less_equal", js.undefined)
    
    @scala.inline
    def setNot_between(value: js.Array[String]): Self = StObject.set(x, "not_between", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNot_betweenUndefined: Self = StObject.set(x, "not_between", js.undefined)
    
    @scala.inline
    def setNot_betweenVarargs(value: String*): Self = StObject.set(x, "not_between", js.Array(value :_*))
    
    @scala.inline
    def setNot_equal(value: String): Self = StObject.set(x, "not_equal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNot_equalUndefined: Self = StObject.set(x, "not_equal", js.undefined)
  }
}
