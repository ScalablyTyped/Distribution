package typings.googleapis.buildSrcApisToolresultsV1beta3Mod.toolresults_v1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A test of an android application that explores the application on a virtual
  * or physical Android device, finding culprits and crashes as it goes.
  */
@js.native
trait Schema$AndroidRoboTest extends js.Object {
  /**
    * The initial activity that should be used to start the app. Optional
    */
  var appInitialActivity: js.UndefOr[String] = js.native
  /**
    * The java package for the bootstrap. Optional
    */
  var bootstrapPackageId: js.UndefOr[String] = js.native
  /**
    * The runner class for the bootstrap. Optional
    */
  var bootstrapRunnerClass: js.UndefOr[String] = js.native
  /**
    * The max depth of the traversal stack Robo can explore. Optional
    */
  var maxDepth: js.UndefOr[Double] = js.native
  /**
    * The max number of steps/actions Robo can execute. Default is no limit
    * (0). Optional
    */
  var maxSteps: js.UndefOr[Double] = js.native
}

object Schema$AndroidRoboTest {
  @scala.inline
  def apply(
    appInitialActivity: String = null,
    bootstrapPackageId: String = null,
    bootstrapRunnerClass: String = null,
    maxDepth: Int | Double = null,
    maxSteps: Int | Double = null
  ): Schema$AndroidRoboTest = {
    val __obj = js.Dynamic.literal()
    if (appInitialActivity != null) __obj.updateDynamic("appInitialActivity")(appInitialActivity.asInstanceOf[js.Any])
    if (bootstrapPackageId != null) __obj.updateDynamic("bootstrapPackageId")(bootstrapPackageId.asInstanceOf[js.Any])
    if (bootstrapRunnerClass != null) __obj.updateDynamic("bootstrapRunnerClass")(bootstrapRunnerClass.asInstanceOf[js.Any])
    if (maxDepth != null) __obj.updateDynamic("maxDepth")(maxDepth.asInstanceOf[js.Any])
    if (maxSteps != null) __obj.updateDynamic("maxSteps")(maxSteps.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AndroidRoboTest]
  }
}

