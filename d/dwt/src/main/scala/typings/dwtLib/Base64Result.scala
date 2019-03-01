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
    getData: js.Function2[scala.Double, scala.Double, java.lang.String],
    getLength: js.Function0[scala.Double],
    getMD5: js.Function0[java.lang.String]
  ): Base64Result = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getData")(getData)
    __obj.updateDynamic("getLength")(getLength)
    __obj.updateDynamic("getMD5")(getMD5)
    __obj.asInstanceOf[Base64Result]
  }
}

