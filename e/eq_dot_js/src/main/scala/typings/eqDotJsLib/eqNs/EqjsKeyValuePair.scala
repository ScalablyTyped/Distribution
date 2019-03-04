package typings
package eqDotJsLib.eqNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EqjsKeyValuePair extends js.Object {
  var key: java.lang.String
  var value: scala.Double
}

object EqjsKeyValuePair {
  @scala.inline
  def apply(key: java.lang.String, value: scala.Double): EqjsKeyValuePair = {
    val __obj = js.Dynamic.literal(key = key, value = value)
  
    __obj.asInstanceOf[EqjsKeyValuePair]
  }
}

