package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginBooleans.`true`
import typings.std.Error
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object `libTypescriptExtensionVueTypes@vueCompilerSfcMod` {
  
  trait CompilerError
    extends StObject
       with Error {
    
    var code: Double
    
    var loc: js.UndefOr[SourceLocation] = js.undefined
  }
  object CompilerError {
    
    inline def apply(code: Double, message: String, name: String): CompilerError = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[CompilerError]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CompilerError] (val x: Self) extends AnyVal {
      
      inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setLoc(value: SourceLocation): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
      
      inline def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
    }
  }
  
  trait Position extends StObject {
    
    var column: Double
    
    var line: Double
    
    var offset: Double
  }
  object Position {
    
    inline def apply(column: Double, line: Double, offset: Double): Position = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
      __obj.asInstanceOf[Position]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Position] (val x: Self) extends AnyVal {
      
      inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    }
  }
  
  trait SFCBlock extends StObject {
    
    var attrs: Record[String, String | `true`]
    
    var content: String
    
    var lang: js.UndefOr[String] = js.undefined
    
    var loc: SourceLocation
    
    var src: js.UndefOr[String] = js.undefined
    
    var `type`: String
  }
  object SFCBlock {
    
    inline def apply(attrs: Record[String, String | `true`], content: String, loc: SourceLocation, `type`: String): SFCBlock = {
      val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[SFCBlock]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SFCBlock] (val x: Self) extends AnyVal {
      
      inline def setAttrs(value: Record[String, String | `true`]): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
      
      inline def setLoc(value: SourceLocation): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait SFCDescriptor extends StObject {
    
    var customBlocks: js.Array[SFCBlock]
    
    var filename: String
    
    var script: SFCBlock | Null
    
    var styles: js.Array[SFCBlock]
    
    var template: SFCBlock | Null
  }
  object SFCDescriptor {
    
    inline def apply(customBlocks: js.Array[SFCBlock], filename: String, styles: js.Array[SFCBlock]): SFCDescriptor = {
      val __obj = js.Dynamic.literal(customBlocks = customBlocks.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any], script = null, template = null)
      __obj.asInstanceOf[SFCDescriptor]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SFCDescriptor] (val x: Self) extends AnyVal {
      
      inline def setCustomBlocks(value: js.Array[SFCBlock]): Self = StObject.set(x, "customBlocks", value.asInstanceOf[js.Any])
      
      inline def setCustomBlocksVarargs(value: SFCBlock*): Self = StObject.set(x, "customBlocks", js.Array(value*))
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setScript(value: SFCBlock): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
      
      inline def setScriptNull: Self = StObject.set(x, "script", null)
      
      inline def setStyles(value: js.Array[SFCBlock]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesVarargs(value: SFCBlock*): Self = StObject.set(x, "styles", js.Array(value*))
      
      inline def setTemplate(value: SFCBlock): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      inline def setTemplateNull: Self = StObject.set(x, "template", null)
    }
  }
  
  trait SFCParseResult extends StObject {
    
    var descriptor: SFCDescriptor
    
    var errors: js.Array[CompilerError]
  }
  object SFCParseResult {
    
    inline def apply(descriptor: SFCDescriptor, errors: js.Array[CompilerError]): SFCParseResult = {
      val __obj = js.Dynamic.literal(descriptor = descriptor.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any])
      __obj.asInstanceOf[SFCParseResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SFCParseResult] (val x: Self) extends AnyVal {
      
      inline def setDescriptor(value: SFCDescriptor): Self = StObject.set(x, "descriptor", value.asInstanceOf[js.Any])
      
      inline def setErrors(value: js.Array[CompilerError]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsVarargs(value: CompilerError*): Self = StObject.set(x, "errors", js.Array(value*))
    }
  }
  
  trait SourceLocation extends StObject {
    
    var end: Position
    
    var source: String
    
    var start: Position
  }
  object SourceLocation {
    
    inline def apply(end: Position, source: String, start: Position): SourceLocation = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[SourceLocation]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SourceLocation] (val x: Self) extends AnyVal {
      
      inline def setEnd(value: Position): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setStart(value: Position): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait VueTemplateCompilerV3 extends StObject {
    
    def parse(template: String): SFCParseResult = js.native
    def parse(template: String, options: Any): SFCParseResult = js.native
  }
}
