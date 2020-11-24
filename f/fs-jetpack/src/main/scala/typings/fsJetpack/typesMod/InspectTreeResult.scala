package typings.fsJetpack.typesMod

import typings.fsJetpack.fsJetpackStrings.dir
import typings.fsJetpack.fsJetpackStrings.file
import typings.fsJetpack.fsJetpackStrings.symlink
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InspectTreeResult extends InspectResult {
  
  var children: js.Array[InspectTreeResult] = js.native
  
  var relativePath: String = js.native
}
object InspectTreeResult {
  
  @scala.inline
  def apply(
    children: js.Array[InspectTreeResult],
    name: String,
    relativePath: String,
    size: Double,
    `type`: file | dir | symlink
  ): InspectTreeResult = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], relativePath = relativePath.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InspectTreeResult]
  }
  
  @scala.inline
  implicit class InspectTreeResultOps[Self <: InspectTreeResult] (val x: Self) extends AnyVal {
    
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
    def setChildrenVarargs(value: InspectTreeResult*): Self = this.set("children", js.Array(value :_*))
    
    @scala.inline
    def setChildren(value: js.Array[InspectTreeResult]): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelativePath(value: String): Self = this.set("relativePath", value.asInstanceOf[js.Any])
  }
}
