package typings.domutils.legacyMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestElementOpts
  extends /* attributeName */ StringDictionary[js.UndefOr[String | (js.Function1[/* attributeValue */ String, Boolean])]] {
  var tag_contains: js.UndefOr[String | (js.Function1[/* data */ js.UndefOr[String], Boolean])] = js.native
  var tag_name: js.UndefOr[String | (js.Function1[/* name */ String, Boolean])] = js.native
  var tag_type: js.UndefOr[String | (js.Function1[/* name */ String, Boolean])] = js.native
}

object TestElementOpts {
  @scala.inline
  def apply(): TestElementOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestElementOpts]
  }
  @scala.inline
  implicit class TestElementOptsOps[Self <: TestElementOpts] (val x: Self) extends AnyVal {
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
    def setTag_containsFunction1(value: /* data */ js.UndefOr[String] => Boolean): Self = this.set("tag_contains", js.Any.fromFunction1(value))
    @scala.inline
    def setTag_contains(value: String | (js.Function1[/* data */ js.UndefOr[String], Boolean])): Self = this.set("tag_contains", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTag_contains: Self = this.set("tag_contains", js.undefined)
    @scala.inline
    def setTag_nameFunction1(value: /* name */ String => Boolean): Self = this.set("tag_name", js.Any.fromFunction1(value))
    @scala.inline
    def setTag_name(value: String | (js.Function1[/* name */ String, Boolean])): Self = this.set("tag_name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTag_name: Self = this.set("tag_name", js.undefined)
    @scala.inline
    def setTag_typeFunction1(value: /* name */ String => Boolean): Self = this.set("tag_type", js.Any.fromFunction1(value))
    @scala.inline
    def setTag_type(value: String | (js.Function1[/* name */ String, Boolean])): Self = this.set("tag_type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTag_type: Self = this.set("tag_type", js.undefined)
  }
  
}

