package typings
package dockerodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MaximumRetryCount extends js.Object {
  var MaximumRetryCount: scala.Double
  var Name: java.lang.String
}

object Anon_MaximumRetryCount {
  @scala.inline
  def apply(MaximumRetryCount: scala.Double, Name: java.lang.String): Anon_MaximumRetryCount = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("MaximumRetryCount")(MaximumRetryCount)
    __obj.updateDynamic("Name")(Name)
    __obj.asInstanceOf[Anon_MaximumRetryCount]
  }
}

