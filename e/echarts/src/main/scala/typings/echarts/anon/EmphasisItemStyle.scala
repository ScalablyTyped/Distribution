package typings.echarts.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmphasisItemStyle extends StObject {
  
  /**
    * @see https://echarts.apache.org/en/option.html#series-tree.leaves.emphasis
    */
  var emphasis: js.UndefOr[`8`] = js.undefined
  
  /**
    * The style of the leaf node in the tree.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-tree.leaves.itemStyle
    */
  var itemStyle: js.UndefOr[BorderType] = js.undefined
  
  /**
    * Describes the style of the text label corresponding to the
    * leaf node.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-tree.leaves.label
    */
  var label: js.UndefOr[BorderRadius] = js.undefined
}
object EmphasisItemStyle {
  
  @scala.inline
  def apply(): EmphasisItemStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmphasisItemStyle]
  }
  
  @scala.inline
  implicit class EmphasisItemStyleMutableBuilder[Self <: EmphasisItemStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmphasis(value: `8`): Self = StObject.set(x, "emphasis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmphasisUndefined: Self = StObject.set(x, "emphasis", js.undefined)
    
    @scala.inline
    def setItemStyle(value: BorderType): Self = StObject.set(x, "itemStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemStyleUndefined: Self = StObject.set(x, "itemStyle", js.undefined)
    
    @scala.inline
    def setLabel(value: BorderRadius): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
  }
}
