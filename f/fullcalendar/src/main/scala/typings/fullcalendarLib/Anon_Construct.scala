package typings
package fullcalendarLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Construct extends js.Object {
  def construct(executor: js.Any): jqueryLib.JQueryPromise[js.Object]
  def reject(): jqueryLib.JQueryPromise[js.Object]
  def resolve(`val`: js.Any): jqueryLib.JQueryPromise[js.Object]
}

object Anon_Construct {
  @scala.inline
  def apply(
    construct: js.Function1[js.Any, jqueryLib.JQueryPromise[js.Object]],
    reject: js.Function0[jqueryLib.JQueryPromise[js.Object]],
    resolve: js.Function1[js.Any, jqueryLib.JQueryPromise[js.Object]]
  ): Anon_Construct = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("construct")(construct)
    __obj.updateDynamic("reject")(reject)
    __obj.updateDynamic("resolve")(resolve)
    __obj.asInstanceOf[Anon_Construct]
  }
}

