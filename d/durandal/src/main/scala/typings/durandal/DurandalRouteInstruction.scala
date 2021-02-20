package typings.durandal

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DurandalRouteInstruction extends StObject {
  
  var config: DurandalRouteConfiguration = js.native
  
  var fragment: String = js.native
  
  var params: js.Array[_] = js.native
  
  var queryParams: StringDictionary[js.Any] = js.native
  
  var queryString: String = js.native
}
object DurandalRouteInstruction {
  
  @scala.inline
  def apply(
    config: DurandalRouteConfiguration,
    fragment: String,
    params: js.Array[_],
    queryParams: StringDictionary[js.Any],
    queryString: String
  ): DurandalRouteInstruction = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], fragment = fragment.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], queryParams = queryParams.asInstanceOf[js.Any], queryString = queryString.asInstanceOf[js.Any])
    __obj.asInstanceOf[DurandalRouteInstruction]
  }
  
  @scala.inline
  implicit class DurandalRouteInstructionMutableBuilder[Self <: DurandalRouteInstruction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfig(value: DurandalRouteConfiguration): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFragment(value: String): Self = StObject.set(x, "fragment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParams(value: js.Array[_]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsVarargs(value: js.Any*): Self = StObject.set(x, "params", js.Array(value :_*))
    
    @scala.inline
    def setQueryParams(value: StringDictionary[js.Any]): Self = StObject.set(x, "queryParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryString(value: String): Self = StObject.set(x, "queryString", value.asInstanceOf[js.Any])
  }
}
