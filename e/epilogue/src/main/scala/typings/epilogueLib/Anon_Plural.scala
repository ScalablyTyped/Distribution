package typings
package epilogueLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Plural extends js.Object {
  var plural: java.lang.String
  var singular: java.lang.String
}

object Anon_Plural {
  @scala.inline
  def apply(plural: java.lang.String, singular: java.lang.String): Anon_Plural = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("plural")(plural)
    __obj.updateDynamic("singular")(singular)
    __obj.asInstanceOf[Anon_Plural]
  }
}

