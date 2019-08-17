package typings.emberDashQunit.emberDashQunitMod

import typings.ember.emberMod.defaultNs.Resolver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetupTestOptions extends js.Object {
  /**
    * The resolver to use when instantiating container-managed entities in the test.
    */
  var resolver: js.UndefOr[Resolver] = js.undefined
}

object SetupTestOptions {
  @scala.inline
  def apply(resolver: Resolver = null): SetupTestOptions = {
    val __obj = js.Dynamic.literal()
    if (resolver != null) __obj.updateDynamic("resolver")(resolver)
    __obj.asInstanceOf[SetupTestOptions]
  }
}

