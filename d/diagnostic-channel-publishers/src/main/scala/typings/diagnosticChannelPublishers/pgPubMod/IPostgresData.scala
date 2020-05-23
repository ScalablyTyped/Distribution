package typings.diagnosticChannelPublishers.pgPubMod

import typings.diagnosticChannelPublishers.anon.Plan
import typings.diagnosticChannelPublishers.anon.Port
import typings.std.Date
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPostgresData extends js.Object {
  var database: Port
  var duration: Double
  var error: js.UndefOr[Error] = js.undefined
  var query: Plan
  var result: js.UndefOr[IPostgresResult] = js.undefined
  var time: Date
}

object IPostgresData {
  @scala.inline
  def apply(
    database: Port,
    duration: Double,
    query: Plan,
    time: Date,
    error: Error = null,
    result: IPostgresResult = null
  ): IPostgresData = {
    val __obj = js.Dynamic.literal(database = database.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (result != null) __obj.updateDynamic("result")(result.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPostgresData]
  }
}

