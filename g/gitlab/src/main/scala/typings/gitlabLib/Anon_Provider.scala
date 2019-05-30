package typings
package gitlabLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Provider extends js.Object {
  var provider: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Provider {
  @scala.inline
  def apply(provider: java.lang.String = null): Anon_Provider = {
    val __obj = js.Dynamic.literal()
    if (provider != null) __obj.updateDynamic("provider")(provider)
    __obj.asInstanceOf[Anon_Provider]
  }
}

