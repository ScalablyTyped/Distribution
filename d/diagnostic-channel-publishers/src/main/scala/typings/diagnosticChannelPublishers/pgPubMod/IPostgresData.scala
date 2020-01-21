package typings.diagnosticChannelPublishers.pgPubMod

import typings.diagnosticChannelPublishers.AnonHostPort
import typings.diagnosticChannelPublishers.AnonPlan
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPostgresData extends js.Object {
  var database: AnonHostPort
  var duration: Double
  var error: js.UndefOr[Error] = js.undefined
  var query: AnonPlan
  var result: js.UndefOr[IPostgresResult] = js.undefined
}

object IPostgresData {
  @scala.inline
  def apply(
    database: AnonHostPort,
    duration: Double,
    query: AnonPlan,
    error: Error = null,
    result: IPostgresResult = null
  ): IPostgresData = {
    val __obj = js.Dynamic.literal(database = database.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (result != null) __obj.updateDynamic("result")(result.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPostgresData]
  }
}

