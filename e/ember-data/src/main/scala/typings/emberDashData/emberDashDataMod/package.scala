package typings.emberDashData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object emberDashDataMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.emberDashData.emberDashDataMod.DS.Model
  import typings.std.Exclude

  type AttributesFor[Model /* <: Model */] = ModelKeys[Model]
  type ChangedAttributes = StringDictionary[js.UndefOr[js.Tuple2[js.Any, js.Any]]]
  /**
    The keys from the actual Model class, removing all the keys which come from
    the base class.
    */
  type ModelKeys[Model /* <: Model */] = Exclude[String, String]
  type RelationshipsFor[Model /* <: Model */] = ModelKeys[Model]
}
