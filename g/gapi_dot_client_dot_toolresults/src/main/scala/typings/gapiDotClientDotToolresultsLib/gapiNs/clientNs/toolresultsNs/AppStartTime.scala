package typings
package gapiDotClientDotToolresultsLib.gapiNs.clientNs.toolresultsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppStartTime extends js.Object {
  /**
    * Optional. The time from app start to reaching the developer-reported "fully drawn" time. This is only stored if the app includes a call to
    * Activity.reportFullyDrawn(). See https://developer.android.com/topic/performance/launch-time.html#time-full
    */
  var fullyDrawnTime: js.UndefOr[Duration] = js.undefined
  /**
    * The time from app start to the first displayed activity being drawn, as reported in Logcat. See
    * https://developer.android.com/topic/performance/launch-time.html#time-initial
    */
  var initialDisplayTime: js.UndefOr[Duration] = js.undefined
}

