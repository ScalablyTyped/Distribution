package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Access to product group builders via the ProductGroup.newChild() method. */
trait ProductGroupBuilderSpace extends StObject {
  
  /** Returns a product brand builder. */
  def brandBuilder(): ProductBrandBuilder
  
  /** Returns a product category builder. */
  def categoryBuilder(): ProductCategoryBuilder
  
  /** Returns a product channel builder. */
  def channelBuilder(): ProductChannelBuilder
  
  /** Returns a product channel exclusivity builder. */
  def channelExclusivityBuilder(): ProductChannelExclusivityBuilder
  
  /** Returns a product condition builder. */
  def conditionBuilder(): ProductConditionBuilder
  
  /** Returns a product custom label builder. */
  def customLabelBuilder(): ProductCustomLabelBuilder
  
  /** Returns a product item ID builder. */
  def itemIdBuilder(): ProductItemIdBuilder
  
  /** Returns a product type builder. */
  def productTypeBuilder(): ProductTypeBuilder
}
object ProductGroupBuilderSpace {
  
  inline def apply(
    brandBuilder: () => ProductBrandBuilder,
    categoryBuilder: () => ProductCategoryBuilder,
    channelBuilder: () => ProductChannelBuilder,
    channelExclusivityBuilder: () => ProductChannelExclusivityBuilder,
    conditionBuilder: () => ProductConditionBuilder,
    customLabelBuilder: () => ProductCustomLabelBuilder,
    itemIdBuilder: () => ProductItemIdBuilder,
    productTypeBuilder: () => ProductTypeBuilder
  ): ProductGroupBuilderSpace = {
    val __obj = js.Dynamic.literal(brandBuilder = js.Any.fromFunction0(brandBuilder), categoryBuilder = js.Any.fromFunction0(categoryBuilder), channelBuilder = js.Any.fromFunction0(channelBuilder), channelExclusivityBuilder = js.Any.fromFunction0(channelExclusivityBuilder), conditionBuilder = js.Any.fromFunction0(conditionBuilder), customLabelBuilder = js.Any.fromFunction0(customLabelBuilder), itemIdBuilder = js.Any.fromFunction0(itemIdBuilder), productTypeBuilder = js.Any.fromFunction0(productTypeBuilder))
    __obj.asInstanceOf[ProductGroupBuilderSpace]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProductGroupBuilderSpace] (val x: Self) extends AnyVal {
    
    inline def setBrandBuilder(value: () => ProductBrandBuilder): Self = StObject.set(x, "brandBuilder", js.Any.fromFunction0(value))
    
    inline def setCategoryBuilder(value: () => ProductCategoryBuilder): Self = StObject.set(x, "categoryBuilder", js.Any.fromFunction0(value))
    
    inline def setChannelBuilder(value: () => ProductChannelBuilder): Self = StObject.set(x, "channelBuilder", js.Any.fromFunction0(value))
    
    inline def setChannelExclusivityBuilder(value: () => ProductChannelExclusivityBuilder): Self = StObject.set(x, "channelExclusivityBuilder", js.Any.fromFunction0(value))
    
    inline def setConditionBuilder(value: () => ProductConditionBuilder): Self = StObject.set(x, "conditionBuilder", js.Any.fromFunction0(value))
    
    inline def setCustomLabelBuilder(value: () => ProductCustomLabelBuilder): Self = StObject.set(x, "customLabelBuilder", js.Any.fromFunction0(value))
    
    inline def setItemIdBuilder(value: () => ProductItemIdBuilder): Self = StObject.set(x, "itemIdBuilder", js.Any.fromFunction0(value))
    
    inline def setProductTypeBuilder(value: () => ProductTypeBuilder): Self = StObject.set(x, "productTypeBuilder", js.Any.fromFunction0(value))
  }
}
