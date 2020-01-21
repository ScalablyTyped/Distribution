package typings.firebaseFirestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object specTestRunnerMod {
  type SpecQueryFilter = js.Tuple3[java.lang.String, java.lang.String, js.Any]
  type SpecQueryOrderBy = js.Tuple2[java.lang.String, java.lang.String]
  type SpecUserDelete = java.lang.String
  type SpecUserListen = js.Tuple2[
    typings.firebaseFirestore.typesMod.TargetId, 
    java.lang.String | typings.firebaseFirestore.specTestRunnerMod.SpecQuery
  ]
  type SpecUserPatch = js.Tuple2[java.lang.String, typings.firebaseFirestore.modelFieldValueMod.JsonObject[js.Any]]
  type SpecUserSet = js.Tuple2[java.lang.String, typings.firebaseFirestore.modelFieldValueMod.JsonObject[js.Any]]
  type SpecUserUnlisten = js.Tuple2[
    typings.firebaseFirestore.typesMod.TargetId, 
    java.lang.String | typings.firebaseFirestore.specTestRunnerMod.SpecQuery
  ]
  type SpecWatchAck = js.Array[typings.firebaseFirestore.typesMod.TargetId]
  type SpecWatchCurrent = js.Tuple2[js.Array[typings.firebaseFirestore.typesMod.TargetId], java.lang.String]
  type SpecWatchReset = js.Array[typings.firebaseFirestore.typesMod.TargetId]
}
