package typings.expoXcpretty

import typings.expoXcpretty.anon.FilePath
import typings.expoXcpretty.anon.MaxWarningLineLength
import typings.expoXcpretty.buildParserMod.Failure
import typings.expoXcpretty.buildParserMod.Parser
import typings.expoXcpretty.expoXcprettyStrings.Aggregate
import typings.expoXcpretty.expoXcprettyStrings.Analyze
import typings.expoXcpretty.expoXcprettyStrings.Build
import typings.expoXcpretty.expoXcprettyStrings.Clean
import typings.expoXcpretty.expoXcprettyStrings.CodeSign
import typings.expoXcpretty.expoXcprettyStrings.CompileC
import typings.expoXcpretty.expoXcprettyStrings.CompileStoryboard
import typings.expoXcpretty.expoXcprettyStrings.CompileSwift
import typings.expoXcpretty.expoXcprettyStrings.CompileXIB
import typings.expoXcpretty.expoXcprettyStrings.CopyPlistFile
import typings.expoXcpretty.expoXcprettyStrings.CopyStringsFile
import typings.expoXcpretty.expoXcprettyStrings.CpHeader
import typings.expoXcpretty.expoXcprettyStrings.CpResource
import typings.expoXcpretty.expoXcprettyStrings.GenerateDSYMFile
import typings.expoXcpretty.expoXcprettyStrings.Ld
import typings.expoXcpretty.expoXcprettyStrings.Libtool
import typings.expoXcpretty.expoXcprettyStrings.ProcessInfoPlistFile
import typings.expoXcpretty.expoXcprettyStrings.ProcessPCH
import typings.expoXcpretty.expoXcprettyStrings.Touch
import typings.expoXcpretty.expoXcprettyStrings.capability
import typings.expoXcpretty.expoXcprettyStrings.comDotappleDotxcodeDottoolsDotswiftDotcompiler
import typings.expoXcpretty.expoXcprettyStrings.entitlement
import typings.expoXcpretty.expoXcprettyStrings.error
import typings.expoXcpretty.expoXcprettyStrings.normal
import typings.expoXcpretty.expoXcprettyStrings.warning
import typings.expoXcpretty.expoXcprettyStrings.x86_64
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildFormatterMod {
  
  @JSImport("@expo/xcpretty/build/Formatter", "Formatter")
  @js.native
  open class Formatter protected () extends StObject {
    def this(props: MaxWarningLineLength) = this()
    
    var _parser: js.UndefOr[Parser] = js.native
    
    /* private */ var dimConfiguration: Any = js.native
    
    var errors: js.Array[String] = js.native
    
    def finish(): Unit = js.native
    
    def formatCheckDependencies(text: String): String = js.native
    
    def formatCleanRemove(msg: String): String = js.native
    
    def formatCompileCommand(compilerCommand: String, filePath: String): String = js.native
    
    /**
      *
      * @param fileName 'SampleTest.m',
      * @param filePathAndLocation '/Users/foo/bar.m:12:59',
      * @param reason 'expected identifier',
      * @param line '                [[thread should] equal:thread.];',
      * @param cursor '                                           ^'
      */
    def formatCompileError(fileName: String, filePathAndLocation: String, reason: String, line: String, cursor: String): String = js.native
    
    def formatCompileSwiftSources(`type`: String, arch: String, pkg: String): String = js.native
    def formatCompileSwiftSources(`type`: String, arch: String, pkg: String, target: String): String = js.native
    def formatCompileSwiftSources(`type`: String, arch: String, pkg: String, target: String, project: String): String = js.native
    def formatCompileSwiftSources(`type`: String, arch: String, pkg: String, target: Unit, project: String): String = js.native
    def formatCompileSwiftSources(`type`: String, arch: x86_64, pkg: comDotappleDotxcodeDottoolsDotswiftDotcompiler): String = js.native
    def formatCompileSwiftSources(`type`: String, arch: x86_64, pkg: comDotappleDotxcodeDottoolsDotswiftDotcompiler, target: String): String = js.native
    def formatCompileSwiftSources(
      `type`: String,
      arch: x86_64,
      pkg: comDotappleDotxcodeDottoolsDotswiftDotcompiler,
      target: String,
      project: String
    ): String = js.native
    def formatCompileSwiftSources(
      `type`: String,
      arch: x86_64,
      pkg: comDotappleDotxcodeDottoolsDotswiftDotcompiler,
      target: Unit,
      project: String
    ): String = js.native
    def formatCompileSwiftSources(`type`: normal, arch: String, pkg: comDotappleDotxcodeDottoolsDotswiftDotcompiler): String = js.native
    def formatCompileSwiftSources(`type`: normal, arch: String, pkg: comDotappleDotxcodeDottoolsDotswiftDotcompiler, target: String): String = js.native
    def formatCompileSwiftSources(
      `type`: normal,
      arch: String,
      pkg: comDotappleDotxcodeDottoolsDotswiftDotcompiler,
      target: String,
      project: String
    ): String = js.native
    def formatCompileSwiftSources(
      `type`: normal,
      arch: String,
      pkg: comDotappleDotxcodeDottoolsDotswiftDotcompiler,
      target: Unit,
      project: String
    ): String = js.native
    def formatCompileSwiftSources(`type`: normal, arch: x86_64, pkg: String): String = js.native
    def formatCompileSwiftSources(`type`: normal, arch: x86_64, pkg: String, target: String): String = js.native
    def formatCompileSwiftSources(`type`: normal, arch: x86_64, pkg: String, target: String, project: String): String = js.native
    def formatCompileSwiftSources(`type`: normal, arch: x86_64, pkg: String, target: Unit, project: String): String = js.native
    def formatCompileSwiftSources(`type`: normal, arch: x86_64, pkg: comDotappleDotxcodeDottoolsDotswiftDotcompiler): String = js.native
    def formatCompileSwiftSources(`type`: normal, arch: x86_64, pkg: comDotappleDotxcodeDottoolsDotswiftDotcompiler, target: String): String = js.native
    def formatCompileSwiftSources(
      `type`: normal,
      arch: x86_64,
      pkg: comDotappleDotxcodeDottoolsDotswiftDotcompiler,
      target: String,
      project: String
    ): String = js.native
    def formatCompileSwiftSources(
      `type`: normal,
      arch: x86_64,
      pkg: comDotappleDotxcodeDottoolsDotswiftDotcompiler,
      target: Unit,
      project: String
    ): String = js.native
    @JSName("formatCompileSwiftSources")
    def formatCompileSwiftSources_comapplexcodetoolsswiftcompiler(`type`: String, arch: String, pkg: comDotappleDotxcodeDottoolsDotswiftDotcompiler): String = js.native
    @JSName("formatCompileSwiftSources")
    def formatCompileSwiftSources_comapplexcodetoolsswiftcompiler(`type`: String, arch: String, pkg: comDotappleDotxcodeDottoolsDotswiftDotcompiler, target: String): String = js.native
    @JSName("formatCompileSwiftSources")
    def formatCompileSwiftSources_comapplexcodetoolsswiftcompiler(
      `type`: String,
      arch: String,
      pkg: comDotappleDotxcodeDottoolsDotswiftDotcompiler,
      target: String,
      project: String
    ): String = js.native
    @JSName("formatCompileSwiftSources")
    def formatCompileSwiftSources_comapplexcodetoolsswiftcompiler(
      `type`: String,
      arch: String,
      pkg: comDotappleDotxcodeDottoolsDotswiftDotcompiler,
      target: Unit,
      project: String
    ): String = js.native
    @JSName("formatCompileSwiftSources")
    def formatCompileSwiftSources_normal(`type`: normal, arch: String, pkg: String): String = js.native
    @JSName("formatCompileSwiftSources")
    def formatCompileSwiftSources_normal(`type`: normal, arch: String, pkg: String, target: String): String = js.native
    @JSName("formatCompileSwiftSources")
    def formatCompileSwiftSources_normal(`type`: normal, arch: String, pkg: String, target: String, project: String): String = js.native
    @JSName("formatCompileSwiftSources")
    def formatCompileSwiftSources_normal(`type`: normal, arch: String, pkg: String, target: Unit, project: String): String = js.native
    @JSName("formatCompileSwiftSources")
    def formatCompileSwiftSources_x8664(`type`: String, arch: x86_64, pkg: String): String = js.native
    @JSName("formatCompileSwiftSources")
    def formatCompileSwiftSources_x8664(`type`: String, arch: x86_64, pkg: String, target: String): String = js.native
    @JSName("formatCompileSwiftSources")
    def formatCompileSwiftSources_x8664(`type`: String, arch: x86_64, pkg: String, target: String, project: String): String = js.native
    @JSName("formatCompileSwiftSources")
    def formatCompileSwiftSources_x8664(`type`: String, arch: x86_64, pkg: String, target: Unit, project: String): String = js.native
    
    def formatCompileWarning(fileName: String, filePathAndLocation: String, reason: String): String = js.native
    def formatCompileWarning(fileName: String, filePathAndLocation: String, reason: String, line: String): String = js.native
    def formatCompileWarning(fileName: String, filePathAndLocation: String, reason: String, line: String, cursor: String): String = js.native
    def formatCompileWarning(fileName: String, filePathAndLocation: String, reason: String, line: Unit, cursor: String): String = js.native
    
    def formatCopy(param0: CopyFileProps): String = js.native
    
    /**
      * In: `Skipping duplicate build file in Compile Sources build phase: /Users/evanbacon/Documents/GitHub/expo/ios/Exponent/Kernel/ReactAppManager/EXReactAppManager.mm (in target 'Exponent' from project 'Exponent')`
      * Out:
      * `⚠️ Skipping duplicate file: Exponent/Kernel/ReactAppManager/EXReactAppManager.mm:
      *    Remove: Exponent » Exponent » Build Phases » Compile Sources » EXReactAppManager.mm`
      *
      * @param filePath
      * @param buildPhase 'Compile Sources'
      * @param target Exponent-watch-app
      * @param project Exponent
      */
    def formatDuplicateFileCompilerWarning(filePath: String, buildPhase: String, target: String, project: String): String = js.native
    
    def formatDuplicateSymbols(message: String, filePaths: js.Array[String], isWarning: Boolean): String = js.native
    
    def formatEmitSwiftModule(`type`: String, arch: String): String = js.native
    def formatEmitSwiftModule(`type`: String, arch: String, target: String): String = js.native
    def formatEmitSwiftModule(`type`: String, arch: String, target: String, project: String): String = js.native
    def formatEmitSwiftModule(`type`: String, arch: String, target: Unit, project: String): String = js.native
    def formatEmitSwiftModule(`type`: normal, arch: x86_64): String = js.native
    def formatEmitSwiftModule(`type`: normal, arch: x86_64, target: String): String = js.native
    def formatEmitSwiftModule(`type`: normal, arch: x86_64, target: String, project: String): String = js.native
    def formatEmitSwiftModule(`type`: normal, arch: x86_64, target: Unit, project: String): String = js.native
    @JSName("formatEmitSwiftModule")
    def formatEmitSwiftModule_normal(`type`: normal, arch: String): String = js.native
    @JSName("formatEmitSwiftModule")
    def formatEmitSwiftModule_normal(`type`: normal, arch: String, target: String): String = js.native
    @JSName("formatEmitSwiftModule")
    def formatEmitSwiftModule_normal(`type`: normal, arch: String, target: String, project: String): String = js.native
    @JSName("formatEmitSwiftModule")
    def formatEmitSwiftModule_normal(`type`: normal, arch: String, target: Unit, project: String): String = js.native
    @JSName("formatEmitSwiftModule")
    def formatEmitSwiftModule_x8664(`type`: String, arch: x86_64): String = js.native
    @JSName("formatEmitSwiftModule")
    def formatEmitSwiftModule_x8664(`type`: String, arch: x86_64, target: String): String = js.native
    @JSName("formatEmitSwiftModule")
    def formatEmitSwiftModule_x8664(`type`: String, arch: x86_64, target: String, project: String): String = js.native
    @JSName("formatEmitSwiftModule")
    def formatEmitSwiftModule_x8664(`type`: String, arch: x86_64, target: Unit, project: String): String = js.native
    
    def formatError(message: String): String = js.native
    
    def formatFailingTest(suite: String, test: String, reason: String, filePath: String): String = js.native
    
    def formatFailure(f: Failure): String = js.native
    
    def formatFailures(failuresPerSuite: Record[String, js.Array[Failure]]): String = js.native
    
    def formatFileMissingError(reason: String, filePath: String): String = js.native
    
    def formatFileOperation(props: FileOperation): String = js.native
    
    def formatGenericError(message: String): String = js.native
    
    def formatGenericWarning(message: String): String = js.native
    
    def formatLdMethodOverride(methodName: String, collisions: js.Array[FilePath]): String = js.native
    
    def formatLdWarning(reason: String): String = js.native
    
    def formatMeasuringTest(suite: String, test: String, time: String): String = js.native
    
    /**
      * In: `warning: [CP] Vendored binary '/Users/evanbacon/Library/Developer/Xcode/DerivedData/yolo67-hcjsxsdqyxnsgdednlbpylgeffja/Build/Intermediates.noindex/Pods.build/Debug-iphonesimulator/hermes-engine.build/DerivedSources/hermes.framework.dSYM/Contents/Resources/DWARF/hermes' contains architectures (armv7 armv7s arm64) none of which match the current build architectures (x86_64).`
      * Out: `⚠️  Vendored binary '[app]/hermes-engine.build/DerivedSources/hermes.framework.dSYM/Contents/Resources/DWARF/hermes' does not support current build architecture (x86_64). Supported architectures: armv7, armv7s, arm64.`
      *
      * @param os iOS
      * @param deploymentTarget IPHONEOS_DEPLOYMENT_TARGET
      * @param version 8.0
      * @param minVersion 9.0
      * @param maxVersion 14.3.99
      * @param target boost-for-react-native
      * @param project Pods
      */
    def formatMissingArchitectureWarning(binaryPath: String, architectures: js.Array[String], currentArchitectures: js.Array[String]): String = js.native
    
    def formatMissingFileCompilerWarning(filePath: String): String = js.native
    
    def formatOther(text: String): String = js.native
    
    def formatPassingTest(suite: String, test: String, time: String): String = js.native
    
    def formatPendingTest(suite: String, test: String): String = js.native
    
    def formatPhaseScriptExecution(scriptName: String): String = js.native
    def formatPhaseScriptExecution(scriptName: String, target: String): String = js.native
    def formatPhaseScriptExecution(scriptName: String, target: String, project: String): String = js.native
    def formatPhaseScriptExecution(scriptName: String, target: Unit, project: String): String = js.native
    
    def formatPhaseSuccess(phaseName: String): String = js.native
    def formatPhaseSuccess(phaseName: String, duration: String): String = js.native
    
    def formatPreprocess(file: String): String = js.native
    
    def formatProcessPchCommand(filePath: String): String = js.native
    
    def formatRemark(msg: String): String = js.native
    
    /**
      * In: `The Copy Bundle Resources build phase contains this target's Info.plist file '/Users/evanbacon/Documents/GitHub/expo/ios/Exponent/Supporting/Info.plist'. (in target 'Exponent' from project 'Exponent')`
      * Out:
      * `⚠️ Target's Info.plist file is incorrectly linked: Exponent/Supporting/Info.plist:
      *    Remove: Exponent » Exponent » Build Phases » Copy Bundle Resources » Info.plist`
      *
      * @param filePath
      * @param reservedFileDescription 'entitlements'
      * @param target Exponent-watch-app
      * @param project Exponent
      */
    def formatReservedFileInCopyBundleResourcesCompilerWarning(filePath: String, reservedFileDescription: String, target: String, project: String): String = js.native
    
    def formatShellCommand(command: String, args: String): String = js.native
    
    def formatSingleLineCompileIssue(
      `type`: warning | error,
      filePathAndLocation: String,
      fileName: String,
      reason: String,
      target: String,
      project: String
    ): String = js.native
    
    def formatTarget(props: ConfigurationOperation): String = js.native
    
    def formatTestRunFinished(name: String, time: String): String = js.native
    
    def formatTestRunStarted(name: String): String = js.native
    
    def formatTestSuiteStarted(name: String): String = js.native
    
    def formatTestSummary(executedMessage: String, failuresPerSuite: Record[String, js.Array[Failure]]): String = js.native
    
    def formatTiffutil(file: String): String = js.native
    
    def formatUndefinedSymbols(message: String, symbol: String, reference: String): String = js.native
    
    /**
      * In: `error: Provisioning profile "iOS Team Provisioning Profile: *" doesn't support the Push Notifications capability. (in target 'yolo90' from project 'yolo90')`
      * Out: `❌  yolo90/yolo90: Provisioning Profile "iOS Team Provisioning Profile: *" does not support the Push Notifications capability.`
      *
      * In: `error: Provisioning profile "iOS Team Provisioning Profile: *" doesn't include the aps-environment entitlement. (in target 'yolo90' from project 'yolo90')`
      * Out: `❌  yolo90/yolo90: Entitlements file defines the value "aps-environment" which is not registered for profile "iOS Team Provisioning Profile: *".`
      *
      * @param profileName `"iOS Team Provisioning Profile: *"`
      * @param entitlementName `Push Notifications` | `aps-environment`
      * @param entitlementType `capability` | `entitlement`
      * @param target boost-for-react-native
      * @param project Pods
      */
    def formatUnsupportedEntitlementError(profileName: String, entitlementName: String, entitlementType: capability | entitlement): String = js.native
    def formatUnsupportedEntitlementError(
      profileName: String,
      entitlementName: String,
      entitlementType: capability | entitlement,
      target: String
    ): String = js.native
    def formatUnsupportedEntitlementError(
      profileName: String,
      entitlementName: String,
      entitlementType: capability | entitlement,
      target: String,
      project: String
    ): String = js.native
    def formatUnsupportedEntitlementError(
      profileName: String,
      entitlementName: String,
      entitlementType: capability | entitlement,
      target: Unit,
      project: String
    ): String = js.native
    
    /**
      * In: `The iOS Simulator deployment target 'IPHONEOS_DEPLOYMENT_TARGET' is set to 8.0, but the range of supported deployment target versions is 9.0 to 14.3.99. (in target 'boost-for-react-native' from project 'Pods')`
      * Out: `⚠️ Pods/boost-for-react-native: iOS@8.0 version mismatch. Expected >= 9.0 < 14.3.99`
      *
      * @param os iOS
      * @param deploymentTarget IPHONEOS_DEPLOYMENT_TARGET
      * @param version 8.0
      * @param minVersion 9.0
      * @param maxVersion 14.3.99
      * @param target boost-for-react-native
      * @param project Pods
      */
    def formatVersionMismatchWarning(
      os: String,
      deploymentTarget: String,
      version: String,
      minVersion: String,
      maxVersion: String,
      target: String,
      project: String
    ): String = js.native
    
    def formatWarning(message: String): String = js.native
    
    def formatWillNotBeCodeSigned(message: String): String = js.native
    
    def formatWriteAuxiliaryFiles(text: String): String = js.native
    
    def formatWriteFile(file: String): String = js.native
    
    def getBuildSummary(): String = js.native
    
    def getFileOperationTitle(
      `type`: Analyze | GenerateDSYMFile | Ld | Libtool | ProcessPCH | ProcessInfoPlistFile | CodeSign | Touch | CompileC | CompileSwift | CompileXIB | CompileStoryboard
    ): String = js.native
    
    def getTitleForConfigurationType(`type`: Analyze | Aggregate | Build | Clean): String = js.native
    
    def optionalNewline(): String = js.native
    
    def parser: Parser = js.native
    
    def pipe(data: String): js.Array[String] = js.native
    
    def prettyFormat(text: String): String | Unit = js.native
    
    var props: MaxWarningLineLength = js.native
    
    def shouldShowCompileWarning(filePath: String): Boolean = js.native
    def shouldShowCompileWarning(filePath: String, lineNumber: String): Boolean = js.native
    def shouldShowCompileWarning(filePath: String, lineNumber: String, columnNumber: String): Boolean = js.native
    def shouldShowCompileWarning(filePath: String, lineNumber: Unit, columnNumber: String): Boolean = js.native
    
    var warnings: js.Array[String] = js.native
  }
  /* static members */
  object Formatter {
    
    @JSImport("@expo/xcpretty/build/Formatter", "Formatter")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@expo/xcpretty/build/Formatter", "Formatter.format")
    @js.native
    def format: js.Function3[
        /* command */ String, 
        /* argumentText */ js.UndefOr[String], 
        /* success */ js.UndefOr[Boolean], 
        String
      ] = js.native
    inline def format(command: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("format")(command.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def format(command: String, argumentText: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(command.asInstanceOf[js.Any], argumentText.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def format(command: String, argumentText: String, success: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(command.asInstanceOf[js.Any], argumentText.asInstanceOf[js.Any], success.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def format(command: String, argumentText: Unit, success: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(command.asInstanceOf[js.Any], argumentText.asInstanceOf[js.Any], success.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @JSImport("@expo/xcpretty/build/Formatter", "Formatter.formatBreadCrumb")
    @js.native
    def formatBreadCrumb: js.Function3[
        /* fileName */ String, 
        /* target */ js.UndefOr[String], 
        /* project */ js.UndefOr[String], 
        String
      ] = js.native
    inline def formatBreadCrumb(fileName: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatBreadCrumb")(fileName.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def formatBreadCrumb(fileName: String, target: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatBreadCrumb")(fileName.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def formatBreadCrumb(fileName: String, target: String, project: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatBreadCrumb")(fileName.asInstanceOf[js.Any], target.asInstanceOf[js.Any], project.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def formatBreadCrumb(fileName: String, target: Unit, project: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatBreadCrumb")(fileName.asInstanceOf[js.Any], target.asInstanceOf[js.Any], project.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def formatBreadCrumb_=(
      x: js.Function3[
          /* fileName */ String, 
          /* target */ js.UndefOr[String], 
          /* project */ js.UndefOr[String], 
          String
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("formatBreadCrumb")(x.asInstanceOf[js.Any])
    
    inline def format_=(
      x: js.Function3[
          /* command */ String, 
          /* argumentText */ js.UndefOr[String], 
          /* success */ js.UndefOr[Boolean], 
          String
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("format")(x.asInstanceOf[js.Any])
    
    @JSImport("@expo/xcpretty/build/Formatter", "Formatter.getAppRoot")
    @js.native
    def getAppRoot: js.Function1[/* filePath */ String, String] = js.native
    inline def getAppRoot(filePath: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getAppRoot")(filePath.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def getAppRoot_=(x: js.Function1[/* filePath */ String, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getAppRoot")(x.asInstanceOf[js.Any])
    
    @JSImport("@expo/xcpretty/build/Formatter", "Formatter.highlightLastPathComponent")
    @js.native
    def highlightLastPathComponent: js.Function1[/* filePath */ String, String] = js.native
    inline def highlightLastPathComponent(filePath: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("highlightLastPathComponent")(filePath.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def highlightLastPathComponent_=(x: js.Function1[/* filePath */ String, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("highlightLastPathComponent")(x.asInstanceOf[js.Any])
    
    @JSImport("@expo/xcpretty/build/Formatter", "Formatter.relativePath")
    @js.native
    def relativePath: js.Function2[/* projectRoot */ String, /* filePath */ String, String] = js.native
    inline def relativePath(projectRoot: String, filePath: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("relativePath")(projectRoot.asInstanceOf[js.Any], filePath.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def relativePath_=(x: js.Function2[/* projectRoot */ String, /* filePath */ String, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("relativePath")(x.asInstanceOf[js.Any])
  }
  
  trait ConfigurationOperation extends StObject {
    
    var configuration: String
    
    var project: js.UndefOr[String] = js.undefined
    
    var target: js.UndefOr[String] = js.undefined
    
    var `type`: Analyze | Aggregate | Build | Clean
  }
  object ConfigurationOperation {
    
    inline def apply(configuration: String, `type`: Analyze | Aggregate | Build | Clean): ConfigurationOperation = {
      val __obj = js.Dynamic.literal(configuration = configuration.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConfigurationOperation]
    }
    
    extension [Self <: ConfigurationOperation](x: Self) {
      
      inline def setConfiguration(value: String): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
      
      inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
      
      inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
      
      inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setType(value: Analyze | Aggregate | Build | Clean): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait CopyFileProps extends StObject {
    
    var from: String
    
    var project: js.UndefOr[String] = js.undefined
    
    var target: js.UndefOr[String] = js.undefined
    
    var to: String
    
    var `type`: CpResource | CopyStringsFile | CopyPlistFile | CpHeader
  }
  object CopyFileProps {
    
    inline def apply(from: String, to: String, `type`: CpResource | CopyStringsFile | CopyPlistFile | CpHeader): CopyFileProps = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CopyFileProps]
    }
    
    extension [Self <: CopyFileProps](x: Self) {
      
      inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
      
      inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
      
      inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setType(value: CpResource | CopyStringsFile | CopyPlistFile | CpHeader): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait FileOperation extends StObject {
    
    var arch: js.UndefOr[String] = js.undefined
    
    var fileName: String
    
    var filePath: String
    
    var linkType: js.UndefOr[String] = js.undefined
    
    var project: js.UndefOr[String] = js.undefined
    
    var target: js.UndefOr[String] = js.undefined
    
    var `type`: Analyze | GenerateDSYMFile | Ld | Libtool | ProcessPCH | ProcessInfoPlistFile | CodeSign | Touch | CompileC | CompileSwift | CompileXIB | CompileStoryboard
  }
  object FileOperation {
    
    inline def apply(
      fileName: String,
      filePath: String,
      `type`: Analyze | GenerateDSYMFile | Ld | Libtool | ProcessPCH | ProcessInfoPlistFile | CodeSign | Touch | CompileC | CompileSwift | CompileXIB | CompileStoryboard
    ): FileOperation = {
      val __obj = js.Dynamic.literal(fileName = fileName.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileOperation]
    }
    
    extension [Self <: FileOperation](x: Self) {
      
      inline def setArch(value: String): Self = StObject.set(x, "arch", value.asInstanceOf[js.Any])
      
      inline def setArchUndefined: Self = StObject.set(x, "arch", js.undefined)
      
      inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
      
      inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
      
      inline def setLinkType(value: String): Self = StObject.set(x, "linkType", value.asInstanceOf[js.Any])
      
      inline def setLinkTypeUndefined: Self = StObject.set(x, "linkType", js.undefined)
      
      inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
      
      inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
      
      inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setType(
        value: Analyze | GenerateDSYMFile | Ld | Libtool | ProcessPCH | ProcessInfoPlistFile | CodeSign | Touch | CompileC | CompileSwift | CompileXIB | CompileStoryboard
      ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
