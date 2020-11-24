package typings.gatsbyCoreUtils

import typings.configstore.mod.^
import typings.gatsbyCoreUtils.serviceLockMod.UnlockFn
import typings.gatsbyCoreUtils.siteMetadataMod.ISiteMetadata
import typings.node.cryptoMod.BinaryLike
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gatsby-core-utils", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def cpuCoreCount(): Double = js.native
  def cpuCoreCount(ignoreEnvVar: Boolean): Double = js.native
  
  def createContentDigest(input: String): String = js.native
  def createContentDigest(input: js.Any): String = js.native
  def createContentDigest(input: BinaryLike): String = js.native
  
  val createRequireFromPath: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Module.createRequire */ js.Any = js.native
  
  def createServiceLock(programPath: String, serviceName: String, content: Record[String, _]): js.Promise[UnlockFn | Null] = js.native
  
  def getCIName(): String | Null = js.native
  
  def getConfigStore(): ^ = js.native
  
  def getGatsbyVersion(): String = js.native
  
  def getService[T](programPath: String, serviceName: String): js.Promise[T | Null] = js.native
  def getService[T](programPath: String, serviceName: String, ignoreLockfile: Boolean): js.Promise[T | Null] = js.native
  
  def getServices(programPath: String): js.Promise[_] = js.native
  
  def getSiteMetadata(sitePath: String): js.Promise[ISiteMetadata | Null] = js.native
  
  def getTermProgram(): js.UndefOr[String] = js.native
  
  def isCI(): Boolean = js.native
  
  def isNodeInternalModulePath(fileName: String): Boolean = js.native
  
  def joinPath(paths: String*): String = js.native
  
  def slash(path: String): String = js.native
  
  def updateSiteMetadata(metadata: ISiteMetadata): js.Promise[Unit] = js.native
  def updateSiteMetadata(metadata: ISiteMetadata, merge: Boolean): js.Promise[Unit] = js.native
  
  def urlResolve(segments: String*): String = js.native
}
