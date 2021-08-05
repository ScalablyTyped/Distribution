package typings.gatsbyCli

import typings.gatsbyCli.prepareStackTraceMod.ErrorWithCodeFrame
import typings.gatsbyCli.structuredErrorsTypesMod.IStructuredStackFrame
import typings.stackTrace.mod.StackFrame
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorsMod {
  
  @JSImport("gatsby-cli/lib/reporter/errors", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createErrorFromString(errorStr: String, sourceMapFile: String): js.Promise[Error | ErrorWithCodeFrame] = (^.asInstanceOf[js.Dynamic].applyDynamic("createErrorFromString")(errorStr.asInstanceOf[js.Any], sourceMapFile.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Error | ErrorWithCodeFrame]]
  inline def createErrorFromString(errorStr: Unit, sourceMapFile: String): js.Promise[Error | ErrorWithCodeFrame] = (^.asInstanceOf[js.Dynamic].applyDynamic("createErrorFromString")(errorStr.asInstanceOf[js.Any], sourceMapFile.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Error | ErrorWithCodeFrame]]
  
  inline def getErrorFormatter(): typings.prettyError.mod.^ = ^.asInstanceOf[js.Dynamic].applyDynamic("getErrorFormatter")().asInstanceOf[typings.prettyError.mod.^]
  
  inline def sanitizeStructuredStackTrace(stack: js.Array[StackFrame]): js.Array[IStructuredStackFrame] = ^.asInstanceOf[js.Dynamic].applyDynamic("sanitizeStructuredStackTrace")(stack.asInstanceOf[js.Any]).asInstanceOf[js.Array[IStructuredStackFrame]]
}
