package typings.dojo.dojox.mobile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/mobile/_PickerChooser.html
  *
  * This widget chooses a picker class according to the current theme.
  * Imports ValuePicker-based date/time picker when the current theme is "android".
  * Imports SpinWheel-based date/time picker otherwise.
  *
  */
trait _PickerChooser extends js.Object {
  /**
    * Imports a picker class according to the current theme.
    *
    * @param id
    * @param parentRequire
    * @param loaded
    */
  def load(id: js.Any, parentRequire: js.Any, loaded: js.Any): Unit
}

object _PickerChooser {
  @scala.inline
  def apply(load: (js.Any, js.Any, js.Any) => Unit): _PickerChooser = {
    val __obj = js.Dynamic.literal(load = js.Any.fromFunction3(load))
  
    __obj.asInstanceOf[_PickerChooser]
  }
}

