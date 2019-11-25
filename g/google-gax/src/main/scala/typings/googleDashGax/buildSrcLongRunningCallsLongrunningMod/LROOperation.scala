package typings.googleDashGax.buildSrcLongRunningCallsLongrunningMod

import typings.googleDashGax.Anon_Value
import typings.googleDashGax.buildSrcGoogleErrorMod.GoogleError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LROOperation extends js.Object {
  var done: Boolean
  var error: GoogleError
  var metadata: Anon_Value
  var name: String
  var response: Anon_Value
  var result: String
}

object LROOperation {
  @scala.inline
  def apply(
    done: Boolean,
    error: GoogleError,
    metadata: Anon_Value,
    name: String,
    response: Anon_Value,
    result: String
  ): LROOperation = {
    val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LROOperation]
  }
}

