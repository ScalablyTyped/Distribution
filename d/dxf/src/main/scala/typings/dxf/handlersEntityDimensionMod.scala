package typings.dxf

import typings.dxf.commonMod.ColorNumber
import typings.dxf.commonMod.Point3D
import typings.dxf.commonMod.UnitTypes
import typings.dxf.handlersEntitiesMod.Entity
import typings.dxf.informationMod.Property
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object handlersEntityDimensionMod {
  
  @JSImport("dxf/handlers/entity/dimension", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("dxf/handlers/entity/dimension", "TYPE")
  @js.native
  val TYPE: String = js.native
  
  inline def process(value: Property): DimensionEntityData = ^.asInstanceOf[js.Dynamic].applyDynamic("process")(value.asInstanceOf[js.Any]).asInstanceOf[DimensionEntityData]
  
  /* Inlined {  block :any,   start :dxf.dxf/Common.Point3D,   end :dxf.dxf/Common.Point3D,   textMidpoint :dxf.dxf/Common.Point3D,   measureStart :dxf.dxf/Common.Point3D,   measureEnd :dxf.dxf/Common.Point3D,   rotation :number | undefined,   horizonRotation :number | undefined,   extensionRotation :number | undefined,   textRotation :number | undefined,   attachementPoint :any,   extrudeDirection :dxf.dxf/Common.Point3D | undefined,   ordinateType :boolean | undefined,   uniqueBlockReference :boolean | undefined,   userDefinedLocation :boolean | undefined,   dimensionType :any} & std.Partial<dxf.dxf/handlers/entity/common.CommonEntityData> */
  trait DimensionEntityData
    extends StObject
       with Entity {
    
    @JSName("$INSUNITS")
    var $INSUNITS: js.UndefOr[UnitTypes] = js.undefined
    
    var TYPE: js.UndefOr[String] = js.undefined
    
    var attachementPoint: Any
    
    var block: Any
    
    var colorNumber: js.UndefOr[ColorNumber] = js.undefined
    
    var dimensionType: Any
    
    var end: Point3D
    
    var extensionRotation: js.UndefOr[Double] = js.undefined
    
    var extrudeDirection: js.UndefOr[Point3D] = js.undefined
    
    var extrusionX: js.UndefOr[Any] = js.undefined
    
    var extrusionY: js.UndefOr[Any] = js.undefined
    
    var extrusionZ: js.UndefOr[Any] = js.undefined
    
    var horizonRotation: js.UndefOr[Double] = js.undefined
    
    var layer: js.UndefOr[String] = js.undefined
    
    var lineTypeName: js.UndefOr[String] = js.undefined
    
    var lineTypeScale: js.UndefOr[Any] = js.undefined
    
    var measureEnd: Point3D
    
    var measureStart: Point3D
    
    var ordinateType: js.UndefOr[Boolean] = js.undefined
    
    var rotation: js.UndefOr[Double] = js.undefined
    
    var start: Point3D
    
    var textMidpoint: Point3D
    
    var textRotation: js.UndefOr[Double] = js.undefined
    
    var uniqueBlockReference: js.UndefOr[Boolean] = js.undefined
    
    var userDefinedLocation: js.UndefOr[Boolean] = js.undefined
    
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object DimensionEntityData {
    
    inline def apply(
      attachementPoint: Any,
      block: Any,
      dimensionType: Any,
      end: Point3D,
      measureEnd: Point3D,
      measureStart: Point3D,
      start: Point3D,
      textMidpoint: Point3D
    ): DimensionEntityData = {
      val __obj = js.Dynamic.literal(attachementPoint = attachementPoint.asInstanceOf[js.Any], block = block.asInstanceOf[js.Any], dimensionType = dimensionType.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], measureEnd = measureEnd.asInstanceOf[js.Any], measureStart = measureStart.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], textMidpoint = textMidpoint.asInstanceOf[js.Any])
      __obj.asInstanceOf[DimensionEntityData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DimensionEntityData] (val x: Self) extends AnyVal {
      
      inline def set$INSUNITS(value: UnitTypes): Self = StObject.set(x, "$INSUNITS", value.asInstanceOf[js.Any])
      
      inline def set$INSUNITSUndefined: Self = StObject.set(x, "$INSUNITS", js.undefined)
      
      inline def setAttachementPoint(value: Any): Self = StObject.set(x, "attachementPoint", value.asInstanceOf[js.Any])
      
      inline def setBlock(value: Any): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
      
      inline def setColorNumber(value: ColorNumber): Self = StObject.set(x, "colorNumber", value.asInstanceOf[js.Any])
      
      inline def setColorNumberUndefined: Self = StObject.set(x, "colorNumber", js.undefined)
      
      inline def setDimensionType(value: Any): Self = StObject.set(x, "dimensionType", value.asInstanceOf[js.Any])
      
      inline def setEnd(value: Point3D): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setExtensionRotation(value: Double): Self = StObject.set(x, "extensionRotation", value.asInstanceOf[js.Any])
      
      inline def setExtensionRotationUndefined: Self = StObject.set(x, "extensionRotation", js.undefined)
      
      inline def setExtrudeDirection(value: Point3D): Self = StObject.set(x, "extrudeDirection", value.asInstanceOf[js.Any])
      
      inline def setExtrudeDirectionUndefined: Self = StObject.set(x, "extrudeDirection", js.undefined)
      
      inline def setExtrusionX(value: Any): Self = StObject.set(x, "extrusionX", value.asInstanceOf[js.Any])
      
      inline def setExtrusionXUndefined: Self = StObject.set(x, "extrusionX", js.undefined)
      
      inline def setExtrusionY(value: Any): Self = StObject.set(x, "extrusionY", value.asInstanceOf[js.Any])
      
      inline def setExtrusionYUndefined: Self = StObject.set(x, "extrusionY", js.undefined)
      
      inline def setExtrusionZ(value: Any): Self = StObject.set(x, "extrusionZ", value.asInstanceOf[js.Any])
      
      inline def setExtrusionZUndefined: Self = StObject.set(x, "extrusionZ", js.undefined)
      
      inline def setHorizonRotation(value: Double): Self = StObject.set(x, "horizonRotation", value.asInstanceOf[js.Any])
      
      inline def setHorizonRotationUndefined: Self = StObject.set(x, "horizonRotation", js.undefined)
      
      inline def setLayer(value: String): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
      
      inline def setLayerUndefined: Self = StObject.set(x, "layer", js.undefined)
      
      inline def setLineTypeName(value: String): Self = StObject.set(x, "lineTypeName", value.asInstanceOf[js.Any])
      
      inline def setLineTypeNameUndefined: Self = StObject.set(x, "lineTypeName", js.undefined)
      
      inline def setLineTypeScale(value: Any): Self = StObject.set(x, "lineTypeScale", value.asInstanceOf[js.Any])
      
      inline def setLineTypeScaleUndefined: Self = StObject.set(x, "lineTypeScale", js.undefined)
      
      inline def setMeasureEnd(value: Point3D): Self = StObject.set(x, "measureEnd", value.asInstanceOf[js.Any])
      
      inline def setMeasureStart(value: Point3D): Self = StObject.set(x, "measureStart", value.asInstanceOf[js.Any])
      
      inline def setOrdinateType(value: Boolean): Self = StObject.set(x, "ordinateType", value.asInstanceOf[js.Any])
      
      inline def setOrdinateTypeUndefined: Self = StObject.set(x, "ordinateType", js.undefined)
      
      inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
      
      inline def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
      
      inline def setStart(value: Point3D): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setTYPE(value: String): Self = StObject.set(x, "TYPE", value.asInstanceOf[js.Any])
      
      inline def setTYPEUndefined: Self = StObject.set(x, "TYPE", js.undefined)
      
      inline def setTextMidpoint(value: Point3D): Self = StObject.set(x, "textMidpoint", value.asInstanceOf[js.Any])
      
      inline def setTextRotation(value: Double): Self = StObject.set(x, "textRotation", value.asInstanceOf[js.Any])
      
      inline def setTextRotationUndefined: Self = StObject.set(x, "textRotation", js.undefined)
      
      inline def setUniqueBlockReference(value: Boolean): Self = StObject.set(x, "uniqueBlockReference", value.asInstanceOf[js.Any])
      
      inline def setUniqueBlockReferenceUndefined: Self = StObject.set(x, "uniqueBlockReference", js.undefined)
      
      inline def setUserDefinedLocation(value: Boolean): Self = StObject.set(x, "userDefinedLocation", value.asInstanceOf[js.Any])
      
      inline def setUserDefinedLocationUndefined: Self = StObject.set(x, "userDefinedLocation", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
}
