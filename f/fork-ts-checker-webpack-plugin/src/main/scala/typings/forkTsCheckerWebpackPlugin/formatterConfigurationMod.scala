package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.formatterFormatterMod.Formatter
import typings.forkTsCheckerWebpackPlugin.formatterOptionsMod.FormatterOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatterConfigurationMod {
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/formatter/FormatterConfiguration", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def createFormatterConfiguration(): Formatter = ^.asInstanceOf[js.Dynamic].applyDynamic("createFormatterConfiguration")().asInstanceOf[Formatter]
  @scala.inline
  def createFormatterConfiguration(options: FormatterOptions): Formatter = ^.asInstanceOf[js.Dynamic].applyDynamic("createFormatterConfiguration")(options.asInstanceOf[js.Any]).asInstanceOf[Formatter]
  
  type FormatterConfiguration = Formatter
}
