package typings.exif

import typings.exif.anon.ApertureValue
import typings.exif.anon.AutoBracketing
import typings.exif.anon.Compression
import typings.exif.anon.Copyright
import typings.exif.anon.GPSAltitude
import typings.exif.anon.InteropIndex
import typings.node.Buffer
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("exif", JSImport.Namespace)
  @js.native
  def apply(path: String, callback: ExifCallback): Unit = js.native
  
  @JSImport("exif", "ExifImage")
  @js.native
  class ExifImage () extends StObject {
    def this(options: String, callback: ExifImageCallback) = this()
    def this(options: ExifOptions, callback: ExifImageCallback) = this()
    def this(options: Buffer, callback: ExifImageCallback) = this()
    
    def loadImage(file: String, callback: ExifImageCallback): Unit = js.native
    def loadImage(file: Buffer, callback: ExifImageCallback): Unit = js.native
  }
  
  type ExifCallback = js.Function3[/* error */ Error | Null, /* data */ ExifData, /* dataPath */ String, Unit]
  
  @js.native
  trait ExifData extends StObject {
    
    var exif: ApertureValue = js.native
    
    /**
      * Entire GPS Tags from https://exiftool.org/TagNames/GPS.html are listed.
      * And their types are determined from http://www.exif.org/Exif2-2.PDF.
      */
    var gps: GPSAltitude = js.native
    
    var image: Copyright = js.native
    
    var interoperability: InteropIndex = js.native
    
    var makernote: AutoBracketing = js.native
    
    var thumbnail: Compression = js.native
  }
  object ExifData {
    
    @scala.inline
    def apply(
      exif: ApertureValue,
      gps: GPSAltitude,
      image: Copyright,
      interoperability: InteropIndex,
      makernote: AutoBracketing,
      thumbnail: Compression
    ): ExifData = {
      val __obj = js.Dynamic.literal(exif = exif.asInstanceOf[js.Any], gps = gps.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], interoperability = interoperability.asInstanceOf[js.Any], makernote = makernote.asInstanceOf[js.Any], thumbnail = thumbnail.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExifData]
    }
    
    @scala.inline
    implicit class ExifDataMutableBuilder[Self <: ExifData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExif(value: ApertureValue): Self = StObject.set(x, "exif", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGps(value: GPSAltitude): Self = StObject.set(x, "gps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImage(value: Copyright): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInteroperability(value: InteropIndex): Self = StObject.set(x, "interoperability", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMakernote(value: AutoBracketing): Self = StObject.set(x, "makernote", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThumbnail(value: Compression): Self = StObject.set(x, "thumbnail", value.asInstanceOf[js.Any])
    }
  }
  
  type ExifImageCallback = js.Function2[/* error */ Error | Null, /* data */ ExifData, Unit]
  
  @js.native
  trait ExifOptions extends StObject {
    
    var agfaMaxEntries: js.UndefOr[Double] = js.native
    
    var epsonMaxEntries: js.UndefOr[Double] = js.native
    
    /** node-exif corrects the thumbnail offset in order to have an offset from the start of the buffer/file. */
    var fixThumbnailOffset: js.UndefOr[Boolean] = js.native
    
    var fujifilmMaxEntries: js.UndefOr[Double] = js.native
    
    var ifd0MaxEntries: js.UndefOr[Double] = js.native
    
    var ifd1MaxEntries: js.UndefOr[Double] = js.native
    
    /**
      * The image to get Exif data from can be either a filesystem path or a Buffer.
      *
      * If `image` is not specified, the developer must call `loadImage()` to parse the image.
      */
    var image: js.UndefOr[String | Buffer] = js.native
    
    /** Specifies the maximum entries to be parsed */
    var maxEntries: js.UndefOr[Double] = js.native
    
    var maxGpsEntries: js.UndefOr[Double] = js.native
    
    var maxInteroperabilityEntries: js.UndefOr[Double] = js.native
    
    var noPadding: js.UndefOr[Boolean] = js.native
    
    var olympusMaxEntries: js.UndefOr[Double] = js.native
    
    var panasonicMaxEntries: js.UndefOr[Double] = js.native
    
    var sanyoMaxEntries: js.UndefOr[Double] = js.native
    
    /** An object named "offsets" is added to exifData and contains lot of offsets needed to get thumbnail and other things. */
    var tiffOffsets: js.UndefOr[Double] = js.native
  }
  object ExifOptions {
    
    @scala.inline
    def apply(): ExifOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExifOptions]
    }
    
    @scala.inline
    implicit class ExifOptionsMutableBuilder[Self <: ExifOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAgfaMaxEntries(value: Double): Self = StObject.set(x, "agfaMaxEntries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAgfaMaxEntriesUndefined: Self = StObject.set(x, "agfaMaxEntries", js.undefined)
      
      @scala.inline
      def setEpsonMaxEntries(value: Double): Self = StObject.set(x, "epsonMaxEntries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEpsonMaxEntriesUndefined: Self = StObject.set(x, "epsonMaxEntries", js.undefined)
      
      @scala.inline
      def setFixThumbnailOffset(value: Boolean): Self = StObject.set(x, "fixThumbnailOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixThumbnailOffsetUndefined: Self = StObject.set(x, "fixThumbnailOffset", js.undefined)
      
      @scala.inline
      def setFujifilmMaxEntries(value: Double): Self = StObject.set(x, "fujifilmMaxEntries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFujifilmMaxEntriesUndefined: Self = StObject.set(x, "fujifilmMaxEntries", js.undefined)
      
      @scala.inline
      def setIfd0MaxEntries(value: Double): Self = StObject.set(x, "ifd0MaxEntries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIfd0MaxEntriesUndefined: Self = StObject.set(x, "ifd0MaxEntries", js.undefined)
      
      @scala.inline
      def setIfd1MaxEntries(value: Double): Self = StObject.set(x, "ifd1MaxEntries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIfd1MaxEntriesUndefined: Self = StObject.set(x, "ifd1MaxEntries", js.undefined)
      
      @scala.inline
      def setImage(value: String | Buffer): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
      @scala.inline
      def setMaxEntries(value: Double): Self = StObject.set(x, "maxEntries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxEntriesUndefined: Self = StObject.set(x, "maxEntries", js.undefined)
      
      @scala.inline
      def setMaxGpsEntries(value: Double): Self = StObject.set(x, "maxGpsEntries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxGpsEntriesUndefined: Self = StObject.set(x, "maxGpsEntries", js.undefined)
      
      @scala.inline
      def setMaxInteroperabilityEntries(value: Double): Self = StObject.set(x, "maxInteroperabilityEntries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxInteroperabilityEntriesUndefined: Self = StObject.set(x, "maxInteroperabilityEntries", js.undefined)
      
      @scala.inline
      def setNoPadding(value: Boolean): Self = StObject.set(x, "noPadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoPaddingUndefined: Self = StObject.set(x, "noPadding", js.undefined)
      
      @scala.inline
      def setOlympusMaxEntries(value: Double): Self = StObject.set(x, "olympusMaxEntries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOlympusMaxEntriesUndefined: Self = StObject.set(x, "olympusMaxEntries", js.undefined)
      
      @scala.inline
      def setPanasonicMaxEntries(value: Double): Self = StObject.set(x, "panasonicMaxEntries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPanasonicMaxEntriesUndefined: Self = StObject.set(x, "panasonicMaxEntries", js.undefined)
      
      @scala.inline
      def setSanyoMaxEntries(value: Double): Self = StObject.set(x, "sanyoMaxEntries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSanyoMaxEntriesUndefined: Self = StObject.set(x, "sanyoMaxEntries", js.undefined)
      
      @scala.inline
      def setTiffOffsets(value: Double): Self = StObject.set(x, "tiffOffsets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTiffOffsetsUndefined: Self = StObject.set(x, "tiffOffsets", js.undefined)
    }
  }
}
