package typings.ejWebAll.ej

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait eventType extends StObject
@JSGlobal("ej.eventType")
@js.native
object eventType extends StObject {
  
  @js.native
  sealed trait click
    extends StObject
       with eventType
  
  @js.native
  sealed trait mouseDown
    extends StObject
       with eventType
  
  @js.native
  sealed trait mouseLeave
    extends StObject
       with eventType
  
  @js.native
  sealed trait mouseMove
    extends StObject
       with eventType
  
  @js.native
  sealed trait mouseUp
    extends StObject
       with eventType
}
