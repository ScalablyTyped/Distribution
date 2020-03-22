package typings.expo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object linkingTypesMod {
  type NativeURLListener = js.Function1[/* nativeEvent */ typings.std.MessageEvent, scala.Unit]
  type QueryParams = org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String]]
  type URLListener = js.Function1[/* event */ typings.expo.linkingTypesMod.EventType, scala.Unit]
}
