package typings.gapiDotYoutube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_OnBehalfOfContentOwner extends js.Object {
  /**
    * HTTP Request Body
    */
  var RequestBody: String
  /**
    * The onBehalfOfContentOwner parameter indicates that the authenticated user is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The actual CMS account that the user authenticates with needs to be linked to the specified YouTube content owner.
    */
  var onBehalfOfContentOwner: String
}

object Anon_OnBehalfOfContentOwner {
  @scala.inline
  def apply(RequestBody: String, onBehalfOfContentOwner: String): Anon_OnBehalfOfContentOwner = {
    val __obj = js.Dynamic.literal(RequestBody = RequestBody, onBehalfOfContentOwner = onBehalfOfContentOwner)
  
    __obj.asInstanceOf[Anon_OnBehalfOfContentOwner]
  }
}

