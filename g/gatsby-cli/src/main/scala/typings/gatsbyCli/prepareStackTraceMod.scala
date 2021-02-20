package typings.gatsbyCli

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object prepareStackTraceMod {
  
  @JSImport("gatsby-cli/lib/reporter/prepare-stack-trace", "ErrorWithCodeFrame")
  @js.native
  class ErrorWithCodeFrame protected () extends Error {
    def this(error: Error) = this()
    
    var codeFrame: String = js.native
  }
  
  @JSImport("gatsby-cli/lib/reporter/prepare-stack-trace", "prepareStackTrace")
  @js.native
  def prepareStackTrace(error: Error, source: String): js.Promise[ErrorWithCodeFrame] = js.native
}
