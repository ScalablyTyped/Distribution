package typings
package gapiDotClientDotFusiontablesLib.gapiNs.clientNs.fusiontablesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait StyleFunction extends js.Object {
  /** Bucket function that assigns a style based on the range a column value falls into. */
  var buckets: js.UndefOr[js.Array[Bucket]] = js.undefined
  /** Name of the column whose value is used in the style. */
  var columnName: js.UndefOr[java.lang.String] = js.undefined
  /** Gradient function that interpolates a range of colors based on column value. */
  var gradient: js.UndefOr[gapiDotClientDotFusiontablesLib.Anon_Max] = js.undefined
  /**
               * Stylers can be one of three kinds: "fusiontables#fromColumn if the column value is to be used as is, i.e., the column values can have colors in
               * #RRGGBBAA format or integer line widths or icon names; fusiontables#gradient if the styling of the row is to be based on applying the gradient function
               * on the column value; or fusiontables#buckets if the styling is to based on the bucket into which the the column value falls.
               */
  var kind: js.UndefOr[java.lang.String] = js.undefined
}

