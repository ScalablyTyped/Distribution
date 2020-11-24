package typings.emberTemplate

import typings.emberTemplate.handlebarsMod.SafeString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ember/template", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def htmlSafe(str: String): SafeString = js.native
  
  def isHTMLSafe(str: js.Any): /* is @ember/template.@ember/template/-private/handlebars.SafeString */ Boolean = js.native
}
