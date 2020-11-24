package typings.dygraphs.dygraphs

import typings.dygraphs.Dygraph
import typings.std.HTMLDivElement
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Annotation extends js.Object {
  
  /**    If true, attach annotations to the x-axis, rather than to actual points. */
  var attachAtBottom: js.UndefOr[Boolean] = js.native
  
  /** This function is called whenever the user clicks on this annotation. */
  var clickHandler: js.UndefOr[
    js.Function4[
      /* annotation */ this.type, 
      /* point */ Point, 
      /* dygraph */ Dygraph, 
      /* event */ MouseEvent, 
      _
    ]
  ] = js.native
  
  /**    CSS class to use for styling the annotation. */
  var cssClass: js.UndefOr[String] = js.native
  
  /** this function is called whenever the user double-clicks on this annotation. */
  var dblClickHandler: js.UndefOr[
    js.Function4[
      /* annotation */ this.type, 
      /* point */ Point, 
      /* dygraph */ Dygraph, 
      /* event */ MouseEvent, 
      _
    ]
  ] = js.native
  
  var div: js.UndefOr[HTMLDivElement] = js.native
  
  /** Height (in pixels) of the annotation flag or icon. */
  var height: js.UndefOr[Double] = js.native
  
  /**
    * Specify in place of shortText to mark the annotation with an image rather than text.
    * If you specify this, you must specify width and height.
    */
  var icon: js.UndefOr[String] = js.native
  
  /** This function is called whenever the user mouses out of this annotation. */
  var mouseOutHandler: js.UndefOr[
    js.Function4[
      /* annotation */ this.type, 
      /* point */ Point, 
      /* dygraph */ Dygraph, 
      /* event */ MouseEvent, 
      _
    ]
  ] = js.native
  
  /** This function is called whenever the user mouses over this annotation. */
  var mouseOverHandler: js.UndefOr[
    js.Function4[
      /* annotation */ this.type, 
      /* point */ Point, 
      /* dygraph */ Dygraph, 
      /* event */ MouseEvent, 
      _
    ]
  ] = js.native
  
  /** The name of the series to which the annotated point belongs. */
  var series: String = js.native
  
  /**    Text that will appear on the annotation's flag. */
  var shortText: js.UndefOr[String] = js.native
  
  /** A longer description of the annotation which will appear when the user hovers over it. */
  var text: js.UndefOr[String] = js.native
  
  /**    Height of the tick mark (in pixels) connecting the point to its flag or icon. */
  var tickHeight: js.UndefOr[Double] = js.native
  
  /**    Width (in pixels) of the annotation flag or icon. */
  var width: js.UndefOr[Double] = js.native
  
  /**
    * The x value of the point. This should be the same as the value
    * you specified in your CSV file, e.g. "2010-09-13".
    * You must set either x or xval.
    */
  var x: js.UndefOr[Double | String] = js.native
  
  /**
    * numeric value of the point, or millis since epoch.
    */
  var xval: js.UndefOr[Double] = js.native
}
object Annotation {
  
  @scala.inline
  def apply(series: String): Annotation = {
    val __obj = js.Dynamic.literal(series = series.asInstanceOf[js.Any])
    __obj.asInstanceOf[Annotation]
  }
  
  @scala.inline
  implicit class AnnotationOps[Self <: Annotation] (val x: Self) extends AnyVal {
    
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
    def setSeries(value: String): Self = this.set("series", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachAtBottom(value: Boolean): Self = this.set("attachAtBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttachAtBottom: Self = this.set("attachAtBottom", js.undefined)
    
    @scala.inline
    def setClickHandler(value: (Annotation, /* point */ Point, /* dygraph */ Dygraph, /* event */ MouseEvent) => _): Self = this.set("clickHandler", js.Any.fromFunction4(value))
    
    @scala.inline
    def deleteClickHandler: Self = this.set("clickHandler", js.undefined)
    
    @scala.inline
    def setCssClass(value: String): Self = this.set("cssClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCssClass: Self = this.set("cssClass", js.undefined)
    
    @scala.inline
    def setDblClickHandler(value: (Annotation, /* point */ Point, /* dygraph */ Dygraph, /* event */ MouseEvent) => _): Self = this.set("dblClickHandler", js.Any.fromFunction4(value))
    
    @scala.inline
    def deleteDblClickHandler: Self = this.set("dblClickHandler", js.undefined)
    
    @scala.inline
    def setDiv(value: HTMLDivElement): Self = this.set("div", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDiv: Self = this.set("div", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setMouseOutHandler(value: (Annotation, /* point */ Point, /* dygraph */ Dygraph, /* event */ MouseEvent) => _): Self = this.set("mouseOutHandler", js.Any.fromFunction4(value))
    
    @scala.inline
    def deleteMouseOutHandler: Self = this.set("mouseOutHandler", js.undefined)
    
    @scala.inline
    def setMouseOverHandler(value: (Annotation, /* point */ Point, /* dygraph */ Dygraph, /* event */ MouseEvent) => _): Self = this.set("mouseOverHandler", js.Any.fromFunction4(value))
    
    @scala.inline
    def deleteMouseOverHandler: Self = this.set("mouseOverHandler", js.undefined)
    
    @scala.inline
    def setShortText(value: String): Self = this.set("shortText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShortText: Self = this.set("shortText", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    
    @scala.inline
    def setTickHeight(value: Double): Self = this.set("tickHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTickHeight: Self = this.set("tickHeight", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    
    @scala.inline
    def setX(value: Double | String): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    
    @scala.inline
    def setXval(value: Double): Self = this.set("xval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXval: Self = this.set("xval", js.undefined)
  }
}
