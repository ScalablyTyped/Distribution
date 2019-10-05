package typings.elasticDashApmDashNode

import typings.elasticDashApmDashNode.elasticDashApmDashNodeMod.Connect.ErrorHandleFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Connect extends js.Object {
  def connect(): ErrorHandleFunction
}

object Anon_Connect {
  @scala.inline
  def apply(connect: () => ErrorHandleFunction): Anon_Connect = {
    val __obj = js.Dynamic.literal(connect = js.Any.fromFunction0(connect))
  
    __obj.asInstanceOf[Anon_Connect]
  }
}

