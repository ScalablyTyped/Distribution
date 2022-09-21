package typings.fridaGum.global

import typings.fridaGum.Arm64WriterOptions
import typings.fridaGum.NativePointerValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Generates machine code for arm64.
  */
@JSGlobal("Arm64Writer")
@js.native
open class Arm64Writer protected ()
  extends StObject
     with typings.fridaGum.Arm64Writer {
  /**
    * Creates a new code writer for generating AArch64 machine code
    * written directly to memory at `codeAddress`.
    *
    * @param codeAddress Memory address to write generated code to.
    * @param options Options for customizing code generation.
    */
  def this(codeAddress: NativePointerValue) = this()
  def this(codeAddress: NativePointerValue, options: Arm64WriterOptions) = this()
}
