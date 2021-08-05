package typings.firebaseAdmin.messagingMod.messaging

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApsAlert extends StObject {
  
  var actionLocKey: js.UndefOr[String] = js.undefined
  
  var body: js.UndefOr[String] = js.undefined
  
  var launchImage: js.UndefOr[String] = js.undefined
  
  var locArgs: js.UndefOr[js.Array[String]] = js.undefined
  
  var locKey: js.UndefOr[String] = js.undefined
  
  var subtitle: js.UndefOr[String] = js.undefined
  
  var subtitleLocArgs: js.UndefOr[js.Array[String]] = js.undefined
  
  var subtitleLocKey: js.UndefOr[String] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
  
  var titleLocArgs: js.UndefOr[js.Array[String]] = js.undefined
  
  var titleLocKey: js.UndefOr[String] = js.undefined
}
object ApsAlert {
  
  inline def apply(): ApsAlert = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApsAlert]
  }
  
  extension [Self <: ApsAlert](x: Self) {
    
    inline def setActionLocKey(value: String): Self = StObject.set(x, "actionLocKey", value.asInstanceOf[js.Any])
    
    inline def setActionLocKeyUndefined: Self = StObject.set(x, "actionLocKey", js.undefined)
    
    inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setLaunchImage(value: String): Self = StObject.set(x, "launchImage", value.asInstanceOf[js.Any])
    
    inline def setLaunchImageUndefined: Self = StObject.set(x, "launchImage", js.undefined)
    
    inline def setLocArgs(value: js.Array[String]): Self = StObject.set(x, "locArgs", value.asInstanceOf[js.Any])
    
    inline def setLocArgsUndefined: Self = StObject.set(x, "locArgs", js.undefined)
    
    inline def setLocArgsVarargs(value: String*): Self = StObject.set(x, "locArgs", js.Array(value :_*))
    
    inline def setLocKey(value: String): Self = StObject.set(x, "locKey", value.asInstanceOf[js.Any])
    
    inline def setLocKeyUndefined: Self = StObject.set(x, "locKey", js.undefined)
    
    inline def setSubtitle(value: String): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
    
    inline def setSubtitleLocArgs(value: js.Array[String]): Self = StObject.set(x, "subtitleLocArgs", value.asInstanceOf[js.Any])
    
    inline def setSubtitleLocArgsUndefined: Self = StObject.set(x, "subtitleLocArgs", js.undefined)
    
    inline def setSubtitleLocArgsVarargs(value: String*): Self = StObject.set(x, "subtitleLocArgs", js.Array(value :_*))
    
    inline def setSubtitleLocKey(value: String): Self = StObject.set(x, "subtitleLocKey", value.asInstanceOf[js.Any])
    
    inline def setSubtitleLocKeyUndefined: Self = StObject.set(x, "subtitleLocKey", js.undefined)
    
    inline def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleLocArgs(value: js.Array[String]): Self = StObject.set(x, "titleLocArgs", value.asInstanceOf[js.Any])
    
    inline def setTitleLocArgsUndefined: Self = StObject.set(x, "titleLocArgs", js.undefined)
    
    inline def setTitleLocArgsVarargs(value: String*): Self = StObject.set(x, "titleLocArgs", js.Array(value :_*))
    
    inline def setTitleLocKey(value: String): Self = StObject.set(x, "titleLocKey", value.asInstanceOf[js.Any])
    
    inline def setTitleLocKeyUndefined: Self = StObject.set(x, "titleLocKey", js.undefined)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
