package typings.fancadeEditor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TerminalType extends StObject
/**
  * The type of a terminal.
  */
@JSGlobal("TerminalType")
@js.native
object TerminalType extends StObject {
  
  @js.native
  sealed trait Con
    extends StObject
       with TerminalType
  
  @js.native
  sealed trait ConPtr
    extends StObject
       with TerminalType
  
  @js.native
  sealed trait Exe
    extends StObject
       with TerminalType
  
  @js.native
  sealed trait Missing
    extends StObject
       with TerminalType
  
  @js.native
  sealed trait Num
    extends StObject
       with TerminalType
  
  @js.native
  sealed trait NumPtr
    extends StObject
       with TerminalType
  
  @js.native
  sealed trait Obj
    extends StObject
       with TerminalType
  
  @js.native
  sealed trait ObjPtr
    extends StObject
       with TerminalType
  
  @js.native
  sealed trait Rot
    extends StObject
       with TerminalType
  
  @js.native
  sealed trait RotPtr
    extends StObject
       with TerminalType
  
  @js.native
  sealed trait Tru
    extends StObject
       with TerminalType
  
  @js.native
  sealed trait TruPtr
    extends StObject
       with TerminalType
  
  @js.native
  sealed trait Vec
    extends StObject
       with TerminalType
  
  @js.native
  sealed trait VecPtr
    extends StObject
       with TerminalType
}
