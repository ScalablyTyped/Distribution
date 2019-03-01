package typings
package giraffeLib.GiraffeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewMap[TModel /* <: Model */]
  extends /* cid */ org.scalablytyped.runtime.StringDictionary[View[TModel]]

object ViewMap {
  @scala.inline
  def apply[TModel /* <: Model */](StringDictionary: /* cid */ org.scalablytyped.runtime.StringDictionary[View[TModel]] = null): ViewMap[TModel] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[ViewMap[TModel]]
  }
}

