package typings.gapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SourceSplitResponse extends js.Object {
  /**
    * If outcome is SPLITTING_HAPPENED, then this is a list of bundles
    * into which the source was split. Otherwise this field is ignored.
    * This list can be empty, which means the source represents an empty input.
    */
  var bundles: js.UndefOr[js.Array[DerivedSource]] = js.native
  /**
    * Indicates whether splitting happened and produced a list of bundles.
    * If this is USE_CURRENT_SOURCE_AS_IS, the current source should
    * be processed "as is" without splitting. "bundles" is ignored in this case.
    * If this is SPLITTING_HAPPENED, then "bundles" contains a list of
    * bundles into which the source was split.
    */
  var outcome: js.UndefOr[String] = js.native
  /** DEPRECATED in favor of bundles. */
  var shards: js.UndefOr[js.Array[SourceSplitShard]] = js.native
}

object SourceSplitResponse {
  @scala.inline
  def apply(): SourceSplitResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceSplitResponse]
  }
  @scala.inline
  implicit class SourceSplitResponseOps[Self <: SourceSplitResponse] (val x: Self) extends AnyVal {
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
    def setBundlesVarargs(value: DerivedSource*): Self = this.set("bundles", js.Array(value :_*))
    @scala.inline
    def setBundles(value: js.Array[DerivedSource]): Self = this.set("bundles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBundles: Self = this.set("bundles", js.undefined)
    @scala.inline
    def setOutcome(value: String): Self = this.set("outcome", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutcome: Self = this.set("outcome", js.undefined)
    @scala.inline
    def setShardsVarargs(value: SourceSplitShard*): Self = this.set("shards", js.Array(value :_*))
    @scala.inline
    def setShards(value: js.Array[SourceSplitShard]): Self = this.set("shards", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShards: Self = this.set("shards", js.undefined)
  }
  
}

