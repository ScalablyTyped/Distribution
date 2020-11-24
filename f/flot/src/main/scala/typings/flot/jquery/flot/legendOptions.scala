package typings.flot.jquery.flot

import typings.jquery.JQuery
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait legendOptions extends js.Object {
  
                  //number of pixels or [x margin, y margin]
  var backgroundColor: js.UndefOr[js.Any] = js.native
  
         //null or color
  var backgroundOpacity: js.UndefOr[Double] = js.native
  
    // between 0 and 1
  var container: js.UndefOr[JQuery[HTMLElement]] = js.native
  
   //  null or (fn: string, series object -> string)
  var labelBoxBorderColor: js.UndefOr[js.Any] = js.native
  
  var labelFormatter: js.UndefOr[js.Function2[/* label */ String, /* series */ js.Any, String]] = js.native
  
             //"ne" or "nw" or "se" or "sw"
  var margin: js.UndefOr[js.Any] = js.native
  
     //color
  var noColumns: js.UndefOr[Double] = js.native
  
  var position: js.UndefOr[String] = js.native
  
  var show: js.UndefOr[Boolean] = js.native
  
           // null or jQuery object/DOM element/jQuery expression
  var sorted: js.UndefOr[js.Any] = js.native
}
object legendOptions {
  
  @scala.inline
  def apply(): legendOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[legendOptions]
  }
  
  @scala.inline
  implicit class legendOptionsOps[Self <: legendOptions] (val x: Self) extends AnyVal {
    
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
    def setBackgroundColor(value: js.Any): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    
    @scala.inline
    def setBackgroundOpacity(value: Double): Self = this.set("backgroundOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundOpacity: Self = this.set("backgroundOpacity", js.undefined)
    
    @scala.inline
    def setContainer(value: JQuery[HTMLElement]): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    
    @scala.inline
    def setLabelBoxBorderColor(value: js.Any): Self = this.set("labelBoxBorderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelBoxBorderColor: Self = this.set("labelBoxBorderColor", js.undefined)
    
    @scala.inline
    def setLabelFormatter(value: (/* label */ String, /* series */ js.Any) => String): Self = this.set("labelFormatter", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteLabelFormatter: Self = this.set("labelFormatter", js.undefined)
    
    @scala.inline
    def setMargin(value: js.Any): Self = this.set("margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    
    @scala.inline
    def setNoColumns(value: Double): Self = this.set("noColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoColumns: Self = this.set("noColumns", js.undefined)
    
    @scala.inline
    def setPosition(value: String): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setShow(value: Boolean): Self = this.set("show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShow: Self = this.set("show", js.undefined)
    
    @scala.inline
    def setSorted(value: js.Any): Self = this.set("sorted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSorted: Self = this.set("sorted", js.undefined)
  }
}
