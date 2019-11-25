package typings.gapiDotClientDotDatastore.gapi.client.datastore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KindExpression extends js.Object {
  /** The name of the kind. */
  var name: js.UndefOr[String] = js.undefined
}

object KindExpression {
  @scala.inline
  def apply(name: String = null): KindExpression = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[KindExpression]
  }
}

