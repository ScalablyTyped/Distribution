package typings.draftDashJs.draftDashJsMod.Draft.Model

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ImmutableData {
  import typings.immutable.Immutable.OrderedMap
  import typings.immutable.Immutable.OrderedSet

  type BlockMap = OrderedMap[String, typings.draftDashJs.draftDashJsMod.Draft.Model.ImmutableData.ContentBlock]
  type DraftInlineStyle = OrderedSet[String]
}
