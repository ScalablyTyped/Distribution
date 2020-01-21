package typings.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("DebugSymbol")
@js.native
class DebugSymbol () extends js.Object {
  /**
    * Address that this symbol is for.
    */
  var address: NativePointer = js.native
  /**
    * File name owning this symbol, or `null` if unknown.
    */
  var fileName: String | Null = js.native
  /**
    * Line number in `fileName`, or `null` if unknown.
    */
  var lineNumber: Double | Null = js.native
  /**
    * Module name owning this symbol, or `null` if unknown.
    */
  var moduleName: String | Null = js.native
  /**
    * Name of the symbol, or `null` if unknown.
    */
  var name: String | Null = js.native
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
  def findFunctionsMatching(glob: String): js.Array[NativePointer] = js.native
  /**
    * Resolves a function name and returns its addresses.
    *
    * @param name Function name to resolve the addresses of.
    */
  def findFunctionsNamed(name: String): js.Array[NativePointer] = js.native
  /**
    * Looks up debug information for `address`.
    *
    * @param address Address to look up details for.
    */
  def fromAddress(address: NativePointerValue): DebugSymbol = js.native
  /**
    * Looks up debug information for `name`.
    *
    * @param name Name to look up details for.
    */
  def fromName(name: String): DebugSymbol = js.native
  /**
    * Resolves a function name and returns its address. Returns the first if
    * more than one function is found. Throws an exception if the name cannot
    * be resolved.
    *
    * @param name Function name to resolve the address of.
    */
  def getFunctionByName(name: String): NativePointer = js.native
}

