package typings
package gapiDotClientDotBooksLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Identifier extends js.Object {
  /** Industry specific volume identifier. */
  var identifier: js.UndefOr[java.lang.String] = js.undefined
  /** Identifier type. Possible values are ISBN_10, ISBN_13, ISSN and OTHER. */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Identifier {
  @scala.inline
  def apply(identifier: java.lang.String = null, `type`: java.lang.String = null): Anon_Identifier = {
    val __obj = js.Dynamic.literal()
    if (identifier != null) __obj.updateDynamic("identifier")(identifier)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Identifier]
  }
}

