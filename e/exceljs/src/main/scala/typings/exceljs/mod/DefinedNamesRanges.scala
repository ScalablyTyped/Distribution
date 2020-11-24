package typings.exceljs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefinedNamesRanges extends js.Object {
  
  var name: String = js.native
  
  var ranges: js.Array[String] = js.native
}
object DefinedNamesRanges {
  
  @scala.inline
  def apply(name: String, ranges: js.Array[String]): DefinedNamesRanges = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], ranges = ranges.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinedNamesRanges]
  }
  
  @scala.inline
  implicit class DefinedNamesRangesOps[Self <: DefinedNamesRanges] (val x: Self) extends AnyVal {
    
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
    def setRangesVarargs(value: String*): Self = this.set("ranges", js.Array(value :_*))
    
    @scala.inline
    def setRanges(value: js.Array[String]): Self = this.set("ranges", value.asInstanceOf[js.Any])
  }
}
