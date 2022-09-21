package typings.firebaseTokenGenerator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FirebaseTokenGenerator extends StObject {
  
  /**
    * Creates a token that authenticates a client with arbitrary data "data", and the specified options.
    *
    * @param { any } data JSON data that will be passed to the Firebase Rules API once a client authenticates. Unless the
    *                "admin" flag is set, it must contain a "uid" key, and if it does it must be a string of length
    *                256 or less.
    * @param { TokenOptions } options The developer-supplied options for this token. Supported options are:
    *                a) "expires" -- A timestamp (as a number of seconds since the epoch) denoting a time after which
    *                          this token should no longer be valid.
    *                b) "notBefore" -- A timestamp (as a number of seconds since the epoch) denoting a time before
    *                          which this token should be rejected by the server.
    *                c) "admin" -- Set to true to bypass all security rules (use this for your trusted servers).
    *                d) "debug" -- Set to true to enable debug mode (so you can see the results of Rules API operations)
    *                e) "simulate" -- (internal-only for now) Set to true to neuter all API operations (listens / puts
    *                                 will run security rules but not actually write or return data)
    *                f) "iat" -- (Number) (internal-only, for testing) Set the issued at time for the generated token
    * @return {String} The authentication token
    */
  def createToken(data: Any): String = js.native
  def createToken(data: Any, options: TokenOptions): String = js.native
}
