package typings.edtrIoMathquill.mod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MQ extends MathField {
  
  var L: Double = js.native
  
  var R: Double = js.native
  
  def el(): HTMLElement = js.native
  
  def latex(): String = js.native
  def latex(latex: String): MQ = js.native
  
  def reflow(): MQ = js.native
  
  def revert(): MQ = js.native
}
