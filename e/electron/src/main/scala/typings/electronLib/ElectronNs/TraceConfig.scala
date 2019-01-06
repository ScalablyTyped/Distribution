package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TraceConfig extends js.Object {
  // Docs: http://electronjs.org/docs/api/structures/trace-config
  var excluded_categories: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var included_categories: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var memory_dump_config: js.UndefOr[MemoryDumpConfig] = js.undefined
}

