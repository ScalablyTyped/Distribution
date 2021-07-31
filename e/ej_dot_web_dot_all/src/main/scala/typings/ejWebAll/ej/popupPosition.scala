package typings.ejWebAll.ej

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait popupPosition extends StObject
@JSGlobal("ej.popupPosition")
@js.native
object popupPosition extends StObject {
  
  //Opens the DateTimePicker popup below to the DateTimePicker input box
  @js.native
  sealed trait Bottom
    extends StObject
       with popupPosition
  
  //Opens the DateTimePicker popup above to the DateTimePicker input box
  @js.native
  sealed trait Top
    extends StObject
       with popupPosition
}
