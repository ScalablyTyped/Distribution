package typings.fridaGum.ObjC

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetailedChooseSpecifier extends js.Object {
  /**
    * Which class to look for instances of. E.g.: `ObjC.classes.UIButton`.
    */
  var `class`: Object = js.native
  /**
    * Whether you’re also interested in subclasses matching the given class selector.
    *
    * The default is to also include subclasses.
    */
  var subclasses: js.UndefOr[Boolean] = js.native
}

object DetailedChooseSpecifier {
  @scala.inline
  def apply(`class`: Object): DetailedChooseSpecifier = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetailedChooseSpecifier]
  }
  @scala.inline
  implicit class DetailedChooseSpecifierOps[Self <: DetailedChooseSpecifier] (val x: Self) extends AnyVal {
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
    def setClass(value: Object): Self = this.set("class", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubclasses(value: Boolean): Self = this.set("subclasses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubclasses: Self = this.set("subclasses", js.undefined)
  }
  
}

