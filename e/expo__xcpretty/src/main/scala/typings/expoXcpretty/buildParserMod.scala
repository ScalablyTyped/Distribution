package typings.expoXcpretty

import typings.expoXcpretty.buildFormatterMod.Formatter
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildParserMod {
  
  @JSImport("@expo/xcpretty/build/Parser", "Parser")
  @js.native
  open class Parser protected () extends StObject {
    def this(formatter: Formatter) = this()
    
    var currentIssue: TestIssue = js.native
    
    /* private */ var errorOrWarningIsPresent: Any = js.native
    
    var failures: Record[String, js.Array[Failure]] = js.native
    
    /* private */ var formatCompileError: Any = js.native
    
    /* private */ var formatCompileWarning: Any = js.native
    
    /* private */ var formatDuplicateSymbols: Any = js.native
    
    /* private */ var formatSummaryIfNeeded: Any = js.native
    
    /* private */ var formatUndefinedSymbols: Any = js.native
    
    var formattedSummary: Boolean = js.native
    
    var formatter: Formatter = js.native
    
    var formattingError: js.UndefOr[Boolean] = js.native
    
    var formattingLinkerFailure: js.UndefOr[Boolean] = js.native
    
    var formattingWarning: js.UndefOr[Boolean] = js.native
    
    var linkerFailure: LinkerFailure = js.native
    
    def parse(text: String): Unit | String = js.native
    
    /* private */ var resetLinkerFormatState: Any = js.native
    
    /* private */ var shouldFormatDuplicateSymbols: Any = js.native
    
    /* private */ var shouldFormatError: Any = js.native
    
    /* private */ var shouldFormatSummary: Any = js.native
    
    /* private */ var shouldFormatUndefinedSymbols: Any = js.native
    
    /* private */ var shouldFormatWarning: Any = js.native
    
    /* private */ var storeFailure: Any = js.native
    
    var testCase: js.UndefOr[String] = js.native
    
    var testSuite: js.UndefOr[String] = js.native
    
    var testsDone: js.UndefOr[Boolean] = js.native
    
    /* private */ var updateErrorState: Any = js.native
    
    /* private */ var updateLinkerFailureState: Any = js.native
    
    /* private */ var updateTestState: Any = js.native
  }
  
  trait Failure extends StObject {
    
    var filePath: String
    
    var reason: String
    
    var testCase: String
  }
  object Failure {
    
    inline def apply(filePath: String, reason: String, testCase: String): Failure = {
      val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], testCase = testCase.asInstanceOf[js.Any])
      __obj.asInstanceOf[Failure]
    }
    
    extension [Self <: Failure](x: Self) {
      
      inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
      
      inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
      
      inline def setTestCase(value: String): Self = StObject.set(x, "testCase", value.asInstanceOf[js.Any])
    }
  }
  
  trait LinkerFailure extends StObject {
    
    var files: js.Array[String]
    
    var isWarning: js.UndefOr[Boolean] = js.undefined
    
    var message: js.UndefOr[String] = js.undefined
    
    var reference: js.UndefOr[String] = js.undefined
    
    var symbol: js.UndefOr[String] = js.undefined
  }
  object LinkerFailure {
    
    inline def apply(files: js.Array[String]): LinkerFailure = {
      val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any])
      __obj.asInstanceOf[LinkerFailure]
    }
    
    extension [Self <: LinkerFailure](x: Self) {
      
      inline def setFiles(value: js.Array[String]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesVarargs(value: String*): Self = StObject.set(x, "files", js.Array(value*))
      
      inline def setIsWarning(value: Boolean): Self = StObject.set(x, "isWarning", value.asInstanceOf[js.Any])
      
      inline def setIsWarningUndefined: Self = StObject.set(x, "isWarning", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setReference(value: String): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
      
      inline def setReferenceUndefined: Self = StObject.set(x, "reference", js.undefined)
      
      inline def setSymbol(value: String): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
      
      inline def setSymbolUndefined: Self = StObject.set(x, "symbol", js.undefined)
    }
  }
  
  trait TestIssue extends StObject {
    
    var cursor: js.UndefOr[String] = js.undefined
    
    var fileName: js.UndefOr[String] = js.undefined
    
    var filePath: js.UndefOr[String] = js.undefined
    
    var line: js.UndefOr[String] = js.undefined
    
    var reason: js.UndefOr[String] = js.undefined
  }
  object TestIssue {
    
    inline def apply(): TestIssue = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TestIssue]
    }
    
    extension [Self <: TestIssue](x: Self) {
      
      inline def setCursor(value: String): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
      
      inline def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
      
      inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
      
      inline def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
      
      inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
      
      inline def setFilePathUndefined: Self = StObject.set(x, "filePath", js.undefined)
      
      inline def setLine(value: String): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
      
      inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
      
      inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    }
  }
}
