package typings
package falcorLib.falcorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * A HttpDataSource object is a {@link DataSource} can be used to retrieve data from a remote JSONGraph object using the browser's XMLHttpRequest.
     **/
/* RemoveDifficultInheritance: 
- Dropped any */ @JSImport("falcor", "HttpDataSource")
@js.native
class HttpDataSource protected ()
  extends falcorDashHttpDashDatasourceLib.falcorDashHttpDashDatasourceMod.XMlHttpSource {
  def this(jsonGraphUrl: java.lang.String) = this()
  def this(jsonGraphUrl: java.lang.String, config: js.Any) = this()
}

