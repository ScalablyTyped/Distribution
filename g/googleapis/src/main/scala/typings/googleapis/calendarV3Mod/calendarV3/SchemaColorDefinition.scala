package typings.googleapis.calendarV3Mod.calendarV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaColorDefinition extends js.Object {
  /**
    * The background color associated with this color definition.
    */
  var background: js.UndefOr[String] = js.native
  /**
    * The foreground color that can be used to write on top of a background
    * with &#39;background&#39; color.
    */
  var foreground: js.UndefOr[String] = js.native
}

object SchemaColorDefinition {
  @scala.inline
  def apply(): SchemaColorDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaColorDefinition]
  }
  @scala.inline
  implicit class SchemaColorDefinitionOps[Self <: SchemaColorDefinition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBackground(value: String): Self = this.set("background", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackground: Self = this.set("background", js.undefined)
    @scala.inline
    def setForeground(value: String): Self = this.set("foreground", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForeground: Self = this.set("foreground", js.undefined)
  }
  
}

