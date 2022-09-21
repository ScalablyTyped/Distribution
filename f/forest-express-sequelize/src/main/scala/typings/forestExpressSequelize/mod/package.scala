package typings.forestExpressSequelize.mod

import typings.express.mod.Application_
import typings.express.mod.NextFunction
import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.forestExpressSequelize.mod.^
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def PUBLIC_ROUTES: js.Array[String] = ^.asInstanceOf[js.Dynamic].selectDynamic("PUBLIC_ROUTES").asInstanceOf[js.Array[String]]

inline def collection(name: String, options: CollectionOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("collection")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def ensureAuthenticated(
  request: Request_[
  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
  Any, 
  Any, 
  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
  Record[String, Any]
],
  response: Response_[Any, Record[String, Any]],
  next: NextFunction
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureAuthenticated")(request.asInstanceOf[js.Any], response.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def init(options: LianaOptions): js.Promise[Application_] = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Application_]]

type SegmentAggregationCreator = js.Function1[/* record */ Any, js.Object]

type SmartActionValuesInjector = js.Function1[/* record */ Any, js.Object]

type SmartFieldSearcher = js.Function2[/* query */ Any, /* search */ String, js.Object]

type SmartFieldValueGetter = js.Function1[/* record */ Any, Any]

type SmartFieldValueSetter = js.Function2[/* record */ Any, /* attributeValue */ Any, js.Object]
