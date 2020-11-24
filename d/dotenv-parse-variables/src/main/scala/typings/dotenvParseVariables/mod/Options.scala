package typings.dotenvParseVariables.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var assignToProcessEnv: js.UndefOr[Boolean] = js.native
  
  var overrideProcessEnv: js.UndefOr[Boolean] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setAssignToProcessEnv(value: Boolean): Self = this.set("assignToProcessEnv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssignToProcessEnv: Self = this.set("assignToProcessEnv", js.undefined)
    
    @scala.inline
    def setOverrideProcessEnv(value: Boolean): Self = this.set("overrideProcessEnv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverrideProcessEnv: Self = this.set("overrideProcessEnv", js.undefined)
  }
}
