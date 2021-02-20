package typings.gatsbyCoreUtils

import typings.configstore.mod.^
import typings.gatsbyCoreUtils.serviceLockMod.UnlockFn
import typings.gatsbyCoreUtils.siteMetadataMod.ISiteMetadata
import typings.node.NodeRequire
import typings.node.cryptoMod.BinaryLike
import typings.node.urlMod.URL_
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("gatsby-core-utils", "cpuCoreCount")
  @js.native
  def cpuCoreCount(): Double = js.native
  @JSImport("gatsby-core-utils", "cpuCoreCount")
  @js.native
  def cpuCoreCount(ignoreEnvVar: Boolean): Double = js.native
  
  @JSImport("gatsby-core-utils", "createContentDigest")
  @js.native
  def createContentDigest(input: String): String = js.native
  @JSImport("gatsby-core-utils", "createContentDigest")
  @js.native
  def createContentDigest(input: js.Any): String = js.native
  @JSImport("gatsby-core-utils", "createContentDigest")
  @js.native
  def createContentDigest(input: BinaryLike): String = js.native
  
  @JSImport("gatsby-core-utils", "createRequireFromPath")
  @js.native
  def createRequireFromPath(path: String): NodeRequire = js.native
  @JSImport("gatsby-core-utils", "createRequireFromPath")
  @js.native
  def createRequireFromPath(path: URL_): NodeRequire = js.native
  
  @JSImport("gatsby-core-utils", "createServiceLock")
  @js.native
  def createServiceLock(programPath: String, serviceName: String, content: Record[String, _]): js.Promise[UnlockFn | Null] = js.native
  
  @JSImport("gatsby-core-utils", "getCIName")
  @js.native
  def getCIName(): String | Null = js.native
  
  @JSImport("gatsby-core-utils", "getConfigStore")
  @js.native
  def getConfigStore(): ^ = js.native
  
  @JSImport("gatsby-core-utils", "getGatsbyVersion")
  @js.native
  def getGatsbyVersion(): String = js.native
  
  @JSImport("gatsby-core-utils", "getService")
  @js.native
  def getService[T](programPath: String, serviceName: String): js.Promise[T | Null] = js.native
  @JSImport("gatsby-core-utils", "getService")
  @js.native
  def getService[T](programPath: String, serviceName: String, ignoreLockfile: Boolean): js.Promise[T | Null] = js.native
  
  @JSImport("gatsby-core-utils", "getServices")
  @js.native
  def getServices(programPath: String): js.Promise[_] = js.native
  
  @JSImport("gatsby-core-utils", "getSiteMetadata")
  @js.native
  def getSiteMetadata(sitePath: String): js.Promise[ISiteMetadata | Null] = js.native
  
  @JSImport("gatsby-core-utils", "getTermProgram")
  @js.native
  def getTermProgram(): js.UndefOr[String] = js.native
  
  @JSImport("gatsby-core-utils", "isCI")
  @js.native
  def isCI(): Boolean = js.native
  
  @JSImport("gatsby-core-utils", "isNodeInternalModulePath")
  @js.native
  def isNodeInternalModulePath(fileName: String): Boolean = js.native
  
  @JSImport("gatsby-core-utils", "joinPath")
  @js.native
  def joinPath(paths: String*): String = js.native
  
  @JSImport("gatsby-core-utils", "slash")
  @js.native
  def slash(path: String): String = js.native
  
  @JSImport("gatsby-core-utils", "updateSiteMetadata")
  @js.native
  def updateSiteMetadata(metadata: ISiteMetadata): js.Promise[Unit] = js.native
  @JSImport("gatsby-core-utils", "updateSiteMetadata")
  @js.native
  def updateSiteMetadata(metadata: ISiteMetadata, merge: Boolean): js.Promise[Unit] = js.native
  
  @JSImport("gatsby-core-utils", "urlResolve")
  @js.native
  def urlResolve(segments: String*): String = js.native
}
