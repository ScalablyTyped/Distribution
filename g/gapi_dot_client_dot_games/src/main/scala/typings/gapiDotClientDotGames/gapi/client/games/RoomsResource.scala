package typings.gapiDotClientDotGames.gapi.client.games

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotGames.Anon_Alt
import typings.gapiDotClientDotGames.Anon_AltConsistencyTokenFieldsKey
import typings.gapiDotClientDotGames.Anon_AltConsistencyTokenFieldsKeyLanguageOauthtokenPrettyPrintQuotaUser
import typings.gapiDotClientDotGames.Anon_AltConsistencyTokenFieldsKeyOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoomsResource extends js.Object {
  /** Create a room. For internal use by the Games SDK only. Calling this method directly is unsupported. */
  def create(request: Anon_AltConsistencyTokenFieldsKey): Request[Room]
  /** Decline an invitation to join a room. For internal use by the Games SDK only. Calling this method directly is unsupported. */
  def decline(request: Anon_AltConsistencyTokenFieldsKeyLanguageOauthtokenPrettyPrintQuotaUser): Request[Room]
  /** Dismiss an invitation to join a room. For internal use by the Games SDK only. Calling this method directly is unsupported. */
  def dismiss(request: Anon_AltConsistencyTokenFieldsKeyOauthtoken): Request[Unit]
  /** Get the data for a room. */
  def get(request: Anon_AltConsistencyTokenFieldsKeyLanguageOauthtokenPrettyPrintQuotaUser): Request[Room]
  /** Join a room. For internal use by the Games SDK only. Calling this method directly is unsupported. */
  def join(request: Anon_AltConsistencyTokenFieldsKeyLanguageOauthtokenPrettyPrintQuotaUser): Request[Room]
  /** Leave a room. For internal use by the Games SDK only. Calling this method directly is unsupported. */
  def leave(request: Anon_AltConsistencyTokenFieldsKeyLanguageOauthtokenPrettyPrintQuotaUser): Request[Room]
  /** Returns invitations to join rooms. */
  def list(request: Anon_Alt): Request[RoomList]
  /** Updates sent by a client reporting the status of peers in a room. For internal use by the Games SDK only. Calling this method directly is unsupported. */
  def reportStatus(request: Anon_AltConsistencyTokenFieldsKeyLanguageOauthtokenPrettyPrintQuotaUser): Request[RoomStatus]
}

object RoomsResource {
  @scala.inline
  def apply(
    create: Anon_AltConsistencyTokenFieldsKey => Request[Room],
    decline: Anon_AltConsistencyTokenFieldsKeyLanguageOauthtokenPrettyPrintQuotaUser => Request[Room],
    dismiss: Anon_AltConsistencyTokenFieldsKeyOauthtoken => Request[Unit],
    get: Anon_AltConsistencyTokenFieldsKeyLanguageOauthtokenPrettyPrintQuotaUser => Request[Room],
    join: Anon_AltConsistencyTokenFieldsKeyLanguageOauthtokenPrettyPrintQuotaUser => Request[Room],
    leave: Anon_AltConsistencyTokenFieldsKeyLanguageOauthtokenPrettyPrintQuotaUser => Request[Room],
    list: Anon_Alt => Request[RoomList],
    reportStatus: Anon_AltConsistencyTokenFieldsKeyLanguageOauthtokenPrettyPrintQuotaUser => Request[RoomStatus]
  ): RoomsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), decline = js.Any.fromFunction1(decline), dismiss = js.Any.fromFunction1(dismiss), get = js.Any.fromFunction1(get), join = js.Any.fromFunction1(join), leave = js.Any.fromFunction1(leave), list = js.Any.fromFunction1(list), reportStatus = js.Any.fromFunction1(reportStatus))
  
    __obj.asInstanceOf[RoomsResource]
  }
}

