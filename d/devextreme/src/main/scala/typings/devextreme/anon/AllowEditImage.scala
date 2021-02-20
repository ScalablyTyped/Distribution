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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AllowEditImage extends StObject {
  
  var allowEditImage: js.UndefOr[Boolean] = js.native
  
  var allowEditText: js.UndefOr[Boolean] = js.native
  
  var allowResize: js.UndefOr[Boolean] = js.native
  
  var backgroundImageHeight: js.UndefOr[Double] = js.native
  
  var backgroundImageLeft: js.UndefOr[Double] = js.native
  
  var backgroundImageToolboxUrl: js.UndefOr[String] = js.native
  
  var backgroundImageTop: js.UndefOr[Double] = js.native
  
  var backgroundImageUrl: js.UndefOr[String] = js.native
  
  var backgroundImageWidth: js.UndefOr[Double] = js.native
  
  var baseType: js.UndefOr[
    text | rectangle | ellipse | cross | triangle | diamond | heart | pentagon | octagon | star | arrowLeft | arrowTop | arrowRight | arrowBottom | arrowNorthSouth | arrowEastWest | process | decision | terminator | predefinedProcess | document | multipleDocuments | manualInput | preparation | data | database | hardDisk | internalStorage | paperTape | manualOperation | delay | storedData | display | merge | connector | or | summingJunction | verticalContainer | horizontalContainer | cardWithImageOnLeft | cardWithImageOnTop | cardWithImageOnRight | String
  ] = js.native
  
  var category: js.UndefOr[String] = js.native
  
  var connectionPoints: js.UndefOr[js.Array[Y]] = js.native
  
  var defaultHeight: js.UndefOr[Double] = js.native
  
  var defaultImageUrl: js.UndefOr[String] = js.native
  
  var defaultText: js.UndefOr[String] = js.native
  
  var defaultWidth: js.UndefOr[Double] = js.native
  
  var imageHeight: js.UndefOr[Double] = js.native
  
  var imageLeft: js.UndefOr[Double] = js.native
  
  var imageTop: js.UndefOr[Double] = js.native
  
  var imageWidth: js.UndefOr[Double] = js.native
  
  var keepRatioOnAutoSize: js.UndefOr[Boolean] = js.native
  
  var maxHeight: js.UndefOr[Double] = js.native
  
  var maxWidth: js.UndefOr[Double] = js.native
  
  var minHeight: js.UndefOr[Double] = js.native
  
  var minWidth: js.UndefOr[Double] = js.native
  
  var template: js.UndefOr[
    typings.devextreme.mod.DevExpress.core.template | (js.Function2[/* container */ dxSVGElement, /* data */ Item, _])
  ] = js.native
  
  var templateHeight: js.UndefOr[Double] = js.native
  
  var templateLeft: js.UndefOr[Double] = js.native
  
  var templateTop: js.UndefOr[Double] = js.native
  
  var templateWidth: js.UndefOr[Double] = js.native
  
  var textHeight: js.UndefOr[Double] = js.native
  
  var textLeft: js.UndefOr[Double] = js.native
  
  var textTop: js.UndefOr[Double] = js.native
  
  var textWidth: js.UndefOr[Double] = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var toolboxTemplate: js.UndefOr[template | (js.Function2[/* container */ dxSVGElement, /* data */ Item, _])] = js.native
  
  var toolboxWidthToHeightRatio: js.UndefOr[Double] = js.native
  
  var `type`: js.UndefOr[String] = js.native
}
object AllowEditImage {
  
