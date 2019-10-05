package typings.gapiDotClientDotFusiontables.gapi.client.fusiontables

import typings.gapiDotClientDotFusiontables.Anon_Colors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StyleFunction extends js.Object {
  /** Bucket function that assigns a style based on the range a column value falls into. */
  var buckets: js.UndefOr[js.Array[Bucket]] = js.undefined
  /** Name of the column whose value is used in the style. */
  var columnName: js.UndefOr[String] = js.undefined
  /** Gradient function that interpolates a range of colors based on column value. */
  var gradient: js.UndefOr[Anon_Colors] = js.undefined
  /**
    * Stylers can be one of three kinds: "fusiontables#fromColumn if the column value is to be used as is, i.e., the column values can have colors in
    * #RRGGBBAA format or integer line widths or icon names; fusiontables#gradient if the styling of the row is to be based on applying the gradient function
    * on the column value; or fusiontables#buckets if the styling is to based on the bucket into which the the column value falls.
    */
  var kind: js.UndefOr[String] = js.undefined
}

object StyleFunction {
  @scala.inline
  def apply(
    buckets: js.Array[Bucket] = null,
    columnName: String = null,
    gradient: Anon_Colors = null,
    kind: String = null
  ): StyleFunction = {
    val __obj = js.Dynamic.literal()
    if (buckets != null) __obj.updateDynamic("buckets")(buckets)
    if (columnName != null) __obj.updateDynamic("columnName")(columnName)
    if (gradient != null) __obj.updateDynamic("gradient")(gradient)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[StyleFunction]
  }
}

