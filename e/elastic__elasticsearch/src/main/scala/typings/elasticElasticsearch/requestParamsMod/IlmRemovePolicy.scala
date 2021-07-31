package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IlmRemovePolicy
  extends StObject
     with Generic {
  
  var index: String
}
object IlmRemovePolicy {
  
  @scala.inline
  def apply(index: String): IlmRemovePolicy = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[IlmRemovePolicy]
  }
  
  @scala.inline
  implicit class IlmRemovePolicyMutableBuilder[Self <: IlmRemovePolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndex(value: String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
  }
}
