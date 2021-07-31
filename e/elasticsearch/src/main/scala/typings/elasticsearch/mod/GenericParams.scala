package typings.elasticsearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GenericParams extends StObject {
  
  var body: js.UndefOr[js.Any] = js.undefined
  
  var filterPath: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var ignore: js.UndefOr[Double | js.Array[Double]] = js.undefined
  
  var maxRetries: js.UndefOr[Double] = js.undefined
  
  var method: js.UndefOr[String] = js.undefined
  
  var requestTimeout: js.UndefOr[Double] = js.undefined
}
object GenericParams {
  
  @scala.inline
  def apply(): GenericParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenericParams]
  }
  
  @scala.inline
  implicit class GenericParamsMutableBuilder[Self <: GenericParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: js.Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    @scala.inline
    def setFilterPath(value: String | js.Array[String]): Self = StObject.set(x, "filterPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterPathUndefined: Self = StObject.set(x, "filterPath", js.undefined)
    
    @scala.inline
    def setFilterPathVarargs(value: String*): Self = StObject.set(x, "filterPath", js.Array(value :_*))
    
    @scala.inline
    def setIgnore(value: Double | js.Array[Double]): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
    
    @scala.inline
    def setIgnoreVarargs(value: Double*): Self = StObject.set(x, "ignore", js.Array(value :_*))
    
    @scala.inline
    def setMaxRetries(value: Double): Self = StObject.set(x, "maxRetries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxRetriesUndefined: Self = StObject.set(x, "maxRetries", js.undefined)
    
    @scala.inline
    def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    @scala.inline
    def setRequestTimeout(value: Double): Self = StObject.set(x, "requestTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestTimeoutUndefined: Self = StObject.set(x, "requestTimeout", js.undefined)
  }
}
