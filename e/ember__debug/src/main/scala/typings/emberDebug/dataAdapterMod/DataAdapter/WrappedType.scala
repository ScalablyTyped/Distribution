package typings.emberDebug.dataAdapterMod.DataAdapter

import typings.emberDebug.AnonColumns
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WrappedType extends js.Object {
  var `type`: AnonColumns
  def release(): Unit
}

object WrappedType {
  @scala.inline
  def apply(release: () => Unit, `type`: AnonColumns): WrappedType = {
    val __obj = js.Dynamic.literal(release = js.Any.fromFunction0(release))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WrappedType]
  }
}

