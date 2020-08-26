package typings.fluentuiReactIcons.typesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SvgIconFuncArg[TProps] extends js.Object {
  var classes: StringDictionary[String] = js.native
  var props: TProps = js.native
}

object SvgIconFuncArg {
  @scala.inline
  def apply[TProps](classes: StringDictionary[String], props: TProps): SvgIconFuncArg[TProps] = {
    val __obj = js.Dynamic.literal(classes = classes.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[SvgIconFuncArg[TProps]]
  }
  @scala.inline
  implicit class SvgIconFuncArgOps[Self <: SvgIconFuncArg[_], TProps] (val x: Self with SvgIconFuncArg[TProps]) extends AnyVal {
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
    def setClasses(value: StringDictionary[String]): Self = this.set("classes", value.asInstanceOf[js.Any])
    @scala.inline
    def setProps(value: TProps): Self = this.set("props", value.asInstanceOf[js.Any])
  }
  
}

