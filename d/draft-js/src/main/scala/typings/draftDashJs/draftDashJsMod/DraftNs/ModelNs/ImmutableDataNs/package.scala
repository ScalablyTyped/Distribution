package typings.draftDashJs.draftDashJsMod.DraftNs.ModelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ImmutableDataNs {
  import typings.immutable.immutableMod.OrderedMap
  import typings.immutable.immutableMod.OrderedSet

  type BlockMap = OrderedMap[
    String, 
    typings.draftDashJs.draftDashJsMod.DraftNs.ModelNs.ImmutableDataNs.ContentBlock
  ]
  type DraftInlineStyle = OrderedSet[String]
}
