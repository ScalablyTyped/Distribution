package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the client-side equivalent of the TextAnnotation class.
  */
@js.native
trait ASPxClientTextAnnotation extends ASPxClientWebChartElementNamed {
  
  /**
    * Gets the lines of text within an annotation.
    */
  var lines: js.Array[String] = js.native
}
object ASPxClientTextAnnotation {
  
  @scala.inline
  def apply(chart: ASPxClientWebChart, lines: js.Array[String], name: String): ASPxClientTextAnnotation = {
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any], lines = lines.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientTextAnnotation]
  }
  
  @scala.inline
  implicit class ASPxClientTextAnnotationOps[Self <: ASPxClientTextAnnotation] (val x: Self) extends AnyVal {
    
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
    def setLinesVarargs(value: String*): Self = this.set("lines", js.Array(value :_*))
    
    @scala.inline
    def setLines(value: js.Array[String]): Self = this.set("lines", value.asInstanceOf[js.Any])
  }
}
