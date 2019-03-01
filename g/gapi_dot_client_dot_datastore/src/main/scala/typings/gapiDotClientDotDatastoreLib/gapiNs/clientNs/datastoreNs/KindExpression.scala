package typings
package gapiDotClientDotDatastoreLib.gapiNs.clientNs.datastoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KindExpression extends js.Object {
  /** The name of the kind. */
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object KindExpression {
  @scala.inline
  def apply(name: java.lang.String = null): KindExpression = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[KindExpression]
  }
}

