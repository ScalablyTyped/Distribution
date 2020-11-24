package typings.devextreme.mod.DevExpress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EndpointSelector extends js.Object {
  
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
  implicit class EndpointSelectorOps[Self <: EndpointSelector] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setUrlFor(value: String => String): Self = this.set("urlFor", js.Any.fromFunction1(value))
  }
}
