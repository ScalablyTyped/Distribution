package typings.firebaseAdmin.messagingMod.messaging

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApsAlert extends StObject {
  
  var actionLocKey: js.UndefOr[String] = js.native
  
  var body: js.UndefOr[String] = js.native
  
  var launchImage: js.UndefOr[String] = js.native
  
  var locArgs: js.UndefOr[js.Array[String]] = js.native
  
  var locKey: js.UndefOr[String] = js.native
  
  var subtitle: js.UndefOr[String] = js.native
  
  var subtitleLocArgs: js.UndefOr[js.Array[String]] = js.native
  
  var subtitleLocKey: js.UndefOr[String] = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var titleLocArgs: js.UndefOr[js.Array[String]] = js.native
  
  var titleLocKey: js.UndefOr[String] = js.native
}
object ApsAlert {
  
  @scala.inline
  def apply(): ApsAlert = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApsAlert]
  }
  
  @scala.inline
  implicit class ApsAlertMutableBuilder[Self <: ApsAlert] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionLocKey(value: String): Self = StObject.set(x, "actionLocKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionLocKeyUndefined: Self = StObject.set(x, "actionLocKey", js.undefined)
    
    @scala.inline
    def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    @scala.inline
    def setLaunchImage(value: String): Self = StObject.set(x, "launchImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLaunchImageUndefined: Self = StObject.set(x, "launchImage", js.undefined)
    
    @scala.inline
    def setLocArgs(value: js.Array[String]): Self = StObject.set(x, "locArgs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocArgsUndefined: Self = StObject.set(x, "locArgs", js.undefined)
    
    @scala.inline
    def setLocArgsVarargs(value: String*): Self = StObject.set(x, "locArgs", js.Array(value :_*))
    
    @scala.inline
    def setLocKey(value: String): Self = StObject.set(x, "locKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocKeyUndefined: Self = StObject.set(x, "locKey", js.undefined)
    
    @scala.inline
    def setSubtitle(value: String): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubtitleLocArgs(value: js.Array[String]): Self = StObject.set(x, "subtitleLocArgs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubtitleLocArgsUndefined: Self = StObject.set(x, "subtitleLocArgs", js.undefined)
    
    @scala.inline
    def setSubtitleLocArgsVarargs(value: String*): Self = StObject.set(x, "subtitleLocArgs", js.Array(value :_*))
    
    @scala.inline
    def setSubtitleLocKey(value: String): Self = StObject.set(x, "subtitleLocKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubtitleLocKeyUndefined: Self = StObject.set(x, "subtitleLocKey", js.undefined)
    
    @scala.inline
    def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleLocArgs(value: js.Array[String]): Self = StObject.set(x, "titleLocArgs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleLocArgsUndefined: Self = StObject.set(x, "titleLocArgs", js.undefined)
    
    @scala.inline
    def setTitleLocArgsVarargs(value: String*): Self = StObject.set(x, "titleLocArgs", js.Array(value :_*))
    
    @scala.inline
    def setTitleLocKey(value: String): Self = StObject.set(x, "titleLocKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleLocKeyUndefined: Self = StObject.set(x, "titleLocKey", js.undefined)
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
