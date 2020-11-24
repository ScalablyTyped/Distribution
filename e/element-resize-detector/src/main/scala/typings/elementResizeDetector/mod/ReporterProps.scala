package typings.elementResizeDetector.mod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReporterProps extends js.Object {
  
  def error(text: String): Unit = js.native
  
  def log(idOrText: String, textOrId: String): Unit = js.native
  def log(idOrText: String, textOrId: String, element: HTMLElement): Unit = js.native
  
  def warn(text: String): Unit = js.native
  def warn(text: String, element: HTMLElement): Unit = js.native
}
