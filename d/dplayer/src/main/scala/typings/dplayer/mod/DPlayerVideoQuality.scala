package typings.dplayer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DPlayerVideoQuality extends StObject {
  
  var name: String = js.native
  
  var `type`: js.UndefOr[String] = js.native
  
  var url: String = js.native
}
object DPlayerVideoQuality {
  
  @scala.inline
  def apply(name: String, url: String): DPlayerVideoQuality = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[DPlayerVideoQuality]
  }
  
  @scala.inline
  implicit class DPlayerVideoQualityMutableBuilder[Self <: DPlayerVideoQuality] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
