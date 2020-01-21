package typings.dojo.dijit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/_PaletteMixin.html
  *
  * A keyboard accessible palette, for picking a color/emoticon/etc.
  * A mixin for a grid showing various entities, so the user can pick a certain entity.
  * 
  */
@JSGlobal("dijit._PaletteMixin")
@js.native
class PaletteMixin_ () extends CssStateMixin {
  /**
    * CSS class applied to each cell in the palette
    * 
    */
  var cellClass: String = js.native
  /**
    * Number of milliseconds before a held key or button becomes typematic
    * 
    */
  var defaultTimeout: Double = js.native
  /**
    * Constructor for Object created for each cell of the palette.
    * dyeClass should implement the dijit/_PaletteMixin.__Dye interface.
    * 
    */
  var dyeClass: js.Object = js.native
  /**
    * Widget tab index.
    * 
    */
  var tabIndex: String = js.native
  /**
    * Fraction of time used to change the typematic timer between events
    * 1.0 means that each typematic event fires at defaultTimeout intervals
    * Less than 1.0 means that each typematic event fires at an increasing faster rate
    * 
    */
  var timeoutChangeRate: Double = js.native
  /**
    * Currently selected color/emoticon/etc.
    * 
    */
  var value: String = js.native
  /**
    * Focus this widget.  Puts focus on the most recently focused cell.
    * 
    */
  def focus(): Unit = js.native
  /**
    * Callback when a cell is selected.
    * 
    * @param value Value corresponding to cell.             
    */
  def onChange(value: String): Unit = js.native
  /**
    * 
    */
  def postCreate(): Unit = js.native
}

