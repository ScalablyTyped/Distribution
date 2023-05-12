package typings.firefoxWebextBrowser.browser.declarativeNetRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Add, remove or replace query key-value pairs. Cannot be specified if 'query' is specified. */
trait URLTransformQueryTransform extends StObject {
  
  /** The list of query key-value pairs to be added or replaced. */
  var addOrReplaceParams: js.UndefOr[js.Array[URLTransformQueryTransformAddOrReplaceParams]] = js.undefined
  
  /** The list of query keys to be removed. */
  var removeParams: js.UndefOr[js.Array[String]] = js.undefined
}
object URLTransformQueryTransform {
  
  inline def apply(): URLTransformQueryTransform = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[URLTransformQueryTransform]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: URLTransformQueryTransform] (val x: Self) extends AnyVal {
    
    inline def setAddOrReplaceParams(value: js.Array[URLTransformQueryTransformAddOrReplaceParams]): Self = StObject.set(x, "addOrReplaceParams", value.asInstanceOf[js.Any])
    
    inline def setAddOrReplaceParamsUndefined: Self = StObject.set(x, "addOrReplaceParams", js.undefined)
    
    inline def setAddOrReplaceParamsVarargs(value: URLTransformQueryTransformAddOrReplaceParams*): Self = StObject.set(x, "addOrReplaceParams", js.Array(value*))
    
    inline def setRemoveParams(value: js.Array[String]): Self = StObject.set(x, "removeParams", value.asInstanceOf[js.Any])
    
    inline def setRemoveParamsUndefined: Self = StObject.set(x, "removeParams", js.undefined)
    
    inline def setRemoveParamsVarargs(value: String*): Self = StObject.set(x, "removeParams", js.Array(value*))
  }
}
