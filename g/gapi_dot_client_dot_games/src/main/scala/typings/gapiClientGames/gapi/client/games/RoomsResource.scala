package typings.gapiClientGames.gapi.client.games

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientGames.AnonAlt
import typings.gapiClientGames.AnonAltConsistencyTokenFieldsKey
import typings.gapiClientGames.AnonAltConsistencyTokenFieldsKeyLanguageOauthtokenPrettyPrintQuotaUser
import typings.gapiClientGames.AnonAltConsistencyTokenFieldsKeyOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoomsResource extends js.Object {
  /** Create a room. For internal use by the Games SDK only. Calling this method directly is unsupported. */
  def create(request: AnonAltConsistencyTokenFieldsKey): Request_[Room]
  /** Decline an invitation to join a room. For internal use by the Games SDK only. Calling this method directly is unsupported. */
  def decline(request: AnonAltConsistencyTokenFieldsKeyLanguageOauthtokenPrettyPrintQuotaUser): Request_[Room]
  /** Dismiss an invitation to join a room. For internal use by the Games SDK only. Calling this method directly is unsupported. */
  def dismiss(request: AnonAltConsistencyTokenFieldsKeyOauthtoken): Request_[Unit]
  /** Get the data for a room. */
  def get(request: AnonAltConsistencyTokenFieldsKeyLanguageOauthtokenPrettyPrintQuotaUser): Request_[Room]
  /** Join a room. For internal use by the Games SDK only. Calling this method directly is unsupported. */
  def join(request: AnonAltConsistencyTokenFieldsKeyLanguageOauthtokenPrettyPrintQuotaUser): Request_[Room]
  /** Leave a room. For internal use by the Games SDK only. Calling this method directly is unsupported. */
  def leave(request: AnonAltConsistencyTokenFieldsKeyLanguageOauthtokenPrettyPrintQuotaUser): Request_[Room]
  /** Returns invitations to join rooms. */
  def list(request: AnonAlt): Request_[RoomList]
  /** Updates sent by a client reporting the status of peers in a room. For internal use by the Games SDK only. Calling this method directly is unsupported. */
  def reportStatus(request: AnonAltConsistencyTokenFieldsKeyLanguageOauthtokenPrettyPrintQuotaUser): Request_[RoomStatus]
}

object RoomsResource {
  @scala.inline
  def apply(
    create: AnonAltConsistencyTokenFieldsKey => Request_[Room],
    decline: AnonAltConsistencyTokenFieldsKeyLanguageOauthtokenPrettyPrintQuotaUser => Request_[Room],
    dismiss: AnonAltConsistencyTokenFieldsKeyOauthtoken => Request_[Unit],
    get: AnonAltConsistencyTokenFieldsKeyLanguageOauthtokenPrettyPrintQuotaUser => Request_[Room],
    join: AnonAltConsistencyTokenFieldsKeyLanguageOauthtokenPrettyPrintQuotaUser => Request_[Room],
    leave: AnonAltConsistencyTokenFieldsKeyLanguageOauthtokenPrettyPrintQuotaUser => Request_[Room],
    list: AnonAlt => Request_[RoomList],
    reportStatus: AnonAltConsistencyTokenFieldsKeyLanguageOauthtokenPrettyPrintQuotaUser => Request_[RoomStatus]
  ): RoomsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), decline = js.Any.fromFunction1(decline), dismiss = js.Any.fromFunction1(dismiss), get = js.Any.fromFunction1(get), join = js.Any.fromFunction1(join), leave = js.Any.fromFunction1(leave), list = js.Any.fromFunction1(list), reportStatus = js.Any.fromFunction1(reportStatus))
  
    __obj.asInstanceOf[RoomsResource]
  }
}

