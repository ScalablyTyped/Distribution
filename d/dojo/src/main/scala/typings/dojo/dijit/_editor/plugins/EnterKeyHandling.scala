package typings.dojo.dijit._editor.plugins

import typings.dojo.dijit._editor.Plugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/_editor/plugins/EnterKeyHandling.html
  *
  * This plugin tries to make all browsers behave consistently with regard to
  * how ENTER behaves in the editor window.  It traps the ENTER key and alters
  * the way DOM is constructed in certain cases to try to commonize the generated
  * DOM and behaviors across browsers.
  * This plugin has three modes:
  * 
  * blockNodeForEnter=BR
  * blockNodeForEnter=DIV
  * blockNodeForEnter=P
  * In blockNodeForEnter=P, the ENTER key starts a new
  * paragraph, and shift-ENTER starts a new line in the current paragraph.
  * For example, the input:
  * 
  * first paragraph <shift-ENTER>
  * second line of first paragraph <ENTER>
  * second paragraph
  * will generate:
  * 
  * <p>
  *     first paragraph
  *     <br/>
  *     second line of first paragraph
  * </p>
  * <p>
  *     second paragraph
  * </p>
  * In BR and DIV mode, the ENTER key conceptually goes to a new line in the
  * current paragraph, and users conceptually create a new paragraph by pressing ENTER twice.
  * For example, if the user enters text into an editor like this:
  * 
  * one <ENTER>
  * two <ENTER>
  * three <ENTER>
  * <ENTER>
  * four <ENTER>
  * five <ENTER>
  * six <ENTER>
  * It will appear on the screen as two 'paragraphs' of three lines each.  Markupwise, this generates:
  * 
  * BR:
  * 
  * one<br/>
  * two<br/>
  * three<br/>
  * <br/>
  * four<br/>
  * five<br/>
  * six<br/>
  * DIV:
  * 
  * <div>one</div>
  * <div>two</div>
  * <div>three</div>
  * <div>&nbsp;</div>
  * <div>four</div>
  * <div>five</div>
  * <div>six</div>
  * 
  * @param args This object will be passed to the plugin constructor     
  */
@JSGlobal("dijit._editor.plugins.EnterKeyHandling")
@js.native
class EnterKeyHandling protected () extends Plugin {
  def this(args: js.Any) = this()
  /**
    * This property decides the behavior of Enter key. It can be either P,
    * DIV, BR, or empty (which means disable this feature). Anything else
    * will trigger errors.  The default is 'BR'
    * 
    * See class description for more details.
    * 
    */
  var blockNodeForEnter: String = js.native
  /**
    * 
    * @param editor             
    */
  def setEditor(editor: js.Any): Unit = js.native
}

