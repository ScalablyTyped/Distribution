package typings.farbtastic.JQueryFarbtastic

import typings.farbtastic.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Farbtastic extends js.Object {
  
  var color: String = js.native
  
  var hsl: js.Array[Double] = js.native
  
  def linkTo(callback: Callback): Farbtastic = js.native
  
  var linked: CallbackFunction | JQuery = js.native
  
  def setColor(color: String): Farbtastic = js.native
  def setColor(color: js.Array[Double]): Farbtastic = js.native
  
  def setHSL(hsl: js.Array[Double]): Farbtastic = js.native
}
