package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EndUtcSec extends StObject {
  
  var endUtcSec: js.UndefOr[String] = js.native
  
  var startUtcSec: js.UndefOr[String] = js.native
}
object EndUtcSec {
  
  @scala.inline
  def apply(): EndUtcSec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EndUtcSec]
  }
  
  @scala.inline
  implicit class EndUtcSecMutableBuilder[Self <: EndUtcSec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndUtcSec(value: String): Self = StObject.set(x, "endUtcSec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndUtcSecUndefined: Self = StObject.set(x, "endUtcSec", js.undefined)
    
    @scala.inline
    def setStartUtcSec(value: String): Self = StObject.set(x, "startUtcSec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartUtcSecUndefined: Self = StObject.set(x, "startUtcSec", js.undefined)
  }
}
