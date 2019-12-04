package typings.forkDashTsDashCheckerDashWebpackDashPlugin.libIncrementalCheckerInterfaceMod

import typings.forkDashTsDashCheckerDashWebpackDashPlugin.Anon_Filepath
import typings.forkDashTsDashCheckerDashWebpackDashPlugin.Typeofts
import typings.forkDashTsDashCheckerDashWebpackDashPlugin.libNormalizedMessageMod.NormalizedMessage
import typings.forkDashTsDashCheckerDashWebpackDashPlugin.libResolutionMod.ResolveModuleName
import typings.forkDashTsDashCheckerDashWebpackDashPlugin.libResolutionMod.ResolveTypeReferenceDirective
import typings.std.ReturnType
import typings.tslint.tslintMod.RuleFailure
import typings.typescript.typescriptMod.CompilerOptions
import typings.typescript.typescriptMod.Diagnostic
import typings.typescript.typescriptMod.ModuleResolutionHost
import typings.typescript.typescriptMod.ResolvedModuleWithFailedLookupLocations
import typings.typescript.typescriptMod.ResolvedTypeReferenceDirectiveWithFailedLookupLocations
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApiIncrementalCheckerParams extends js.Object {
  var checkSyntacticErrors: Boolean
  var compilerOptions: CompilerOptions
  var context: String
  var eslinter: js.UndefOr[ReturnType[js.Function1[/* eslintOptions */ js.Object, Anon_Filepath]]] = js.undefined
  var linterAutoFix: Boolean
  var linterConfigFile: String | Boolean
  var programConfigFile: String
  var resolveModuleName: js.UndefOr[ResolveModuleName] = js.undefined
  var resolveTypeReferenceDirective: js.UndefOr[ResolveTypeReferenceDirective] = js.undefined
  var typescript: Typeofts
  def createNormalizedMessageFromDiagnostic(diagnostic: Diagnostic): NormalizedMessage
  def createNormalizedMessageFromRuleFailure(ruleFailure: RuleFailure): NormalizedMessage
}

object ApiIncrementalCheckerParams {
  @scala.inline
  def apply(
    checkSyntacticErrors: Boolean,
    compilerOptions: CompilerOptions,
    context: String,
    createNormalizedMessageFromDiagnostic: Diagnostic => NormalizedMessage,
    createNormalizedMessageFromRuleFailure: RuleFailure => NormalizedMessage,
    linterAutoFix: Boolean,
    linterConfigFile: String | Boolean,
    programConfigFile: String,
    typescript: Typeofts,
    eslinter: ReturnType[js.Function1[/* eslintOptions */ js.Object, Anon_Filepath]] = null,
    resolveModuleName: (/* typescript */ Typeofts, /* moduleName */ String, /* containingFile */ String, /* compilerOptions */ CompilerOptions, /* moduleResolutionHost */ ModuleResolutionHost) => ResolvedModuleWithFailedLookupLocations = null,
    resolveTypeReferenceDirective: (/* typescript */ Typeofts, /* typeDirectiveName */ String, /* containingFile */ String, /* compilerOptions */ CompilerOptions, /* moduleResolutionHost */ ModuleResolutionHost) => ResolvedTypeReferenceDirectiveWithFailedLookupLocations = null
  ): ApiIncrementalCheckerParams = {
    val __obj = js.Dynamic.literal(checkSyntacticErrors = checkSyntacticErrors.asInstanceOf[js.Any], compilerOptions = compilerOptions.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], createNormalizedMessageFromDiagnostic = js.Any.fromFunction1(createNormalizedMessageFromDiagnostic), createNormalizedMessageFromRuleFailure = js.Any.fromFunction1(createNormalizedMessageFromRuleFailure), linterAutoFix = linterAutoFix.asInstanceOf[js.Any], linterConfigFile = linterConfigFile.asInstanceOf[js.Any], programConfigFile = programConfigFile.asInstanceOf[js.Any], typescript = typescript.asInstanceOf[js.Any])
    if (eslinter != null) __obj.updateDynamic("eslinter")(eslinter.asInstanceOf[js.Any])
    if (resolveModuleName != null) __obj.updateDynamic("resolveModuleName")(js.Any.fromFunction5(resolveModuleName))
    if (resolveTypeReferenceDirective != null) __obj.updateDynamic("resolveTypeReferenceDirective")(js.Any.fromFunction5(resolveTypeReferenceDirective))
    __obj.asInstanceOf[ApiIncrementalCheckerParams]
  }
}

