package typings.foreverAgent.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.TopLevel
import typings.node.httpMod.Agent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("forever-agent", JSImport.Namespace)
@js.native
class ^ () extends Agent {
  def this(options: ForeverAgentOptions) = this()
}

@JSImport("forever-agent", JSImport.Namespace)
@js.native
object ^ extends TopLevel[
      Instantiable0[ForeverAgent] with (Instantiable1[/* options */ ForeverAgentOptions, ForeverAgent])
    ] {
  var SSL: Instantiable1[js.UndefOr[/* options */ ForeverAgentOptions], ForeverAgentSSL] = js.native
  var defaultMinSockets: Double = js.native
}

