package typings
package dwtLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** 
  * interface for a base64 result
  */
trait Base64Result extends js.Object {
  def getData(offset: scala.Double, length: scala.Double): java.lang.String
  def getLength(): scala.Double
  def getMD5(): java.lang.String
}

object Base64Result {
  @scala.inline
  def apply(
    getData: (scala.Double, scala.Double) => java.lang.String,
    getLength: () => scala.Double,
    getMD5: () => java.lang.String
  ): Base64Result = {
    val __obj = js.Dynamic.literal(getData = js.Any.fromFunction2(getData), getLength = js.Any.fromFunction0(getLength), getMD5 = js.Any.fromFunction0(getMD5))
  
    __obj.asInstanceOf[Base64Result]
  }
}

