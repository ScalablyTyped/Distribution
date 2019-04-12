package typings
package dialogflowLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Key extends js.Object {
  var key: java.lang.String
  var synonyms: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object Anon_Key {
  @scala.inline
  def apply(key: java.lang.String, synonyms: js.Array[java.lang.String] = null): Anon_Key = {
    val __obj = js.Dynamic.literal(key = key)
    if (synonyms != null) __obj.updateDynamic("synonyms")(synonyms)
    __obj.asInstanceOf[Anon_Key]
  }
}

