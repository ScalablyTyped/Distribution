package typings.docxTemplates

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorsMod {
  
  @JSImport("docx-templates/lib/errors", "CommandExecutionError")
  @js.native
  class CommandExecutionError protected ()
    extends StObject
       with Error {
    def this(err: Error, command: String) = this()
    
    var command: String = js.native
    
    var err: Error = js.native
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("docx-templates/lib/errors", "CommandSyntaxError")
  @js.native
  class CommandSyntaxError protected ()
    extends StObject
       with Error {
    def this(command: String) = this()
    
    var command: String = js.native
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("docx-templates/lib/errors", "ImageError")
  @js.native
  class ImageError protected () extends CommandExecutionError {
    def this(err: Error, command: String) = this()
  }
  
  @JSImport("docx-templates/lib/errors", "InternalError")
  @js.native
  class InternalError ()
    extends StObject
       with Error {
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("docx-templates/lib/errors", "InvalidCommandError")
  @js.native
  class InvalidCommandError protected ()
    extends StObject
       with Error {
    def this(msg: String, command: String) = this()
    
    var command: String = js.native
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("docx-templates/lib/errors", "NullishCommandResultError")
  @js.native
  class NullishCommandResultError protected ()
    extends StObject
       with Error {
    def this(command: String) = this()
    
    var command: String = js.native
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("docx-templates/lib/errors", "TemplateParseError")
  @js.native
  class TemplateParseError ()
    extends StObject
       with Error {
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
  }
}
