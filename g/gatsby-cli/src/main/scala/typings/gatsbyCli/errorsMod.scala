package typings.gatsbyCli

import typings.gatsbyCli.prepareStackTraceMod.ErrorWithCodeFrame
import typings.gatsbyCli.structuredErrorsTypesMod.IStructuredStackFrame
import typings.prettyError.mod.^
import typings.stackTrace.mod.StackFrame
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorsMod {
  
  @JSImport("gatsby-cli/lib/reporter/errors", "createErrorFromString")
  @js.native
  def createErrorFromString(errorStr: js.UndefOr[scala.Nothing], sourceMapFile: String): js.Promise[Error | ErrorWithCodeFrame] = js.native
  @JSImport("gatsby-cli/lib/reporter/errors", "createErrorFromString")
  @js.native
  def createErrorFromString(errorStr: String, sourceMapFile: String): js.Promise[Error | ErrorWithCodeFrame] = js.native
  
  @JSImport("gatsby-cli/lib/reporter/errors", "getErrorFormatter")
  @js.native
  def getErrorFormatter(): ^ = js.native
  
  @JSImport("gatsby-cli/lib/reporter/errors", "sanitizeStructuredStackTrace")
  @js.native
  def sanitizeStructuredStackTrace(stack: js.Array[StackFrame]): js.Array[IStructuredStackFrame] = js.native
}
