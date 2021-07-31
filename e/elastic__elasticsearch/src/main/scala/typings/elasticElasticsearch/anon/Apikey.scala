package typings.elasticElasticsearch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Apikey extends StObject {
  
  var api_key: String
  
  var id: String
}
object Apikey {
  
  @scala.inline
  def apply(api_key: String, id: String): Apikey = {
    val __obj = js.Dynamic.literal(api_key = api_key.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Apikey]
  }
  
  @scala.inline
  implicit class ApikeyMutableBuilder[Self <: Apikey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApi_key(value: String): Self = StObject.set(x, "api_key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
