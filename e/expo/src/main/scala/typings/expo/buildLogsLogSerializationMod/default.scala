package typings.expo.buildLogsLogSerializationMod

import typings.expo.buildLogsRemoteLoggingMod.LogLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo/build/logs/LogSerialization", JSImport.Default)
@js.native
object default extends js.Object {
  var serializeLogDataAsync: js.Function2[/* data */ js.Array[_], /* level */ LogLevel, js.Promise[SerializedData]] = js.native
}

