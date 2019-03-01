package typings
package epiceditorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Base extends js.Object {
  var base: java.lang.String
  var editor: java.lang.String
  var preview: java.lang.String
}

object Anon_Base {
  @scala.inline
  def apply(base: java.lang.String, editor: java.lang.String, preview: java.lang.String): Anon_Base = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("base")(base)
    __obj.updateDynamic("editor")(editor)
    __obj.updateDynamic("preview")(preview)
    __obj.asInstanceOf[Anon_Base]
  }
}

