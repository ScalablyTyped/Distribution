package typings.devtoolsProtocol.mod.Protocol.Debugger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StepOverRequest extends js.Object {
  
  /**
    * The skipList specifies location ranges that should be skipped on step over.
    */
  var skipList: js.UndefOr[js.Array[LocationRange]] = js.native
}
object StepOverRequest {
  
  @scala.inline
  def apply(): StepOverRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StepOverRequest]
  }
  
  @scala.inline
  implicit class StepOverRequestOps[Self <: StepOverRequest] (val x: Self) extends AnyVal {
    
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
    def setSkipListVarargs(value: LocationRange*): Self = this.set("skipList", js.Array(value :_*))
    
    @scala.inline
    def setSkipList(value: js.Array[LocationRange]): Self = this.set("skipList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipList: Self = this.set("skipList", js.undefined)
  }
}
