package typings.falcorJsonGraph.mod

import typings.falcorJsonGraph.falcorJsonGraphStrings.reference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Reference extends Sentinel {
  
  @JSName("$type")
  var $type: reference = js.native
  
  var value: Path = js.native
}
object Reference {
  
  @scala.inline
  def apply($type: reference, value: Path): Reference = {
    val __obj = js.Dynamic.literal($type = $type.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Reference]
  }
  
  @scala.inline
  implicit class ReferenceOps[Self <: Reference] (val x: Self) extends AnyVal {
    
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
    def set$type(value: reference): Self = this.set("$type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueVarargs(value: Key*): Self = this.set("value", js.Array(value :_*))
    
    @scala.inline
    def setValue(value: Path): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
