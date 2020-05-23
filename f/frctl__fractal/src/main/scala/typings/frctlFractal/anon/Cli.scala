package typings.frctlFractal.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cli extends js.Object {
  var cli: String
  var local: String
}

object Cli {
  @scala.inline
  def apply(cli: String, local: String): Cli = {
    val __obj = js.Dynamic.literal(cli = cli.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cli]
  }
}

