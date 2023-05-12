package typings.firefoxWebextBrowser.browser.declarativeNetRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait URLTransformQueryTransformAddOrReplaceParams extends StObject {
  
  var key: String
  
  /**
    * If true, the query key is replaced only if it's already present. Otherwise, the key is also added if it's missing.
    */
  var replaceOnly: js.UndefOr[Boolean] = js.undefined
  
  var value: String
}
object URLTransformQueryTransformAddOrReplaceParams {
  
  inline def apply(key: String, value: String): URLTransformQueryTransformAddOrReplaceParams = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[URLTransformQueryTransformAddOrReplaceParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: URLTransformQueryTransformAddOrReplaceParams] (val x: Self) extends AnyVal {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setReplaceOnly(value: Boolean): Self = StObject.set(x, "replaceOnly", value.asInstanceOf[js.Any])
    
    inline def setReplaceOnlyUndefined: Self = StObject.set(x, "replaceOnly", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
