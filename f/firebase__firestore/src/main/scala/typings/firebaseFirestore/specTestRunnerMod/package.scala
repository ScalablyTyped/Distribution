package typings.firebaseFirestore.specTestRunnerMod

import typings.firebaseFirestore.objectValueMod.JsonObject
import typings.firebaseFirestore.queryMod.Query
import typings.firebaseFirestore.specTestRunnerMod.^
import typings.firebaseFirestore.typesMod.TargetId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def parseQuery(querySpec: String): Query = ^.asInstanceOf[js.Dynamic].applyDynamic("parseQuery")(querySpec.asInstanceOf[js.Any]).asInstanceOf[Query]
inline def parseQuery(querySpec: SpecQuery): Query = ^.asInstanceOf[js.Dynamic].applyDynamic("parseQuery")(querySpec.asInstanceOf[js.Any]).asInstanceOf[Query]

inline def runSpec(
  name: String,
  tags: js.Array[String],
  usePersistence: Boolean,
  config: SpecConfig,
  steps: js.Array[SpecStep]
): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("runSpec")(name.asInstanceOf[js.Any], tags.asInstanceOf[js.Any], usePersistence.asInstanceOf[js.Any], config.asInstanceOf[js.Any], steps.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]

type SpecQueryFilter = js.Tuple3[String, String, Any]

type SpecQueryOrderBy = js.Tuple2[String, String]

type SpecUserDelete = String

type SpecUserPatch = js.Tuple2[String, JsonObject[Any]]

type SpecUserSet = js.Tuple2[String, JsonObject[Any]]

type SpecUserUnlisten = js.Tuple2[TargetId, String | SpecQuery]

type SpecWatchAck = js.Array[TargetId]

type SpecWatchCurrent = js.Tuple2[js.Array[TargetId], String]

type SpecWatchReset = js.Array[TargetId]
