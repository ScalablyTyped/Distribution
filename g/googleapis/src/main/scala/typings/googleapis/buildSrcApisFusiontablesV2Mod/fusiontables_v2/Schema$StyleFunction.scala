package typings.googleapis.buildSrcApisFusiontablesV2Mod.fusiontables_v2

import typings.googleapis.Anon_Colors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a StyleFunction within a StyleSetting
  */
@js.native
trait Schema$StyleFunction extends js.Object {
  /**
    * Bucket function that assigns a style based on the range a column value
    * falls into.
    */
  var buckets: js.UndefOr[js.Array[Schema$Bucket]] = js.native
  /**
    * Name of the column whose value is used in the style.
    */
  var columnName: js.UndefOr[String] = js.native
  /**
    * Gradient function that interpolates a range of colors based on column
    * value.
    */
  var gradient: js.UndefOr[Anon_Colors] = js.native
  /**
    * Stylers can be one of three kinds: &quot;fusiontables#fromColumn if the
    * column value is to be used as is, i.e., the column values can have colors
    * in #RRGGBBAA format or integer line widths or icon names;
    * fusiontables#gradient if the styling of the row is to be based on
    * applying the gradient function on the column value; or
    * fusiontables#buckets if the styling is to based on the bucket into which
    * the the column value falls.
    */
  var kind: js.UndefOr[String] = js.native
}

object Schema$StyleFunction {
  @scala.inline
  def apply(
    buckets: js.Array[Schema$Bucket] = null,
    columnName: String = null,
    gradient: Anon_Colors = null,
    kind: String = null
  ): Schema$StyleFunction = {
    val __obj = js.Dynamic.literal()
    if (buckets != null) __obj.updateDynamic("buckets")(buckets.asInstanceOf[js.Any])
    if (columnName != null) __obj.updateDynamic("columnName")(columnName.asInstanceOf[js.Any])
    if (gradient != null) __obj.updateDynamic("gradient")(gradient.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$StyleFunction]
  }
}

