package typings
package fastifyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyLimitParseAs extends js.Object {
  var bodyLimit: js.UndefOr[scala.Double] = js.undefined
  var parseAs: fastifyLib.fastifyLibStrings.string
}

object Anon_BodyLimitParseAs {
  @scala.inline
  def apply(parseAs: fastifyLib.fastifyLibStrings.string, bodyLimit: scala.Int | scala.Double = null): Anon_BodyLimitParseAs = {
    val __obj = js.Dynamic.literal(parseAs = parseAs)
    if (bodyLimit != null) __obj.updateDynamic("bodyLimit")(bodyLimit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BodyLimitParseAs]
  }
}

