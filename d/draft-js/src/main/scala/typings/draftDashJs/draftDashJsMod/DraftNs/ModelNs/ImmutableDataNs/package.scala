package typings.draftDashJs.draftDashJsMod.DraftNs.ModelNs

import typings.immutable.immutableMod.OrderedMap
import typings.immutable.immutableMod.OrderedSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ImmutableDataNs {
  type BlockMap = OrderedMap[
    String, 
    typings.draftDashJs.draftDashJsMod.DraftNs.ModelNs.ImmutableDataNs.ContentBlock
  ]
  type DraftInlineStyle = OrderedSet[String]
}
