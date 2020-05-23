package typings.edgeJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSQL extends js.Object {
  var commandTimeout: js.UndefOr[Double] = js.undefined
  var connectionString: js.UndefOr[String] = js.undefined
  var source: String
}

object TSQL {
  @scala.inline
  def apply(source: String, commandTimeout: js.UndefOr[Double] = js.undefined, connectionString: String = null): TSQL = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    if (!js.isUndefined(commandTimeout)) __obj.updateDynamic("commandTimeout")(commandTimeout.get.asInstanceOf[js.Any])
    if (connectionString != null) __obj.updateDynamic("connectionString")(connectionString.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSQL]
  }
}

