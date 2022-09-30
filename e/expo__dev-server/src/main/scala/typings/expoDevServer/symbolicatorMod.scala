package typings.expoDevServer

import typings.expoDevServer.anon.Column
import typings.expoDevServer.anon.CustomizeFrame
import typings.expoDevServer.anon.PlatformString
import typings.sourceMap.mod.SourceMapConsumer
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object symbolicatorMod {
  
  @JSImport("@expo/dev-server/build/webpack/Symbolicator", "Symbolicator")
  @js.native
  open class Symbolicator protected () extends StObject {
    def this(config: CustomizeFrame) = this()
    
    var config: CustomizeFrame = js.native
    
    /* private */ var getCodeFrame: Any = js.native
    
    /**
      * Process raw React Native stack frames and transform them using Source Maps.
      * Method will try to symbolicate as much data as possible, but if the Source Maps
      * are not available, invalid or the original positions/data is not found in Source Maps,
      * the method will return raw values - the same as supplied with `stack` parameter.
      * For example out of 10 frames, it's possible that only first 7 will be symbolicated and the
      * remaining 3 will be unchanged.
      *
      * @param stack Raw stack frames.
      * @returns Symbolicated stack frames.
      */
    def process(stack: js.Array[ReactNativeStackFrame], hasPlatform: PlatformString): js.Promise[SymbolicatorResults] = js.native
    
    /* private */ var processFrame: Any = js.native
    
    /**
      * Cache with initialized `SourceMapConsumer` to improve symbolication performance.
      */
    var sourceMapConsumerCache: Record[String, SourceMapConsumer] = js.native
  }
  /* static members */
  object Symbolicator {
    
    @JSImport("@expo/dev-server/build/webpack/Symbolicator", "Symbolicator")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Infer platform from stack frames.
      * Usually at least one frame has `file` field with the bundle URL eg:
      * `http://localhost:8081/index.bundle?platform=ios&...`, which can be used to infer platform.
      *
      * @param stack Array of stack frames.
      * @returns Inferred platform or `undefined` if cannot infer.
      */
    inline def inferPlatformFromStack(stack: js.Array[ReactNativeStackFrame]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("inferPlatformFromStack")(stack.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  }
  
  trait CodeFrame extends StObject {
    
    var content: String
    
    var fileName: String
    
    var location: Column
  }
  object CodeFrame {
    
    inline def apply(content: String, fileName: String, location: Column): CodeFrame = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
      __obj.asInstanceOf[CodeFrame]
    }
    
    extension [Self <: CodeFrame](x: Self) {
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
      
      inline def setLocation(value: Column): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    }
  }
  
  trait InputStackFrame
    extends StObject
       with ReactNativeStackFrame {
    
    @JSName("file")
    var file_InputStackFrame: String
  }
  object InputStackFrame {
    
    inline def apply(file: String, methodName: String): InputStackFrame = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], methodName = methodName.asInstanceOf[js.Any], column = null, lineNumber = null)
      __obj.asInstanceOf[InputStackFrame]
    }
    
    extension [Self <: InputStackFrame](x: Self) {
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    }
  }
  
  trait ReactNativeStackFrame extends StObject {
    
    var column: Double | Null
    
    var file: String | Null
    
    var lineNumber: Double | Null
    
    var methodName: String
  }
  object ReactNativeStackFrame {
    
    inline def apply(methodName: String): ReactNativeStackFrame = {
      val __obj = js.Dynamic.literal(methodName = methodName.asInstanceOf[js.Any], column = null, file = null, lineNumber = null)
      __obj.asInstanceOf[ReactNativeStackFrame]
    }
    
    extension [Self <: ReactNativeStackFrame](x: Self) {
      
      inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setColumnNull: Self = StObject.set(x, "column", null)
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setFileNull: Self = StObject.set(x, "file", null)
      
      inline def setLineNumber(value: Double): Self = StObject.set(x, "lineNumber", value.asInstanceOf[js.Any])
      
      inline def setLineNumberNull: Self = StObject.set(x, "lineNumber", null)
      
      inline def setMethodName(value: String): Self = StObject.set(x, "methodName", value.asInstanceOf[js.Any])
    }
  }
  
  trait StackFrame
    extends StObject
       with InputStackFrame {
    
    var collapse: Boolean
  }
  object StackFrame {
    
    inline def apply(collapse: Boolean, file: String, methodName: String): StackFrame = {
      val __obj = js.Dynamic.literal(collapse = collapse.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], methodName = methodName.asInstanceOf[js.Any], column = null, lineNumber = null)
      __obj.asInstanceOf[StackFrame]
    }
    
    extension [Self <: StackFrame](x: Self) {
      
      inline def setCollapse(value: Boolean): Self = StObject.set(x, "collapse", value.asInstanceOf[js.Any])
    }
  }
  
  trait SymbolicatorResults extends StObject {
    
    var codeFrame: CodeFrame | Null
    
    var stack: js.Array[StackFrame]
  }
  object SymbolicatorResults {
    
    inline def apply(stack: js.Array[StackFrame]): SymbolicatorResults = {
      val __obj = js.Dynamic.literal(stack = stack.asInstanceOf[js.Any], codeFrame = null)
      __obj.asInstanceOf[SymbolicatorResults]
    }
    
    extension [Self <: SymbolicatorResults](x: Self) {
      
      inline def setCodeFrame(value: CodeFrame): Self = StObject.set(x, "codeFrame", value.asInstanceOf[js.Any])
      
      inline def setCodeFrameNull: Self = StObject.set(x, "codeFrame", null)
      
      inline def setStack(value: js.Array[StackFrame]): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
      
      inline def setStackVarargs(value: StackFrame*): Self = StObject.set(x, "stack", js.Array(value*))
    }
  }
}
