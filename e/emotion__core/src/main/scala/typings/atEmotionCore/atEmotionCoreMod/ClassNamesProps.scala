package typings.atEmotionCore.atEmotionCoreMod

import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClassNamesProps[Theme] extends js.Object {
  def children(content: ClassNamesContent[Theme]): ReactNode
}

object ClassNamesProps {
  @scala.inline
  def apply[Theme](children: ClassNamesContent[Theme] => ReactNode): ClassNamesProps[Theme] = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
  
    __obj.asInstanceOf[ClassNamesProps[Theme]]
  }
}

