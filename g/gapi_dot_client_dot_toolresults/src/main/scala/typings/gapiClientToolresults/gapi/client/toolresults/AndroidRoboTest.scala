package typings.gapiClientToolresults.gapi.client.toolresults

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AndroidRoboTest extends js.Object {
  /** The initial activity that should be used to start the app. Optional */
  var appInitialActivity: js.UndefOr[String] = js.undefined
  /** The java package for the bootstrap. Optional */
  var bootstrapPackageId: js.UndefOr[String] = js.undefined
  /** The runner class for the bootstrap. Optional */
  var bootstrapRunnerClass: js.UndefOr[String] = js.undefined
  /** The max depth of the traversal stack Robo can explore. Optional */
  var maxDepth: js.UndefOr[Double] = js.undefined
  /** The max number of steps/actions Robo can execute. Default is no limit (0). Optional */
  var maxSteps: js.UndefOr[Double] = js.undefined
}

object AndroidRoboTest {
  @scala.inline
  def apply(
    appInitialActivity: String = null,
    bootstrapPackageId: String = null,
    bootstrapRunnerClass: String = null,
    maxDepth: Int | Double = null,
    maxSteps: Int | Double = null
  ): AndroidRoboTest = {
    val __obj = js.Dynamic.literal()
    if (appInitialActivity != null) __obj.updateDynamic("appInitialActivity")(appInitialActivity.asInstanceOf[js.Any])
    if (bootstrapPackageId != null) __obj.updateDynamic("bootstrapPackageId")(bootstrapPackageId.asInstanceOf[js.Any])
    if (bootstrapRunnerClass != null) __obj.updateDynamic("bootstrapRunnerClass")(bootstrapRunnerClass.asInstanceOf[js.Any])
    if (maxDepth != null) __obj.updateDynamic("maxDepth")(maxDepth.asInstanceOf[js.Any])
    if (maxSteps != null) __obj.updateDynamic("maxSteps")(maxSteps.asInstanceOf[js.Any])
    __obj.asInstanceOf[AndroidRoboTest]
  }
}

