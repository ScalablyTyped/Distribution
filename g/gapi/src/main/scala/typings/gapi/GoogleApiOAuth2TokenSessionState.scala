package typings.gapi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleApiOAuth2TokenSessionState extends js.Object {
  var extraQueryParams: AnonAuthuser
}

object GoogleApiOAuth2TokenSessionState {
  @scala.inline
  def apply(extraQueryParams: AnonAuthuser): GoogleApiOAuth2TokenSessionState = {
    val __obj = js.Dynamic.literal(extraQueryParams = extraQueryParams.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GoogleApiOAuth2TokenSessionState]
  }
}

