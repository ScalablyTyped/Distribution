package typings.dojo.dojox.grid.cells

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/grid/cells/dijit.html
  *
  *
  */
trait dijit_ extends js.Object {
  /**
    *
    */
  def CheckBox(): Unit
  /**
    *
    */
  def ComboBox(): Unit
  /**
    *
    */
  def DateTextBox(): Unit
  /**
    *
    */
  def Editor(): Unit
}

object dijit_ {
  @scala.inline
  def apply(CheckBox: () => Unit, ComboBox: () => Unit, DateTextBox: () => Unit, Editor: () => Unit): dijit_ = {
    val __obj = js.Dynamic.literal(CheckBox = js.Any.fromFunction0(CheckBox), ComboBox = js.Any.fromFunction0(ComboBox), DateTextBox = js.Any.fromFunction0(DateTextBox), Editor = js.Any.fromFunction0(Editor))
    __obj.asInstanceOf[dijit_]
  }
}

