package typings
package gapiDotClientDotGamesLib.gapiNs.clientNs.gamesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoomsResource extends js.Object {
  /** Create a room. For internal use by the Games SDK only. Calling this method directly is unsupported. */
  def create(request: gapiDotClientDotGamesLib.Anon_AltConsistencyTokenFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[Room]
  /** Decline an invitation to join a room. For internal use by the Games SDK only. Calling this method directly is unsupported. */
  def decline(
    request: gapiDotClientDotGamesLib.Anon_AltConsistencyTokenFieldsKeyLanguageOauthtokenPrettyPrintQuotaUser
  ): gapiDotClientLib.gapiNs.clientNs.Request[Room]
  /** Dismiss an invitation to join a room. For internal use by the Games SDK only. Calling this method directly is unsupported. */
  def dismiss(request: gapiDotClientDotGamesLib.Anon_AltConsistencyTokenFieldsKeyOauthtoken): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Get the data for a room. */
  def get(
    request: gapiDotClientDotGamesLib.Anon_AltConsistencyTokenFieldsKeyLanguageOauthtokenPrettyPrintQuotaUser
  ): gapiDotClientLib.gapiNs.clientNs.Request[Room]
  /** Join a room. For internal use by the Games SDK only. Calling this method directly is unsupported. */
  def join(
    request: gapiDotClientDotGamesLib.Anon_AltConsistencyTokenFieldsKeyLanguageOauthtokenPrettyPrintQuotaUser
  ): gapiDotClientLib.gapiNs.clientNs.Request[Room]
  /** Leave a room. For internal use by the Games SDK only. Calling this method directly is unsupported. */
  def leave(
    request: gapiDotClientDotGamesLib.Anon_AltConsistencyTokenFieldsKeyLanguageOauthtokenPrettyPrintQuotaUser
  ): gapiDotClientLib.gapiNs.clientNs.Request[Room]
  /** Returns invitations to join rooms. */
  def list(request: gapiDotClientDotGamesLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[RoomList]
  /** Updates sent by a client reporting the status of peers in a room. For internal use by the Games SDK only. Calling this method directly is unsupported. */
  def reportStatus(
    request: gapiDotClientDotGamesLib.Anon_AltConsistencyTokenFieldsKeyLanguageOauthtokenPrettyPrintQuotaUser
  ): gapiDotClientLib.gapiNs.clientNs.Request[RoomStatus]
}

object RoomsResource {
  @scala.inline
  def apply(
    create: gapiDotClientDotGamesLib.Anon_AltConsistencyTokenFieldsKey => gapiDotClientLib.gapiNs.clientNs.Request[Room],
    decline: gapiDotClientDotGamesLib.Anon_AltConsistencyTokenFieldsKeyLanguageOauthtokenPrettyPrintQuotaUser => gapiDotClientLib.gapiNs.clientNs.Request[Room],
    dismiss: gapiDotClientDotGamesLib.Anon_AltConsistencyTokenFieldsKeyOauthtoken => gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit],
    get: gapiDotClientDotGamesLib.Anon_AltConsistencyTokenFieldsKeyLanguageOauthtokenPrettyPrintQuotaUser => gapiDotClientLib.gapiNs.clientNs.Request[Room],
    join: gapiDotClientDotGamesLib.Anon_AltConsistencyTokenFieldsKeyLanguageOauthtokenPrettyPrintQuotaUser => gapiDotClientLib.gapiNs.clientNs.Request[Room],
    leave: gapiDotClientDotGamesLib.Anon_AltConsistencyTokenFieldsKeyLanguageOauthtokenPrettyPrintQuotaUser => gapiDotClientLib.gapiNs.clientNs.Request[Room],
    list: gapiDotClientDotGamesLib.Anon_Alt => gapiDotClientLib.gapiNs.clientNs.Request[RoomList],
    reportStatus: gapiDotClientDotGamesLib.Anon_AltConsistencyTokenFieldsKeyLanguageOauthtokenPrettyPrintQuotaUser => gapiDotClientLib.gapiNs.clientNs.Request[RoomStatus]
  ): RoomsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), decline = js.Any.fromFunction1(decline), dismiss = js.Any.fromFunction1(dismiss), get = js.Any.fromFunction1(get), join = js.Any.fromFunction1(join), leave = js.Any.fromFunction1(leave), list = js.Any.fromFunction1(list), reportStatus = js.Any.fromFunction1(reportStatus))
  
    __obj.asInstanceOf[RoomsResource]
  }
}

