package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NameValue extends js.Object {
  /** Name of the HTTP header. */
  var name: java.lang.String
  /** Value of the HTTP header. */
  var value: java.lang.String
}

object Anon_NameValue {
  @scala.inline
  def apply(name: java.lang.String, value: java.lang.String): Anon_NameValue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Anon_NameValue]
  }
}

