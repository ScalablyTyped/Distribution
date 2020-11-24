package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.issueIssueMod.Issue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fork-ts-checker-webpack-plugin/lib/issue/IssuePredicate", JSImport.Namespace)
@js.native
object issuePredicateMod extends js.Object {
  
  def composeIssuePredicates(predicates: js.Array[IssuePredicate]): IssuePredicate = js.native
  
  def createTrivialIssuePredicate(result: Boolean): IssuePredicate = js.native
  
  type IssuePredicate = js.Function1[/* issue */ Issue, Boolean]
}
