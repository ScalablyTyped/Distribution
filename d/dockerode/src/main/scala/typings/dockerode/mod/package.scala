package typings.dockerode.mod

import org.scalablytyped.runtime.StringDictionary
import typings.dockerode.anon.Endpointid
import typings.dockerode.anon.Password
import typings.dockerode.dockerodeStrings.cfssl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type Callback[T] = js.Function2[/* error */ js.UndefOr[Any], /* result */ js.UndefOr[T], Unit]

type Duration = Double

type EndpointsConfig = StringDictionary[EndpointSettings]

type ExternalCAProtocol = cfssl | String

type MountConfig = js.Array[MountSettings]

type NetworkStats = StringDictionary[Endpointid]

type PluginInspectInfo = PluginInfo

type PortMap = StringDictionary[js.Array[PortBinding]]

type RegistryConfig = StringDictionary[Password]
