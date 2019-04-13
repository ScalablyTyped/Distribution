package typings
package atEmotionCoreLib.atEmotionCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClassNamesProps[Theme] extends js.Object {
  def children(content: ClassNamesContent[Theme]): reactLib.reactMod.ReactNode
}

object ClassNamesProps {
  @scala.inline
  def apply[Theme](children: ClassNamesContent[Theme] => reactLib.reactMod.ReactNode): ClassNamesProps[Theme] = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
  
    __obj.asInstanceOf[ClassNamesProps[Theme]]
  }
}

