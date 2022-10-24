package typings.expoXcpretty

import typings.expoXcpretty.anon.MaxWarningLineLength
import typings.expoXcpretty.anon.OnData
import typings.expoXcpretty.anon.Podfile
import typings.expoXcpretty.anon.Reject
import typings.expoXcpretty.anon.XcodeProject
import typings.expoXcpretty.anon.XcodeProjectName
import typings.expoXcpretty.anon.xcodeProjectnamestringund
import typings.expoXcpretty.buildExpoRunFormatterMod.ExpoRunFormatterProps
import typings.std.RegExpMatchArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@expo/xcpretty", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@expo/xcpretty", "ExpoRunFormatter")
  @js.native
  open class ExpoRunFormatter protected ()
    extends typings.expoXcpretty.buildExpoRunFormatterMod.ExpoRunFormatter {
    def this(props: ExpoRunFormatterProps) = this()
  }
  /* static members */
  object ExpoRunFormatter {
    
    @JSImport("@expo/xcpretty", "ExpoRunFormatter")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(projectRoot: String): typings.expoXcpretty.buildExpoRunFormatterMod.ExpoRunFormatter = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[typings.expoXcpretty.buildExpoRunFormatterMod.ExpoRunFormatter]
    inline def create(projectRoot: String, param1: xcodeProjectnamestringund): typings.expoXcpretty.buildExpoRunFormatterMod.ExpoRunFormatter = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(projectRoot.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[typings.expoXcpretty.buildExpoRunFormatterMod.ExpoRunFormatter]
  }
  
  @JSImport("@expo/xcpretty", "Formatter")
  @js.native
  open class Formatter protected ()
    extends typings.expoXcpretty.buildFormatterMod.Formatter {
    def this(props: MaxWarningLineLength) = this()
  }
  /* static members */
  object Formatter {
    
    @JSImport("@expo/xcpretty", "Formatter")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@expo/xcpretty", "Formatter.format")
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
    
    @JSImport("@expo/xcpretty", "Formatter.formatBreadCrumb")
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
    
    @JSImport("@expo/xcpretty", "Formatter.getAppRoot")
    @js.native
    def getAppRoot: js.Function1[/* filePath */ String, String] = js.native
    inline def getAppRoot(filePath: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getAppRoot")(filePath.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def getAppRoot_=(x: js.Function1[/* filePath */ String, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getAppRoot")(x.asInstanceOf[js.Any])
    
    @JSImport("@expo/xcpretty", "Formatter.highlightLastPathComponent")
    @js.native
    def highlightLastPathComponent: js.Function1[/* filePath */ String, String] = js.native
    inline def highlightLastPathComponent(filePath: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("highlightLastPathComponent")(filePath.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def highlightLastPathComponent_=(x: js.Function1[/* filePath */ String, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("highlightLastPathComponent")(x.asInstanceOf[js.Any])
    
    @JSImport("@expo/xcpretty", "Formatter.relativePath")
    @js.native
    def relativePath: js.Function2[/* projectRoot */ String, /* filePath */ String, String] = js.native
    inline def relativePath(projectRoot: String, filePath: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("relativePath")(projectRoot.asInstanceOf[js.Any], filePath.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def relativePath_=(x: js.Function2[/* projectRoot */ String, /* filePath */ String, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("relativePath")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@expo/xcpretty", "MetroParser")
  @js.native
  open class MetroParser protected ()
    extends typings.expoXcpretty.buildMetroParserMod.MetroParser {
    def this(formatter: typings.expoXcpretty.buildFormatterMod.Formatter) = this()
  }
  
  @JSImport("@expo/xcpretty", "Parser")
  @js.native
  open class Parser protected ()
    extends typings.expoXcpretty.buildParserMod.Parser {
    def this(formatter: typings.expoXcpretty.buildFormatterMod.Formatter) = this()
  }
  
  @JSImport("@expo/xcpretty", "PodfileTracer")
  @js.native
  open class PodfileTracer protected ()
    extends typings.expoXcpretty.buildUtilsPodfileTracerMod.PodfileTracer {
    def this(props: Podfile) = this()
  }
  /* static members */
  object PodfileTracer {
    
    @JSImport("@expo/xcpretty", "PodfileTracer")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(projectRoot: String): typings.expoXcpretty.buildUtilsPodfileTracerMod.PodfileTracer = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[typings.expoXcpretty.buildUtilsPodfileTracerMod.PodfileTracer]
    inline def create(projectRoot: String, param1: XcodeProject): typings.expoXcpretty.buildUtilsPodfileTracerMod.PodfileTracer = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(projectRoot.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[typings.expoXcpretty.buildUtilsPodfileTracerMod.PodfileTracer]
  }
  
  object Runner {
    
    @JSImport("@expo/xcpretty", "Runner")
    @js.native
    val ^ : js.Any = js.native
    
    inline def createXcodeBuildHooks(projectRoot: String, param1: Reject): OnData = (^.asInstanceOf[js.Dynamic].applyDynamic("createXcodeBuildHooks")(projectRoot.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[OnData]
    
    inline def formatXcodeBuildPipeProcessAsync(projectRoot: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("formatXcodeBuildPipeProcessAsync")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
    inline def formatXcodeBuildPipeProcessAsync(projectRoot: String, param1: XcodeProjectName): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("formatXcodeBuildPipeProcessAsync")(projectRoot.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    
    inline def getErrorLogFilePath(projectRoot: String): js.Tuple2[String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getErrorLogFilePath")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[String, String]]
    
    inline def writeBuildLogs(projectRoot: String, buildOutput: String, errorOutput: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("writeBuildLogs")(projectRoot.asInstanceOf[js.Any], buildOutput.asInstanceOf[js.Any], errorOutput.asInstanceOf[js.Any])).asInstanceOf[String]
  }
  
  inline def switchRegex(
    text: String,
    cases: js.Array[
      js.Tuple2[js.RegExp | Null, js.Function1[/* matches */ RegExpMatchArray, String | Unit]]
    ]
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("switchRegex")(text.asInstanceOf[js.Any], cases.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def switchRegex(
    text: String,
    cases: js.Array[
      js.Tuple2[js.RegExp | Null, js.Function1[/* matches */ RegExpMatchArray, String | Unit]]
    ],
    isAll: Boolean
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("switchRegex")(text.asInstanceOf[js.Any], cases.asInstanceOf[js.Any], isAll.asInstanceOf[js.Any])).asInstanceOf[String]
}
