package typings.googleDashDriveDashRealtimeDashApi.gapiNs.driveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object realtimeNs {
  import typings.std.Event
  import typings.std.EventListener

  type GoogEventHandler = (js.Function1[(/* e */ Event) | (/* evt */ ObjectChangedEvent), Unit]) | EventListener
}
