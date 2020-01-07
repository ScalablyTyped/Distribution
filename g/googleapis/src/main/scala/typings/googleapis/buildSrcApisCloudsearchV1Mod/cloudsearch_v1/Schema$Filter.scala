package typings.googleapis.buildSrcApisCloudsearchV1Mod.cloudsearch_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A generic way of expressing filters in a query, which supports two
  * approaches: &lt;br/&gt;&lt;br/&gt; **1. Setting a ValueFilter.** The name
  * must match an operator_name defined in the schema for your data source.
  * &lt;br/&gt; **2. Setting a CompositeFilter.** The filters are evaluated
  * using the logical operator. The top-level operators can only be either an
  * AND or a NOT. AND can appear only at the top-most level. OR can appear only
  * under a top-level AND.
  */
@js.native
trait Schema$Filter extends js.Object {
  var compositeFilter: js.UndefOr[Schema$CompositeFilter] = js.native
  var valueFilter: js.UndefOr[Schema$ValueFilter] = js.native
}

object Schema$Filter {
  @scala.inline
  def apply(compositeFilter: Schema$CompositeFilter = null, valueFilter: Schema$ValueFilter = null): Schema$Filter = {
    val __obj = js.Dynamic.literal()
    if (compositeFilter != null) __obj.updateDynamic("compositeFilter")(compositeFilter.asInstanceOf[js.Any])
    if (valueFilter != null) __obj.updateDynamic("valueFilter")(valueFilter.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Filter]
  }
}

