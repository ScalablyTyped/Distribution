package typings.googleapis.alphaMod.computeAlpha

import typings.googleapis.anon.Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaNodeTypesScopedList extends js.Object {
  /**
    * [Output Only] A list of node types contained in this scope.
    */
  var nodeTypes: js.UndefOr[js.Array[SchemaNodeType]] = js.native
  /**
    * [Output Only] An informational warning that appears when the node types
    * list is empty.
    */
  var warning: js.UndefOr[Code] = js.native
}

object SchemaNodeTypesScopedList {
  @scala.inline
  def apply(): SchemaNodeTypesScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNodeTypesScopedList]
  }
  @scala.inline
  implicit class SchemaNodeTypesScopedListOps[Self <: SchemaNodeTypesScopedList] (val x: Self) extends AnyVal {
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
    def setNodeTypesVarargs(value: SchemaNodeType*): Self = this.set("nodeTypes", js.Array(value :_*))
    @scala.inline
    def setNodeTypes(value: js.Array[SchemaNodeType]): Self = this.set("nodeTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodeTypes: Self = this.set("nodeTypes", js.undefined)
    @scala.inline
    def setWarning(value: Code): Self = this.set("warning", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWarning: Self = this.set("warning", js.undefined)
  }
  
}

