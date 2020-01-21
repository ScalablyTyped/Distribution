package typings.dojo.dijit._editor.plugins

import typings.dojo.dijit._editor.Plugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/_editor/plugins/FontChoice.html
  *
  * This plugin provides three drop downs for setting style in the editor
  * (font, font size, and format block), as controlled by command.
  * The commands provided by this plugin are:
  * 
  * fontName: Provides a drop down to select from a list of font names
  * fontSize: Provides a drop down to select from a list of font sizes
  * formatBlock: Provides a drop down to select from a list of block styles
  * which can easily be added to an editor by including one or more of the above commands
  * in the plugins attribute as follows:
  * plugins="['fontName','fontSize',...]"
  * It is possible to override the default dropdown list by providing an Array for the custom property when
  * instantiating this plugin, e.g.
  * 
  * plugins="[{name:'dijit._editor.plugins.FontChoice', command:'fontName', values:['Verdana','Myriad','Garamond']},...]"
  * Alternatively, for fontName only, generic:true may be specified to provide a dropdown with
  * CSS generic font families.
  * 
  * Note that the editor is often unable to properly handle font styling information defined outside
  * the context of the current editor instance, such as pre-populated HTML.
  * 
  * @param args       OptionalInitial settings for any of the attributes.     
  */
@JSGlobal("dijit._editor.plugins.FontChoice")
@js.native
class FontChoice_ () extends Plugin {
  def this(args: js.Object) = this()
}

