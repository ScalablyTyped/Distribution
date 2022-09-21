package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.formatterFormatterMod.Formatter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webpackFormatterMod {
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/formatter/webpack-formatter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createWebpackFormatter(formatter: Formatter): Formatter = ^.asInstanceOf[js.Dynamic].applyDynamic("createWebpackFormatter")(formatter.asInstanceOf[js.Any]).asInstanceOf[Formatter]
}
