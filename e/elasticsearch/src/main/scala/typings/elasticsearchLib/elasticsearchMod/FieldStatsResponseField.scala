package typings
package elasticsearchLib.elasticsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldStatsResponseField extends js.Object {
  var density: scala.Double
  var doc_count: scala.Double
  var is_aggregatable: java.lang.String
  var is_searchable: java.lang.String
  var max_doc: scala.Double
  var max_value: js.Any
  var min_value: js.Any
  var sum_doc_freq: scala.Double
  var sum_total_term_freq: scala.Double
}

object FieldStatsResponseField {
  @scala.inline
  def apply(
    density: scala.Double,
    doc_count: scala.Double,
    is_aggregatable: java.lang.String,
    is_searchable: java.lang.String,
    max_doc: scala.Double,
    max_value: js.Any,
    min_value: js.Any,
    sum_doc_freq: scala.Double,
    sum_total_term_freq: scala.Double
  ): FieldStatsResponseField = {
    val __obj = js.Dynamic.literal(density = density, doc_count = doc_count, is_aggregatable = is_aggregatable, is_searchable = is_searchable, max_doc = max_doc, max_value = max_value, min_value = min_value, sum_doc_freq = sum_doc_freq, sum_total_term_freq = sum_total_term_freq)
  
    __obj.asInstanceOf[FieldStatsResponseField]
  }
}

