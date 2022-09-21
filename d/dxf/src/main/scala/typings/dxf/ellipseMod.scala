package typings.dxf

import typings.dxf.dxfMod.ColorNumber
import typings.dxf.dxfMod.UnitTypes
import typings.dxf.entitiesMod.Entity
import typings.dxf.informationMod.Property
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ellipseMod {
  
  @JSImport("dxf/handlers/entity/ellipse", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("dxf/handlers/entity/ellipse", "TYPE")
  @js.native
  val TYPE: String = js.native
  
  inline def process(value: Property): EllipseEntityData = ^.asInstanceOf[js.Dynamic].applyDynamic("process")(value.asInstanceOf[js.Any]).asInstanceOf[EllipseEntityData]
  
  /* Inlined {  r :number | undefined,   majorX :number | undefined,   majorY :number | undefined,   majorZ :number | undefined,   axisRatio :number | undefined,   startAngle :number,   endAngle :number} & std.Partial<dxf.dxf/Common.Point3D> & std.Partial<dxf.dxf/handlers/entity/common.CommonEntityData> */
  trait EllipseEntityData
    extends StObject
       with Entity {
    
    @JSName("$INSUNITS")
    var $INSUNITS: js.UndefOr[UnitTypes] = js.undefined
    
    var TYPE: js.UndefOr[String] = js.undefined
    
    var axisRatio: js.UndefOr[Double] = js.undefined
    
    var colorNumber: js.UndefOr[ColorNumber] = js.undefined
    
    var endAngle: Double
    
    var extrusionX: js.UndefOr[Any] = js.undefined
    
    var extrusionY: js.UndefOr[Any] = js.undefined
    
    var extrusionZ: js.UndefOr[Any] = js.undefined
    
    var layer: js.UndefOr[String] = js.undefined
    
    var lineTypeName: js.UndefOr[String] = js.undefined
    
    var lineTypeScale: js.UndefOr[Any] = js.undefined
    
    var majorX: js.UndefOr[Double] = js.undefined
    
    var majorY: js.UndefOr[Double] = js.undefined
    
    var majorZ: js.UndefOr[Double] = js.undefined
    
    var r: js.UndefOr[Double] = js.undefined
    
    var startAngle: Double
    
    var visible: js.UndefOr[Boolean] = js.undefined
    
    var x: js.UndefOr[Double] = js.undefined
    
    var y: js.UndefOr[Double] = js.undefined
    
    var z: js.UndefOr[Double] = js.undefined
  }
  object EllipseEntityData {
    
    inline def apply(endAngle: Double, startAngle: Double): EllipseEntityData = {
      val __obj = js.Dynamic.literal(endAngle = endAngle.asInstanceOf[js.Any], startAngle = startAngle.asInstanceOf[js.Any])
      __obj.asInstanceOf[EllipseEntityData]
    }
    
    extension [Self <: EllipseEntityData](x: Self) {
      
      inline def set$INSUNITS(value: UnitTypes): Self = StObject.set(x, "$INSUNITS", value.asInstanceOf[js.Any])
      
      inline def set$INSUNITSUndefined: Self = StObject.set(x, "$INSUNITS", js.undefined)
      
      inline def setAxisRatio(value: Double): Self = StObject.set(x, "axisRatio", value.asInstanceOf[js.Any])
      
      inline def setAxisRatioUndefined: Self = StObject.set(x, "axisRatio", js.undefined)
      
      inline def setColorNumber(value: ColorNumber): Self = StObject.set(x, "colorNumber", value.asInstanceOf[js.Any])
      
      inline def setColorNumberUndefined: Self = StObject.set(x, "colorNumber", js.undefined)
      
      inline def setEndAngle(value: Double): Self = StObject.set(x, "endAngle", value.asInstanceOf[js.Any])
      
      inline def setExtrusionX(value: Any): Self = StObject.set(x, "extrusionX", value.asInstanceOf[js.Any])
      
      inline def setExtrusionXUndefined: Self = StObject.set(x, "extrusionX", js.undefined)
      
      inline def setExtrusionY(value: Any): Self = StObject.set(x, "extrusionY", value.asInstanceOf[js.Any])
      
      inline def setExtrusionYUndefined: Self = StObject.set(x, "extrusionY", js.undefined)
      
      inline def setExtrusionZ(value: Any): Self = StObject.set(x, "extrusionZ", value.asInstanceOf[js.Any])
      
      inline def setExtrusionZUndefined: Self = StObject.set(x, "extrusionZ", js.undefined)
      
      inline def setLayer(value: String): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
      
      inline def setLayerUndefined: Self = StObject.set(x, "layer", js.undefined)
      
      inline def setLineTypeName(value: String): Self = StObject.set(x, "lineTypeName", value.asInstanceOf[js.Any])
      
      inline def setLineTypeNameUndefined: Self = StObject.set(x, "lineTypeName", js.undefined)
      
      inline def setLineTypeScale(value: Any): Self = StObject.set(x, "lineTypeScale", value.asInstanceOf[js.Any])
      
      inline def setLineTypeScaleUndefined: Self = StObject.set(x, "lineTypeScale", js.undefined)
      
      inline def setMajorX(value: Double): Self = StObject.set(x, "majorX", value.asInstanceOf[js.Any])
      
      inline def setMajorXUndefined: Self = StObject.set(x, "majorX", js.undefined)
      
      inline def setMajorY(value: Double): Self = StObject.set(x, "majorY", value.asInstanceOf[js.Any])
      
      inline def setMajorYUndefined: Self = StObject.set(x, "majorY", js.undefined)
      
      inline def setMajorZ(value: Double): Self = StObject.set(x, "majorZ", value.asInstanceOf[js.Any])
      
      inline def setMajorZUndefined: Self = StObject.set(x, "majorZ", js.undefined)
      
      inline def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
      
      inline def setRUndefined: Self = StObject.set(x, "r", js.undefined)
      
      inline def setStartAngle(value: Double): Self = StObject.set(x, "startAngle", value.asInstanceOf[js.Any])
      
      inline def setTYPE(value: String): Self = StObject.set(x, "TYPE", value.asInstanceOf[js.Any])
      
      inline def setTYPEUndefined: Self = StObject.set(x, "TYPE", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
      
      inline def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
      
      inline def setZUndefined: Self = StObject.set(x, "z", js.undefined)
    }
  }
}
