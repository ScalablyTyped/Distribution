package typings.fluentReact.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocalizationProps extends js.Object {
  
  var getString: GetString = js.native
}
object LocalizationProps {
  
  @scala.inline
  def apply(
    getString: (/* id */ String, /* args */ js.UndefOr[js.Object], /* fallback */ js.UndefOr[String]) => String
  ): LocalizationProps = {
    val __obj = js.Dynamic.literal(getString = js.Any.fromFunction3(getString))
    __obj.asInstanceOf[LocalizationProps]
  }
  
  @scala.inline
  implicit class LocalizationPropsOps[Self <: LocalizationProps] (val x: Self) extends AnyVal {
    
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
    def setGetString(
      value: (/* id */ String, /* args */ js.UndefOr[js.Object], /* fallback */ js.UndefOr[String]) => String
    ): Self = this.set("getString", js.Any.fromFunction3(value))
  }
}
