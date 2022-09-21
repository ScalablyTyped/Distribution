package typings.devexpressUtils

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mimeTypeMod {
  
  @JSImport("@devexpress/utils/lib/utils/mime-type", "DocmMimeType")
  @js.native
  val DocmMimeType: /* "application/vnd.ms-word.document.macroEnabled.12" */ String = js.native
  
  @js.native
  sealed trait DxMimeType extends StObject
  @JSImport("@devexpress/utils/lib/utils/mime-type", "DxMimeType")
  @js.native
  object DxMimeType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[DxMimeType & Double] = js.native
    
    @js.native
    sealed trait Docm
      extends StObject
         with DxMimeType
    /* 4 */ val Docm: typings.devexpressUtils.mimeTypeMod.DxMimeType.Docm & Double = js.native
    
    @js.native
    sealed trait Gif
      extends StObject
         with DxMimeType
    /* 6 */ val Gif: typings.devexpressUtils.mimeTypeMod.DxMimeType.Gif & Double = js.native
    
    @js.native
    sealed trait Ico
      extends StObject
         with DxMimeType
    /* 11 */ val Ico: typings.devexpressUtils.mimeTypeMod.DxMimeType.Ico & Double = js.native
    
    @js.native
    sealed trait Jpeg
      extends StObject
         with DxMimeType
    /* 7 */ val Jpeg: typings.devexpressUtils.mimeTypeMod.DxMimeType.Jpeg & Double = js.native
    
    @js.native
    sealed trait OpenXml
      extends StObject
         with DxMimeType
    /* 1 */ val OpenXml: typings.devexpressUtils.mimeTypeMod.DxMimeType.OpenXml & Double = js.native
    
    @js.native
    sealed trait Pjpeg
      extends StObject
         with DxMimeType
    /* 8 */ val Pjpeg: typings.devexpressUtils.mimeTypeMod.DxMimeType.Pjpeg & Double = js.native
    
    @js.native
    sealed trait PlainText
      extends StObject
         with DxMimeType
    /* 3 */ val PlainText: typings.devexpressUtils.mimeTypeMod.DxMimeType.PlainText & Double = js.native
    
    @js.native
    sealed trait Png
      extends StObject
         with DxMimeType
    /* 5 */ val Png: typings.devexpressUtils.mimeTypeMod.DxMimeType.Png & Double = js.native
    
    @js.native
    sealed trait Rtf
      extends StObject
         with DxMimeType
    /* 2 */ val Rtf: typings.devexpressUtils.mimeTypeMod.DxMimeType.Rtf & Double = js.native
    
    @js.native
    sealed trait Svg
      extends StObject
         with DxMimeType
    /* 9 */ val Svg: typings.devexpressUtils.mimeTypeMod.DxMimeType.Svg & Double = js.native
    
    @js.native
    sealed trait Tiff
      extends StObject
         with DxMimeType
    /* 10 */ val Tiff: typings.devexpressUtils.mimeTypeMod.DxMimeType.Tiff & Double = js.native
    
    @js.native
    sealed trait Unknown
      extends StObject
         with DxMimeType
    /* 0 */ val Unknown: typings.devexpressUtils.mimeTypeMod.DxMimeType.Unknown & Double = js.native
    
    @js.native
    sealed trait Wbmp
      extends StObject
         with DxMimeType
    /* 12 */ val Wbmp: typings.devexpressUtils.mimeTypeMod.DxMimeType.Wbmp & Double = js.native
    
    @js.native
    sealed trait Webp
      extends StObject
         with DxMimeType
    /* 13 */ val Webp: typings.devexpressUtils.mimeTypeMod.DxMimeType.Webp & Double = js.native
  }
  
  @JSImport("@devexpress/utils/lib/utils/mime-type", "ImageGifMimeType")
  @js.native
  val ImageGifMimeType: /* "image/gif" */ String = js.native
  
  @JSImport("@devexpress/utils/lib/utils/mime-type", "ImageIcoMimeType")
  @js.native
  val ImageIcoMimeType: /* "image/vnd.microsoft.icon" */ String = js.native
  
  @JSImport("@devexpress/utils/lib/utils/mime-type", "ImageJpegMimeType")
  @js.native
  val ImageJpegMimeType: /* "image/jpeg" */ String = js.native
  
  @JSImport("@devexpress/utils/lib/utils/mime-type", "ImagePjpegMimeType")
  @js.native
  val ImagePjpegMimeType: /* "image/pjpeg" */ String = js.native
  
  @JSImport("@devexpress/utils/lib/utils/mime-type", "ImagePngMimeType")
  @js.native
  val ImagePngMimeType: /* "image/png" */ String = js.native
  
  @JSImport("@devexpress/utils/lib/utils/mime-type", "ImageSvgMimeType")
  @js.native
  val ImageSvgMimeType: /* "image/svg+xml" */ String = js.native
  
  @JSImport("@devexpress/utils/lib/utils/mime-type", "ImageTiffMimeType")
  @js.native
  val ImageTiffMimeType: /* "image/tiff" */ String = js.native
  
  @JSImport("@devexpress/utils/lib/utils/mime-type", "ImageWbmpMimeType")
  @js.native
  val ImageWbmpMimeType: /* "image/vnd.wap.wbmp" */ String = js.native
  
  @JSImport("@devexpress/utils/lib/utils/mime-type", "ImageWebpMimeType")
  @js.native
  val ImageWebpMimeType: /* "image/webp" */ String = js.native
  
  @JSImport("@devexpress/utils/lib/utils/mime-type", "MimeTypeUtils")
  @js.native
  open class MimeTypeUtils () extends StObject
  /* static members */
  object MimeTypeUtils {
    
    @JSImport("@devexpress/utils/lib/utils/mime-type", "MimeTypeUtils")
    @js.native
    val ^ : js.Any = js.native
    
    inline def extensionToType(`extension`: String): DxMimeType = ^.asInstanceOf[js.Dynamic].applyDynamic("extensionToType")(`extension`.asInstanceOf[js.Any]).asInstanceOf[DxMimeType]
    
    @JSImport("@devexpress/utils/lib/utils/mime-type", "MimeTypeUtils.extensionToTypeMap")
    @js.native
    def extensionToTypeMap: Record[String, js.UndefOr[DxMimeType]] = js.native
    inline def extensionToTypeMap_=(x: Record[String, js.UndefOr[DxMimeType]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionToTypeMap")(x.asInstanceOf[js.Any])
    
    inline def stringTypeToExtension(mimeTypeAsStr: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringTypeToExtension")(mimeTypeAsStr.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def stringTypeToType(mimeTypeAsStr: String): DxMimeType = ^.asInstanceOf[js.Dynamic].applyDynamic("stringTypeToType")(mimeTypeAsStr.asInstanceOf[js.Any]).asInstanceOf[DxMimeType]
    
    @JSImport("@devexpress/utils/lib/utils/mime-type", "MimeTypeUtils.stringTypeToTypeMap")
    @js.native
    def stringTypeToTypeMap: Record[String, js.UndefOr[DxMimeType]] = js.native
    inline def stringTypeToTypeMap_=(x: Record[String, js.UndefOr[DxMimeType]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stringTypeToTypeMap")(x.asInstanceOf[js.Any])
    
    inline def typeToExtension(mimeType: DxMimeType): String = ^.asInstanceOf[js.Dynamic].applyDynamic("typeToExtension")(mimeType.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @JSImport("@devexpress/utils/lib/utils/mime-type", "MimeTypeUtils.typeToExtensionMap")
    @js.native
    def typeToExtensionMap: Record[DxMimeType, js.UndefOr[String]] = js.native
    inline def typeToExtensionMap_=(x: Record[DxMimeType, js.UndefOr[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("typeToExtensionMap")(x.asInstanceOf[js.Any])
    
    inline def typeToStringType(mimeType: DxMimeType): String = ^.asInstanceOf[js.Dynamic].applyDynamic("typeToStringType")(mimeType.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @JSImport("@devexpress/utils/lib/utils/mime-type", "MimeTypeUtils.typeToStringTypeMap")
    @js.native
    def typeToStringTypeMap: Record[DxMimeType, js.UndefOr[String]] = js.native
    inline def typeToStringTypeMap_=(x: Record[DxMimeType, js.UndefOr[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("typeToStringTypeMap")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@devexpress/utils/lib/utils/mime-type", "OpenXmlMimeType")
  @js.native
  val OpenXmlMimeType: /* "application/vnd.openxmlformats-officedocument.wordprocessingml.document" */ String = js.native
  
  @JSImport("@devexpress/utils/lib/utils/mime-type", "PlainTextMimeType")
  @js.native
  val PlainTextMimeType: /* "text/plain" */ String = js.native
  
  @JSImport("@devexpress/utils/lib/utils/mime-type", "RtfMimeType")
  @js.native
  val RtfMimeType: /* "application/rtf" */ String = js.native
}
