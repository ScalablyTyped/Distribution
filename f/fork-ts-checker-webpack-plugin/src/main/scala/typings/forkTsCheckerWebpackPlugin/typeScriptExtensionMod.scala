package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.dependenciesMod.Dependencies
import typings.forkTsCheckerWebpackPlugin.issueIssueMod.Issue
import typings.typescript.mod.BuilderProgram
import typings.typescript.mod.CompilerHost
import typings.typescript.mod.ParseConfigFileHost
import typings.typescript.mod.ParsedCommandLine
import typings.typescript.mod.SolutionBuilderWithWatchHost
import typings.typescript.mod.WatchCompilerHost
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typeScriptExtensionMod {
  
  trait TypeScriptExtension
    extends StObject
       with TypeScriptHostExtension
       with TypeScriptReporterExtension
  object TypeScriptExtension {
    
    @scala.inline
    def apply(): TypeScriptExtension = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TypeScriptExtension]
    }
  }
  
  trait TypeScriptHostExtension extends StObject {
    
    var extendCompilerHost: js.UndefOr[
        js.Function2[
          /* host */ CompilerHost, 
          /* parsedCommandLine */ js.UndefOr[ParsedCommandLine], 
          CompilerHost
        ]
      ] = js.undefined
    
    var extendParseConfigFileHost: js.UndefOr[js.Function1[/* host */ ParseConfigFileHost, ParseConfigFileHost]] = js.undefined
    
    var extendWatchCompilerHost: js.UndefOr[
        js.Function2[
          /* host */ WatchCompilerHost[BuilderProgram], 
          /* parsedCommandLine */ js.UndefOr[ParsedCommandLine], 
          WatchCompilerHost[BuilderProgram]
        ]
      ] = js.undefined
    
    var extendWatchSolutionBuilderHost: js.UndefOr[
        js.Function2[
          /* host */ SolutionBuilderWithWatchHost[BuilderProgram], 
          /* parsedCommandLine */ js.UndefOr[ParsedCommandLine], 
          SolutionBuilderWithWatchHost[BuilderProgram]
        ]
      ] = js.undefined
  }
  object TypeScriptHostExtension {
    
    @scala.inline
    def apply(): TypeScriptHostExtension = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TypeScriptHostExtension]
    }
    
    @scala.inline
    implicit class TypeScriptHostExtensionMutableBuilder[Self <: TypeScriptHostExtension] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExtendCompilerHost(
        value: (/* host */ CompilerHost, /* parsedCommandLine */ js.UndefOr[ParsedCommandLine]) => CompilerHost
      ): Self = StObject.set(x, "extendCompilerHost", js.Any.fromFunction2(value))
      
      @scala.inline
      def setExtendCompilerHostUndefined: Self = StObject.set(x, "extendCompilerHost", js.undefined)
      
      @scala.inline
      def setExtendParseConfigFileHost(value: /* host */ ParseConfigFileHost => ParseConfigFileHost): Self = StObject.set(x, "extendParseConfigFileHost", js.Any.fromFunction1(value))
      
      @scala.inline
      def setExtendParseConfigFileHostUndefined: Self = StObject.set(x, "extendParseConfigFileHost", js.undefined)
      
      @scala.inline
      def setExtendWatchCompilerHost(
        value: (/* host */ WatchCompilerHost[BuilderProgram], /* parsedCommandLine */ js.UndefOr[ParsedCommandLine]) => WatchCompilerHost[BuilderProgram]
      ): Self = StObject.set(x, "extendWatchCompilerHost", js.Any.fromFunction2(value))
      
      @scala.inline
      def setExtendWatchCompilerHostUndefined: Self = StObject.set(x, "extendWatchCompilerHost", js.undefined)
      
      @scala.inline
      def setExtendWatchSolutionBuilderHost(
        value: (/* host */ SolutionBuilderWithWatchHost[BuilderProgram], /* parsedCommandLine */ js.UndefOr[ParsedCommandLine]) => SolutionBuilderWithWatchHost[BuilderProgram]
      ): Self = StObject.set(x, "extendWatchSolutionBuilderHost", js.Any.fromFunction2(value))
      
      @scala.inline
      def setExtendWatchSolutionBuilderHostUndefined: Self = StObject.set(x, "extendWatchSolutionBuilderHost", js.undefined)
    }
  }
  
  trait TypeScriptReporterExtension extends StObject {
    
    var extendDependencies: js.UndefOr[js.Function1[/* dependencies */ Dependencies, Dependencies]] = js.undefined
    
    var extendIssues: js.UndefOr[js.Function1[/* issues */ js.Array[Issue], js.Array[Issue]]] = js.undefined
  }
  object TypeScriptReporterExtension {
    
    @scala.inline
    def apply(): TypeScriptReporterExtension = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TypeScriptReporterExtension]
    }
    
    @scala.inline
    implicit class TypeScriptReporterExtensionMutableBuilder[Self <: TypeScriptReporterExtension] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExtendDependencies(value: /* dependencies */ Dependencies => Dependencies): Self = StObject.set(x, "extendDependencies", js.Any.fromFunction1(value))
      
      @scala.inline
      def setExtendDependenciesUndefined: Self = StObject.set(x, "extendDependencies", js.undefined)
      
      @scala.inline
      def setExtendIssues(value: /* issues */ js.Array[Issue] => js.Array[Issue]): Self = StObject.set(x, "extendIssues", js.Any.fromFunction1(value))
      
      @scala.inline
      def setExtendIssuesUndefined: Self = StObject.set(x, "extendIssues", js.undefined)
    }
  }
}
