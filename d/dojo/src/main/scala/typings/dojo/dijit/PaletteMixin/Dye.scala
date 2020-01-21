package typings.dojo.dijit.PaletteMixin

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/_PaletteMixin.__Dye.html
  *
  * Interface for the JS Object associated with a palette cell (i.e. DOMNode)
  * 
  * @param alias     
  * @param row     
  * @param col     
  */
@JSGlobal("dijit._PaletteMixin.__Dye")
@js.native
class Dye protected () extends js.Object {
  def this(alias: String, row: js.Any, col: js.Any) = this()
  /**
    * Add cell DOMNode inner structure
    * 
    * @param cell The surrounding cell             
    * @param blankGif URL for blank cell image             
    */
  def fillCell(cell: HTMLElement, blankGif: String): Unit = js.native
  /**
    * Return "value" of cell; meaning of "value" varies by subclass.
    * For example color hex value, emoticon ascii value etc, entity hex value.
    * 
    */
  def getValue(): Unit = js.native
}

