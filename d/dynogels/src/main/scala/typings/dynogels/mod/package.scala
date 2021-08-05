package typings.dynogels.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def Set(args: js.Any*): js.Any = typings.dynogels.mod.^.asInstanceOf[js.Dynamic].applyDynamic("Set")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]

inline def createTables(callback: js.Function1[/* err */ java.lang.String, scala.Unit]): scala.Unit = typings.dynogels.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createTables")(callback.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
inline def createTables(
  options: org.scalablytyped.runtime.StringDictionary[typings.dynogels.mod.CreateTablesOptions],
  callback: js.Function1[/* err */ java.lang.String, scala.Unit]
): scala.Unit = (typings.dynogels.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createTables")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
inline def createTables(
  options: typings.dynogels.mod.DynogelsGlobalOptions,
  callback: js.Function1[/* err */ java.lang.String, scala.Unit]
): scala.Unit = (typings.dynogels.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createTables")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

inline def define(modelName: java.lang.String, config: typings.dynogels.mod.ModelConfiguration): typings.dynogels.mod.Model = (typings.dynogels.mod.^.asInstanceOf[js.Dynamic].applyDynamic("define")(modelName.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[typings.dynogels.mod.Model]

inline def dynamoDriver(dynamoDB: typings.dynogels.mod.AWS.DynamoDB): typings.dynogels.mod.AWS.DynamoDB = typings.dynogels.mod.^.asInstanceOf[js.Dynamic].applyDynamic("dynamoDriver")(dynamoDB.asInstanceOf[js.Any]).asInstanceOf[typings.dynogels.mod.AWS.DynamoDB]

inline def log: typings.dynogels.mod.Log_ = typings.dynogels.mod.^.asInstanceOf[js.Dynamic].selectDynamic("log").asInstanceOf[typings.dynogels.mod.Log_]
inline def log_=(x: typings.dynogels.mod.Log_): scala.Unit = typings.dynogels.mod.^.asInstanceOf[js.Dynamic].updateDynamic("log")(x.asInstanceOf[js.Any])

inline def reset(): scala.Unit = typings.dynogels.mod.^.asInstanceOf[js.Dynamic].applyDynamic("reset")().asInstanceOf[scala.Unit]

type Document = org.scalablytyped.runtime.StringDictionary[js.Any]

type DynogelsItemCallback = js.Function2[/* err */ typings.std.Error, /* data */ typings.dynogels.mod.Item, scala.Unit]

type QueryFilterChain = typings.dynogels.mod.ExtendedChain[typings.dynogels.mod.Query]

type QueryWhereChain = typings.dynogels.mod.BaseChain[typings.dynogels.mod.Query]

type tableResolve = js.Function0[java.lang.String]
