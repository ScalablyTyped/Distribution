package typings.googleGax.longrunningMod

import typings.googleGax.AnonValue
import typings.googleGax.googleErrorMod.GoogleError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LROOperation extends js.Object {
  var done: Boolean
  var error: GoogleError
  var metadata: AnonValue
  var name: String
  var response: AnonValue
  var result: String
}

object LROOperation {
  @scala.inline
  def apply(
    done: Boolean,
    error: GoogleError,
    metadata: AnonValue,
    name: String,
    response: AnonValue,
    result: String
  ): LROOperation = {
    val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LROOperation]
  }
}

