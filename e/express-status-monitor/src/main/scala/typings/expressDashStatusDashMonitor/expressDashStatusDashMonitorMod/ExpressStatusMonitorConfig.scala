package typings.expressDashStatusDashMonitor.expressDashStatusDashMonitorMod

import typings.expressDashStatusDashMonitor.Anon_Cpu
import typings.socketDotIo.socketDotIoMod.Server
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpressStatusMonitorConfig extends js.Object {
  var chartVisibility: js.UndefOr[Anon_Cpu] = js.undefined
  var healthChecks: js.UndefOr[js.Array[HealthCheck]] = js.undefined
  var ignoreStartsWith: js.UndefOr[String] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var socketPath: js.UndefOr[String] = js.undefined
   // References a socket.io instance
  var spans: js.UndefOr[js.Array[RetentionSpan]] = js.undefined
  var theme: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var websocket: js.UndefOr[Server | Null] = js.undefined
}

object ExpressStatusMonitorConfig {
  @scala.inline
  def apply(
    chartVisibility: Anon_Cpu = null,
    healthChecks: js.Array[HealthCheck] = null,
    ignoreStartsWith: String = null,
    path: String = null,
    socketPath: String = null,
    spans: js.Array[RetentionSpan] = null,
    theme: String = null,
    title: String = null,
    websocket: Server = null
  ): ExpressStatusMonitorConfig = {
    val __obj = js.Dynamic.literal()
    if (chartVisibility != null) __obj.updateDynamic("chartVisibility")(chartVisibility.asInstanceOf[js.Any])
    if (healthChecks != null) __obj.updateDynamic("healthChecks")(healthChecks.asInstanceOf[js.Any])
    if (ignoreStartsWith != null) __obj.updateDynamic("ignoreStartsWith")(ignoreStartsWith.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (socketPath != null) __obj.updateDynamic("socketPath")(socketPath.asInstanceOf[js.Any])
    if (spans != null) __obj.updateDynamic("spans")(spans.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (websocket != null) __obj.updateDynamic("websocket")(websocket.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpressStatusMonitorConfig]
  }
}

