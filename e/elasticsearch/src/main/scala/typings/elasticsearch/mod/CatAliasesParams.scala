package typings.elasticsearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CatAliasesParams
  extends StObject
     with CatCommonParams {
  
  var name: js.UndefOr[NameList] = js.undefined
}
object CatAliasesParams {
  
  inline def apply(format: String): CatAliasesParams = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
    __obj.asInstanceOf[CatAliasesParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CatAliasesParams] (val x: Self) extends AnyVal {
    
    inline def setName(value: NameList): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNameVarargs(value: String*): Self = StObject.set(x, "name", js.Array(value*))
  }
}
