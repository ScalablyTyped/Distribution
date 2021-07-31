package typings.ejWebAll.ej

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Textmode extends StObject
@JSGlobal("ej.Textmode")
@js.native
object Textmode extends StObject {
  
  //When FullPath option is selected, the full path of the selected node is shown in the control.
  @js.native
  sealed trait FullPath
    extends StObject
       with Textmode
  
  //When TextMode property is set to none, only selected/checked node's text is presented.
  @js.native
  sealed trait None
    extends StObject
       with Textmode
}
