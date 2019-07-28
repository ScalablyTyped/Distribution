package typings.electron.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TraceConfig extends js.Object {
  // Docs: http://electronjs.org/docs/api/structures/trace-config
  var excluded_categories: js.UndefOr[js.Array[String]] = js.undefined
  var included_categories: js.UndefOr[js.Array[String]] = js.undefined
  var memory_dump_config: js.UndefOr[MemoryDumpConfig] = js.undefined
}

object TraceConfig {
  @scala.inline
  def apply(
    excluded_categories: js.Array[String] = null,
    included_categories: js.Array[String] = null,
    memory_dump_config: MemoryDumpConfig = null
  ): TraceConfig = {
    val __obj = js.Dynamic.literal()
    if (excluded_categories != null) __obj.updateDynamic("excluded_categories")(excluded_categories)
    if (included_categories != null) __obj.updateDynamic("included_categories")(included_categories)
    if (memory_dump_config != null) __obj.updateDynamic("memory_dump_config")(memory_dump_config)
    __obj.asInstanceOf[TraceConfig]
  }
}

