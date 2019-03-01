package typings
package diagnosticDashChannelDashPublishersLib.distSrcPgDotPubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPostgresData extends js.Object {
  var database: diagnosticDashChannelDashPublishersLib.Anon_HostPort
  var duration: scala.Double
  var error: js.UndefOr[stdLib.Error] = js.undefined
  var query: diagnosticDashChannelDashPublishersLib.Anon_Plan
  var result: js.UndefOr[IPostgresResult] = js.undefined
}

object IPostgresData {
  @scala.inline
  def apply(
    database: diagnosticDashChannelDashPublishersLib.Anon_HostPort,
    duration: scala.Double,
    query: diagnosticDashChannelDashPublishersLib.Anon_Plan,
    error: stdLib.Error = null,
    result: IPostgresResult = null
  ): IPostgresData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("database")(database)
    __obj.updateDynamic("duration")(duration)
    __obj.updateDynamic("query")(query)
    if (error != null) __obj.updateDynamic("error")(error)
    if (result != null) __obj.updateDynamic("result")(result)
    __obj.asInstanceOf[IPostgresData]
  }
}

