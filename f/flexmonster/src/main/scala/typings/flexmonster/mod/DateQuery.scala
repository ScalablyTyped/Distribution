package typings.flexmonster.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateQuery extends StObject {
  
  var after: js.UndefOr[String] = js.undefined
  
  var after_equal: js.UndefOr[String] = js.undefined
  
  var before: js.UndefOr[String] = js.undefined
  
  var before_equal: js.UndefOr[String] = js.undefined
  
  var between: js.UndefOr[js.Array[String]] = js.undefined
  
  var current: js.UndefOr[String] = js.undefined
  
  var equal: js.UndefOr[String] = js.undefined
  
  var last: js.UndefOr[String] = js.undefined
  
  var next: js.UndefOr[String] = js.undefined
  
  var not_between: js.UndefOr[js.Array[String]] = js.undefined
  
  var not_equal: js.UndefOr[String] = js.undefined
}
object DateQuery {
  
  inline def apply(): DateQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateQuery]
  }
  
  extension [Self <: DateQuery](x: Self) {
    
    inline def setAfter(value: String): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
    
    inline def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
    
    inline def setAfter_equal(value: String): Self = StObject.set(x, "after_equal", value.asInstanceOf[js.Any])
    
    inline def setAfter_equalUndefined: Self = StObject.set(x, "after_equal", js.undefined)
    
    inline def setBefore(value: String): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
    
    inline def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
    
    inline def setBefore_equal(value: String): Self = StObject.set(x, "before_equal", value.asInstanceOf[js.Any])
    
    inline def setBefore_equalUndefined: Self = StObject.set(x, "before_equal", js.undefined)
    
    inline def setBetween(value: js.Array[String]): Self = StObject.set(x, "between", value.asInstanceOf[js.Any])
    
    inline def setBetweenUndefined: Self = StObject.set(x, "between", js.undefined)
    
    inline def setBetweenVarargs(value: String*): Self = StObject.set(x, "between", js.Array(value*))
    
    inline def setCurrent(value: String): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    inline def setCurrentUndefined: Self = StObject.set(x, "current", js.undefined)
    
    inline def setEqual(value: String): Self = StObject.set(x, "equal", value.asInstanceOf[js.Any])
    
    inline def setEqualUndefined: Self = StObject.set(x, "equal", js.undefined)
    
    inline def setLast(value: String): Self = StObject.set(x, "last", value.asInstanceOf[js.Any])
    
    inline def setLastUndefined: Self = StObject.set(x, "last", js.undefined)
    
    inline def setNext(value: String): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    
    inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
    
    inline def setNot_between(value: js.Array[String]): Self = StObject.set(x, "not_between", value.asInstanceOf[js.Any])
    
    inline def setNot_betweenUndefined: Self = StObject.set(x, "not_between", js.undefined)
    
    inline def setNot_betweenVarargs(value: String*): Self = StObject.set(x, "not_between", js.Array(value*))
    
    inline def setNot_equal(value: String): Self = StObject.set(x, "not_equal", value.asInstanceOf[js.Any])
    
    inline def setNot_equalUndefined: Self = StObject.set(x, "not_equal", js.undefined)
  }
}
