package typings.freeStyle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("free-style", "Selector")
@js.native
class Selector protected () extends Container[Selector] {
  def this(selector: String, id: String) = this()
  
  var selector: String = js.native
}
