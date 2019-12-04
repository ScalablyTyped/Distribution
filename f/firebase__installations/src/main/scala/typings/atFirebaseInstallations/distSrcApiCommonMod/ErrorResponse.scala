package typings.atFirebaseInstallations.distSrcApiCommonMod

import typings.atFirebaseInstallations.Anon_Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorResponse extends js.Object {
  var error: Anon_Code
}

object ErrorResponse {
  @scala.inline
  def apply(error: Anon_Code): ErrorResponse = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ErrorResponse]
  }
}

