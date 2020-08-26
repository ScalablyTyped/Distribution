package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TraceCategoriesAndOptions extends js.Object {
  // Docs: http://electronjs.org/docs/api/structures/trace-categories-and-options
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
  implicit class TraceCategoriesAndOptionsOps[Self <: TraceCategoriesAndOptions] (val x: Self) extends AnyVal {
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
    def setCategoryFilter(value: String): Self = this.set("categoryFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def setTraceOptions(value: String): Self = this.set("traceOptions", value.asInstanceOf[js.Any])
  }
  
}

