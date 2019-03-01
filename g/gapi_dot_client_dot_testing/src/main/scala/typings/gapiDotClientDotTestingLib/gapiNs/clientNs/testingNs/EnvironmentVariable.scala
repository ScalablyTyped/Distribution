package typings
package gapiDotClientDotTestingLib.gapiNs.clientNs.testingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnvironmentVariable extends js.Object {
  /** Key for the environment variable */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /** Value for the environment variable */
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object EnvironmentVariable {
  @scala.inline
  def apply(key: java.lang.String = null, value: java.lang.String = null): EnvironmentVariable = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[EnvironmentVariable]
  }
}

