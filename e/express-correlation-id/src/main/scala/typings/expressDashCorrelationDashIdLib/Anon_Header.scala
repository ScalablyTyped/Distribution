package typings
package expressDashCorrelationDashIdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Header extends js.Object {
  var header: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Header {
  @scala.inline
  def apply(header: java.lang.String = null): Anon_Header = {
    val __obj = js.Dynamic.literal()
    if (header != null) __obj.updateDynamic("header")(header)
    __obj.asInstanceOf[Anon_Header]
  }
}

