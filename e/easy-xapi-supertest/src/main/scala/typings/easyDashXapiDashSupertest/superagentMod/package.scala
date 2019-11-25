package typings.easyDashXapiDashSupertest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object superagentMod {
  type CallbackHandler = (js.Function2[/* err */ js.Any, /* res */ Response, Unit]) | (js.Function1[/* res */ Response, Unit])
  type SuperAgentRequest = Request[Request[Request[Request[js.Any]]]]
}
