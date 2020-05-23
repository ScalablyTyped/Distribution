package typings.gapiClientBooks.gapi.client.books

import typings.gapiClient.gapi.client.Request
import typings.gapiClientBooks.anon.Action
import typings.gapiClientBooks.anon.AltContentVersion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadingpositionsResource extends js.Object {
  /** Retrieves my reading position information for a volume. */
  def get(request: AltContentVersion): Request[ReadingPosition]
  /** Sets my reading position information for a volume. */
  def setPosition(request: Action): Request[Unit]
}

object ReadingpositionsResource {
  @scala.inline
  def apply(get: AltContentVersion => Request[ReadingPosition], setPosition: Action => Request[Unit]): ReadingpositionsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), setPosition = js.Any.fromFunction1(setPosition))
    __obj.asInstanceOf[ReadingpositionsResource]
  }
}

