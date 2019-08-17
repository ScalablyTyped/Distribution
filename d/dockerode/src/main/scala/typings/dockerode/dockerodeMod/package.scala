package typings.dockerode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object dockerodeMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.dockerode.Anon_Rxbytes

  type Callback[T] = js.Function2[/* error */ js.UndefOr[js.Any], /* result */ js.UndefOr[T], Unit]
  type EndpointsConfig = StringDictionary[EndpointSettings]
  type MountConfig = js.Array[MountSettings]
  type NetworkStats = StringDictionary[Anon_Rxbytes]
  type PluginInspectInfo = PluginInfo
  type PortMap = StringDictionary[js.Array[PortBinding]]
}
