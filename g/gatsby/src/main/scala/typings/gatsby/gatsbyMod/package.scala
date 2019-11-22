package typings.gatsby

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object gatsbyMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.gatsby.Anon_Done
  import typings.gatsby.gatsbyStrings.end
  import typings.react.reactMod.ReactNode
  import typings.std.Error
  import typings.std.Omit

  type ActionOptions = StringDictionary[js.Any]
  type LogErrorType = js.Function2[/* errorMeta */ String | js.Object, /* error */ js.UndefOr[js.Object], Unit]
  type LogMessageType = js.Function1[/* format */ String, Unit]
  type PluginCallback = js.Function2[/* err */ Error | Null, /* result */ js.UndefOr[js.Any], Unit]
  type ProgressActivityTracker = (Omit[ActivityTracker, end]) with Anon_Done
  type RenderCallback[T] = js.Function1[/* data */ T, ReactNode]
}
