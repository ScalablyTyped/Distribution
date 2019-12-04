package typings.forkDashTsDashCheckerDashWebpackDashPlugin

import typings.forkDashTsDashCheckerDashWebpackDashPlugin.libResolutionMod.ResolveModuleName
import typings.forkDashTsDashCheckerDashWebpackDashPlugin.libResolutionMod.ResolveTypeReferenceDirective
import typings.typescript.typescriptMod.CompilerOptions
import typings.typescript.typescriptMod.ModuleResolutionHost
import typings.typescript.typescriptMod.ResolvedModuleWithFailedLookupLocations
import typings.typescript.typescriptMod.ResolvedTypeReferenceDirectiveWithFailedLookupLocations
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fork-ts-checker-webpack-plugin/lib/resolution", JSImport.Namespace)
@js.native
object libResolutionMod extends js.Object {
  def makeResolutionFunctions(): Anon_ResolveModuleName = js.native
  def makeResolutionFunctions(
    resolveModuleName: js.UndefOr[scala.Nothing],
    resolveTypeReferenceDirective: ResolveTypeReferenceDirective
  ): Anon_ResolveModuleName = js.native
  def makeResolutionFunctions(resolveModuleName: ResolveModuleName): Anon_ResolveModuleName = js.native
  def makeResolutionFunctions(resolveModuleName: ResolveModuleName, resolveTypeReferenceDirective: ResolveTypeReferenceDirective): Anon_ResolveModuleName = js.native
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

