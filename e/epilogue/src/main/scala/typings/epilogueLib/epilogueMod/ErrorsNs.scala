package typings
package epilogueLib.epilogueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("epilogue", "Errors")
@js.native
object ErrorsNs extends js.Object {
  @js.native
  class BadRequestError () extends EpilogueError {
    def this(message: java.lang.String) = this()
    def this(message: java.lang.String, errors: js.Array[java.lang.String]) = this()
    def this(message: java.lang.String, errors: js.Array[java.lang.String], cause: stdLib.Error) = this()
  }
  
  @js.native
  class EpilogueError protected ()
    extends stdLib.Error {
    def this(status: EpilogueError) = this()
    def this(status: scala.Double) = this()
    def this(status: EpilogueError, message: java.lang.String) = this()
    def this(status: scala.Double, message: java.lang.String) = this()
    def this(status: EpilogueError, message: java.lang.String, errors: js.Array[java.lang.String]) = this()
    def this(status: scala.Double, message: java.lang.String, errors: js.Array[java.lang.String]) = this()
    def this(status: EpilogueError, message: java.lang.String, errors: js.Array[java.lang.String], cause: stdLib.Error) = this()
    def this(status: scala.Double, message: java.lang.String, errors: js.Array[java.lang.String], cause: stdLib.Error) = this()
    var cause: stdLib.Error = js.native
    var errors: js.Array[java.lang.String] = js.native
    /* CompleteClass */
    override var message: java.lang.String = js.native
    /* CompleteClass */
    override var name: java.lang.String = js.native
    var status: scala.Double | EpilogueError = js.native
  }
  
  @js.native
  class ForbiddenError () extends EpilogueError {
    def this(message: java.lang.String) = this()
    def this(message: java.lang.String, errors: js.Array[java.lang.String]) = this()
    def this(message: java.lang.String, errors: js.Array[java.lang.String], cause: stdLib.Error) = this()
  }
  
  @js.native
  class NotFoundError () extends EpilogueError {
    def this(message: java.lang.String) = this()
    def this(message: java.lang.String, errors: js.Array[java.lang.String]) = this()
    def this(message: java.lang.String, errors: js.Array[java.lang.String], cause: stdLib.Error) = this()
  }
  
  @js.native
  class RequestCompleted ()
    extends stdLib.Error {
    /* CompleteClass */
    override var message: java.lang.String = js.native
    /* CompleteClass */
    override var name: java.lang.String = js.native
  }
  
}

