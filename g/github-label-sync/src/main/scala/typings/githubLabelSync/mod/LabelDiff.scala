package typings.githubLabelSync.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LabelDiff extends js.Object {
  
  var actual: js.UndefOr[BasicLabel] = js.native
  
  var expected: js.UndefOr[BasicLabel] = js.native
  
  var name: String = js.native
  
  var `type`: String = js.native
}
object LabelDiff {
  
  @scala.inline
  def apply(name: String, `type`: String): LabelDiff = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelDiff]
  }
  
  @scala.inline
  implicit class LabelDiffOps[Self <: LabelDiff] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActual(value: BasicLabel): Self = this.set("actual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActual: Self = this.set("actual", js.undefined)
    
    @scala.inline
    def setExpected(value: BasicLabel): Self = this.set("expected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpected: Self = this.set("expected", js.undefined)
  }
}
