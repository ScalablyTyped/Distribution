package typings.dynogels.mod

import org.scalablytyped.runtime.StringDictionary
import typings.dynogels.mod.AWS.DynamoDB
import typings.dynogels.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def Set(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("Set")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]

inline def createTables(callback: js.Function1[/* err */ String, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("createTables")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def createTables(options: StringDictionary[CreateTablesOptions], callback: js.Function1[/* err */ String, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createTables")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def createTables(options: DynogelsGlobalOptions, callback: js.Function1[/* err */ String, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createTables")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def define(modelName: String, config: ModelConfiguration): Model = (^.asInstanceOf[js.Dynamic].applyDynamic("define")(modelName.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Model]

inline def dynamoDriver(dynamoDB: DynamoDB): DynamoDB = ^.asInstanceOf[js.Dynamic].applyDynamic("dynamoDriver")(dynamoDB.asInstanceOf[js.Any]).asInstanceOf[DynamoDB]

inline def log: Log_ = ^.asInstanceOf[js.Dynamic].selectDynamic("log").asInstanceOf[Log_]
inline def log_=(x: Log_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("log")(x.asInstanceOf[js.Any])

inline def reset(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reset")().asInstanceOf[Unit]

type Document = StringDictionary[Any]

type DynogelsItemCallback = js.Function2[/* err */ js.Error, /* data */ Item, Unit]

type QueryFilterChain = ExtendedChain[Query]

type QueryWhereChain = BaseChain[Query]

type tableResolve = js.Function0[String]
