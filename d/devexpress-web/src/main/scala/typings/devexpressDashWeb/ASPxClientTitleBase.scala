package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the base for ASPxClientChartTitle and ASPxClientSeriesTitle classes.
  */
@JSGlobal("ASPxClientTitleBase")
@js.native
class ASPxClientTitleBase () extends ASPxClientWebChartElement {
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

