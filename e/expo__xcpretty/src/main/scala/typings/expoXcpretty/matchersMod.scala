package typings.expoXcpretty

import typings.expoXcpretty.anon.CHECKDEPENDENCIESERRORSMATCHER
import typings.expoXcpretty.anon.COMPILEWARNINGINLINEMATCHER
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object matchersMod {
  
  object Matchers {
    
    @JSImport("@expo/xcpretty/build/Matchers", "Matchers")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @regex Captured groups
      * `$1` target
      * `$2` project
      * `$3` configuration
      */
    @JSImport("@expo/xcpretty/build/Matchers", "Matchers.AGGREGATE_TARGET_MATCHER")
    @js.native
    def AGGREGATE_TARGET_MATCHER: js.RegExp = js.native
    inline def AGGREGATE_TARGET_MATCHER_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AGGREGATE_TARGET_MATCHER")(x.asInstanceOf[js.Any])
    
    /**
      * @regex Captured groups
      * `$1` filePath
      * `$2` fileName
      */
    @JSImport("@expo/xcpretty/build/Matchers", "Matchers.ANALYZE_MATCHER")
    @js.native
    def ANALYZE_MATCHER: js.RegExp = js.native
    inline def ANALYZE_MATCHER_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ANALYZE_MATCHER")(x.asInstanceOf[js.Any])
    
    /**
      * @regex Captured groups
      * `$1` target
      * `$2` project
      * `$3` configuration
      */
    @JSImport("@expo/xcpretty/build/Matchers", "Matchers.ANALYZE_TARGET_MATCHER")
    @js.native
    def ANALYZE_TARGET_MATCHER: js.RegExp = js.native
    inline def ANALYZE_TARGET_MATCHER_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ANALYZE_TARGET_MATCHER")(x.asInstanceOf[js.Any])
    
    /**
      * `$1` type of copy
      * `$2` file path 1
      * `$3` file path 2
      * `$4` target
      * `$5` project
      */
    @JSImport("@expo/xcpretty/build/Matchers", "Matchers.ANY_COPY_MATCHER")
    @js.native
    def ANY_COPY_MATCHER: js.RegExp = js.native
    inline def ANY_COPY_MATCHER_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ANY_COPY_MATCHER")(x.asInstanceOf[js.Any])
    
    /**
      * @regex Captured groups
      * `$1` target
      * `$2` project
      * `$3` configuration
      */
    @JSImport("@expo/xcpretty/build/Matchers", "Matchers.BUILD_TARGET_MATCHER")
    @js.native
    def BUILD_TARGET_MATCHER: js.RegExp = js.native
    inline def BUILD_TARGET_MATCHER_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BUILD_TARGET_MATCHER")(x.asInstanceOf[js.Any])
    
    @JSImport("@expo/xcpretty/build/Matchers", "Matchers.CHECK_DEPENDENCIES_MATCHER")
    @js.native
    def CHECK_DEPENDENCIES_MATCHER: js.RegExp = js.native
    inline def CHECK_DEPENDENCIES_MATCHER_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHECK_DEPENDENCIES_MATCHER")(x.asInstanceOf[js.Any])
    
    /**
      * @regex Nothing returned here for now
      */
    @JSImport("@expo/xcpretty/build/Matchers", "Matchers.CLEAN_REMOVE_MATCHER")
    @js.native
    def CLEAN_REMOVE_MATCHER: js.RegExp = js.native
    inline def CLEAN_REMOVE_MATCHER_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLEAN_REMOVE_MATCHER")(x.asInstanceOf[js.Any])
    
    /**
      * @regex Captured groups
      * `$1` target
      * `$2` project
      * `$3` configuration
      */
    @JSImport("@expo/xcpretty/build/Matchers", "Matchers.CLEAN_TARGET_MATCHER")
    @js.native
    def CLEAN_TARGET_MATCHER: js.RegExp = js.native
    inline def CLEAN_TARGET_MATCHER_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLEAN_TARGET_MATCHER")(x.asInstanceOf[js.Any])
    
    /**
      * @regex Captured groups
      * `$1` = file
      */
    @JSImport("@expo/xcpretty/build/Matchers", "Matchers.CODESIGN_FRAMEWORK_MATCHER")
    @js.native
    def CODESIGN_FRAMEWORK_MATCHER: js.RegExp = js.native
    inline def CODESIGN_FRAMEWORK_MATCHER_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CODESIGN_FRAMEWORK_MATCHER")(x.asInstanceOf[js.Any])
    
    /**
      * @regex Captured groups
      * `$1` = file
      * `$2` fileName (e.g. Exponent.app)
      * `$3` target (e.g. ABI39_0_0EXAdsFacebook)
      * `$4` project (e.g. ABI39_0_0)
      */
    @JSImport("@expo/xcpretty/build/Matchers", "Matchers.CODESIGN_MATCHER")
    @js.native
    def CODESIGN_MATCHER: js.RegExp = js.native
    inline def CODESIGN_MATCHER_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CODESIGN_MATCHER")(x.asInstanceOf[js.Any])
    
    /**
      * @regex Captured groups
      * `$1` compiler_command
      * `$2` filePath
      */
    @JSImport("@expo/xcpretty/build/Matchers", "Matchers.COMPILE_COMMAND_MATCHER")
    @js.native
    def COMPILE_COMMAND_MATCHER: js.RegExp = js.native
    inline def COMPILE_COMMAND_MATCHER_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("COMPILE_COMMAND_MATCHER")(x.asInstanceOf[js.Any])
    
    /**
      * @regex Captured groups
      * `$1` type
      * `$2` filePath
      * `$3` fileName (e.g. KWNull.m)
      * `$4` target (e.g. ABI39_0_0EXAdsFacebook)
      * `$5` project (e.g. ABI39_0_0)
      *
      * The order of extensions is important in order to make alternation greedier.
      */
    @JSImport("@expo/xcpretty/build/Matchers", "Matchers.COMPILE_MATCHER")
    @js.native
    def COMPILE_MATCHER: js.RegExp = js.native
    inline def COMPILE_MATCHER_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("COMPILE_MATCHER")(x.asInstanceOf[js.Any])
    
    /**
      * @regex Captured groups
      * `$1` filePath
      * `$2` fileName (e.g. Main.storyboard)
      */
    @JSImport("@expo/xcpretty/build/Matchers", "Matchers.COMPILE_STORYBOARD_MATCHER")
    @js.native
    def COMPILE_STORYBOARD_MATCHER: js.RegExp = js.native
    inline def COMPILE_STORYBOARD_MATCHER_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("COMPILE_STORYBOARD_MATCHER")(x.asInstanceOf[js.Any])
    
    /**
      * `CompileSwiftSources normal x86_64 com.apple.xcode.tools.swift.compiler (in target 'expo-dev-menu-interface' from project 'Pods')`
      */
    @JSImport("@expo/xcpretty/build/Matchers", "Matchers.COMPILE_SWIFT_SOURCES_MATCHER")
    @js.native
    def COMPILE_SWIFT_SOURCES_MATCHER: js.RegExp = js.native
    inline def COMPILE_SWIFT_SOURCES_MATCHER_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("COMPILE_SWIFT_SOURCES_MATCHER")(x.asInstanceOf[js.Any])
    
    /**
      * @regex Captured groups
      * `$1` filePath
      * `$2` fileName (e.g. MainMenu.xib)
      */
    @JSImport("@expo/xcpretty/build/Matchers", "Matchers.COMPILE_XIB_MATCHER")
    @js.native
    def COMPILE_XIB_MATCHER: js.RegExp = js.native
    inline def COMPILE_XIB_MATCHER_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("COMPILE_XIB_MATCHER")(x.asInstanceOf[js.Any])
    
    /**
      * `EmitSwiftModule normal x86_64 (in target 'expo-dev-menu-interface' from project 'Pods')`
      */
    @JSImport("@expo/xcpretty/build/Matchers", "Matchers.EMIT_SWIFT_MODULE_MATCHER")
    @js.native
    def EMIT_SWIFT_MODULE_MATCHER: js.RegExp = js.native
    inline def EMIT_SWIFT_MODULE_MATCHER_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EMIT_SWIFT_MODULE_MATCHER")(x.asInstanceOf[js.Any])
    
    @JSImport("@expo/xcpretty/build/Matchers", "Matchers.EXECUTED_MATCHER")
    @js.native
    def EXECUTED_MATCHER: js.RegExp = js.native
    inline def EXECUTED_MATCHER_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EXECUTED_MATCHER")(x.asInstanceOf[js.Any])
    
    @JSImport("@expo/xcpretty/build/Matchers", "Matchers.Errors")
    @js.native
    def Errors: CHECKDEPENDENCIESERRORSMATCHER = js.native
    inline def Errors_=(x: CHECKDEPENDENCIESERRORSMATCHER): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Errors")(x.asInstanceOf[js.Any])
    
    /**
      * @regex Captured groups
      * `$1` = file
      * `$2` = test_suite
      * `$3` = test_case
      * `$4` = reason
      */
    @JSImport("@expo/xcpretty/build/Matchers", "Matchers.FAILING_TEST_MATCHER")
    @js.native
    def FAILING_TEST_MATCHER: js.RegExp = js.native
    inline def FAILING_TEST_MATCHER_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FAILING_TEST_MATCHER")(x.asInstanceOf[js.Any])
    
    /**
      * @regex Captured groups
      * `$1` = dsym
      */
    @JSImport("@expo/xcpretty/build/Matchers", "Matchers.GENERATE_DSYM_MATCHER")
    @js.native
    def GENERATE_DSYM_MATCHER: js.RegExp = js.native
    inline def GENERATE_DSYM_MATCHER_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GENERATE_DSYM_MATCHER")(x.asInstanceOf[js.Any])
    
    /**
      * @regex Captured groups
      * `$1` = library
      */
    @JSImport("@expo/xcpretty/build/Matchers", "Matchers.LIBTOOL_MATCHER")
    @js.native
    def LIBTOOL_MATCHER: js.RegExp = js.native
    inline def LIBTOOL_MATCHER_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LIBTOOL_MATCHER")(x.asInstanceOf[js.Any])
    
    /**
      * @regex Captured groups
      * `$1` = targetName
      * `$2` = build_variants (normal, profile, debug)
      * `$3` = architecture
      */
    @JSImport("@expo/xcpretty/build/Matchers", "Matchers.LINKING_MATCHER")
    @js.native
    def LINKING_MATCHER: js.RegExp = js.native
    inline def LINKING_MATCHER_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LINKING_MATCHER")(x.asInstanceOf[js.Any])
    
    /**
      * @regex Captured groups
      * `$1` = file
      */
    @JSImport("@expo/xcpretty/build/Matchers", "Matchers.PBXCP_MATCHER")
    @js.native
    def PBXCP_MATCHER: js.RegExp = js.native
    inline def PBXCP_MATCHER_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PBXCP_MATCHER")(x.asInstanceOf[js.Any])
    
    /**
      * @regex Captured groups
      * `$1` = script_name
      */
    @JSImport("@expo/xcpretty/build/Matchers", "Matchers.PHASE_SCRIPT_EXECUTION_MATCHER")
    @js.native
    def PHASE_SCRIPT_EXECUTION_MATCHER: js.RegExp = js.native
    inline def PHASE_SCRIPT_EXECUTION_MATCHER_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PHASE_SCRIPT_EXECUTION_MATCHER")(x.asInstanceOf[js.Any])
    
    @JSImport("@expo/xcpretty/build/Matchers", "Matchers.PHASE_SUCCESS_MATCHER")
    @js.native
    def PHASE_SUCCESS_MATCHER: js.RegExp = js.native
    inline def PHASE_SUCCESS_MATCHER_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PHASE_SUCCESS_MATCHER")(x.asInstanceOf[js.Any])
    
    /**
      * @regex Captured groups
      * `$1` = file
      */
    @JSImport("@expo/xcpretty/build/Matchers", "Matchers.PREPROCESS_MATCHER")
    @js.native
    def PREPROCESS_MATCHER: js.RegExp = js.native
    inline def PREPROCESS_MATCHER_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PREPROCESS_MATCHER")(x.asInstanceOf[js.Any])
    
    /**
      * @regex Captured groups
      * `$1` = file
      */
    @JSImport("@expo/xcpretty/build/Matchers", "Matchers.PROCESS_INFO_PLIST_MATCHER")
    @js.native
    def PROCESS_INFO_PLIST_MATCHER: js.RegExp = js.native
    inline def PROCESS_INFO_PLIST_MATCHER_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PROCESS_INFO_PLIST_MATCHER")(x.asInstanceOf[js.Any])
    
    /**
      * @regex Captured groups
      * `$1` filePath
      */
    @JSImport("@expo/xcpretty/build/Matchers", "Matchers.PROCESS_PCH_COMMAND_MATCHER")
    @js.native
    def PROCESS_PCH_COMMAND_MATCHER: js.RegExp = js.native
    inline def PROCESS_PCH_COMMAND_MATCHER_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PROCESS_PCH_COMMAND_MATCHER")(x.asInstanceOf[js.Any])
    
    /**
      * @regex Captured groups
      * `$1` = file
      * `$1` = target
      * `$1` = project
      */
    @JSImport("@expo/xcpretty/build/Matchers", "Matchers.PROCESS_PCH_MATCHER")
    @js.native
    def PROCESS_PCH_MATCHER: js.RegExp = js.native
    inline def PROCESS_PCH_MATCHER_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PROCESS_PCH_MATCHER")(x.asInstanceOf[js.Any])
    
    /**
      * @regex Captured groups
      * `$1` = whole message.
      *
      * `remark: Incremental compilation has been disabled: it is not compatible with whole module optimization`
      */
    @JSImport("@expo/xcpretty/build/Matchers", "Matchers.REMARK_MATCHER")
    @js.native
    def REMARK_MATCHER: js.RegExp = js.native
    inline def REMARK_MATCHER_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("REMARK_MATCHER")(x.asInstanceOf[js.Any])
    
    /**
      * @regex Captured groups
      */
    @JSImport("@expo/xcpretty/build/Matchers", "Matchers.RESTARTING_TESTS_MATCHER")
    @js.native
    def RESTARTING_TESTS_MATCHER: js.RegExp = js.native
    inline def RESTARTING_TESTS_MATCHER_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RESTARTING_TESTS_MATCHER")(x.asInstanceOf[js.Any])
    
    /**
      * @regex Captured groups
      * `$1` command path
      * `$2` arguments
      */
    @JSImport("@expo/xcpretty/build/Matchers", "Matchers.SHELL_COMMAND_MATCHER")
    @js.native
    def SHELL_COMMAND_MATCHER: js.RegExp = js.native
    inline def SHELL_COMMAND_MATCHER_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SHELL_COMMAND_MATCHER")(x.asInstanceOf[js.Any])
    
    /**
      * @regex Captured groups
      * `$1` = suite
      * `$2` = time
      */
    @JSImport("@expo/xcpretty/build/Matchers", "Matchers.TESTS_RUN_COMPLETION_MATCHER")
    @js.native
    def TESTS_RUN_COMPLETION_MATCHER: js.RegExp = js.native
    inline def TESTS_RUN_COMPLETION_MATCHER_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TESTS_RUN_COMPLETION_MATCHER")(x.asInstanceOf[js.Any])
    
    /**
      * @regex Captured groups
      * `$1` = suite
      * `$2` = test_case
      * `$3` = time
      */
    @JSImport("@expo/xcpretty/build/Matchers", "Matchers.TEST_CASE_MEASURED_MATCHER")
    @js.native
    def TEST_CASE_MEASURED_MATCHER: js.RegExp = js.native
    inline def TEST_CASE_MEASURED_MATCHER_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TEST_CASE_MEASURED_MATCHER")(x.asInstanceOf[js.Any])
    
    /**
      * @regex Captured groups
      * `$1` = suite
      * `$2` = test_case
      * `$3` = time
      */
    @JSImport("@expo/xcpretty/build/Matchers", "Matchers.TEST_CASE_PASSED_MATCHER")
    @js.native
    def TEST_CASE_PASSED_MATCHER: js.RegExp = js.native
    inline def TEST_CASE_PASSED_MATCHER_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TEST_CASE_PASSED_MATCHER")(x.asInstanceOf[js.Any])
    
    /**
      * @regex Captured groups
      * `$1` = suite
      * `$2` = test_case
      */
    @JSImport("@expo/xcpretty/build/Matchers", "Matchers.TEST_CASE_PENDING_MATCHER")
    @js.native
    def TEST_CASE_PENDING_MATCHER: js.RegExp = js.native
    inline def TEST_CASE_PENDING_MATCHER_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TEST_CASE_PENDING_MATCHER")(x.asInstanceOf[js.Any])
    
    /**
      * @regex Captured groups
      * `$1` = suite
      * `$2` = test_case
      */
    @JSImport("@expo/xcpretty/build/Matchers", "Matchers.TEST_CASE_STARTED_MATCHER")
    @js.native
    def TEST_CASE_STARTED_MATCHER: js.RegExp = js.native
    inline def TEST_CASE_STARTED_MATCHER_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TEST_CASE_STARTED_MATCHER")(x.asInstanceOf[js.Any])
    
    /**
      * @regex Captured groups
      * `$1` = suite
      * `$2` = time
      */
    @JSImport("@expo/xcpretty/build/Matchers", "Matchers.TEST_SUITE_STARTED_MATCHER")
    @js.native
    def TEST_SUITE_STARTED_MATCHER: js.RegExp = js.native
    inline def TEST_SUITE_STARTED_MATCHER_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TEST_SUITE_STARTED_MATCHER")(x.asInstanceOf[js.Any])
    
    /**
      * @regex Captured groups
      * `$1` test suite name
      */
    @JSImport("@expo/xcpretty/build/Matchers", "Matchers.TEST_SUITE_START_MATCHER")
    @js.native
    def TEST_SUITE_START_MATCHER: js.RegExp = js.native
    inline def TEST_SUITE_START_MATCHER_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TEST_SUITE_START_MATCHER")(x.asInstanceOf[js.Any])
    
    /**
      * @regex Captured groups
      * `$1` fileName
      */
    @JSImport("@expo/xcpretty/build/Matchers", "Matchers.TIFFUTIL_MATCHER")
    @js.native
    def TIFFUTIL_MATCHER: js.RegExp = js.native
    inline def TIFFUTIL_MATCHER_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TIFFUTIL_MATCHER")(x.asInstanceOf[js.Any])
    
    /**
      * @regex Captured groups
      * `$1` filePath
      * `$2` fileName
      */
    @JSImport("@expo/xcpretty/build/Matchers", "Matchers.TOUCH_MATCHER")
    @js.native
    def TOUCH_MATCHER: js.RegExp = js.native
    inline def TOUCH_MATCHER_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TOUCH_MATCHER")(x.asInstanceOf[js.Any])
    
    /**
      * @regex Captured groups
      * `$1` = file
      * `$2` = reason
      */
    @JSImport("@expo/xcpretty/build/Matchers", "Matchers.UI_FAILING_TEST_MATCHER")
    @js.native
    def UI_FAILING_TEST_MATCHER: js.RegExp = js.native
    inline def UI_FAILING_TEST_MATCHER_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UI_FAILING_TEST_MATCHER")(x.asInstanceOf[js.Any])
    
    @JSImport("@expo/xcpretty/build/Matchers", "Matchers.WRITE_AUXILIARY_FILES")
    @js.native
    def WRITE_AUXILIARY_FILES: js.RegExp = js.native
    inline def WRITE_AUXILIARY_FILES_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WRITE_AUXILIARY_FILES")(x.asInstanceOf[js.Any])
    
    /**
      * @regex Captured groups
      * `$1` filePath
      */
    @JSImport("@expo/xcpretty/build/Matchers", "Matchers.WRITE_FILE_MATCHER")
    @js.native
    def WRITE_FILE_MATCHER: js.RegExp = js.native
    inline def WRITE_FILE_MATCHER_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WRITE_FILE_MATCHER")(x.asInstanceOf[js.Any])
    
    @JSImport("@expo/xcpretty/build/Matchers", "Matchers.Warnings")
    @js.native
    def Warnings: COMPILEWARNINGINLINEMATCHER = js.native
    inline def Warnings_=(x: COMPILEWARNINGINLINEMATCHER): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Warnings")(x.asInstanceOf[js.Any])
  }
}
