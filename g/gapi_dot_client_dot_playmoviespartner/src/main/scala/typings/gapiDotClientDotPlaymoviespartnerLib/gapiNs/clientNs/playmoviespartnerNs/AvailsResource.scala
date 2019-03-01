package typings
package gapiDotClientDotPlaymoviespartnerLib.gapiNs.clientNs.playmoviespartnerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AvailsResource extends js.Object {
  /** Get an Avail given its avail group id and avail id. */
  def get(request: gapiDotClientDotPlaymoviespartnerLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[Avail]
  /**
    * List Avails owned or managed by the partner.
    *
    * See _Authentication and Authorization rules_ and
    * _List methods rules_ for more information about this method.
    */
  def list(request: gapiDotClientDotPlaymoviespartnerLib.Anon_AccesstokenAccountId): gapiDotClientLib.gapiNs.clientNs.Request[ListAvailsResponse]
}

object AvailsResource {
  @scala.inline
  def apply(
    get: js.Function1[
      gapiDotClientDotPlaymoviespartnerLib.Anon_Accesstoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[Avail]
    ],
    list: js.Function1[
      gapiDotClientDotPlaymoviespartnerLib.Anon_AccesstokenAccountId, 
      gapiDotClientLib.gapiNs.clientNs.Request[ListAvailsResponse]
    ]
  ): AvailsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("list")(list)
    __obj.asInstanceOf[AvailsResource]
  }
}

