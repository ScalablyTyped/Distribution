package typings.ethersprojectStrings

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object idnaMod {
  
  @JSImport("@ethersproject/strings/lib/idna", "nameprep")
  @js.native
  def nameprep(value: String): String = js.native
  
  @JSImport("@ethersproject/strings/lib/idna", "_nameprepTableA1")
  @js.native
  def nameprepTableA1(codepoint: Double): Boolean = js.native
  
  @JSImport("@ethersproject/strings/lib/idna", "_nameprepTableB2")
  @js.native
  def nameprepTableB2(codepoint: Double): js.Array[Double] = js.native
  
  @JSImport("@ethersproject/strings/lib/idna", "_nameprepTableC")
  @js.native
  def nameprepTableC(codepoint: Double): Boolean = js.native
}
