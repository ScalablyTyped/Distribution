package typings.gapiDotClientDotPlaymoviespartner.gapiNs.clientNs.playmoviespartnerNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotPlaymoviespartner.Anon_Accesstoken
import typings.gapiDotClientDotPlaymoviespartner.Anon_AccesstokenAccountId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AvailsResource extends js.Object {
  /** Get an Avail given its avail group id and avail id. */
  def get(request: Anon_Accesstoken): Request[Avail]
  /**
    * List Avails owned or managed by the partner.
    *
    * See _Authentication and Authorization rules_ and
    * _List methods rules_ for more information about this method.
    */
  def list(request: Anon_AccesstokenAccountId): Request[ListAvailsResponse]
}

object AvailsResource {
  @scala.inline
  def apply(
    get: Anon_Accesstoken => Request[Avail],
    list: Anon_AccesstokenAccountId => Request[ListAvailsResponse]
  ): AvailsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[AvailsResource]
  }
}

