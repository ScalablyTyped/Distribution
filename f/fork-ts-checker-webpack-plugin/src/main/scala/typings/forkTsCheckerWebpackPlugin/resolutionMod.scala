package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.anon.Typeofts
import typings.typescript.mod.CompilerOptions
import typings.typescript.mod.ModuleResolutionHost
import typings.typescript.mod.ResolvedModuleWithFailedLookupLocations
import typings.typescript.mod.ResolvedTypeReferenceDirectiveWithFailedLookupLocations
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fork-ts-checker-webpack-plugin/lib/resolution", JSImport.Namespace)
@js.native
object resolutionMod extends js.Object {
  def makeResolutionFunctions(): typings.forkTsCheckerWebpackPlugin.anon.ResolveModuleName = js.native
  def makeResolutionFunctions(resolveModuleName: ResolveModuleName): typings.forkTsCheckerWebpackPlugin.anon.ResolveModuleName = js.native
  def makeResolutionFunctions(resolveModuleName: ResolveModuleName, resolveTypeReferenceDirective: ResolveTypeReferenceDirective): typings.forkTsCheckerWebpackPlugin.anon.ResolveModuleName = js.native
  type ResolveModuleName = js.Function5[
    /* typescript */ Typeofts, 
    /* moduleName */ String, 
    /* containingFile */ String, 
    /* compilerOptions */ CompilerOptions, 
    /* moduleResolutionHost */ ModuleResolutionHost, 
    ResolvedModuleWithFailedLookupLocations
  ]
  type ResolveTypeReferenceDirective = js.Function5[
    /* typescript */ Typeofts, 
    /* typeDirectiveName */ String, 
    /* containingFile */ String, 
    /* compilerOptions */ CompilerOptions, 
    /* moduleResolutionHost */ ModuleResolutionHost, 
    ResolvedTypeReferenceDirectiveWithFailedLookupLocations
  ]
}

