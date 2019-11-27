package typings.ejs.ejsMod

import typings.ejs.ejsMod.Template.modes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ejs", "Template")
@js.native
class Template protected () extends js.Object {
  def this(text: String) = this()
  def this(text: String, opts: Options) = this()
  /**
  	 * The compiled dependencies of this template.
  	 *
  	 * Always empty if legacy include directives are disabled.
  	 */
  val dependencies: js.Array[String] = js.native
  /**
  	 * The compiled JavaScript function source, or the empty string
  	 * if the template hasn't been compiled yet.
  	 */
  val source: String = js.native
  /**
  	 * The EJS template source text.
  	 */
  val templateText: String = js.native
  /**
  	 * Compiles the EJS template.
  	 */
  def compile(): TemplateFunction | AsyncTemplateFunction | ClientFunction | AsyncClientFunction = js.native
}

@JSImport("ejs", "Template")
@js.native
object Template extends js.Object {
  @js.native
  sealed trait modes extends js.Object
  
  @js.native
  object modes extends js.Object {
    @js.native
    sealed trait COMMENT extends modes
    
    @js.native
    sealed trait ESCAPED extends modes
    
    @js.native
    sealed trait EVAL extends modes
    
    @js.native
    sealed trait LITERAL extends modes
    
    @js.native
    sealed trait RAW extends modes
    
    /* "comment" */ val COMMENT: typings.ejs.ejsMod.Template.modes.COMMENT with String = js.native
    /* "escaped" */ val ESCAPED: typings.ejs.ejsMod.Template.modes.ESCAPED with String = js.native
    /* "eval" */ val EVAL: typings.ejs.ejsMod.Template.modes.EVAL with String = js.native
    /* "literal" */ val LITERAL: typings.ejs.ejsMod.Template.modes.LITERAL with String = js.native
    /* "raw" */ val RAW: typings.ejs.ejsMod.Template.modes.RAW with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[modes with String] = js.native
  }
  
}

