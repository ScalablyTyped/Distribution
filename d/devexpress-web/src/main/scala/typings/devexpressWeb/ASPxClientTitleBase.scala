package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the base for ASPxClientChartTitle and ASPxClientSeriesTitle classes.
  */
@js.native
trait ASPxClientTitleBase extends ASPxClientWebChartElement {
  
  /**
    * Gets the alignment of the title.
    */
  var alignment: String = js.native
  
  /**
    * Gets a value that specifies to which edges of a parent element the title should be docked.
    */
  var dock: String = js.native
  
  /**
    * Gets the lines of text within a title.
    */
  var lines: js.Array[String] = js.native
}
object ASPxClientTitleBase {
  
  @scala.inline
  def apply(alignment: String, chart: ASPxClientWebChart, dock: String, lines: js.Array[String]): ASPxClientTitleBase = {
    val __obj = js.Dynamic.literal(alignment = alignment.asInstanceOf[js.Any], chart = chart.asInstanceOf[js.Any], dock = dock.asInstanceOf[js.Any], lines = lines.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientTitleBase]
  }
  
  @scala.inline
  implicit class ASPxClientTitleBaseOps[Self <: ASPxClientTitleBase] (val x: Self) extends AnyVal {
    
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
    def setAlignment(value: String): Self = this.set("alignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDock(value: String): Self = this.set("dock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinesVarargs(value: String*): Self = this.set("lines", js.Array(value :_*))
    
    @scala.inline
    def setLines(value: js.Array[String]): Self = this.set("lines", value.asInstanceOf[js.Any])
  }
}
