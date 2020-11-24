package typings.flatpickr.anon

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Element extends js.Object {
  
  var element: typings.std.Element = js.native
  
  var event: String = js.native
  
  def handler(): Unit = js.native
  def handler(e: Event): Unit = js.native
  
  var options: js.UndefOr[Capture] = js.native
}
