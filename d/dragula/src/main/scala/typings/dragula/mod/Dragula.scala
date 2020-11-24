package typings.dragula.mod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dragula extends js.Object {
  
  def apply(): Drake = js.native
  def apply(containers: js.Array[Element]): Drake = js.native
  def apply(containers: js.Array[Element], options: DragulaOptions): Drake = js.native
  def apply(containers: Element, options: DragulaOptions): Drake = js.native
  def apply(options: DragulaOptions): Drake = js.native
}
