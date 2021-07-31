package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bing extends StObject {
  
  var bing: js.UndefOr[String] = js.undefined
  
  var google: js.UndefOr[String] = js.undefined
  
  var googleStatic: js.UndefOr[String] = js.undefined
}
object Bing {
  
  @scala.inline
  def apply(): Bing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Bing]
  }
  
  @scala.inline
  implicit class BingMutableBuilder[Self <: Bing] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBing(value: String): Self = StObject.set(x, "bing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBingUndefined: Self = StObject.set(x, "bing", js.undefined)
    
    @scala.inline
    def setGoogle(value: String): Self = StObject.set(x, "google", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGoogleStatic(value: String): Self = StObject.set(x, "googleStatic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGoogleStaticUndefined: Self = StObject.set(x, "googleStatic", js.undefined)
    
    @scala.inline
    def setGoogleUndefined: Self = StObject.set(x, "google", js.undefined)
  }
}
