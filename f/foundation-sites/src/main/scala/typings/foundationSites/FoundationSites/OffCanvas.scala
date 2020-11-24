package typings.foundationSites.FoundationSites

import typings.foundationSites.JQuery
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://get.foundation/sites/docs/offcanvas.html#javascript-reference
@js.native
trait OffCanvas extends js.Object {
  
  def close(): Unit = js.native
  def close(cb: js.Function): Unit = js.native
  
  def destroy(): Unit = js.native
  
  def open(event: Event, trigger: JQuery): Unit = js.native
  
  def reveal(isRevealed: Boolean): Unit = js.native
  
  def toggle(event: Event, trigger: JQuery): Unit = js.native
}
