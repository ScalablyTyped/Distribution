package typings.ecmarkup.anon

import typings.grammarkdown.mod.OneOfList
import typings.grammarkdown.mod.RightHandSide
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Production extends StObject {
  
  var production: typings.grammarkdown.mod.Production
  
  var rhses: js.Array[RightHandSide | OneOfList]
}
object Production {
  
  @scala.inline
  def apply(production: typings.grammarkdown.mod.Production, rhses: js.Array[RightHandSide | OneOfList]): Production = {
    val __obj = js.Dynamic.literal(production = production.asInstanceOf[js.Any], rhses = rhses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Production]
  }
  
  @scala.inline
  implicit class ProductionMutableBuilder[Self <: Production] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProduction(value: typings.grammarkdown.mod.Production): Self = StObject.set(x, "production", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRhses(value: js.Array[RightHandSide | OneOfList]): Self = StObject.set(x, "rhses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRhsesVarargs(value: (RightHandSide | OneOfList)*): Self = StObject.set(x, "rhses", js.Array(value :_*))
  }
}
