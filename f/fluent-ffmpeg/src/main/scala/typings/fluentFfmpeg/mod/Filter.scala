package typings.fluentFfmpeg.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Filter extends js.Object {
  
  var description: String = js.native
  
  var input: String = js.native
  
  var multipleInputs: Boolean = js.native
  
  var multipleOutputs: Boolean = js.native
  
  var output: String = js.native
}
object Filter {
  
  @scala.inline
  def apply(
    description: String,
    input: String,
    multipleInputs: Boolean,
    multipleOutputs: Boolean,
    output: String
  ): Filter = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], multipleInputs = multipleInputs.asInstanceOf[js.Any], multipleOutputs = multipleOutputs.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any])
    __obj.asInstanceOf[Filter]
  }
  
  @scala.inline
  implicit class FilterOps[Self <: Filter] (val x: Self) extends AnyVal {
    
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInput(value: String): Self = this.set("input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultipleInputs(value: Boolean): Self = this.set("multipleInputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultipleOutputs(value: Boolean): Self = this.set("multipleOutputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutput(value: String): Self = this.set("output", value.asInstanceOf[js.Any])
  }
}
