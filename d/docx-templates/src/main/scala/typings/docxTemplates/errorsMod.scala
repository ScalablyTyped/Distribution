package typings.docxTemplates

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("docx-templates/lib/errors", JSImport.Namespace)
@js.native
object errorsMod extends js.Object {
  
  @js.native
  class CommandExecutionError protected () extends Error {
    def this(err: Error, command: String) = this()
    
    var command: String = js.native
    
    var err: Error = js.native
  }
  
  @js.native
  class CommandSyntaxError protected () extends Error {
    def this(command: String) = this()
    
    var command: String = js.native
  }
  
  @js.native
  class ImageError () extends CommandExecutionError
  
  @js.native
  class InternalError () extends Error
  
  @js.native
  class InvalidCommandError protected () extends Error {
    def this(msg: String, command: String) = this()
    
    var command: String = js.native
  }
  
  @js.native
  class NullishCommandResultError protected () extends Error {
    def this(command: String) = this()
    
    var command: String = js.native
  }
  
  @js.native
  class TemplateParseError () extends Error
}
