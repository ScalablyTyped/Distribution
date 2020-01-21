package typings.gapiClientTesting.gapi.client.testing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnvironmentVariable extends js.Object {
  /** Key for the environment variable */
  var key: js.UndefOr[String] = js.undefined
  /** Value for the environment variable */
  var value: js.UndefOr[String] = js.undefined
}

object EnvironmentVariable {
  @scala.inline
  def apply(key: String = null, value: String = null): EnvironmentVariable = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnvironmentVariable]
  }
}

