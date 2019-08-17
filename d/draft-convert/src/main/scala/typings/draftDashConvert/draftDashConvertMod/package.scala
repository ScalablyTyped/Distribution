package typings.draftDashConvert

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object draftDashConvertMod {
  import typings.draftDashJs.draftDashJsMod.ContentState
  import typings.react.reactMod.ReactNode

  type ContentStateConverter = js.Function1[/* contentState */ ContentState, String]
  type EntityKey = String
  /* Rewritten from type alias, can be one of: 
    - typings.react.reactMod.ReactNode
    - typings.draftDashConvert.Anon_Empty
    - typings.draftDashConvert.Anon_Element
  */
  type Tag = _Tag | ReactNode
  type htmlConverter = js.Function1[/* html */ String, ContentState]
}
