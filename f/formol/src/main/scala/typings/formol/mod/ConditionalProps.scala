package typings.formol.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConditionalProps[V] extends js.Object {
  
  var context: js.UndefOr[js.Any] = js.native
  
  var readOnly: js.UndefOr[(js.Function1[/* val */ V, Boolean]) | Boolean] = js.native
  
  var show: js.UndefOr[(js.Function1[/* val */ V, Boolean]) | Boolean] = js.native
  
  var value: js.UndefOr[js.Function1[/* v */ V, _]] = js.native
}
object ConditionalProps {
  
  @scala.inline
  def apply[V](): ConditionalProps[V] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConditionalProps[V]]
  }
  
  @scala.inline
  implicit class ConditionalPropsOps[Self <: ConditionalProps[_], V] (val x: Self with ConditionalProps[V]) extends AnyVal {
    
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
    def setContext(value: js.Any): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    
    @scala.inline
    def setReadOnlyFunction1(value: /* val */ V => Boolean): Self = this.set("readOnly", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReadOnly(value: (js.Function1[/* val */ V, Boolean]) | Boolean): Self = this.set("readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadOnly: Self = this.set("readOnly", js.undefined)
    
    @scala.inline
    def setShowFunction1(value: /* val */ V => Boolean): Self = this.set("show", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShow(value: (js.Function1[/* val */ V, Boolean]) | Boolean): Self = this.set("show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShow: Self = this.set("show", js.undefined)
    
    @scala.inline
    def setValue(value: /* v */ V => _): Self = this.set("value", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
