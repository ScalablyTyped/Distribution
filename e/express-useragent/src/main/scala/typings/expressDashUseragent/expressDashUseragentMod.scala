package typings.expressDashUseragent

import typings.expressDashUseragent.ExpressUseragentNs.UserAgent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-useragent", JSImport.Namespace)
@js.native
object expressDashUseragentMod extends js.Object {
  def express(): js.Function3[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify express.Request */ /* req */ js.Any, 
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify express.Response */ /* res */ js.Any, 
    /* next */ js.UndefOr[js.Function], 
    Unit
  ] = js.native
  def parse(source: String): UserAgent = js.native
}

