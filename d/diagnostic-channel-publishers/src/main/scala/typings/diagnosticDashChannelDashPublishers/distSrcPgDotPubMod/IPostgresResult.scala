package typings.diagnosticDashChannelDashPublishers.distSrcPgDotPubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPostgresResult extends js.Object {
  var command: String
  var rowCount: Double
}

object IPostgresResult {
  @scala.inline
  def apply(command: String, rowCount: Double): IPostgresResult = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], rowCount = rowCount.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IPostgresResult]
  }
}

