package typings.ejWebAll.ej

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ButtonType extends StObject
@JSGlobal("ej.ButtonType")
@js.native
object ButtonType extends StObject {
  
  //Creates button with Built-in button type specified
  @js.native
  sealed trait Button
    extends StObject
       with ButtonType
  
  //Creates button with Built-in reset type specified
  @js.native
  sealed trait Reset
    extends StObject
       with ButtonType
  
  //Creates button with Built-in submit type specified
  @js.native
  sealed trait Submit
    extends StObject
       with ButtonType
}
