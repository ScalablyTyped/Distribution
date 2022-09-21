package typings.googleapis.booksV1Mod.booksV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceNotificationGet
  extends StObject
     with StandardParameters {
  
  /**
    * ISO-639-1 language and ISO-3166-1 country code. Ex: 'en_US'. Used for generating notification title and body.
    */
  var locale: js.UndefOr[String] = js.undefined
  
  /**
    * String to identify the notification.
    */
  var notification_id: js.UndefOr[String] = js.undefined
  
  /**
    * String to identify the originator of this request.
    */
  var source: js.UndefOr[String] = js.undefined
}
object ParamsResourceNotificationGet {
  
  inline def apply(): ParamsResourceNotificationGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceNotificationGet]
  }
  
  extension [Self <: ParamsResourceNotificationGet](x: Self) {
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setNotification_id(value: String): Self = StObject.set(x, "notification_id", value.asInstanceOf[js.Any])
    
    inline def setNotification_idUndefined: Self = StObject.set(x, "notification_id", js.undefined)
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
