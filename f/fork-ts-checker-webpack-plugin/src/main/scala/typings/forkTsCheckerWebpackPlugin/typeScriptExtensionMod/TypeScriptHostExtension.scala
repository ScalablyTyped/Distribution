package typings.forkTsCheckerWebpackPlugin.typeScriptExtensionMod

import typings.typescript.mod.BuilderProgram
import typings.typescript.mod.CompilerHost
import typings.typescript.mod.ParseConfigFileHost
import typings.typescript.mod.ParsedCommandLine
import typings.typescript.mod.SolutionBuilderWithWatchHost
import typings.typescript.mod.WatchCompilerHost
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeScriptHostExtension extends js.Object {
  var extendCompilerHost: js.UndefOr[
    js.Function2[
      /* host */ CompilerHost, 
      /* parsedCommandLine */ js.UndefOr[ParsedCommandLine], 
      CompilerHost
    ]
  ] = js.native
  var extendParseConfigFileHost: js.UndefOr[js.Function1[/* host */ ParseConfigFileHost, ParseConfigFileHost]] = js.native
  var extendWatchCompilerHost: js.UndefOr[
    js.Function2[
      /* host */ WatchCompilerHost[BuilderProgram], 
      /* parsedCommandLine */ js.UndefOr[ParsedCommandLine], 
      WatchCompilerHost[BuilderProgram]
    ]
  ] = js.native
  var extendWatchSolutionBuilderHost: js.UndefOr[
    js.Function2[
      /* host */ SolutionBuilderWithWatchHost[BuilderProgram], 
      /* parsedCommandLine */ js.UndefOr[ParsedCommandLine], 
      SolutionBuilderWithWatchHost[BuilderProgram]
    ]
  ] = js.native
}

object TypeScriptHostExtension {
  @scala.inline
  def apply(): TypeScriptHostExtension = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TypeScriptHostExtension]
  }
  @scala.inline
  implicit class TypeScriptHostExtensionOps[Self <: TypeScriptHostExtension] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setExtendCompilerHost(
      value: (/* host */ CompilerHost, /* parsedCommandLine */ js.UndefOr[ParsedCommandLine]) => CompilerHost
    ): Self = this.set("extendCompilerHost", js.Any.fromFunction2(value))
    @scala.inline
    def deleteExtendCompilerHost: Self = this.set("extendCompilerHost", js.undefined)
    @scala.inline
    def setExtendParseConfigFileHost(value: /* host */ ParseConfigFileHost => ParseConfigFileHost): Self = this.set("extendParseConfigFileHost", js.Any.fromFunction1(value))
    @scala.inline
    def deleteExtendParseConfigFileHost: Self = this.set("extendParseConfigFileHost", js.undefined)
    @scala.inline
    def setExtendWatchCompilerHost(
      value: (/* host */ WatchCompilerHost[BuilderProgram], /* parsedCommandLine */ js.UndefOr[ParsedCommandLine]) => WatchCompilerHost[BuilderProgram]
    ): Self = this.set("extendWatchCompilerHost", js.Any.fromFunction2(value))
    @scala.inline
    def deleteExtendWatchCompilerHost: Self = this.set("extendWatchCompilerHost", js.undefined)
    @scala.inline
    def setExtendWatchSolutionBuilderHost(
      value: (/* host */ SolutionBuilderWithWatchHost[BuilderProgram], /* parsedCommandLine */ js.UndefOr[ParsedCommandLine]) => SolutionBuilderWithWatchHost[BuilderProgram]
    ): Self = this.set("extendWatchSolutionBuilderHost", js.Any.fromFunction2(value))
    @scala.inline
    def deleteExtendWatchSolutionBuilderHost: Self = this.set("extendWatchSolutionBuilderHost", js.undefined)
  }
  
}

