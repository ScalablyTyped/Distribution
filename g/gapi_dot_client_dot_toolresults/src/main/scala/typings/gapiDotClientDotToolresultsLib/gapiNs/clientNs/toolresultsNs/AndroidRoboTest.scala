package typings
package gapiDotClientDotToolresultsLib.gapiNs.clientNs.toolresultsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AndroidRoboTest extends js.Object {
  /** The initial activity that should be used to start the app. Optional */
  var appInitialActivity: js.UndefOr[java.lang.String] = js.undefined
  /** The java package for the bootstrap. Optional */
  var bootstrapPackageId: js.UndefOr[java.lang.String] = js.undefined
  /** The runner class for the bootstrap. Optional */
  var bootstrapRunnerClass: js.UndefOr[java.lang.String] = js.undefined
  /** The max depth of the traversal stack Robo can explore. Optional */
  var maxDepth: js.UndefOr[scala.Double] = js.undefined
  /** The max number of steps/actions Robo can execute. Default is no limit (0). Optional */
  var maxSteps: js.UndefOr[scala.Double] = js.undefined
}

object AndroidRoboTest {
  @scala.inline
  def apply(
    appInitialActivity: java.lang.String = null,
    bootstrapPackageId: java.lang.String = null,
    bootstrapRunnerClass: java.lang.String = null,
    maxDepth: scala.Int | scala.Double = null,
    maxSteps: scala.Int | scala.Double = null
  ): AndroidRoboTest = {
    val __obj = js.Dynamic.literal()
    if (appInitialActivity != null) __obj.updateDynamic("appInitialActivity")(appInitialActivity)
    if (bootstrapPackageId != null) __obj.updateDynamic("bootstrapPackageId")(bootstrapPackageId)
    if (bootstrapRunnerClass != null) __obj.updateDynamic("bootstrapRunnerClass")(bootstrapRunnerClass)
    if (maxDepth != null) __obj.updateDynamic("maxDepth")(maxDepth.asInstanceOf[js.Any])
    if (maxSteps != null) __obj.updateDynamic("maxSteps")(maxSteps.asInstanceOf[js.Any])
    __obj.asInstanceOf[AndroidRoboTest]
  }
}

