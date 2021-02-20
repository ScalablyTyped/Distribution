package typings.fridaGum.global

import typings.fridaGum.Int64
import typings.fridaGum.NativePointerValue
import typings.fridaGum.UInt64
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a native pointer value whose size depends on Process#pointerSize.
  */
@JSGlobal("NativePointer")
@js.native
class NativePointer protected ()
  extends typings.fridaGum.NativePointer {
  /**
    * Creates a new NativePointer from `v`, which is either a string containing the memory address in decimal,
    * or hexadecimal if prefixed with “0x”, or a number. You may use the ptr(v) short-hand for brevity.
    */
  def this(v: String) = this()
  def this(v: Double) = this()
  def this(v: Int64) = this()
  def this(v: NativePointerValue) = this()
  def this(v: UInt64) = this()
}
