package typings.gapiClientTesting.gapi.client.testing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AndroidTestLoop extends js.Object {
  /**
    * The APK for the application under test.
    * Required
    */
  var appApk: js.UndefOr[FileReference] = js.native
  /**
    * The java package for the application under test.
    * Optional, default is determined by examining the application's manifest.
    */
  var appPackageId: js.UndefOr[String] = js.native
  /**
    * The list of scenario labels that should be run during the test.
    * The scenario labels should map to labels defined in the application's
    * manifest. For example, player_experience and
    * com.google.test.loops.player_experience add all of the loops labeled in the
    * manifest with the com.google.test.loops.player_experience name to the
    * execution.
    * Optional. Scenarios can also be specified in the scenarios field.
    */
  var scenarioLabels: js.UndefOr[js.Array[String]] = js.native
  /**
    * The list of scenarios that should be run during the test.
    * Optional, default is all test loops, derived from the application's
    * manifest.
    */
  var scenarios: js.UndefOr[js.Array[Double]] = js.native
}

object AndroidTestLoop {
  @scala.inline
  def apply(): AndroidTestLoop = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AndroidTestLoop]
  }
  @scala.inline
  implicit class AndroidTestLoopOps[Self <: AndroidTestLoop] (val x: Self) extends AnyVal {
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
    def setAppApk(value: FileReference): Self = this.set("appApk", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppApk: Self = this.set("appApk", js.undefined)
    @scala.inline
    def setAppPackageId(value: String): Self = this.set("appPackageId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppPackageId: Self = this.set("appPackageId", js.undefined)
    @scala.inline
    def setScenarioLabelsVarargs(value: String*): Self = this.set("scenarioLabels", js.Array(value :_*))
    @scala.inline
    def setScenarioLabels(value: js.Array[String]): Self = this.set("scenarioLabels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScenarioLabels: Self = this.set("scenarioLabels", js.undefined)
    @scala.inline
    def setScenariosVarargs(value: Double*): Self = this.set("scenarios", js.Array(value :_*))
    @scala.inline
    def setScenarios(value: js.Array[Double]): Self = this.set("scenarios", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScenarios: Self = this.set("scenarios", js.undefined)
  }
  
}

