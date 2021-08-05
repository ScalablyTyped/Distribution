package typings.devextreme.anon

import typings.devextreme.devextremeStrings.arrowBottom
import typings.devextreme.devextremeStrings.arrowEastWest
import typings.devextreme.devextremeStrings.arrowLeft
import typings.devextreme.devextremeStrings.arrowNorthSouth
import typings.devextreme.devextremeStrings.arrowRight
import typings.devextreme.devextremeStrings.arrowTop
import typings.devextreme.devextremeStrings.cardWithImageOnLeft
import typings.devextreme.devextremeStrings.cardWithImageOnRight
import typings.devextreme.devextremeStrings.cardWithImageOnTop
import typings.devextreme.devextremeStrings.connector
import typings.devextreme.devextremeStrings.cross
import typings.devextreme.devextremeStrings.data
import typings.devextreme.devextremeStrings.database
import typings.devextreme.devextremeStrings.decision
import typings.devextreme.devextremeStrings.delay
import typings.devextreme.devextremeStrings.diamond
import typings.devextreme.devextremeStrings.display
import typings.devextreme.devextremeStrings.document
import typings.devextreme.devextremeStrings.ellipse
import typings.devextreme.devextremeStrings.hardDisk
import typings.devextreme.devextremeStrings.heart
import typings.devextreme.devextremeStrings.horizontalContainer
import typings.devextreme.devextremeStrings.internalStorage
import typings.devextreme.devextremeStrings.manualInput
import typings.devextreme.devextremeStrings.manualOperation
import typings.devextreme.devextremeStrings.merge
import typings.devextreme.devextremeStrings.multipleDocuments
import typings.devextreme.devextremeStrings.octagon
import typings.devextreme.devextremeStrings.or
import typings.devextreme.devextremeStrings.paperTape
import typings.devextreme.devextremeStrings.pentagon
import typings.devextreme.devextremeStrings.predefinedProcess
import typings.devextreme.devextremeStrings.preparation
import typings.devextreme.devextremeStrings.process
import typings.devextreme.devextremeStrings.rectangle
import typings.devextreme.devextremeStrings.star
import typings.devextreme.devextremeStrings.storedData
import typings.devextreme.devextremeStrings.summingJunction
import typings.devextreme.devextremeStrings.terminator
import typings.devextreme.devextremeStrings.text
import typings.devextreme.devextremeStrings.triangle
import typings.devextreme.devextremeStrings.verticalContainer
import typings.devextreme.mod.DevExpress.core.dxSVGElement
import typings.devextreme.mod.DevExpress.core.template
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllowEditImage extends StObject {
  
  var allowEditImage: js.UndefOr[Boolean] = js.undefined
  
  var allowEditText: js.UndefOr[Boolean] = js.undefined
  
  var allowResize: js.UndefOr[Boolean] = js.undefined
  
  var backgroundImageHeight: js.UndefOr[Double] = js.undefined
  
  var backgroundImageLeft: js.UndefOr[Double] = js.undefined
  
  var backgroundImageToolboxUrl: js.UndefOr[String] = js.undefined
  
  var backgroundImageTop: js.UndefOr[Double] = js.undefined
  
  var backgroundImageUrl: js.UndefOr[String] = js.undefined
  
  var backgroundImageWidth: js.UndefOr[Double] = js.undefined
  
  var baseType: js.UndefOr[
    text | rectangle | ellipse | cross | triangle | diamond | heart | pentagon | octagon | star | arrowLeft | arrowTop | arrowRight | arrowBottom | arrowNorthSouth | arrowEastWest | process | decision | terminator | predefinedProcess | document | multipleDocuments | manualInput | preparation | data | database | hardDisk | internalStorage | paperTape | manualOperation | delay | storedData | display | merge | connector | or | summingJunction | verticalContainer | horizontalContainer | cardWithImageOnLeft | cardWithImageOnTop | cardWithImageOnRight | String
  ] = js.undefined
  
  var category: js.UndefOr[String] = js.undefined
  
  var connectionPoints: js.UndefOr[js.Array[Y]] = js.undefined
  
  var defaultHeight: js.UndefOr[Double] = js.undefined
  
  var defaultImageUrl: js.UndefOr[String] = js.undefined
  
  var defaultText: js.UndefOr[String] = js.undefined
  
  var defaultWidth: js.UndefOr[Double] = js.undefined
  
  var imageHeight: js.UndefOr[Double] = js.undefined
  
  var imageLeft: js.UndefOr[Double] = js.undefined
  
  var imageTop: js.UndefOr[Double] = js.undefined
  
  var imageWidth: js.UndefOr[Double] = js.undefined
  
  var keepRatioOnAutoSize: js.UndefOr[Boolean] = js.undefined
  
  var maxHeight: js.UndefOr[Double] = js.undefined
  
  var maxWidth: js.UndefOr[Double] = js.undefined
  
  var minHeight: js.UndefOr[Double] = js.undefined
  
  var minWidth: js.UndefOr[Double] = js.undefined
  
  var template: js.UndefOr[
    typings.devextreme.mod.DevExpress.core.template | (js.Function2[/* container */ dxSVGElement, /* data */ Item, js.Any])
  ] = js.undefined
  
  var templateHeight: js.UndefOr[Double] = js.undefined
  
  var templateLeft: js.UndefOr[Double] = js.undefined
  
  var templateTop: js.UndefOr[Double] = js.undefined
  
  var templateWidth: js.UndefOr[Double] = js.undefined
  
  var textHeight: js.UndefOr[Double] = js.undefined
  
  var textLeft: js.UndefOr[Double] = js.undefined
  
  var textTop: js.UndefOr[Double] = js.undefined
  
  var textWidth: js.UndefOr[Double] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
  
  var toolboxTemplate: js.UndefOr[template | (js.Function2[/* container */ dxSVGElement, /* data */ Item, js.Any])] = js.undefined
  
  var toolboxWidthToHeightRatio: js.UndefOr[Double] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object AllowEditImage {
  
  inline def apply(): AllowEditImage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllowEditImage]
  }
  
  extension [Self <: AllowEditImage](x: Self) {
    
    inline def setAllowEditImage(value: Boolean): Self = StObject.set(x, "allowEditImage", value.asInstanceOf[js.Any])
    
    inline def setAllowEditImageUndefined: Self = StObject.set(x, "allowEditImage", js.undefined)
    
    inline def setAllowEditText(value: Boolean): Self = StObject.set(x, "allowEditText", value.asInstanceOf[js.Any])
    
    inline def setAllowEditTextUndefined: Self = StObject.set(x, "allowEditText", js.undefined)
    
    inline def setAllowResize(value: Boolean): Self = StObject.set(x, "allowResize", value.asInstanceOf[js.Any])
    
    inline def setAllowResizeUndefined: Self = StObject.set(x, "allowResize", js.undefined)
    
    inline def setBackgroundImageHeight(value: Double): Self = StObject.set(x, "backgroundImageHeight", value.asInstanceOf[js.Any])
    
    inline def setBackgroundImageHeightUndefined: Self = StObject.set(x, "backgroundImageHeight", js.undefined)
    
    inline def setBackgroundImageLeft(value: Double): Self = StObject.set(x, "backgroundImageLeft", value.asInstanceOf[js.Any])
    
    inline def setBackgroundImageLeftUndefined: Self = StObject.set(x, "backgroundImageLeft", js.undefined)
    
    inline def setBackgroundImageToolboxUrl(value: String): Self = StObject.set(x, "backgroundImageToolboxUrl", value.asInstanceOf[js.Any])
    
    inline def setBackgroundImageToolboxUrlUndefined: Self = StObject.set(x, "backgroundImageToolboxUrl", js.undefined)
    
    inline def setBackgroundImageTop(value: Double): Self = StObject.set(x, "backgroundImageTop", value.asInstanceOf[js.Any])
    
    inline def setBackgroundImageTopUndefined: Self = StObject.set(x, "backgroundImageTop", js.undefined)
    
    inline def setBackgroundImageUrl(value: String): Self = StObject.set(x, "backgroundImageUrl", value.asInstanceOf[js.Any])
    
    inline def setBackgroundImageUrlUndefined: Self = StObject.set(x, "backgroundImageUrl", js.undefined)
    
    inline def setBackgroundImageWidth(value: Double): Self = StObject.set(x, "backgroundImageWidth", value.asInstanceOf[js.Any])
    
    inline def setBackgroundImageWidthUndefined: Self = StObject.set(x, "backgroundImageWidth", js.undefined)
    
    inline def setBaseType(
      value: text | rectangle | ellipse | cross | triangle | diamond | heart | pentagon | octagon | star | arrowLeft | arrowTop | arrowRight | arrowBottom | arrowNorthSouth | arrowEastWest | process | decision | terminator | predefinedProcess | document | multipleDocuments | manualInput | preparation | data | database | hardDisk | internalStorage | paperTape | manualOperation | delay | storedData | display | merge | connector | or | summingJunction | verticalContainer | horizontalContainer | cardWithImageOnLeft | cardWithImageOnTop | cardWithImageOnRight | String
    ): Self = StObject.set(x, "baseType", value.asInstanceOf[js.Any])
    
    inline def setBaseTypeUndefined: Self = StObject.set(x, "baseType", js.undefined)
    
    inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setConnectionPoints(value: js.Array[Y]): Self = StObject.set(x, "connectionPoints", value.asInstanceOf[js.Any])
    
    inline def setConnectionPointsUndefined: Self = StObject.set(x, "connectionPoints", js.undefined)
    
    inline def setConnectionPointsVarargs(value: Y*): Self = StObject.set(x, "connectionPoints", js.Array(value :_*))
    
    inline def setDefaultHeight(value: Double): Self = StObject.set(x, "defaultHeight", value.asInstanceOf[js.Any])
    
    inline def setDefaultHeightUndefined: Self = StObject.set(x, "defaultHeight", js.undefined)
    
    inline def setDefaultImageUrl(value: String): Self = StObject.set(x, "defaultImageUrl", value.asInstanceOf[js.Any])
    
    inline def setDefaultImageUrlUndefined: Self = StObject.set(x, "defaultImageUrl", js.undefined)
    
    inline def setDefaultText(value: String): Self = StObject.set(x, "defaultText", value.asInstanceOf[js.Any])
    
    inline def setDefaultTextUndefined: Self = StObject.set(x, "defaultText", js.undefined)
    
    inline def setDefaultWidth(value: Double): Self = StObject.set(x, "defaultWidth", value.asInstanceOf[js.Any])
    
    inline def setDefaultWidthUndefined: Self = StObject.set(x, "defaultWidth", js.undefined)
    
    inline def setImageHeight(value: Double): Self = StObject.set(x, "imageHeight", value.asInstanceOf[js.Any])
    
    inline def setImageHeightUndefined: Self = StObject.set(x, "imageHeight", js.undefined)
    
    inline def setImageLeft(value: Double): Self = StObject.set(x, "imageLeft", value.asInstanceOf[js.Any])
    
    inline def setImageLeftUndefined: Self = StObject.set(x, "imageLeft", js.undefined)
    
    inline def setImageTop(value: Double): Self = StObject.set(x, "imageTop", value.asInstanceOf[js.Any])
    
    inline def setImageTopUndefined: Self = StObject.set(x, "imageTop", js.undefined)
    
    inline def setImageWidth(value: Double): Self = StObject.set(x, "imageWidth", value.asInstanceOf[js.Any])
    
    inline def setImageWidthUndefined: Self = StObject.set(x, "imageWidth", js.undefined)
    
    inline def setKeepRatioOnAutoSize(value: Boolean): Self = StObject.set(x, "keepRatioOnAutoSize", value.asInstanceOf[js.Any])
    
    inline def setKeepRatioOnAutoSizeUndefined: Self = StObject.set(x, "keepRatioOnAutoSize", js.undefined)
    
    inline def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
    
    inline def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
    
    inline def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
    
    inline def setMinHeight(value: Double): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
    
    inline def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
    
    inline def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
    
    inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
    
    inline def setTemplate(value: template | (js.Function2[/* container */ dxSVGElement, /* data */ Item, js.Any])): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateFunction2(value: (/* container */ dxSVGElement, /* data */ Item) => js.Any): Self = StObject.set(x, "template", js.Any.fromFunction2(value))
    
    inline def setTemplateHeight(value: Double): Self = StObject.set(x, "templateHeight", value.asInstanceOf[js.Any])
    
    inline def setTemplateHeightUndefined: Self = StObject.set(x, "templateHeight", js.undefined)
    
    inline def setTemplateLeft(value: Double): Self = StObject.set(x, "templateLeft", value.asInstanceOf[js.Any])
    
    inline def setTemplateLeftUndefined: Self = StObject.set(x, "templateLeft", js.undefined)
    
    inline def setTemplateTop(value: Double): Self = StObject.set(x, "templateTop", value.asInstanceOf[js.Any])
    
    inline def setTemplateTopUndefined: Self = StObject.set(x, "templateTop", js.undefined)
    
    inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    inline def setTemplateWidth(value: Double): Self = StObject.set(x, "templateWidth", value.asInstanceOf[js.Any])
    
    inline def setTemplateWidthUndefined: Self = StObject.set(x, "templateWidth", js.undefined)
    
    inline def setTextHeight(value: Double): Self = StObject.set(x, "textHeight", value.asInstanceOf[js.Any])
    
    inline def setTextHeightUndefined: Self = StObject.set(x, "textHeight", js.undefined)
    
    inline def setTextLeft(value: Double): Self = StObject.set(x, "textLeft", value.asInstanceOf[js.Any])
    
    inline def setTextLeftUndefined: Self = StObject.set(x, "textLeft", js.undefined)
    
    inline def setTextTop(value: Double): Self = StObject.set(x, "textTop", value.asInstanceOf[js.Any])
    
    inline def setTextTopUndefined: Self = StObject.set(x, "textTop", js.undefined)
    
    inline def setTextWidth(value: Double): Self = StObject.set(x, "textWidth", value.asInstanceOf[js.Any])
    
    inline def setTextWidthUndefined: Self = StObject.set(x, "textWidth", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setToolboxTemplate(value: template | (js.Function2[/* container */ dxSVGElement, /* data */ Item, js.Any])): Self = StObject.set(x, "toolboxTemplate", value.asInstanceOf[js.Any])
    
    inline def setToolboxTemplateFunction2(value: (/* container */ dxSVGElement, /* data */ Item) => js.Any): Self = StObject.set(x, "toolboxTemplate", js.Any.fromFunction2(value))
    
    inline def setToolboxTemplateUndefined: Self = StObject.set(x, "toolboxTemplate", js.undefined)
    
    inline def setToolboxWidthToHeightRatio(value: Double): Self = StObject.set(x, "toolboxWidthToHeightRatio", value.asInstanceOf[js.Any])
    
    inline def setToolboxWidthToHeightRatioUndefined: Self = StObject.set(x, "toolboxWidthToHeightRatio", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
