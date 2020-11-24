package typings.firebaseDatabase

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/database/dist/src/core/RepoInfo", JSImport.Namespace)
@js.native
object repoInfoMod extends js.Object {
  
  @js.native
  class RepoInfo protected () extends js.Object {
    /**
      * @param host Hostname portion of the url for the repo
      * @param secure Whether or not this repo is accessed over ssl
      * @param namespace The namespace represented by the repo
      * @param webSocketOnly Whether to prefer websockets over all other transports (used by Nest).
      * @param nodeAdmin Whether this instance uses Admin SDK credentials
      * @param persistenceKey Override the default session persistence storage key
      */
    def this(host: String, secure: Boolean, namespace: String, webSocketOnly: Boolean) = this()
    def this(host: String, secure: Boolean, namespace: String, webSocketOnly: Boolean, nodeAdmin: Boolean) = this()
    def this(
      host: String,
      secure: Boolean,
      namespace: String,
      webSocketOnly: Boolean,
      nodeAdmin: js.UndefOr[scala.Nothing],
      persistenceKey: String
    ) = this()
    def this(
      host: String,
      secure: Boolean,
      namespace: String,
      webSocketOnly: Boolean,
      nodeAdmin: Boolean,
      persistenceKey: String
    ) = this()
    def this(
      host: String,
      secure: Boolean,
      namespace: String,
      webSocketOnly: Boolean,
      nodeAdmin: js.UndefOr[scala.Nothing],
      persistenceKey: js.UndefOr[scala.Nothing],
      includeNamespaceInQueryParams: Boolean
    ) = this()
    def this(
      host: String,
      secure: Boolean,
      namespace: String,
      webSocketOnly: Boolean,
      nodeAdmin: js.UndefOr[scala.Nothing],
      persistenceKey: String,
      includeNamespaceInQueryParams: Boolean
    ) = this()
    def this(
      host: String,
      secure: Boolean,
      namespace: String,
      webSocketOnly: Boolean,
      nodeAdmin: Boolean,
      persistenceKey: js.UndefOr[scala.Nothing],
      includeNamespaceInQueryParams: Boolean
    ) = this()
    def this(
      host: String,
      secure: Boolean,
      namespace: String,
      webSocketOnly: Boolean,
      nodeAdmin: Boolean,
      persistenceKey: String,
      includeNamespaceInQueryParams: Boolean
    ) = this()
    
    /**
      * Returns the websocket URL for this repo
      * @param {string} type of connection
      * @param {Object} params list
      * @return {string} The URL for this repo
      */
    def connectionURL(`type`: String, params: StringDictionary[String]): String = js.native
    
    var domain: String = js.native
    
    var host: String = js.native
    
    val includeNamespaceInQueryParams: Boolean = js.native
    
    var internalHost: String = js.native
    
    def isCacheableHost(): Boolean = js.native
    
    def isCustomHost(): Boolean = js.native
    
    def isDemoHost(): Boolean = js.native
    
    val namespace: String = js.native
    
    def needsQueryParam(): Boolean = js.native
    
    val nodeAdmin: Boolean = js.native
    
    val persistenceKey: String = js.native
    
    val secure: Boolean = js.native
    
    /** @return {string} */
    def toURLString(): String = js.native
    
    def updateHost(newHost: String): Unit = js.native
    
    val webSocketOnly: Boolean = js.native
  }
}
