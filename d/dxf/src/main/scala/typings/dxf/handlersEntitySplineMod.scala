package typings.dxf

import typings.dxf.commonMod.ColorNumber
import typings.dxf.commonMod.Point3D
import typings.dxf.commonMod.UnitTypes
import typings.dxf.handlersEntitiesMod.Entity
import typings.dxf.informationMod.Property
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object handlersEntitySplineMod {
  
  @JSImport("dxf/handlers/entity/spline", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait SplineTypeFlag extends StObject
  @JSImport("dxf/handlers/entity/spline", "SplineTypeFlag")
  @js.native
  object SplineTypeFlag extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[SplineTypeFlag & Double] = js.native
    
    @js.native
    sealed trait CLOSED
      extends StObject
         with SplineTypeFlag
    /* 1 */ val CLOSED: typings.dxf.handlersEntitySplineMod.SplineTypeFlag.CLOSED & Double = js.native
    
    @js.native
    sealed trait LINEAR
      extends StObject
         with SplineTypeFlag
    /* 16 */ val LINEAR: typings.dxf.handlersEntitySplineMod.SplineTypeFlag.LINEAR & Double = js.native
    
    @js.native
    sealed trait PERIODIC
      extends StObject
         with SplineTypeFlag
    /* 2 */ val PERIODIC: typings.dxf.handlersEntitySplineMod.SplineTypeFlag.PERIODIC & Double = js.native
    
    @js.native
    sealed trait PLANAR
      extends StObject
         with SplineTypeFlag
    /* 8 */ val PLANAR: typings.dxf.handlersEntitySplineMod.SplineTypeFlag.PLANAR & Double = js.native
    
    @js.native
    sealed trait RATIONAL
      extends StObject
         with SplineTypeFlag
    /* 4 */ val RATIONAL: typings.dxf.handlersEntitySplineMod.SplineTypeFlag.RATIONAL & Double = js.native
  }
  
  @JSImport("dxf/handlers/entity/spline", "TYPE")
  @js.native
  val TYPE: String = js.native
  
  inline def process(value: Property): SplineEntityData = ^.asInstanceOf[js.Dynamic].applyDynamic("process")(value.asInstanceOf[js.Any]).asInstanceOf[SplineEntityData]
  
  /* Inlined {  controlPoints :std.Array<dxf.dxf/Common.Point3D>,   controlPointTolerance :any | undefined,   knots :number,   knotTolerance :any | undefined,   weights :std.Array<number> | undefined,   fitTolerance :any | undefined,   flag :dxf.dxf/handlers/entity/spline.SplineTypeFlag | undefined,   closed :boolean | undefined,   degree :number | undefined,   numberOfKnots :number | undefined,   numberOfControlPoints :number | undefined,   numberOfFitPoints :number | undefined} & std.Partial<dxf.dxf/Common.Point3D> & std.Partial<dxf.dxf/handlers/entity/common.CommonEntityData> */
  trait SplineEntityData
    extends StObject
       with Entity {
    
    @JSName("$INSUNITS")
    var $INSUNITS: js.UndefOr[UnitTypes] = js.undefined
    
    var TYPE: js.UndefOr[String] = js.undefined
    
    var closed: js.UndefOr[Boolean] = js.undefined
    
    var colorNumber: js.UndefOr[ColorNumber] = js.undefined
    
    var controlPointTolerance: js.UndefOr[Any] = js.undefined
    
    var controlPoints: js.Array[Point3D]
    
    var degree: js.UndefOr[Double] = js.undefined
    
    var extrusionX: js.UndefOr[Any] = js.undefined
    
    var extrusionY: js.UndefOr[Any] = js.undefined
    
    var extrusionZ: js.UndefOr[Any] = js.undefined
    
    var fitTolerance: js.UndefOr[Any] = js.undefined
    
    var flag: js.UndefOr[SplineTypeFlag] = js.undefined
    
    var knotTolerance: js.UndefOr[Any] = js.undefined
    
    var knots: Double
    
    var layer: js.UndefOr[String] = js.undefined
    
    var lineTypeName: js.UndefOr[String] = js.undefined
    
    var lineTypeScale: js.UndefOr[Any] = js.undefined
    
    var numberOfControlPoints: js.UndefOr[Double] = js.undefined
    
    var numberOfFitPoints: js.UndefOr[Double] = js.undefined
    
    var numberOfKnots: js.UndefOr[Double] = js.undefined
    
    var visible: js.UndefOr[Boolean] = js.undefined
    
    var weights: js.UndefOr[js.Array[Double]] = js.undefined
    
    var x: js.UndefOr[Double] = js.undefined
    
    var y: js.UndefOr[Double] = js.undefined
    
    var z: js.UndefOr[Double] = js.undefined
  }
  object SplineEntityData {
    
    inline def apply(controlPoints: js.Array[Point3D], knots: Double): SplineEntityData = {
      val __obj = js.Dynamic.literal(controlPoints = controlPoints.asInstanceOf[js.Any], knots = knots.asInstanceOf[js.Any])
      __obj.asInstanceOf[SplineEntityData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SplineEntityData] (val x: Self) extends AnyVal {
      
      inline def set$INSUNITS(value: UnitTypes): Self = StObject.set(x, "$INSUNITS", value.asInstanceOf[js.Any])
      
      inline def set$INSUNITSUndefined: Self = StObject.set(x, "$INSUNITS", js.undefined)
      
      inline def setClosed(value: Boolean): Self = StObject.set(x, "closed", value.asInstanceOf[js.Any])
      
      inline def setClosedUndefined: Self = StObject.set(x, "closed", js.undefined)
      
      inline def setColorNumber(value: ColorNumber): Self = StObject.set(x, "colorNumber", value.asInstanceOf[js.Any])
      
      inline def setColorNumberUndefined: Self = StObject.set(x, "colorNumber", js.undefined)
      
      inline def setControlPointTolerance(value: Any): Self = StObject.set(x, "controlPointTolerance", value.asInstanceOf[js.Any])
      
      inline def setControlPointToleranceUndefined: Self = StObject.set(x, "controlPointTolerance", js.undefined)
      
      inline def setControlPoints(value: js.Array[Point3D]): Self = StObject.set(x, "controlPoints", value.asInstanceOf[js.Any])
      
      inline def setControlPointsVarargs(value: Point3D*): Self = StObject.set(x, "controlPoints", js.Array(value*))
      
      inline def setDegree(value: Double): Self = StObject.set(x, "degree", value.asInstanceOf[js.Any])
      
      inline def setDegreeUndefined: Self = StObject.set(x, "degree", js.undefined)
      
      inline def setExtrusionX(value: Any): Self = StObject.set(x, "extrusionX", value.asInstanceOf[js.Any])
      
      inline def setExtrusionXUndefined: Self = StObject.set(x, "extrusionX", js.undefined)
      
      inline def setExtrusionY(value: Any): Self = StObject.set(x, "extrusionY", value.asInstanceOf[js.Any])
      
      inline def setExtrusionYUndefined: Self = StObject.set(x, "extrusionY", js.undefined)
      
      inline def setExtrusionZ(value: Any): Self = StObject.set(x, "extrusionZ", value.asInstanceOf[js.Any])
      
      inline def setExtrusionZUndefined: Self = StObject.set(x, "extrusionZ", js.undefined)
      
      inline def setFitTolerance(value: Any): Self = StObject.set(x, "fitTolerance", value.asInstanceOf[js.Any])
      
      inline def setFitToleranceUndefined: Self = StObject.set(x, "fitTolerance", js.undefined)
      
      inline def setFlag(value: SplineTypeFlag): Self = StObject.set(x, "flag", value.asInstanceOf[js.Any])
      
      inline def setFlagUndefined: Self = StObject.set(x, "flag", js.undefined)
      
      inline def setKnotTolerance(value: Any): Self = StObject.set(x, "knotTolerance", value.asInstanceOf[js.Any])
      
      inline def setKnotToleranceUndefined: Self = StObject.set(x, "knotTolerance", js.undefined)
      
      inline def setKnots(value: Double): Self = StObject.set(x, "knots", value.asInstanceOf[js.Any])
      
      inline def setLayer(value: String): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
      
      inline def setLayerUndefined: Self = StObject.set(x, "layer", js.undefined)
      
      inline def setLineTypeName(value: String): Self = StObject.set(x, "lineTypeName", value.asInstanceOf[js.Any])
      
      inline def setLineTypeNameUndefined: Self = StObject.set(x, "lineTypeName", js.undefined)
      
      inline def setLineTypeScale(value: Any): Self = StObject.set(x, "lineTypeScale", value.asInstanceOf[js.Any])
      
      inline def setLineTypeScaleUndefined: Self = StObject.set(x, "lineTypeScale", js.undefined)
      
      inline def setNumberOfControlPoints(value: Double): Self = StObject.set(x, "numberOfControlPoints", value.asInstanceOf[js.Any])
      
      inline def setNumberOfControlPointsUndefined: Self = StObject.set(x, "numberOfControlPoints", js.undefined)
      
      inline def setNumberOfFitPoints(value: Double): Self = StObject.set(x, "numberOfFitPoints", value.asInstanceOf[js.Any])
      
      inline def setNumberOfFitPointsUndefined: Self = StObject.set(x, "numberOfFitPoints", js.undefined)
      
      inline def setNumberOfKnots(value: Double): Self = StObject.set(x, "numberOfKnots", value.asInstanceOf[js.Any])
      
      inline def setNumberOfKnotsUndefined: Self = StObject.set(x, "numberOfKnots", js.undefined)
      
      inline def setTYPE(value: String): Self = StObject.set(x, "TYPE", value.asInstanceOf[js.Any])
      
      inline def setTYPEUndefined: Self = StObject.set(x, "TYPE", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      inline def setWeights(value: js.Array[Double]): Self = StObject.set(x, "weights", value.asInstanceOf[js.Any])
      
      inline def setWeightsUndefined: Self = StObject.set(x, "weights", js.undefined)
      
      inline def setWeightsVarargs(value: Double*): Self = StObject.set(x, "weights", js.Array(value*))
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
      
      inline def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
      
      inline def setZUndefined: Self = StObject.set(x, "z", js.undefined)
    }
  }
}
