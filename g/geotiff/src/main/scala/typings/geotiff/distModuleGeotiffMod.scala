package typings.geotiff

import typings.geotiff.distModuleGeotiffimageMod.ReadRasterOptions
import typings.geotiff.distModuleSourceBasesourceMod.BaseSource
import typings.std.AbortSignal
import typings.std.Array
import typings.std.Blob
import typings.std.File
import typings.std.Worker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distModuleGeotiffMod {
  
  @JSImport("geotiff/dist-module/geotiff", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("geotiff/dist-module/geotiff", JSImport.Default)
  @js.native
  open class default protected () extends GeoTIFF {
    /**
      * @constructor
      * @param {*} source The datasource to read from.
      * @param {boolean} littleEndian Whether the image uses little endian.
      * @param {boolean} bigTiff Whether the image uses bigTIFF conventions.
      * @param {number} firstIFDOffset The numeric byte-offset from the start of the image
      *                                to the first IFD.
      * @param {GeoTIFFOptions} [options] further options.
      */
    def this(source: Any, littleEndian: Boolean, bigTiff: Boolean, firstIFDOffset: Double) = this()
    def this(
      source: Any,
      littleEndian: Boolean,
      bigTiff: Boolean,
      firstIFDOffset: Double,
      options: GeoTIFFOptions
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("geotiff/dist-module/geotiff", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Parse a (Geo)TIFF file from the given source.
      *
      * @param {*} source The source of data to parse from.
      * @param {GeoTIFFOptions} [options] Additional options.
      * @param {AbortSignal} [signal] An AbortSignal that may be signalled if the request is
      *                               to be aborted
      */
    inline def fromSource(source: Any): js.Promise[GeoTIFF] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSource")(source.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GeoTIFF]]
    inline def fromSource(source: Any, options: Unit, signal: AbortSignal): js.Promise[GeoTIFF] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromSource")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any], signal.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GeoTIFF]]
    inline def fromSource(source: Any, options: GeoTIFFOptions): js.Promise[GeoTIFF] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromSource")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GeoTIFF]]
    inline def fromSource(source: Any, options: GeoTIFFOptions, signal: AbortSignal): js.Promise[GeoTIFF] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromSource")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any], signal.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GeoTIFF]]
  }
  
  @JSImport("geotiff/dist-module/geotiff", "BaseDecoder")
  @js.native
  open class BaseDecoder ()
    extends typings.geotiff.distModuleCompressionBasedecoderMod.default
  
  @JSImport("geotiff/dist-module/geotiff", "GeoTIFF")
  @js.native
  open class GeoTIFF protected ()
    extends StObject
       with GeoTIFFBase {
    /**
      * @constructor
      * @param {*} source The datasource to read from.
      * @param {boolean} littleEndian Whether the image uses little endian.
      * @param {boolean} bigTiff Whether the image uses bigTIFF conventions.
      * @param {number} firstIFDOffset The numeric byte-offset from the start of the image
      *                                to the first IFD.
      * @param {GeoTIFFOptions} [options] further options.
      */
    def this(source: Any, littleEndian: Boolean, bigTiff: Boolean, firstIFDOffset: Double) = this()
    def this(
      source: Any,
      littleEndian: Boolean,
      bigTiff: Boolean,
      firstIFDOffset: Double,
      options: GeoTIFFOptions
    ) = this()
    
    var bigTiff: Boolean = js.native
    
    var cache: Boolean = js.native
    
    /**
      * Closes the underlying file buffer
      * N.B. After the GeoTIFF has been completely processed it needs
      * to be closed but only if it has been constructed from a file.
      */
    def close(): Any = js.native
    
    var firstIFDOffset: Double = js.native
    
    /**
      * Get the values of the COG ghost area as a parsed map.
      * See https://gdal.org/drivers/raster/cog.html#header-ghost-area for reference
      * @returns {Promise<Object>} the parsed ghost area or null, if no such area was found
      */
    def getGhostValues(): js.Promise[Any] = js.native
    
    /**
      * Get the n-th internal subfile of an image. By default, the first is returned.
      *
      * @param {number} [index=0] the index of the image to return.
      * @returns {Promise<GeoTIFFImage>} the image at the given index
      */
    def getImage(): js.Promise[typings.geotiff.distModuleGeotiffimageMod.default] = js.native
    def getImage(index: Double): js.Promise[typings.geotiff.distModuleGeotiffimageMod.default] = js.native
    
    /**
      * Returns the count of the internal subfiles.
      *
      * @returns {Promise<number>} the number of internal subfile images
      */
    def getImageCount(): js.Promise[Double] = js.native
    
    def getSlice(offset: Any, size: Any): js.Promise[typings.geotiff.distModuleDatasliceMod.default] = js.native
    
    var ghostValues: js.Object | Null = js.native
    
    var ifdRequests: js.Array[Any] = js.native
    
    var littleEndian: Boolean = js.native
    
    /**
      * Instructs to parse an image file directory at the given file offset.
      * As there is no way to ensure that a location is indeed the start of an IFD,
      * this function must be called with caution (e.g only using the IFD offsets from
      * the headers or other IFDs).
      * @param {number} offset the offset to parse the IFD at
      * @returns {Promise<ImageFileDirectory>} the parsed IFD
      */
    def parseFileDirectoryAt(offset: Double): js.Promise[ImageFileDirectory] = js.native
    
    def requestIFD(index: Any): js.Promise[Any] = js.native
    
    var source: Any = js.native
  }
  /* static members */
  object GeoTIFF {
    
    @JSImport("geotiff/dist-module/geotiff", "GeoTIFF")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Parse a (Geo)TIFF file from the given source.
      *
      * @param {*} source The source of data to parse from.
      * @param {GeoTIFFOptions} [options] Additional options.
      * @param {AbortSignal} [signal] An AbortSignal that may be signalled if the request is
      *                               to be aborted
      */
    inline def fromSource(source: Any): js.Promise[GeoTIFF] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSource")(source.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GeoTIFF]]
    inline def fromSource(source: Any, options: Unit, signal: AbortSignal): js.Promise[GeoTIFF] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromSource")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any], signal.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GeoTIFF]]
    inline def fromSource(source: Any, options: GeoTIFFOptions): js.Promise[GeoTIFF] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromSource")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GeoTIFF]]
    inline def fromSource(source: Any, options: GeoTIFFOptions, signal: AbortSignal): js.Promise[GeoTIFF] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromSource")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any], signal.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GeoTIFF]]
  }
  
  /**
    * GeoTIFF sub-file image.
    */
  @JSImport("geotiff/dist-module/geotiff", "GeoTIFFImage")
  @js.native
  open class GeoTIFFImage protected ()
    extends typings.geotiff.distModuleGeotiffimageMod.default {
    /**
      * @constructor
      * @param {Object} fileDirectory The parsed file directory
      * @param {Object} geoKeys The parsed geo-keys
      * @param {DataView} dataView The DataView for the underlying file.
      * @param {Boolean} littleEndian Whether the file is encoded in little or big endian
      * @param {Boolean} cache Whether or not decoded tiles shall be cached
      * @param {import('./source/basesource').BaseSource} source The datasource to read from
      */
    def this(
      fileDirectory: Any,
      geoKeys: Any,
      dataView: js.typedarray.DataView,
      littleEndian: Boolean,
      cache: Boolean,
      source: BaseSource
    ) = this()
  }
  
  @JSImport("geotiff/dist-module/geotiff", "MultiGeoTIFF")
  @js.native
  open class MultiGeoTIFF protected ()
    extends StObject
       with GeoTIFFBase {
    /**
      * Construct a new MultiGeoTIFF from a main and several overview files.
      * @param {GeoTIFF} mainFile The main GeoTIFF file.
      * @param {GeoTIFF[]} overviewFiles An array of overview files.
      */
    def this(mainFile: GeoTIFF, overviewFiles: js.Array[GeoTIFF]) = this()
    
    var fileDirectoriesPerFile: js.Array[ImageFileDirectory] | Null = js.native
    
    var fileDirectoriesPerFileParsing: Any = js.native
    
    /**
      * Get the n-th internal subfile of an image. By default, the first is returned.
      *
      * @param {number} [index=0] the index of the image to return.
      * @returns {Promise<GeoTIFFImage>} the image at the given index
      */
    def getImage(): js.Promise[typings.geotiff.distModuleGeotiffimageMod.default] = js.native
    def getImage(index: Double): js.Promise[typings.geotiff.distModuleGeotiffimageMod.default] = js.native
    
    /**
      * Returns the count of the internal subfiles.
      *
      * @returns {Promise<number>} the number of internal subfile images
      */
    def getImageCount(): js.Promise[Double] = js.native
    
    var imageCount: Double | Null = js.native
    
    var imageCounts: js.UndefOr[js.Array[Double]] = js.native
    
    var imageFiles: js.Array[GeoTIFF] = js.native
    
    var mainFile: GeoTIFF = js.native
    
    var overviewFiles: js.Array[GeoTIFF] = js.native
    
    def parseFileDirectoriesPerFile(): js.Promise[js.Array[ImageFileDirectory]] = js.native
  }
  
  /**
    * @module pool
    */
  /**
    * Pool for workers to decode chunks of the images.
    */
  @JSImport("geotiff/dist-module/geotiff", "Pool")
  @js.native
  /**
    * @constructor
    * @param {Number} [size] The size of the pool. Defaults to the number of CPUs
    *                      available. When this parameter is `null` or 0, then the
    *                      decoding will be done in the main thread.
    * @param {function(): Worker} [createWorker] A function that creates the decoder worker.
    * Defaults to a worker with all decoders that ship with geotiff.js. The `createWorker()`
    * function is expected to return a `Worker` compatible with Web Workers. For code that
    * runs in Node, [web-worker](https://www.npmjs.com/package/web-worker) is a good choice.
    *
    * A worker that uses a custom lzw decoder would look like this `my-custom-worker.js` file:
    * ```js
    * import { addDecoder, getDecoder } from 'geotiff';
    * addDecoder(5, () => import ('./my-custom-lzw').then((m) => m.default));
    * self.addEventListener('message', async (e) => {
    *   const { id, fileDirectory, buffer } = e.data;
    *   const decoder = await getDecoder(fileDirectory);
    *   const decoded = await decoder.decode(fileDirectory, buffer);
    *   self.postMessage({ decoded, id }, [decoded]);
    * });
    * ```
    * The way the above code is built into a worker by the `createWorker()` function
    * depends on the used bundler. For most bundlers, something like this will work:
    * ```js
    * function createWorker() {
    *   return new Worker(new URL('./my-custom-worker.js', import.meta.url));
    * }
    * ```
    */
  open class Pool ()
    extends typings.geotiff.distModulePoolMod.default {
    def this(size: Double) = this()
    def this(size: Double, createWorker: js.Function0[Worker]) = this()
    def this(size: Unit, createWorker: js.Function0[Worker]) = this()
  }
  
  inline def addDecoder(cases: Any, importFn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addDecoder")(cases.asInstanceOf[js.Any], importFn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def fromArrayBuffer(arrayBuffer: js.typedarray.ArrayBuffer): js.Promise[GeoTIFF] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromArrayBuffer")(arrayBuffer.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GeoTIFF]]
  inline def fromArrayBuffer(arrayBuffer: js.typedarray.ArrayBuffer, signal: AbortSignal): js.Promise[GeoTIFF] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromArrayBuffer")(arrayBuffer.asInstanceOf[js.Any], signal.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GeoTIFF]]
  
  inline def fromBlob(blob: Blob): js.Promise[GeoTIFF] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBlob")(blob.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GeoTIFF]]
  inline def fromBlob(blob: Blob, signal: AbortSignal): js.Promise[GeoTIFF] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBlob")(blob.asInstanceOf[js.Any], signal.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GeoTIFF]]
  inline def fromBlob(blob: File): js.Promise[GeoTIFF] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBlob")(blob.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GeoTIFF]]
  inline def fromBlob(blob: File, signal: AbortSignal): js.Promise[GeoTIFF] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBlob")(blob.asInstanceOf[js.Any], signal.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GeoTIFF]]
  
  inline def fromFile(path: String): js.Promise[GeoTIFF] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromFile")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GeoTIFF]]
  inline def fromFile(path: String, signal: AbortSignal): js.Promise[GeoTIFF] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromFile")(path.asInstanceOf[js.Any], signal.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GeoTIFF]]
  
  inline def fromUrl(url: String): js.Promise[GeoTIFF] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromUrl")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GeoTIFF]]
  inline def fromUrl(url: String, options: js.Object): js.Promise[GeoTIFF] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromUrl")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GeoTIFF]]
  inline def fromUrl(url: String, options: js.Object, signal: AbortSignal): js.Promise[GeoTIFF] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromUrl")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], signal.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GeoTIFF]]
  inline def fromUrl(url: String, options: Unit, signal: AbortSignal): js.Promise[GeoTIFF] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromUrl")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], signal.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GeoTIFF]]
  
  inline def fromUrls(mainUrl: String): js.Promise[MultiGeoTIFF] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromUrls")(mainUrl.asInstanceOf[js.Any]).asInstanceOf[js.Promise[MultiGeoTIFF]]
  inline def fromUrls(mainUrl: String, overviewUrls: js.Array[String]): js.Promise[MultiGeoTIFF] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromUrls")(mainUrl.asInstanceOf[js.Any], overviewUrls.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MultiGeoTIFF]]
  inline def fromUrls(mainUrl: String, overviewUrls: js.Array[String], options: Any): js.Promise[MultiGeoTIFF] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromUrls")(mainUrl.asInstanceOf[js.Any], overviewUrls.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MultiGeoTIFF]]
  inline def fromUrls(mainUrl: String, overviewUrls: js.Array[String], options: Any, signal: AbortSignal): js.Promise[MultiGeoTIFF] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromUrls")(mainUrl.asInstanceOf[js.Any], overviewUrls.asInstanceOf[js.Any], options.asInstanceOf[js.Any], signal.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MultiGeoTIFF]]
  inline def fromUrls(mainUrl: String, overviewUrls: js.Array[String], options: Unit, signal: AbortSignal): js.Promise[MultiGeoTIFF] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromUrls")(mainUrl.asInstanceOf[js.Any], overviewUrls.asInstanceOf[js.Any], options.asInstanceOf[js.Any], signal.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MultiGeoTIFF]]
  inline def fromUrls(mainUrl: String, overviewUrls: Unit, options: Any): js.Promise[MultiGeoTIFF] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromUrls")(mainUrl.asInstanceOf[js.Any], overviewUrls.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MultiGeoTIFF]]
  inline def fromUrls(mainUrl: String, overviewUrls: Unit, options: Any, signal: AbortSignal): js.Promise[MultiGeoTIFF] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromUrls")(mainUrl.asInstanceOf[js.Any], overviewUrls.asInstanceOf[js.Any], options.asInstanceOf[js.Any], signal.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MultiGeoTIFF]]
  inline def fromUrls(mainUrl: String, overviewUrls: Unit, options: Unit, signal: AbortSignal): js.Promise[MultiGeoTIFF] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromUrls")(mainUrl.asInstanceOf[js.Any], overviewUrls.asInstanceOf[js.Any], options.asInstanceOf[js.Any], signal.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MultiGeoTIFF]]
  
  inline def getDecoder(fileDirectory: Any): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDecoder")(fileDirectory.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  
  object globals {
    
    object ExtraSamplesValues {
      
      @JSImport("geotiff/dist-module/geotiff", "globals.ExtraSamplesValues.Assocalpha")
      @js.native
      val Assocalpha: Double = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.ExtraSamplesValues.Unassalpha")
      @js.native
      val Unassalpha: Double = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.ExtraSamplesValues.Unspecified")
      @js.native
      val Unspecified: Double = js.native
    }
    
    object LercAddCompression {
      
      @JSImport("geotiff/dist-module/geotiff", "globals.LercAddCompression.Deflate")
      @js.native
      val Deflate: Double = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.LercAddCompression.None")
      @js.native
      val None: Double = js.native
    }
    
    object LercParameters {
      
      @JSImport("geotiff/dist-module/geotiff", "globals.LercParameters.AddCompression")
      @js.native
      val AddCompression: Double = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.LercParameters.Version")
      @js.native
      val Version: Double = js.native
    }
    
    @JSImport("geotiff/dist-module/geotiff", "globals.arrayFields")
    @js.native
    val arrayFields: js.Array[Any] = js.native
    
    object fieldTagNames {
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTagNames.254")
      @js.native
      val `254`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTagNames.255")
      @js.native
      val `255`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTagNames.256")
      @js.native
      val `256`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTagNames.257")
      @js.native
      val `257`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTagNames.258")
      @js.native
      val `258`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTagNames.259")
      @js.native
      val `259`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTagNames.262")
      @js.native
      val `262`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTagNames.263")
      @js.native
      val `263`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTagNames.264")
      @js.native
      val `264`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTagNames.265")
      @js.native
      val `265`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTagNames.266")
      @js.native
      val `266`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTagNames.269")
      @js.native
      val `269`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTagNames.270")
      @js.native
      val `270`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTagNames.271")
      @js.native
      val `271`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTagNames.272")
      @js.native
      val `272`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTagNames.273")
      @js.native
      val `273`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTagNames.274")
      @js.native
      val `274`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTagNames.277")
      @js.native
      val `277`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTagNames.278")
      @js.native
      val `278`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTagNames.279")
      @js.native
      val `279`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTagNames.280")
      @js.native
      val `280`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTagNames.281")
      @js.native
      val `281`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTagNames.282")
      @js.native
      val `282`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTagNames.283")
      @js.native
      val `283`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTagNames.284")
      @js.native
      val `284`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTagNames.285")
      @js.native
      val `285`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTagNames.286")
      @js.native
      val `286`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTagNames.287")
      @js.native
      val `287`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTagNames.288")
      @js.native
      val `288`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTagNames.289")
      @js.native
      val `289`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTagNames.290")
      @js.native
      val `290`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTagNames.291")
      @js.native
      val `291`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTagNames.292")
      @js.native
      val `292`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTagNames.293")
      @js.native
      val `293`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTagNames.296")
      @js.native
      val `296`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTagNames.297")
      @js.native
      val `297`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTagNames.301")
      @js.native
      val `301`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTagNames.305")
      @js.native
      val `305`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTagNames.306")
      @js.native
      val `306`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTagNames.315")
      @js.native
      val `315`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTagNames.316")
      @js.native
      val `316`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTagNames.317")
      @js.native
      val `317`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTagNames.318")
      @js.native
      val `318`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTagNames.319")
      @js.native
      val `319`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTagNames.320")
      @js.native
      val `320`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTagNames.321")
      @js.native
      val `321`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTagNames.322")
      @js.native
      val `322`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTagNames.323")
      @js.native
      val `323`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTagNames.324")
      @js.native
      val `324`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTagNames.325")
      @js.native
      val `325`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTagNames.326")
      @js.native
      val `326`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTagNames.327")
      @js.native
      val `327`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTagNames.328")
      @js.native
      val `328`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTagNames.330")
      @js.native
      val `330`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTagNames.33432")
      @js.native
      val `33432`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTagNames.33434")
      @js.native
      val `33434`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTagNames.33437")
      @js.native
      val `33437`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTagNames.33550")
      @js.native
      val `33550`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTagNames.336")
      @js.native
      val `336`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTagNames.33723")
      @js.native
      val `33723`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTagNames.338")
      @js.native
      val `338`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTagNames.339")
      @js.native
      val `339`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTagNames.33922")
      @js.native
      val `33922`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTagNames.340")
      @js.native
      val `340`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTagNames.341")
      @js.native
      val `341`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTagNames.34264")
      @js.native
      val `34264`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTagNames.343")
      @js.native
      val `343`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTagNames.34377")
      @js.native
      val `34377`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTagNames.344")
      @js.native
      val `344`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTagNames.345")
      @js.native
      val `345`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTagNames.346")
      @js.native
      val `346`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTagNames.34665")
      @js.native
      val `34665`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTagNames.34675")
      @js.native
      val `34675`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTagNames.347")
      @js.native
      val `347`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTagNames.34735")
      @js.native
      val `34735`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTagNames.34736")
      @js.native
      val `34736`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTagNames.34737")
      @js.native
      val `34737`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTagNames.36864")
      @js.native
      val `36864`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTagNames.36867")
      @js.native
      val `36867`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTagNames.36868")
      @js.native
      val `36868`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTagNames.37377")
      @js.native
      val `37377`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTagNames.37378")
      @js.native
      val `37378`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTagNames.37384")
      @js.native
      val `37384`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTagNames.37385")
      @js.native
      val `37385`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTagNames.37500")
      @js.native
      val `37500`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTagNames.37510")
      @js.native
      val `37510`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTagNames.40960")
      @js.native
      val `40960`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTagNames.40961")
      @js.native
      val `40961`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTagNames.41728")
      @js.native
      val `41728`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTagNames.42016")
      @js.native
      val `42016`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTagNames.42112")
      @js.native
      val `42112`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTagNames.42113")
      @js.native
      val `42113`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTagNames.433")
      @js.native
      val `433`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTagNames.434")
      @js.native
      val `434`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTagNames.50674")
      @js.native
      val `50674`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTagNames.529")
      @js.native
      val `529`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTagNames.530")
      @js.native
      val `530`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTagNames.531")
      @js.native
      val `531`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTagNames.532")
      @js.native
      val `532`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTagNames.559")
      @js.native
      val `559`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTagNames.700")
      @js.native
      val `700`: String = js.native
    }
    
    object fieldTagTypes {
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTagTypes.1024")
      @js.native
      val `1024`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTagTypes.1025")
      @js.native
      val `1025`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTagTypes.2048")
      @js.native
      val `2048`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTagTypes.2049")
      @js.native
      val `2049`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTagTypes.256")
      @js.native
      val `256`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTagTypes.257")
      @js.native
      val `257`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTagTypes.258")
      @js.native
      val `258`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTagTypes.259")
      @js.native
      val `259`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTagTypes.262")
      @js.native
      val `262`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTagTypes.273")
      @js.native
      val `273`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTagTypes.274")
      @js.native
      val `274`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTagTypes.277")
      @js.native
      val `277`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTagTypes.278")
      @js.native
      val `278`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTagTypes.279")
      @js.native
      val `279`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTagTypes.282")
      @js.native
      val `282`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTagTypes.283")
      @js.native
      val `283`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTagTypes.284")
      @js.native
      val `284`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTagTypes.286")
      @js.native
      val `286`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTagTypes.287")
      @js.native
      val `287`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTagTypes.296")
      @js.native
      val `296`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTagTypes.297")
      @js.native
      val `297`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTagTypes.305")
      @js.native
      val `305`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTagTypes.306")
      @js.native
      val `306`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTagTypes.3072")
      @js.native
      val `3072`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTagTypes.3073")
      @js.native
      val `3073`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTagTypes.33550")
      @js.native
      val `33550`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTagTypes.338")
      @js.native
      val `338`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTagTypes.339")
      @js.native
      val `339`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTagTypes.33922")
      @js.native
      val `33922`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTagTypes.34665")
      @js.native
      val `34665`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTagTypes.34735")
      @js.native
      val `34735`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTagTypes.34737")
      @js.native
      val `34737`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTagTypes.42113")
      @js.native
      val `42113`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTagTypes.513")
      @js.native
      val `513`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTagTypes.514")
      @js.native
      val `514`: String = js.native
    }
    
    object fieldTypeNames {
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTypeNames.1")
      @js.native
      val `1`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTypeNames.10")
      @js.native
      val `10`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTypeNames.11")
      @js.native
      val `11`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTypeNames.12")
      @js.native
      val `12`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTypeNames.13")
      @js.native
      val `13`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTypeNames.16")
      @js.native
      val `16`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTypeNames.17")
      @js.native
      val `17`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTypeNames.18")
      @js.native
      val `18`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTypeNames.2")
      @js.native
      val `2`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTypeNames.3")
      @js.native
      val `3`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTypeNames.4")
      @js.native
      val `4`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTypeNames.5")
      @js.native
      val `5`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTypeNames.6")
      @js.native
      val `6`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTypeNames.7")
      @js.native
      val `7`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTypeNames.8")
      @js.native
      val `8`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.fieldTypeNames.9")
      @js.native
      val `9`: String = js.native
    }
    
    object geoKeyNames {
      
      @JSImport("geotiff/dist-module/geotiff", "globals.geoKeyNames.1024")
      @js.native
      val `1024`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.geoKeyNames.1025")
      @js.native
      val `1025`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.geoKeyNames.1026")
      @js.native
      val `1026`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.geoKeyNames.2048")
      @js.native
      val `2048`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.geoKeyNames.2049")
      @js.native
      val `2049`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.geoKeyNames.2050")
      @js.native
      val `2050`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.geoKeyNames.2051")
      @js.native
      val `2051`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.geoKeyNames.2052")
      @js.native
      val `2052`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.geoKeyNames.2053")
      @js.native
      val `2053`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.geoKeyNames.2054")
      @js.native
      val `2054`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.geoKeyNames.2055")
      @js.native
      val `2055`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.geoKeyNames.2056")
      @js.native
      val `2056`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.geoKeyNames.2057")
      @js.native
      val `2057`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.geoKeyNames.2058")
      @js.native
      val `2058`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.geoKeyNames.2059")
      @js.native
      val `2059`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.geoKeyNames.2060")
      @js.native
      val `2060`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.geoKeyNames.2061")
      @js.native
      val `2061`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.geoKeyNames.2062")
      @js.native
      val `2062`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.geoKeyNames.3072")
      @js.native
      val `3072`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.geoKeyNames.3073")
      @js.native
      val `3073`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.geoKeyNames.3074")
      @js.native
      val `3074`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.geoKeyNames.3075")
      @js.native
      val `3075`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.geoKeyNames.3076")
      @js.native
      val `3076`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.geoKeyNames.3077")
      @js.native
      val `3077`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.geoKeyNames.3078")
      @js.native
      val `3078`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.geoKeyNames.3079")
      @js.native
      val `3079`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.geoKeyNames.3080")
      @js.native
      val `3080`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.geoKeyNames.3081")
      @js.native
      val `3081`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.geoKeyNames.3082")
      @js.native
      val `3082`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.geoKeyNames.3083")
      @js.native
      val `3083`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.geoKeyNames.3084")
      @js.native
      val `3084`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.geoKeyNames.3085")
      @js.native
      val `3085`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.geoKeyNames.3086")
      @js.native
      val `3086`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.geoKeyNames.3087")
      @js.native
      val `3087`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.geoKeyNames.3088")
      @js.native
      val `3088`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.geoKeyNames.3089")
      @js.native
      val `3089`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.geoKeyNames.3090")
      @js.native
      val `3090`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.geoKeyNames.3091")
      @js.native
      val `3091`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.geoKeyNames.3092")
      @js.native
      val `3092`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.geoKeyNames.3093")
      @js.native
      val `3093`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.geoKeyNames.3094")
      @js.native
      val `3094`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.geoKeyNames.3095")
      @js.native
      val `3095`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.geoKeyNames.3096")
      @js.native
      val `3096`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.geoKeyNames.4096")
      @js.native
      val `4096`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.geoKeyNames.4097")
      @js.native
      val `4097`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.geoKeyNames.4098")
      @js.native
      val `4098`: String = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.geoKeyNames.4099")
      @js.native
      val `4099`: String = js.native
    }
    
    object photometricInterpretations {
      
      @JSImport("geotiff/dist-module/geotiff", "globals.photometricInterpretations.BlackIsZero")
      @js.native
      val BlackIsZero: Double = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.photometricInterpretations.CIELab")
      @js.native
      val CIELab: Double = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.photometricInterpretations.CMYK")
      @js.native
      val CMYK: Double = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.photometricInterpretations.ICCLab")
      @js.native
      val ICCLab: Double = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.photometricInterpretations.Palette")
      @js.native
      val Palette: Double = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.photometricInterpretations.RGB")
      @js.native
      val RGB: Double = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.photometricInterpretations.TransparencyMask")
      @js.native
      val TransparencyMask: Double = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.photometricInterpretations.WhiteIsZero")
      @js.native
      val WhiteIsZero: Double = js.native
      
      @JSImport("geotiff/dist-module/geotiff", "globals.photometricInterpretations.YCbCr")
      @js.native
      val YCbCr: Double = js.native
    }
  }
  
  object rgb {
    
    @JSImport("geotiff/dist-module/geotiff", "rgb")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromBlackIsZero(raster: Any, max: Any): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBlackIsZero")(raster.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
    
    inline def fromCIELab(cieLabRaster: Any): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCIELab")(cieLabRaster.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    
    inline def fromCMYK(cmykRaster: Any): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCMYK")(cmykRaster.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    
    inline def fromPalette(raster: Any, colorMap: Any): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPalette")(raster.asInstanceOf[js.Any], colorMap.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
    
    inline def fromWhiteIsZero(raster: Any, max: Any): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("fromWhiteIsZero")(raster.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
    
    inline def fromYCbCr(yCbCrRaster: Any): js.typedarray.Uint8ClampedArray = ^.asInstanceOf[js.Dynamic].applyDynamic("fromYCbCr")(yCbCrRaster.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8ClampedArray]
  }
  
  inline def setLogger(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setLogger")().asInstanceOf[Unit]
  inline def setLogger(logger: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setLogger")(logger.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def writeArrayBuffer(values: Any, metadata: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("writeArrayBuffer")(values.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  trait Dimensions extends StObject {
    
    var height: Double
    
    var width: Double
  }
  object Dimensions {
    
    inline def apply(height: Double, width: Double): Dimensions = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dimensions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Dimensions] (val x: Self) extends AnyVal {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GeoTIFFBase extends StObject {
    
    /**
      * (experimental) Reads raster data from the best fitting image. This function uses
      * the image with the lowest resolution that is still a higher resolution than the
      * requested resolution.
      * When specified, the `bbox` option is translated to the `window` option and the
      * `resX` and `resY` to `width` and `height` respectively.
      * Then, the [readRasters]{@link GeoTIFFImage#readRasters} method of the selected
      * image is called and the result returned.
      * @see GeoTIFFImage.readRasters
      * @param {import('./geotiffimage').ReadRasterOptions} [options={}] optional parameters
      * @returns {Promise<ReadRasterResult>} the decoded array(s), with `height` and `width`, as a promise
      */
    def readRasters(): js.Promise[ReadRasterResult] = js.native
    def readRasters(options: ReadRasterOptions): js.Promise[ReadRasterResult] = js.native
  }
  
  trait GeoTIFFOptions extends StObject {
    
    /**
      * whether or not decoded tiles shall be cached.
      */
    var cache: js.UndefOr[Boolean] = js.undefined
  }
  object GeoTIFFOptions {
    
    inline def apply(): GeoTIFFOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GeoTIFFOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GeoTIFFOptions] (val x: Self) extends AnyVal {
      
      inline def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
    }
  }
  
  /**
    * Data class to store the parsed file directory, geo key directory and
    * offset to the next IFD
    */
  trait ImageFileDirectory extends StObject {
    
    var fileDirectory: Any
    
    var geoKeyDirectory: Any
    
    var nextIFDByteOffset: Any
  }
  object ImageFileDirectory {
    
    inline def apply(fileDirectory: Any, geoKeyDirectory: Any, nextIFDByteOffset: Any): ImageFileDirectory = {
      val __obj = js.Dynamic.literal(fileDirectory = fileDirectory.asInstanceOf[js.Any], geoKeyDirectory = geoKeyDirectory.asInstanceOf[js.Any], nextIFDByteOffset = nextIFDByteOffset.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImageFileDirectory]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ImageFileDirectory] (val x: Self) extends AnyVal {
      
      inline def setFileDirectory(value: Any): Self = StObject.set(x, "fileDirectory", value.asInstanceOf[js.Any])
      
      inline def setGeoKeyDirectory(value: Any): Self = StObject.set(x, "geoKeyDirectory", value.asInstanceOf[js.Any])
      
      inline def setNextIFDByteOffset(value: Any): Self = StObject.set(x, "nextIFDByteOffset", value.asInstanceOf[js.Any])
    }
  }
  
  type ReadRasterResult = TypedArrayWithDimensions | TypedArrayArrayWithDimensions
  
  type TypedArray = js.typedarray.Uint8Array | js.typedarray.Int8Array | js.typedarray.Uint16Array | js.typedarray.Int16Array | js.typedarray.Uint32Array | js.typedarray.Int32Array | js.typedarray.Float32Array | js.typedarray.Float64Array
  
  @js.native
  trait TypedArrayArrayWithDimensions
    extends StObject
       with Array[TypedArray]
       with Dimensions
  
  type TypedArrayWithDimensions = TypedArray & Dimensions
}
