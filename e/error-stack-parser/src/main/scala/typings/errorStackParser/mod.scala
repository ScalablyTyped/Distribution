package typings.errorStackParser

import typings.stackframe.mod.StackFrameOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("error-stack-parser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("error-stack-parser", "StackFrame")
  @js.native
  open class StackFrame protected ()
    extends typings.stackframe.mod.^ {
    def this(obj: StackFrameOptions) = this()
  }
  
  inline def parse(error: js.Error): js.Array[typings.stackframe.mod.^] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(error.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.stackframe.mod.^]]
}
