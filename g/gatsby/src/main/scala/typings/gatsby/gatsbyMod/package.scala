package typings.gatsby

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object gatsbyMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.react.reactMod.ReactNode
  import typings.std.Error

  type ActionOptions = StringDictionary[js.Any]
  type PluginCallback = js.Function2[/* err */ Error | Null, /* result */ js.UndefOr[js.Any], Unit]
  type RenderCallback[T] = js.Function1[/* data */ T, ReactNode]
  type logErrorType = js.Function2[/* message */ String, /* error */ js.UndefOr[Error], Unit]
  type logMessageType = js.Function2[/* format */ String, /* repeated */ js.Any, Unit]
}
