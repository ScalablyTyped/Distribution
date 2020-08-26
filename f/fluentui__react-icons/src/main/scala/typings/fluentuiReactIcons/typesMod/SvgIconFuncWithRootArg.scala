package typings.fluentuiReactIcons.typesMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.HTMLAttributes
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SvgIconFuncWithRootArg[TProps] extends js.Object {
  var classes: StringDictionary[String] = js.native
  var processedRootProps: HTMLAttributes[HTMLElement] = js.native
  var props: TProps = js.native
}

object SvgIconFuncWithRootArg {
  @scala.inline
  def apply[TProps](classes: StringDictionary[String], processedRootProps: HTMLAttributes[HTMLElement], props: TProps): SvgIconFuncWithRootArg[TProps] = {
    val __obj = js.Dynamic.literal(classes = classes.asInstanceOf[js.Any], processedRootProps = processedRootProps.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[SvgIconFuncWithRootArg[TProps]]
  }
  @scala.inline
  implicit class SvgIconFuncWithRootArgOps[Self <: SvgIconFuncWithRootArg[_], TProps] (val x: Self with SvgIconFuncWithRootArg[TProps]) extends AnyVal {
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
    def setProcessedRootProps(value: HTMLAttributes[HTMLElement]): Self = this.set("processedRootProps", value.asInstanceOf[js.Any])
    @scala.inline
    def setProps(value: TProps): Self = this.set("props", value.asInstanceOf[js.Any])
  }
  
}

