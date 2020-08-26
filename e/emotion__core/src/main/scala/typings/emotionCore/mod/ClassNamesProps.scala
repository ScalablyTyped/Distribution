package typings.emotionCore.mod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClassNamesProps[Theme] extends js.Object {
  def children(content: ClassNamesContent[Theme]): ReactNode = js.native
}

object ClassNamesProps {
  @scala.inline
  def apply[Theme](children: ClassNamesContent[Theme] => ReactNode): ClassNamesProps[Theme] = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    __obj.asInstanceOf[ClassNamesProps[Theme]]
  }
  @scala.inline
  implicit class ClassNamesPropsOps[Self <: ClassNamesProps[_], Theme] (val x: Self with ClassNamesProps[Theme]) extends AnyVal {
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
    def setChildren(value: ClassNamesContent[Theme] => ReactNode): Self = this.set("children", js.Any.fromFunction1(value))
  }
  
}

