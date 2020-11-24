package typings.gijgo.Types

import typings.gijgo.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Checkbox extends JQuery {
  
  def destroy(): Unit = js.native
  
  //toggle(): Checkbox;
  def state(value: String): String | Checkbox = js.native
}
