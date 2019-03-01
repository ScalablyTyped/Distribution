package typings
package elasticsearchLib.elasticsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MGetResponse[T] extends js.Object {
  var docs: js.UndefOr[js.Array[GetResponse[T]]] = js.undefined
}

object MGetResponse {
  @scala.inline
  def apply[T](docs: js.Array[GetResponse[T]] = null): MGetResponse[T] = {
    val __obj = js.Dynamic.literal()
    if (docs != null) __obj.updateDynamic("docs")(docs)
    __obj.asInstanceOf[MGetResponse[T]]
  }
}

