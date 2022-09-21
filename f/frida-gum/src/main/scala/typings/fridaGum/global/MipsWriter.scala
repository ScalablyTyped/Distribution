package typings.fridaGum.global

import typings.fridaGum.MipsWriterOptions
import typings.fridaGum.NativePointerValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Generates machine code for mips.
  */
@JSGlobal("MipsWriter")
@js.native
open class MipsWriter protected ()
  extends StObject
     with typings.fridaGum.MipsWriter {
  /**
    * Creates a new code writer for generating MIPS machine code
    * written directly to memory at `codeAddress`.
    *
    * @param codeAddress Memory address to write generated code to.
    * @param options Options for customizing code generation.
    */
  def this(codeAddress: NativePointerValue) = this()
  def this(codeAddress: NativePointerValue, options: MipsWriterOptions) = this()
}
