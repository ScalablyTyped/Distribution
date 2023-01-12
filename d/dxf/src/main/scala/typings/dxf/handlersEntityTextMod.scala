package typings.dxf

import typings.dxf.commonMod.ColorNumber
import typings.dxf.commonMod.UnitTypes
import typings.dxf.handlersEntitiesMod.Entity
import typings.dxf.informationMod.Property
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object handlersEntityTextMod {
  
  @JSImport("dxf/handlers/entity/text", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("dxf/handlers/entity/text", "TYPE")
  @js.native
  val TYPE: String = js.native
  
  inline def process(value: Property): TextEntityData = ^.asInstanceOf[js.Dynamic].applyDynamic("process")(value.asInstanceOf[js.Any]).asInstanceOf[TextEntityData]
  
  /* Inlined {  string :string | undefined,   x :number | undefined,   y :number | undefined,   z :number | undefined,   x2 :number | undefined,   y2 :number | undefined,   z2 :number | undefined,   thickness :any | undefined,   textHeight :any | undefined,   relScaleX :any | undefined,   rotation :any | undefined,   obliqueAngle :any | undefined,   styleName :any | undefined,   mirror :any | undefined,   hAlign :any | undefined,   vAlign :any | undefined,   extX :any | undefined,   extY :any | undefined,   ext :any | undefined} & std.Partial<dxf.dxf/handlers/entity/common.CommonEntityData> */
  trait TextEntityData
    extends StObject
       with Entity {
    
    @JSName("$INSUNITS")
    var $INSUNITS: js.UndefOr[UnitTypes] = js.undefined
    
    var TYPE: js.UndefOr[String] = js.undefined
    
    var colorNumber: js.UndefOr[ColorNumber] = js.undefined
    
    var ext: js.UndefOr[Any] = js.undefined
    
    var extX: js.UndefOr[Any] = js.undefined
    
    var extY: js.UndefOr[Any] = js.undefined
    
    var extrusionX: js.UndefOr[Any] = js.undefined
    
    var extrusionY: js.UndefOr[Any] = js.undefined
    
    var extrusionZ: js.UndefOr[Any] = js.undefined
    
    var hAlign: js.UndefOr[Any] = js.undefined
    
    var layer: js.UndefOr[String] = js.undefined
    
    var lineTypeName: js.UndefOr[String] = js.undefined
    
    var lineTypeScale: js.UndefOr[Any] = js.undefined
    
    var mirror: js.UndefOr[Any] = js.undefined
    
    var obliqueAngle: js.UndefOr[Any] = js.undefined
    
    var relScaleX: js.UndefOr[Any] = js.undefined
    
    var rotation: js.UndefOr[Any] = js.undefined
    
    var string: js.UndefOr[String] = js.undefined
    
    var styleName: js.UndefOr[Any] = js.undefined
    
    var textHeight: js.UndefOr[Any] = js.undefined
    
    var thickness: js.UndefOr[Any] = js.undefined
    
    var vAlign: js.UndefOr[Any] = js.undefined
    
    var visible: js.UndefOr[Boolean] = js.undefined
    
    var x: js.UndefOr[Double] = js.undefined
    
    var x2: js.UndefOr[Double] = js.undefined
    
    var y: js.UndefOr[Double] = js.undefined
    
    var y2: js.UndefOr[Double] = js.undefined
    
    var z: js.UndefOr[Double] = js.undefined
    
    var z2: js.UndefOr[Double] = js.undefined
  }
  object TextEntityData {
    
    inline def apply(): TextEntityData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextEntityData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TextEntityData] (val x: Self) extends AnyVal {
      
      inline def set$INSUNITS(value: UnitTypes): Self = StObject.set(x, "$INSUNITS", value.asInstanceOf[js.Any])
      
      inline def set$INSUNITSUndefined: Self = StObject.set(x, "$INSUNITS", js.undefined)
      
      inline def setColorNumber(value: ColorNumber): Self = StObject.set(x, "colorNumber", value.asInstanceOf[js.Any])
      
      inline def setColorNumberUndefined: Self = StObject.set(x, "colorNumber", js.undefined)
      
      inline def setExt(value: Any): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
      
      inline def setExtUndefined: Self = StObject.set(x, "ext", js.undefined)
      
      inline def setExtX(value: Any): Self = StObject.set(x, "extX", value.asInstanceOf[js.Any])
      
      inline def setExtXUndefined: Self = StObject.set(x, "extX", js.undefined)
      
      inline def setExtY(value: Any): Self = StObject.set(x, "extY", value.asInstanceOf[js.Any])
      
      inline def setExtYUndefined: Self = StObject.set(x, "extY", js.undefined)
      
      inline def setExtrusionX(value: Any): Self = StObject.set(x, "extrusionX", value.asInstanceOf[js.Any])
      
      inline def setExtrusionXUndefined: Self = StObject.set(x, "extrusionX", js.undefined)
      
      inline def setExtrusionY(value: Any): Self = StObject.set(x, "extrusionY", value.asInstanceOf[js.Any])
      
      inline def setExtrusionYUndefined: Self = StObject.set(x, "extrusionY", js.undefined)
      
      inline def setExtrusionZ(value: Any): Self = StObject.set(x, "extrusionZ", value.asInstanceOf[js.Any])
      
      inline def setExtrusionZUndefined: Self = StObject.set(x, "extrusionZ", js.undefined)
      
      inline def setHAlign(value: Any): Self = StObject.set(x, "hAlign", value.asInstanceOf[js.Any])
      
      inline def setHAlignUndefined: Self = StObject.set(x, "hAlign", js.undefined)
      
      inline def setLayer(value: String): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
      
      inline def setLayerUndefined: Self = StObject.set(x, "layer", js.undefined)
      
      inline def setLineTypeName(value: String): Self = StObject.set(x, "lineTypeName", value.asInstanceOf[js.Any])
      
      inline def setLineTypeNameUndefined: Self = StObject.set(x, "lineTypeName", js.undefined)
      
      inline def setLineTypeScale(value: Any): Self = StObject.set(x, "lineTypeScale", value.asInstanceOf[js.Any])
      
      inline def setLineTypeScaleUndefined: Self = StObject.set(x, "lineTypeScale", js.undefined)
      
      inline def setMirror(value: Any): Self = StObject.set(x, "mirror", value.asInstanceOf[js.Any])
      
      inline def setMirrorUndefined: Self = StObject.set(x, "mirror", js.undefined)
      
      inline def setObliqueAngle(value: Any): Self = StObject.set(x, "obliqueAngle", value.asInstanceOf[js.Any])
      
      inline def setObliqueAngleUndefined: Self = StObject.set(x, "obliqueAngle", js.undefined)
      
      inline def setRelScaleX(value: Any): Self = StObject.set(x, "relScaleX", value.asInstanceOf[js.Any])
      
      inline def setRelScaleXUndefined: Self = StObject.set(x, "relScaleX", js.undefined)
      
      inline def setRotation(value: Any): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
      
      inline def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
      
      inline def setString(value: String): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
      
      inline def setStringUndefined: Self = StObject.set(x, "string", js.undefined)
      
      inline def setStyleName(value: Any): Self = StObject.set(x, "styleName", value.asInstanceOf[js.Any])
      
      inline def setStyleNameUndefined: Self = StObject.set(x, "styleName", js.undefined)
      
      inline def setTYPE(value: String): Self = StObject.set(x, "TYPE", value.asInstanceOf[js.Any])
      
      inline def setTYPEUndefined: Self = StObject.set(x, "TYPE", js.undefined)
      
      inline def setTextHeight(value: Any): Self = StObject.set(x, "textHeight", value.asInstanceOf[js.Any])
      
      inline def setTextHeightUndefined: Self = StObject.set(x, "textHeight", js.undefined)
      
      inline def setThickness(value: Any): Self = StObject.set(x, "thickness", value.asInstanceOf[js.Any])
      
      inline def setThicknessUndefined: Self = StObject.set(x, "thickness", js.undefined)
      
      inline def setVAlign(value: Any): Self = StObject.set(x, "vAlign", value.asInstanceOf[js.Any])
      
      inline def setVAlignUndefined: Self = StObject.set(x, "vAlign", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setX2(value: Double): Self = StObject.set(x, "x2", value.asInstanceOf[js.Any])
      
      inline def setX2Undefined: Self = StObject.set(x, "x2", js.undefined)
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setY2(value: Double): Self = StObject.set(x, "y2", value.asInstanceOf[js.Any])
      
      inline def setY2Undefined: Self = StObject.set(x, "y2", js.undefined)
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
      
      inline def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
      
      inline def setZ2(value: Double): Self = StObject.set(x, "z2", value.asInstanceOf[js.Any])
      
      inline def setZ2Undefined: Self = StObject.set(x, "z2", js.undefined)
      
      inline def setZUndefined: Self = StObject.set(x, "z", js.undefined)
    }
  }
}
