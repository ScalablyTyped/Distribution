package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ASPxClientSpellCheckerStopCheckingReasonStatic extends js.Object {
  /**
    * Spell checking is finished normally.
    */
  var Default: java.lang.String
  /**
    * The user stopped spell checking.
    */
  var User: java.lang.String
}

object ASPxClientSpellCheckerStopCheckingReasonStatic {
  @scala.inline
  def apply(Default: java.lang.String, User: java.lang.String): ASPxClientSpellCheckerStopCheckingReasonStatic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Default")(Default)
    __obj.updateDynamic("User")(User)
    __obj.asInstanceOf[ASPxClientSpellCheckerStopCheckingReasonStatic]
  }
}

