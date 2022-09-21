package typings.gdal

import typings.gdal.anon.GeoTransform
import typings.gdal.gdalStrings.lat
import typings.gdal.gdalStrings.long
import typings.gdal.gdalStrings.r
import typings.gdal.gdalStrings.rPlussign
import typings.gdal.gdalStrings.w
import typings.gdal.mod.ContourGenerateOptions
import typings.gdal.mod.Dataset
import typings.gdal.mod.Envelope3DBounds
import typings.gdal.mod.EnvelopeBounds
import typings.gdal.mod.FillNoDataOptions
import typings.gdal.mod.GDALDrivers
import typings.gdal.mod.Layer
import typings.gdal.mod.PolygonizeOptions
import typings.gdal.mod.RasterBand
import typings.gdal.mod.ReprojectImageOptions
import typings.gdal.mod.SieveFilterOptions
import typings.gdal.mod.SuggestedWarpOutputOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gdal {
    
    @JSGlobal("gdal")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("gdal.CE_Debug")
    @js.native
    val CEDebug: Double = js.native
    
    @JSGlobal("gdal.CE_Failure")
    @js.native
    val CEFailure: Double = js.native
    
    @JSGlobal("gdal.CE_Fatal")
    @js.native
    val CEFatal: Double = js.native
    
    @JSGlobal("gdal.CE_None")
    @js.native
    val CENone: Double = js.native
    
    @JSGlobal("gdal.CE_Warning")
    @js.native
    val CEWarning: Double = js.native
    
    @JSGlobal("gdal.CPLE_AppDefined")
    @js.native
    val CPLEAppDefined: Double = js.native
    
    @JSGlobal("gdal.CPLE_AssertionFailed")
    @js.native
    val CPLEAssertionFailed: Double = js.native
    
    @JSGlobal("gdal.CPLE_FileIO")
    @js.native
    val CPLEFileIO: Double = js.native
    
    @JSGlobal("gdal.CPLE_IllegalArg")
    @js.native
    val CPLEIllegalArg: Double = js.native
    
    @JSGlobal("gdal.CPLE_NoWriteAccess")
    @js.native
    val CPLENoWriteAccess: Double = js.native
    
    @JSGlobal("gdal.CPLE_None")
    @js.native
    val CPLENone: Double = js.native
    
    @JSGlobal("gdal.CPLE_NotSupported")
    @js.native
    val CPLENotSupported: Double = js.native
    
    @JSGlobal("gdal.CPLE_ObjectNull")
    @js.native
    val CPLEObjectNull: Double = js.native
    
    @JSGlobal("gdal.CPLE_OpenFailed")
    @js.native
    val CPLEOpenFailed: Double = js.native
    
    @JSGlobal("gdal.CPLE_OutOfMemory")
    @js.native
    val CPLEOutOfMemory: Double = js.native
    
    @JSGlobal("gdal.CPLE_UserInterrupt")
    @js.native
    val CPLEUserInterrupt: Double = js.native
    
    @JSGlobal("gdal.CoordinateTransformation")
    @js.native
    open class CoordinateTransformation protected ()
      extends typings.gdal.mod.CoordinateTransformation {
      def this(source: typings.gdal.mod.SpatialReference, target: Dataset) = this()
      def this(source: typings.gdal.mod.SpatialReference, target: typings.gdal.mod.SpatialReference) = this()
    }
    
    @JSGlobal("gdal.DCAP_CREATE")
    @js.native
    val DCAP_CREATE: String = js.native
    
    @JSGlobal("gdal.DCAP_CREATECOPY")
    @js.native
    val DCAP_CREATECOPY: String = js.native
    
    @JSGlobal("gdal.DCAP_VIRTUALIO")
    @js.native
    val DCAP_VIRTUALIO: String = js.native
    
    @JSGlobal("gdal.DMD_CREATIONDATATYPES")
    @js.native
    val DMD_CREATIONDATATYPES: String = js.native
    
    @JSGlobal("gdal.DMD_CREATIONOPTIONLIST")
    @js.native
    val DMD_CREATIONOPTIONLIST: String = js.native
    
    @JSGlobal("gdal.DMD_EXTENSION")
    @js.native
    val DMD_EXTENSION: String = js.native
    
    @JSGlobal("gdal.DMD_HELPTOPIC")
    @js.native
    val DMD_HELPTOPIC: String = js.native
    
    @JSGlobal("gdal.DMD_LONGNAME")
    @js.native
    val DMD_LONGNAME: String = js.native
    
    @JSGlobal("gdal.DMD_MIMETYPE")
    @js.native
    val DMD_MIMETYPE: String = js.native
    
    @JSGlobal("gdal.Envelope")
    @js.native
    open class Envelope protected ()
      extends typings.gdal.mod.Envelope {
      def this(bounds: EnvelopeBounds) = this()
    }
    
    @JSGlobal("gdal.Envelope3D")
    @js.native
    open class Envelope3D protected ()
      extends typings.gdal.mod.Envelope3D {
      def this(bounds: Envelope3DBounds) = this()
    }
    
    @JSGlobal("gdal.Feature")
    @js.native
    open class Feature protected ()
      extends typings.gdal.mod.Feature {
      def this(definition: typings.gdal.mod.FeatureDefn) = this()
      def this(definition: Layer) = this()
    }
    
    @JSGlobal("gdal.FeatureDefn")
    @js.native
    open class FeatureDefn ()
      extends typings.gdal.mod.FeatureDefn
    
    @JSGlobal("gdal.FieldDefn")
    @js.native
    open class FieldDefn protected ()
      extends typings.gdal.mod.FieldDefn {
      def this(name: String, `type`: String) = this()
    }
    
    @JSGlobal("gdal.GCI_AlphaBand")
    @js.native
    val GCIAlphaBand: String = js.native
    
    @JSGlobal("gdal.GCI_BlackBand")
    @js.native
    val GCIBlackBand: String = js.native
    
    @JSGlobal("gdal.GCI_BlueBand")
    @js.native
    val GCIBlueBand: String = js.native
    
    @JSGlobal("gdal.GCI_CyanBand")
    @js.native
    val GCICyanBand: String = js.native
    
    @JSGlobal("gdal.GCI_GrayIndex")
    @js.native
    val GCIGrayIndex: String = js.native
    
    @JSGlobal("gdal.GCI_GreenBand")
    @js.native
    val GCIGreenBand: String = js.native
    
    @JSGlobal("gdal.GCI_HueBand")
    @js.native
    val GCIHueBand: String = js.native
    
    @JSGlobal("gdal.GCI_LightnessBand")
    @js.native
    val GCILightnessBand: String = js.native
    
    @JSGlobal("gdal.GCI_MagentaBand")
    @js.native
    val GCIMagentaBand: String = js.native
    
    @JSGlobal("gdal.GCI_PaletteIndex")
    @js.native
    val GCIPaletteIndex: String = js.native
    
    @JSGlobal("gdal.GCI_RedBand")
    @js.native
    val GCIRedBand: String = js.native
    
    @JSGlobal("gdal.GCI_SaturationBand")
    @js.native
    val GCISaturationBand: String = js.native
    
    @JSGlobal("gdal.GCI_Undefined")
    @js.native
    val GCIUndefined: String = js.native
    
    @JSGlobal("gdal.GCI_YCbCr_CbBand")
    @js.native
    val GCIYCbCrCbBand: String = js.native
    
    @JSGlobal("gdal.GCI_YCbCr_CrBand")
    @js.native
    val GCIYCbCrCrBand: String = js.native
    
    @JSGlobal("gdal.GCI_YCbCr_YBand")
    @js.native
    val GCIYCbCrYBand: String = js.native
    
    @JSGlobal("gdal.GCI_YellowBand")
    @js.native
    val GCIYellowBand: String = js.native
    
    @JSGlobal("gdal.GDT_Byte")
    @js.native
    val GDTByte: String = js.native
    
    @JSGlobal("gdal.GDT_CFloat32")
    @js.native
    val GDTCFloat32: String = js.native
    
    @JSGlobal("gdal.GDT_CFloat64")
    @js.native
    val GDTCFloat64: String = js.native
    
    @JSGlobal("gdal.GDT_CInt16")
    @js.native
    val GDTCInt16: String = js.native
    
    @JSGlobal("gdal.GDT_CInt32")
    @js.native
    val GDTCInt32: String = js.native
    
    @JSGlobal("gdal.GDT_Float32")
    @js.native
    val GDTFloat32: String = js.native
    
    @JSGlobal("gdal.GDT_Float64")
    @js.native
    val GDTFloat64: String = js.native
    
    @JSGlobal("gdal.GDT_Int16")
    @js.native
    val GDTInt16: String = js.native
    
    @JSGlobal("gdal.GDT_Int32")
    @js.native
    val GDTInt32: String = js.native
    
    @JSGlobal("gdal.GDT_UInt16")
    @js.native
    val GDTUInt16: String = js.native
    
    @JSGlobal("gdal.GDT_UInt32")
    @js.native
    val GDTUInt32: String = js.native
    
    @JSGlobal("gdal.GDT_Unknown")
    @js.native
    val GDTUnknown: String = js.native
    
    @JSGlobal("gdal.GRA_Average")
    @js.native
    val GRAAverage: String = js.native
    
    @JSGlobal("gdal.GRA_Bilinear")
    @js.native
    val GRABilinear: String = js.native
    
    @JSGlobal("gdal.GRA_Cubic")
    @js.native
    val GRACubic: String = js.native
    
    @JSGlobal("gdal.GRA_CubicSpline")
    @js.native
    val GRACubicSpline: String = js.native
    
    @JSGlobal("gdal.GRA_Lanczos")
    @js.native
    val GRALanczos: String = js.native
    
    @JSGlobal("gdal.GRA_Mode")
    @js.native
    val GRAMode: String = js.native
    
    @JSGlobal("gdal.GRA_NearestNeighbor")
    @js.native
    val GRANearestNeighbor: String = js.native
    
    @JSGlobal("gdal.Geometry")
    @js.native
    abstract class Geometry ()
      extends typings.gdal.mod.Geometry
    /* static members */
    object Geometry {
      
      @JSGlobal("gdal.Geometry")
      @js.native
      val ^ : js.Any = js.native
      
      inline def create(`type`: Double): typings.gdal.mod.Geometry = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(`type`.asInstanceOf[js.Any]).asInstanceOf[typings.gdal.mod.Geometry]
      
      inline def fromGeoJson(geojson: js.Object): typings.gdal.mod.Geometry = ^.asInstanceOf[js.Dynamic].applyDynamic("fromGeoJson")(geojson.asInstanceOf[js.Any]).asInstanceOf[typings.gdal.mod.Geometry]
      inline def fromGeoJson(geojson: js.Object, srs: typings.gdal.mod.SpatialReference): typings.gdal.mod.Geometry = (^.asInstanceOf[js.Dynamic].applyDynamic("fromGeoJson")(geojson.asInstanceOf[js.Any], srs.asInstanceOf[js.Any])).asInstanceOf[typings.gdal.mod.Geometry]
      
      inline def fromWKB(wkb: Double): typings.gdal.mod.Geometry = ^.asInstanceOf[js.Dynamic].applyDynamic("fromWKB")(wkb.asInstanceOf[js.Any]).asInstanceOf[typings.gdal.mod.Geometry]
      inline def fromWKB(wkb: Double, srs: typings.gdal.mod.SpatialReference): typings.gdal.mod.Geometry = (^.asInstanceOf[js.Dynamic].applyDynamic("fromWKB")(wkb.asInstanceOf[js.Any], srs.asInstanceOf[js.Any])).asInstanceOf[typings.gdal.mod.Geometry]
      
      inline def fromWKT(wkt: String): typings.gdal.mod.Geometry = ^.asInstanceOf[js.Dynamic].applyDynamic("fromWKT")(wkt.asInstanceOf[js.Any]).asInstanceOf[typings.gdal.mod.Geometry]
      inline def fromWKT(wkt: String, srs: typings.gdal.mod.SpatialReference): typings.gdal.mod.Geometry = (^.asInstanceOf[js.Dynamic].applyDynamic("fromWKT")(wkt.asInstanceOf[js.Any], srs.asInstanceOf[js.Any])).asInstanceOf[typings.gdal.mod.Geometry]
      
      inline def getConstructor(`type`: Double): typings.gdal.mod.Geometry = ^.asInstanceOf[js.Dynamic].applyDynamic("getConstructor")(`type`.asInstanceOf[js.Any]).asInstanceOf[typings.gdal.mod.Geometry]
      
      inline def getName(`type`: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getName")(`type`.asInstanceOf[js.Any]).asInstanceOf[String]
    }
    
    @JSGlobal("gdal.GeometryCollection")
    @js.native
    open class GeometryCollection ()
      extends typings.gdal.mod.GeometryCollection
    
    @JSGlobal("gdal.LineString")
    @js.native
    open class LineString ()
      extends typings.gdal.mod.LineString
    
    @JSGlobal("gdal.LinearRing")
    @js.native
    open class LinearRing ()
      extends typings.gdal.mod.LinearRing
    
    @JSGlobal("gdal.MultiLineString")
    @js.native
    open class MultiLineString ()
      extends typings.gdal.mod.MultiLineString
    
    @JSGlobal("gdal.MultiPoint")
    @js.native
    open class MultiPoint ()
      extends typings.gdal.mod.MultiPoint
    
    @JSGlobal("gdal.MultiPolygon")
    @js.native
    open class MultiPolygon ()
      extends typings.gdal.mod.MultiPolygon
    
    @JSGlobal("gdal.ODrCCreateDataSource")
    @js.native
    val ODrCCreateDataSource: String = js.native
    
    @JSGlobal("gdal.ODrCDeleteDataSource")
    @js.native
    val ODrCDeleteDataSource: String = js.native
    
    @JSGlobal("gdal.ODsCCreateGeomFieldAfterCreateLayer")
    @js.native
    val ODsCCreateGeomFieldAfterCreateLayer: String = js.native
    
    @JSGlobal("gdal.ODsCCreateLayer")
    @js.native
    val ODsCCreateLayer: String = js.native
    
    @JSGlobal("gdal.ODsCDeleteLayer")
    @js.native
    val ODsCDeleteLayer: String = js.native
    
    @JSGlobal("gdal.OFTBinary")
    @js.native
    val OFTBinary: String = js.native
    
    @JSGlobal("gdal.OFTDate")
    @js.native
    val OFTDate: String = js.native
    
    @JSGlobal("gdal.OFTDateTime")
    @js.native
    val OFTDateTime: String = js.native
    
    @JSGlobal("gdal.OFTInteger")
    @js.native
    val OFTInteger: String = js.native
    
    @JSGlobal("gdal.OFTIntegerList")
    @js.native
    val OFTIntegerList: String = js.native
    
    @JSGlobal("gdal.OFTReal")
    @js.native
    val OFTReal: String = js.native
    
    @JSGlobal("gdal.OFTRealList")
    @js.native
    val OFTRealList: String = js.native
    
    @JSGlobal("gdal.OFTString")
    @js.native
    val OFTString: String = js.native
    
    @JSGlobal("gdal.OFTStringList")
    @js.native
    val OFTStringList: String = js.native
    
    @JSGlobal("gdal.OFTTime")
    @js.native
    val OFTTime: String = js.native
    
    @JSGlobal("gdal.OFTWideString")
    @js.native
    val OFTWideString: String = js.native
    
    @JSGlobal("gdal.OFTWideStringList")
    @js.native
    val OFTWideStringList: String = js.native
    
    @JSGlobal("gdal.OJLeft")
    @js.native
    val OJLeft: String = js.native
    
    @JSGlobal("gdal.OJRight")
    @js.native
    val OJRight: String = js.native
    
    @JSGlobal("gdal.OJUndefined")
    @js.native
    val OJUndefined: String = js.native
    
    @JSGlobal("gdal.OLCAlterFieldDefn")
    @js.native
    val OLCAlterFieldDefn: String = js.native
    
    @JSGlobal("gdal.OLCCreateField")
    @js.native
    val OLCCreateField: String = js.native
    
    @JSGlobal("gdal.OLCCreateGeomField")
    @js.native
    val OLCCreateGeomField: String = js.native
    
    @JSGlobal("gdal.OLCDeleteFeature")
    @js.native
    val OLCDeleteFeature: String = js.native
    
    @JSGlobal("gdal.OLCDeleteField")
    @js.native
    val OLCDeleteField: String = js.native
    
    @JSGlobal("gdal.OLCFastFeatureCount")
    @js.native
    val OLCFastFeatureCount: String = js.native
    
    @JSGlobal("gdal.OLCFastGetExtent")
    @js.native
    val OLCFastGetExtent: String = js.native
    
    @JSGlobal("gdal.OLCFastSetNextByIndex")
    @js.native
    val OLCFastSetNextByIndex: String = js.native
    
    @JSGlobal("gdal.OLCFastSpatialFilter")
    @js.native
    val OLCFastSpatialFilter: String = js.native
    
    @JSGlobal("gdal.OLCIgnoreFields")
    @js.native
    val OLCIgnoreFields: String = js.native
    
    @JSGlobal("gdal.OLCRandomRead")
    @js.native
    val OLCRandomRead: String = js.native
    
    @JSGlobal("gdal.OLCRandomWrite")
    @js.native
    val OLCRandomWrite: String = js.native
    
    @JSGlobal("gdal.OLCReorderFields")
    @js.native
    val OLCReorderFields: String = js.native
    
    @JSGlobal("gdal.OLCSequentialWrite")
    @js.native
    val OLCSequentialWrite: String = js.native
    
    @JSGlobal("gdal.OLCStringsAsUTF8")
    @js.native
    val OLCStringsAsUTF8: String = js.native
    
    @JSGlobal("gdal.OLCTransactions")
    @js.native
    val OLCTransactions: String = js.native
    
    @JSGlobal("gdal.Point")
    @js.native
    open class Point protected ()
      extends typings.gdal.mod.Point {
      def this(x: Double, y: Double) = this()
      def this(x: Double, y: Double, z: Double) = this()
    }
    
    @JSGlobal("gdal.Polygon")
    @js.native
    open class Polygon ()
      extends typings.gdal.mod.Polygon
    
    @JSGlobal("gdal.SpatialReference")
    @js.native
    open class SpatialReference ()
      extends typings.gdal.mod.SpatialReference {
      def this(wkt: String) = this()
    }
    /* static members */
    object SpatialReference {
      
      @JSGlobal("gdal.SpatialReference")
      @js.native
      val ^ : js.Any = js.native
      
      inline def fromCRSURL(input: String): typings.gdal.mod.SpatialReference = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCRSURL")(input.asInstanceOf[js.Any]).asInstanceOf[typings.gdal.mod.SpatialReference]
      
      inline def fromEPSG(input: Double): typings.gdal.mod.SpatialReference = ^.asInstanceOf[js.Dynamic].applyDynamic("fromEPSG")(input.asInstanceOf[js.Any]).asInstanceOf[typings.gdal.mod.SpatialReference]
      
      inline def fromEPSGA(input: Double): typings.gdal.mod.SpatialReference = ^.asInstanceOf[js.Dynamic].applyDynamic("fromEPSGA")(input.asInstanceOf[js.Any]).asInstanceOf[typings.gdal.mod.SpatialReference]
      
      inline def fromESRI(input: js.Array[String]): typings.gdal.mod.SpatialReference = ^.asInstanceOf[js.Dynamic].applyDynamic("fromESRI")(input.asInstanceOf[js.Any]).asInstanceOf[typings.gdal.mod.SpatialReference]
      
      inline def fromMICoordSys(input: String): typings.gdal.mod.SpatialReference = ^.asInstanceOf[js.Dynamic].applyDynamic("fromMICoordSys")(input.asInstanceOf[js.Any]).asInstanceOf[typings.gdal.mod.SpatialReference]
      
      inline def fromProj4(input: String): typings.gdal.mod.SpatialReference = ^.asInstanceOf[js.Dynamic].applyDynamic("fromProj4")(input.asInstanceOf[js.Any]).asInstanceOf[typings.gdal.mod.SpatialReference]
      
      inline def fromURL(url: String): typings.gdal.mod.SpatialReference = ^.asInstanceOf[js.Dynamic].applyDynamic("fromURL")(url.asInstanceOf[js.Any]).asInstanceOf[typings.gdal.mod.SpatialReference]
      
      inline def fromURN(input: String): typings.gdal.mod.SpatialReference = ^.asInstanceOf[js.Dynamic].applyDynamic("fromURN")(input.asInstanceOf[js.Any]).asInstanceOf[typings.gdal.mod.SpatialReference]
      
      inline def fromUserInput(input: String): typings.gdal.mod.SpatialReference = ^.asInstanceOf[js.Dynamic].applyDynamic("fromUserInput")(input.asInstanceOf[js.Any]).asInstanceOf[typings.gdal.mod.SpatialReference]
      
      inline def fromWKT(wkt: String): typings.gdal.mod.SpatialReference = ^.asInstanceOf[js.Dynamic].applyDynamic("fromWKT")(wkt.asInstanceOf[js.Any]).asInstanceOf[typings.gdal.mod.SpatialReference]
      
      inline def fromWMSAUTO(input: String): typings.gdal.mod.SpatialReference = ^.asInstanceOf[js.Dynamic].applyDynamic("fromWMSAUTO")(input.asInstanceOf[js.Any]).asInstanceOf[typings.gdal.mod.SpatialReference]
      
      inline def fromXML(input: String): typings.gdal.mod.SpatialReference = ^.asInstanceOf[js.Dynamic].applyDynamic("fromXML")(input.asInstanceOf[js.Any]).asInstanceOf[typings.gdal.mod.SpatialReference]
    }
    
    inline def checksumImage(src: RasterBand): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("checksumImage")(src.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def checksumImage(src: RasterBand, x: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("checksumImage")(src.asInstanceOf[js.Any], x.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def checksumImage(src: RasterBand, x: Double, y: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("checksumImage")(src.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def checksumImage(src: RasterBand, x: Double, y: Double, w: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("checksumImage")(src.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], w.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def checksumImage(src: RasterBand, x: Double, y: Double, w: Double, h: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("checksumImage")(src.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], w.asInstanceOf[js.Any], h.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def checksumImage(src: RasterBand, x: Double, y: Double, w: Unit, h: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("checksumImage")(src.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], w.asInstanceOf[js.Any], h.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def checksumImage(src: RasterBand, x: Double, y: Unit, w: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("checksumImage")(src.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], w.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def checksumImage(src: RasterBand, x: Double, y: Unit, w: Double, h: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("checksumImage")(src.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], w.asInstanceOf[js.Any], h.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def checksumImage(src: RasterBand, x: Double, y: Unit, w: Unit, h: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("checksumImage")(src.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], w.asInstanceOf[js.Any], h.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def checksumImage(src: RasterBand, x: Unit, y: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("checksumImage")(src.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def checksumImage(src: RasterBand, x: Unit, y: Double, w: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("checksumImage")(src.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], w.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def checksumImage(src: RasterBand, x: Unit, y: Double, w: Double, h: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("checksumImage")(src.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], w.asInstanceOf[js.Any], h.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def checksumImage(src: RasterBand, x: Unit, y: Double, w: Unit, h: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("checksumImage")(src.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], w.asInstanceOf[js.Any], h.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def checksumImage(src: RasterBand, x: Unit, y: Unit, w: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("checksumImage")(src.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], w.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def checksumImage(src: RasterBand, x: Unit, y: Unit, w: Double, h: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("checksumImage")(src.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], w.asInstanceOf[js.Any], h.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def checksumImage(src: RasterBand, x: Unit, y: Unit, w: Unit, h: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("checksumImage")(src.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], w.asInstanceOf[js.Any], h.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    object config {
      
      @JSGlobal("gdal.config")
      @js.native
      val ^ : js.Any = js.native
      
      inline def get(key: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(key.asInstanceOf[js.Any]).asInstanceOf[String]
      
      inline def set(key: String, value: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
    
    inline def contourGenerate(options: ContourGenerateOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("contourGenerate")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def decToDMS(angle: Double, axis: lat | long): String = (^.asInstanceOf[js.Dynamic].applyDynamic("decToDMS")(angle.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def decToDMS(angle: Double, axis: lat | long, precision: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("decToDMS")(angle.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], precision.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @JSGlobal("gdal.drivers")
    @js.native
    val drivers: GDALDrivers = js.native
    
    inline def fillNodata(options: FillNoDataOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("fillNodata")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    object lastError {
      
      @JSGlobal("gdal.lastError")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("gdal.lastError.message")
      @js.native
      def message: Any = js.native
      inline def message_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("message")(x.asInstanceOf[js.Any])
      
      @JSGlobal("gdal.lastError.number")
      @js.native
      def number: Any = js.native
      inline def number_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("number")(x.asInstanceOf[js.Any])
      
      @JSGlobal("gdal.lastError.type")
      @js.native
      val `type`: Any = js.native
    }
    
    inline def open(path: String): Dataset = ^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any]).asInstanceOf[Dataset]
    inline def open(path: String, mode: r | rPlussign | w): Dataset = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[Dataset]
    inline def open(path: String, mode: r | rPlussign | w, drivers: String): Dataset = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], drivers.asInstanceOf[js.Any])).asInstanceOf[Dataset]
    inline def open(path: String, mode: r | rPlussign | w, drivers: js.Array[String]): Dataset = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], drivers.asInstanceOf[js.Any])).asInstanceOf[Dataset]
    inline def open(path: String, mode: Unit, drivers: String): Dataset = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], drivers.asInstanceOf[js.Any])).asInstanceOf[Dataset]
    inline def open(path: String, mode: Unit, drivers: js.Array[String]): Dataset = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], drivers.asInstanceOf[js.Any])).asInstanceOf[Dataset]
    
    inline def open_w(
      path: String,
      mode: js.UndefOr[w],
      drivers: js.UndefOr[String | js.Array[String]],
      x_size: js.UndefOr[Double],
      y_size: js.UndefOr[Double],
      band_count: js.UndefOr[Double],
      data_type: js.UndefOr[Double],
      creation_options: js.UndefOr[js.Array[String] | js.Object]
    ): Dataset = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], drivers.asInstanceOf[js.Any], x_size.asInstanceOf[js.Any], y_size.asInstanceOf[js.Any], band_count.asInstanceOf[js.Any], data_type.asInstanceOf[js.Any], creation_options.asInstanceOf[js.Any])).asInstanceOf[Dataset]
    
    inline def polygonize(options: PolygonizeOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("polygonize")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def quiet(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("quiet")().asInstanceOf[Unit]
    
    inline def reprojectImage(options: ReprojectImageOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reprojectImage")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def sieveFilter(options: SieveFilterOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("sieveFilter")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def suggestedWarpOutput(options: SuggestedWarpOutputOptions): GeoTransform = ^.asInstanceOf[js.Dynamic].applyDynamic("suggestedWarpOutput")(options.asInstanceOf[js.Any]).asInstanceOf[GeoTransform]
    
    inline def verbose(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("verbose")().asInstanceOf[Unit]
    
    @JSGlobal("gdal.version")
    @js.native
    val version: String = js.native
    
    @JSGlobal("gdal.wkb25DBit")
    @js.native
    val wkb25DBit: Double = js.native
    
    @JSGlobal("gdal.wkbGeometryCollection")
    @js.native
    val wkbGeometryCollection: Double = js.native
    
    @JSGlobal("gdal.wkbGeometryCollection25D")
    @js.native
    val wkbGeometryCollection25D: Double = js.native
    
    @JSGlobal("gdal.wkbLineString")
    @js.native
    val wkbLineString: Double = js.native
    
    @JSGlobal("gdal.wkbLineString25D")
    @js.native
    val wkbLineString25D: Double = js.native
    
    @JSGlobal("gdal.wkbLinearRing")
    @js.native
    val wkbLinearRing: String = js.native
    
    @JSGlobal("gdal.wkbLinearRing25D")
    @js.native
    val wkbLinearRing25D: Double = js.native
    
    @JSGlobal("gdal.wkbMultiLineString")
    @js.native
    val wkbMultiLineString: Double = js.native
    
    @JSGlobal("gdal.wkbMultiLineString25D")
    @js.native
    val wkbMultiLineString25D: Double = js.native
    
    @JSGlobal("gdal.wkbMultiPoint")
    @js.native
    val wkbMultiPoint: Double = js.native
    
    @JSGlobal("gdal.wkbMultiPoint25D")
    @js.native
    val wkbMultiPoint25D: Double = js.native
    
    @JSGlobal("gdal.wkbMultiPolygon")
    @js.native
    val wkbMultiPolygon: Double = js.native
    
    @JSGlobal("gdal.wkbMultiPolygon25D")
    @js.native
    val wkbMultiPolygon25D: Double = js.native
    
    @JSGlobal("gdal.wkbNDR")
    @js.native
    val wkbNDR: String = js.native
    
    @JSGlobal("gdal.wkbNone")
    @js.native
    val wkbNone: Double = js.native
    
    @JSGlobal("gdal.wkbPoint")
    @js.native
    val wkbPoint: Double = js.native
    
    @JSGlobal("gdal.wkbPoint25D")
    @js.native
    val wkbPoint25D: Double = js.native
    
    @JSGlobal("gdal.wkbPolygon")
    @js.native
    val wkbPolygon: Double = js.native
    
    @JSGlobal("gdal.wkbPolygon25D")
    @js.native
    val wkbPolygon25D: Double = js.native
    
    @JSGlobal("gdal.wkbUnknown")
    @js.native
    val wkbUnknown: Double = js.native
    
    @JSGlobal("gdal.wkbVariantIso")
    @js.native
    val wkbVariantIso: String = js.native
    
    @JSGlobal("gdal.wkbVariantOgc")
    @js.native
    val wkbVariantOgc: String = js.native
    
    @JSGlobal("gdal.wkbVariantOldOgc")
    @js.native
    val wkbVariantOldOgc: String = js.native
    
    @JSGlobal("gdal.wkbXDR")
    @js.native
    val wkbXDR: String = js.native
  }
}
