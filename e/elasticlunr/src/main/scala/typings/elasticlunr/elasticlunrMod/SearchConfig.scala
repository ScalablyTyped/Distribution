package typings.elasticlunr.elasticlunrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchConfig[T] extends js.Object {
  var fields: js.UndefOr[FieldSearchConfig[T]] = js.undefined
}

object SearchConfig {
  @scala.inline
  def apply[T](fields: FieldSearchConfig[T] = null): SearchConfig[T] = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchConfig[T]]
  }
}

