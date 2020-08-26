package typings.estree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImportDefaultSpecifier
  extends BaseModuleSpecifier
     with ModuleSpecifier {
  @JSName("type")
  var type_ImportDefaultSpecifier: typings.estree.estreeStrings.ImportDefaultSpecifier = js.native
}

object ImportDefaultSpecifier {
  @scala.inline
  def apply(local: Identifier, `type`: typings.estree.estreeStrings.ImportDefaultSpecifier): ImportDefaultSpecifier = {
    val __obj = js.Dynamic.literal(local = local.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportDefaultSpecifier]
  }
  @scala.inline
  implicit class ImportDefaultSpecifierOps[Self <: ImportDefaultSpecifier] (val x: Self) extends AnyVal {
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
    def setType(value: typings.estree.estreeStrings.ImportDefaultSpecifier): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

