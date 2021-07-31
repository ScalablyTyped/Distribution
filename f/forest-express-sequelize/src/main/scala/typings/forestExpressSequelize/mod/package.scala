package typings.forestExpressSequelize.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


@scala.inline
def PUBLIC_ROUTES: js.Array[java.lang.String] = typings.forestExpressSequelize.mod.^.asInstanceOf[js.Dynamic].selectDynamic("PUBLIC_ROUTES").asInstanceOf[js.Array[java.lang.String]]

@scala.inline
def collection(name: java.lang.String, options: typings.forestExpressSequelize.mod.CollectionOptions): scala.Unit = (typings.forestExpressSequelize.mod.^.asInstanceOf[js.Dynamic].applyDynamic("collection")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

type SegmentAggregationCreator = js.Function1[/* record */ js.Any, js.Object]

type SmartActionValuesInjector = js.Function1[/* record */ js.Any, js.Object]

type SmartFieldSearcher = js.Function2[/* query */ js.Any, /* search */ java.lang.String, js.Object]

type SmartFieldValueGetter = js.Function1[/* record */ js.Any, js.Any]

type SmartFieldValueSetter = js.Function2[/* record */ js.Any, /* attributeValue */ js.Any, js.Object]
