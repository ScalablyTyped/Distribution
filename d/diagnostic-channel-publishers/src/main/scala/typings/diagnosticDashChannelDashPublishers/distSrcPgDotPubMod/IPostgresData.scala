package typings.diagnosticDashChannelDashPublishers.distSrcPgDotPubMod

import typings.diagnosticDashChannelDashPublishers.Anon_HostPort
import typings.diagnosticDashChannelDashPublishers.Anon_Plan
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPostgresData extends js.Object {
  var database: Anon_HostPort
  var duration: Double
  var error: js.UndefOr[Error] = js.undefined
  var query: Anon_Plan
  var result: js.UndefOr[IPostgresResult] = js.undefined
}

object IPostgresData {
  @scala.inline
  def apply(
    database: Anon_HostPort,
    duration: Double,
    query: Anon_Plan,
    error: Error = null,
    result: IPostgresResult = null
  ): IPostgresData = {
    val __obj = js.Dynamic.literal(database = database, duration = duration, query = query)
    if (error != null) __obj.updateDynamic("error")(error)
    if (result != null) __obj.updateDynamic("result")(result)
    __obj.asInstanceOf[IPostgresData]
  }
}

