package typings.gapiDotClientDotDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceSplitResponse extends js.Object {
  /**
    * If outcome is SPLITTING_HAPPENED, then this is a list of bundles
    * into which the source was split. Otherwise this field is ignored.
    * This list can be empty, which means the source represents an empty input.
    */
  var bundles: js.UndefOr[js.Array[DerivedSource]] = js.undefined
  /**
    * Indicates whether splitting happened and produced a list of bundles.
    * If this is USE_CURRENT_SOURCE_AS_IS, the current source should
    * be processed "as is" without splitting. "bundles" is ignored in this case.
    * If this is SPLITTING_HAPPENED, then "bundles" contains a list of
    * bundles into which the source was split.
    */
  var outcome: js.UndefOr[String] = js.undefined
  /** DEPRECATED in favor of bundles. */
  var shards: js.UndefOr[js.Array[SourceSplitShard]] = js.undefined
}

object SourceSplitResponse {
  @scala.inline
  def apply(
    bundles: js.Array[DerivedSource] = null,
    outcome: String = null,
    shards: js.Array[SourceSplitShard] = null
  ): SourceSplitResponse = {
    val __obj = js.Dynamic.literal()
    if (bundles != null) __obj.updateDynamic("bundles")(bundles)
    if (outcome != null) __obj.updateDynamic("outcome")(outcome)
    if (shards != null) __obj.updateDynamic("shards")(shards)
    __obj.asInstanceOf[SourceSplitResponse]
  }
}

