package typings.dojo

import org.scalablytyped.runtime.Instantiable0
import typings.dojo.dijit.form.NumberTextBox.Constraints
import typings.dojo.dijit.form.NumberTextBox.Mixin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofNumberTextBox extends js.Object {
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dijit/form/NumberTextBox.Mixin.html
    *
    * A mixin for all number textboxes
    * 
    */
  var Mixin: Instantiable0[typings.dojo.dijit.form.NumberTextBox.Mixin]
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dijit/form/NumberTextBox.__Constraints.html
    *
    * Specifies both the rules on valid/invalid values (minimum, maximum,
    * number of required decimal places), and also formatting options for
    * displaying the value when the field is not focused.
    * 
    */
  var __Constraints: Instantiable0[Constraints]
}

object TypeofNumberTextBox {
  @scala.inline
  def apply(Mixin: Instantiable0[Mixin], __Constraints: Instantiable0[Constraints]): TypeofNumberTextBox = {
    val __obj = js.Dynamic.literal(Mixin = Mixin.asInstanceOf[js.Any], __Constraints = __Constraints.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofNumberTextBox]
  }
}

