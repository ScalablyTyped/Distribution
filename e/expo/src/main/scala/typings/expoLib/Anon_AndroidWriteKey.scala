package typings
package expoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AndroidWriteKey extends js.Object {
  var androidWriteKey: java.lang.String
  var iosWriteKey: java.lang.String
}

object Anon_AndroidWriteKey {
  @scala.inline
  def apply(androidWriteKey: java.lang.String, iosWriteKey: java.lang.String): Anon_AndroidWriteKey = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("androidWriteKey")(androidWriteKey)
    __obj.updateDynamic("iosWriteKey")(iosWriteKey)
    __obj.asInstanceOf[Anon_AndroidWriteKey]
  }
}

