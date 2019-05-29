package typings
package gdalLib.gdalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gdal", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val CE_Debug: scala.Double = js.native
  val CE_Failure: scala.Double = js.native
  val CE_Fatal: scala.Double = js.native
  val CE_None: scala.Double = js.native
  val CE_Warning: scala.Double = js.native
  val CPLE_AppDefined: scala.Double = js.native
  val CPLE_AssertionFailed: scala.Double = js.native
  val CPLE_FileIO: scala.Double = js.native
  val CPLE_IllegalArg: scala.Double = js.native
  val CPLE_NoWriteAccess: scala.Double = js.native
  val CPLE_None: scala.Double = js.native
  val CPLE_NotSupported: scala.Double = js.native
  val CPLE_ObjectNull: scala.Double = js.native
  val CPLE_OpenFailed: scala.Double = js.native
  val CPLE_OutOfMemory: scala.Double = js.native
  val CPLE_UserInterrupt: scala.Double = js.native
  val DCAP_CREATE: java.lang.String = js.native
  val DCAP_CREATECOPY: java.lang.String = js.native
  val DCAP_VIRTUALIO: java.lang.String = js.native
  val DMD_CREATIONDATATYPES: java.lang.String = js.native
  val DMD_CREATIONOPTIONLIST: java.lang.String = js.native
  val DMD_EXTENSION: java.lang.String = js.native
  val DMD_HELPTOPIC: java.lang.String = js.native
  val DMD_LONGNAME: java.lang.String = js.native
  val DMD_MIMETYPE: java.lang.String = js.native
  val GCI_AlphaBand: java.lang.String = js.native
  val GCI_BlackBand: java.lang.String = js.native
  val GCI_BlueBand: java.lang.String = js.native
  val GCI_CyanBand: java.lang.String = js.native
  val GCI_GrayIndex: java.lang.String = js.native
  val GCI_GreenBand: java.lang.String = js.native
  val GCI_HueBand: java.lang.String = js.native
  val GCI_LightnessBand: java.lang.String = js.native
  val GCI_MagentaBand: java.lang.String = js.native
  val GCI_PaletteIndex: java.lang.String = js.native
  val GCI_RedBand: java.lang.String = js.native
  val GCI_SaturationBand: java.lang.String = js.native
  val GCI_Undefined: java.lang.String = js.native
  val GCI_YCbCr_CbBand: java.lang.String = js.native
  val GCI_YCbCr_CrBand: java.lang.String = js.native
  val GCI_YCbCr_YBand: java.lang.String = js.native
  val GCI_YellowBand: java.lang.String = js.native
  val GDT_Byte: java.lang.String = js.native
  val GDT_CFloat32: java.lang.String = js.native
  val GDT_CFloat64: java.lang.String = js.native
  val GDT_CInt16: java.lang.String = js.native
  val GDT_CInt32: java.lang.String = js.native
  val GDT_Float32: java.lang.String = js.native
  val GDT_Float64: java.lang.String = js.native
  val GDT_Int16: java.lang.String = js.native
  val GDT_Int32: java.lang.String = js.native
  val GDT_UInt16: java.lang.String = js.native
  val GDT_UInt32: java.lang.String = js.native
  val GDT_Unknown: java.lang.String = js.native
  val GRA_Average: java.lang.String = js.native
  val GRA_Bilinear: java.lang.String = js.native
  val GRA_Cubic: java.lang.String = js.native
  val GRA_CubicSpline: java.lang.String = js.native
  val GRA_Lanczos: java.lang.String = js.native
  val GRA_Mode: java.lang.String = js.native
  val GRA_NearestNeighbor: java.lang.String = js.native
  val ODrCCreateDataSource: java.lang.String = js.native
  val ODrCDeleteDataSource: java.lang.String = js.native
  val ODsCCreateGeomFieldAfterCreateLayer: java.lang.String = js.native
  val ODsCCreateLayer: java.lang.String = js.native
  val ODsCDeleteLayer: java.lang.String = js.native
  val OFTBinary: java.lang.String = js.native
  val OFTDate: java.lang.String = js.native
  val OFTDateTime: java.lang.String = js.native
  val OFTInteger: java.lang.String = js.native
  val OFTIntegerList: java.lang.String = js.native
  val OFTReal: java.lang.String = js.native
  val OFTRealList: java.lang.String = js.native
  val OFTString: java.lang.String = js.native
  val OFTStringList: java.lang.String = js.native
  val OFTTime: java.lang.String = js.native
  val OFTWideString: java.lang.String = js.native
  val OFTWideStringList: java.lang.String = js.native
  val OJLeft: java.lang.String = js.native
  val OJRight: java.lang.String = js.native
  val OJUndefined: java.lang.String = js.native
  val OLCAlterFieldDefn: java.lang.String = js.native
  val OLCCreateField: java.lang.String = js.native
  val OLCCreateGeomField: java.lang.String = js.native
  val OLCDeleteFeature: java.lang.String = js.native
  val OLCDeleteField: java.lang.String = js.native
  val OLCFastFeatureCount: java.lang.String = js.native
  val OLCFastGetExtent: java.lang.String = js.native
  val OLCFastSetNextByIndex: java.lang.String = js.native
  val OLCFastSpatialFilter: java.lang.String = js.native
  val OLCIgnoreFields: java.lang.String = js.native
  val OLCRandomRead: java.lang.String = js.native
  val OLCRandomWrite: java.lang.String = js.native
  val OLCReorderFields: java.lang.String = js.native
  val OLCSequentialWrite: java.lang.String = js.native
  val OLCStringsAsUTF8: java.lang.String = js.native
  val OLCTransactions: java.lang.String = js.native
  val drivers: GDALDrivers = js.native
  val version: java.lang.String = js.native
  val wkb25DBit: scala.Double = js.native
  val wkbGeometryCollection: scala.Double = js.native
  val wkbGeometryCollection25D: scala.Double = js.native
  val wkbLineString: scala.Double = js.native
  val wkbLineString25D: scala.Double = js.native
  val wkbLinearRing: java.lang.String = js.native
  val wkbLinearRing25D: scala.Double = js.native
  val wkbMultiLineString: scala.Double = js.native
  val wkbMultiLineString25D: scala.Double = js.native
  val wkbMultiPoint: scala.Double = js.native
  val wkbMultiPoint25D: scala.Double = js.native
  val wkbMultiPolygon: scala.Double = js.native
  val wkbMultiPolygon25D: scala.Double = js.native
  val wkbNDR: java.lang.String = js.native
  val wkbNone: scala.Double = js.native
  val wkbPoint: scala.Double = js.native
  val wkbPoint25D: scala.Double = js.native
  val wkbPolygon: scala.Double = js.native
  val wkbPolygon25D: scala.Double = js.native
  val wkbUnknown: scala.Double = js.native
  val wkbVariantIso: java.lang.String = js.native
  val wkbVariantOgc: java.lang.String = js.native
  val wkbVariantOldOgc: java.lang.String = js.native
  val wkbXDR: java.lang.String = js.native
  def checksumImage(src: RasterBand): scala.Double = js.native
  def checksumImage(src: RasterBand, x: scala.Double): scala.Double = js.native
  def checksumImage(src: RasterBand, x: scala.Double, y: scala.Double): scala.Double = js.native
  def checksumImage(src: RasterBand, x: scala.Double, y: scala.Double, w: scala.Double): scala.Double = js.native
  def checksumImage(src: RasterBand, x: scala.Double, y: scala.Double, w: scala.Double, h: scala.Double): scala.Double = js.native
  def contourGenerate(options: ContourGenerateOptions): scala.Unit = js.native
  @JSName("decToDMS")
  def decToDMS_lat(angle: scala.Double, axis: gdalLib.gdalLibStrings.lat): java.lang.String = js.native
  @JSName("decToDMS")
  def decToDMS_lat(angle: scala.Double, axis: gdalLib.gdalLibStrings.lat, precision: scala.Double): java.lang.String = js.native
  @JSName("decToDMS")
  def decToDMS_long(angle: scala.Double, axis: gdalLib.gdalLibStrings.long): java.lang.String = js.native
  @JSName("decToDMS")
  def decToDMS_long(angle: scala.Double, axis: gdalLib.gdalLibStrings.long, precision: scala.Double): java.lang.String = js.native
  def fillNodata(options: FillNoDataOptions): scala.Unit = js.native
  def open(path: java.lang.String): Dataset = js.native
  @JSName("open")
  def open_r(path: java.lang.String, mode: gdalLib.gdalLibStrings.r): Dataset = js.native
  @JSName("open")
  def open_r(path: java.lang.String, mode: gdalLib.gdalLibStrings.r, drivers: java.lang.String): Dataset = js.native
  @JSName("open")
  def open_r(path: java.lang.String, mode: gdalLib.gdalLibStrings.r, drivers: js.Array[java.lang.String]): Dataset = js.native
  @JSName("open")
  def `open_r+`(path: java.lang.String, mode: gdalLib.gdalLibStrings.`r+`): Dataset = js.native
  @JSName("open")
  def `open_r+`(path: java.lang.String, mode: gdalLib.gdalLibStrings.`r+`, drivers: java.lang.String): Dataset = js.native
  @JSName("open")
  def `open_r+`(path: java.lang.String, mode: gdalLib.gdalLibStrings.`r+`, drivers: js.Array[java.lang.String]): Dataset = js.native
  @JSName("open")
  def open_w(
    path: java.lang.String,
    mode: js.UndefOr[gdalLib.gdalLibStrings.w],
    drivers: js.UndefOr[js.Array[java.lang.String] | java.lang.String],
    x_size: js.UndefOr[scala.Double],
    y_size: js.UndefOr[scala.Double],
    band_count: js.UndefOr[scala.Double],
    data_type: js.UndefOr[scala.Double],
    creation_options: js.UndefOr[js.Array[java.lang.String] | js.Object]
  ): Dataset = js.native
  @JSName("open")
  def open_w(path: java.lang.String, mode: gdalLib.gdalLibStrings.w): Dataset = js.native
  @JSName("open")
  def open_w(path: java.lang.String, mode: gdalLib.gdalLibStrings.w, drivers: java.lang.String): Dataset = js.native
  @JSName("open")
  def open_w(path: java.lang.String, mode: gdalLib.gdalLibStrings.w, drivers: js.Array[java.lang.String]): Dataset = js.native
  def polygonize(options: PolygonizeOptions): scala.Unit = js.native
  def quiet(): scala.Unit = js.native
  def reprojectImage(options: ReprojectImageOptions): scala.Unit = js.native
  def sieveFilter(options: SieveFilterOptions): scala.Unit = js.native
  def suggestedWarpOutput(options: SuggestedWarpOutputOptions): gdalLib.Anon_GeoTransform = js.native
  def verbose(): scala.Unit = js.native
}

