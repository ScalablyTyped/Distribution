package typings
package dwtLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebcamFrameRate extends js.Object {
  def Get(index: scala.Double): java.lang.String
  def GetCount(): scala.Double
  def GetCurrent(): java.lang.String
}

object WebcamFrameRate {
  @scala.inline
  def apply(
    Get: js.Function1[scala.Double, java.lang.String],
    GetCount: js.Function0[scala.Double],
    GetCurrent: js.Function0[java.lang.String]
  ): WebcamFrameRate = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Get")(Get)
    __obj.updateDynamic("GetCount")(GetCount)
    __obj.updateDynamic("GetCurrent")(GetCurrent)
    __obj.asInstanceOf[WebcamFrameRate]
  }
}

