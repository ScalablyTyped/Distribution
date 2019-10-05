package typings.draftDashJs.draftDashJsMod.Draft.Model

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ImmutableData {
  import typings.immutable.immutableMod.OrderedMap
  import typings.immutable.immutableMod.OrderedSet

  type BlockMap = OrderedMap[String, typings.draftDashJs.draftDashJsMod.Draft.Model.ImmutableData.ContentBlock]
  type DraftInlineStyle = OrderedSet[String]
}
