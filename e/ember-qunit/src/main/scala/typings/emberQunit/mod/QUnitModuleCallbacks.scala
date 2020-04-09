package typings.emberQunit.mod

import typings.emberTestHelpers.mod.ModuleCallbacks
import typings.qunit.Assert
import typings.qunit.Hooks
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QUnitModuleCallbacks
  extends ModuleCallbacks
     with Hooks {
  @JSName("afterTeardown")
  var afterTeardown_QUnitModuleCallbacks: js.UndefOr[js.Function1[/* assert */ Assert, Unit]] = js.undefined
  @JSName("beforeSetup")
  var beforeSetup_QUnitModuleCallbacks: js.UndefOr[js.Function1[/* assert */ Assert, Unit]] = js.undefined
  @JSName("setup")
  var setup_QUnitModuleCallbacks: js.UndefOr[js.Function1[/* assert */ Assert, Unit]] = js.undefined
  @JSName("teardown")
  var teardown_QUnitModuleCallbacks: js.UndefOr[js.Function1[/* assert */ Assert, Unit]] = js.undefined
}

object QUnitModuleCallbacks {
  @scala.inline
  def apply(
    after: /* assert */ Assert => Unit | js.Promise[Unit] = null,
    afterEach: /* assert */ Assert => Unit | js.Promise[Unit] = null,
    afterTeardown: /* assert */ Assert => Unit = null,
    before: /* assert */ Assert => Unit | js.Promise[Unit] = null,
    beforeEach: /* assert */ Assert => Unit | js.Promise[Unit] = null,
    beforeSetup: /* assert */ Assert => Unit = null,
    integration: js.UndefOr[Boolean] = js.undefined,
    needs: js.Array[String] = null,
    setup: /* assert */ Assert => Unit = null,
    teardown: /* assert */ Assert => Unit = null,
    unit: js.UndefOr[Boolean] = js.undefined
  ): QUnitModuleCallbacks = {
    val __obj = js.Dynamic.literal()
    if (after != null) __obj.updateDynamic("after")(js.Any.fromFunction1(after))
    if (afterEach != null) __obj.updateDynamic("afterEach")(js.Any.fromFunction1(afterEach))
    if (afterTeardown != null) __obj.updateDynamic("afterTeardown")(js.Any.fromFunction1(afterTeardown))
    if (before != null) __obj.updateDynamic("before")(js.Any.fromFunction1(before))
    if (beforeEach != null) __obj.updateDynamic("beforeEach")(js.Any.fromFunction1(beforeEach))
    if (beforeSetup != null) __obj.updateDynamic("beforeSetup")(js.Any.fromFunction1(beforeSetup))
    if (!js.isUndefined(integration)) __obj.updateDynamic("integration")(integration.asInstanceOf[js.Any])
    if (needs != null) __obj.updateDynamic("needs")(needs.asInstanceOf[js.Any])
    if (setup != null) __obj.updateDynamic("setup")(js.Any.fromFunction1(setup))
    if (teardown != null) __obj.updateDynamic("teardown")(js.Any.fromFunction1(teardown))
    if (!js.isUndefined(unit)) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[QUnitModuleCallbacks]
  }
}

