package typings.googleDashDriveDashRealtimeDashApi.gapiNs.driveNs

import typings.std.Event
import typings.std.EventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object realtimeNs {
  type GoogEventHandler = (js.Function1[(/* e */ Event) | (/* evt */ ObjectChangedEvent), Unit]) | EventListener
}
