package typings.gatsbyCoreUtils

import typings.gatsbyCoreUtils.serviceLockMod.UnlockFn
import typings.gatsbyCoreUtils.siteMetadataMod.ISiteMetadata
import typings.node.NodeRequire
import typings.node.cryptoMod.BinaryLike
import typings.node.urlMod.URL_
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("gatsby-core-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def cpuCoreCount(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("cpuCoreCount")().asInstanceOf[Double]
  @scala.inline
  def cpuCoreCount(ignoreEnvVar: Boolean): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("cpuCoreCount")(ignoreEnvVar.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def createContentDigest(input: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("createContentDigest")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def createContentDigest(input: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("createContentDigest")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def createContentDigest(input: BinaryLike): String = ^.asInstanceOf[js.Dynamic].applyDynamic("createContentDigest")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def createRequireFromPath(path: String): NodeRequire = ^.asInstanceOf[js.Dynamic].applyDynamic("createRequireFromPath")(path.asInstanceOf[js.Any]).asInstanceOf[NodeRequire]
  @scala.inline
  def createRequireFromPath(path: URL_): NodeRequire = ^.asInstanceOf[js.Dynamic].applyDynamic("createRequireFromPath")(path.asInstanceOf[js.Any]).asInstanceOf[NodeRequire]
  
  @scala.inline
  def createServiceLock(programPath: String, serviceName: String, content: Record[String, js.Any]): js.Promise[UnlockFn | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("createServiceLock")(programPath.asInstanceOf[js.Any], serviceName.asInstanceOf[js.Any], content.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UnlockFn | Null]]
  
  @scala.inline
  def getCIName(): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getCIName")().asInstanceOf[String | Null]
  
  @scala.inline
  def getConfigStore(): typings.configstore.mod.^ = ^.asInstanceOf[js.Dynamic].applyDynamic("getConfigStore")().asInstanceOf[typings.configstore.mod.^]
  
  @scala.inline
  def getGatsbyVersion(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getGatsbyVersion")().asInstanceOf[String]
  
  @scala.inline
  def getService[T](programPath: String, serviceName: String): js.Promise[T | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("getService")(programPath.asInstanceOf[js.Any], serviceName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T | Null]]
  @scala.inline
  def getService[T](programPath: String, serviceName: String, ignoreLockfile: Boolean): js.Promise[T | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("getService")(programPath.asInstanceOf[js.Any], serviceName.asInstanceOf[js.Any], ignoreLockfile.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T | Null]]
  
  @scala.inline
  def getServices(programPath: String): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getServices")(programPath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Any]]
  
  @scala.inline
  def getSiteMetadata(sitePath: String): js.Promise[ISiteMetadata | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSiteMetadata")(sitePath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ISiteMetadata | Null]]
  
  @scala.inline
  def getTermProgram(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTermProgram")().asInstanceOf[js.UndefOr[String]]
  
  @scala.inline
  def isCI(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCI")().asInstanceOf[Boolean]
  
  @scala.inline
  def isNodeInternalModulePath(fileName: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNodeInternalModulePath")(fileName.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def joinPath(paths: String*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("joinPath")(paths.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def slash(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("slash")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def updateSiteMetadata(metadata: ISiteMetadata): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("updateSiteMetadata")(metadata.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def updateSiteMetadata(metadata: ISiteMetadata, merge: Boolean): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateSiteMetadata")(metadata.asInstanceOf[js.Any], merge.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  @scala.inline
  def urlResolve(segments: String*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("urlResolve")(segments.asInstanceOf[js.Any]).asInstanceOf[String]
}
