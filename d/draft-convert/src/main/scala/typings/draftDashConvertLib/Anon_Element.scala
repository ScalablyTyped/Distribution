package typings
package draftDashConvertLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Element
  extends draftDashConvertLib.draftDashConvertMod._Tag {
  var element: reactLib.reactMod.ReactNode
  var empty: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
}

object Anon_Element {
  @scala.inline
  def apply(element: reactLib.reactMod.ReactNode, empty: reactLib.reactMod.ReactNode = null): Anon_Element = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any])
    if (empty != null) __obj.updateDynamic("empty")(empty.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Element]
  }
}

