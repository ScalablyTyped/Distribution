package typings.googleapis.buildSrcApisSlidesV1Mod.slides_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The properties of the Line.  When unset, these fields default to values
  * that match the appearance of new lines created in the Slides editor.
  */
@js.native
trait Schema$LineProperties extends js.Object {
  /**
    * The dash style of the line.
    */
  var dashStyle: js.UndefOr[String] = js.native
  /**
    * The style of the arrow at the end of the line.
    */
  var endArrow: js.UndefOr[String] = js.native
  /**
    * The connection at the end of the line. If unset, there is no connection.
    * Only lines with a Type indicating it is a &quot;connector&quot; can have
    * an `end_connection`.
    */
  var endConnection: js.UndefOr[Schema$LineConnection] = js.native
  /**
    * The fill of the line. The default line fill matches the defaults for new
    * lines created in the Slides editor.
    */
  var lineFill: js.UndefOr[Schema$LineFill] = js.native
  /**
    * The hyperlink destination of the line. If unset, there is no link.
    */
  var link: js.UndefOr[Schema$Link] = js.native
  /**
    * The style of the arrow at the beginning of the line.
    */
  var startArrow: js.UndefOr[String] = js.native
  /**
    * The connection at the beginning of the line. If unset, there is no
    * connection.  Only lines with a Type indicating it is a
    * &quot;connector&quot; can have a `start_connection`.
    */
  var startConnection: js.UndefOr[Schema$LineConnection] = js.native
  /**
    * The thickness of the line.
    */
  var weight: js.UndefOr[Schema$Dimension] = js.native
}

object Schema$LineProperties {
  @scala.inline
  def apply(
    dashStyle: String = null,
    endArrow: String = null,
    endConnection: Schema$LineConnection = null,
    lineFill: Schema$LineFill = null,
    link: Schema$Link = null,
    startArrow: String = null,
    startConnection: Schema$LineConnection = null,
    weight: Schema$Dimension = null
  ): Schema$LineProperties = {
    val __obj = js.Dynamic.literal()
    if (dashStyle != null) __obj.updateDynamic("dashStyle")(dashStyle.asInstanceOf[js.Any])
    if (endArrow != null) __obj.updateDynamic("endArrow")(endArrow.asInstanceOf[js.Any])
    if (endConnection != null) __obj.updateDynamic("endConnection")(endConnection.asInstanceOf[js.Any])
    if (lineFill != null) __obj.updateDynamic("lineFill")(lineFill.asInstanceOf[js.Any])
    if (link != null) __obj.updateDynamic("link")(link.asInstanceOf[js.Any])
    if (startArrow != null) __obj.updateDynamic("startArrow")(startArrow.asInstanceOf[js.Any])
    if (startConnection != null) __obj.updateDynamic("startConnection")(startConnection.asInstanceOf[js.Any])
    if (weight != null) __obj.updateDynamic("weight")(weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$LineProperties]
  }
}

