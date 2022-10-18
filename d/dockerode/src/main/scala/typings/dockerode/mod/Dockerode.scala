package typings.dockerode.mod

import typings.dockerode.anon.Volumes
import typings.node.NodeJS.ReadableStream
import typings.node.NodeJS.WritableStream
import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dockerode extends StObject {
  
  def buildImage(file: String): js.Promise[ReadableStream] = js.native
  def buildImage(file: String, callback: Callback[ReadableStream]): Unit = js.native
  def buildImage(file: String, options: ImageBuildOptions): js.Promise[ReadableStream] = js.native
  def buildImage(file: String, options: ImageBuildOptions, callback: Callback[ReadableStream]): Unit = js.native
  def buildImage(file: ImageBuildContext): js.Promise[ReadableStream] = js.native
  def buildImage(file: ImageBuildContext, callback: Callback[ReadableStream]): Unit = js.native
  def buildImage(file: ImageBuildContext, options: ImageBuildOptions): js.Promise[ReadableStream] = js.native
  def buildImage(file: ImageBuildContext, options: ImageBuildOptions, callback: Callback[ReadableStream]): Unit = js.native
  def buildImage(file: ReadableStream): js.Promise[ReadableStream] = js.native
  def buildImage(file: ReadableStream, callback: Callback[ReadableStream]): Unit = js.native
  def buildImage(file: ReadableStream, options: ImageBuildOptions): js.Promise[ReadableStream] = js.native
  def buildImage(file: ReadableStream, options: ImageBuildOptions, callback: Callback[ReadableStream]): Unit = js.native
  
  def checkAuth(options: Any): js.Promise[Any] = js.native
  def checkAuth(options: Any, callback: Callback[Any]): Unit = js.native
  
  def createConfig(options: js.Object): js.Promise[Any] = js.native
  def createConfig(options: js.Object, callback: Callback[Any]): Unit = js.native
  
  def createContainer(options: ContainerCreateOptions): js.Promise[Container] = js.native
  def createContainer(options: ContainerCreateOptions, callback: Callback[Container]): Unit = js.native
  
  def createImage(auth: Any, options: js.Object): js.Promise[ReadableStream] = js.native
  def createImage(auth: Any, options: js.Object, callback: Callback[ReadableStream]): Unit = js.native
  def createImage(options: js.Object): js.Promise[ReadableStream] = js.native
  def createImage(options: js.Object, callback: Callback[ReadableStream]): Unit = js.native
  
  def createNetwork(options: NetworkCreateOptions): js.Promise[Network] = js.native
  def createNetwork(options: NetworkCreateOptions, callback: Callback[Network]): Unit = js.native
  
  def createPlugin(options: js.Object): js.Promise[Any] = js.native
  def createPlugin(options: js.Object, callback: Callback[Any]): Unit = js.native
  
  def createSecret(options: js.Object): js.Promise[Any] = js.native
  def createSecret(options: js.Object, callback: Callback[Any]): Unit = js.native
  
  def createService(auth: AuthConfig, options: ServiceSpec): js.Promise[ServiceCreateResponse] = js.native
  def createService(options: CreateServiceOptions): js.Promise[ServiceCreateResponse] = js.native
  def createService(options: CreateServiceOptions, callback: Callback[ServiceCreateResponse]): Unit = js.native
  
  def createVolume(): js.Promise[VolumeCreateResponse] = js.native
  def createVolume(callback: Callback[Volume]): Unit = js.native
  def createVolume(options: VolumeCreateOptions): js.Promise[VolumeCreateResponse] = js.native
  def createVolume(options: VolumeCreateOptions, callback: Callback[Volume]): Unit = js.native
  
  def df(): js.Promise[Any] = js.native
  def df(callback: Callback[Any]): Unit = js.native
  
  def getConfig(id: String): Config = js.native
  
  def getContainer(id: String): Container = js.native
  
  def getEvents(): js.Promise[ReadableStream] = js.native
  def getEvents(callback: Callback[ReadableStream]): Unit = js.native
  def getEvents(options: GetEventsOptions): js.Promise[ReadableStream] = js.native
  def getEvents(options: GetEventsOptions, callback: Callback[ReadableStream]): Unit = js.native
  
  def getExec(id: String): Exec = js.native
  
  def getImage(name: String): Image = js.native
  
  def getNetwork(id: String): Network = js.native
  
  def getNode(id: String): Node = js.native
  
  def getPlugin(name: String, remote: Any): Plugin = js.native
  
  def getSecret(id: String): Secret = js.native
  
  def getService(id: String): Service = js.native
  
  def getTask(id: String): Task = js.native
  
  def getVolume(name: String): Volume = js.native
  
  def importImage(file: String): js.Promise[ReadableStream] = js.native
  def importImage(file: String, callback: Callback[ReadableStream]): Unit = js.native
  def importImage(file: String, options: js.Object): js.Promise[ReadableStream] = js.native
  def importImage(file: String, options: js.Object, callback: Callback[ReadableStream]): Unit = js.native
  def importImage(file: ReadableStream): js.Promise[ReadableStream] = js.native
  def importImage(file: ReadableStream, callback: Callback[ReadableStream]): Unit = js.native
  def importImage(file: ReadableStream, options: js.Object): js.Promise[ReadableStream] = js.native
  def importImage(file: ReadableStream, options: js.Object, callback: Callback[ReadableStream]): Unit = js.native
  
  def info(): js.Promise[Any] = js.native
  def info(callback: Callback[Any]): Unit = js.native
  
  def listConfigs(): js.Promise[js.Array[ConfigInfo]] = js.native
  def listConfigs(callback: Callback[js.Array[ConfigInfo]]): Unit = js.native
  def listConfigs(options: js.Object): js.Promise[js.Array[ConfigInfo]] = js.native
  def listConfigs(options: js.Object, callback: Callback[js.Array[ConfigInfo]]): Unit = js.native
  
  def listContainers(): js.Promise[js.Array[ContainerInfo]] = js.native
  def listContainers(callback: Callback[js.Array[ContainerInfo]]): Unit = js.native
  def listContainers(options: js.Object): js.Promise[js.Array[ContainerInfo]] = js.native
  def listContainers(options: js.Object, callback: Callback[js.Array[ContainerInfo]]): Unit = js.native
  
  def listImages(): js.Promise[js.Array[ImageInfo]] = js.native
  def listImages(callback: Callback[js.Array[ImageInfo]]): Unit = js.native
  def listImages(options: ListImagesOptions): js.Promise[js.Array[ImageInfo]] = js.native
  def listImages(options: ListImagesOptions, callback: Callback[js.Array[ImageInfo]]): Unit = js.native
  
  def listNetworks(): js.Promise[js.Array[NetworkInspectInfo]] = js.native
  def listNetworks(callback: Callback[js.Array[NetworkInspectInfo]]): Unit = js.native
  def listNetworks(options: js.Object): js.Promise[js.Array[NetworkInspectInfo]] = js.native
  def listNetworks(options: js.Object, callback: Callback[js.Array[NetworkInspectInfo]]): Unit = js.native
  
  def listNodes(): js.Promise[js.Array[Any]] = js.native
  def listNodes(callback: Callback[js.Array[Any]]): Unit = js.native
  def listNodes(options: js.Object): js.Promise[js.Array[Any]] = js.native
  def listNodes(options: js.Object, callback: Callback[js.Array[Any]]): Unit = js.native
  
  def listPlugins(): js.Promise[js.Array[PluginInfo]] = js.native
  def listPlugins(callback: Callback[js.Array[PluginInfo]]): Unit = js.native
  def listPlugins(options: js.Object): js.Promise[js.Array[PluginInfo]] = js.native
  def listPlugins(options: js.Object, callback: Callback[js.Array[PluginInfo]]): Unit = js.native
  
  def listSecrets(): js.Promise[js.Array[Secret]] = js.native
  def listSecrets(callback: Callback[js.Array[Secret]]): Unit = js.native
  def listSecrets(options: js.Object): js.Promise[js.Array[Secret]] = js.native
  def listSecrets(options: js.Object, callback: Callback[js.Array[Secret]]): Unit = js.native
  
  def listServices(): js.Promise[js.Array[Service]] = js.native
  def listServices(callback: Callback[js.Array[Service]]): Unit = js.native
  def listServices(options: ServiceListOptions): js.Promise[js.Array[Service]] = js.native
  def listServices(options: ServiceListOptions, callback: Callback[js.Array[Service]]): Unit = js.native
  
  def listTasks(): js.Promise[js.Array[Any]] = js.native
  def listTasks(callback: Callback[js.Array[Any]]): Unit = js.native
  def listTasks(options: js.Object): js.Promise[js.Array[Any]] = js.native
  def listTasks(options: js.Object, callback: Callback[js.Array[Any]]): Unit = js.native
  
  def listVolumes(): js.Promise[Volumes] = js.native
  def listVolumes(callback: Callback[Volumes]): Unit = js.native
  def listVolumes(options: js.Object): js.Promise[Volumes] = js.native
  def listVolumes(options: js.Object, callback: Callback[Volumes]): Unit = js.native
  
  def loadImage(file: String): js.Promise[ReadableStream] = js.native
  def loadImage(file: String, callback: Callback[ReadableStream]): Unit = js.native
  def loadImage(file: String, options: js.Object): js.Promise[ReadableStream] = js.native
  def loadImage(file: String, options: js.Object, callback: Callback[ReadableStream]): Unit = js.native
  def loadImage(file: ReadableStream): js.Promise[ReadableStream] = js.native
  def loadImage(file: ReadableStream, callback: Callback[ReadableStream]): Unit = js.native
  def loadImage(file: ReadableStream, options: js.Object): js.Promise[ReadableStream] = js.native
  def loadImage(file: ReadableStream, options: js.Object, callback: Callback[ReadableStream]): Unit = js.native
  
  var modem: typings.dockerModem.mod.^ = js.native
  
  def ping(): js.Promise[Any] = js.native
  def ping(callback: Callback[Any]): Unit = js.native
  
  def pruneContainers(): js.Promise[PruneContainersInfo] = js.native
  def pruneContainers(callback: Callback[PruneContainersInfo]): Unit = js.native
  def pruneContainers(options: js.Object): js.Promise[PruneContainersInfo] = js.native
  def pruneContainers(options: js.Object, callback: Callback[PruneContainersInfo]): Unit = js.native
  
  def pruneImages(): js.Promise[PruneImagesInfo] = js.native
  def pruneImages(callback: Callback[PruneImagesInfo]): Unit = js.native
  def pruneImages(options: js.Object): js.Promise[PruneImagesInfo] = js.native
  def pruneImages(options: js.Object, callback: Callback[PruneImagesInfo]): Unit = js.native
  
  def pruneNetworks(): js.Promise[PruneNetworksInfo] = js.native
  def pruneNetworks(callback: Callback[PruneNetworksInfo]): Unit = js.native
  def pruneNetworks(options: js.Object): js.Promise[PruneNetworksInfo] = js.native
  def pruneNetworks(options: js.Object, callback: Callback[PruneNetworksInfo]): Unit = js.native
  
  def pruneVolumes(): js.Promise[PruneVolumesInfo] = js.native
  def pruneVolumes(callback: Callback[PruneVolumesInfo]): Unit = js.native
  def pruneVolumes(options: js.Object): js.Promise[PruneVolumesInfo] = js.native
  def pruneVolumes(options: js.Object, callback: Callback[PruneVolumesInfo]): Unit = js.native
  
  def pull(repoTag: String): js.Promise[Any] = js.native
  def pull(repoTag: String, options: js.Object): js.Promise[Any] = js.native
  def pull(repoTag: String, options: js.Object, callback: Callback[Any]): Image = js.native
  def pull(repoTag: String, options: js.Object, callback: Callback[Any], auth: js.Object): Image = js.native
  
  def run(image: String, cmd: js.Array[String], outputStream: js.Array[WritableStream]): js.Promise[Any] = js.native
  def run(
    image: String,
    cmd: js.Array[String],
    outputStream: js.Array[WritableStream],
    callback: Callback[Any]
  ): EventEmitter = js.native
  def run(
    image: String,
    cmd: js.Array[String],
    outputStream: js.Array[WritableStream],
    createOptions: js.Object
  ): js.Promise[Any] = js.native
  def run(
    image: String,
    cmd: js.Array[String],
    outputStream: js.Array[WritableStream],
    createOptions: js.Object,
    startOptions: js.Object
  ): js.Promise[Any] = js.native
  def run(
    image: String,
    cmd: js.Array[String],
    outputStream: js.Array[WritableStream],
    createOptions: js.Object,
    startOptions: js.Object,
    callback: Callback[Any]
  ): EventEmitter = js.native
  def run(
    image: String,
    cmd: js.Array[String],
    outputStream: js.Array[WritableStream],
    createOptions: Unit,
    startOptions: js.Object
  ): js.Promise[Any] = js.native
  def run(
    image: String,
    cmd: js.Array[String],
    outputStream: js.Array[WritableStream],
    startOptions: js.Object,
    callback: Callback[Any]
  ): EventEmitter = js.native
  def run(image: String, cmd: js.Array[String], outputStream: WritableStream): js.Promise[Any] = js.native
  def run(image: String, cmd: js.Array[String], outputStream: WritableStream, callback: Callback[Any]): EventEmitter = js.native
  def run(image: String, cmd: js.Array[String], outputStream: WritableStream, createOptions: js.Object): js.Promise[Any] = js.native
  def run(
    image: String,
    cmd: js.Array[String],
    outputStream: WritableStream,
    createOptions: js.Object,
    startOptions: js.Object
  ): js.Promise[Any] = js.native
  def run(
    image: String,
    cmd: js.Array[String],
    outputStream: WritableStream,
    createOptions: js.Object,
    startOptions: js.Object,
    callback: Callback[Any]
  ): EventEmitter = js.native
  def run(
    image: String,
    cmd: js.Array[String],
    outputStream: WritableStream,
    createOptions: Unit,
    startOptions: js.Object
  ): js.Promise[Any] = js.native
  def run(
    image: String,
    cmd: js.Array[String],
    outputStream: WritableStream,
    startOptions: js.Object,
    callback: Callback[Any]
  ): EventEmitter = js.native
  
  def searchImages(options: js.Object): js.Promise[Any] = js.native
  def searchImages(options: js.Object, callback: Callback[Any]): Unit = js.native
  
  def swarmInit(options: js.Object): js.Promise[Any] = js.native
  def swarmInit(options: js.Object, callback: Callback[Any]): Unit = js.native
  
  def swarmInspect(): js.Promise[Any] = js.native
  def swarmInspect(callback: Callback[Any]): Unit = js.native
  
  def swarmJoin(options: js.Object): js.Promise[Any] = js.native
  def swarmJoin(options: js.Object, callback: Callback[Any]): Unit = js.native
  
  def swarmLeave(options: js.Object): js.Promise[Any] = js.native
  def swarmLeave(options: js.Object, callback: Callback[Any]): Unit = js.native
  
  def swarmUpdate(options: js.Object): js.Promise[Any] = js.native
  def swarmUpdate(options: js.Object, callback: Callback[Any]): Unit = js.native
  
  def version(): js.Promise[DockerVersion] = js.native
  def version(callback: Callback[DockerVersion]): Unit = js.native
}
