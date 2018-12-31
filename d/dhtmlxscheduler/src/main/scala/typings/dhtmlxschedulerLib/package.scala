package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object dhtmlxschedulerLib {
  type SchedulerCallback = js.Function1[/* repeated */ js.Any, js.Any]
  type SchedulerEventName = /* import warning: LimitUnionLength.enterTypeRef Was union type with length 73 */ java.lang.String
  type SchedulerFilterCallback = js.Function2[/* id */ java.lang.String | scala.Double, /* event */ js.Any, scala.Boolean]
}
