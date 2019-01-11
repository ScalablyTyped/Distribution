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
    positive: js.Array[fastDashGlobLib.outTypesPatternsMod.Pattern],
    negative: js.Array[fastDashGlobLib.outTypesPatternsMod.Pattern],
    dynamic: scala.Boolean
  ): fastDashGlobLib.outManagersTasksMod.ITask = js.native
  def convertPatternGroupsToTasks(
    positive: fastDashGlobLib.outTypesPatternsMod.PatternsGroup,
    negative: js.Array[fastDashGlobLib.outTypesPatternsMod.Pattern],
    dynamic: scala.Boolean
  ): js.Array[fastDashGlobLib.outManagersTasksMod.ITask] = js.native
  def convertPatternsToTasks(
    positive: js.Array[fastDashGlobLib.outTypesPatternsMod.Pattern],
    negative: js.Array[fastDashGlobLib.outTypesPatternsMod.Pattern],
    dynamic: scala.Boolean
  ): js.Array[fastDashGlobLib.outManagersTasksMod.ITask] = js.native
  def generate(
    patterns: js.Array[fastDashGlobLib.outTypesPatternsMod.Pattern],
    options: fastDashGlobLib.outManagersOptionsMod.IOptions[fastDashGlobLib.outTypesEntriesMod.EntryItem]
  ): js.Array[fastDashGlobLib.outManagersTasksMod.ITask] = js.native
  def getNegativePatternsAsPositive(
    patterns: js.Array[fastDashGlobLib.outTypesPatternsMod.Pattern],
    ignore: js.Array[fastDashGlobLib.outTypesPatternsMod.Pattern]
  ): js.Array[fastDashGlobLib.outTypesPatternsMod.Pattern] = js.native
  def getPositivePatterns(patterns: js.Array[fastDashGlobLib.outTypesPatternsMod.Pattern]): js.Array[fastDashGlobLib.outTypesPatternsMod.Pattern] = js.native
  def groupPatternsByBaseDirectory(patterns: js.Array[fastDashGlobLib.outTypesPatternsMod.Pattern]): fastDashGlobLib.outTypesPatternsMod.PatternsGroup = js.native
}

