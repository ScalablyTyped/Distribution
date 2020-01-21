package typings.elasticsearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldStatsResponseField extends js.Object {
  var density: Double
  var doc_count: Double
  var is_aggregatable: String
  var is_searchable: String
  var max_doc: Double
  var max_value: js.Any
  var min_value: js.Any
  var sum_doc_freq: Double
  var sum_total_term_freq: Double
}

object FieldStatsResponseField {
  @scala.inline
  def apply(
    density: Double,
    doc_count: Double,
    is_aggregatable: String,
    is_searchable: String,
    max_doc: Double,
    max_value: js.Any,
    min_value: js.Any,
    sum_doc_freq: Double,
    sum_total_term_freq: Double
  ): FieldStatsResponseField = {
    val __obj = js.Dynamic.literal(density = density.asInstanceOf[js.Any], doc_count = doc_count.asInstanceOf[js.Any], is_aggregatable = is_aggregatable.asInstanceOf[js.Any], is_searchable = is_searchable.asInstanceOf[js.Any], max_doc = max_doc.asInstanceOf[js.Any], max_value = max_value.asInstanceOf[js.Any], min_value = min_value.asInstanceOf[js.Any], sum_doc_freq = sum_doc_freq.asInstanceOf[js.Any], sum_total_term_freq = sum_total_term_freq.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FieldStatsResponseField]
  }
}

