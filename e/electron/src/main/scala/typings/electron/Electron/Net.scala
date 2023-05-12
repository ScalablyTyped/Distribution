package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Net extends StObject {
  
  // Docs: https://electronjs.org/docs/api/net
  /**
    * Whether there is currently internet connection.
    *
    * A return value of `false` is a pretty strong indicator that the user won't be
    * able to connect to remote sites. However, a return value of `true` is
    * inconclusive; even if some link is up, it is uncertain whether a particular
    * connection attempt to a particular remote site will be successful.
    */
  def isOnline(): Boolean = js.native
  
  /**
    * A `boolean` property. Whether there is currently internet connection.
    *
    * A return value of `false` is a pretty strong indicator that the user won't be
    * able to connect to remote sites. However, a return value of `true` is
    * inconclusive; even if some link is up, it is uncertain whether a particular
    * connection attempt to a particular remote site will be successful.
    *
    */
  val online: Boolean = js.native
  
  def request(options: String): ClientRequest = js.native
  /**
    * Creates a `ClientRequest` instance using the provided `options` which are
    * directly forwarded to the `ClientRequest` constructor. The `net.request` method
    * would be used to issue both secure and insecure HTTP requests according to the
    * specified protocol scheme in the `options` object.
    */
  def request(options: ClientRequestConstructorOptions): ClientRequest = js.native
  
  /**
    * Resolves with the resolved IP addresses for the `host`.
    *
    * This method will resolve hosts from the default session. To resolve a host from
    * another session, use ses.resolveHost().
    */
  def resolveHost(host: String): js.Promise[ResolvedHost] = js.native
  def resolveHost(host: String, options: ResolveHostOptions): js.Promise[ResolvedHost] = js.native
}
