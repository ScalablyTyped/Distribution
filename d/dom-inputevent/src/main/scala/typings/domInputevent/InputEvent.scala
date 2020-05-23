package typings.domInputevent

import typings.std.UIEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line no-empty-interface
@js.native
trait InputEvent extends UIEvent {
  val data: String | Null = js.native
  val isComposing: Boolean = js.native
}

