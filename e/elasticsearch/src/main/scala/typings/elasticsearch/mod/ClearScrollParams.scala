package typings.elasticsearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClearScrollParams extends GenericParams {
  
  var scrollId: NameList = js.native
}
object ClearScrollParams {
  
  @scala.inline
  def apply(scrollId: NameList): ClearScrollParams = {
    val __obj = js.Dynamic.literal(scrollId = scrollId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClearScrollParams]
  }
  
  @scala.inline
  implicit class ClearScrollParamsMutableBuilder[Self <: ClearScrollParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScrollId(value: NameList): Self = StObject.set(x, "scrollId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollIdVarargs(value: String*): Self = StObject.set(x, "scrollId", js.Array(value :_*))
  }
}
