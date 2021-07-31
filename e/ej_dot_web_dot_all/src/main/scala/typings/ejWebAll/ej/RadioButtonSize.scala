package typings.ejWebAll.ej

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RadioButtonSize extends StObject
@JSGlobal("ej.RadioButtonSize")
@js.native
object RadioButtonSize extends StObject {
  
  //Shows medium size radio button
  @js.native
  sealed trait Medium
    extends StObject
       with RadioButtonSize
  
  //Shows small size radio button
  @js.native
  sealed trait Small
    extends StObject
       with RadioButtonSize
}
