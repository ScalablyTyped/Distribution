package typings
package gapiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleApiOAuth2TokenSessionState extends js.Object {
  var extraQueryParams: Anon_Authuser
}

object GoogleApiOAuth2TokenSessionState {
  @scala.inline
  def apply(extraQueryParams: Anon_Authuser): GoogleApiOAuth2TokenSessionState = {
    val __obj = js.Dynamic.literal(extraQueryParams = extraQueryParams)
  
    __obj.asInstanceOf[GoogleApiOAuth2TokenSessionState]
  }
}

