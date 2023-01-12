package typings.forgeViewer.Autodesk

import org.scalablytyped.runtime.NumberDictionary
import typings.forgeViewer.Autodesk.DataVisualization.Core.SpriteViewable
import typings.forgeViewer.Autodesk.DataVisualization.Core.StreamLineBuilder
import typings.forgeViewer.Autodesk.DataVisualization.Core.SurfaceShadingData
import typings.forgeViewer.Autodesk.DataVisualization.Core.SurfaceShadingPoint
import typings.forgeViewer.Autodesk.DataVisualization.Core.ViewableData
import typings.forgeViewer.Autodesk.Edit2D.Edit2DContext
import typings.forgeViewer.Autodesk.Viewing.BubbleNode
import typings.forgeViewer.Autodesk.Viewing.Extension
import typings.forgeViewer.Autodesk.Viewing.Extensions.Snapping.Snapper
import typings.forgeViewer.Autodesk.Viewing.MeasureCommon.MeasurementTypes
import typings.forgeViewer.Autodesk.Viewing.Model
import typings.forgeViewer.Autodesk.Viewing.PixelCompare.DIFF_MODES
import typings.forgeViewer.Autodesk.Viewing.ToolInterface
import typings.forgeViewer.THREE.Box2
import typings.forgeViewer.THREE.Vector2
import typings.forgeViewer.anon.AlphaModel
import typings.forgeViewer.anon.B
import typings.forgeViewer.anon.CalibrationFactor
import typings.forgeViewer.anon.Color
import typings.forgeViewer.anon.HeatmapConfig
import typings.forgeViewer.anon.PlacePosition
import typings.forgeViewer.anon.X
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Extensions {
  
  object CompGeom {
    
    trait ComplexPolygon extends StObject {
      
      def addContour(indices: js.Array[Double]): Unit
      
      def pointInContour(x: Double, y: Double, cntr: js.Array[Double]): Boolean
      
      def pointInPolygon(x: Double, y: Double): Boolean
      
      def triangulate(): Unit
    }
    object ComplexPolygon {
      
      inline def apply(
        addContour: js.Array[Double] => Unit,
        pointInContour: (Double, Double, js.Array[Double]) => Boolean,
        pointInPolygon: (Double, Double) => Boolean,
        triangulate: () => Unit
      ): ComplexPolygon = {
        val __obj = js.Dynamic.literal(addContour = js.Any.fromFunction1(addContour), pointInContour = js.Any.fromFunction3(pointInContour), pointInPolygon = js.Any.fromFunction2(pointInPolygon), triangulate = js.Any.fromFunction0(triangulate))
        __obj.asInstanceOf[ComplexPolygon]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: ComplexPolygon] (val x: Self) extends AnyVal {
        
        inline def setAddContour(value: js.Array[Double] => Unit): Self = StObject.set(x, "addContour", js.Any.fromFunction1(value))
        
        inline def setPointInContour(value: (Double, Double, js.Array[Double]) => Boolean): Self = StObject.set(x, "pointInContour", js.Any.fromFunction3(value))
        
        inline def setPointInPolygon(value: (Double, Double) => Boolean): Self = StObject.set(x, "pointInPolygon", js.Any.fromFunction2(value))
        
        inline def setTriangulate(value: () => Unit): Self = StObject.set(x, "triangulate", js.Any.fromFunction0(value))
      }
    }
    
    @js.native
    trait ContourSet extends StObject {
      
      def addContour(verts: js.Array[Any], skipZeroAreas: Boolean): Unit = js.native
      
      def addContourSet(cset: ContourSet): Unit = js.native
      
      def area(): Double = js.native
      
      def areaNet(): Double = js.native
      
      def containsPointFrom(cs2: ContourSet): Boolean = js.native
      
      def getThemeColor(): B = js.native
      
      def hash(): String = js.native
      
      def perimeter(): Double = js.native
      
      def stitchContours(): Unit = js.native
      
      def toExtrudedMesh(thickness: Double): Any = js.native
      
      def toPolygonMesh(packNormals: Boolean): Any = js.native
      
      def triangulate(): Unit = js.native
      def triangulate(customInsideChecker: Any): Unit = js.native
    }
    
    trait EdgeSet extends StObject {
      
      def sanitizeEdges(): Unit
      
      def snapEdges(): Unit
      
      def stitchContours(): Unit
      
      def triangulate(): Unit
    }
    object EdgeSet {
      
      inline def apply(
        sanitizeEdges: () => Unit,
        snapEdges: () => Unit,
        stitchContours: () => Unit,
        triangulate: () => Unit
      ): EdgeSet = {
        val __obj = js.Dynamic.literal(sanitizeEdges = js.Any.fromFunction0(sanitizeEdges), snapEdges = js.Any.fromFunction0(snapEdges), stitchContours = js.Any.fromFunction0(stitchContours), triangulate = js.Any.fromFunction0(triangulate))
        __obj.asInstanceOf[EdgeSet]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: EdgeSet] (val x: Self) extends AnyVal {
        
        inline def setSanitizeEdges(value: () => Unit): Self = StObject.set(x, "sanitizeEdges", js.Any.fromFunction0(value))
        
        inline def setSnapEdges(value: () => Unit): Self = StObject.set(x, "snapEdges", js.Any.fromFunction0(value))
        
        inline def setStitchContours(value: () => Unit): Self = StObject.set(x, "stitchContours", js.Any.fromFunction0(value))
        
        inline def setTriangulate(value: () => Unit): Self = StObject.set(x, "triangulate", js.Any.fromFunction0(value))
      }
    }
    
    @js.native
    trait EllipseArc extends StObject {
      
      var ccw: Boolean = js.native
      
      def computeBBox(targetBox: Box2): Box2 = js.native
      
      var cx: Double = js.native
      
      var cy: Double = js.native
      
      var endAngle: Double = js.native
      
      def getAngleDelta(): Double = js.native
      
      def getPoint(t: Double, target: Vector2): Vector2 = js.native
      
      def isValid(): Boolean = js.native
      
      var rotation: Double = js.native
      
      var rx: Double = js.native
      
      var ry: Double = js.native
      
      def set(
        cx: Double,
        cy: Double,
        rx: Double,
        ry: Double,
        rotation: Double,
        startAngle: Double,
        endAngle: Double,
        ccw: Boolean
      ): EllipseArc = js.native
      
      def setFromSvgArc(
        rx: Double,
        ry: Double,
        xAxisRotation: Double,
        largeArcFlag: Boolean,
        sweepFlag: Boolean,
        start: X,
        end: X
      ): EllipseArc = js.native
      
      var startAngle: Double = js.native
      
      def tesselate(ctx: LmvCanvasContext, maxSegments: Double, minSegmentLength: Double): Unit = js.native
      def tesselate(ctx: Path2D, maxSegments: Double, minSegmentLength: Double): Unit = js.native
    }
    
    trait IntervalTree extends StObject
    
    trait LmvCanvasContext extends StObject
    
    trait Path2D extends StObject
    
    trait Point extends StObject
    
    trait PointError extends StObject
    
    trait QuadTree extends StObject
    
    trait Triangle extends StObject
    
    trait UniquePointList extends StObject
  }
  
  @js.native
  trait DataVisualization
    extends StObject
       with Extension {
    
    def addViewables(data: ViewableData): Unit = js.native
    
    def changeOcclusion(enable: Boolean): Unit = js.native
    
    def clearHighlightedViewables(): Unit = js.native
    
    var datavizDotOverlay: Any = js.native
    
    var deviceDepthOcclusion: Boolean = js.native
    
    var hasViewables: Boolean = js.native
    
    def hideTextures(): Unit = js.native
    
    def highlightViewables(dbIds: js.Array[Double]): Unit = js.native
    def highlightViewables(dbIds: Double): Unit = js.native
    
    def invalidateViewables(dbIds: js.Array[Double], callback: js.Function1[/* viewable */ SpriteViewable, Color]): Unit = js.native
    def invalidateViewables(dbIds: Double, callback: js.Function1[/* viewable */ SpriteViewable, Color]): Unit = js.native
    
    var model: Model = js.native
    
    def registerSurfaceShadingColors(sensorType: String, colors: js.Array[Double]): Unit = js.native
    def registerSurfaceShadingColors(sensorType: String, colors: js.Array[Double], options: AlphaModel): Unit = js.native
    
    def removeAllViewables(): Unit = js.native
    
    def removeSurfaceShading(): Unit = js.native
    def removeSurfaceShading(model: Model): Unit = js.native
    
    def renderSurfaceShading(
      nodeIds: String,
      sensorType: String,
      valueCallback: js.Function2[/* device */ SurfaceShadingPoint, /* sensorType */ String, Double]
    ): Unit = js.native
    def renderSurfaceShading(
      nodeIds: String,
      sensorType: String,
      valueCallback: js.Function2[/* device */ SurfaceShadingPoint, /* sensorType */ String, Double],
      options: HeatmapConfig
    ): Unit = js.native
    def renderSurfaceShading(
      nodeIds: js.Array[String],
      sensorType: String,
      valueCallback: js.Function2[/* device */ SurfaceShadingPoint, /* sensorType */ String, Double]
    ): Unit = js.native
    def renderSurfaceShading(
      nodeIds: js.Array[String],
      sensorType: String,
      valueCallback: js.Function2[/* device */ SurfaceShadingPoint, /* sensorType */ String, Double],
      options: HeatmapConfig
    ): Unit = js.native
    
    def setupSurfaceShading(model: Model, shadingData: SurfaceShadingData): js.Promise[Unit] = js.native
    def setupSurfaceShading(model: Model, shadingData: SurfaceShadingData, options: PlacePosition): js.Promise[Unit] = js.native
    
    def showHideViewables(visible: Boolean, occlusion: Boolean): Unit = js.native
    
    def showTextures(): Unit = js.native
    
    var streamLineBuilder: StreamLineBuilder = js.native
    
    var surfaceShading: NumberDictionary[Any] = js.native
    
    def updateSurfaceShading(valueCallback: js.Function2[/* device */ SurfaceShadingPoint, /* sensorType */ String, Double]): Unit = js.native
    def updateSurfaceShading(
      valueCallback: js.Function2[/* device */ SurfaceShadingPoint, /* sensorType */ String, Double],
      options: HeatmapConfig
    ): Unit = js.native
  }
  
  object DocumentBrowser {
    
    @js.native
    trait DocumentBrowser
      extends StObject
         with Extension {
      
      var currNode: BubbleNode = js.native
      
      var geometries: js.Array[BubbleNode] = js.native
      
      def loadNextModel(): Unit = js.native
      def loadNextModel(viewerConfig: Any): Unit = js.native
      def loadNextModel(viewerConfig: Any, loadOptions: Any): Unit = js.native
      def loadNextModel(viewerConfig: Unit, loadOptions: Any): Unit = js.native
      
      def loadPrevModel(): Unit = js.native
      def loadPrevModel(viewerConfig: Any): Unit = js.native
      def loadPrevModel(viewerConfig: Any, loadOptions: Any): Unit = js.native
      def loadPrevModel(viewerConfig: Unit, loadOptions: Any): Unit = js.native
      
      var rootNode: BubbleNode = js.native
    }
  }
  
  @js.native
  trait Edit2D
    extends StObject
       with Extension {
    
    def defaultContext: Edit2DContext = js.native
    
    def defaultTools: Any = js.native
    
    def registerDefaultTools(): Unit = js.native
    
    def unregisterDefaultTools(): Unit = js.native
  }
  
  object Measure {
    
    @js.native
    trait MeasureExtension
      extends StObject
         with Extension {
      
      var activeStatus: Boolean = js.native
      
      def calibrate(requestedUnits: String, requestedSize: Double): Unit = js.native
      
      def calibrateByScale(requestedUnits: String, requestedSize: Double): Unit = js.native
      
      var calibration: Any = js.native
      
      var calibrationTool: ToolInterface = js.native
      
      def changeMeasurementType(measurementType: MeasurementTypes): Unit = js.native
      
      def deleteCurrentMeasurement(): Unit = js.native
      
      def deleteMeasurements(): Unit = js.native
      
      def enableCalibrationTool(enable: Boolean): Boolean = js.native
      
      def enableMeasureTool(enable: Boolean, measurementType: MeasurementTypes): Boolean = js.native
      
      def enterMeasurementMode(): Unit = js.native
      
      def exitMeasurementMode(): Unit = js.native
      
      def getCalibration(): Any = js.native
      
      def getCalibrationFactor(): Double = js.native
      
      def getDefaultUnit(): String = js.native
      
      def getMeasurement(): js.Object = js.native
      def getMeasurement(unitType: String): js.Object = js.native
      def getMeasurement(unitType: String, precision: Double): js.Object = js.native
      def getMeasurement(unitType: Unit, precision: Double): js.Object = js.native
      
      def getMeasurementList(): js.Array[js.Object] = js.native
      def getMeasurementList(unitType: String): js.Array[js.Object] = js.native
      def getMeasurementList(unitType: String, precision: Double): js.Array[js.Object] = js.native
      def getMeasurementList(unitType: Unit, precision: Double): js.Array[js.Object] = js.native
      
      def getPrecision(): Double = js.native
      
      def getPrecisionOptions(isFractional: Boolean): js.Array[String] = js.native
      
      def getUnitOptions(): js.Array[js.Object] = js.native
      
      def getUnits(): String = js.native
      
      def isCalibrationValid(requestedUnits: String, requestedSize: Double): Boolean = js.native
      
      def isFreeMeasureMode(): Boolean = js.native
      
      var measureTool: ToolInterface = js.native
      
      var mode: String = js.native
      
      var modes: js.Array[String] = js.native
      
      var name: String = js.native
      
      def selectMeasurementById(id: Double): Unit = js.native
      
      def setActive(active: Boolean): Boolean = js.native
      
      def setForceLeafletCalibrate(enable: Boolean): Unit = js.native
      
      def setForcePDFCalibrate(enable: Boolean): Unit = js.native
      
      def setFreeMeasureModel(allow: Boolean, useLastViewport: Boolean): Unit = js.native
      
      def setIsolateMeasure(enable: Boolean): Unit = js.native
      
      def setMeasurements(measurements: js.Array[js.Object]): Unit = js.native
      def setMeasurements(measurements: js.Object): Unit = js.native
      
      def setPrecision(precision: Double): Unit = js.native
      
      def setRestoreSessionMeasurements(enable: Boolean): Unit = js.native
      
      def setUnits(units: String): Unit = js.native
      
      var sharedMeasureConfig: CalibrationFactor = js.native
      
      def showAddCalibrationLabel(): Unit = js.native
      
      var snapper: Snapper = js.native
      
      def toggle(): Boolean = js.native
    }
  }
  
  object PixelCompare {
    
    @js.native
    trait PixelCompare
      extends StObject
         with Extension {
      
      def changeColorIntensity(value: Double): Unit = js.native
      
      def changeMainModelVisibility(visible: Boolean): Unit = js.native
      
      def changeSecondaryModelVisibility(visible: Boolean): Unit = js.native
      
      def compareTwoModels(mainModel: Double, secondaryModel: Double): Unit = js.native
      def compareTwoModels(mainModel: Double, secondaryModel: Double, mainModelInfo: Any): Unit = js.native
      def compareTwoModels(mainModel: Double, secondaryModel: Double, mainModelInfo: Any, secondaryModelInfo: Any): Unit = js.native
      def compareTwoModels(mainModel: Double, secondaryModel: Double, mainModelInfo: Unit, secondaryModelInfo: Any): Unit = js.native
      def compareTwoModels(mainModel: Double, secondaryModel: Model): Unit = js.native
      def compareTwoModels(mainModel: Double, secondaryModel: Model, mainModelInfo: Any): Unit = js.native
      def compareTwoModels(mainModel: Double, secondaryModel: Model, mainModelInfo: Any, secondaryModelInfo: Any): Unit = js.native
      def compareTwoModels(mainModel: Double, secondaryModel: Model, mainModelInfo: Unit, secondaryModelInfo: Any): Unit = js.native
      def compareTwoModels(mainModel: Model, secondaryModel: Double): Unit = js.native
      def compareTwoModels(mainModel: Model, secondaryModel: Double, mainModelInfo: Any): Unit = js.native
      def compareTwoModels(mainModel: Model, secondaryModel: Double, mainModelInfo: Any, secondaryModelInfo: Any): Unit = js.native
      def compareTwoModels(mainModel: Model, secondaryModel: Double, mainModelInfo: Unit, secondaryModelInfo: Any): Unit = js.native
      def compareTwoModels(mainModel: Model, secondaryModel: Model): Unit = js.native
      def compareTwoModels(mainModel: Model, secondaryModel: Model, mainModelInfo: Any): Unit = js.native
      def compareTwoModels(mainModel: Model, secondaryModel: Model, mainModelInfo: Any, secondaryModelInfo: Any): Unit = js.native
      def compareTwoModels(mainModel: Model, secondaryModel: Model, mainModelInfo: Unit, secondaryModelInfo: Any): Unit = js.native
      
      def getDiffMode(): DIFF_MODES = js.native
      
      def getMainModelVisibility(): Boolean = js.native
      
      def getSecondaryModelVisibility(): Boolean = js.native
      
      def getSplitPosition(): Double = js.native
      
      def resetOffset(): Unit = js.native
      
      def setChangeOffsetMode(enable: Boolean): Unit = js.native
      
      def setDiffMode(value: DIFF_MODES): Unit = js.native
      
      def setSplitLineColor(value: Double): Unit = js.native
      
      def setSplitLineWidth(value: Double): Unit = js.native
      
      def setSplitPosition(value: Double): Unit = js.native
    }
  }
  
  @js.native
  trait StringExtractor
    extends StObject
       with Extension {
    
    def extractStringsFromModel(model: Model): js.Promise[Unit] = js.native
    
    def extractStringsFromModels(): js.Promise[Any] = js.native
    
    def getDocumentStrings(): js.Promise[js.Array[String]] = js.native
  }
  
  @js.native
  trait VisualClusters
    extends StObject
       with Extension {
    
    var layoutActive: Boolean = js.native
    
    def reset(): Unit = js.native
    
    def setLayoutActive(active: Boolean): js.Promise[Unit] = js.native
  }
}
