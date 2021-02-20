package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.issueIssueMod.Issue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object issuePredicateMod {
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/issue/IssuePredicate", "composeIssuePredicates")
  @js.native
  def composeIssuePredicates(predicates: js.Array[IssuePredicate]): IssuePredicate = js.native
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/issue/IssuePredicate", "createTrivialIssuePredicate")
  @js.native
  def createTrivialIssuePredicate(result: Boolean): IssuePredicate = js.native
  
  type IssuePredicate = js.Function1[/* issue */ Issue, Boolean]
}
