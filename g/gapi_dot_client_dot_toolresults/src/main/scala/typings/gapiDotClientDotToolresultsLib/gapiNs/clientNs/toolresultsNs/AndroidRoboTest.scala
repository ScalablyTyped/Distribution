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

