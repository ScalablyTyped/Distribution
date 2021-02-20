package typings.figma.mod.global

import typings.figma.figmaStrings.CENTER
import typings.figma.figmaStrings.INSIDE
import typings.figma.figmaStrings.OUTSIDE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeometryMixin extends StObject {
  
  var dashPattern: js.Array[Double] = js.native
  
  var fillStyleId: String | js.Symbol = js.native
  
  var fills: js.Array[Paint] | js.Symbol = js.native
  
  def outlineStroke(): VectorNode | Null = js.native
  
  var strokeAlign: CENTER | INSIDE | OUTSIDE = js.native
  
  var strokeCap: StrokeCap | js.Symbol = js.native
  
  var strokeJoin: StrokeJoin | js.Symbol = js.native
  
  var strokeMiterLimit: Double = js.native
  
  var strokeStyleId: String = js.native
  
  var strokeWeight: Double = js.native
  
  var strokes: js.Array[Paint] = js.native
}
object GeometryMixin {
  
  @scala.inline
  def apply(
    dashPattern: js.Array[Double],
    fillStyleId: String | js.Symbol,
    fills: js.Array[Paint] | js.Symbol,
    outlineStroke: () => VectorNode | Null,
    strokeAlign: CENTER | INSIDE | OUTSIDE,
    strokeCap: StrokeCap | js.Symbol,
    strokeJoin: StrokeJoin | js.Symbol,
    strokeMiterLimit: Double,
    strokeStyleId: String,
    strokeWeight: Double,
    strokes: js.Array[Paint]
  ): GeometryMixin = {
    val __obj = js.Dynamic.literal(dashPattern = dashPattern.asInstanceOf[js.Any], fillStyleId = fillStyleId.asInstanceOf[js.Any], fills = fills.asInstanceOf[js.Any], outlineStroke = js.Any.fromFunction0(outlineStroke), strokeAlign = strokeAlign.asInstanceOf[js.Any], strokeCap = strokeCap.asInstanceOf[js.Any], strokeJoin = strokeJoin.asInstanceOf[js.Any], strokeMiterLimit = strokeMiterLimit.asInstanceOf[js.Any], strokeStyleId = strokeStyleId.asInstanceOf[js.Any], strokeWeight = strokeWeight.asInstanceOf[js.Any], strokes = strokes.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeometryMixin]
  }
  
  @scala.inline
  implicit class GeometryMixinMutableBuilder[Self <: GeometryMixin] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDashPattern(value: js.Array[Double]): Self = StObject.set(x, "dashPattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDashPatternVarargs(value: Double*): Self = StObject.set(x, "dashPattern", js.Array(value :_*))
    
    @scala.inline
    def setFillStyleId(value: String | js.Symbol): Self = StObject.set(x, "fillStyleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFills(value: js.Array[Paint] | js.Symbol): Self = StObject.set(x, "fills", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillsVarargs(value: Paint*): Self = StObject.set(x, "fills", js.Array(value :_*))
    
    @scala.inline
    def setOutlineStroke(value: () => VectorNode | Null): Self = StObject.set(x, "outlineStroke", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStrokeAlign(value: CENTER | INSIDE | OUTSIDE): Self = StObject.set(x, "strokeAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeCap(value: StrokeCap | js.Symbol): Self = StObject.set(x, "strokeCap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeJoin(value: StrokeJoin | js.Symbol): Self = StObject.set(x, "strokeJoin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeMiterLimit(value: Double): Self = StObject.set(x, "strokeMiterLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeStyleId(value: String): Self = StObject.set(x, "strokeStyleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeWeight(value: Double): Self = StObject.set(x, "strokeWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokes(value: js.Array[Paint]): Self = StObject.set(x, "strokes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokesVarargs(value: Paint*): Self = StObject.set(x, "strokes", js.Array(value :_*))
  }
}
