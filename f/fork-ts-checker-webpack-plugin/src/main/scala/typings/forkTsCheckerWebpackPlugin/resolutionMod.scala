package typings.forkTsCheckerWebpackPlugin

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
  def makeResolutionFunctions(): AnonResolveModuleName = js.native
  def makeResolutionFunctions(
    resolveModuleName: js.UndefOr[scala.Nothing],
    resolveTypeReferenceDirective: ResolveTypeReferenceDirective
  ): AnonResolveModuleName = js.native
  def makeResolutionFunctions(resolveModuleName: ResolveModuleName): AnonResolveModuleName = js.native
  def makeResolutionFunctions(resolveModuleName: ResolveModuleName, resolveTypeReferenceDirective: ResolveTypeReferenceDirective): AnonResolveModuleName = js.native
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

