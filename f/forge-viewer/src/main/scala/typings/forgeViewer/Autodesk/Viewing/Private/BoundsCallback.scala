package typings.forgeViewer.Autodesk.Viewing.Private

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BoundsCallback
  extends StObject
     with GeometryCallback {
  
  @JSName("onCircularArc")
  def onCircularArc_MBoundsCallback(cx: Double, cy: Double, start: Double, end: Double, radius: Double, vpId: Double): Unit
  
  @JSName("onEllipticalArc")
  def onEllipticalArc_MBoundsCallback(
    cx: Double,
    cy: Double,
    start: Double,
    end: Double,
    major: Double,
    minor: Double,
    tilt: Double,
    vpId: Double
  ): Unit
  
  @JSName("onLineSegment")
  def onLineSegment_MBoundsCallback(x1: Double, y1: Double, x2: Double, y2: Double, vpId: Double): Unit
  
  @JSName("onOneTriangle")
  def onOneTriangle_MBoundsCallback(x1: Double, y1: Double, x2: Double, y2: Double, x3: Double, y3: Double, vpId: Double): Unit
  
  @JSName("onTexQuad")
  def onTexQuad_MBoundsCallback(centerX: Double, centerY: Double, width: Double, height: Double, rotation: Double, vpId: Double): Unit
  
  @JSName("onVertex")
  def onVertex_MBoundsCallback(cx: Double, cy: Double, vpId: Double): Unit
}
object BoundsCallback {
  
  inline def apply(
    onCircularArc: (Double, Double, Double, Double, Double, Double) => Unit,
    onEllipticalArc: (Double, Double, Double, Double, Double, Double, Double, Double) => Unit,
    onLineSegment: (Double, Double, Double, Double, Double) => Unit,
    onOneTriangle: (Double, Double, Double, Double, Double, Double, Double) => Unit,
    onTexQuad: (Double, Double, Double, Double, Double, Double) => Unit,
    onVertex: (Double, Double, Double) => Unit
  ): BoundsCallback = {
    val __obj = js.Dynamic.literal(onCircularArc = js.Any.fromFunction6(onCircularArc), onEllipticalArc = js.Any.fromFunction8(onEllipticalArc), onLineSegment = js.Any.fromFunction5(onLineSegment), onOneTriangle = js.Any.fromFunction7(onOneTriangle), onTexQuad = js.Any.fromFunction6(onTexQuad), onVertex = js.Any.fromFunction3(onVertex))
    __obj.asInstanceOf[BoundsCallback]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BoundsCallback] (val x: Self) extends AnyVal {
    
    inline def setOnCircularArc(value: (Double, Double, Double, Double, Double, Double) => Unit): Self = StObject.set(x, "onCircularArc", js.Any.fromFunction6(value))
    
    inline def setOnEllipticalArc(value: (Double, Double, Double, Double, Double, Double, Double, Double) => Unit): Self = StObject.set(x, "onEllipticalArc", js.Any.fromFunction8(value))
    
    inline def setOnLineSegment(value: (Double, Double, Double, Double, Double) => Unit): Self = StObject.set(x, "onLineSegment", js.Any.fromFunction5(value))
    
    inline def setOnOneTriangle(value: (Double, Double, Double, Double, Double, Double, Double) => Unit): Self = StObject.set(x, "onOneTriangle", js.Any.fromFunction7(value))
    
    inline def setOnTexQuad(value: (Double, Double, Double, Double, Double, Double) => Unit): Self = StObject.set(x, "onTexQuad", js.Any.fromFunction6(value))
    
    inline def setOnVertex(value: (Double, Double, Double) => Unit): Self = StObject.set(x, "onVertex", js.Any.fromFunction3(value))
  }
}
