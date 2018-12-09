package typings
package googleDashP12DashPemLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-p12-pem", JSImport.Namespace)
@js.native
object googleDashP12DashPemMod extends js.Object {
  def getPem(filename: java.lang.String): js.Promise[java.lang.String] = js.native
  def getPem(
    filename: java.lang.String,
    callback: js.Function2[
      /* err */ nodeLib.Error | scala.Null, 
      /* pem */ java.lang.String | scala.Null, 
      scala.Unit
    ]
  ): scala.Unit = js.native
}

