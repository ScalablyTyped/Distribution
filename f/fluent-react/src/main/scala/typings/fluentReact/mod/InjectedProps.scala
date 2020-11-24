package typings.fluentReact.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InjectedProps extends js.Object {
  
  var getString: GetString = js.native
}
object InjectedProps {
  
  @scala.inline
  def apply(getString: (/* id */ String, /* args */ js.UndefOr[js.Object]) => String): InjectedProps = {
    val __obj = js.Dynamic.literal(getString = js.Any.fromFunction2(getString))
    __obj.asInstanceOf[InjectedProps]
  }
  
  @scala.inline
  implicit class InjectedPropsOps[Self <: InjectedProps] (val x: Self) extends AnyVal {
    
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
    def setGetString(value: (/* id */ String, /* args */ js.UndefOr[js.Object]) => String): Self = this.set("getString", js.Any.fromFunction2(value))
  }
}
