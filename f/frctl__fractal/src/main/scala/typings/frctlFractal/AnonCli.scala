package typings.frctlFractal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCli extends js.Object {
  var cli: String
  var local: String
}

object AnonCli {
  @scala.inline
  def apply(cli: String, local: String): AnonCli = {
    val __obj = js.Dynamic.literal(cli = cli.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCli]
  }
}

