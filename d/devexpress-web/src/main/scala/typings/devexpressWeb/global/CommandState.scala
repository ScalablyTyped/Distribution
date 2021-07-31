package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines the state of a command.
  */
@JSGlobal("CommandState")
@js.native
class CommandState[T] ()
  extends StObject
     with typings.devexpressWeb.CommandState[T] {
  
  /**
    * Specifies a command availability.
    */
  /* CompleteClass */
  var enabled: Boolean = js.native
  
  /**
    * Specifies a command value.
    */
  /* CompleteClass */
  var value: T = js.native
  
  /**
    * Specifies a command visibility.
    */
  /* CompleteClass */
  var visible: Boolean = js.native
}
