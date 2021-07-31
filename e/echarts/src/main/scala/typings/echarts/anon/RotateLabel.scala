package typings.echarts.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RotateLabel extends StObject {
  
  /**
    * Whether to rotate the label automatically.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-graph.circular.rotateLabel
    */
  var rotateLabel: js.UndefOr[Boolean] = js.undefined
}
object RotateLabel {
  
  @scala.inline
  def apply(): RotateLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RotateLabel]
  }
  
  @scala.inline
  implicit class RotateLabelMutableBuilder[Self <: RotateLabel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRotateLabel(value: Boolean): Self = StObject.set(x, "rotateLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotateLabelUndefined: Self = StObject.set(x, "rotateLabel", js.undefined)
  }
}
