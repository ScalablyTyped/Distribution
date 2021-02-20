package typings.devextreme.mod.DevExpress

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EndpointSelector extends StObject {
  
  /**
    * [descr:EndpointSelector.urlFor(key)]
    */
  def urlFor(key: String): String = js.native
}
object EndpointSelector {
  
  @scala.inline
  def apply(urlFor: String => String): EndpointSelector = {
    val __obj = js.Dynamic.literal(urlFor = js.Any.fromFunction1(urlFor))
    __obj.asInstanceOf[EndpointSelector]
  }
  
  @scala.inline
  implicit class EndpointSelectorMutableBuilder[Self <: EndpointSelector] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUrlFor(value: String => String): Self = StObject.set(x, "urlFor", js.Any.fromFunction1(value))
  }
}
