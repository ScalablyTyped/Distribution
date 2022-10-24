package typings.expoImageUtils

import typings.expoImageUtils.anon.Background
import typings.expoImageUtils.anon.CacheType
import typings.expoImageUtils.anon.Name
import typings.expoImageUtils.buildImageDottypesMod.ImageOptions
import typings.expoImageUtils.buildJimpMod.JimpGlobalOptions
import typings.expoImageUtils.buildSharpDottypesMod.SharpCommandOptions
import typings.expoImageUtils.buildSharpDottypesMod.SharpGlobalOptions
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildMod {
  
  @JSImport("@expo/image-utils/build", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object Cache {
    
    @JSImport("@expo/image-utils/build", "Cache")
    @js.native
    val ^ : js.Any = js.native
    
    inline def cacheImageAsync(fileName: String, buffer: Buffer, cacheKey: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("cacheImageAsync")(fileName.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], cacheKey.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    inline def clearUnusedCachesAsync(projectRoot: String, `type`: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("clearUnusedCachesAsync")(projectRoot.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    inline def createCacheKey(fileSource: String, properties: js.Array[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("createCacheKey")(fileSource.asInstanceOf[js.Any], properties.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def createCacheKeyWithDirectoryAsync(projectRoot: String, `type`: String, icon: ImageOptions): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("createCacheKeyWithDirectoryAsync")(projectRoot.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], icon.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    
    inline def ensureCacheDirectory(projectRoot: String, `type`: String, cacheKey: String): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureCacheDirectory")(projectRoot.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], cacheKey.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    
    inline def getImageFromCacheAsync(fileName: String, cacheKey: String): js.Promise[Null | Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("getImageFromCacheAsync")(fileName.asInstanceOf[js.Any], cacheKey.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Null | Buffer]]
  }
  
  inline def compositeImagesAsync(param0: Background): js.Promise[Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("compositeImagesAsync")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Buffer]]
  
  inline def findSharpInstanceAsync(): js.Promise[Any | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("findSharpInstanceAsync")().asInstanceOf[js.Promise[Any | Null]]
  
  inline def generateFaviconAsync(pngImageBuffer: Buffer): js.Promise[Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateFaviconAsync")(pngImageBuffer.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Buffer]]
  inline def generateFaviconAsync(pngImageBuffer: Buffer, sizes: js.Array[Double]): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateFaviconAsync")(pngImageBuffer.asInstanceOf[js.Any], sizes.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
  
  inline def generateImageAsync(options: CacheType, imageOptions: ImageOptions): js.Promise[Name] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateImageAsync")(options.asInstanceOf[js.Any], imageOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Name]]
  
  inline def imageAsync(options: SharpGlobalOptions): js.Promise[Buffer | js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("imageAsync")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Buffer | js.Array[String]]]
  inline def imageAsync(options: SharpGlobalOptions, commands: js.Array[SharpCommandOptions]): js.Promise[Buffer | js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("imageAsync")(options.asInstanceOf[js.Any], commands.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer | js.Array[String]]]
  
  inline def isAvailableAsync(): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isAvailableAsync")().asInstanceOf[js.Promise[Boolean]]
  
  inline def jimpAsync(options: JimpGlobalOptions): js.Promise[Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("jimpAsync")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Buffer]]
  inline def jimpAsync(options: JimpGlobalOptions, commands: js.Array[SharpCommandOptions]): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("jimpAsync")(options.asInstanceOf[js.Any], commands.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
  
  inline def sharpAsync(options: SharpGlobalOptions): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("sharpAsync")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[String]]]
  inline def sharpAsync(options: SharpGlobalOptions, commands: js.Array[SharpCommandOptions]): js.Promise[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("sharpAsync")(options.asInstanceOf[js.Any], commands.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[String]]]
}
