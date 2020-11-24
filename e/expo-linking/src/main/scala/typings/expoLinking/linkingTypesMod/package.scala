package typings.expoLinking

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object linkingTypesMod {
  
  type NativeURLListener = js.Function1[/* nativeEvent */ typings.std.MessageEvent[js.Any], scala.Unit]
  
  type QueryParams = org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String]]
  
  type URLListener = js.Function1[/* event */ typings.expoLinking.linkingTypesMod.EventType, scala.Unit]
}
