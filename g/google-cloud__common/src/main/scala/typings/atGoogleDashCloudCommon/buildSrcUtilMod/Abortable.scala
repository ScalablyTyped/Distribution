package typings.atGoogleDashCloudCommon.buildSrcUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Abortable extends js.Object {
  def abort(): Unit
}

object Abortable {
  @scala.inline
  def apply(abort: () => Unit): Abortable = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort))
  
    __obj.asInstanceOf[Abortable]
  }
}

