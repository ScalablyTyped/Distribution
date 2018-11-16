package typings
package getosLib.getosMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("getos", JSImport.Namespace)
@js.native
object getosModMembers extends js.Object {
  def apply(
    cb: js.Function2[
      /* error */ stdLib.Error | scala.Null, 
      /* os */ getosLib.getosMod.getosNs.Os, 
      scala.Unit
    ]
  ): java.lang.String = js.native
}

