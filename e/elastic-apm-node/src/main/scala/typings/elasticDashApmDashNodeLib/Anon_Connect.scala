package typings
package elasticDashApmDashNodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Connect extends js.Object {
  def connect(): elasticDashApmDashNodeLib.elasticDashApmDashNodeMod.ConnectNs.ErrorHandleFunction
}

object Anon_Connect {
  @scala.inline
  def apply(connect: () => elasticDashApmDashNodeLib.elasticDashApmDashNodeMod.ConnectNs.ErrorHandleFunction): Anon_Connect = {
    val __obj = js.Dynamic.literal(connect = js.Any.fromFunction0(connect))
  
    __obj.asInstanceOf[Anon_Connect]
  }
}

