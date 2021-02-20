package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Net extends StObject {
  
  def request(options: String): ClientRequest = js.native
  // Docs: https://electronjs.org/docs/api/net
  /**
    * Creates a `ClientRequest` instance using the provided `options` which are
    * directly forwarded to the `ClientRequest` constructor. The `net.request` method
    * would be used to issue both secure and insecure HTTP requests according to the
    * specified protocol scheme in the `options` object.
    */
  def request(options: ClientRequestConstructorOptions): ClientRequest = js.native
}
