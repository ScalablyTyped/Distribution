package typings
package googleDotPickerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ACTION extends js.Object {
  var ACTION: java.lang.String
  var DOCUMENTS: java.lang.String
  var PARENTS: java.lang.String
  var VIEW: java.lang.String
}

object Anon_ACTION {
  @scala.inline
  def apply(
    ACTION: java.lang.String,
    DOCUMENTS: java.lang.String,
    PARENTS: java.lang.String,
    VIEW: java.lang.String
  ): Anon_ACTION = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ACTION")(ACTION)
    __obj.updateDynamic("DOCUMENTS")(DOCUMENTS)
    __obj.updateDynamic("PARENTS")(PARENTS)
    __obj.updateDynamic("VIEW")(VIEW)
    __obj.asInstanceOf[Anon_ACTION]
  }
}

