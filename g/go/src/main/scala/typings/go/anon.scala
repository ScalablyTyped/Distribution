package typings.go

import typings.go.mod.BrushLike
import typings.go.mod.GraphObject
import typings.go.mod.Iterable
import typings.go.mod.MarginLike
import typings.go.mod.Part
import typings.go.mod.Point
import typings.go.mod.Size
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Background extends StObject {
    
    var background: js.UndefOr[BrushLike] = js.native
    
    var details: js.UndefOr[js.Any] = js.native
    
    var document: js.UndefOr[typings.std.Document] = js.native
    
    var maxSize: js.UndefOr[Size] = js.native
    
    var padding: js.UndefOr[MarginLike] = js.native
    
    var parts: js.UndefOr[Iterable[Part]] = js.native
    
    var position: js.UndefOr[Point] = js.native
    
    var scale: js.UndefOr[Double] = js.native
    
    var showGrid: js.UndefOr[Boolean] = js.native
    
    var showTemporary: js.UndefOr[Boolean] = js.native
    
    var size: js.UndefOr[Size] = js.native
    
    var `type`: js.UndefOr[String] = js.native
  }
  object Background {
    
    @scala.inline
    def apply(): Background = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Background]
    }
    
    @scala.inline
    implicit class BackgroundMutableBuilder[Self <: Background] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackground(value: BrushLike): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      @scala.inline
      def setDetails(value: js.Any): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
      
      @scala.inline
      def setDocument(value: typings.std.Document): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDocumentUndefined: Self = StObject.set(x, "document", js.undefined)
      
      @scala.inline
      def setMaxSize(value: Size): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxSizeUndefined: Self = StObject.set(x, "maxSize", js.undefined)
      
      @scala.inline
      def setPadding(value: MarginLike): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      @scala.inline
      def setParts(value: Iterable[Part]): Self = StObject.set(x, "parts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPartsUndefined: Self = StObject.set(x, "parts", js.undefined)
      
      @scala.inline
      def setPosition(value: Point): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      @scala.inline
      def setShowGrid(value: Boolean): Self = StObject.set(x, "showGrid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowGridUndefined: Self = StObject.set(x, "showGrid", js.undefined)
      
      @scala.inline
      def setShowTemporary(value: Boolean): Self = StObject.set(x, "showTemporary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowTemporaryUndefined: Self = StObject.set(x, "showTemporary", js.undefined)
      
      @scala.inline
      def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait Document extends StObject {
    
    var background: js.UndefOr[BrushLike] = js.native
    
    var document: js.UndefOr[typings.std.Document] = js.native
    
    var elementFinished: js.UndefOr[js.Function2[/* obj */ GraphObject, /* elt */ SVGElement, Unit]] = js.native
    
    var maxSize: js.UndefOr[Size] = js.native
    
    var padding: js.UndefOr[MarginLike] = js.native
    
    var parts: js.UndefOr[Iterable[Part]] = js.native
    
    var position: js.UndefOr[Point] = js.native
    
    var scale: js.UndefOr[Double] = js.native
    
    var showGrid: js.UndefOr[Boolean] = js.native
    
    var showTemporary: js.UndefOr[Boolean] = js.native
    
    var size: js.UndefOr[Size] = js.native
  }
  object Document {
    
    @scala.inline
    def apply(): Document = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Document]
    }
    
    @scala.inline
    implicit class DocumentMutableBuilder[Self <: Document] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackground(value: BrushLike): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      @scala.inline
      def setDocument(value: typings.std.Document): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDocumentUndefined: Self = StObject.set(x, "document", js.undefined)
      
      @scala.inline
      def setElementFinished(value: (/* obj */ GraphObject, /* elt */ SVGElement) => Unit): Self = StObject.set(x, "elementFinished", js.Any.fromFunction2(value))
      
      @scala.inline
      def setElementFinishedUndefined: Self = StObject.set(x, "elementFinished", js.undefined)
      
      @scala.inline
      def setMaxSize(value: Size): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxSizeUndefined: Self = StObject.set(x, "maxSize", js.undefined)
      
      @scala.inline
      def setPadding(value: MarginLike): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      @scala.inline
      def setParts(value: Iterable[Part]): Self = StObject.set(x, "parts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPartsUndefined: Self = StObject.set(x, "parts", js.undefined)
      
      @scala.inline
      def setPosition(value: Point): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      @scala.inline
      def setShowGrid(value: Boolean): Self = StObject.set(x, "showGrid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowGridUndefined: Self = StObject.set(x, "showGrid", js.undefined)
      
      @scala.inline
      def setShowTemporary(value: Boolean): Self = StObject.set(x, "showTemporary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowTemporaryUndefined: Self = StObject.set(x, "showTemporary", js.undefined)
      
      @scala.inline
      def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  @js.native
  trait Random extends StObject {
    
    def random(): Double = js.native
  }
  object Random {
    
    @scala.inline
    def apply(random: () => Double): Random = {
      val __obj = js.Dynamic.literal(random = js.Any.fromFunction0(random))
      __obj.asInstanceOf[Random]
    }
    
    @scala.inline
    implicit class RandomMutableBuilder[Self <: Random] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRandom(value: () => Double): Self = StObject.set(x, "random", js.Any.fromFunction0(value))
    }
  }
}
