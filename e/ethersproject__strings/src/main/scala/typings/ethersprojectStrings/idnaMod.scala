package typings.ethersprojectStrings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ethersproject/strings/lib/idna", JSImport.Namespace)
@js.native
object idnaMod extends js.Object {
  
  def nameprep(value: String): String = js.native
  
  @JSName("_nameprepTableA1")
  def nameprepTableA1(codepoint: Double): Boolean = js.native
  
  @JSName("_nameprepTableB2")
  def nameprepTableB2(codepoint: Double): js.Array[Double] = js.native
  
  @JSName("_nameprepTableC")
  def nameprepTableC(codepoint: Double): Boolean = js.native
}
