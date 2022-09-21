package typings.dxf

import typings.dxf.dxfMod.ColorNumber
import typings.dxf.dxfMod.UnitTypes
import typings.dxf.entitiesMod.Entity
import typings.dxf.informationMod.Property
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object insertMod {
  
  @JSImport("dxf/handlers/entity/insert", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("dxf/handlers/entity/insert", "TYPE")
  @js.native
  val TYPE: String = js.native
  
  inline def process(value: Property): InsertEntityData = ^.asInstanceOf[js.Dynamic].applyDynamic("process")(value.asInstanceOf[js.Any]).asInstanceOf[InsertEntityData]
  
  /* Inlined {  block :any,   x :number,   y :number,   z :number,   scaleX :number,   scaleY :number,   scaleZ :number,   columnSpacing :number,   rowSpacing :number,   rotation :number,   columnCount :number,   rowCount :number,   extrusionX :any,   extrusionY :any,   extrusionZ :any} & std.Partial<dxf.dxf/handlers/entity/common.CommonEntityData> */
  trait InsertEntityData
    extends StObject
       with Entity {
    
    @JSName("$INSUNITS")
    var $INSUNITS: js.UndefOr[UnitTypes] = js.undefined
    
    var TYPE: js.UndefOr[String] = js.undefined
    
    var block: Any
    
    var colorNumber: js.UndefOr[ColorNumber] = js.undefined
    
    var columnCount: Double
    
    var columnSpacing: Double
    
    var extrusionX: Any & js.UndefOr[Any]
    
    var extrusionY: Any & js.UndefOr[Any]
    
    var extrusionZ: Any & js.UndefOr[Any]
    
    var layer: js.UndefOr[String] = js.undefined
    
    var lineTypeName: js.UndefOr[String] = js.undefined
    
    var lineTypeScale: js.UndefOr[Any] = js.undefined
    
    var rotation: Double
    
    var rowCount: Double
    
    var rowSpacing: Double
    
    var scaleX: Double
    
    var scaleY: Double
    
    var scaleZ: Double
    
    var visible: js.UndefOr[Boolean] = js.undefined
    
    var x: Double
    
    var y: Double
    
    var z: Double
  }
  object InsertEntityData {
    
    inline def apply(
      block: Any,
      columnCount: Double,
      columnSpacing: Double,
      extrusionX: Any & js.UndefOr[Any],
      extrusionY: Any & js.UndefOr[Any],
      extrusionZ: Any & js.UndefOr[Any],
      rotation: Double,
      rowCount: Double,
      rowSpacing: Double,
      scaleX: Double,
      scaleY: Double,
      scaleZ: Double,
      x: Double,
      y: Double,
      z: Double
    ): InsertEntityData = {
      val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], columnCount = columnCount.asInstanceOf[js.Any], columnSpacing = columnSpacing.asInstanceOf[js.Any], extrusionX = extrusionX.asInstanceOf[js.Any], extrusionY = extrusionY.asInstanceOf[js.Any], extrusionZ = extrusionZ.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], rowCount = rowCount.asInstanceOf[js.Any], rowSpacing = rowSpacing.asInstanceOf[js.Any], scaleX = scaleX.asInstanceOf[js.Any], scaleY = scaleY.asInstanceOf[js.Any], scaleZ = scaleZ.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
      __obj.asInstanceOf[InsertEntityData]
    }
    
    extension [Self <: InsertEntityData](x: Self) {
      
      inline def set$INSUNITS(value: UnitTypes): Self = StObject.set(x, "$INSUNITS", value.asInstanceOf[js.Any])
      
      inline def set$INSUNITSUndefined: Self = StObject.set(x, "$INSUNITS", js.undefined)
      
      inline def setBlock(value: Any): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
      
      inline def setColorNumber(value: ColorNumber): Self = StObject.set(x, "colorNumber", value.asInstanceOf[js.Any])
      
      inline def setColorNumberUndefined: Self = StObject.set(x, "colorNumber", js.undefined)
      
      inline def setColumnCount(value: Double): Self = StObject.set(x, "columnCount", value.asInstanceOf[js.Any])
      
      inline def setColumnSpacing(value: Double): Self = StObject.set(x, "columnSpacing", value.asInstanceOf[js.Any])
      
      inline def setExtrusionX(value: Any & js.UndefOr[Any]): Self = StObject.set(x, "extrusionX", value.asInstanceOf[js.Any])
      
      inline def setExtrusionY(value: Any & js.UndefOr[Any]): Self = StObject.set(x, "extrusionY", value.asInstanceOf[js.Any])
      
      inline def setExtrusionZ(value: Any & js.UndefOr[Any]): Self = StObject.set(x, "extrusionZ", value.asInstanceOf[js.Any])
      
      inline def setLayer(value: String): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
      
      inline def setLayerUndefined: Self = StObject.set(x, "layer", js.undefined)
      
      inline def setLineTypeName(value: String): Self = StObject.set(x, "lineTypeName", value.asInstanceOf[js.Any])
      
      inline def setLineTypeNameUndefined: Self = StObject.set(x, "lineTypeName", js.undefined)
      
      inline def setLineTypeScale(value: Any): Self = StObject.set(x, "lineTypeScale", value.asInstanceOf[js.Any])
      
      inline def setLineTypeScaleUndefined: Self = StObject.set(x, "lineTypeScale", js.undefined)
      
      inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
      
      inline def setRowCount(value: Double): Self = StObject.set(x, "rowCount", value.asInstanceOf[js.Any])
      
      inline def setRowSpacing(value: Double): Self = StObject.set(x, "rowSpacing", value.asInstanceOf[js.Any])
      
      inline def setScaleX(value: Double): Self = StObject.set(x, "scaleX", value.asInstanceOf[js.Any])
      
      inline def setScaleY(value: Double): Self = StObject.set(x, "scaleY", value.asInstanceOf[js.Any])
      
      inline def setScaleZ(value: Double): Self = StObject.set(x, "scaleZ", value.asInstanceOf[js.Any])
      
      inline def setTYPE(value: String): Self = StObject.set(x, "TYPE", value.asInstanceOf[js.Any])
      
      inline def setTYPEUndefined: Self = StObject.set(x, "TYPE", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
    }
  }
}
