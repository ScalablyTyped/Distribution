package typings.expoImageUtils

import typings.expoImageUtils.anon.OmitResizeOptionsoperatio
import typings.expoImageUtils.buildImageDottypesMod.ImageFormat
import typings.expoImageUtils.buildSharpDottypesMod.SharpCommandOptions
import typings.expoImageUtils.expoImageUtilsStrings._empty
import typings.jimpCompact.mod.Jimp
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildJimpMod {
  
  @JSImport("@expo/image-utils/build/jimp", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def circleAsync(jimp: Jimp): js.Promise[Jimp] = ^.asInstanceOf[js.Dynamic].applyDynamic("circleAsync")(jimp.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Jimp]]
  
  inline def convertFormat(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("convertFormat")().asInstanceOf[js.UndefOr[String]]
  inline def convertFormat(format: String): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("convertFormat")(format.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  
  inline def getJimpImageAsync(input: String): js.Promise[Jimp] = ^.asInstanceOf[js.Dynamic].applyDynamic("getJimpImageAsync")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Jimp]]
  inline def getJimpImageAsync(input: Jimp): js.Promise[Jimp] = ^.asInstanceOf[js.Dynamic].applyDynamic("getJimpImageAsync")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Jimp]]
  inline def getJimpImageAsync(input: Buffer): js.Promise[Jimp] = ^.asInstanceOf[js.Dynamic].applyDynamic("getJimpImageAsync")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Jimp]]
  
  inline def isFolderAsync(path: String): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isFolderAsync")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  
  inline def jimpAsync(options: JimpGlobalOptions): js.Promise[Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("jimpAsync")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Buffer]]
  inline def jimpAsync(options: JimpGlobalOptions, commands: js.Array[SharpCommandOptions]): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("jimpAsync")(options.asInstanceOf[js.Any], commands.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
  
  inline def resize(hasInputQuality: JimpGlobalOptions, hasBackgroundPositionFitWidthHeight: OmitResizeOptionsoperatio): js.Promise[Jimp] = (^.asInstanceOf[js.Dynamic].applyDynamic("resize")(hasInputQuality.asInstanceOf[js.Any], hasBackgroundPositionFitWidthHeight.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Jimp]]
  
  inline def resizeBufferAsync(buffer: Buffer, sizes: js.Array[Double]): js.Promise[js.Array[Buffer]] = (^.asInstanceOf[js.Dynamic].applyDynamic("resizeBufferAsync")(buffer.asInstanceOf[js.Any], sizes.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Buffer]]]
  
  /* Inlined std.Omit<@expo/image-utils.@expo/image-utils/build/sharp.types.SharpGlobalOptions, 'input'> & {  input :string | node.buffer.<global>.Buffer | jimp-compact.jimp-compact.default,   originalInput :string} */
  trait JimpGlobalOptions extends StObject {
    
    var compressionLevel: js.UndefOr[_empty] = js.undefined
    
    var format: js.UndefOr[ImageFormat] = js.undefined
    
    var input: String | Buffer | Jimp
    
    var limitInputPixels: js.UndefOr[Double] = js.undefined
    
    var originalInput: String
    
    var output: String
    
    var progressive: js.UndefOr[Boolean] = js.undefined
    
    var quality: js.UndefOr[Double] = js.undefined
    
    var withMetadata: js.UndefOr[Boolean] = js.undefined
  }
  object JimpGlobalOptions {
    
    inline def apply(input: String | Buffer | Jimp, originalInput: String, output: String): JimpGlobalOptions = {
      val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any], originalInput = originalInput.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any])
      __obj.asInstanceOf[JimpGlobalOptions]
    }
    
    extension [Self <: JimpGlobalOptions](x: Self) {
      
      inline def setCompressionLevel(value: _empty): Self = StObject.set(x, "compressionLevel", value.asInstanceOf[js.Any])
      
      inline def setCompressionLevelUndefined: Self = StObject.set(x, "compressionLevel", js.undefined)
      
      inline def setFormat(value: ImageFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setInput(value: String | Buffer | Jimp): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setLimitInputPixels(value: Double): Self = StObject.set(x, "limitInputPixels", value.asInstanceOf[js.Any])
      
      inline def setLimitInputPixelsUndefined: Self = StObject.set(x, "limitInputPixels", js.undefined)
      
      inline def setOriginalInput(value: String): Self = StObject.set(x, "originalInput", value.asInstanceOf[js.Any])
      
      inline def setOutput(value: String): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      inline def setProgressive(value: Boolean): Self = StObject.set(x, "progressive", value.asInstanceOf[js.Any])
      
      inline def setProgressiveUndefined: Self = StObject.set(x, "progressive", js.undefined)
      
      inline def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
      
      inline def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
      
      inline def setWithMetadata(value: Boolean): Self = StObject.set(x, "withMetadata", value.asInstanceOf[js.Any])
      
      inline def setWithMetadataUndefined: Self = StObject.set(x, "withMetadata", js.undefined)
    }
  }
}
