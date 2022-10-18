package typings.dxf

import typings.dxf.commonMod.ColorNumber
import typings.dxf.commonMod.UnitTypes
import typings.dxf.handlersEntitiesMod.Entity
import typings.dxf.informationMod.Property
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object handlersEntityMtextMod {
  
  @JSImport("dxf/handlers/entity/mtext", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("dxf/handlers/entity/mtext", "TYPE")
  @js.native
  val TYPE: String = js.native
  
  inline def process(value: Property): MTextEntityData = ^.asInstanceOf[js.Dynamic].applyDynamic("process")(value.asInstanceOf[js.Any]).asInstanceOf[MTextEntityData]
  
  /* Inlined {  string :string | undefined,   styleName :any | undefined,   x :any | undefined,   y :any | undefined,   z :any | undefined,   nominalTextHeight :any | undefined,   refRectangleWidth :any | undefined,   attachmentPoint :any | undefined,   drawingDirection :any | undefined,   xAxisX :any | undefined,   xAxisY :any | undefined,   xAxisZ :any | undefined,   horizontalWidth :any | undefined,   verticalHeight :any | undefined,   lineSpacingStyle :any | undefined,   lineSpacingFactor :any | undefined,   backgroundFill :any | undefined,   columnType :any | undefined,   columnCount :any | undefined,   columnFlowReversed :any | undefined,   columnAutoheight :any | undefined,   columnWidth :any | undefined,   columnGutter :any | undefined,   columnHeights :any | undefined,   fillBoxStyle :any | undefined,   bgFillColor :dxf.dxf/Common.ColorNumber | undefined,   bgColorRGB0 :dxf.dxf/Common.ColorNumber | undefined,   bgColorRGB1 :dxf.dxf/Common.ColorNumber | undefined,   bgColorRGB2 :dxf.dxf/Common.ColorNumber | undefined,   bgColorRGB3 :dxf.dxf/Common.ColorNumber | undefined,   bgColorRGB4 :dxf.dxf/Common.ColorNumber | undefined,   bgColorRGB5 :dxf.dxf/Common.ColorNumber | undefined,   bgColorRGB6 :dxf.dxf/Common.ColorNumber | undefined,   bgColorRGB7 :dxf.dxf/Common.ColorNumber | undefined,   bgColorRGB8 :dxf.dxf/Common.ColorNumber | undefined,   bgColorRGB9 :dxf.dxf/Common.ColorNumber | undefined,   bgColorName0 :string | undefined,   bgColorName1 :string | undefined,   bgColorName2 :string | undefined,   bgColorName3 :string | undefined,   bgColorName4 :string | undefined,   bgColorName5 :string | undefined,   bgColorName6 :string | undefined,   bgColorName7 :string | undefined,   bgColorName8 :string | undefined,   bgColorName9 :string | undefined,   bgFillTransparency :any | undefined} & std.Partial<dxf.dxf/handlers/entity/common.CommonEntityData> */
  trait MTextEntityData
    extends StObject
       with Entity {
    
    @JSName("$INSUNITS")
    var $INSUNITS: js.UndefOr[UnitTypes] = js.undefined
    
    var TYPE: js.UndefOr[String] = js.undefined
    
    var attachmentPoint: js.UndefOr[Any] = js.undefined
    
    var backgroundFill: js.UndefOr[Any] = js.undefined
    
    var bgColorName0: js.UndefOr[String] = js.undefined
    
    var bgColorName1: js.UndefOr[String] = js.undefined
    
    var bgColorName2: js.UndefOr[String] = js.undefined
    
    var bgColorName3: js.UndefOr[String] = js.undefined
    
    var bgColorName4: js.UndefOr[String] = js.undefined
    
    var bgColorName5: js.UndefOr[String] = js.undefined
    
    var bgColorName6: js.UndefOr[String] = js.undefined
    
    var bgColorName7: js.UndefOr[String] = js.undefined
    
    var bgColorName8: js.UndefOr[String] = js.undefined
    
    var bgColorName9: js.UndefOr[String] = js.undefined
    
    var bgColorRGB0: js.UndefOr[ColorNumber] = js.undefined
    
    var bgColorRGB1: js.UndefOr[ColorNumber] = js.undefined
    
    var bgColorRGB2: js.UndefOr[ColorNumber] = js.undefined
    
    var bgColorRGB3: js.UndefOr[ColorNumber] = js.undefined
    
    var bgColorRGB4: js.UndefOr[ColorNumber] = js.undefined
    
    var bgColorRGB5: js.UndefOr[ColorNumber] = js.undefined
    
    var bgColorRGB6: js.UndefOr[ColorNumber] = js.undefined
    
    var bgColorRGB7: js.UndefOr[ColorNumber] = js.undefined
    
    var bgColorRGB8: js.UndefOr[ColorNumber] = js.undefined
    
    var bgColorRGB9: js.UndefOr[ColorNumber] = js.undefined
    
    var bgFillColor: js.UndefOr[ColorNumber] = js.undefined
    
    var bgFillTransparency: js.UndefOr[Any] = js.undefined
    
    var colorNumber: js.UndefOr[ColorNumber] = js.undefined
    
    var columnAutoheight: js.UndefOr[Any] = js.undefined
    
    var columnCount: js.UndefOr[Any] = js.undefined
    
    var columnFlowReversed: js.UndefOr[Any] = js.undefined
    
    var columnGutter: js.UndefOr[Any] = js.undefined
    
    var columnHeights: js.UndefOr[Any] = js.undefined
    
    var columnType: js.UndefOr[Any] = js.undefined
    
    var columnWidth: js.UndefOr[Any] = js.undefined
    
    var drawingDirection: js.UndefOr[Any] = js.undefined
    
    var extrusionX: js.UndefOr[Any] = js.undefined
    
    var extrusionY: js.UndefOr[Any] = js.undefined
    
    var extrusionZ: js.UndefOr[Any] = js.undefined
    
    var fillBoxStyle: js.UndefOr[Any] = js.undefined
    
    var horizontalWidth: js.UndefOr[Any] = js.undefined
    
    var layer: js.UndefOr[String] = js.undefined
    
    var lineSpacingFactor: js.UndefOr[Any] = js.undefined
    
    var lineSpacingStyle: js.UndefOr[Any] = js.undefined
    
    var lineTypeName: js.UndefOr[String] = js.undefined
    
    var lineTypeScale: js.UndefOr[Any] = js.undefined
    
    var nominalTextHeight: js.UndefOr[Any] = js.undefined
    
    var refRectangleWidth: js.UndefOr[Any] = js.undefined
    
    var string: js.UndefOr[String] = js.undefined
    
    var styleName: js.UndefOr[Any] = js.undefined
    
    var verticalHeight: js.UndefOr[Any] = js.undefined
    
    var visible: js.UndefOr[Boolean] = js.undefined
    
    var x: js.UndefOr[Any] = js.undefined
    
    var xAxisX: js.UndefOr[Any] = js.undefined
    
    var xAxisY: js.UndefOr[Any] = js.undefined
    
    var xAxisZ: js.UndefOr[Any] = js.undefined
    
    var y: js.UndefOr[Any] = js.undefined
    
    var z: js.UndefOr[Any] = js.undefined
  }
  object MTextEntityData {
    
    inline def apply(): MTextEntityData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MTextEntityData]
    }
    
    extension [Self <: MTextEntityData](x: Self) {
      
      inline def set$INSUNITS(value: UnitTypes): Self = StObject.set(x, "$INSUNITS", value.asInstanceOf[js.Any])
      
      inline def set$INSUNITSUndefined: Self = StObject.set(x, "$INSUNITS", js.undefined)
      
      inline def setAttachmentPoint(value: Any): Self = StObject.set(x, "attachmentPoint", value.asInstanceOf[js.Any])
      
      inline def setAttachmentPointUndefined: Self = StObject.set(x, "attachmentPoint", js.undefined)
      
      inline def setBackgroundFill(value: Any): Self = StObject.set(x, "backgroundFill", value.asInstanceOf[js.Any])
      
      inline def setBackgroundFillUndefined: Self = StObject.set(x, "backgroundFill", js.undefined)
      
      inline def setBgColorName0(value: String): Self = StObject.set(x, "bgColorName0", value.asInstanceOf[js.Any])
      
      inline def setBgColorName0Undefined: Self = StObject.set(x, "bgColorName0", js.undefined)
      
      inline def setBgColorName1(value: String): Self = StObject.set(x, "bgColorName1", value.asInstanceOf[js.Any])
      
      inline def setBgColorName1Undefined: Self = StObject.set(x, "bgColorName1", js.undefined)
      
      inline def setBgColorName2(value: String): Self = StObject.set(x, "bgColorName2", value.asInstanceOf[js.Any])
      
      inline def setBgColorName2Undefined: Self = StObject.set(x, "bgColorName2", js.undefined)
      
      inline def setBgColorName3(value: String): Self = StObject.set(x, "bgColorName3", value.asInstanceOf[js.Any])
      
      inline def setBgColorName3Undefined: Self = StObject.set(x, "bgColorName3", js.undefined)
      
      inline def setBgColorName4(value: String): Self = StObject.set(x, "bgColorName4", value.asInstanceOf[js.Any])
      
      inline def setBgColorName4Undefined: Self = StObject.set(x, "bgColorName4", js.undefined)
      
      inline def setBgColorName5(value: String): Self = StObject.set(x, "bgColorName5", value.asInstanceOf[js.Any])
      
      inline def setBgColorName5Undefined: Self = StObject.set(x, "bgColorName5", js.undefined)
      
      inline def setBgColorName6(value: String): Self = StObject.set(x, "bgColorName6", value.asInstanceOf[js.Any])
      
      inline def setBgColorName6Undefined: Self = StObject.set(x, "bgColorName6", js.undefined)
      
      inline def setBgColorName7(value: String): Self = StObject.set(x, "bgColorName7", value.asInstanceOf[js.Any])
      
      inline def setBgColorName7Undefined: Self = StObject.set(x, "bgColorName7", js.undefined)
      
      inline def setBgColorName8(value: String): Self = StObject.set(x, "bgColorName8", value.asInstanceOf[js.Any])
      
      inline def setBgColorName8Undefined: Self = StObject.set(x, "bgColorName8", js.undefined)
      
      inline def setBgColorName9(value: String): Self = StObject.set(x, "bgColorName9", value.asInstanceOf[js.Any])
      
      inline def setBgColorName9Undefined: Self = StObject.set(x, "bgColorName9", js.undefined)
      
      inline def setBgColorRGB0(value: ColorNumber): Self = StObject.set(x, "bgColorRGB0", value.asInstanceOf[js.Any])
      
      inline def setBgColorRGB0Undefined: Self = StObject.set(x, "bgColorRGB0", js.undefined)
      
      inline def setBgColorRGB1(value: ColorNumber): Self = StObject.set(x, "bgColorRGB1", value.asInstanceOf[js.Any])
      
      inline def setBgColorRGB1Undefined: Self = StObject.set(x, "bgColorRGB1", js.undefined)
      
      inline def setBgColorRGB2(value: ColorNumber): Self = StObject.set(x, "bgColorRGB2", value.asInstanceOf[js.Any])
      
      inline def setBgColorRGB2Undefined: Self = StObject.set(x, "bgColorRGB2", js.undefined)
      
      inline def setBgColorRGB3(value: ColorNumber): Self = StObject.set(x, "bgColorRGB3", value.asInstanceOf[js.Any])
      
      inline def setBgColorRGB3Undefined: Self = StObject.set(x, "bgColorRGB3", js.undefined)
      
      inline def setBgColorRGB4(value: ColorNumber): Self = StObject.set(x, "bgColorRGB4", value.asInstanceOf[js.Any])
      
      inline def setBgColorRGB4Undefined: Self = StObject.set(x, "bgColorRGB4", js.undefined)
      
      inline def setBgColorRGB5(value: ColorNumber): Self = StObject.set(x, "bgColorRGB5", value.asInstanceOf[js.Any])
      
      inline def setBgColorRGB5Undefined: Self = StObject.set(x, "bgColorRGB5", js.undefined)
      
      inline def setBgColorRGB6(value: ColorNumber): Self = StObject.set(x, "bgColorRGB6", value.asInstanceOf[js.Any])
      
      inline def setBgColorRGB6Undefined: Self = StObject.set(x, "bgColorRGB6", js.undefined)
      
      inline def setBgColorRGB7(value: ColorNumber): Self = StObject.set(x, "bgColorRGB7", value.asInstanceOf[js.Any])
      
      inline def setBgColorRGB7Undefined: Self = StObject.set(x, "bgColorRGB7", js.undefined)
      
      inline def setBgColorRGB8(value: ColorNumber): Self = StObject.set(x, "bgColorRGB8", value.asInstanceOf[js.Any])
      
      inline def setBgColorRGB8Undefined: Self = StObject.set(x, "bgColorRGB8", js.undefined)
      
      inline def setBgColorRGB9(value: ColorNumber): Self = StObject.set(x, "bgColorRGB9", value.asInstanceOf[js.Any])
      
      inline def setBgColorRGB9Undefined: Self = StObject.set(x, "bgColorRGB9", js.undefined)
      
      inline def setBgFillColor(value: ColorNumber): Self = StObject.set(x, "bgFillColor", value.asInstanceOf[js.Any])
      
      inline def setBgFillColorUndefined: Self = StObject.set(x, "bgFillColor", js.undefined)
      
      inline def setBgFillTransparency(value: Any): Self = StObject.set(x, "bgFillTransparency", value.asInstanceOf[js.Any])
      
      inline def setBgFillTransparencyUndefined: Self = StObject.set(x, "bgFillTransparency", js.undefined)
      
      inline def setColorNumber(value: ColorNumber): Self = StObject.set(x, "colorNumber", value.asInstanceOf[js.Any])
      
      inline def setColorNumberUndefined: Self = StObject.set(x, "colorNumber", js.undefined)
      
      inline def setColumnAutoheight(value: Any): Self = StObject.set(x, "columnAutoheight", value.asInstanceOf[js.Any])
      
      inline def setColumnAutoheightUndefined: Self = StObject.set(x, "columnAutoheight", js.undefined)
      
      inline def setColumnCount(value: Any): Self = StObject.set(x, "columnCount", value.asInstanceOf[js.Any])
      
      inline def setColumnCountUndefined: Self = StObject.set(x, "columnCount", js.undefined)
      
      inline def setColumnFlowReversed(value: Any): Self = StObject.set(x, "columnFlowReversed", value.asInstanceOf[js.Any])
      
      inline def setColumnFlowReversedUndefined: Self = StObject.set(x, "columnFlowReversed", js.undefined)
      
      inline def setColumnGutter(value: Any): Self = StObject.set(x, "columnGutter", value.asInstanceOf[js.Any])
      
      inline def setColumnGutterUndefined: Self = StObject.set(x, "columnGutter", js.undefined)
      
      inline def setColumnHeights(value: Any): Self = StObject.set(x, "columnHeights", value.asInstanceOf[js.Any])
      
      inline def setColumnHeightsUndefined: Self = StObject.set(x, "columnHeights", js.undefined)
      
      inline def setColumnType(value: Any): Self = StObject.set(x, "columnType", value.asInstanceOf[js.Any])
      
      inline def setColumnTypeUndefined: Self = StObject.set(x, "columnType", js.undefined)
      
      inline def setColumnWidth(value: Any): Self = StObject.set(x, "columnWidth", value.asInstanceOf[js.Any])
      
      inline def setColumnWidthUndefined: Self = StObject.set(x, "columnWidth", js.undefined)
      
      inline def setDrawingDirection(value: Any): Self = StObject.set(x, "drawingDirection", value.asInstanceOf[js.Any])
      
      inline def setDrawingDirectionUndefined: Self = StObject.set(x, "drawingDirection", js.undefined)
      
      inline def setExtrusionX(value: Any): Self = StObject.set(x, "extrusionX", value.asInstanceOf[js.Any])
      
      inline def setExtrusionXUndefined: Self = StObject.set(x, "extrusionX", js.undefined)
      
      inline def setExtrusionY(value: Any): Self = StObject.set(x, "extrusionY", value.asInstanceOf[js.Any])
      
      inline def setExtrusionYUndefined: Self = StObject.set(x, "extrusionY", js.undefined)
      
      inline def setExtrusionZ(value: Any): Self = StObject.set(x, "extrusionZ", value.asInstanceOf[js.Any])
      
      inline def setExtrusionZUndefined: Self = StObject.set(x, "extrusionZ", js.undefined)
      
      inline def setFillBoxStyle(value: Any): Self = StObject.set(x, "fillBoxStyle", value.asInstanceOf[js.Any])
      
      inline def setFillBoxStyleUndefined: Self = StObject.set(x, "fillBoxStyle", js.undefined)
      
      inline def setHorizontalWidth(value: Any): Self = StObject.set(x, "horizontalWidth", value.asInstanceOf[js.Any])
      
      inline def setHorizontalWidthUndefined: Self = StObject.set(x, "horizontalWidth", js.undefined)
      
      inline def setLayer(value: String): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
      
      inline def setLayerUndefined: Self = StObject.set(x, "layer", js.undefined)
      
      inline def setLineSpacingFactor(value: Any): Self = StObject.set(x, "lineSpacingFactor", value.asInstanceOf[js.Any])
      
      inline def setLineSpacingFactorUndefined: Self = StObject.set(x, "lineSpacingFactor", js.undefined)
      
      inline def setLineSpacingStyle(value: Any): Self = StObject.set(x, "lineSpacingStyle", value.asInstanceOf[js.Any])
      
      inline def setLineSpacingStyleUndefined: Self = StObject.set(x, "lineSpacingStyle", js.undefined)
      
      inline def setLineTypeName(value: String): Self = StObject.set(x, "lineTypeName", value.asInstanceOf[js.Any])
      
      inline def setLineTypeNameUndefined: Self = StObject.set(x, "lineTypeName", js.undefined)
      
      inline def setLineTypeScale(value: Any): Self = StObject.set(x, "lineTypeScale", value.asInstanceOf[js.Any])
      
      inline def setLineTypeScaleUndefined: Self = StObject.set(x, "lineTypeScale", js.undefined)
      
      inline def setNominalTextHeight(value: Any): Self = StObject.set(x, "nominalTextHeight", value.asInstanceOf[js.Any])
      
      inline def setNominalTextHeightUndefined: Self = StObject.set(x, "nominalTextHeight", js.undefined)
      
      inline def setRefRectangleWidth(value: Any): Self = StObject.set(x, "refRectangleWidth", value.asInstanceOf[js.Any])
      
      inline def setRefRectangleWidthUndefined: Self = StObject.set(x, "refRectangleWidth", js.undefined)
      
      inline def setString(value: String): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
      
      inline def setStringUndefined: Self = StObject.set(x, "string", js.undefined)
      
      inline def setStyleName(value: Any): Self = StObject.set(x, "styleName", value.asInstanceOf[js.Any])
      
      inline def setStyleNameUndefined: Self = StObject.set(x, "styleName", js.undefined)
      
      inline def setTYPE(value: String): Self = StObject.set(x, "TYPE", value.asInstanceOf[js.Any])
      
      inline def setTYPEUndefined: Self = StObject.set(x, "TYPE", js.undefined)
      
      inline def setVerticalHeight(value: Any): Self = StObject.set(x, "verticalHeight", value.asInstanceOf[js.Any])
      
      inline def setVerticalHeightUndefined: Self = StObject.set(x, "verticalHeight", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      inline def setX(value: Any): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXAxisX(value: Any): Self = StObject.set(x, "xAxisX", value.asInstanceOf[js.Any])
      
      inline def setXAxisXUndefined: Self = StObject.set(x, "xAxisX", js.undefined)
      
      inline def setXAxisY(value: Any): Self = StObject.set(x, "xAxisY", value.asInstanceOf[js.Any])
      
      inline def setXAxisYUndefined: Self = StObject.set(x, "xAxisY", js.undefined)
      
      inline def setXAxisZ(value: Any): Self = StObject.set(x, "xAxisZ", value.asInstanceOf[js.Any])
      
      inline def setXAxisZUndefined: Self = StObject.set(x, "xAxisZ", js.undefined)
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: Any): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
      
      inline def setZ(value: Any): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
      
      inline def setZUndefined: Self = StObject.set(x, "z", js.undefined)
    }
  }
}
