package typings.foreverAgent

import org.scalablytyped.runtime.Instantiable1
import typings.foreverAgent.mod.ForeverAgentOptions
import typings.foreverAgent.mod.ForeverAgentSSL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOptions extends js.Object {
  var SSL: Instantiable1[js.UndefOr[/* options */ ForeverAgentOptions], ForeverAgentSSL]
}

object AnonOptions {
  @scala.inline
  def apply(SSL: Instantiable1[js.UndefOr[/* options */ ForeverAgentOptions], ForeverAgentSSL]): AnonOptions = {
    val __obj = js.Dynamic.literal(SSL = SSL.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonOptions]
  }
}

