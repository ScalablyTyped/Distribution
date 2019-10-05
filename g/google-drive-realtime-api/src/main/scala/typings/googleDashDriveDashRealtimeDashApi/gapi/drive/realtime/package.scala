package typings.googleDashDriveDashRealtimeDashApi.gapi.drive

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object realtime {
  import typings.std.Event
  import typings.std.EventListener

  type GoogEventHandler = (js.Function1[(/* e */ Event) | (/* evt */ ObjectChangedEvent), Unit]) | EventListener
}
