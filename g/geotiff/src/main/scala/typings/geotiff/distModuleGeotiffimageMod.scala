package typings.geotiff

import typings.geotiff.anon.EnableAlpha
import typings.geotiff.distModuleGeotiffMod.BaseDecoder
import typings.geotiff.distModuleGeotiffMod.Pool
import typings.geotiff.distModuleSourceBasesourceMod.BaseSource
import typings.std.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distModuleGeotiffimageMod {
  
  /**
    * GeoTIFF sub-file image.
    */
  @JSImport("geotiff/dist-module/geotiffimage", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with GeoTIFFImage {
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
  
  /**
    * GeoTIFF sub-file image.
    */
  @js.native
  trait GeoTIFFImage extends StObject {
    
    /**
      * Internal read function.
      * @private
      * @param {Array} imageWindow The image window in pixel coordinates
      * @param {Array} samples The selected samples (0-based indices)
      * @param {TypedArray|TypedArray[]} valueArrays The array(s) to write into
      * @param {Boolean} interleave Whether or not to write in an interleaved manner
      * @param {import("./geotiff").Pool|AbstractDecoder} poolOrDecoder the decoder or decoder pool
      * @param {number} width the width of window to be read into
      * @param {number} height the height of window to be read into
      * @param {number} resampleMethod the resampling method to be used when interpolating
      * @param {AbortSignal} [signal] An AbortSignal that may be signalled if the request is
      *                               to be aborted
      * @returns {Promise<ReadRasterResult>}
      */
    /* private */ var _readRaster: Any = js.native
    
    var dataView: js.typedarray.DataView = js.native
    
    var fileDirectory: Any = js.native
    
    var geoKeys: Any = js.native
    
    def getArrayForSample(sampleIndex: Any, size: Any): js.typedarray.Int8Array | js.typedarray.Uint8Array | js.typedarray.Int16Array | js.typedarray.Uint16Array | js.typedarray.Int32Array | js.typedarray.Uint32Array | js.typedarray.Float32Array | js.typedarray.Float64Array = js.native
    
    def getBitsPerSample(): Any = js.native
    def getBitsPerSample(sampleIndex: Double): Any = js.native
    
    def getBlockHeight(y: Any): Double = js.native
    
    def getBlockWidth(): Double = js.native
    
    /**
      * Returns the image bounding box as an array of 4 values: min-x, min-y,
      * max-x and max-y. When the image has no affine transformation, then an
      * exception is thrown.
      * @returns {Array<number>} The bounding box
      */
    def getBoundingBox(): js.Array[Double] = js.native
    
    /**
      * Calculates the number of bytes for each pixel across all samples. Only full
      * bytes are supported, an exception is thrown when this is not the case.
      * @returns {Number} the bytes per pixel
      */
    def getBytesPerPixel(): Double = js.native
    
    /**
      * Returns the associated parsed file directory.
      * @returns {Object} the parsed file directory
      */
    def getFileDirectory(): Any = js.native
    
    /**
      * Returns the parsed GDAL metadata items.
      *
      * If sample is passed to null, dataset-level metadata will be returned.
      * Otherwise only metadata specific to the provided sample will be returned.
      *
      * @param {number} [sample=null] The sample index.
      * @returns {Object}
      */
    def getGDALMetadata(): Any = js.native
    def getGDALMetadata(sample: Double): Any = js.native
    
    /**
      * Returns the GDAL nodata value
      * @returns {number|null}
      */
    def getGDALNoData(): Double | Null = js.native
    
    /**
      * Returns the associated parsed geo keys.
      * @returns {Object} the parsed geo keys
      */
    def getGeoKeys(): Any = js.native
    
    /**
      * Returns the height of the image.
      * @returns {Number} the height of the image
      */
    def getHeight(): Double = js.native
    
    /**
      * Returns the image origin as a XYZ-vector. When the image has no affine
      * transformation, then an exception is thrown.
      * @returns {Array<number>} The origin as a vector
      */
    def getOrigin(): js.Array[Double] = js.native
    
    def getReaderForSample(sampleIndex: Any): js.Function2[/* byteOffset */ Double, /* littleEndian */ js.UndefOr[Boolean], Double] = js.native
    
    /**
      * Returns the image resolution as a XYZ-vector. When the image has no affine
      * transformation, then an exception is thrown.
      * @param {GeoTIFFImage} [referenceImage=null] A reference image to calculate the resolution from
      *                                             in cases when the current image does not have the
      *                                             required tags on its own.
      * @returns {Array<number>} The resolution as a vector
      */
    def getResolution(): js.Array[Double] = js.native
    def getResolution(referenceImage: GeoTIFFImage): js.Array[Double] = js.native
    
    def getSampleByteSize(i: Any): Double = js.native
    
    def getSampleFormat(): Any = js.native
    def getSampleFormat(sampleIndex: Double): Any = js.native
    
    /**
      * Returns the number of samples per pixel.
      * @returns {Number} the number of samples per pixel
      */
    def getSamplesPerPixel(): Double = js.native
    
    /**
      * Returns an array of tiepoints.
      * @returns {Object[]}
      */
    def getTiePoints(): js.Array[Any] = js.native
    
    /**
      * Returns the height of each tile.
      * @returns {Number} the height of each tile
      */
    def getTileHeight(): Double = js.native
    
    def getTileOrStrip(x: Double, y: Double, sample: Double, poolOrDecoder: BaseDecoder): js.Promise[js.typedarray.ArrayBuffer] = js.native
    def getTileOrStrip(x: Double, y: Double, sample: Double, poolOrDecoder: BaseDecoder, signal: AbortSignal): js.Promise[js.typedarray.ArrayBuffer] = js.native
    /**
      * Returns the decoded strip or tile.
      * @param {Number} x the strip or tile x-offset
      * @param {Number} y the tile y-offset (0 for stripped images)
      * @param {Number} sample the sample to get for separated samples
      * @param {import("./geotiff").Pool|import("./geotiff").BaseDecoder} poolOrDecoder the decoder or decoder pool
      * @param {AbortSignal} [signal] An AbortSignal that may be signalled if the request is
      *                               to be aborted
      * @returns {Promise.<ArrayBuffer>}
      */
    def getTileOrStrip(x: Double, y: Double, sample: Double, poolOrDecoder: Pool): js.Promise[js.typedarray.ArrayBuffer] = js.native
    def getTileOrStrip(x: Double, y: Double, sample: Double, poolOrDecoder: Pool, signal: AbortSignal): js.Promise[js.typedarray.ArrayBuffer] = js.native
    
    /**
      * Returns the width of each tile.
      * @returns {Number} the width of each tile
      */
    def getTileWidth(): Double = js.native
    
    /**
      * Returns the width of the image.
      * @returns {Number} the width of the image
      */
    def getWidth(): Double = js.native
    
    var isTiled: Boolean = js.native
    
    var littleEndian: Boolean = js.native
    
    /**
      * Returns whether or not the pixels of the image depict an area (or point).
      * @returns {Boolean} Whether the pixels are a point
      */
    def pixelIsArea(): Boolean = js.native
    
    var planarConfiguration: Any = js.native
    
    /**
      * Reads raster data from the image as RGB. The result is always an
      * interleaved typed array.
      * Colorspaces other than RGB will be transformed to RGB, color maps expanded.
      * When no other method is applicable, the first sample is used to produce a
      * grayscale image.
      * When provided, only a subset of the raster is read for each sample.
      *
      * @param {Object} [options] optional parameters
      * @param {Array<number>} [options.window] the subset to read data from in pixels.
      * @param {boolean} [options.interleave=true] whether the data shall be read
      *                                             in one single array or separate
      *                                             arrays.
      * @param {import("./geotiff").Pool} [options.pool=null] The optional decoder pool to use.
      * @param {number} [options.width] The desired width of the output. When the width is no the
      *                                 same as the images, resampling will be performed.
      * @param {number} [options.height] The desired height of the output. When the width is no the
      *                                  same as the images, resampling will be performed.
      * @param {string} [options.resampleMethod='nearest'] The desired resampling method.
      * @param {boolean} [options.enableAlpha=false] Enable reading alpha channel if present.
      * @param {AbortSignal} [options.signal] An AbortSignal that may be signalled if the request is
      *                                       to be aborted
      * @returns {Promise<ReadRasterResult>} the RGB array as a Promise
      */
    def readRGB(): js.Promise[ReadRasterResult] = js.native
    def readRGB(param0: EnableAlpha): js.Promise[ReadRasterResult] = js.native
    
    /**
      * Reads raster data from the image. This function reads all selected samples
      * into separate arrays of the correct type for that sample or into a single
      * combined array when `interleave` is set. When provided, only a subset
      * of the raster is read for each sample.
      *
      * @param {ReadRasterOptions} [options={}] optional parameters
      * @returns {Promise<ReadRasterResult>} the decoded arrays as a promise
      */
    def readRasters(): js.Promise[ReadRasterResult] = js.native
    def readRasters(param0: ReadRasterOptions): js.Promise[ReadRasterResult] = js.native
    
    var source: BaseSource = js.native
    
    var tiles: js.Object | Null = js.native
  }
  
  trait ReadRasterOptions extends StObject {
    
    /**
      * image] the subset to read data from in
      *      geographical coordinates.
      */
    var bbox: js.UndefOr[js.Array[Double]] = js.undefined
    
    /**
      * The value to use for parts of the image
      *       outside of the images extent. When multiple
      *       samples are requested, an array of fill values
      *       can be passed.
      */
    var fillValue: js.UndefOr[Double | js.Array[Double]] = js.undefined
    
    /**
      * The desired height of the output. When the width is not the
      *       same as the images, resampling will be performed.
      */
    var height: js.UndefOr[Double] = js.undefined
    
    /**
      * whether the data shall be read
      *       in one single array or separate
      *       arrays.
      */
    var interleave: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The optional decoder pool to use.
      */
    var pool: js.UndefOr[Any] = js.undefined
    
    /**
      * The desired resampling method.
      */
    var resampleMethod: js.UndefOr[String] = js.undefined
    
    /**
      * samples] the selection of samples to read from. Default is all samples.
      */
    var samples: js.UndefOr[js.Array[Double]] = js.undefined
    
    /**
      * An AbortSignal that may be signalled if the request is
      *       to be aborted
      */
    var signal: js.UndefOr[AbortSignal] = js.undefined
    
    /**
      * The desired width of the output. When the width is not the
      *       same as the images, resampling will be performed.
      */
    var width: js.UndefOr[Double] = js.undefined
    
    /**
      * window] the subset to read data from in pixels.
      */
    var window: js.UndefOr[js.Array[Double]] = js.undefined
  }
  object ReadRasterOptions {
    
    inline def apply(): ReadRasterOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadRasterOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReadRasterOptions] (val x: Self) extends AnyVal {
      
      inline def setBbox(value: js.Array[Double]): Self = StObject.set(x, "bbox", value.asInstanceOf[js.Any])
      
      inline def setBboxUndefined: Self = StObject.set(x, "bbox", js.undefined)
      
      inline def setBboxVarargs(value: Double*): Self = StObject.set(x, "bbox", js.Array(value*))
      
      inline def setFillValue(value: Double | js.Array[Double]): Self = StObject.set(x, "fillValue", value.asInstanceOf[js.Any])
      
      inline def setFillValueUndefined: Self = StObject.set(x, "fillValue", js.undefined)
      
      inline def setFillValueVarargs(value: Double*): Self = StObject.set(x, "fillValue", js.Array(value*))
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setInterleave(value: Boolean): Self = StObject.set(x, "interleave", value.asInstanceOf[js.Any])
      
      inline def setInterleaveUndefined: Self = StObject.set(x, "interleave", js.undefined)
      
      inline def setPool(value: Any): Self = StObject.set(x, "pool", value.asInstanceOf[js.Any])
      
      inline def setPoolUndefined: Self = StObject.set(x, "pool", js.undefined)
      
      inline def setResampleMethod(value: String): Self = StObject.set(x, "resampleMethod", value.asInstanceOf[js.Any])
      
      inline def setResampleMethodUndefined: Self = StObject.set(x, "resampleMethod", js.undefined)
      
      inline def setSamples(value: js.Array[Double]): Self = StObject.set(x, "samples", value.asInstanceOf[js.Any])
      
      inline def setSamplesUndefined: Self = StObject.set(x, "samples", js.undefined)
      
      inline def setSamplesVarargs(value: Double*): Self = StObject.set(x, "samples", js.Array(value*))
      
      inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
      
      inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setWindow(value: js.Array[Double]): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
      
      inline def setWindowUndefined: Self = StObject.set(x, "window", js.undefined)
      
      inline def setWindowVarargs(value: Double*): Self = StObject.set(x, "window", js.Array(value*))
    }
  }
  
  type ReadRasterResult = typings.geotiff.distModuleGeotiffMod.ReadRasterResult
  
  type TypedArray = typings.geotiff.distModuleGeotiffMod.TypedArray
}
