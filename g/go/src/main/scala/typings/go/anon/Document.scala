package typings.go.anon

import typings.go.mod.BrushLike
import typings.go.mod.GraphObject
import typings.go.mod.Iterable
import typings.go.mod.MarginLike
import typings.go.mod.Part
import typings.go.mod.Point
import typings.go.mod.Size
import typings.std.SVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Document extends js.Object {
  
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
  implicit class DocumentOps[Self <: Document] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBackground(value: BrushLike): Self = this.set("background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackground: Self = this.set("background", js.undefined)
    
    @scala.inline
    def setDocument(value: typings.std.Document): Self = this.set("document", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocument: Self = this.set("document", js.undefined)
    
    @scala.inline
    def setElementFinished(value: (/* obj */ GraphObject, /* elt */ SVGElement) => Unit): Self = this.set("elementFinished", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteElementFinished: Self = this.set("elementFinished", js.undefined)
    
    @scala.inline
    def setMaxSize(value: Size): Self = this.set("maxSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxSize: Self = this.set("maxSize", js.undefined)
    
    @scala.inline
    def setPadding(value: MarginLike): Self = this.set("padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    
    @scala.inline
    def setParts(value: Iterable[Part]): Self = this.set("parts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParts: Self = this.set("parts", js.undefined)
    
    @scala.inline
    def setPosition(value: Point): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setScale(value: Double): Self = this.set("scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
    
    @scala.inline
    def setShowGrid(value: Boolean): Self = this.set("showGrid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowGrid: Self = this.set("showGrid", js.undefined)
    
    @scala.inline
    def setShowTemporary(value: Boolean): Self = this.set("showTemporary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowTemporary: Self = this.set("showTemporary", js.undefined)
    
    @scala.inline
    def setSize(value: Size): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
}
