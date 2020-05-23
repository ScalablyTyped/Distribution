package typings.draftConvert

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ContentStateConverter = js.Function1[/* contentState */ typings.draftJs.mod.ContentState, java.lang.String]
  type EntityKey = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.react.mod.ReactNode
    - typings.draftConvert.anon.Empty
    - typings.draftConvert.anon.Element
  */
  type Tag = typings.draftConvert.mod._Tag | typings.react.mod.ReactNode
  type htmlConverter = js.Function1[/* html */ java.lang.String, typings.draftJs.mod.ContentState]
}
