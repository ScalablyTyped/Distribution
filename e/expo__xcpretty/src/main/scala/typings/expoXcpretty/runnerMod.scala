package typings.expoXcpretty

import typings.expoXcpretty.anon.OnData
import typings.expoXcpretty.anon.Reject
import typings.expoXcpretty.anon.XcodeProjectName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object runnerMod {
  
  @JSImport("@expo/xcpretty/build/Runner", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createXcodeBuildHooks(projectRoot: String, hasXcodeProjectNameResolveReject: Reject): OnData = (^.asInstanceOf[js.Dynamic].applyDynamic("createXcodeBuildHooks")(projectRoot.asInstanceOf[js.Any], hasXcodeProjectNameResolveReject.asInstanceOf[js.Any])).asInstanceOf[OnData]
  
  inline def formatXcodeBuildPipeProcessAsync(projectRoot: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("formatXcodeBuildPipeProcessAsync")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def formatXcodeBuildPipeProcessAsync(projectRoot: String, hasXcodeProjectName: XcodeProjectName): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("formatXcodeBuildPipeProcessAsync")(projectRoot.asInstanceOf[js.Any], hasXcodeProjectName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def getErrorLogFilePath(projectRoot: String): js.Tuple2[String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getErrorLogFilePath")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[String, String]]
  
  inline def writeBuildLogs(projectRoot: String, buildOutput: String, errorOutput: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("writeBuildLogs")(projectRoot.asInstanceOf[js.Any], buildOutput.asInstanceOf[js.Any], errorOutput.asInstanceOf[js.Any])).asInstanceOf[String]
}
