package typings.emberData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AttributesFor[Model /* <: typings.emberData.mod.DS.Model */] = typings.emberData.mod.ModelKeys[Model]
  type ChangedAttributes = org.scalablytyped.runtime.StringDictionary[js.UndefOr[js.Tuple2[js.Any, js.Any]]]
  /**
    The keys from the actual Model class, removing all the keys which come from
    the base class.
    */
  type ModelKeys[Model /* <: typings.emberData.mod.DS.Model */] = typings.std.Exclude[java.lang.String, java.lang.String]
  type RelationshipsFor[Model /* <: typings.emberData.mod.DS.Model */] = typings.emberData.mod.ModelKeys[Model]
}
