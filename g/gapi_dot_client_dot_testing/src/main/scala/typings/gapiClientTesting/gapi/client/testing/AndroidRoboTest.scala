package typings.gapiClientTesting.gapi.client.testing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AndroidRoboTest extends js.Object {
  /**
    * The APK for the application under test.
    * Required
    */
  var appApk: js.UndefOr[FileReference] = js.native
  /**
    * The initial activity that should be used to start the app.
    * Optional
    */
  var appInitialActivity: js.UndefOr[String] = js.native
  /**
    * The java package for the application under test.
    * Optional, default is determined by examining the application's manifest.
    */
  var appPackageId: js.UndefOr[String] = js.native
  /**
    * The max depth of the traversal stack Robo can explore. Needs to be at least
    * 2 to make Robo explore the app beyond the first activity.
    * Default is 50.
    * Optional
    */
  var maxDepth: js.UndefOr[Double] = js.native
  /**
    * The max number of steps Robo can execute.
    * Default is no limit.
    * Optional
    */
  var maxSteps: js.UndefOr[Double] = js.native
  /**
    * A set of directives Robo should apply during the crawl.
    * This allows users to customize the crawl. For example, the username and
    * password for a test account can be provided.
    * Optional
    */
  var roboDirectives: js.UndefOr[js.Array[RoboDirective]] = js.native
}

object AndroidRoboTest {
  @scala.inline
  def apply(): AndroidRoboTest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AndroidRoboTest]
  }
  @scala.inline
  implicit class AndroidRoboTestOps[Self <: AndroidRoboTest] (val x: Self) extends AnyVal {
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
    def setAppInitialActivity(value: String): Self = this.set("appInitialActivity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppInitialActivity: Self = this.set("appInitialActivity", js.undefined)
    @scala.inline
    def setAppPackageId(value: String): Self = this.set("appPackageId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppPackageId: Self = this.set("appPackageId", js.undefined)
    @scala.inline
    def setMaxDepth(value: Double): Self = this.set("maxDepth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxDepth: Self = this.set("maxDepth", js.undefined)
    @scala.inline
    def setMaxSteps(value: Double): Self = this.set("maxSteps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxSteps: Self = this.set("maxSteps", js.undefined)
    @scala.inline
    def setRoboDirectivesVarargs(value: RoboDirective*): Self = this.set("roboDirectives", js.Array(value :_*))
    @scala.inline
    def setRoboDirectives(value: js.Array[RoboDirective]): Self = this.set("roboDirectives", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoboDirectives: Self = this.set("roboDirectives", js.undefined)
  }
  
}

