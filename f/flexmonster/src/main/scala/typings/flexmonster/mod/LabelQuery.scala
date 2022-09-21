package typings.flexmonster.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LabelQuery extends StObject {
  
  var begin: js.UndefOr[String] = js.undefined
  
  var between: js.UndefOr[js.Array[String]] = js.undefined
  
  var contain: js.UndefOr[String] = js.undefined
  
  var end: js.UndefOr[String] = js.undefined
  
  var equal: js.UndefOr[String] = js.undefined
  
  var greater: js.UndefOr[String] = js.undefined
  
  var greater_equal: js.UndefOr[String] = js.undefined
  
  var less: js.UndefOr[String] = js.undefined
  
  var less_equal: js.UndefOr[String] = js.undefined
  
  var not_begin: js.UndefOr[String] = js.undefined
  
  var not_between: js.UndefOr[js.Array[String]] = js.undefined
  
  var not_contain: js.UndefOr[String] = js.undefined
  
  var not_end: js.UndefOr[String] = js.undefined
  
  var not_equal: js.UndefOr[String] = js.undefined
}
object LabelQuery {
  
  inline def apply(): LabelQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LabelQuery]
  }
  
  extension [Self <: LabelQuery](x: Self) {
    
    inline def setBegin(value: String): Self = StObject.set(x, "begin", value.asInstanceOf[js.Any])
    
    inline def setBeginUndefined: Self = StObject.set(x, "begin", js.undefined)
    
    inline def setBetween(value: js.Array[String]): Self = StObject.set(x, "between", value.asInstanceOf[js.Any])
    
    inline def setBetweenUndefined: Self = StObject.set(x, "between", js.undefined)
    
    inline def setBetweenVarargs(value: String*): Self = StObject.set(x, "between", js.Array(value*))
    
    inline def setContain(value: String): Self = StObject.set(x, "contain", value.asInstanceOf[js.Any])
    
    inline def setContainUndefined: Self = StObject.set(x, "contain", js.undefined)
    
    inline def setEnd(value: String): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
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
    
    inline def setNot_begin(value: String): Self = StObject.set(x, "not_begin", value.asInstanceOf[js.Any])
    
    inline def setNot_beginUndefined: Self = StObject.set(x, "not_begin", js.undefined)
    
    inline def setNot_between(value: js.Array[String]): Self = StObject.set(x, "not_between", value.asInstanceOf[js.Any])
    
    inline def setNot_betweenUndefined: Self = StObject.set(x, "not_between", js.undefined)
    
    inline def setNot_betweenVarargs(value: String*): Self = StObject.set(x, "not_between", js.Array(value*))
    
    inline def setNot_contain(value: String): Self = StObject.set(x, "not_contain", value.asInstanceOf[js.Any])
    
    inline def setNot_containUndefined: Self = StObject.set(x, "not_contain", js.undefined)
    
    inline def setNot_end(value: String): Self = StObject.set(x, "not_end", value.asInstanceOf[js.Any])
    
    inline def setNot_endUndefined: Self = StObject.set(x, "not_end", js.undefined)
    
    inline def setNot_equal(value: String): Self = StObject.set(x, "not_equal", value.asInstanceOf[js.Any])
    
    inline def setNot_equalUndefined: Self = StObject.set(x, "not_equal", js.undefined)
  }
}
