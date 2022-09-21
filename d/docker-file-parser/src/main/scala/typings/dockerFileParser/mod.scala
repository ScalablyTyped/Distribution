package typings.dockerFileParser

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("docker-file-parser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parse(contents: String): js.Array[CommandEntry] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(contents.asInstanceOf[js.Any]).asInstanceOf[js.Array[CommandEntry]]
  inline def parse(contents: String, options: ParseOptions): js.Array[CommandEntry] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(contents.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[CommandEntry]]
  
  trait CommandEntry extends StObject {
    
    var args: String | js.Array[String] | StringDictionary[String]
    
    var error: js.UndefOr[String] = js.undefined
    
    var lineno: Double
    
    var name: String
    
    var raw: String
  }
  object CommandEntry {
    
    inline def apply(
      args: String | js.Array[String] | StringDictionary[String],
      lineno: Double,
      name: String,
      raw: String
    ): CommandEntry = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], lineno = lineno.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommandEntry]
    }
    
    extension [Self <: CommandEntry](x: Self) {
      
      inline def setArgs(value: String | js.Array[String] | StringDictionary[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value*))
      
      inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setLineno(value: Double): Self = StObject.set(x, "lineno", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    }
  }
  
  trait ParseOptions extends StObject {
    
    var includeComments: Boolean
  }
  object ParseOptions {
    
    inline def apply(includeComments: Boolean): ParseOptions = {
      val __obj = js.Dynamic.literal(includeComments = includeComments.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParseOptions]
    }
    
    extension [Self <: ParseOptions](x: Self) {
      
      inline def setIncludeComments(value: Boolean): Self = StObject.set(x, "includeComments", value.asInstanceOf[js.Any])
    }
  }
}
