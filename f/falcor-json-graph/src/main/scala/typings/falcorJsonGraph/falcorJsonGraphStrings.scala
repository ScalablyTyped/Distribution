package typings.falcorJsonGraph

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object falcorJsonGraphStrings {
  
  @scala.inline
  def atom: atom = "atom".asInstanceOf[atom]
  
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  
  @scala.inline
  def reference: reference = "reference".asInstanceOf[reference]
  
  @js.native
  sealed trait atom extends js.Object
  
  @js.native
  sealed trait error extends js.Object
  
  @js.native
  sealed trait reference extends js.Object
}
