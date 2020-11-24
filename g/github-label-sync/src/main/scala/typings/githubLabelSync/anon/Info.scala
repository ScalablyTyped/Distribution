package typings.githubLabelSync.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Info extends js.Object {
  
  var info: js.UndefOr[js.Function1[/* str */ String, Unit]] = js.native
  
  var warn: js.UndefOr[js.Function1[/* str */ String, Unit]] = js.native
}
object Info {
  
  @scala.inline
  def apply(): Info = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Info]
  }
  
  @scala.inline
  implicit class InfoOps[Self <: Info] (val x: Self) extends AnyVal {
    
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
    def setInfo(value: /* str */ String => Unit): Self = this.set("info", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteInfo: Self = this.set("info", js.undefined)
    
    @scala.inline
    def setWarn(value: /* str */ String => Unit): Self = this.set("warn", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteWarn: Self = this.set("warn", js.undefined)
  }
}
