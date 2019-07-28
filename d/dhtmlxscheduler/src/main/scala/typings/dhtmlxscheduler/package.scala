package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object dhtmlxscheduler {
  type SchedulerCallback = js.Function1[/* repeated */ js.Any, js.Any]
  type SchedulerFilterCallback = js.Function2[/* id */ String | Double, /* event */ js.Any, Boolean]
}
