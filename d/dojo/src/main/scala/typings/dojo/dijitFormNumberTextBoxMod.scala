package typings.dojo

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.TopLevel
import typings.dojo.dijit.form.NumberTextBox
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dijit/form/NumberTextBox", JSImport.Namespace)
@js.native
object dijitFormNumberTextBoxMod
  extends TopLevel[
      TypeofNumberTextBox with (Instantiable2[
        js.UndefOr[/* params */ js.Object], 
        js.UndefOr[/* srcNodeRef */ HTMLElement], 
        NumberTextBox
      ])
    ] {
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dijit/form/NumberTextBox.Mixin.html
    *
    * A mixin for all number textboxes
    * 
    */
  @js.native
  class Mixin ()
    extends typings.dojo.dijit.form.NumberTextBox.Mixin
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dijit/form/NumberTextBox.__Constraints.html
    *
    * Specifies both the rules on valid/invalid values (minimum, maximum,
    * number of required decimal places), and also formatting options for
    * displaying the value when the field is not focused.
    * 
    */
  @js.native
  class __Constraints ()
    extends typings.dojo.dijit.form.NumberTextBox.__Constraints
  
}

