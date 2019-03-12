package typings
package dwtLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebcamResolution extends js.Object {
  def Get(index: scala.Double): java.lang.String
  def GetCount(): scala.Double
  def GetCurrent(): java.lang.String
}

object WebcamResolution {
  @scala.inline
  def apply(
    Get: scala.Double => java.lang.String,
    GetCount: () => scala.Double,
    GetCurrent: () => java.lang.String
  ): WebcamResolution = {
    val __obj = js.Dynamic.literal(Get = js.Any.fromFunction1(Get), GetCount = js.Any.fromFunction0(GetCount), GetCurrent = js.Any.fromFunction0(GetCurrent))
  
    __obj.asInstanceOf[WebcamResolution]
  }
}

