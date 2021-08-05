package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.issueIssueMod.Issue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object issuePredicateMod {
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/issue/IssuePredicate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def composeIssuePredicates(predicates: js.Array[IssuePredicate]): IssuePredicate = ^.asInstanceOf[js.Dynamic].applyDynamic("composeIssuePredicates")(predicates.asInstanceOf[js.Any]).asInstanceOf[IssuePredicate]
  
  inline def createTrivialIssuePredicate(result: Boolean): IssuePredicate = ^.asInstanceOf[js.Dynamic].applyDynamic("createTrivialIssuePredicate")(result.asInstanceOf[js.Any]).asInstanceOf[IssuePredicate]
  
  type IssuePredicate = js.Function1[/* issue */ Issue, Boolean]
}
