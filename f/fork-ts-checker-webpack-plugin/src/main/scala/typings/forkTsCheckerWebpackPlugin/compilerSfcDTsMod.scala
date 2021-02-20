package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginBooleans.`true`
import typings.std.Error
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object compilerSfcDTsMod {
  
  @js.native
  trait CompilerError extends Error {
    
    var code: Double = js.native
    
    var loc: js.UndefOr[SourceLocation] = js.native
  }
  object CompilerError {
    
    @scala.inline
    def apply(code: Double, message: String, name: String): CompilerError = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[CompilerError]
    }
    
    @scala.inline
    implicit class CompilerErrorMutableBuilder[Self <: CompilerError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoc(value: SourceLocation): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
    }
  }
  
  @js.native
  trait Position extends StObject {
    
    var column: Double = js.native
    
    var line: Double = js.native
    
    var offset: Double = js.native
  }
  object Position {
    
    @scala.inline
    def apply(column: Double, line: Double, offset: Double): Position = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
      __obj.asInstanceOf[Position]
    }
    
    @scala.inline
    implicit class PositionMutableBuilder[Self <: Position] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SFCBlock extends StObject {
    
    var attrs: Record[String, String | `true`] = js.native
    
    var content: String = js.native
    
    var lang: js.UndefOr[String] = js.native
    
    var loc: SourceLocation = js.native
    
    var src: js.UndefOr[String] = js.native
    
    var `type`: String = js.native
  }
  object SFCBlock {
    
    @scala.inline
    def apply(attrs: Record[String, String | `true`], content: String, loc: SourceLocation, `type`: String): SFCBlock = {
      val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[SFCBlock]
    }
    
    @scala.inline
    implicit class SFCBlockMutableBuilder[Self <: SFCBlock] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttrs(value: Record[String, String | `true`]): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
      
      @scala.inline
      def setLoc(value: SourceLocation): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SFCDescriptor extends StObject {
    
    var customBlocks: js.Array[SFCBlock] = js.native
    
    var filename: String = js.native
    
    var script: SFCBlock | Null = js.native
    
    var styles: js.Array[SFCBlock] = js.native
    
    var template: SFCBlock | Null = js.native
  }
  object SFCDescriptor {
    
    @scala.inline
    def apply(customBlocks: js.Array[SFCBlock], filename: String, styles: js.Array[SFCBlock]): SFCDescriptor = {
      val __obj = js.Dynamic.literal(customBlocks = customBlocks.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
      __obj.asInstanceOf[SFCDescriptor]
    }
    
    @scala.inline
    implicit class SFCDescriptorMutableBuilder[Self <: SFCDescriptor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCustomBlocks(value: js.Array[SFCBlock]): Self = StObject.set(x, "customBlocks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomBlocksVarargs(value: SFCBlock*): Self = StObject.set(x, "customBlocks", js.Array(value :_*))
      
      @scala.inline
      def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScript(value: SFCBlock): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScriptNull: Self = StObject.set(x, "script", null)
      
      @scala.inline
      def setStyles(value: js.Array[SFCBlock]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesVarargs(value: SFCBlock*): Self = StObject.set(x, "styles", js.Array(value :_*))
      
      @scala.inline
      def setTemplate(value: SFCBlock): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplateNull: Self = StObject.set(x, "template", null)
    }
  }
  
  @js.native
  trait SFCParseResult extends StObject {
    
    var descriptor: SFCDescriptor = js.native
    
    var errors: js.Array[CompilerError] = js.native
  }
  object SFCParseResult {
    
    @scala.inline
    def apply(descriptor: SFCDescriptor, errors: js.Array[CompilerError]): SFCParseResult = {
      val __obj = js.Dynamic.literal(descriptor = descriptor.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any])
      __obj.asInstanceOf[SFCParseResult]
    }
    
    @scala.inline
    implicit class SFCParseResultMutableBuilder[Self <: SFCParseResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescriptor(value: SFCDescriptor): Self = StObject.set(x, "descriptor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrors(value: js.Array[CompilerError]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorsVarargs(value: CompilerError*): Self = StObject.set(x, "errors", js.Array(value :_*))
    }
  }
  
  @js.native
  trait SourceLocation extends StObject {
    
    var end: Position = js.native
    
    var source: String = js.native
    
    var start: Position = js.native
  }
  object SourceLocation {
    
    @scala.inline
    def apply(end: Position, source: String, start: Position): SourceLocation = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[SourceLocation]
    }
    
    @scala.inline
    implicit class SourceLocationMutableBuilder[Self <: SourceLocation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnd(value: Position): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStart(value: Position): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait VueTemplateCompilerV3 extends StObject {
    
    def parse(template: String): SFCParseResult = js.native
    def parse(template: String, options: js.Any): SFCParseResult = js.native
  }
}
