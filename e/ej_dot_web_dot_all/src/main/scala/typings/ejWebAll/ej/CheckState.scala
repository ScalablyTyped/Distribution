package typings.ejWebAll.ej

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CheckState extends StObject
@JSGlobal("ej.CheckState")
@js.native
object CheckState extends StObject {
  
  //string
  @js.native
  sealed trait Check extends CheckState
  
  //string
  @js.native
  sealed trait Indeterminate extends CheckState
  
  //string
  @js.native
  sealed trait Uncheck extends CheckState
}
