package typings
package forgeDashDiLib.forgeDashDiMod.ForgeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a binding map. */
trait IBindingMap
  extends /** Gets a binding by name. */
/* name */ org.scalablytyped.runtime.StringDictionary[js.Array[IBinding]]

object IBindingMap {
  @scala.inline
  def apply(
    StringDictionary: /** Gets a binding by name. */
  /* name */ org.scalablytyped.runtime.StringDictionary[js.Array[IBinding]] = null
  ): IBindingMap = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[IBindingMap]
  }
}

