package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeUrl extends StObject {
  
  var `type`: js.UndefOr[String] = js.undefined
  
  var url: js.UndefOr[String] = js.undefined
}
object TypeUrl {
  
  @scala.inline
  def apply(): TypeUrl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TypeUrl]
  }
  
  @scala.inline
  implicit class TypeUrlMutableBuilder[Self <: TypeUrl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
