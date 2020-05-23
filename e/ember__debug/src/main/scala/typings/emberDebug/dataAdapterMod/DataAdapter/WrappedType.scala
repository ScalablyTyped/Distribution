package typings.emberDebug.dataAdapterMod.DataAdapter

import typings.emberDebug.anon.Columns
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WrappedType extends js.Object {
  var `type`: Columns
  def release(): Unit
}

object WrappedType {
  @scala.inline
  def apply(release: () => Unit, `type`: Columns): WrappedType = {
    val __obj = js.Dynamic.literal(release = js.Any.fromFunction0(release))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WrappedType]
  }
}

