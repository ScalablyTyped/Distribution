package typings.electron.Electron

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TraceConfig extends StObject {
  
  // Docs: https://electronjs.org/docs/api/structures/trace-config
  /**
    * if true, filter event data according to a specific list of events that have been
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
  var memory_dump_config: js.UndefOr[Record[String, Any]] = js.undefined
  
  /**
    * Can be `record-until-full`, `record-continuously`, `record-as-much-as-possible`
    * or `trace-to-console`. Defaults to `record-until-full`.
    */
  var recording_mode: js.UndefOr[
    "record-until-full" | "record-continuously" | "record-as-much-as-possible" | "trace-to-console"
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
  
  inline def apply(): TraceConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TraceConfig]
  }
  
  extension [Self <: TraceConfig](x: Self) {
    
    inline def setEnable_argument_filter(value: Boolean): Self = StObject.set(x, "enable_argument_filter", value.asInstanceOf[js.Any])
    
    inline def setEnable_argument_filterUndefined: Self = StObject.set(x, "enable_argument_filter", js.undefined)
    
    inline def setExcluded_categories(value: js.Array[String]): Self = StObject.set(x, "excluded_categories", value.asInstanceOf[js.Any])
    
    inline def setExcluded_categoriesUndefined: Self = StObject.set(x, "excluded_categories", js.undefined)
    
    inline def setExcluded_categoriesVarargs(value: String*): Self = StObject.set(x, "excluded_categories", js.Array(value*))
    
    inline def setHistogram_names(value: js.Array[String]): Self = StObject.set(x, "histogram_names", value.asInstanceOf[js.Any])
    
    inline def setHistogram_namesUndefined: Self = StObject.set(x, "histogram_names", js.undefined)
    
    inline def setHistogram_namesVarargs(value: String*): Self = StObject.set(x, "histogram_names", js.Array(value*))
    
    inline def setIncluded_categories(value: js.Array[String]): Self = StObject.set(x, "included_categories", value.asInstanceOf[js.Any])
    
    inline def setIncluded_categoriesUndefined: Self = StObject.set(x, "included_categories", js.undefined)
    
    inline def setIncluded_categoriesVarargs(value: String*): Self = StObject.set(x, "included_categories", js.Array(value*))
    
    inline def setIncluded_process_ids(value: js.Array[Double]): Self = StObject.set(x, "included_process_ids", value.asInstanceOf[js.Any])
    
    inline def setIncluded_process_idsUndefined: Self = StObject.set(x, "included_process_ids", js.undefined)
    
    inline def setIncluded_process_idsVarargs(value: Double*): Self = StObject.set(x, "included_process_ids", js.Array(value*))
    
    inline def setMemory_dump_config(value: Record[String, Any]): Self = StObject.set(x, "memory_dump_config", value.asInstanceOf[js.Any])
    
    inline def setMemory_dump_configUndefined: Self = StObject.set(x, "memory_dump_config", js.undefined)
    
    inline def setRecording_mode(
      value: "record-until-full" | "record-continuously" | "record-as-much-as-possible" | "trace-to-console"
    ): Self = StObject.set(x, "recording_mode", value.asInstanceOf[js.Any])
    
    inline def setRecording_modeUndefined: Self = StObject.set(x, "recording_mode", js.undefined)
    
    inline def setTrace_buffer_size_in_events(value: Double): Self = StObject.set(x, "trace_buffer_size_in_events", value.asInstanceOf[js.Any])
    
    inline def setTrace_buffer_size_in_eventsUndefined: Self = StObject.set(x, "trace_buffer_size_in_events", js.undefined)
    
    inline def setTrace_buffer_size_in_kb(value: Double): Self = StObject.set(x, "trace_buffer_size_in_kb", value.asInstanceOf[js.Any])
    
    inline def setTrace_buffer_size_in_kbUndefined: Self = StObject.set(x, "trace_buffer_size_in_kb", js.undefined)
  }
}
