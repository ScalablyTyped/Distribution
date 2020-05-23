package typings.forkTsCheckerWebpackPlugin.incrementalCheckerInterfaceMod

import typings.forkTsCheckerWebpackPlugin.anon.GetReport
import typings.forkTsCheckerWebpackPlugin.anon.Typeofts
import typings.forkTsCheckerWebpackPlugin.resolutionMod.ResolveModuleName
import typings.forkTsCheckerWebpackPlugin.resolutionMod.ResolveTypeReferenceDirective
import typings.forkTsCheckerWebpackPlugin.typesEslintMod.Options
import typings.forkTsCheckerWebpackPlugin.vueOptionsMod.VueOptions
import typings.std.ReturnType
import typings.typescript.mod.CompilerOptions
import typings.typescript.mod.ModuleResolutionHost
import typings.typescript.mod.ResolvedModuleWithFailedLookupLocations
import typings.typescript.mod.ResolvedTypeReferenceDirectiveWithFailedLookupLocations
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IncrementalCheckerParams extends js.Object {
  var checkSyntacticErrors: Boolean
  var compilerOptions: CompilerOptions
  var context: String
  var eslinter: js.UndefOr[ReturnType[js.Function1[/* eslintOptions */ Options, GetReport]]] = js.undefined
  var programConfigFile: String
  var resolveModuleName: js.UndefOr[ResolveModuleName] = js.undefined
  var resolveTypeReferenceDirective: js.UndefOr[ResolveTypeReferenceDirective] = js.undefined
  var typescript: Typeofts
  var vue: VueOptions
}

object IncrementalCheckerParams {
  @scala.inline
  def apply(
    checkSyntacticErrors: Boolean,
    compilerOptions: CompilerOptions,
    context: String,
    programConfigFile: String,
    typescript: Typeofts,
    vue: VueOptions,
    eslinter: ReturnType[js.Function1[/* eslintOptions */ Options, GetReport]] = null,
    resolveModuleName: (/* typescript */ Typeofts, /* moduleName */ String, /* containingFile */ String, /* compilerOptions */ CompilerOptions, /* moduleResolutionHost */ ModuleResolutionHost) => ResolvedModuleWithFailedLookupLocations = null,
    resolveTypeReferenceDirective: (/* typescript */ Typeofts, /* typeDirectiveName */ String, /* containingFile */ String, /* compilerOptions */ CompilerOptions, /* moduleResolutionHost */ ModuleResolutionHost) => ResolvedTypeReferenceDirectiveWithFailedLookupLocations = null
  ): IncrementalCheckerParams = {
    val __obj = js.Dynamic.literal(checkSyntacticErrors = checkSyntacticErrors.asInstanceOf[js.Any], compilerOptions = compilerOptions.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], programConfigFile = programConfigFile.asInstanceOf[js.Any], typescript = typescript.asInstanceOf[js.Any], vue = vue.asInstanceOf[js.Any])
    if (eslinter != null) __obj.updateDynamic("eslinter")(eslinter.asInstanceOf[js.Any])
    if (resolveModuleName != null) __obj.updateDynamic("resolveModuleName")(js.Any.fromFunction5(resolveModuleName))
    if (resolveTypeReferenceDirective != null) __obj.updateDynamic("resolveTypeReferenceDirective")(js.Any.fromFunction5(resolveTypeReferenceDirective))
    __obj.asInstanceOf[IncrementalCheckerParams]
  }
}

