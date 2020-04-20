package typings.gapiClientBooks.gapi.client.books

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientBooks.AnonAction
import typings.gapiClientBooks.AnonAltContentVersion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadingpositionsResource extends js.Object {
  /** Retrieves my reading position information for a volume. */
  def get(request: AnonAltContentVersion): Request_[ReadingPosition]
  /** Sets my reading position information for a volume. */
  def setPosition(request: AnonAction): Request_[Unit]
}

object ReadingpositionsResource {
  @scala.inline
  def apply(get: AnonAltContentVersion => Request_[ReadingPosition], setPosition: AnonAction => Request_[Unit]): ReadingpositionsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), setPosition = js.Any.fromFunction1(setPosition))
    __obj.asInstanceOf[ReadingpositionsResource]
  }
}

