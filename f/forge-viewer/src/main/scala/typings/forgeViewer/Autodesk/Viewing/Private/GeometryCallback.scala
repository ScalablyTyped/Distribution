package typings.forgeViewer.Autodesk.Viewing.Private

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeometryCallback extends StObject {
  
  var onCircularArc: js.UndefOr[
    js.Function6[
      /* cx */ Double, 
      /* cy */ Double, 
      /* start */ Double, 
      /* end */ Double, 
      /* radius */ Double, 
      /* vpId */ Double, 
      Unit
    ]
  ] = js.undefined
  
  var onEllipticalArc: js.UndefOr[
    js.Function8[
      /* cx */ Double, 
      /* cy */ Double, 
      /* start */ Double, 
      /* end */ Double, 
      /* major */ Double, 
      /* minor */ Double, 
      /* tilt */ Double, 
      /* vpId */ Double, 
      Unit
    ]
  ] = js.undefined
  
  var onLineSegment: js.UndefOr[
    js.Function5[
      /* x1 */ Double, 
      /* y1 */ Double, 
      /* x2 */ Double, 
      /* y2 */ Double, 
      /* vpId */ Double, 
      Unit
    ]
  ] = js.undefined
  
  var onOneTriangle: js.UndefOr[
    js.Function7[
      /* x1 */ Double, 
      /* y1 */ Double, 
      /* x2 */ Double, 
      /* y2 */ Double, 
      /* x3 */ Double, 
      /* y3 */ Double, 
      /* vpId */ Double, 
      Unit
    ]
  ] = js.undefined
  
  var onTexQuad: js.UndefOr[
    js.Function6[
      /* centerX */ Double, 
      /* centerY */ Double, 
      /* width */ Double, 
      /* height */ Double, 
      /* rotation */ Double, 
      /* vpId */ Double, 
      Unit
    ]
  ] = js.undefined
  
  var onVertex: js.UndefOr[js.Function3[/* cx */ Double, /* cy */ Double, /* vpId */ Double, Unit]] = js.undefined
}
object GeometryCallback {
  
  inline def apply(): GeometryCallback = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeometryCallback]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GeometryCallback] (val x: Self) extends AnyVal {
    
    inline def setOnCircularArc(
      value: (/* cx */ Double, /* cy */ Double, /* start */ Double, /* end */ Double, /* radius */ Double, /* vpId */ Double) => Unit
    ): Self = StObject.set(x, "onCircularArc", js.Any.fromFunction6(value))
    
    inline def setOnCircularArcUndefined: Self = StObject.set(x, "onCircularArc", js.undefined)
    
    inline def setOnEllipticalArc(
      value: (/* cx */ Double, /* cy */ Double, /* start */ Double, /* end */ Double, /* major */ Double, /* minor */ Double, /* tilt */ Double, /* vpId */ Double) => Unit
    ): Self = StObject.set(x, "onEllipticalArc", js.Any.fromFunction8(value))
    
    inline def setOnEllipticalArcUndefined: Self = StObject.set(x, "onEllipticalArc", js.undefined)
    
    inline def setOnLineSegment(
      value: (/* x1 */ Double, /* y1 */ Double, /* x2 */ Double, /* y2 */ Double, /* vpId */ Double) => Unit
    ): Self = StObject.set(x, "onLineSegment", js.Any.fromFunction5(value))
    
    inline def setOnLineSegmentUndefined: Self = StObject.set(x, "onLineSegment", js.undefined)
    
    inline def setOnOneTriangle(
      value: (/* x1 */ Double, /* y1 */ Double, /* x2 */ Double, /* y2 */ Double, /* x3 */ Double, /* y3 */ Double, /* vpId */ Double) => Unit
    ): Self = StObject.set(x, "onOneTriangle", js.Any.fromFunction7(value))
    
    inline def setOnOneTriangleUndefined: Self = StObject.set(x, "onOneTriangle", js.undefined)
    
    inline def setOnTexQuad(
      value: (/* centerX */ Double, /* centerY */ Double, /* width */ Double, /* height */ Double, /* rotation */ Double, /* vpId */ Double) => Unit
    ): Self = StObject.set(x, "onTexQuad", js.Any.fromFunction6(value))
    
    inline def setOnTexQuadUndefined: Self = StObject.set(x, "onTexQuad", js.undefined)
    
    inline def setOnVertex(value: (/* cx */ Double, /* cy */ Double, /* vpId */ Double) => Unit): Self = StObject.set(x, "onVertex", js.Any.fromFunction3(value))
    
    inline def setOnVertexUndefined: Self = StObject.set(x, "onVertex", js.undefined)
  }
}
