package typings.emberQunit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QUnitStartOptions extends js.Object {
  
  /**
    * If `false` tests will not be loaded automatically.
    */
  var loadTests: js.UndefOr[Boolean] = js.native
  
  /**
    * If `false` validation of `Ember.onerror` will be disabled.
    */
  var setupEmberOnerrorValidation: js.UndefOr[Boolean] = js.native
  
  /**
    * `false` opts out of the default behavior of setting `Ember.testing`
    * to `true` before all tests and back to `false` after each test will.
    */
  var setupEmberTesting: js.UndefOr[Boolean] = js.native
  
  /**
    * If `false` the default Ember.Test adapter will not be updated.
    */
  var setupTestAdapter: js.UndefOr[Boolean] = js.native
  
  /**
    * If `false` the test container will not be setup based on `devmode`,
    * `dockcontainer`, or `nocontainer` URL params.
    */
  var setupTestContainer: js.UndefOr[Boolean] = js.native
  
  /**
    * If `false` test isolation validation will be disabled.
    */
  var setupTestIsolationValidation: js.UndefOr[Boolean] = js.native
  
  /**
    * If `false` tests will not be automatically started (you must run
    * `QUnit.start()` to kick them off).
    */
  var startTests: js.UndefOr[Boolean] = js.native
}
object QUnitStartOptions {
  
  @scala.inline
  def apply(): QUnitStartOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QUnitStartOptions]
  }
  
  @scala.inline
  implicit class QUnitStartOptionsOps[Self <: QUnitStartOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLoadTests(value: Boolean): Self = this.set("loadTests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadTests: Self = this.set("loadTests", js.undefined)
    
    @scala.inline
    def setSetupEmberOnerrorValidation(value: Boolean): Self = this.set("setupEmberOnerrorValidation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSetupEmberOnerrorValidation: Self = this.set("setupEmberOnerrorValidation", js.undefined)
    
    @scala.inline
    def setSetupEmberTesting(value: Boolean): Self = this.set("setupEmberTesting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSetupEmberTesting: Self = this.set("setupEmberTesting", js.undefined)
    
    @scala.inline
    def setSetupTestAdapter(value: Boolean): Self = this.set("setupTestAdapter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSetupTestAdapter: Self = this.set("setupTestAdapter", js.undefined)
    
    @scala.inline
    def setSetupTestContainer(value: Boolean): Self = this.set("setupTestContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSetupTestContainer: Self = this.set("setupTestContainer", js.undefined)
    
    @scala.inline
    def setSetupTestIsolationValidation(value: Boolean): Self = this.set("setupTestIsolationValidation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSetupTestIsolationValidation: Self = this.set("setupTestIsolationValidation", js.undefined)
    
    @scala.inline
    def setStartTests(value: Boolean): Self = this.set("startTests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTests: Self = this.set("startTests", js.undefined)
  }
}
