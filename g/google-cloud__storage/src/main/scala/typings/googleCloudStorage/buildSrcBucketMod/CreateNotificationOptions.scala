package typings.googleCloudStorage.buildSrcBucketMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateNotificationOptions extends StObject {
  
  var customAttributes: js.UndefOr[StringDictionary[String]] = js.undefined
  
  var eventTypes: js.UndefOr[js.Array[String]] = js.undefined
  
  var objectNamePrefix: js.UndefOr[String] = js.undefined
  
  var payloadFormat: js.UndefOr[String] = js.undefined
  
  var userProject: js.UndefOr[String] = js.undefined
}
object CreateNotificationOptions {
  
  inline def apply(): CreateNotificationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateNotificationOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateNotificationOptions] (val x: Self) extends AnyVal {
    
    inline def setCustomAttributes(value: StringDictionary[String]): Self = StObject.set(x, "customAttributes", value.asInstanceOf[js.Any])
    
    inline def setCustomAttributesUndefined: Self = StObject.set(x, "customAttributes", js.undefined)
    
    inline def setEventTypes(value: js.Array[String]): Self = StObject.set(x, "eventTypes", value.asInstanceOf[js.Any])
    
    inline def setEventTypesUndefined: Self = StObject.set(x, "eventTypes", js.undefined)
    
    inline def setEventTypesVarargs(value: String*): Self = StObject.set(x, "eventTypes", js.Array(value*))
    
    inline def setObjectNamePrefix(value: String): Self = StObject.set(x, "objectNamePrefix", value.asInstanceOf[js.Any])
    
    inline def setObjectNamePrefixUndefined: Self = StObject.set(x, "objectNamePrefix", js.undefined)
    
    inline def setPayloadFormat(value: String): Self = StObject.set(x, "payloadFormat", value.asInstanceOf[js.Any])
    
    inline def setPayloadFormatUndefined: Self = StObject.set(x, "payloadFormat", js.undefined)
    
    inline def setUserProject(value: String): Self = StObject.set(x, "userProject", value.asInstanceOf[js.Any])
    
    inline def setUserProjectUndefined: Self = StObject.set(x, "userProject", js.undefined)
  }
}
