package typings
package gapiDotClientDotBooksLib.gapiNs.clientNs.booksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadingpositionsResource extends js.Object {
  /** Retrieves my reading position information for a volume. */
  def get(request: gapiDotClientDotBooksLib.Anon_AltContentVersionFieldsKeyOauthtoken): gapiDotClientLib.gapiNs.clientNs.Request[ReadingPosition]
  /** Sets my reading position information for a volume. */
  def setPosition(request: gapiDotClientDotBooksLib.Anon_Action): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
}

object ReadingpositionsResource {
  @scala.inline
  def apply(
    get: gapiDotClientDotBooksLib.Anon_AltContentVersionFieldsKeyOauthtoken => gapiDotClientLib.gapiNs.clientNs.Request[ReadingPosition],
    setPosition: gapiDotClientDotBooksLib.Anon_Action => gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  ): ReadingpositionsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), setPosition = js.Any.fromFunction1(setPosition))
  
    __obj.asInstanceOf[ReadingpositionsResource]
  }
}

