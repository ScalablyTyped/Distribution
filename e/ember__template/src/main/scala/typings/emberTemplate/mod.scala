package typings.emberTemplate

import typings.emberTemplate.handlebarsMod.SafeString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ember/template", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def htmlSafe(str: String): SafeString = ^.asInstanceOf[js.Dynamic].applyDynamic("htmlSafe")(str.asInstanceOf[js.Any]).asInstanceOf[SafeString]
  
  @scala.inline
  def isHTMLSafe(str: js.Any): /* is @ember/template.@ember/template/-private/handlebars.SafeString */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isHTMLSafe")(str.asInstanceOf[js.Any]).asInstanceOf[/* is @ember/template.@ember/template/-private/handlebars.SafeString */ Boolean]
}
