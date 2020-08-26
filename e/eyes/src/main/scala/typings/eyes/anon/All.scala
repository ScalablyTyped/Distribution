package typings.eyes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait All extends js.Object {
  /** Overall base style applied to everything */
  var all: js.UndefOr[String] = js.native
  /** Style when printing booleans */
  var bool: js.UndefOr[String] = js.native
  /** Style when printing the keys in object literals, like 'a' in `{a: 1}` */
  var key: js.UndefOr[String] = js.native
  /** Style when printing inspection labels, like 'array' in `array: [1, 2, 3]` */
  var label: js.UndefOr[String] = js.native
  /** Style when printing numbers */
  var number: js.UndefOr[String] = js.native
  /** Style when printing objects which don't have a literal representation, such as functions */
  var other: js.UndefOr[String] = js.native
  /** Style when printing RegExps */
  var regexp: js.UndefOr[String] = js.native
  /** Style when printing `null`, `undefined`, etc. */
  var special: js.UndefOr[String] = js.native
  /** Style when printing strings */
  var string: js.UndefOr[String] = js.native
}

object All {
  @scala.inline
  def apply(): All = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[All]
  }
  @scala.inline
  implicit class AllOps[Self <: All] (val x: Self) extends AnyVal {
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
    def setAll(value: String): Self = this.set("all", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAll: Self = this.set("all", js.undefined)
    @scala.inline
    def setBool(value: String): Self = this.set("bool", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBool: Self = this.set("bool", js.undefined)
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setNumber(value: String): Self = this.set("number", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumber: Self = this.set("number", js.undefined)
    @scala.inline
    def setOther(value: String): Self = this.set("other", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOther: Self = this.set("other", js.undefined)
    @scala.inline
    def setRegexp(value: String): Self = this.set("regexp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegexp: Self = this.set("regexp", js.undefined)
    @scala.inline
    def setSpecial(value: String): Self = this.set("special", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpecial: Self = this.set("special", js.undefined)
    @scala.inline
    def setString(value: String): Self = this.set("string", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteString: Self = this.set("string", js.undefined)
  }
  
}

