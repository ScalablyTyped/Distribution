package typings.ejWebAll.ej

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GroupButtonMode extends StObject
@JSGlobal("ej.GroupButtonMode")
@js.native
object GroupButtonMode extends StObject {
  
  //Sets the GroupButton to work as checkbox mode
  @js.native
  sealed trait CheckBox extends GroupButtonMode
  
  //Sets the RadioButton to work as radio button mode
  @js.native
  sealed trait RadioButton extends GroupButtonMode
}
