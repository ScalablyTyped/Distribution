package typings
package fastDashGlobLib.outManagersTasksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-glob/out/managers/tasks", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def convertPatternGroupToTask(
    base: java.lang.String,
    positive: js.Array[fastDashGlobLib.outTypesMod.Pattern],
    negative: js.Array[fastDashGlobLib.outTypesMod.Pattern],
    dynamic: scala.Boolean
  ): Task = js.native
  def convertPatternGroupsToTasks(
    positive: fastDashGlobLib.outTypesMod.PatternsGroup,
    negative: js.Array[fastDashGlobLib.outTypesMod.Pattern],
    dynamic: scala.Boolean
  ): js.Array[Task] = js.native
  def convertPatternsToTasks(
    positive: js.Array[fastDashGlobLib.outTypesMod.Pattern],
    negative: js.Array[fastDashGlobLib.outTypesMod.Pattern],
    dynamic: scala.Boolean
  ): js.Array[Task] = js.native
  def generate(
    patterns: js.Array[fastDashGlobLib.outTypesMod.Pattern],
    settings: fastDashGlobLib.outSettingsMod.default
  ): js.Array[Task] = js.native
  def getNegativePatternsAsPositive(
    patterns: js.Array[fastDashGlobLib.outTypesMod.Pattern],
    ignore: js.Array[fastDashGlobLib.outTypesMod.Pattern]
  ): js.Array[fastDashGlobLib.outTypesMod.Pattern] = js.native
  def getPositivePatterns(patterns: js.Array[fastDashGlobLib.outTypesMod.Pattern]): js.Array[fastDashGlobLib.outTypesMod.Pattern] = js.native
  def groupPatternsByBaseDirectory(patterns: js.Array[fastDashGlobLib.outTypesMod.Pattern]): fastDashGlobLib.outTypesMod.PatternsGroup = js.native
}

