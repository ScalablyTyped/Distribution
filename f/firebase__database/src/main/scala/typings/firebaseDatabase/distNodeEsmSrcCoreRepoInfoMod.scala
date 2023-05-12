package typings.firebaseDatabase

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodeEsmSrcCoreRepoInfoMod {
  
  @JSImport("@firebase/database/dist/node-esm/src/core/RepoInfo", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/database/dist/node-esm/src/core/RepoInfo", "RepoInfo")
  @js.native
  open class RepoInfo protected () extends StObject {
    /**
      * @param host - Hostname portion of the url for the repo
      * @param secure - Whether or not this repo is accessed over ssl
      * @param namespace - The namespace represented by the repo
      * @param webSocketOnly - Whether to prefer websockets over all other transports (used by Nest).
      * @param nodeAdmin - Whether this instance uses Admin SDK credentials
      * @param persistenceKey - Override the default session persistence storage key
      */
    def this(host: String, secure: Boolean, namespace: String, webSocketOnly: Boolean) = this()
    def this(host: String, secure: Boolean, namespace: String, webSocketOnly: Boolean, nodeAdmin: Boolean) = this()
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
      nodeAdmin: Unit,
      persistenceKey: String
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
    def this(
      host: String,
      secure: Boolean,
      namespace: String,
      webSocketOnly: Boolean,
      nodeAdmin: Boolean,
      persistenceKey: Unit,
      includeNamespaceInQueryParams: Boolean
    ) = this()
    def this(
      host: String,
      secure: Boolean,
      namespace: String,
      webSocketOnly: Boolean,
      nodeAdmin: Unit,
      persistenceKey: String,
      includeNamespaceInQueryParams: Boolean
    ) = this()
    def this(
      host: String,
      secure: Boolean,
      namespace: String,
      webSocketOnly: Boolean,
      nodeAdmin: Unit,
      persistenceKey: Unit,
      includeNamespaceInQueryParams: Boolean
    ) = this()
    def this(
      host: String,
      secure: Boolean,
      namespace: String,
      webSocketOnly: Boolean,
      nodeAdmin: Boolean,
      persistenceKey: String,
      includeNamespaceInQueryParams: Boolean,
      isUsingEmulator: Boolean
    ) = this()
    def this(
      host: String,
      secure: Boolean,
      namespace: String,
      webSocketOnly: Boolean,
      nodeAdmin: Boolean,
      persistenceKey: String,
      includeNamespaceInQueryParams: Unit,
      isUsingEmulator: Boolean
    ) = this()
    def this(
      host: String,
      secure: Boolean,
      namespace: String,
      webSocketOnly: Boolean,
      nodeAdmin: Boolean,
      persistenceKey: Unit,
      includeNamespaceInQueryParams: Boolean,
      isUsingEmulator: Boolean
    ) = this()
    def this(
      host: String,
      secure: Boolean,
      namespace: String,
      webSocketOnly: Boolean,
      nodeAdmin: Boolean,
      persistenceKey: Unit,
      includeNamespaceInQueryParams: Unit,
      isUsingEmulator: Boolean
    ) = this()
    def this(
      host: String,
      secure: Boolean,
      namespace: String,
      webSocketOnly: Boolean,
      nodeAdmin: Unit,
      persistenceKey: String,
      includeNamespaceInQueryParams: Boolean,
      isUsingEmulator: Boolean
    ) = this()
    def this(
      host: String,
      secure: Boolean,
      namespace: String,
      webSocketOnly: Boolean,
      nodeAdmin: Unit,
      persistenceKey: String,
      includeNamespaceInQueryParams: Unit,
      isUsingEmulator: Boolean
    ) = this()
    def this(
      host: String,
      secure: Boolean,
      namespace: String,
      webSocketOnly: Boolean,
      nodeAdmin: Unit,
      persistenceKey: Unit,
      includeNamespaceInQueryParams: Boolean,
      isUsingEmulator: Boolean
    ) = this()
    def this(
      host: String,
      secure: Boolean,
      namespace: String,
      webSocketOnly: Boolean,
      nodeAdmin: Unit,
      persistenceKey: Unit,
      includeNamespaceInQueryParams: Unit,
      isUsingEmulator: Boolean
    ) = this()
    
    /* private */ var _domain: Any = js.native
    
    /* private */ var _host: Any = js.native
    
    def host: String = js.native
    def host_=(newHost: String): Unit = js.native
    
    val includeNamespaceInQueryParams: Boolean = js.native
    
    var internalHost: String = js.native
    
    def isCacheableHost(): Boolean = js.native
    
    def isCustomHost(): Boolean = js.native
    
    val isUsingEmulator: Boolean = js.native
    
    val namespace: String = js.native
    
    val nodeAdmin: Boolean = js.native
    
    val persistenceKey: String = js.native
    
    val secure: Boolean = js.native
    
    def toURLString(): String = js.native
    
    val webSocketOnly: Boolean = js.native
  }
  
  inline def repoInfoConnectionURL(repoInfo: RepoInfo, `type`: String, params: StringDictionary[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("repoInfoConnectionURL")(repoInfo.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[String]
}
