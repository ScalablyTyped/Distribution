package typings.forkTsCheckerWebpackPlugin

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eslintMod {
  
  @js.native
  trait CLIEngine extends StObject {
    
    def executeOnFiles(filesPatterns: js.Array[String]): LintReport = js.native
    
    def isPathIgnored(filePath: String): Boolean = js.native
    
    def resolveFileGlobPatterns(filesPatterns: js.Array[String]): js.Array[String] = js.native
    
    var version: String = js.native
  }
  object CLIEngine {
    
    @scala.inline
    def apply(
      executeOnFiles: js.Array[String] => LintReport,
      isPathIgnored: String => Boolean,
      resolveFileGlobPatterns: js.Array[String] => js.Array[String],
      version: String
    ): CLIEngine = {
      val __obj = js.Dynamic.literal(executeOnFiles = js.Any.fromFunction1(executeOnFiles), isPathIgnored = js.Any.fromFunction1(isPathIgnored), resolveFileGlobPatterns = js.Any.fromFunction1(resolveFileGlobPatterns), version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[CLIEngine]
    }
    
    @scala.inline
    implicit class CLIEngineMutableBuilder[Self <: CLIEngine] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExecuteOnFiles(value: js.Array[String] => LintReport): Self = StObject.set(x, "executeOnFiles", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsPathIgnored(value: String => Boolean): Self = StObject.set(x, "isPathIgnored", js.Any.fromFunction1(value))
      
      @scala.inline
      def setResolveFileGlobPatterns(value: js.Array[String] => js.Array[String]): Self = StObject.set(x, "resolveFileGlobPatterns", js.Any.fromFunction1(value))
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CLIEngineOptions
    extends /* key */ StringDictionary[js.Any] {
    
    var cwd: js.UndefOr[String] = js.native
    
    var extensions: js.UndefOr[js.Array[String]] = js.native
    
    var fix: js.UndefOr[Boolean] = js.native
  }
  object CLIEngineOptions {
    
    @scala.inline
    def apply(): CLIEngineOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CLIEngineOptions]
    }
    
    @scala.inline
    implicit class CLIEngineOptionsMutableBuilder[Self <: CLIEngineOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      @scala.inline
      def setExtensions(value: js.Array[String]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
      
      @scala.inline
      def setExtensionsVarargs(value: String*): Self = StObject.set(x, "extensions", js.Array(value :_*))
      
      @scala.inline
      def setFix(value: Boolean): Self = StObject.set(x, "fix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixUndefined: Self = StObject.set(x, "fix", js.undefined)
    }
  }
  
  @js.native
  trait LintMessage
    extends /* key */ StringDictionary[js.Any] {
    
    var column: Double = js.native
    
    var endColumn: js.UndefOr[Double] = js.native
    
    var endLine: js.UndefOr[Double] = js.native
    
    var line: Double = js.native
    
    var message: String = js.native
    
    var ruleId: String | Null = js.native
    
    var severity: Double = js.native
  }
  object LintMessage {
    
    @scala.inline
    def apply(column: Double, line: Double, message: String, severity: Double): LintMessage = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], severity = severity.asInstanceOf[js.Any])
      __obj.asInstanceOf[LintMessage]
    }
    
    @scala.inline
    implicit class LintMessageMutableBuilder[Self <: LintMessage] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndColumn(value: Double): Self = StObject.set(x, "endColumn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndColumnUndefined: Self = StObject.set(x, "endColumn", js.undefined)
      
      @scala.inline
      def setEndLine(value: Double): Self = StObject.set(x, "endLine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndLineUndefined: Self = StObject.set(x, "endLine", js.undefined)
      
      @scala.inline
      def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRuleId(value: String): Self = StObject.set(x, "ruleId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRuleIdNull: Self = StObject.set(x, "ruleId", null)
      
      @scala.inline
      def setSeverity(value: Double): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait LintReport
    extends /* key */ StringDictionary[js.Any] {
    
    var results: js.Array[LintResult] = js.native
  }
  object LintReport {
    
    @scala.inline
    def apply(results: js.Array[LintResult]): LintReport = {
      val __obj = js.Dynamic.literal(results = results.asInstanceOf[js.Any])
      __obj.asInstanceOf[LintReport]
    }
    
    @scala.inline
    implicit class LintReportMutableBuilder[Self <: LintReport] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setResults(value: js.Array[LintResult]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResultsVarargs(value: LintResult*): Self = StObject.set(x, "results", js.Array(value :_*))
    }
  }
  
  @js.native
  trait LintResult
    extends /* key */ StringDictionary[js.Any] {
    
    var filePath: String = js.native
    
    var messages: js.Array[LintMessage] = js.native
  }
  object LintResult {
    
    @scala.inline
    def apply(filePath: String, messages: js.Array[LintMessage]): LintResult = {
      val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any], messages = messages.asInstanceOf[js.Any])
      __obj.asInstanceOf[LintResult]
    }
    
    @scala.inline
    implicit class LintResultMutableBuilder[Self <: LintResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessages(value: js.Array[LintMessage]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessagesVarargs(value: LintMessage*): Self = StObject.set(x, "messages", js.Array(value :_*))
    }
  }
}
