package typings.gapi

import typings.gapi.anon.Authuser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleApiOAuth2TokenSessionState extends js.Object {
  var extraQueryParams: Authuser
}

object GoogleApiOAuth2TokenSessionState {
  @scala.inline
  def apply(extraQueryParams: Authuser): GoogleApiOAuth2TokenSessionState = {
    val __obj = js.Dynamic.literal(extraQueryParams = extraQueryParams.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleApiOAuth2TokenSessionState]
  }
}