  @scala.inline
  def apply(): AllowEditImage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllowEditImage]
  }
  
  @scala.inline
  implicit class AllowEditImageMutableBuilder[Self <: AllowEditImage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowEditImage(value: Boolean): Self = StObject.set(x, "allowEditImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowEditImageUndefined: Self = StObject.set(x, "allowEditImage", js.undefined)
    
    @scala.inline
    def setAllowEditText(value: Boolean): Self = StObject.set(x, "allowEditText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowEditTextUndefined: Self = StObject.set(x, "allowEditText", js.undefined)
    
    @scala.inline
    def setAllowResize(value: Boolean): Self = StObject.set(x, "allowResize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowResizeUndefined: Self = StObject.set(x, "allowResize", js.undefined)
    
    @scala.inline
    def setBackgroundImageHeight(value: Double): Self = StObject.set(x, "backgroundImageHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundImageHeightUndefined: Self = StObject.set(x, "backgroundImageHeight", js.undefined)
    
    @scala.inline
    def setBackgroundImageLeft(value: Double): Self = StObject.set(x, "backgroundImageLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundImageLeftUndefined: Self = StObject.set(x, "backgroundImageLeft", js.undefined)
    
    @scala.inline
    def setBackgroundImageToolboxUrl(value: String): Self = StObject.set(x, "backgroundImageToolboxUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundImageToolboxUrlUndefined: Self = StObject.set(x, "backgroundImageToolboxUrl", js.undefined)
    
    @scala.inline
    def setBackgroundImageTop(value: Double): Self = StObject.set(x, "backgroundImageTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundImageTopUndefined: Self = StObject.set(x, "backgroundImageTop", js.undefined)
    
    @scala.inline
    def setBackgroundImageUrl(value: String): Self = StObject.set(x, "backgroundImageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundImageUrlUndefined: Self = StObject.set(x, "backgroundImageUrl", js.undefined)
    
    @scala.inline
    def setBackgroundImageWidth(value: Double): Self = StObject.set(x, "backgroundImageWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundImageWidthUndefined: Self = StObject.set(x, "backgroundImageWidth", js.undefined)
    
    @scala.inline
    def setBaseType(
      value: text | rectangle | ellipse | cross | triangle | diamond | heart | pentagon | octagon | star | arrowLeft | arrowTop | arrowRight | arrowBottom | arrowNorthSouth | arrowEastWest | process | decision | terminator | predefinedProcess | document | multipleDocuments | manualInput | preparation | data | database | hardDisk | internalStorage | paperTape | manualOperation | delay | storedData | display | merge | connector | or | summingJunction | verticalContainer | horizontalContainer | cardWithImageOnLeft | cardWithImageOnTop | cardWithImageOnRight | String
    ): Self = StObject.set(x, "baseType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseTypeUndefined: Self = StObject.set(x, "baseType", js.undefined)
    
    @scala.inline
    def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    @scala.inline
    def setConnectionPoints(value: js.Array[Y]): Self = StObject.set(x, "connectionPoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionPointsUndefined: Self = StObject.set(x, "connectionPoints", js.undefined)
    
    @scala.inline
    def setConnectionPointsVarargs(value: Y*): Self = StObject.set(x, "connectionPoints", js.Array(value :_*))
    
    @scala.inline
    def setDefaultHeight(value: Double): Self = StObject.set(x, "defaultHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultHeightUndefined: Self = StObject.set(x, "defaultHeight", js.undefined)
    
    @scala.inline
    def setDefaultImageUrl(value: String): Self = StObject.set(x, "defaultImageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultImageUrlUndefined: Self = StObject.set(x, "defaultImageUrl", js.undefined)
    
    @scala.inline
    def setDefaultText(value: String): Self = StObject.set(x, "defaultText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultTextUndefined: Self = StObject.set(x, "defaultText", js.undefined)
    
    @scala.inline
    def setDefaultWidth(value: Double): Self = StObject.set(x, "defaultWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultWidthUndefined: Self = StObject.set(x, "defaultWidth", js.undefined)
    
    @scala.inline
    def setImageHeight(value: Double): Self = StObject.set(x, "imageHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageHeightUndefined: Self = StObject.set(x, "imageHeight", js.undefined)
    
    @scala.inline
    def setImageLeft(value: Double): Self = StObject.set(x, "imageLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageLeftUndefined: Self = StObject.set(x, "imageLeft", js.undefined)
    
    @scala.inline
    def setImageTop(value: Double): Self = StObject.set(x, "imageTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageTopUndefined: Self = StObject.set(x, "imageTop", js.undefined)
    
    @scala.inline
    def setImageWidth(value: Double): Self = StObject.set(x, "imageWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageWidthUndefined: Self = StObject.set(x, "imageWidth", js.undefined)
    
    @scala.inline
    def setKeepRatioOnAutoSize(value: Boolean): Self = StObject.set(x, "keepRatioOnAutoSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeepRatioOnAutoSizeUndefined: Self = StObject.set(x, "keepRatioOnAutoSize", js.undefined)
    
    @scala.inline
    def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
    
    @scala.inline
    def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
    
    @scala.inline
    def setMinHeight(value: Double): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
    
    @scala.inline
    def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
    
    @scala.inline
    def setTemplate(value: template | (js.Function2[/* container */ dxSVGElement, /* data */ Item, _])): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateFunction2(value: (/* container */ dxSVGElement, /* data */ Item) => _): Self = StObject.set(x, "template", js.Any.fromFunction2(value))
    
    @scala.inline
    def setTemplateHeight(value: Double): Self = StObject.set(x, "templateHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateHeightUndefined: Self = StObject.set(x, "templateHeight", js.undefined)
    
    @scala.inline
    def setTemplateLeft(value: Double): Self = StObject.set(x, "templateLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateLeftUndefined: Self = StObject.set(x, "templateLeft", js.undefined)
    
    @scala.inline
    def setTemplateTop(value: Double): Self = StObject.set(x, "templateTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateTopUndefined: Self = StObject.set(x, "templateTop", js.undefined)
    
    @scala.inline
    def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    @scala.inline
    def setTemplateWidth(value: Double): Self = StObject.set(x, "templateWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateWidthUndefined: Self = StObject.set(x, "templateWidth", js.undefined)
    
    @scala.inline
    def setTextHeight(value: Double): Self = StObject.set(x, "textHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextHeightUndefined: Self = StObject.set(x, "textHeight", js.undefined)
    
    @scala.inline
    def setTextLeft(value: Double): Self = StObject.set(x, "textLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextLeftUndefined: Self = StObject.set(x, "textLeft", js.undefined)
    
    @scala.inline
    def setTextTop(value: Double): Self = StObject.set(x, "textTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextTopUndefined: Self = StObject.set(x, "textTop", js.undefined)
    
    @scala.inline
    def setTextWidth(value: Double): Self = StObject.set(x, "textWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextWidthUndefined: Self = StObject.set(x, "textWidth", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setToolboxTemplate(value: template | (js.Function2[/* container */ dxSVGElement, /* data */ Item, _])): Self = StObject.set(x, "toolboxTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToolboxTemplateFunction2(value: (/* container */ dxSVGElement, /* data */ Item) => _): Self = StObject.set(x, "toolboxTemplate", js.Any.fromFunction2(value))
    
    @scala.inline
    def setToolboxTemplateUndefined: Self = StObject.set(x, "toolboxTemplate", js.undefined)
    
    @scala.inline
    def setToolboxWidthToHeightRatio(value: Double): Self = StObject.set(x, "toolboxWidthToHeightRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToolboxWidthToHeightRatioUndefined: Self = StObject.set(x, "toolboxWidthToHeightRatio", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
