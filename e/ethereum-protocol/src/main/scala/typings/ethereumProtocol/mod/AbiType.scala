package typings.ethereumProtocol.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AbiType extends StObject
@JSImport("ethereum-protocol", "AbiType")
@js.native
object AbiType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[AbiType & String] = js.native
  
  @js.native
  sealed trait Constructor
    extends StObject
       with AbiType
  /* "constructor" */ val Constructor: typings.ethereumProtocol.mod.AbiType.Constructor & String = js.native
  
  @js.native
  sealed trait Event
    extends StObject
       with AbiType
  /* "event" */ val Event: typings.ethereumProtocol.mod.AbiType.Event & String = js.native
  
  @js.native
  sealed trait Fallback
    extends StObject
       with AbiType
  /* "fallback" */ val Fallback: typings.ethereumProtocol.mod.AbiType.Fallback & String = js.native
  
  @js.native
  sealed trait Function
    extends StObject
       with AbiType
  /* "function" */ val Function: typings.ethereumProtocol.mod.AbiType.Function & String = js.native
}
