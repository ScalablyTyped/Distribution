package typings.floatingUiCore

import typings.floatingUiCore.srcTypesMod.Alignment
import typings.floatingUiCore.srcTypesMod.Axis
import typings.floatingUiCore.srcTypesMod.ElementContext
import typings.floatingUiCore.srcTypesMod.Length
import typings.floatingUiCore.srcTypesMod.RootBoundary
import typings.floatingUiCore.srcTypesMod.Side
import typings.floatingUiCore.srcTypesMod.Strategy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object floatingUiCoreStrings {
  
  @js.native
  sealed trait absolute
    extends StObject
       with Strategy
  inline def absolute: absolute = "absolute".asInstanceOf[absolute]
  
  @js.native
  sealed trait bestFit extends StObject
  inline def bestFit: bestFit = "bestFit".asInstanceOf[bestFit]
  
  @js.native
  sealed trait bottom
    extends StObject
       with Side
  inline def bottom: bottom = "bottom".asInstanceOf[bottom]
  
  @js.native
  sealed trait document
    extends StObject
       with RootBoundary
  inline def document: document = "document".asInstanceOf[document]
  
  @js.native
  sealed trait end
    extends StObject
       with Alignment
  inline def end: end = "end".asInstanceOf[end]
  
  @js.native
  sealed trait escaped extends StObject
  inline def escaped: escaped = "escaped".asInstanceOf[escaped]
  
  @js.native
  sealed trait fixed
    extends StObject
       with Strategy
  inline def fixed: fixed = "fixed".asInstanceOf[fixed]
  
  @js.native
  sealed trait floating
    extends StObject
       with ElementContext
  inline def floating: floating = "floating".asInstanceOf[floating]
  
  @js.native
  sealed trait height
    extends StObject
       with Length
  inline def height: height = "height".asInstanceOf[height]
  
  @js.native
  sealed trait initialPlacement extends StObject
  inline def initialPlacement: initialPlacement = "initialPlacement".asInstanceOf[initialPlacement]
  
  @js.native
  sealed trait left
    extends StObject
       with Side
  inline def left: left = "left".asInstanceOf[left]
  
  @js.native
  sealed trait none extends StObject
  inline def none: none = "none".asInstanceOf[none]
  
  @js.native
  sealed trait reference
    extends StObject
       with ElementContext
  inline def reference: reference = "reference".asInstanceOf[reference]
  
  @js.native
  sealed trait referenceHidden extends StObject
  inline def referenceHidden: referenceHidden = "referenceHidden".asInstanceOf[referenceHidden]
  
  @js.native
  sealed trait right
    extends StObject
       with Side
  inline def right: right = "right".asInstanceOf[right]
  
  @js.native
  sealed trait start
    extends StObject
       with Alignment
  inline def start: start = "start".asInstanceOf[start]
  
  @js.native
  sealed trait top
    extends StObject
       with Side
  inline def top: top = "top".asInstanceOf[top]
  
  @js.native
  sealed trait viewport
    extends StObject
       with RootBoundary
  inline def viewport: viewport = "viewport".asInstanceOf[viewport]
  
  @js.native
  sealed trait width
    extends StObject
       with Length
  inline def width: width = "width".asInstanceOf[width]
  
  @js.native
  sealed trait x
    extends StObject
       with Axis
  inline def x: x = "x".asInstanceOf[x]
  
  @js.native
  sealed trait y
    extends StObject
       with Axis
  inline def y: y = "y".asInstanceOf[y]
}
