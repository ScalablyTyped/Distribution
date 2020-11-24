package typings.ejs.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ejs", "Template")
@js.native
class Template protected () extends js.Object {
  def this(text: String) = this()
  def this(text: String, opts: Options) = this()
  
  /**
    * Compiles the EJS template.
    */
  def compile(): TemplateFunction | AsyncTemplateFunction | ClientFunction | AsyncClientFunction = js.native
  
  /**
    * The compiled JavaScript function source, or the empty string
    * if the template hasn't been compiled yet.
    */
  val source: String = js.native
  
  /**
    * The EJS template source text.
    */
  val templateText: String = js.native
}
@JSImport("ejs", "Template")
@js.native
object Template extends js.Object {
  
  @js.native
  sealed trait modes extends js.Object
  @js.native
  object modes extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[modes with String] = js.native
    
    @js.native
    sealed trait COMMENT extends modes
    /* "comment" */ @js.native
    object COMMENT extends TopLevel[COMMENT with String]
    
    @js.native
    sealed trait ESCAPED extends modes
    /* "escaped" */ @js.native
    object ESCAPED extends TopLevel[ESCAPED with String]
    
    @js.native
    sealed trait EVAL extends modes
    /* "eval" */ @js.native
    object EVAL extends TopLevel[EVAL with String]
    
    @js.native
    sealed trait LITERAL extends modes
    /* "literal" */ @js.native
    object LITERAL extends TopLevel[LITERAL with String]
    
    @js.native
    sealed trait RAW extends modes
    /* "raw" */ @js.native
    object RAW extends TopLevel[RAW with String]
  }
}
