package typings.atFirebaseFirestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distTestUnitSpecsSpecUnderscoreTestUnderscoreRunnerMod {
  import typings.atFirebaseFirestore.distSrcCoreTypesMod.TargetId
  import typings.atFirebaseFirestore.distSrcModelFieldUnderscoreValueMod.JsonObject

  type SpecQueryFilter = js.Tuple3[String, String, js.Any]
  type SpecQueryOrderBy = js.Tuple2[String, String]
  type SpecUserDelete = String
  type SpecUserListen = js.Tuple2[TargetId, String | SpecQuery]
  type SpecUserPatch = js.Tuple2[String, JsonObject[js.Any]]
  type SpecUserSet = js.Tuple2[String, JsonObject[js.Any]]
  type SpecUserUnlisten = js.Tuple2[TargetId, String | SpecQuery]
  type SpecWatchAck = js.Array[TargetId]
  type SpecWatchCurrent = js.Tuple2[js.Array[TargetId], String]
  type SpecWatchReset = js.Array[TargetId]
}
