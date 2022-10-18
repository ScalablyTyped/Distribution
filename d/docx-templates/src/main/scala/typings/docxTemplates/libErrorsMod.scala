package typings.docxTemplates

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libErrorsMod {
  
  @JSImport("docx-templates/lib/errors", "CommandExecutionError")
  @js.native
  open class CommandExecutionError protected ()
    extends StObject
       with Error {
    def this(err: js.Error, command: String) = this()
    
    var command: String = js.native
    
    var err: js.Error = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("docx-templates/lib/errors", "CommandSyntaxError")
  @js.native
  open class CommandSyntaxError protected ()
    extends StObject
       with Error {
    def this(command: String) = this()
    
    var command: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("docx-templates/lib/errors", "ImageError")
  @js.native
  open class ImageError protected () extends CommandExecutionError {
    def this(err: js.Error, command: String) = this()
  }
  
  @JSImport("docx-templates/lib/errors", "InternalError")
  @js.native
  open class InternalError protected ()
    extends StObject
       with Error {
    def this(msg: String) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("docx-templates/lib/errors", "InvalidCommandError")
  @js.native
  open class InvalidCommandError protected ()
    extends StObject
       with Error {
    def this(msg: String, command: String) = this()
    
    var command: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("docx-templates/lib/errors", "NullishCommandResultError")
  @js.native
  open class NullishCommandResultError protected ()
    extends StObject
       with Error {
    def this(command: String) = this()
    
    var command: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("docx-templates/lib/errors", "ObjectCommandResultError")
  @js.native
  open class ObjectCommandResultError protected ()
    extends StObject
       with Error {
    def this(command: String) = this()
    
    var command: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("docx-templates/lib/errors", "TemplateParseError")
  @js.native
  open class TemplateParseError ()
    extends StObject
       with Error {
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
}
