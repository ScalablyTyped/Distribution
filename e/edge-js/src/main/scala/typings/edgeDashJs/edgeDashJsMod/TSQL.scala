package typings.edgeDashJs.edgeDashJsMod

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
  def apply(source: String, commandTimeout: Int | Double = null, connectionString: String = null): TSQL = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    if (commandTimeout != null) __obj.updateDynamic("commandTimeout")(commandTimeout.asInstanceOf[js.Any])
    if (connectionString != null) __obj.updateDynamic("connectionString")(connectionString.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSQL]
  }
}

