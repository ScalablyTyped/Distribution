package typings.fridaGum.global

import typings.fridaGum.NativePointerValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("DebugSymbol")
@js.native
class DebugSymbol ()
  extends typings.fridaGum.DebugSymbol {
  /**
    * Address that this symbol is for.
    */
  /* CompleteClass */
  override var address: typings.fridaGum.NativePointer = js.native
  /**
    * File name owning this symbol, or `null` if unknown.
    */
  /* CompleteClass */
  override var fileName: String | Null = js.native
  /**
    * Line number in `fileName`, or `null` if unknown.
    */
  /* CompleteClass */
  override var lineNumber: Double | Null = js.native
  /**
    * Module name owning this symbol, or `null` if unknown.
    */
  /* CompleteClass */
  override var moduleName: String | Null = js.native
  /**
    * Name of the symbol, or `null` if unknown.
    */
  /* CompleteClass */
  override var name: String | Null = js.native
}

/* static members */
@JSGlobal("DebugSymbol")
@js.native
object DebugSymbol extends js.Object {
  /**
    * Resolves function names matching `glob` and returns their addresses.
    *
    * @param glob Glob matching functions to resolve the addresses of.
    */
  def findFunctionsMatching(glob: String): js.Array[typings.fridaGum.NativePointer] = js.native
  /**
    * Resolves a function name and returns its addresses.
    *
    * @param name Function name to resolve the addresses of.
    */
  def findFunctionsNamed(name: String): js.Array[typings.fridaGum.NativePointer] = js.native
  /**
    * Looks up debug information for `address`.
    *
    * @param address Address to look up details for.
    */
  def fromAddress(address: NativePointerValue): typings.fridaGum.DebugSymbol = js.native
  /**
    * Looks up debug information for `name`.
    *
    * @param name Name to look up details for.
    */
  def fromName(name: String): typings.fridaGum.DebugSymbol = js.native
  /**
    * Resolves a function name and returns its address. Returns the first if
    * more than one function is found. Throws an exception if the name cannot
    * be resolved.
    *
    * @param name Function name to resolve the address of.
    */
  def getFunctionByName(name: String): typings.fridaGum.NativePointer = js.native
}

