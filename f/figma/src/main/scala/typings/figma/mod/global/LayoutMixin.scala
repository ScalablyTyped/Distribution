package typings.figma.mod.global

import typings.figma.figmaStrings.CENTER
import typings.figma.figmaStrings.MAX
import typings.figma.figmaStrings.MIN
import typings.figma.figmaStrings.STRETCH
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LayoutMixin extends StObject {
  
  val absoluteTransform: Transform = js.native
  
  var constrainProportions: Boolean = js.native
  
  val height: Double = js.native
  
  var layoutAlign: MIN | CENTER | MAX | STRETCH = js.native
  
  var relativeTransform: Transform = js.native
  
  // applicable only inside auto-layout frames
  def resize(width: Double, height: Double): Unit = js.native
  
  def resizeWithoutConstraints(width: Double, height: Double): Unit = js.native
  
  var rotation: Double = js.native
  
  // In degrees
  val width: Double = js.native
  
  var x: Double = js.native
  
  var y: Double = js.native
}
object LayoutMixin {
  
  @scala.inline
  def apply(
    absoluteTransform: Transform,
    constrainProportions: Boolean,
    height: Double,
    layoutAlign: MIN | CENTER | MAX | STRETCH,
    relativeTransform: Transform,
    resize: (Double, Double) => Unit,
    resizeWithoutConstraints: (Double, Double) => Unit,
    rotation: Double,
    width: Double,
    x: Double,
    y: Double
  ): LayoutMixin = {
    val __obj = js.Dynamic.literal(absoluteTransform = absoluteTransform.asInstanceOf[js.Any], constrainProportions = constrainProportions.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], layoutAlign = layoutAlign.asInstanceOf[js.Any], relativeTransform = relativeTransform.asInstanceOf[js.Any], resize = js.Any.fromFunction2(resize), resizeWithoutConstraints = js.Any.fromFunction2(resizeWithoutConstraints), rotation = rotation.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayoutMixin]
  }
  
  @scala.inline
  implicit class LayoutMixinMutableBuilder[Self <: LayoutMixin] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbsoluteTransform(value: Transform): Self = StObject.set(x, "absoluteTransform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConstrainProportions(value: Boolean): Self = StObject.set(x, "constrainProportions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayoutAlign(value: MIN | CENTER | MAX | STRETCH): Self = StObject.set(x, "layoutAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelativeTransform(value: Transform): Self = StObject.set(x, "relativeTransform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResize(value: (Double, Double) => Unit): Self = StObject.set(x, "resize", js.Any.fromFunction2(value))
    
    @scala.inline
    def setResizeWithoutConstraints(value: (Double, Double) => Unit): Self = StObject.set(x, "resizeWithoutConstraints", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
