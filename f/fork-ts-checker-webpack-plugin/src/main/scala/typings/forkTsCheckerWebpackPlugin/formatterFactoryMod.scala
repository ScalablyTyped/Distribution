package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.codeFrameDTsMod.BabelCodeFrameOptions
import typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.basic
import typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.codeframe
import typings.forkTsCheckerWebpackPlugin.formatterFormatterMod.Formatter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatterFactoryMod {
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/formatter/FormatterFactory", "createFormatter")
  @js.native
  def createFormatter[T /* <: NotConfigurableFormatterType */](): Formatter = js.native
  @JSImport("fork-ts-checker-webpack-plugin/lib/formatter/FormatterFactory", "createFormatter")
  @js.native
  def createFormatter[T /* <: NotConfigurableFormatterType */](`type`: T): Formatter = js.native
  @JSImport("fork-ts-checker-webpack-plugin/lib/formatter/FormatterFactory", "createFormatter")
  @js.native
  def createFormatter[T /* <: ConfigurableFormatterType */](
    `type`: T,
    options: /* import warning: importer.ImportType#apply Failed type conversion: fork-ts-checker-webpack-plugin.fork-ts-checker-webpack-plugin/lib/formatter/FormatterFactory.ConfigurableFormatterOptions[T] */ js.Any
  ): Formatter = js.native
  @JSImport("fork-ts-checker-webpack-plugin/lib/formatter/FormatterFactory", "createFormatter")
  @js.native
  def createFormatter[T /* <: FormatterType */](`type`: T, options: js.Object): Formatter = js.native
  @JSImport("fork-ts-checker-webpack-plugin/lib/formatter/FormatterFactory", "createFormatter")
  @js.native
  def createFormatter_T_ConfigurableFormatterType[T /* <: ConfigurableFormatterType */](`type`: T): Formatter = js.native
  @JSImport("fork-ts-checker-webpack-plugin/lib/formatter/FormatterFactory", "createFormatter")
  @js.native
  def createFormatter_T_FormatterType[T /* <: FormatterType */](`type`: T): Formatter = js.native
  
  type ComplexFormatterOptions[T /* <: FormatterType */] = /* import warning: importer.ImportType#apply Failed type conversion: fork-ts-checker-webpack-plugin.fork-ts-checker-webpack-plugin/lib/formatter/FormatterFactory.ConfigurableFormatterOptions[T] */ js.Any
  
  @js.native
  trait ConfigurableFormatterOptions extends StObject {
    
    var codeframe: BabelCodeFrameOptions = js.native
  }
  object ConfigurableFormatterOptions {
    
    @scala.inline
    def apply(codeframe: BabelCodeFrameOptions): ConfigurableFormatterOptions = {
      val __obj = js.Dynamic.literal(codeframe = codeframe.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConfigurableFormatterOptions]
    }
    
    @scala.inline
    implicit class ConfigurableFormatterOptionsMutableBuilder[Self <: ConfigurableFormatterOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCodeframe(value: BabelCodeFrameOptions): Self = StObject.set(x, "codeframe", value.asInstanceOf[js.Any])
    }
  }
  
  type ConfigurableFormatterType = codeframe
  
  type FormatterType = NotConfigurableFormatterType | ConfigurableFormatterType
  
  type NotConfigurableFormatterType = js.UndefOr[basic]
}
