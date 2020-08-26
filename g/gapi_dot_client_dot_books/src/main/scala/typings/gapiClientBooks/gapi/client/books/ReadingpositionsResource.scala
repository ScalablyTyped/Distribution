package typings.gapiClientBooks.gapi.client.books

import typings.gapiClient.gapi.client.Request
import typings.gapiClientBooks.anon.Action
import typings.gapiClientBooks.anon.AltContentVersion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReadingpositionsResource extends js.Object {
  /** Retrieves my reading position information for a volume. */
  def get(request: AltContentVersion): Request[ReadingPosition] = js.native
  /** Sets my reading position information for a volume. */
  def setPosition(request: Action): Request[Unit] = js.native
}

object ReadingpositionsResource {
  @scala.inline
  def apply(get: AltContentVersion => Request[ReadingPosition], setPosition: Action => Request[Unit]): ReadingpositionsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), setPosition = js.Any.fromFunction1(setPosition))
    __obj.asInstanceOf[ReadingpositionsResource]
  }
  @scala.inline
  implicit class ReadingpositionsResourceOps[Self <: ReadingpositionsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGet(value: AltContentVersion => Request[ReadingPosition]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setSetPosition(value: Action => Request[Unit]): Self = this.set("setPosition", js.Any.fromFunction1(value))
  }
  
}

