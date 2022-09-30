package typings.expoImageUtils

import typings.expoImageUtils.imageTypesMod.ImageOptions
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cacheMod {
  
  @JSImport("@expo/image-utils/build/Cache", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def cacheImageAsync(fileName: String, buffer: Buffer, cacheKey: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("cacheImageAsync")(fileName.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], cacheKey.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def clearUnusedCachesAsync(projectRoot: String, `type`: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("clearUnusedCachesAsync")(projectRoot.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def createCacheKey(fileSource: String, properties: js.Array[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("createCacheKey")(fileSource.asInstanceOf[js.Any], properties.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def createCacheKeyWithDirectoryAsync(projectRoot: String, `type`: String, icon: ImageOptions): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("createCacheKeyWithDirectoryAsync")(projectRoot.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], icon.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def ensureCacheDirectory(projectRoot: String, `type`: String, cacheKey: String): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureCacheDirectory")(projectRoot.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], cacheKey.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def getImageFromCacheAsync(fileName: String, cacheKey: String): js.Promise[Null | Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("getImageFromCacheAsync")(fileName.asInstanceOf[js.Any], cacheKey.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Null | Buffer]]
}
