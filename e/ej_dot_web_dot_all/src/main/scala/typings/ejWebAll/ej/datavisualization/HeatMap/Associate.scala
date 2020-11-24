package typings.ejWebAll.ej.datavisualization.HeatMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Associate extends js.Object
@JSGlobal("ej.datavisualization.HeatMap.Associate")
@js.native
object Associate extends js.Object {
  
  //Used to set the associate of tooltip as MouseEnter
  @js.native
  sealed trait MouseEnter extends Associate
  
  //Used to set the associate of tooltip as MouseFollow
  @js.native
  sealed trait MouseFollow extends Associate
  
  //Used to set the associate of tooltip as Target
  @js.native
  sealed trait Target extends Associate
}
