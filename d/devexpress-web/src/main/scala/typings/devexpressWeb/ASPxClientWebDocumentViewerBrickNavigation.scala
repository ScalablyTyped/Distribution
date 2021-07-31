package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ASPxClientWebDocumentViewerBrickNavigation extends StObject {
  
  var drillDownKey: String
  
  var target: String
  
  var url: String
}
object ASPxClientWebDocumentViewerBrickNavigation {
  
  @scala.inline
  def apply(drillDownKey: String, target: String, url: String): ASPxClientWebDocumentViewerBrickNavigation = {
    val __obj = js.Dynamic.literal(drillDownKey = drillDownKey.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientWebDocumentViewerBrickNavigation]
  }
  
  @scala.inline
  implicit class ASPxClientWebDocumentViewerBrickNavigationMutableBuilder[Self <: ASPxClientWebDocumentViewerBrickNavigation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDrillDownKey(value: String): Self = StObject.set(x, "drillDownKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
