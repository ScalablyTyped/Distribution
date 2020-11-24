package typings.gitlab.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  sha :string} & gitlab.gitlab/dist/types/core/infrastructure.Sudo */
@js.native
trait shastringSudo extends js.Object {
  
  var sha: String = js.native
  
  var sudo: js.UndefOr[String | Double] = js.native
}
object shastringSudo {
  
  @scala.inline
  def apply(sha: String): shastringSudo = {
    val __obj = js.Dynamic.literal(sha = sha.asInstanceOf[js.Any])
    __obj.asInstanceOf[shastringSudo]
  }
  
  @scala.inline
  implicit class shastringSudoOps[Self <: shastringSudo] (val x: Self) extends AnyVal {
    
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
    def setSha(value: String): Self = this.set("sha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSudo(value: String | Double): Self = this.set("sudo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSudo: Self = this.set("sudo", js.undefined)
  }
}
