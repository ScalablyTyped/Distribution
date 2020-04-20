package typings.forkTsCheckerWebpackPlugin.incrementalCheckerInterfaceMod

import typings.forkTsCheckerWebpackPlugin.cancellationTokenMod.CancellationToken
import typings.forkTsCheckerWebpackPlugin.issueIssueMod.Issue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IncrementalCheckerInterface extends js.Object {
  def getEsLintIssues(cancellationToken: CancellationToken): js.Promise[js.Array[Issue]]
  def getTypeScriptIssues(cancellationToken: CancellationToken): js.Promise[js.Array[Issue]]
  def hasEsLinter(): Boolean
  def nextIteration(): Unit
}

object IncrementalCheckerInterface {
  @scala.inline
  def apply(
    getEsLintIssues: CancellationToken => js.Promise[js.Array[Issue]],
    getTypeScriptIssues: CancellationToken => js.Promise[js.Array[Issue]],
    hasEsLinter: () => Boolean,
    nextIteration: () => Unit
  ): IncrementalCheckerInterface = {
    val __obj = js.Dynamic.literal(getEsLintIssues = js.Any.fromFunction1(getEsLintIssues), getTypeScriptIssues = js.Any.fromFunction1(getTypeScriptIssues), hasEsLinter = js.Any.fromFunction0(hasEsLinter), nextIteration = js.Any.fromFunction0(nextIteration))
    __obj.asInstanceOf[IncrementalCheckerInterface]
  }
}

