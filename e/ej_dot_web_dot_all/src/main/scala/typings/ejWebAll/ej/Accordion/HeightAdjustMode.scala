package typings.ejWebAll.ej.Accordion

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait HeightAdjustMode extends js.Object
@JSGlobal("ej.Accordion.HeightAdjustMode")
@js.native
object HeightAdjustMode extends js.Object {
  
  ///Height set to the largest content in the panel
  @js.native
  sealed trait Auto extends HeightAdjustMode
  
  ///Height fit to the content in the panel
  @js.native
  sealed trait Content extends HeightAdjustMode
  
  ///Height filled to the content of the panel
  @js.native
  sealed trait Fill extends HeightAdjustMode
}
