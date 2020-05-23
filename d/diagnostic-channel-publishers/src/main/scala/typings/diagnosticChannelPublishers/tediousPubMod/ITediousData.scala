package typings.diagnosticChannelPublishers.tediousPubMod

import typings.diagnosticChannelPublishers.anon.Plan
import typings.diagnosticChannelPublishers.anon.Port
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITediousData extends js.Object {
  var database: Port
  var duration: Double
  var error: js.UndefOr[Error] = js.undefined
  var query: Plan
  var result: js.UndefOr[ITediousResult] = js.undefined
}

object ITediousData {
  @scala.inline
  def apply(database: Port, duration: Double, query: Plan, error: Error = null, result: ITediousResult = null): ITediousData = {
    val __obj = js.Dynamic.literal(database = database.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (result != null) __obj.updateDynamic("result")(result.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITediousData]
  }
}

