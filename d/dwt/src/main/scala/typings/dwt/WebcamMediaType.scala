package typings.dwt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebcamMediaType extends js.Object {
  def Get(index: Double): String
  def GetCount(): Double
  def GetCurrent(): String
}

object WebcamMediaType {
  @scala.inline
  def apply(Get: Double => String, GetCount: () => Double, GetCurrent: () => String): WebcamMediaType = {
    val __obj = js.Dynamic.literal(Get = js.Any.fromFunction1(Get), GetCount = js.Any.fromFunction0(GetCount), GetCurrent = js.Any.fromFunction0(GetCurrent))
  
    __obj.asInstanceOf[WebcamMediaType]
  }
}

