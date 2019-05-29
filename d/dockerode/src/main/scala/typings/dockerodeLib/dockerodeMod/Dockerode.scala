package typings
package dockerodeLib.dockerodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dockerode extends js.Object {
  var modem: js.Any = js.native
  def buildImage(file: ImageBuildContext): js.Promise[nodeLib.NodeJSNs.ReadableStream] = js.native
  def buildImage(file: ImageBuildContext, callback: Callback[nodeLib.NodeJSNs.ReadableStream]): scala.Unit = js.native
  def buildImage(file: ImageBuildContext, options: js.Object): js.Promise[nodeLib.NodeJSNs.ReadableStream] = js.native
  def buildImage(file: ImageBuildContext, options: js.Object, callback: Callback[nodeLib.NodeJSNs.ReadableStream]): scala.Unit = js.native
  def buildImage(file: java.lang.String): js.Promise[nodeLib.NodeJSNs.ReadableStream] = js.native
  def buildImage(file: java.lang.String, callback: Callback[nodeLib.NodeJSNs.ReadableStream]): scala.Unit = js.native
  def buildImage(file: java.lang.String, options: js.Object): js.Promise[nodeLib.NodeJSNs.ReadableStream] = js.native
  def buildImage(file: java.lang.String, options: js.Object, callback: Callback[nodeLib.NodeJSNs.ReadableStream]): scala.Unit = js.native
  def buildImage(file: nodeLib.NodeJSNs.ReadableStream): js.Promise[nodeLib.NodeJSNs.ReadableStream] = js.native
  def buildImage(file: nodeLib.NodeJSNs.ReadableStream, callback: Callback[nodeLib.NodeJSNs.ReadableStream]): scala.Unit = js.native
  def buildImage(file: nodeLib.NodeJSNs.ReadableStream, options: js.Object): js.Promise[nodeLib.NodeJSNs.ReadableStream] = js.native
  def buildImage(
    file: nodeLib.NodeJSNs.ReadableStream,
    options: js.Object,
    callback: Callback[nodeLib.NodeJSNs.ReadableStream]
  ): scala.Unit = js.native
  def checkAuth(options: js.Any): js.Promise[_] = js.native
  def checkAuth(options: js.Any, callback: Callback[_]): scala.Unit = js.native
  def createConfig(options: js.Object): js.Promise[_] = js.native
  def createConfig(options: js.Object, callback: Callback[_]): scala.Unit = js.native
  def createContainer(options: ContainerCreateOptions): js.Promise[Container] = js.native
  def createContainer(options: ContainerCreateOptions, callback: Callback[Container]): scala.Unit = js.native
  def createImage(auth: js.Any, options: js.Object): js.Promise[nodeLib.NodeJSNs.ReadableStream] = js.native
  def createImage(auth: js.Any, options: js.Object, callback: Callback[nodeLib.NodeJSNs.ReadableStream]): scala.Unit = js.native
  def createImage(options: js.Object): js.Promise[nodeLib.NodeJSNs.ReadableStream] = js.native
  def createImage(options: js.Object, callback: Callback[nodeLib.NodeJSNs.ReadableStream]): scala.Unit = js.native
  def createNetwork(options: js.Object): js.Promise[_] = js.native
  def createNetwork(options: js.Object, callback: Callback[_]): scala.Unit = js.native
  def createPlugin(options: js.Object): js.Promise[_] = js.native
  def createPlugin(options: js.Object, callback: Callback[_]): scala.Unit = js.native
  def createSecret(options: js.Object): js.Promise[_] = js.native
  def createSecret(options: js.Object, callback: Callback[_]): scala.Unit = js.native
  def createService(options: js.Object): js.Promise[_] = js.native
  def createService(options: js.Object, callback: Callback[_]): scala.Unit = js.native
  def createVolume(options: js.Object): js.Promise[_] = js.native
  def createVolume(options: js.Object, callback: Callback[_]): scala.Unit = js.native
  def df(): js.Promise[_] = js.native
  def df(callback: Callback[_]): scala.Unit = js.native
  def getContainer(id: java.lang.String): Container = js.native
  def getEvents(): js.Promise[nodeLib.NodeJSNs.ReadableStream] = js.native
  def getEvents(callback: Callback[nodeLib.NodeJSNs.ReadableStream]): scala.Unit = js.native
  def getEvents(options: js.Object): js.Promise[nodeLib.NodeJSNs.ReadableStream] = js.native
  def getEvents(options: js.Object, callback: Callback[nodeLib.NodeJSNs.ReadableStream]): scala.Unit = js.native
  def getExec(id: java.lang.String): Exec = js.native
  def getImage(name: java.lang.String): Image = js.native
  def getNetwork(id: java.lang.String): Network = js.native
  def getNode(id: java.lang.String): Node = js.native
  def getPlugin(name: java.lang.String, remote: js.Any): Plugin = js.native
  def getSecret(id: java.lang.String): Secret = js.native
  def getService(id: java.lang.String): Service = js.native
  def getTask(id: java.lang.String): Task = js.native
  def getVolume(name: java.lang.String): Volume = js.native
  def importImage(file: java.lang.String): js.Promise[nodeLib.NodeJSNs.ReadableStream] = js.native
  def importImage(file: java.lang.String, callback: Callback[nodeLib.NodeJSNs.ReadableStream]): scala.Unit = js.native
  def importImage(file: java.lang.String, options: js.Object): js.Promise[nodeLib.NodeJSNs.ReadableStream] = js.native
  def importImage(file: java.lang.String, options: js.Object, callback: Callback[nodeLib.NodeJSNs.ReadableStream]): scala.Unit = js.native
  def importImage(file: nodeLib.NodeJSNs.ReadableStream): js.Promise[nodeLib.NodeJSNs.ReadableStream] = js.native
  def importImage(file: nodeLib.NodeJSNs.ReadableStream, callback: Callback[nodeLib.NodeJSNs.ReadableStream]): scala.Unit = js.native
  def importImage(file: nodeLib.NodeJSNs.ReadableStream, options: js.Object): js.Promise[nodeLib.NodeJSNs.ReadableStream] = js.native
  def importImage(
    file: nodeLib.NodeJSNs.ReadableStream,
    options: js.Object,
    callback: Callback[nodeLib.NodeJSNs.ReadableStream]
  ): scala.Unit = js.native
  def info(): js.Promise[_] = js.native
  def info(callback: Callback[_]): scala.Unit = js.native
  def listContainers(): js.Promise[js.Array[ContainerInfo]] = js.native
  def listContainers(callback: Callback[js.Array[ContainerInfo]]): scala.Unit = js.native
  def listContainers(options: js.Object): js.Promise[js.Array[ContainerInfo]] = js.native
  def listContainers(options: js.Object, callback: Callback[js.Array[ContainerInfo]]): scala.Unit = js.native
  def listImages(): js.Promise[js.Array[ImageInfo]] = js.native
  def listImages(callback: Callback[js.Array[ImageInfo]]): scala.Unit = js.native
  def listImages(options: js.Object): js.Promise[js.Array[ImageInfo]] = js.native
  def listImages(options: js.Object, callback: Callback[js.Array[ImageInfo]]): scala.Unit = js.native
  def listNetworks(): js.Promise[js.Array[_]] = js.native
  def listNetworks(callback: Callback[js.Array[_]]): scala.Unit = js.native
  def listNetworks(options: js.Object): js.Promise[js.Array[_]] = js.native
  def listNetworks(options: js.Object, callback: Callback[js.Array[_]]): scala.Unit = js.native
  def listNodes(): js.Promise[js.Array[_]] = js.native
  def listNodes(callback: Callback[js.Array[_]]): scala.Unit = js.native
  def listNodes(options: js.Object): js.Promise[js.Array[_]] = js.native
  def listNodes(options: js.Object, callback: Callback[js.Array[_]]): scala.Unit = js.native
  def listPlugins(): js.Promise[js.Array[PluginInfo]] = js.native
  def listPlugins(callback: Callback[js.Array[PluginInfo]]): scala.Unit = js.native
  def listPlugins(options: js.Object): js.Promise[js.Array[PluginInfo]] = js.native
  def listPlugins(options: js.Object, callback: Callback[js.Array[PluginInfo]]): scala.Unit = js.native
  def listSecrets(): js.Promise[js.Array[SecretInfo]] = js.native
  def listSecrets(callback: Callback[js.Array[SecretInfo]]): scala.Unit = js.native
  def listSecrets(options: js.Object): js.Promise[js.Array[SecretInfo]] = js.native
  def listSecrets(options: js.Object, callback: Callback[js.Array[SecretInfo]]): scala.Unit = js.native
  def listServices(): js.Promise[js.Array[_]] = js.native
  def listServices(callback: Callback[js.Array[_]]): scala.Unit = js.native
  def listServices(options: js.Object): js.Promise[js.Array[_]] = js.native
  def listServices(options: js.Object, callback: Callback[js.Array[_]]): scala.Unit = js.native
  def listTasks(): js.Promise[js.Array[_]] = js.native
  def listTasks(callback: Callback[js.Array[_]]): scala.Unit = js.native
  def listTasks(options: js.Object): js.Promise[js.Array[_]] = js.native
  def listTasks(options: js.Object, callback: Callback[js.Array[_]]): scala.Unit = js.native
  def listVolumes(): js.Promise[dockerodeLib.Anon_Volumes] = js.native
  def listVolumes(callback: Callback[dockerodeLib.Anon_Volumes]): scala.Unit = js.native
  def listVolumes(options: js.Object): js.Promise[dockerodeLib.Anon_Volumes] = js.native
  def listVolumes(options: js.Object, callback: Callback[dockerodeLib.Anon_Volumes]): scala.Unit = js.native
  def loadImage(file: java.lang.String): js.Promise[nodeLib.NodeJSNs.ReadableStream] = js.native
  def loadImage(file: java.lang.String, callback: Callback[nodeLib.NodeJSNs.ReadableStream]): scala.Unit = js.native
  def loadImage(file: java.lang.String, options: js.Object): js.Promise[nodeLib.NodeJSNs.ReadableStream] = js.native
  def loadImage(file: java.lang.String, options: js.Object, callback: Callback[nodeLib.NodeJSNs.ReadableStream]): scala.Unit = js.native
  def loadImage(file: nodeLib.NodeJSNs.ReadableStream): js.Promise[nodeLib.NodeJSNs.ReadableStream] = js.native
  def loadImage(file: nodeLib.NodeJSNs.ReadableStream, callback: Callback[nodeLib.NodeJSNs.ReadableStream]): scala.Unit = js.native
  def loadImage(file: nodeLib.NodeJSNs.ReadableStream, options: js.Object): js.Promise[nodeLib.NodeJSNs.ReadableStream] = js.native
  def loadImage(
    file: nodeLib.NodeJSNs.ReadableStream,
    options: js.Object,
    callback: Callback[nodeLib.NodeJSNs.ReadableStream]
  ): scala.Unit = js.native
  def ping(): js.Promise[_] = js.native
  def ping(callback: Callback[_]): scala.Unit = js.native
  def pruneContainers(): js.Promise[PruneContainersInfo] = js.native
  def pruneContainers(callback: Callback[PruneContainersInfo]): scala.Unit = js.native
  def pruneContainers(options: js.Object): js.Promise[PruneContainersInfo] = js.native
  def pruneContainers(options: js.Object, callback: Callback[PruneContainersInfo]): scala.Unit = js.native
  def pruneImages(): js.Promise[PruneImagesInfo] = js.native
  def pruneImages(callback: Callback[PruneImagesInfo]): scala.Unit = js.native
  def pruneImages(options: js.Object): js.Promise[PruneImagesInfo] = js.native
  def pruneImages(options: js.Object, callback: Callback[PruneImagesInfo]): scala.Unit = js.native
  def pruneNetworks(): js.Promise[PruneNetworksInfo] = js.native
  def pruneNetworks(callback: Callback[PruneNetworksInfo]): scala.Unit = js.native
  def pruneNetworks(options: js.Object): js.Promise[PruneNetworksInfo] = js.native
  def pruneNetworks(options: js.Object, callback: Callback[PruneNetworksInfo]): scala.Unit = js.native
  def pruneVolumes(): js.Promise[PruneVolumesInfo] = js.native
  def pruneVolumes(callback: Callback[PruneVolumesInfo]): scala.Unit = js.native
  def pruneVolumes(options: js.Object): js.Promise[PruneVolumesInfo] = js.native
  def pruneVolumes(options: js.Object, callback: Callback[PruneVolumesInfo]): scala.Unit = js.native
  def pull(repoTag: java.lang.String, options: js.Object): js.Promise[_] = js.native
  def pull(repoTag: java.lang.String, options: js.Object, auth: js.Object): js.Promise[_] = js.native
  def pull(repoTag: java.lang.String, options: js.Object, callback: Callback[_]): Image = js.native
  def pull(repoTag: java.lang.String, options: js.Object, callback: Callback[_], auth: js.Object): Image = js.native
  def run(
    image: java.lang.String,
    cmd: js.Array[java.lang.String],
    outputStream: js.Array[nodeLib.NodeJSNs.WritableStream]
  ): js.Promise[_] = js.native
  def run(
    image: java.lang.String,
    cmd: js.Array[java.lang.String],
    outputStream: js.Array[nodeLib.NodeJSNs.WritableStream],
    callback: Callback[_]
  ): nodeLib.eventsMod.EventEmitter = js.native
  def run(
    image: java.lang.String,
    cmd: js.Array[java.lang.String],
    outputStream: js.Array[nodeLib.NodeJSNs.WritableStream],
    createOptions: js.Object
  ): js.Promise[_] = js.native
  def run(
    image: java.lang.String,
    cmd: js.Array[java.lang.String],
    outputStream: js.Array[nodeLib.NodeJSNs.WritableStream],
    createOptions: js.Object,
    startOptions: js.Object
  ): js.Promise[_] = js.native
  def run(
    image: java.lang.String,
    cmd: js.Array[java.lang.String],
    outputStream: js.Array[nodeLib.NodeJSNs.WritableStream],
    createOptions: js.Object,
    startOptions: js.Object,
    callback: Callback[_]
  ): nodeLib.eventsMod.EventEmitter = js.native
  def run(
    image: java.lang.String,
    cmd: js.Array[java.lang.String],
    outputStream: js.Array[nodeLib.NodeJSNs.WritableStream],
    startOptions: js.Object,
    callback: Callback[_]
  ): nodeLib.eventsMod.EventEmitter = js.native
  def run(
    image: java.lang.String,
    cmd: js.Array[java.lang.String],
    outputStream: nodeLib.NodeJSNs.WritableStream
  ): js.Promise[_] = js.native
  def run(
    image: java.lang.String,
    cmd: js.Array[java.lang.String],
    outputStream: nodeLib.NodeJSNs.WritableStream,
    callback: Callback[_]
  ): nodeLib.eventsMod.EventEmitter = js.native
  def run(
    image: java.lang.String,
    cmd: js.Array[java.lang.String],
    outputStream: nodeLib.NodeJSNs.WritableStream,
    createOptions: js.Object
  ): js.Promise[_] = js.native
  def run(
    image: java.lang.String,
    cmd: js.Array[java.lang.String],
    outputStream: nodeLib.NodeJSNs.WritableStream,
    createOptions: js.Object,
    startOptions: js.Object
  ): js.Promise[_] = js.native
  def run(
    image: java.lang.String,
    cmd: js.Array[java.lang.String],
    outputStream: nodeLib.NodeJSNs.WritableStream,
    createOptions: js.Object,
    startOptions: js.Object,
    callback: Callback[_]
  ): nodeLib.eventsMod.EventEmitter = js.native
  def run(
    image: java.lang.String,
    cmd: js.Array[java.lang.String],
    outputStream: nodeLib.NodeJSNs.WritableStream,
    startOptions: js.Object,
    callback: Callback[_]
  ): nodeLib.eventsMod.EventEmitter = js.native
  def searchImages(options: js.Object): js.Promise[_] = js.native
  def searchImages(options: js.Object, callback: Callback[_]): scala.Unit = js.native
  def swarmInit(options: js.Object): js.Promise[_] = js.native
  def swarmInit(options: js.Object, callback: Callback[_]): scala.Unit = js.native
  def swarmInspect(): js.Promise[_] = js.native
  def swarmInspect(callback: Callback[_]): scala.Unit = js.native
  def swarmJoin(options: js.Object): js.Promise[_] = js.native
  def swarmJoin(options: js.Object, callback: Callback[_]): scala.Unit = js.native
  def swarmLeave(options: js.Object): js.Promise[_] = js.native
  def swarmLeave(options: js.Object, callback: Callback[_]): scala.Unit = js.native
  def swarmUpdate(options: js.Object): js.Promise[_] = js.native
  def swarmUpdate(options: js.Object, callback: Callback[_]): scala.Unit = js.native
  def version(): js.Promise[DockerVersion] = js.native
  def version(callback: Callback[DockerVersion]): scala.Unit = js.native
}

