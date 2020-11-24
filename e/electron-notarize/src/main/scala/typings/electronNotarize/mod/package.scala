package typings.electronNotarize

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type NotarizeOptions = typings.electronNotarize.mod.NotarizeStartOptions
  
  type NotarizeStartOptions = typings.electronNotarize.mod.NotarizeAppOptions with typings.electronNotarize.mod.NotarizeCredentials with typings.electronNotarize.mod.TransporterOptions
  
  type NotarizeWaitOptions = typings.electronNotarize.mod.NotarizeResult with typings.electronNotarize.mod.NotarizeCredentials
}
