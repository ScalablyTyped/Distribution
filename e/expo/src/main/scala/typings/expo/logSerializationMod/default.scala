package typings.expo.logSerializationMod

import typings.expo.remoteLoggingMod.LogLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("expo/build/logs/LogSerialization", JSImport.Default)
@js.native
object default extends js.Object {
  
  var serializeLogDataAsync: js.Function2[/* data */ js.Array[_], /* level */ LogLevel, js.Promise[SerializedData]] = js.native
}
