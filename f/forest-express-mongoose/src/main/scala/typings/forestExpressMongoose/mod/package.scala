package typings.forestExpressMongoose

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type SegmentAggregationCreator = js.Function1[/* record */ js.Any, js.Object]
  
  type SmartActionValuesInjector = js.Function1[/* record */ js.Any, js.Object]
  
  type SmartFieldSearcher = js.Function2[/* query */ js.Any, /* search */ java.lang.String, js.Object]
  
  type SmartFieldValueGetter = js.Function1[/* record */ js.Any, js.Any]
  
  type SmartFieldValueSetter = js.Function2[/* record */ js.Any, /* attributeValue */ js.Any, js.Object]
}
