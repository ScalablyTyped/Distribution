package typings.fastDashGlob.outManagersTasksMod

import typings.fastDashGlob.outSettingsMod.default
import typings.fastDashGlob.outTypesMod.Pattern
import typings.fastDashGlob.outTypesMod.PatternsGroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-glob/out/managers/tasks", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def convertPatternGroupToTask(base: String, positive: js.Array[Pattern], negative: js.Array[Pattern], dynamic: Boolean): Task = js.native
  def convertPatternGroupsToTasks(positive: PatternsGroup, negative: js.Array[Pattern], dynamic: Boolean): js.Array[Task] = js.native
  def convertPatternsToTasks(positive: js.Array[Pattern], negative: js.Array[Pattern], dynamic: Boolean): js.Array[Task] = js.native
  def generate(patterns: js.Array[Pattern], settings: default): js.Array[Task] = js.native
  def getNegativePatternsAsPositive(patterns: js.Array[Pattern], ignore: js.Array[Pattern]): js.Array[Pattern] = js.native
  def getPositivePatterns(patterns: js.Array[Pattern]): js.Array[Pattern] = js.native
  def groupPatternsByBaseDirectory(patterns: js.Array[Pattern]): PatternsGroup = js.native
}

