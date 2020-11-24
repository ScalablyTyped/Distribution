package typings.ejWebAll.ej.Kanban

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Workflow extends js.Object {
  
  /** Gets or sets an object that indicates to render the Kanban with specified workflows allowed Transitions.
    * @Default {null}
    */
  var allowedTransitions: js.UndefOr[String] = js.native
  
  /** Gets or sets an object that indicates to render the Kanban with specified workflows key.
    * @Default {null}
    */
  var key: js.UndefOr[String | Double] = js.native
}
object Workflow {
  
  @scala.inline
  def apply(): Workflow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Workflow]
  }
  
  @scala.inline
  implicit class WorkflowOps[Self <: Workflow] (val x: Self) extends AnyVal {
    
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
    def setAllowedTransitions(value: String): Self = this.set("allowedTransitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowedTransitions: Self = this.set("allowedTransitions", js.undefined)
    
    @scala.inline
    def setKey(value: String | Double): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
  }
}
