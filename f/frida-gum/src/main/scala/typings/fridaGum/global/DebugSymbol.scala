package typings.fridaGum.global

import typings.fridaGum.NativePointerValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("DebugSymbol")
@js.native
class DebugSymbol ()
  extends typings.fridaGum.DebugSymbol
object DebugSymbol {
  
  /**
    * Resolves function names matching `glob` and returns their addresses.
    *
    * @param glob Glob matching functions to resolve the addresses of.
    */
  /* static member */
  @JSGlobal("DebugSymbol.findFunctionsMatching")
  @js.native
  def findFunctionsMatching(glob: String): js.Array[typings.fridaGum.NativePointer] = js.native
  
  /**
    * Resolves a function name and returns its addresses.
    *
    * @param name Function name to resolve the addresses of.
    */
  /* static member */
  @JSGlobal("DebugSymbol.findFunctionsNamed")
  @js.native
  def findFunctionsNamed(name: String): js.Array[typings.fridaGum.NativePointer] = js.native
  
  /**
    * Looks up debug information for `address`.
    *
    * @param address Address to look up details for.
    */
  /* static member */
  @JSGlobal("DebugSymbol.fromAddress")
  @js.native
  def fromAddress(address: NativePointerValue): typings.fridaGum.DebugSymbol = js.native
  
  /**
    * Looks up debug information for `name`.
    *
    * @param name Name to look up details for.
    */
  /* static member */
  @JSGlobal("DebugSymbol.fromName")
  @js.native
  def fromName(name: String): typings.fridaGum.DebugSymbol = js.native
  
  /**
    * Resolves a function name and returns its address. Returns the first if
    * more than one function is found. Throws an exception if the name cannot
    * be resolved.
    *
    * @param name Function name to resolve the address of.
    */
  /* static member */
  @JSGlobal("DebugSymbol.getFunctionByName")
  @js.native
  def getFunctionByName(name: String): typings.fridaGum.NativePointer = js.native
  
  /**
    * Loads debug symbols for a specific module.
    *
    * @param path Path of module to load symbols for.
    */
  /* static member */
  @JSGlobal("DebugSymbol.load")
  @js.native
  def load(path: String): Unit = js.native
}
