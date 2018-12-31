package typings
package expressDashUseragentLib.ExpressUseragentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ExpressUseragent")
@js.native
object ExpressUseragentNsMembers extends js.Object {
  def express(): js.Function3[
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify express.Request */ /* req */ js.Any, 
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify express.Response */ /* res */ js.Any, 
    /* next */ js.UndefOr[js.Function], 
    scala.Unit
  ] = js.native
  def parse(source: java.lang.String): UserAgent = js.native
}

