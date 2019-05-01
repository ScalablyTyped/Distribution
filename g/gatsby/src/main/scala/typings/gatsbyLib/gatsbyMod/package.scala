package typings
package gatsbyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object gatsbyMod {
  type ActionOptions = org.scalablytyped.runtime.StringDictionary[js.Any]
  type PluginCallback = js.Function2[/* err */ stdLib.Error | scala.Null, /* result */ js.UndefOr[js.Any], scala.Unit]
  type RenderCallback = js.Function1[/* data */ js.Any, reactLib.reactMod.ReactNode]
  type logMessageType = js.Function2[/* format */ java.lang.String, /* repeated */ js.Any, scala.Unit]
}
