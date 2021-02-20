package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The pane title.
  */
@js.native
trait ASPxClientPaneTitle extends ASPxClientWebChartElement {
  
  /**
    * Returns the value that defines how to align the pane title.
    */
  var alignment: String = js.native
  
  /**
    * Returns the pane title's text.
    */
  var text: String = js.native
}
object ASPxClientPaneTitle {
  
  @scala.inline
  def apply(alignment: String, chart: ASPxClientWebChart, text: String): ASPxClientPaneTitle = {
    val __obj = js.Dynamic.literal(alignment = alignment.asInstanceOf[js.Any], chart = chart.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientPaneTitle]
  }
  
  @scala.inline
  implicit class ASPxClientPaneTitleMutableBuilder[Self <: ASPxClientPaneTitle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlignment(value: String): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
