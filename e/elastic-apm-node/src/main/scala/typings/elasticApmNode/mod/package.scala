package typings.elasticApmNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type CaptureErrorCallback = js.Function2[/* err */ typings.std.Error | scala.Null, /* id */ java.lang.String, scala.Unit]

type FilterFn = js.Function1[
/* payload */ typings.elasticApmNode.mod.Payload, 
typings.elasticApmNode.mod.Payload | scala.Boolean | scala.Unit]

type KeyValueConfig = java.lang.String | typings.elasticApmNode.mod.Labels | js.Array[js.Array[typings.elasticApmNode.mod.LabelValue]]

type LabelValue = js.UndefOr[java.lang.String | scala.Double | scala.Boolean | scala.Null]

type Labels = org.scalablytyped.runtime.StringDictionary[typings.elasticApmNode.mod.LabelValue]

type PatchHandler = js.Function3[
/* exports */ js.Any, 
/* agent */ typings.elasticApmNode.mod.Agent, 
/* options */ typings.elasticApmNode.mod.PatchOptions, 
js.Any]

type Payload = org.scalablytyped.runtime.StringDictionary[js.Any]
