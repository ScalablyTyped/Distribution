package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.issueIssueMod.Issue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fork-ts-checker-webpack-plugin/lib/issue/IssuePredicate", JSImport.Namespace)
@js.native
object issuePredicateMod extends js.Object {
  def composeIssuePredicates(predicates: js.Array[IssuePredicate]): IssuePredicate = js.native
  def createTrivialIssuePredicate(result: Boolean): IssuePredicate = js.native
  type IssuePredicate = js.Function1[/* issue */ Issue, Boolean]
}

