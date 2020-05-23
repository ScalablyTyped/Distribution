package typings.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DebugSymbol extends js.Object {
  /**
    * Address that this symbol is for.
    */
  var address: NativePointer
  /**
    * File name owning this symbol, or `null` if unknown.
    */
  var fileName: String | Null
  /**
    * Line number in `fileName`, or `null` if unknown.
    */
  var lineNumber: Double | Null
  /**
    * Module name owning this symbol, or `null` if unknown.
    */
  var moduleName: String | Null
  /**
    * Name of the symbol, or `null` if unknown.
    */
  var name: String | Null
}

object DebugSymbol {
  @scala.inline
  def apply(
    address: NativePointer,
    fileName: String = null,
    lineNumber: Double = null.asInstanceOf[Double],
    moduleName: String = null,
    name: String = null
  ): DebugSymbol = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], lineNumber = lineNumber.asInstanceOf[js.Any], moduleName = moduleName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DebugSymbol]
  }
}

