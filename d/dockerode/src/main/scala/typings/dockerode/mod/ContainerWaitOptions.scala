package typings.dockerode.mod

import typings.dockerode.dockerodeStrings.`next-exit`
import typings.dockerode.dockerodeStrings.`not-running`
import typings.dockerode.dockerodeStrings.removed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContainerWaitOptions extends js.Object {
  
  /** Since v1.30 */
  var condition: js.UndefOr[`not-running` | `next-exit` | removed] = js.native
}
object ContainerWaitOptions {
  
  @scala.inline
  def apply(): ContainerWaitOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerWaitOptions]
  }
  
  @scala.inline
  implicit class ContainerWaitOptionsOps[Self <: ContainerWaitOptions] (val x: Self) extends AnyVal {
    
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
    def setCondition(value: `not-running` | `next-exit` | removed): Self = this.set("condition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCondition: Self = this.set("condition", js.undefined)
  }
}
