package typings.ejs.ejsMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ejs", "Template")
@js.native
class Template protected () extends js.Object {
  def this(text: String) = this()
  def this(text: String, opts: Options) = this()
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
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[modes with String] = js.native
    /* "comment" */ @js.native
    object COMMENT extends TopLevel[COMMENT with String]
    
    /* "escaped" */ @js.native
    object ESCAPED extends TopLevel[ESCAPED with String]
    
    /* "eval" */ @js.native
    object EVAL extends TopLevel[EVAL with String]
    
    /* "literal" */ @js.native
    object LITERAL extends TopLevel[LITERAL with String]
    
    /* "raw" */ @js.native
    object RAW extends TopLevel[RAW with String]
    
  }
  
}

