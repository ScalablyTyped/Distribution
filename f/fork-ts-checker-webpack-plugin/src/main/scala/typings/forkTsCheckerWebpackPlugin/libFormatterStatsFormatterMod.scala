package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.libIssueIssueMod.Issue
import typings.webpack.mod.Stats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFormatterStatsFormatterMod {
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/formatter/stats-formatter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def statsFormatter(issues: js.Array[Issue], stats: Stats): String = (^.asInstanceOf[js.Dynamic].applyDynamic("statsFormatter")(issues.asInstanceOf[js.Any], stats.asInstanceOf[js.Any])).asInstanceOf[String]
}
