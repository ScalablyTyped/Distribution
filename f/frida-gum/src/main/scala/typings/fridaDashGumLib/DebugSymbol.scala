package typings
package fridaDashGumLib

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
    * File name owning this symbol.
    */
  var fileName: java.lang.String = js.native
  /**
    * Line number in `fileName`.
    */
  var lineNumber: scala.Double = js.native
  /**
    * Module name owning this symbol.
    */
  var moduleName: java.lang.String = js.native
  /**
    * Name of the symbol.
    */
  var name: java.lang.String = js.native
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
  def findFunctionsMatching(glob: java.lang.String): js.Array[fridaDashGumLib.NativePointer] = js.native
  /**
    * Resolves a function name and returns its addresses.
    *
    * @param name Function name to resolve the addresses of.
    */
  def findFunctionsNamed(name: java.lang.String): js.Array[fridaDashGumLib.NativePointer] = js.native
  /**
    * Looks up debug information for `address`.
    *
    * @param address Address to look up details for.
    */
  def fromAddress(address: fridaDashGumLib.NativePointerValue): fridaDashGumLib.DebugSymbol = js.native
  /**
    * Looks up debug information for `name`.
    *
    * @param name Name to look up details for.
    */
  def fromName(name: java.lang.String): fridaDashGumLib.DebugSymbol = js.native
  /**
    * Resolves a function name and returns its address. Returns the first if
    * more than one function is found. Throws an exception if the name cannot
    * be resolved.
    *
    * @param name Function name to resolve the address of.
    */
  def getFunctionByName(name: java.lang.String): fridaDashGumLib.NativePointer = js.native
}

