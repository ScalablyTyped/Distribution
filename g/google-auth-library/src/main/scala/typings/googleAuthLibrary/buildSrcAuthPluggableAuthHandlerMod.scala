package typings.googleAuthLibrary

import typings.googleAuthLibrary.buildSrcAuthExecutableResponseMod.ExecutableResponse
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcAuthPluggableAuthHandlerMod {
  
  @JSImport("google-auth-library/build/src/auth/pluggable-auth-handler", "PluggableAuthHandler")
  @js.native
  open class PluggableAuthHandler protected () extends StObject {
    /**
      * Instantiates a PluggableAuthHandler instance using the provided
      * PluggableAuthHandlerOptions object.
      */
    def this(options: PluggableAuthHandlerOptions) = this()
    
    /* private */ val commandComponents: Any = js.native
    
    /* private */ val outputFile: Any = js.native
    
    /**
      * Checks user provided output file for response from previous run of
      * executable and return the response if it exists, is formatted correctly, and is not expired.
      */
    def retrieveCachedResponse(): js.Promise[js.UndefOr[ExecutableResponse]] = js.native
    
    /**
      * Calls user provided executable to get a 3rd party subject token and
      * returns the response.
      * @param envMap a Map of additional Environment Variables required for
      *   the executable.
      * @return A promise that resolves with the executable response.
      */
    def retrieveResponseFromExecutable(envMap: Map[String, String]): js.Promise[ExecutableResponse] = js.native
    
    /* private */ val timeoutMillis: Any = js.native
  }
  /* static members */
  object PluggableAuthHandler {
    
    @JSImport("google-auth-library/build/src/auth/pluggable-auth-handler", "PluggableAuthHandler")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Parses given command string into component array, splitting on spaces unless
      * spaces are between quotation marks.
      */
    @JSImport("google-auth-library/build/src/auth/pluggable-auth-handler", "PluggableAuthHandler.parseCommand")
    @js.native
    def parseCommand: Any = js.native
    inline def parseCommand_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parseCommand")(x.asInstanceOf[js.Any])
  }
  
  trait PluggableAuthHandlerOptions extends StObject {
    
    /**
      * The command used to retrieve the third party token.
      */
    var command: String
    
    /**
      * The path to file to check for cached executable response.
      */
    var outputFile: js.UndefOr[String] = js.undefined
    
    /**
      * The timeout in milliseconds for running executable,
      * set to default if none provided.
      */
    var timeoutMillis: Double
  }
  object PluggableAuthHandlerOptions {
    
    inline def apply(command: String, timeoutMillis: Double): PluggableAuthHandlerOptions = {
      val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], timeoutMillis = timeoutMillis.asInstanceOf[js.Any])
      __obj.asInstanceOf[PluggableAuthHandlerOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PluggableAuthHandlerOptions] (val x: Self) extends AnyVal {
      
      inline def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
      
      inline def setOutputFile(value: String): Self = StObject.set(x, "outputFile", value.asInstanceOf[js.Any])
      
      inline def setOutputFileUndefined: Self = StObject.set(x, "outputFile", js.undefined)
      
      inline def setTimeoutMillis(value: Double): Self = StObject.set(x, "timeoutMillis", value.asInstanceOf[js.Any])
    }
  }
}
