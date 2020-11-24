package typings.firebaseDatabase.operationMod

import typings.firebaseDatabase.pathMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Operation extends js.Object {
  
  /**
    * @param {string} childName
    * @return {?Operation}
    */
  def operationForChild(childName: String): Operation | Null = js.native
  
  /**
    * @type {!Path}
    */
  var path: Path = js.native
  
  /**
    * @type {!OperationSource}
    */
  var source: OperationSource = js.native
  
  /**
    * @type {!OperationType}
    */
  var `type`: OperationType = js.native
}
object Operation {
  
  @scala.inline
  def apply(
    operationForChild: String => Operation | Null,
    path: Path,
    source: OperationSource,
    `type`: OperationType
  ): Operation = {
    val __obj = js.Dynamic.literal(operationForChild = js.Any.fromFunction1(operationForChild), path = path.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Operation]
  }
  
  @scala.inline
  implicit class OperationOps[Self <: Operation] (val x: Self) extends AnyVal {
    
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
    def setOperationForChild(value: String => Operation | Null): Self = this.set("operationForChild", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPath(value: Path): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: OperationSource): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: OperationType): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
