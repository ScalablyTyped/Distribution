package typings.fontkit.mod

import typings.fontkit.fontkitStrings.bezierCurveTo
import typings.fontkit.fontkitStrings.closePath
import typings.fontkit.fontkitStrings.lineTo
import typings.fontkit.fontkitStrings.moveTo
import typings.fontkit.fontkitStrings.quadraticCurveTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PathCommand extends js.Object {
  
  var args: js.Array[Double] = js.native
  
  var command: moveTo | lineTo | quadraticCurveTo | bezierCurveTo | closePath = js.native
}
object PathCommand {
  
  @scala.inline
  def apply(args: js.Array[Double], command: moveTo | lineTo | quadraticCurveTo | bezierCurveTo | closePath): PathCommand = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathCommand]
  }
  
  @scala.inline
  implicit class PathCommandOps[Self <: PathCommand] (val x: Self) extends AnyVal {
    
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
    def setArgsVarargs(value: Double*): Self = this.set("args", js.Array(value :_*))
    
    @scala.inline
    def setArgs(value: js.Array[Double]): Self = this.set("args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommand(value: moveTo | lineTo | quadraticCurveTo | bezierCurveTo | closePath): Self = this.set("command", value.asInstanceOf[js.Any])
  }
}
