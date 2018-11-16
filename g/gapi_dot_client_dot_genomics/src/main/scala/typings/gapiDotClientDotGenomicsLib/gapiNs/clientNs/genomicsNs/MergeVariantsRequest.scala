package typings
package gapiDotClientDotGenomicsLib.gapiNs.clientNs.genomicsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait MergeVariantsRequest extends js.Object {
  /**
               * A mapping between info field keys and the InfoMergeOperations to
               * be performed on them.
               */
  var infoMergeConfig: js.UndefOr[stdLib.Record[java.lang.String, java.lang.String]] = js.undefined
  /** The destination variant set. */
  var variantSetId: js.UndefOr[java.lang.String] = js.undefined
  /** The variants to be merged with existing variants. */
  var variants: js.UndefOr[js.Array[Variant]] = js.undefined
}

