package typings.eggCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ContextLoaderBase = typings.eggCore.mod.FileLoaderBase
  
  type PlainObject[T] = org.scalablytyped.runtime.StringDictionary[T]
  
  type Plugins = typings.eggCore.mod.PlainObject[typings.eggCore.mod.PluginInfo]
}
