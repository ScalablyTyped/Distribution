package typings.gapiDotClientDotBooks.gapi.client.books

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotBooks.Anon_Action
import typings.gapiDotClientDotBooks.Anon_AltContentVersionFieldsKeyOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadingpositionsResource extends js.Object {
  /** Retrieves my reading position information for a volume. */
  def get(request: Anon_AltContentVersionFieldsKeyOauthtoken): Request[ReadingPosition]
  /** Sets my reading position information for a volume. */
  def setPosition(request: Anon_Action): Request[Unit]
}

object ReadingpositionsResource {
  @scala.inline
  def apply(
    get: Anon_AltContentVersionFieldsKeyOauthtoken => Request[ReadingPosition],
    setPosition: Anon_Action => Request[Unit]
  ): ReadingpositionsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), setPosition = js.Any.fromFunction1(setPosition))
  
    __obj.asInstanceOf[ReadingpositionsResource]
  }
}

