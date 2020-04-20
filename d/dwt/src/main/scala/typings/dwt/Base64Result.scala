package typings.dwt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** 
  * interface for a base64 result
  */
trait Base64Result extends js.Object {
  def getData(offset: Double, length: Double): String
  def getLength(): Double
  def getMD5(): String
}

object Base64Result {
  @scala.inline
  def apply(getData: (Double, Double) => String, getLength: () => Double, getMD5: () => String): Base64Result = {
    val __obj = js.Dynamic.literal(getData = js.Any.fromFunction2(getData), getLength = js.Any.fromFunction0(getLength), getMD5 = js.Any.fromFunction0(getMD5))
    __obj.asInstanceOf[Base64Result]
  }
}

