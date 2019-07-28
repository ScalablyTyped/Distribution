package typings.eggDashCore

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object eggDashCoreMod {
  type ContextLoaderBase = FileLoaderBase
  type PlainObject[T] = StringDictionary[T]
  type Plugins = PlainObject[PluginInfo]
}
