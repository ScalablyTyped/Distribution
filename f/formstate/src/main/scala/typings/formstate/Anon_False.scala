package typings.formstate

import typings.formstate.formstateNumbers.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_False[TValue] extends js.Object {
  var hasError: `false`
  var value: TValue
}

object Anon_False {
  @scala.inline
  def apply[TValue](hasError: `false`, value: TValue): Anon_False[TValue] = {
    val __obj = js.Dynamic.literal(hasError = hasError, value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_False[TValue]]
  }
}

