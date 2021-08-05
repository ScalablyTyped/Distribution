package typings.flexmonster.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeQuery extends StObject {
  
  var between: js.UndefOr[js.Array[String]] = js.undefined
  
  var equal: js.UndefOr[String] = js.undefined
  
  var greater: js.UndefOr[String] = js.undefined
  
  var greater_equal: js.UndefOr[String] = js.undefined
  
  var less: js.UndefOr[String] = js.undefined
  
  var less_equal: js.UndefOr[String] = js.undefined
  
  var not_between: js.UndefOr[js.Array[String]] = js.undefined
  
  var not_equal: js.UndefOr[String] = js.undefined
}
object TimeQuery {
  
  inline def apply(): TimeQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeQuery]
  }
  
  extension [Self <: TimeQuery](x: Self) {
    
    inline def setBetween(value: js.Array[String]): Self = StObject.set(x, "between", value.asInstanceOf[js.Any])
    
    inline def setBetweenUndefined: Self = StObject.set(x, "between", js.undefined)
    
    inline def setBetweenVarargs(value: String*): Self = StObject.set(x, "between", js.Array(value :_*))
    
    inline def setEqual(value: String): Self = StObject.set(x, "equal", value.asInstanceOf[js.Any])
    
    inline def setEqualUndefined: Self = StObject.set(x, "equal", js.undefined)
    
    inline def setGreater(value: String): Self = StObject.set(x, "greater", value.asInstanceOf[js.Any])
    
    inline def setGreaterUndefined: Self = StObject.set(x, "greater", js.undefined)
    
    inline def setGreater_equal(value: String): Self = StObject.set(x, "greater_equal", value.asInstanceOf[js.Any])
    
    inline def setGreater_equalUndefined: Self = StObject.set(x, "greater_equal", js.undefined)
    
    inline def setLess(value: String): Self = StObject.set(x, "less", value.asInstanceOf[js.Any])
    
    inline def setLessUndefined: Self = StObject.set(x, "less", js.undefined)
    
    inline def setLess_equal(value: String): Self = StObject.set(x, "less_equal", value.asInstanceOf[js.Any])
    
    inline def setLess_equalUndefined: Self = StObject.set(x, "less_equal", js.undefined)
    
    inline def setNot_between(value: js.Array[String]): Self = StObject.set(x, "not_between", value.asInstanceOf[js.Any])
    
    inline def setNot_betweenUndefined: Self = StObject.set(x, "not_between", js.undefined)
    
    inline def setNot_betweenVarargs(value: String*): Self = StObject.set(x, "not_between", js.Array(value :_*))
    
    inline def setNot_equal(value: String): Self = StObject.set(x, "not_equal", value.asInstanceOf[js.Any])
    
    inline def setNot_equalUndefined: Self = StObject.set(x, "not_equal", js.undefined)
  }
}
