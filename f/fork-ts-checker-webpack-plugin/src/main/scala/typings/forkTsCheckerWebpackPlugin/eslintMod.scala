package typings.forkTsCheckerWebpackPlugin

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eslintMod {
  
  trait CLIEngine extends StObject {
    
    def executeOnFiles(filesPatterns: js.Array[String]): LintReport
    
    def isPathIgnored(filePath: String): Boolean
    
    def resolveFileGlobPatterns(filesPatterns: js.Array[String]): js.Array[String]
    
    var version: String
  }
  object CLIEngine {
    
    inline def apply(
      executeOnFiles: js.Array[String] => LintReport,
      isPathIgnored: String => Boolean,
      resolveFileGlobPatterns: js.Array[String] => js.Array[String],
      version: String
    ): CLIEngine = {
      val __obj = js.Dynamic.literal(executeOnFiles = js.Any.fromFunction1(executeOnFiles), isPathIgnored = js.Any.fromFunction1(isPathIgnored), resolveFileGlobPatterns = js.Any.fromFunction1(resolveFileGlobPatterns), version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[CLIEngine]
    }
    
    extension [Self <: CLIEngine](x: Self) {
      
      inline def setExecuteOnFiles(value: js.Array[String] => LintReport): Self = StObject.set(x, "executeOnFiles", js.Any.fromFunction1(value))
      
      inline def setIsPathIgnored(value: String => Boolean): Self = StObject.set(x, "isPathIgnored", js.Any.fromFunction1(value))
      
      inline def setResolveFileGlobPatterns(value: js.Array[String] => js.Array[String]): Self = StObject.set(x, "resolveFileGlobPatterns", js.Any.fromFunction1(value))
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait CLIEngineOptions
    extends StObject
       with /* key */ StringDictionary[js.Any] {
    
    var cwd: js.UndefOr[String] = js.undefined
    
    var extensions: js.UndefOr[js.Array[String]] = js.undefined
    
    var fix: js.UndefOr[Boolean] = js.undefined
  }
  object CLIEngineOptions {
    
    inline def apply(): CLIEngineOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CLIEngineOptions]
    }
    
    extension [Self <: CLIEngineOptions](x: Self) {
      
      inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      inline def setExtensions(value: js.Array[String]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
      
      inline def setExtensionsVarargs(value: String*): Self = StObject.set(x, "extensions", js.Array(value :_*))
      
      inline def setFix(value: Boolean): Self = StObject.set(x, "fix", value.asInstanceOf[js.Any])
      
      inline def setFixUndefined: Self = StObject.set(x, "fix", js.undefined)
    }
  }
  
  trait LintMessage
    extends StObject
       with /* key */ StringDictionary[js.Any] {
    
    var column: Double
    
    var endColumn: js.UndefOr[Double] = js.undefined
    
    var endLine: js.UndefOr[Double] = js.undefined
    
    var line: Double
    
    var message: String
    
    var ruleId: String | Null
    
    var severity: Double
  }
  object LintMessage {
    
    inline def apply(column: Double, line: Double, message: String, severity: Double): LintMessage = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], severity = severity.asInstanceOf[js.Any], ruleId = null)
      __obj.asInstanceOf[LintMessage]
    }
    
    extension [Self <: LintMessage](x: Self) {
      
      inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setEndColumn(value: Double): Self = StObject.set(x, "endColumn", value.asInstanceOf[js.Any])
      
      inline def setEndColumnUndefined: Self = StObject.set(x, "endColumn", js.undefined)
      
      inline def setEndLine(value: Double): Self = StObject.set(x, "endLine", value.asInstanceOf[js.Any])
      
      inline def setEndLineUndefined: Self = StObject.set(x, "endLine", js.undefined)
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setRuleId(value: String): Self = StObject.set(x, "ruleId", value.asInstanceOf[js.Any])
      
      inline def setRuleIdNull: Self = StObject.set(x, "ruleId", null)
      
      inline def setSeverity(value: Double): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    }
  }
  
  trait LintReport
    extends StObject
       with /* key */ StringDictionary[js.Any] {
    
    var results: js.Array[LintResult]
  }
  object LintReport {
    
    inline def apply(results: js.Array[LintResult]): LintReport = {
      val __obj = js.Dynamic.literal(results = results.asInstanceOf[js.Any])
      __obj.asInstanceOf[LintReport]
    }
    
    extension [Self <: LintReport](x: Self) {
      
      inline def setResults(value: js.Array[LintResult]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
      
      inline def setResultsVarargs(value: LintResult*): Self = StObject.set(x, "results", js.Array(value :_*))
    }
  }
  
  trait LintResult
    extends StObject
       with /* key */ StringDictionary[js.Any] {
    
    var filePath: String
    
    var messages: js.Array[LintMessage]
  }
  object LintResult {
    
    inline def apply(filePath: String, messages: js.Array[LintMessage]): LintResult = {
      val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any], messages = messages.asInstanceOf[js.Any])
      __obj.asInstanceOf[LintResult]
    }
    
    extension [Self <: LintResult](x: Self) {
      
      inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
      
      inline def setMessages(value: js.Array[LintMessage]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
      
      inline def setMessagesVarargs(value: LintMessage*): Self = StObject.set(x, "messages", js.Array(value :_*))
    }
  }
}
