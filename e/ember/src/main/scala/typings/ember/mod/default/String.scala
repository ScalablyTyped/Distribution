package typings.ember.mod.default

import typings.emberTemplate.handlebarsMod.SafeString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ember", "String")
@js.native
object String extends js.Object {
  
  val camelize: js.Function1[/* str */ java.lang.String, java.lang.String] = js.native
  
  val capitalize: js.Function1[/* str */ java.lang.String, java.lang.String] = js.native
  
  val classify: js.Function1[/* str */ java.lang.String, java.lang.String] = js.native
  
  val dasherize: js.Function1[/* str */ java.lang.String, java.lang.String] = js.native
  
  val decamelize: js.Function1[/* str */ java.lang.String, java.lang.String] = js.native
  
  def fmt(args: java.lang.String*): java.lang.String = js.native
  
  val htmlSafe: js.Function1[/* str */ java.lang.String, SafeString] = js.native
  
  val isHTMLSafe: js.Function1[
    /* str */ js.Any, 
    /* is @ember/template.@ember/template/-private/handlebars.SafeString */ Boolean
  ] = js.native
  
  val underscore: js.Function1[/* str */ java.lang.String, java.lang.String] = js.native
  
  val w: js.Function1[/* str */ java.lang.String, js.Array[java.lang.String]] = js.native
  
  @js.native
  object loc extends js.Object {
    
    def apply(template: java.lang.String): java.lang.String = js.native
    def apply(template: java.lang.String, args: js.Array[java.lang.String]): java.lang.String = js.native
  }
}
