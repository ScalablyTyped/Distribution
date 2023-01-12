package typings.exif

import typings.exif.anon.ApertureValue
import typings.exif.anon.Artist
import typings.exif.anon.AutoBracketing
import typings.exif.anon.Compression
import typings.exif.anon.GPSAltitude
import typings.exif.anon.InteropIndex
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(path: String, callback: ExifCallback): Unit = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("exif", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("exif", "ExifImage")
  @js.native
  open class ExifImage () extends StObject {
    def this(options: String, callback: ExifImageCallback) = this()
    def this(options: ExifOptions, callback: ExifImageCallback) = this()
    def this(options: Buffer, callback: ExifImageCallback) = this()
    
    def loadImage(file: String, callback: ExifImageCallback): Unit = js.native
    def loadImage(file: Buffer, callback: ExifImageCallback): Unit = js.native
  }
  
  type ExifCallback = js.Function3[/* error */ js.Error | Null, /* data */ ExifData, /* dataPath */ String, Unit]
  
  trait ExifData extends StObject {
    
    var exif: ApertureValue
    
    /**
      * Entire GPS Tags from https://exiftool.org/TagNames/GPS.html are listed.
      * And their types are determined from http://www.exif.org/Exif2-2.PDF.
      */
    var gps: GPSAltitude
    
    var image: Artist
    
    var interoperability: InteropIndex
    
    var makernote: AutoBracketing
    
    var thumbnail: Compression
  }
  object ExifData {
    
    inline def apply(
      exif: ApertureValue,
      gps: GPSAltitude,
      image: Artist,
      interoperability: InteropIndex,
      makernote: AutoBracketing,
      thumbnail: Compression
    ): ExifData = {
      val __obj = js.Dynamic.literal(exif = exif.asInstanceOf[js.Any], gps = gps.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], interoperability = interoperability.asInstanceOf[js.Any], makernote = makernote.asInstanceOf[js.Any], thumbnail = thumbnail.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExifData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExifData] (val x: Self) extends AnyVal {
      
      inline def setExif(value: ApertureValue): Self = StObject.set(x, "exif", value.asInstanceOf[js.Any])
      
      inline def setGps(value: GPSAltitude): Self = StObject.set(x, "gps", value.asInstanceOf[js.Any])
      
      inline def setImage(value: Artist): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      inline def setInteroperability(value: InteropIndex): Self = StObject.set(x, "interoperability", value.asInstanceOf[js.Any])
      
      inline def setMakernote(value: AutoBracketing): Self = StObject.set(x, "makernote", value.asInstanceOf[js.Any])
      
      inline def setThumbnail(value: Compression): Self = StObject.set(x, "thumbnail", value.asInstanceOf[js.Any])
    }
  }
  
  type ExifImageCallback = js.Function2[/* error */ js.Error | Null, /* data */ ExifData, Unit]
  
  trait ExifOptions extends StObject {
    
    var agfaMaxEntries: js.UndefOr[Double] = js.undefined
    
    var epsonMaxEntries: js.UndefOr[Double] = js.undefined
    
    /** node-exif corrects the thumbnail offset in order to have an offset from the start of the buffer/file. */
    var fixThumbnailOffset: js.UndefOr[Boolean] = js.undefined
    
    var fujifilmMaxEntries: js.UndefOr[Double] = js.undefined
    
    var ifd0MaxEntries: js.UndefOr[Double] = js.undefined
    
    var ifd1MaxEntries: js.UndefOr[Double] = js.undefined
    
    /**
      * The image to get Exif data from can be either a filesystem path or a Buffer.
      *
      * If `image` is not specified, the developer must call `loadImage()` to parse the image.
      */
    var image: js.UndefOr[String | Buffer] = js.undefined
    
    /** Specifies the maximum entries to be parsed */
    var maxEntries: js.UndefOr[Double] = js.undefined
    
    var maxGpsEntries: js.UndefOr[Double] = js.undefined
    
    var maxInteroperabilityEntries: js.UndefOr[Double] = js.undefined
    
    var noPadding: js.UndefOr[Boolean] = js.undefined
    
    var olympusMaxEntries: js.UndefOr[Double] = js.undefined
    
    var panasonicMaxEntries: js.UndefOr[Double] = js.undefined
    
    var sanyoMaxEntries: js.UndefOr[Double] = js.undefined
    
    /** An object named "offsets" is added to exifData and contains lot of offsets needed to get thumbnail and other things. */
    var tiffOffsets: js.UndefOr[Double] = js.undefined
  }
  object ExifOptions {
    
    inline def apply(): ExifOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExifOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExifOptions] (val x: Self) extends AnyVal {
      
      inline def setAgfaMaxEntries(value: Double): Self = StObject.set(x, "agfaMaxEntries", value.asInstanceOf[js.Any])
      
      inline def setAgfaMaxEntriesUndefined: Self = StObject.set(x, "agfaMaxEntries", js.undefined)
      
      inline def setEpsonMaxEntries(value: Double): Self = StObject.set(x, "epsonMaxEntries", value.asInstanceOf[js.Any])
      
      inline def setEpsonMaxEntriesUndefined: Self = StObject.set(x, "epsonMaxEntries", js.undefined)
      
      inline def setFixThumbnailOffset(value: Boolean): Self = StObject.set(x, "fixThumbnailOffset", value.asInstanceOf[js.Any])
      
      inline def setFixThumbnailOffsetUndefined: Self = StObject.set(x, "fixThumbnailOffset", js.undefined)
      
      inline def setFujifilmMaxEntries(value: Double): Self = StObject.set(x, "fujifilmMaxEntries", value.asInstanceOf[js.Any])
      
      inline def setFujifilmMaxEntriesUndefined: Self = StObject.set(x, "fujifilmMaxEntries", js.undefined)
      
      inline def setIfd0MaxEntries(value: Double): Self = StObject.set(x, "ifd0MaxEntries", value.asInstanceOf[js.Any])
      
      inline def setIfd0MaxEntriesUndefined: Self = StObject.set(x, "ifd0MaxEntries", js.undefined)
      
      inline def setIfd1MaxEntries(value: Double): Self = StObject.set(x, "ifd1MaxEntries", value.asInstanceOf[js.Any])
      
      inline def setIfd1MaxEntriesUndefined: Self = StObject.set(x, "ifd1MaxEntries", js.undefined)
      
      inline def setImage(value: String | Buffer): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
      inline def setMaxEntries(value: Double): Self = StObject.set(x, "maxEntries", value.asInstanceOf[js.Any])
      
      inline def setMaxEntriesUndefined: Self = StObject.set(x, "maxEntries", js.undefined)
      
      inline def setMaxGpsEntries(value: Double): Self = StObject.set(x, "maxGpsEntries", value.asInstanceOf[js.Any])
      
      inline def setMaxGpsEntriesUndefined: Self = StObject.set(x, "maxGpsEntries", js.undefined)
      
      inline def setMaxInteroperabilityEntries(value: Double): Self = StObject.set(x, "maxInteroperabilityEntries", value.asInstanceOf[js.Any])
      
      inline def setMaxInteroperabilityEntriesUndefined: Self = StObject.set(x, "maxInteroperabilityEntries", js.undefined)
      
      inline def setNoPadding(value: Boolean): Self = StObject.set(x, "noPadding", value.asInstanceOf[js.Any])
      
      inline def setNoPaddingUndefined: Self = StObject.set(x, "noPadding", js.undefined)
      
      inline def setOlympusMaxEntries(value: Double): Self = StObject.set(x, "olympusMaxEntries", value.asInstanceOf[js.Any])
      
      inline def setOlympusMaxEntriesUndefined: Self = StObject.set(x, "olympusMaxEntries", js.undefined)
      
      inline def setPanasonicMaxEntries(value: Double): Self = StObject.set(x, "panasonicMaxEntries", value.asInstanceOf[js.Any])
      
      inline def setPanasonicMaxEntriesUndefined: Self = StObject.set(x, "panasonicMaxEntries", js.undefined)
      
      inline def setSanyoMaxEntries(value: Double): Self = StObject.set(x, "sanyoMaxEntries", value.asInstanceOf[js.Any])
      
      inline def setSanyoMaxEntriesUndefined: Self = StObject.set(x, "sanyoMaxEntries", js.undefined)
      
      inline def setTiffOffsets(value: Double): Self = StObject.set(x, "tiffOffsets", value.asInstanceOf[js.Any])
      
      inline def setTiffOffsetsUndefined: Self = StObject.set(x, "tiffOffsets", js.undefined)
    }
  }
}
