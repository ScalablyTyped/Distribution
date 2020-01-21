package typings.dojo.dijit.ColorPalette

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/ColorPalette._Color.html
  *
  * Object associated with each cell in a ColorPalette palette.
  * Implements dijit/Dye.
  * 
  * @param alias English name of the color.     
  * @param row Vertical position in grid.     
  * @param col     
  * @param title Localized name of the color.     
  */
@JSGlobal("dijit.ColorPalette._Color")
@js.native
class Color protected ()
  extends typings.dojo.dojo.base.Color {
  def this(alias: String, row: Double, col: js.Any, title: String) = this()
  /**
    * 
    */
  var hcTemplate: String = js.native
  /**
    * 
    */
  var template: String = js.native
  /**
    * 
    * @param cell             
    * @param blankGif             
    */
  def fillCell(cell: HTMLElement, blankGif: String): Unit = js.native
  /**
    * Note that although dijit._Color is initialized with a value like "white" getValue() always
    * returns a hex value
    * 
    */
  def getValue(): js.Any = js.native
}

