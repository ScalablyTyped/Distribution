package typings.electron.Electron

import typings.electron.electronStrings.`record-as-much-as-possible`
import typings.electron.electronStrings.`record-continuously`
import typings.electron.electronStrings.`record-until-full`
import typings.electron.electronStrings.`trace-to-console`
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TraceConfig extends js.Object {
  // Docs: http://electronjs.org/docs/api/structures/trace-config
  /**
    * if true, filter event data according to a whitelist of events that have been
    * manually vetted to not include any PII. See the implementation in Chromium for
    * specifics.
    */
  var enable_argument_filter: js.UndefOr[Boolean] = js.undefined
  /**
    * a list of tracing categories to exclude. Can include glob-like patterns using
    * `*` at the end of the category name. See tracing categories for the list of
    * categories.
    */
  var excluded_categories: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * a list of histogram names to report with the trace.
    */
  var histogram_names: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * a list of tracing categories to include. Can include glob-like patterns using
    * `*` at the end of the category name. See tracing categories for the list of
    * categories.
    */
  var included_categories: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * a list of process IDs to include in the trace. If not specified, trace all
    * processes.
    */
  var included_process_ids: js.UndefOr[js.Array[Double]] = js.undefined
  /**
    * if the `disabled-by-default-memory-infra` category is enabled, this contains
    * optional additional configuration for data collection. See the Chromium
    * memory-infra docs for more information.
    */
  var memory_dump_config: js.UndefOr[Record[String, _]] = js.undefined
  /**
    * Can be `record-until-full`, `record-continuously`, `record-as-much-as-possible`
    * or `trace-to-console`. Defaults to `record-until-full`.
    */
  var recording_mode: js.UndefOr[
    `record-until-full` | `record-continuously` | `record-as-much-as-possible` | `trace-to-console`
  ] = js.undefined
  /**
    * maximum size of the trace recording buffer in events.
    */
  var trace_buffer_size_in_events: js.UndefOr[Double] = js.undefined
  /**
    * maximum size of the trace recording buffer in kilobytes. Defaults to 100MB.
    */
  var trace_buffer_size_in_kb: js.UndefOr[Double] = js.undefined
}

object TraceConfig {
  @scala.inline
  def apply(
    enable_argument_filter: js.UndefOr[Boolean] = js.undefined,
    excluded_categories: js.Array[String] = null,
    histogram_names: js.Array[String] = null,
    included_categories: js.Array[String] = null,
    included_process_ids: js.Array[Double] = null,
    memory_dump_config: Record[String, _] = null,
    recording_mode: `record-until-full` | `record-continuously` | `record-as-much-as-possible` | `trace-to-console` = null,
    trace_buffer_size_in_events: js.UndefOr[Double] = js.undefined,
    trace_buffer_size_in_kb: js.UndefOr[Double] = js.undefined
  ): TraceConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enable_argument_filter)) __obj.updateDynamic("enable_argument_filter")(enable_argument_filter.get.asInstanceOf[js.Any])
    if (excluded_categories != null) __obj.updateDynamic("excluded_categories")(excluded_categories.asInstanceOf[js.Any])
    if (histogram_names != null) __obj.updateDynamic("histogram_names")(histogram_names.asInstanceOf[js.Any])
    if (included_categories != null) __obj.updateDynamic("included_categories")(included_categories.asInstanceOf[js.Any])
    if (included_process_ids != null) __obj.updateDynamic("included_process_ids")(included_process_ids.asInstanceOf[js.Any])
    if (memory_dump_config != null) __obj.updateDynamic("memory_dump_config")(memory_dump_config.asInstanceOf[js.Any])
    if (recording_mode != null) __obj.updateDynamic("recording_mode")(recording_mode.asInstanceOf[js.Any])
    if (!js.isUndefined(trace_buffer_size_in_events)) __obj.updateDynamic("trace_buffer_size_in_events")(trace_buffer_size_in_events.get.asInstanceOf[js.Any])
    if (!js.isUndefined(trace_buffer_size_in_kb)) __obj.updateDynamic("trace_buffer_size_in_kb")(trace_buffer_size_in_kb.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TraceConfig]
  }
}

