package typings.emberDashData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object emberDashDataMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.emberDashData.ModelKeys
  import typings.emberDashData.emberDashDataMod.DS.Model

  type AttributesFor[Model /* <: Model */] = ModelKeys[Model]
  type ChangedAttributes = StringDictionary[js.UndefOr[js.Tuple2[js.Any, js.Any]]]
  type RelationshipsFor[Model /* <: Model */] = ModelKeys[Model]
}
