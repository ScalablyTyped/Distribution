package typings.fridaGum.global

import typings.fridaGum.NativePointerValue
import typings.fridaGum.X86WriterOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Generates machine code for x86.
  */
@JSGlobal("X86Writer")
@js.native
class X86Writer protected ()
  extends typings.fridaGum.X86Writer {
  /**
    * Creates a new code writer for generating x86 machine code
    * written directly to memory at `codeAddress`.
    *
    * @param codeAddress Memory address to write generated code to.
    * @param options Options for customizing code generation.
    */
  def this(codeAddress: NativePointerValue) = this()
  def this(codeAddress: NativePointerValue, options: X86WriterOptions) = this()
}
