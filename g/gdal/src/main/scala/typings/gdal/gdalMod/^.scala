package typings.gdal.gdalMod

import typings.gdal.Anon_GeoTransform
import typings.gdal.gdalStrings.`r+`
import typings.gdal.gdalStrings.lat
import typings.gdal.gdalStrings.long
import typings.gdal.gdalStrings.r
import typings.gdal.gdalStrings.w
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gdal", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val CE_Debug: Double = js.native
  val CE_Failure: Double = js.native
  val CE_Fatal: Double = js.native
  val CE_None: Double = js.native
  val CE_Warning: Double = js.native
  val CPLE_AppDefined: Double = js.native
  val CPLE_AssertionFailed: Double = js.native
  val CPLE_FileIO: Double = js.native
  val CPLE_IllegalArg: Double = js.native
  val CPLE_NoWriteAccess: Double = js.native
  val CPLE_None: Double = js.native
  val CPLE_NotSupported: Double = js.native
  val CPLE_ObjectNull: Double = js.native
  val CPLE_OpenFailed: Double = js.native
  val CPLE_OutOfMemory: Double = js.native
  val CPLE_UserInterrupt: Double = js.native
  val DCAP_CREATE: String = js.native
  val DCAP_CREATECOPY: String = js.native
  val DCAP_VIRTUALIO: String = js.native
  val DMD_CREATIONDATATYPES: String = js.native
  val DMD_CREATIONOPTIONLIST: String = js.native
  val DMD_EXTENSION: String = js.native
  val DMD_HELPTOPIC: String = js.native
  val DMD_LONGNAME: String = js.native
  val DMD_MIMETYPE: String = js.native
  val GCI_AlphaBand: String = js.native
  val GCI_BlackBand: String = js.native
  val GCI_BlueBand: String = js.native
  val GCI_CyanBand: String = js.native
  val GCI_GrayIndex: String = js.native
  val GCI_GreenBand: String = js.native
  val GCI_HueBand: String = js.native
  val GCI_LightnessBand: String = js.native
  val GCI_MagentaBand: String = js.native
  val GCI_PaletteIndex: String = js.native
  val GCI_RedBand: String = js.native
  val GCI_SaturationBand: String = js.native
  val GCI_Undefined: String = js.native
  val GCI_YCbCr_CbBand: String = js.native
  val GCI_YCbCr_CrBand: String = js.native
  val GCI_YCbCr_YBand: String = js.native
  val GCI_YellowBand: String = js.native
  val GDT_Byte: String = js.native
  val GDT_CFloat32: String = js.native
  val GDT_CFloat64: String = js.native
  val GDT_CInt16: String = js.native
  val GDT_CInt32: String = js.native
  val GDT_Float32: String = js.native
  val GDT_Float64: String = js.native
  val GDT_Int16: String = js.native
  val GDT_Int32: String = js.native
  val GDT_UInt16: String = js.native
  val GDT_UInt32: String = js.native
  val GDT_Unknown: String = js.native
  val GRA_Average: String = js.native
  val GRA_Bilinear: String = js.native
  val GRA_Cubic: String = js.native
  val GRA_CubicSpline: String = js.native
  val GRA_Lanczos: String = js.native
  val GRA_Mode: String = js.native
  val GRA_NearestNeighbor: String = js.native
  val ODrCCreateDataSource: String = js.native
  val ODrCDeleteDataSource: String = js.native
  val ODsCCreateGeomFieldAfterCreateLayer: String = js.native
  val ODsCCreateLayer: String = js.native
  val ODsCDeleteLayer: String = js.native
  val OFTBinary: String = js.native
  val OFTDate: String = js.native
  val OFTDateTime: String = js.native
  val OFTInteger: String = js.native
  val OFTIntegerList: String = js.native
  val OFTReal: String = js.native
  val OFTRealList: String = js.native
  val OFTString: String = js.native
  val OFTStringList: String = js.native
  val OFTTime: String = js.native
  val OFTWideString: String = js.native
  val OFTWideStringList: String = js.native
  val OJLeft: String = js.native
  val OJRight: String = js.native
  val OJUndefined: String = js.native
  val OLCAlterFieldDefn: String = js.native
  val OLCCreateField: String = js.native
  val OLCCreateGeomField: String = js.native
  val OLCDeleteFeature: String = js.native
  val OLCDeleteField: String = js.native
  val OLCFastFeatureCount: String = js.native
  val OLCFastGetExtent: String = js.native
  val OLCFastSetNextByIndex: String = js.native
  val OLCFastSpatialFilter: String = js.native
  val OLCIgnoreFields: String = js.native
  val OLCRandomRead: String = js.native
  val OLCRandomWrite: String = js.native
  val OLCReorderFields: String = js.native
  val OLCSequentialWrite: String = js.native
  val OLCStringsAsUTF8: String = js.native
  val OLCTransactions: String = js.native
  val drivers: GDALDrivers = js.native
  val version: String = js.native
  val wkb25DBit: Double = js.native
  val wkbGeometryCollection: Double = js.native
  val wkbGeometryCollection25D: Double = js.native
  val wkbLineString: Double = js.native
  val wkbLineString25D: Double = js.native
  val wkbLinearRing: String = js.native
  val wkbLinearRing25D: Double = js.native
  val wkbMultiLineString: Double = js.native
  val wkbMultiLineString25D: Double = js.native
  val wkbMultiPoint: Double = js.native
  val wkbMultiPoint25D: Double = js.native
  val wkbMultiPolygon: Double = js.native
  val wkbMultiPolygon25D: Double = js.native
  val wkbNDR: String = js.native
  val wkbNone: Double = js.native
  val wkbPoint: Double = js.native
  val wkbPoint25D: Double = js.native
  val wkbPolygon: Double = js.native
  val wkbPolygon25D: Double = js.native
  val wkbUnknown: Double = js.native
  val wkbVariantIso: String = js.native
  val wkbVariantOgc: String = js.native
  val wkbVariantOldOgc: String = js.native
  val wkbXDR: String = js.native
  def checksumImage(src: RasterBand): Double = js.native
  def checksumImage(src: RasterBand, x: Double): Double = js.native
  def checksumImage(src: RasterBand, x: Double, y: Double): Double = js.native
  def checksumImage(src: RasterBand, x: Double, y: Double, w: Double): Double = js.native
  def checksumImage(src: RasterBand, x: Double, y: Double, w: Double, h: Double): Double = js.native
  def contourGenerate(options: ContourGenerateOptions): Unit = js.native
  @JSName("decToDMS")
  def decToDMS_lat(angle: Double, axis: lat): String = js.native
  @JSName("decToDMS")
  def decToDMS_lat(angle: Double, axis: lat, precision: Double): String = js.native
  @JSName("decToDMS")
  def decToDMS_long(angle: Double, axis: long): String = js.native
  @JSName("decToDMS")
  def decToDMS_long(angle: Double, axis: long, precision: Double): String = js.native
  def fillNodata(options: FillNoDataOptions): Unit = js.native
  def open(path: String): Dataset = js.native
  @JSName("open")
  def open_r(path: String, mode: `r+`): Dataset = js.native
  @JSName("open")
  def open_r(path: String, mode: `r+`, drivers: String): Dataset = js.native
  @JSName("open")
  def open_r(path: String, mode: `r+`, drivers: js.Array[String]): Dataset = js.native
  @JSName("open")
  def open_r(path: String, mode: r): Dataset = js.native
  @JSName("open")
  def open_r(path: String, mode: r, drivers: String): Dataset = js.native
  @JSName("open")
  def open_r(path: String, mode: r, drivers: js.Array[String]): Dataset = js.native
  @JSName("open")
  def open_w(
    path: String,
    mode: js.UndefOr[w],
    drivers: js.UndefOr[js.Array[String] | String],
    x_size: js.UndefOr[Double],
    y_size: js.UndefOr[Double],
    band_count: js.UndefOr[Double],
    data_type: js.UndefOr[Double],
    creation_options: js.UndefOr[js.Array[String] | js.Object]
  ): Dataset = js.native
  @JSName("open")
  def open_w(path: String, mode: w): Dataset = js.native
  @JSName("open")
  def open_w(path: String, mode: w, drivers: String): Dataset = js.native
  @JSName("open")
  def open_w(path: String, mode: w, drivers: js.Array[String]): Dataset = js.native
  def polygonize(options: PolygonizeOptions): Unit = js.native
  def quiet(): Unit = js.native
  def reprojectImage(options: ReprojectImageOptions): Unit = js.native
  def sieveFilter(options: SieveFilterOptions): Unit = js.native
  def suggestedWarpOutput(options: SuggestedWarpOutputOptions): Anon_GeoTransform = js.native
  def verbose(): Unit = js.native
}

