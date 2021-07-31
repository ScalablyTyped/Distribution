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
  
  @scala.inline
  def apply(format: String): CatAliasesParams = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
    __obj.asInstanceOf[CatAliasesParams]
  }
  
  @scala.inline
  implicit class CatAliasesParamsMutableBuilder[Self <: CatAliasesParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: NameList): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNameVarargs(value: String*): Self = StObject.set(x, "name", js.Array(value :_*))
  }
}
