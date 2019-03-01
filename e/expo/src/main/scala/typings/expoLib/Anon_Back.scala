package typings
package expoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Back extends js.Object {
  var back: java.lang.String
  var front: java.lang.String
}

object Anon_Back {
  @scala.inline
  def apply(back: java.lang.String, front: java.lang.String): Anon_Back = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("back")(back)
    __obj.updateDynamic("front")(front)
    __obj.asInstanceOf[Anon_Back]
  }
}

