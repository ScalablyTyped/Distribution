package typings
package fbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Window extends js.Object {
  def fbAsyncInit(): js.Any
}

object Window {
  @scala.inline
  def apply(fbAsyncInit: js.Function0[js.Any]): Window = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fbAsyncInit")(fbAsyncInit)
    __obj.asInstanceOf[Window]
  }
}

