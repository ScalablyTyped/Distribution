package typings.eventFrom

import typings.eventFrom.mod.EventFromInput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventFromStrings {
  
  @js.native
  sealed trait key
    extends StObject
       with EventFromInput
  inline def key: key = "key".asInstanceOf[key]
  
  @js.native
  sealed trait mouse
    extends StObject
       with EventFromInput
  inline def mouse: mouse = "mouse".asInstanceOf[mouse]
  
  @js.native
  sealed trait touch
    extends StObject
       with EventFromInput
  inline def touch: touch = "touch".asInstanceOf[touch]
}
