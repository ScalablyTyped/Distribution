package typings.dockerode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Callback[T] = js.Function2[/* error */ js.UndefOr[js.Any], /* result */ js.UndefOr[T], scala.Unit]
  type EndpointsConfig = org.scalablytyped.runtime.StringDictionary[typings.dockerode.mod.EndpointSettings]
  type MountConfig = js.Array[typings.dockerode.mod.MountSettings]
  type NetworkStats = org.scalablytyped.runtime.StringDictionary[typings.dockerode.anon.Rxbytes]
  type PluginInspectInfo = typings.dockerode.mod.PluginInfo
  type PortMap = org.scalablytyped.runtime.StringDictionary[js.Array[typings.dockerode.mod.PortBinding]]
}
