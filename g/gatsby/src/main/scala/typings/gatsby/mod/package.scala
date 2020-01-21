package typings.gatsby

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ActionOptions = org.scalablytyped.runtime.StringDictionary[js.Any]
  type LogErrorType = js.Function2[
    /* errorMeta */ java.lang.String | js.Object, 
    /* error */ js.UndefOr[js.Object], 
    scala.Unit
  ]
  type LogMessageType = js.Function1[/* format */ java.lang.String, scala.Unit]
  type PluginCallback = js.Function2[
    /* err */ typings.std.Error | scala.Null, 
    /* result */ js.UndefOr[js.Any], 
    scala.Unit
  ]
  type ProgressActivityTracker = (typings.std.Omit[typings.gatsby.mod.ActivityTracker, typings.gatsby.gatsbyStrings.end]) with typings.gatsby.AnonDone
  type ReactProps[T /* <: typings.std.Element */] = typings.react.mod.DetailedHTMLProps[typings.react.mod.HTMLAttributes[T], T]
  type RenderCallback[T] = js.Function1[/* data */ T, typings.react.mod.ReactNode]
}
