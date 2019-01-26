package typings
package drivelistLib.drivelistMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("drivelist", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def list(
    callback: js.Function2[
      /* error */ js.Any, 
      /* drives */ js.Array[drivelistLib.drivelistMod.Drive], 
      scala.Unit
    ]
  ): scala.Unit = js.native
}

