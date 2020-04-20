package typings.falcor.mod

import typings.falcorHttpDatasource.mod.XMlHttpSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A HttpDataSource object is a {@link DataSource} can be used to retrieve data from a remote JSONGraph object using the browser's XMLHttpRequest.
  **/
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FalcorModel.DataSource * / any */ @JSImport("falcor", "HttpDataSource")
@js.native
class HttpDataSource protected () extends XMlHttpSource {
  def this(jsonGraphUrl: String) = this()
  def this(jsonGraphUrl: String, config: js.Any) = this()
}

