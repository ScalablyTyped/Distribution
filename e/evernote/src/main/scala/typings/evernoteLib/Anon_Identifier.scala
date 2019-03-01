package typings
package evernoteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Identifier extends js.Object {
  var identifier: js.UndefOr[java.lang.String] = js.undefined
  var key: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Identifier {
  @scala.inline
  def apply(identifier: java.lang.String = null, key: java.lang.String = null): Anon_Identifier = {
    val __obj = js.Dynamic.literal()
    if (identifier != null) __obj.updateDynamic("identifier")(identifier)
    if (key != null) __obj.updateDynamic("key")(key)
    __obj.asInstanceOf[Anon_Identifier]
  }
}

