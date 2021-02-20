package typings.forestExpressMongoose.mod

import typings.forestExpressMongoose.anon.Description
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SmartActionOptions extends StObject {
  
  var download: js.UndefOr[Boolean] = js.native
  
  var endpoint: js.UndefOr[String] = js.native
  
  var fields: js.UndefOr[js.Array[Description]] = js.native
  
  var httpMethod: js.UndefOr[String] = js.native
  
  var name: String = js.native
  
  var `type`: js.UndefOr[String] = js.native
  
  var values: js.UndefOr[SmartActionValuesInjector] = js.native
}
object SmartActionOptions {
  
  @scala.inline
  def apply(name: String): SmartActionOptions = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartActionOptions]
  }
  
  @scala.inline
  implicit class SmartActionOptionsMutableBuilder[Self <: SmartActionOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDownload(value: Boolean): Self = StObject.set(x, "download", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDownloadUndefined: Self = StObject.set(x, "download", js.undefined)
    
    @scala.inline
    def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
    
    @scala.inline
    def setFields(value: js.Array[Description]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    @scala.inline
    def setFieldsVarargs(value: Description*): Self = StObject.set(x, "fields", js.Array(value :_*))
    
    @scala.inline
    def setHttpMethod(value: String): Self = StObject.set(x, "httpMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpMethodUndefined: Self = StObject.set(x, "httpMethod", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setValues(value: /* record */ js.Any => js.Object): Self = StObject.set(x, "values", js.Any.fromFunction1(value))
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
  }
}
