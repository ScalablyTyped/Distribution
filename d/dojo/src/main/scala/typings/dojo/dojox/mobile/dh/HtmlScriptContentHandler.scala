package typings.dojo.dojox.mobile.dh

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/mobile/dh/HtmlScriptContentHandler.html
  *
  * An HTML content handler that has script execution capability.
  *
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.dojo.dojox.mobile.ExecScriptMixin because Inheritance from two classes. Inlined execScript */ @JSGlobal("dojox.mobile.dh.HtmlScriptContentHandler")
@js.native
class HtmlScriptContentHandler () extends HtmlContentHandler {
  /**
    * Finds script tags and executes the script.
    *
    * @param html The HTML input.
    */
  /**
    * Finds script tags and executes the script.
    *
    * @param html The HTML input.
    */
  def execScript(html: String): js.Any = js.native
}

