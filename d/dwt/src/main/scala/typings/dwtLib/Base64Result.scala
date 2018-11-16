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

