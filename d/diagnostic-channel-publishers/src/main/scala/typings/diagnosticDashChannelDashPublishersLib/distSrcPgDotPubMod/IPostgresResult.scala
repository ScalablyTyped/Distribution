package typings
package diagnosticDashChannelDashPublishersLib.distSrcPgDotPubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPostgresResult extends js.Object {
  var command: java.lang.String
  var rowCount: scala.Double
}

object IPostgresResult {
  @scala.inline
  def apply(command: java.lang.String, rowCount: scala.Double): IPostgresResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("command")(command)
    __obj.updateDynamic("rowCount")(rowCount)
    __obj.asInstanceOf[IPostgresResult]
  }
}

