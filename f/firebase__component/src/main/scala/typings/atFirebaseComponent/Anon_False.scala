package typings.atFirebaseComponent

import typings.atFirebaseComponent.atFirebaseComponentNumbers.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_False extends js.Object {
  var identifier: js.UndefOr[String] = js.undefined
  var optional: js.UndefOr[`false`] = js.undefined
}

object Anon_False {
  @scala.inline
  def apply(identifier: String = null, optional: `false` = null): Anon_False = {
    val __obj = js.Dynamic.literal()
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (optional != null) __obj.updateDynamic("optional")(optional.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_False]
  }
}

