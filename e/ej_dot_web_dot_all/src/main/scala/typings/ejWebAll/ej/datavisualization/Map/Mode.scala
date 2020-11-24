package typings.ejWebAll.ej.datavisualization.Map

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Mode extends js.Object
@JSGlobal("ej.datavisualization.Map.Mode")
@js.native
object Mode extends js.Object {
  
  //specifies the default mode
  @js.native
  sealed trait Default extends Mode
  
  //specifies the interactive mode
  @js.native
  sealed trait Interactive extends Mode
}
