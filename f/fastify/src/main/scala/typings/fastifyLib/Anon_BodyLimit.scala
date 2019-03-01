package typings
package fastifyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyLimit extends js.Object {
  var bodyLimit: js.UndefOr[scala.Double] = js.undefined
}

object Anon_BodyLimit {
  @scala.inline
  def apply(bodyLimit: scala.Int | scala.Double = null): Anon_BodyLimit = {
    val __obj = js.Dynamic.literal()
    if (bodyLimit != null) __obj.updateDynamic("bodyLimit")(bodyLimit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BodyLimit]
  }
}

