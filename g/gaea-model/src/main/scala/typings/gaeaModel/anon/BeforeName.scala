package typings.gaeaModel.anon

import typings.gaeaModel.FitGaea.ComponentProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BeforeName extends js.Object {
  
  var beforeName: String = js.native
  
  // 重置前的信息
  var beforeProps: ComponentProps = js.native
}
object BeforeName {
  
  @scala.inline
  def apply(beforeName: String, beforeProps: ComponentProps): BeforeName = {
    val __obj = js.Dynamic.literal(beforeName = beforeName.asInstanceOf[js.Any], beforeProps = beforeProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[BeforeName]
  }
  
  @scala.inline
  implicit class BeforeNameOps[Self <: BeforeName] (val x: Self) extends AnyVal {
    
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
    def setBeforeName(value: String): Self = this.set("beforeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeforeProps(value: ComponentProps): Self = this.set("beforeProps", value.asInstanceOf[js.Any])
  }
}
