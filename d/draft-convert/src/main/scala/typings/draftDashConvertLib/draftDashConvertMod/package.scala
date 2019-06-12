package typings
package draftDashConvertLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object draftDashConvertMod {
  type ContentStateConverter = js.Function1[/* contentState */ draftDashJsLib.draftDashJsMod.ContentState, java.lang.String]
  type EntityKey = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - reactLib.reactMod.ReactNode
    - draftDashConvertLib.Anon_Empty
    - draftDashConvertLib.Anon_Element
  */
  type Tag = _Tag | reactLib.reactMod.ReactNode
  type htmlConverter = js.Function1[/* html */ java.lang.String, draftDashJsLib.draftDashJsMod.ContentState]
}
