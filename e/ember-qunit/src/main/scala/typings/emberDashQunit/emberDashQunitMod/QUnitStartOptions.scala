package typings.emberDashQunit.emberDashQunitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QUnitStartOptions extends js.Object {
  /**
    * If `false` tests will not be loaded automatically.
    */
  var loadTests: js.UndefOr[Boolean] = js.undefined
  /**
    * If `false` validation of `Ember.onerror` will be disabled.
    */
  var setupEmberOnerrorValidation: js.UndefOr[Boolean] = js.undefined
  /**
    * `false` opts out of the default behavior of setting `Ember.testing`
    * to `true` before all tests and back to `false` after each test will.
    */
  var setupEmberTesting: js.UndefOr[Boolean] = js.undefined
  /**
    * If `false` the default Ember.Test adapter will not be updated.
    */
  var setupTestAdapter: js.UndefOr[Boolean] = js.undefined
  /**
    * If `false` the test container will not be setup based on `devmode`,
    * `dockcontainer`, or `nocontainer` URL params.
    */
  var setupTestContainer: js.UndefOr[Boolean] = js.undefined
  /**
    * If `false` test isolation validation will be disabled.
    */
  var setupTestIsolationValidation: js.UndefOr[Boolean] = js.undefined
  /**
    * If `false` tests will not be automatically started (you must run
    * `QUnit.start()` to kick them off).
    */
  var startTests: js.UndefOr[Boolean] = js.undefined
}

object QUnitStartOptions {
  @scala.inline
  def apply(
    loadTests: js.UndefOr[Boolean] = js.undefined,
    setupEmberOnerrorValidation: js.UndefOr[Boolean] = js.undefined,
    setupEmberTesting: js.UndefOr[Boolean] = js.undefined,
    setupTestAdapter: js.UndefOr[Boolean] = js.undefined,
    setupTestContainer: js.UndefOr[Boolean] = js.undefined,
    setupTestIsolationValidation: js.UndefOr[Boolean] = js.undefined,
    startTests: js.UndefOr[Boolean] = js.undefined
  ): QUnitStartOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(loadTests)) __obj.updateDynamic("loadTests")(loadTests)
    if (!js.isUndefined(setupEmberOnerrorValidation)) __obj.updateDynamic("setupEmberOnerrorValidation")(setupEmberOnerrorValidation)
    if (!js.isUndefined(setupEmberTesting)) __obj.updateDynamic("setupEmberTesting")(setupEmberTesting)
    if (!js.isUndefined(setupTestAdapter)) __obj.updateDynamic("setupTestAdapter")(setupTestAdapter)
    if (!js.isUndefined(setupTestContainer)) __obj.updateDynamic("setupTestContainer")(setupTestContainer)
    if (!js.isUndefined(setupTestIsolationValidation)) __obj.updateDynamic("setupTestIsolationValidation")(setupTestIsolationValidation)
    if (!js.isUndefined(startTests)) __obj.updateDynamic("startTests")(startTests)
    __obj.asInstanceOf[QUnitStartOptions]
  }
}

