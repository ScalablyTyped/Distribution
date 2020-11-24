package typings.fitfont.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fitfont", "FitFont")
@js.native
class FitFont protected () extends js.Object {
  def this(options: Options) = this()
  
  /**
    * Horizontal alignment
    */
  var halign: HorizontalAlign = js.native
  
  /**
    * Letter spacing
    */
  var letterspacing: Double = js.native
  
  /**
    * Force the redraw
    */
  def redraw(): Unit = js.native
  
  /**
    * Text to show
    */
  var text: String = js.native
  
  /**
    * Vertical alignment
    */
  var valign: VerticalAlign = js.native
  
  /**
    * With (read only)
    */
  val width: Double = js.native
}
