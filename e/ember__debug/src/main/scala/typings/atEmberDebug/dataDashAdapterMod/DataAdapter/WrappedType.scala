package typings.atEmberDebug.dataDashAdapterMod.DataAdapter

import typings.atEmberDebug.Anon_Columns
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WrappedType extends js.Object {
  var `type`: Anon_Columns
  def release(): Unit
}

object WrappedType {
  @scala.inline
  def apply(release: () => Unit, `type`: Anon_Columns): WrappedType = {
    val __obj = js.Dynamic.literal(release = js.Any.fromFunction0(release))
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[WrappedType]
  }
}

