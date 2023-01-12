package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.core.DxElement_
import typings.devextreme.mod.DevExpress.core.template
import typings.devextreme.mod.DevExpress.ui.dxDiagram.CustomShapeTemplateData
import typings.devextreme.mod.DevExpress.ui.dxDiagram.CustomShapeToolboxTemplateData
import typings.devextreme.mod.DevExpress.ui.dxDiagram.DiagramShapeType
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllowEditImage extends StObject {
  
  /**
    * Specifies whether a card shape&apos;s image can be edited.
    */
  var allowEditImage: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether the shape&apos;s text can be edited.
    */
  var allowEditText: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether the shape can be resized.
    */
  var allowResize: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the shape background image&apos;s fractional height.
    */
  var backgroundImageHeight: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the shape background image&apos;s left offset.
    */
  var backgroundImageLeft: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the shape image displayed in the toolbox.
    */
  var backgroundImageToolboxUrl: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the shape background image&apos;s top offset.
    */
  var backgroundImageTop: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the shape background image&apos;s URL.
    */
  var backgroundImageUrl: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the shape background image&apos;s fractional width.
    */
  var backgroundImageWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the base shape type for the custom shape. The built-in shape types are shown in the Shape Types section.
    */
  var baseType: js.UndefOr[DiagramShapeType | String] = js.undefined
  
  /**
    * Specifies a category to which the custom shape belongs.
    */
  var category: js.UndefOr[String] = js.undefined
  
  /**
    * An array of the shape&apos;s connection points.
    */
  var connectionPoints: js.UndefOr[js.Array[Y]] = js.undefined
  
  /**
    * Specifies the initial height of the shape.
    */
  var defaultHeight: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the URL of an image displayed in a card shape.
    */
  var defaultImageUrl: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the initial text of the shape.
    */
  var defaultText: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the initial width of the shape.
    */
  var defaultWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the shape image&apos;s fractional height.
    */
  var imageHeight: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the shape image&apos;s left offset.
    */
  var imageLeft: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the shape image&apos;s top offset.
    */
  var imageTop: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the shape image&apos;s fractional width.
    */
  var imageWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies whether the shape maintains its width-to-height ratio on auto resize.
    */
  var keepRatioOnAutoSize: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the maximum height of the shape.
    */
  var maxHeight: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the maximum width of the shape.
    */
  var maxWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the maximum height of the shape.
    */
  var minHeight: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the minimum width of the shape.
    */
  var minWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies a custom template for the shape.
    */
  var template: js.UndefOr[
    typings.devextreme.mod.DevExpress.core.template | (js.Function2[/* container */ DxElement_[SVGElement], /* data */ CustomShapeTemplateData, Any])
  ] = js.undefined
  
  /**
    * Specifies the shape template&apos;s fractional height.
    */
  var templateHeight: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the shape template&apos;s left offset.
    */
  var templateLeft: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the shape template&apos;s top offset.
    */
  var templateTop: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the shape template&apos;s fractional width.
    */
  var templateWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the shape text container&apos;s height.
    */
  var textHeight: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the shape text&apos;s left offset.
    */
  var textLeft: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the shape text&apos;s top offset.
    */
  var textTop: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the shape text container&apos;s width.
    */
  var textWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the shape&apos;s tooltip in the toolbox panel.
    */
  var title: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies a custom template for the shape in the toolbox.
    */
  var toolboxTemplate: js.UndefOr[
    template | (js.Function2[
      /* container */ DxElement_[SVGElement], 
      /* data */ CustomShapeToolboxTemplateData, 
      Any
    ])
  ] = js.undefined
  
  /**
    * Specifies the aspect ratio of the shape in the toolbox.
    */
  var toolboxWidthToHeightRatio: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the shape&apos;s type.
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object AllowEditImage {
  
  inline def apply(): AllowEditImage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllowEditImage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AllowEditImage] (val x: Self) extends AnyVal {
    
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
    
    inline def setBaseType(value: DiagramShapeType | String): Self = StObject.set(x, "baseType", value.asInstanceOf[js.Any])
    
    inline def setBaseTypeUndefined: Self = StObject.set(x, "baseType", js.undefined)
    
    inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setConnectionPoints(value: js.Array[Y]): Self = StObject.set(x, "connectionPoints", value.asInstanceOf[js.Any])
    
    inline def setConnectionPointsUndefined: Self = StObject.set(x, "connectionPoints", js.undefined)
    
    inline def setConnectionPointsVarargs(value: Y*): Self = StObject.set(x, "connectionPoints", js.Array(value*))
    
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
    
    inline def setTemplate(
      value: template | (js.Function2[/* container */ DxElement_[SVGElement], /* data */ CustomShapeTemplateData, Any])
    ): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateFunction2(value: (/* container */ DxElement_[SVGElement], /* data */ CustomShapeTemplateData) => Any): Self = StObject.set(x, "template", js.Any.fromFunction2(value))
    
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
    
    inline def setToolboxTemplate(
      value: template | (js.Function2[
          /* container */ DxElement_[SVGElement], 
          /* data */ CustomShapeToolboxTemplateData, 
          Any
        ])
    ): Self = StObject.set(x, "toolboxTemplate", value.asInstanceOf[js.Any])
    
    inline def setToolboxTemplateFunction2(value: (/* container */ DxElement_[SVGElement], /* data */ CustomShapeToolboxTemplateData) => Any): Self = StObject.set(x, "toolboxTemplate", js.Any.fromFunction2(value))
    
    inline def setToolboxTemplateUndefined: Self = StObject.set(x, "toolboxTemplate", js.undefined)
    
    inline def setToolboxWidthToHeightRatio(value: Double): Self = StObject.set(x, "toolboxWidthToHeightRatio", value.asInstanceOf[js.Any])
    
    inline def setToolboxWidthToHeightRatioUndefined: Self = StObject.set(x, "toolboxWidthToHeightRatio", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
