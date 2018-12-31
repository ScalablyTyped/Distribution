package typings
package atFirebaseDatabaseLib.distSrcCoreRepoInfoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/database/dist/src/core/RepoInfo", "RepoInfo")
@js.native
class RepoInfo protected () extends js.Object {
  /**
    * @param {string} host Hostname portion of the url for the repo
    * @param {boolean} secure Whether or not this repo is accessed over ssl
    * @param {string} namespace The namespace represented by the repo
    * @param {boolean} webSocketOnly Whether to prefer websockets over all other transports (used by Nest).
    * @param {string=} persistenceKey Override the default session persistence storage key
    */
  def this(host: java.lang.String, secure: scala.Boolean, namespace: java.lang.String, webSocketOnly: scala.Boolean) = this()
  def this(host: java.lang.String, secure: scala.Boolean, namespace: java.lang.String, webSocketOnly: scala.Boolean, persistenceKey: java.lang.String) = this()
  var domain: java.lang.String = js.native
  var host: java.lang.String = js.native
  var internalHost: java.lang.String = js.native
  var namespace: java.lang.String = js.native
  var persistenceKey: java.lang.String = js.native
  var secure: scala.Boolean = js.native
  var webSocketOnly: scala.Boolean = js.native
  /**
    * Returns the websocket URL for this repo
    * @param {string} type of connection
    * @param {Object} params list
    * @return {string} The URL for this repo
    */
  def connectionURL(`type`: java.lang.String, params: org.scalablytyped.runtime.StringDictionary[java.lang.String]): java.lang.String = js.native
  def isCacheableHost(): scala.Boolean = js.native
  def isCustomHost(): scala.Boolean = js.native
  def isDemoHost(): scala.Boolean = js.native
  def needsQueryParam(): scala.Boolean = js.native
  /** @return {string} */
  def toURLString(): java.lang.String = js.native
  def updateHost(newHost: java.lang.String): scala.Unit = js.native
}

