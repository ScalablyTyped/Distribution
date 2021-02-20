package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TraceCategoriesAndOptions extends StObject {
  
  // Docs: https://electronjs.org/docs/api/structures/trace-categories-and-options
  /**
    * A filter to control what category groups should be traced. A filter can have an
    * optional '-' prefix to exclude category groups that contain a matching category.
    * Having both included and excluded category patterns in the same list is not
    * supported. Examples: `test_MyTest*`, `test_MyTest*,test_OtherStuff`,
    * `-excluded_category1,-excluded_category2`.
    */
  var categoryFilter: String = js.native
  
  /**
    * Controls what kind of tracing is enabled, it is a comma-delimited sequence of
    * the following strings: `record-until-full`, `record-continuously`,
    * `trace-to-console`, `enable-sampling`, `enable-systrace`, e.g.
    * `'record-until-full,enable-sampling'`. The first 3 options are trace recording
    * modes and hence mutually exclusive. If more than one trace recording modes
    * appear in the `traceOptions` string, the last one takes precedence. If none of
    * the trace recording modes are specified, recording mode is `record-until-full`.
    * The trace option will first be reset to the default option (`record_mode` set to
    * `record-until-full`, `enable_sampling` and `enable_systrace` set to `false`)
    * before options parsed from `traceOptions` are applied on it.
    */
  var traceOptions: String = js.native
}
object TraceCategoriesAndOptions {
  
  @scala.inline
  def apply(categoryFilter: String, traceOptions: String): TraceCategoriesAndOptions = {
    val __obj = js.Dynamic.literal(categoryFilter = categoryFilter.asInstanceOf[js.Any], traceOptions = traceOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[TraceCategoriesAndOptions]
  }
  
  @scala.inline
  implicit class TraceCategoriesAndOptionsMutableBuilder[Self <: TraceCategoriesAndOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCategoryFilter(value: String): Self = StObject.set(x, "categoryFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTraceOptions(value: String): Self = StObject.set(x, "traceOptions", value.asInstanceOf[js.Any])
  }
}
