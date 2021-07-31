package typings.googleVisualization.google.visualization

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryOptions extends StObject {
  
  var makeRequestParams: js.UndefOr[js.Object] = js.undefined
  
  var sendMethod: js.UndefOr[String] = js.undefined
}
object QueryOptions {
  
  @scala.inline
  def apply(): QueryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryOptions]
  }
  
  @scala.inline
  implicit class QueryOptionsMutableBuilder[Self <: QueryOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMakeRequestParams(value: js.Object): Self = StObject.set(x, "makeRequestParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMakeRequestParamsUndefined: Self = StObject.set(x, "makeRequestParams", js.undefined)
    
    @scala.inline
    def setSendMethod(value: String): Self = StObject.set(x, "sendMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSendMethodUndefined: Self = StObject.set(x, "sendMethod", js.undefined)
  }
}
