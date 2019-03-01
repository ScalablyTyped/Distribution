package typings
package ejsonLib.ejsonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StringifyOptions extends js.Object {
  var canonical: scala.Boolean
  var indent: scala.Boolean | scala.Double | java.lang.String
}

object StringifyOptions {
  @scala.inline
  def apply(canonical: scala.Boolean, indent: scala.Boolean | scala.Double | java.lang.String): StringifyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("canonical")(canonical)
    __obj.updateDynamic("indent")(indent.asInstanceOf[js.Any])
    __obj.asInstanceOf[StringifyOptions]
  }
}

