package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.libIssueIssueMod.Issue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIssueIssuePredicateMod {
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/issue/issue-predicate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def composeIssuePredicates(predicates: js.Array[IssuePredicate]): IssuePredicate = ^.asInstanceOf[js.Dynamic].applyDynamic("composeIssuePredicates")(predicates.asInstanceOf[js.Any]).asInstanceOf[IssuePredicate]
  
  inline def createTrivialIssuePredicate(result: Boolean): IssuePredicate = ^.asInstanceOf[js.Dynamic].applyDynamic("createTrivialIssuePredicate")(result.asInstanceOf[js.Any]).asInstanceOf[IssuePredicate]
  
  type IssuePredicate = js.Function1[/* issue */ Issue, Boolean]
}
