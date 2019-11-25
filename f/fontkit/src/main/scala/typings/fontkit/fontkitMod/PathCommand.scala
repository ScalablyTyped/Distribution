package typings.fontkit.fontkitMod

import typings.fontkit.fontkitStrings.bezierCurveTo
import typings.fontkit.fontkitStrings.closePath
import typings.fontkit.fontkitStrings.lineTo
import typings.fontkit.fontkitStrings.moveTo
import typings.fontkit.fontkitStrings.quadraticCurveTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PathCommand extends js.Object {
  var args: js.Array[Double]
  var command: moveTo | lineTo | quadraticCurveTo | bezierCurveTo | closePath
}

object PathCommand {
  @scala.inline
  def apply(args: js.Array[Double], command: moveTo | lineTo | quadraticCurveTo | bezierCurveTo | closePath): PathCommand = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PathCommand]
  }
}

