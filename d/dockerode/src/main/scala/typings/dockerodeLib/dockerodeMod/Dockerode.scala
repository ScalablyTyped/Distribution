package typings
package dockerodeLib.dockerodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dockerode extends js.Object {
  var modem: js.Any = js.native
  def buildImage(file: dockerodeLib.dockerodeMod.DockerodeNs.ImageBuildContext): js.Promise[nodeLib.NodeJSNs.ReadableStream] = js.native
  def buildImage(
    file: dockerodeLib.dockerodeMod.DockerodeNs.ImageBuildContext,
    callback: dockerodeLib.Callback[nodeLib.NodeJSNs.ReadableStream]
  ): scala.Unit = js.native
  def buildImage(file: dockerodeLib.dockerodeMod.DockerodeNs.ImageBuildContext, options: js.Object): js.Promise[nodeLib.NodeJSNs.ReadableStream] = js.native
  def buildImage(
    file: dockerodeLib.dockerodeMod.DockerodeNs.ImageBuildContext,
    options: js.Object,
    callback: dockerodeLib.Callback[nodeLib.NodeJSNs.ReadableStream]
  ): scala.Unit = js.native
  def buildImage(file: java.lang.String): js.Promise[nodeLib.NodeJSNs.ReadableStream] = js.native
  def buildImage(file: java.lang.String, callback: dockerodeLib.Callback[nodeLib.NodeJSNs.ReadableStream]): scala.Unit = js.native
  def buildImage(file: java.lang.String, options: js.Object): js.Promise[nodeLib.NodeJSNs.ReadableStream] = js.native
  def buildImage(
    file: java.lang.String,
    options: js.Object,
    callback: dockerodeLib.Callback[nodeLib.NodeJSNs.ReadableStream]
  ): scala.Unit = js.native
  def buildImage(file: nodeLib.NodeJSNs.ReadableStream): js.Promise[nodeLib.NodeJSNs.ReadableStream] = js.native
  def buildImage(
    file: nodeLib.NodeJSNs.ReadableStream,
    callback: dockerodeLib.Callback[nodeLib.NodeJSNs.ReadableStream]
  ): scala.Unit = js.native
  def buildImage(file: nodeLib.NodeJSNs.ReadableStream, options: js.Object): js.Promise[nodeLib.NodeJSNs.ReadableStream] = js.native
  def buildImage(
    file: nodeLib.NodeJSNs.ReadableStream,
    options: js.Object,
    callback: dockerodeLib.Callback[nodeLib.NodeJSNs.ReadableStream]
  ): scala.Unit = js.native
  def checkAuth(options: js.Any): js.Promise[_] = js.native
  def checkAuth(options: js.Any, callback: dockerodeLib.Callback[_]): scala.Unit = js.native
  def createContainer(options: dockerodeLib.dockerodeMod.DockerodeNs.ContainerCreateOptions): js.Promise[dockerodeLib.dockerodeMod.DockerodeNs.Container] = js.native
  def createContainer(
    options: dockerodeLib.dockerodeMod.DockerodeNs.ContainerCreateOptions,
    callback: dockerodeLib.Callback[dockerodeLib.dockerodeMod.DockerodeNs.Container]
  ): scala.Unit = js.native
  def createImage(auth: js.Any, options: js.Object): js.Promise[nodeLib.NodeJSNs.ReadableStream] = js.native
  def createImage(auth: js.Any, options: js.Object, callback: dockerodeLib.Callback[nodeLib.NodeJSNs.ReadableStream]): scala.Unit = js.native
  def createImage(options: js.Object): js.Promise[nodeLib.NodeJSNs.ReadableStream] = js.native
  def createImage(options: js.Object, callback: dockerodeLib.Callback[nodeLib.NodeJSNs.ReadableStream]): scala.Unit = js.native
  def createNetwork(options: js.Object): js.Promise[_] = js.native
  def createNetwork(options: js.Object, callback: dockerodeLib.Callback[_]): scala.Unit = js.native
  def createPlugin(options: js.Object): js.Promise[_] = js.native
  def createPlugin(options: js.Object, callback: dockerodeLib.Callback[_]): scala.Unit = js.native
  def createSecret(options: js.Object): js.Promise[_] = js.native
  def createSecret(options: js.Object, callback: dockerodeLib.Callback[_]): scala.Unit = js.native
  def createService(options: js.Object): js.Promise[_] = js.native
  def createService(options: js.Object, callback: dockerodeLib.Callback[_]): scala.Unit = js.native
  def createVolume(options: js.Object): js.Promise[_] = js.native
  def createVolume(options: js.Object, callback: dockerodeLib.Callback[_]): scala.Unit = js.native
  def df(): js.Promise[_] = js.native
  def df(callback: dockerodeLib.Callback[_]): scala.Unit = js.native
  def getContainer(id: java.lang.String): dockerodeLib.dockerodeMod.DockerodeNs.Container = js.native
  def getEvents(): js.Promise[nodeLib.NodeJSNs.ReadableStream] = js.native
  def getEvents(callback: dockerodeLib.Callback[nodeLib.NodeJSNs.ReadableStream]): scala.Unit = js.native
  def getEvents(options: js.Object): js.Promise[nodeLib.NodeJSNs.ReadableStream] = js.native
  def getEvents(options: js.Object, callback: dockerodeLib.Callback[nodeLib.NodeJSNs.ReadableStream]): scala.Unit = js.native
  def getExec(id: java.lang.String): dockerodeLib.dockerodeMod.DockerodeNs.Exec = js.native
  def getImage(name: java.lang.String): dockerodeLib.dockerodeMod.DockerodeNs.Image = js.native
  def getNetwork(id: java.lang.String): dockerodeLib.dockerodeMod.DockerodeNs.Network = js.native
  def getNode(id: java.lang.String): dockerodeLib.dockerodeMod.DockerodeNs.Node = js.native
  def getPlugin(name: java.lang.String, remote: js.Any): dockerodeLib.dockerodeMod.DockerodeNs.Plugin = js.native
  def getSecret(id: java.lang.String): dockerodeLib.dockerodeMod.DockerodeNs.Secret = js.native
  def getService(id: java.lang.String): dockerodeLib.dockerodeMod.DockerodeNs.Service = js.native
  def getTask(id: java.lang.String): dockerodeLib.dockerodeMod.DockerodeNs.Task = js.native
  def getVolume(name: java.lang.String): dockerodeLib.dockerodeMod.DockerodeNs.Volume = js.native
  def importImage(file: java.lang.String): js.Promise[nodeLib.NodeJSNs.ReadableStream] = js.native
  def importImage(file: java.lang.String, callback: dockerodeLib.Callback[nodeLib.NodeJSNs.ReadableStream]): scala.Unit = js.native
  def importImage(file: java.lang.String, options: js.Object): js.Promise[nodeLib.NodeJSNs.ReadableStream] = js.native
  def importImage(
    file: java.lang.String,
    options: js.Object,
    callback: dockerodeLib.Callback[nodeLib.NodeJSNs.ReadableStream]
  ): scala.Unit = js.native
  def importImage(file: nodeLib.NodeJSNs.ReadableStream): js.Promise[nodeLib.NodeJSNs.ReadableStream] = js.native
  def importImage(
    file: nodeLib.NodeJSNs.ReadableStream,
    callback: dockerodeLib.Callback[nodeLib.NodeJSNs.ReadableStream]
  ): scala.Unit = js.native
  def importImage(file: nodeLib.NodeJSNs.ReadableStream, options: js.Object): js.Promise[nodeLib.NodeJSNs.ReadableStream] = js.native
  def importImage(
    file: nodeLib.NodeJSNs.ReadableStream,
    options: js.Object,
    callback: dockerodeLib.Callback[nodeLib.NodeJSNs.ReadableStream]
  ): scala.Unit = js.native
  def info(): js.Promise[_] = js.native
  def info(callback: dockerodeLib.Callback[_]): scala.Unit = js.native
  def listContainers(): js.Promise[js.Array[dockerodeLib.dockerodeMod.DockerodeNs.ContainerInfo]] = js.native
  def listContainers(callback: dockerodeLib.Callback[js.Array[dockerodeLib.dockerodeMod.DockerodeNs.ContainerInfo]]): scala.Unit = js.native
  def listContainers(options: js.Object): js.Promise[js.Array[dockerodeLib.dockerodeMod.DockerodeNs.ContainerInfo]] = js.native
  def listContainers(
    options: js.Object,
    callback: dockerodeLib.Callback[js.Array[dockerodeLib.dockerodeMod.DockerodeNs.ContainerInfo]]
  ): scala.Unit = js.native
  def listImages(): js.Promise[js.Array[dockerodeLib.dockerodeMod.DockerodeNs.ImageInfo]] = js.native
  def listImages(callback: dockerodeLib.Callback[js.Array[dockerodeLib.dockerodeMod.DockerodeNs.ImageInfo]]): scala.Unit = js.native
  def listImages(options: js.Object): js.Promise[js.Array[dockerodeLib.dockerodeMod.DockerodeNs.ImageInfo]] = js.native
  def listImages(
    options: js.Object,
    callback: dockerodeLib.Callback[js.Array[dockerodeLib.dockerodeMod.DockerodeNs.ImageInfo]]
  ): scala.Unit = js.native
  def listNetworks(): js.Promise[js.Array[_]] = js.native
  def listNetworks(callback: dockerodeLib.Callback[js.Array[_]]): scala.Unit = js.native
  def listNetworks(options: js.Object): js.Promise[js.Array[_]] = js.native
  def listNetworks(options: js.Object, callback: dockerodeLib.Callback[js.Array[_]]): scala.Unit = js.native
  def listNodes(): js.Promise[js.Array[_]] = js.native
  def listNodes(callback: dockerodeLib.Callback[js.Array[_]]): scala.Unit = js.native
  def listNodes(options: js.Object): js.Promise[js.Array[_]] = js.native
  def listNodes(options: js.Object, callback: dockerodeLib.Callback[js.Array[_]]): scala.Unit = js.native
  def listPlugins(): js.Promise[js.Array[dockerodeLib.dockerodeMod.DockerodeNs.PluginInfo]] = js.native
  def listPlugins(callback: dockerodeLib.Callback[js.Array[dockerodeLib.dockerodeMod.DockerodeNs.PluginInfo]]): scala.Unit = js.native
  def listPlugins(options: js.Object): js.Promise[js.Array[dockerodeLib.dockerodeMod.DockerodeNs.PluginInfo]] = js.native
  def listPlugins(
    options: js.Object,
    callback: dockerodeLib.Callback[js.Array[dockerodeLib.dockerodeMod.DockerodeNs.PluginInfo]]
  ): scala.Unit = js.native
  def listSecrets(): js.Promise[js.Array[dockerodeLib.dockerodeMod.DockerodeNs.SecretInfo]] = js.native
  def listSecrets(callback: dockerodeLib.Callback[js.Array[dockerodeLib.dockerodeMod.DockerodeNs.SecretInfo]]): scala.Unit = js.native
  def listSecrets(options: js.Object): js.Promise[js.Array[dockerodeLib.dockerodeMod.DockerodeNs.SecretInfo]] = js.native
  def listSecrets(
    options: js.Object,
    callback: dockerodeLib.Callback[js.Array[dockerodeLib.dockerodeMod.DockerodeNs.SecretInfo]]
  ): scala.Unit = js.native
  def listServices(): js.Promise[js.Array[_]] = js.native
  def listServices(callback: dockerodeLib.Callback[js.Array[_]]): scala.Unit = js.native
  def listServices(options: js.Object): js.Promise[js.Array[_]] = js.native
  def listServices(options: js.Object, callback: dockerodeLib.Callback[js.Array[_]]): scala.Unit = js.native
  def listTasks(): js.Promise[js.Array[_]] = js.native
  def listTasks(callback: dockerodeLib.Callback[js.Array[_]]): scala.Unit = js.native
  def listTasks(options: js.Object): js.Promise[js.Array[_]] = js.native
  def listTasks(options: js.Object, callback: dockerodeLib.Callback[js.Array[_]]): scala.Unit = js.native
  def listVolumes(): js.Promise[dockerodeLib.Anon_Volumes] = js.native
  def listVolumes(callback: dockerodeLib.Callback[dockerodeLib.Anon_Volumes]): scala.Unit = js.native
  def listVolumes(options: js.Object): js.Promise[dockerodeLib.Anon_Volumes] = js.native
  def listVolumes(options: js.Object, callback: dockerodeLib.Callback[dockerodeLib.Anon_Volumes]): scala.Unit = js.native
  def loadImage(file: java.lang.String): js.Promise[nodeLib.NodeJSNs.ReadableStream] = js.native
  def loadImage(file: java.lang.String, callback: dockerodeLib.Callback[nodeLib.NodeJSNs.ReadableStream]): scala.Unit = js.native
  def loadImage(file: java.lang.String, options: js.Object): js.Promise[nodeLib.NodeJSNs.ReadableStream] = js.native
  def loadImage(
    file: java.lang.String,
    options: js.Object,
    callback: dockerodeLib.Callback[nodeLib.NodeJSNs.ReadableStream]
  ): scala.Unit = js.native
  def loadImage(file: nodeLib.NodeJSNs.ReadableStream): js.Promise[nodeLib.NodeJSNs.ReadableStream] = js.native
  def loadImage(
    file: nodeLib.NodeJSNs.ReadableStream,
    callback: dockerodeLib.Callback[nodeLib.NodeJSNs.ReadableStream]
  ): scala.Unit = js.native
  def loadImage(file: nodeLib.NodeJSNs.ReadableStream, options: js.Object): js.Promise[nodeLib.NodeJSNs.ReadableStream] = js.native
  def loadImage(
    file: nodeLib.NodeJSNs.ReadableStream,
    options: js.Object,
    callback: dockerodeLib.Callback[nodeLib.NodeJSNs.ReadableStream]
  ): scala.Unit = js.native
  def ping(): js.Promise[_] = js.native
  def ping(callback: dockerodeLib.Callback[_]): scala.Unit = js.native
  def pruneContainers(): js.Promise[dockerodeLib.dockerodeMod.DockerodeNs.PruneContainersInfo] = js.native
  def pruneContainers(callback: dockerodeLib.Callback[dockerodeLib.dockerodeMod.DockerodeNs.PruneContainersInfo]): scala.Unit = js.native
  def pruneContainers(options: js.Object): js.Promise[dockerodeLib.dockerodeMod.DockerodeNs.PruneContainersInfo] = js.native
  def pruneContainers(
    options: js.Object,
    callback: dockerodeLib.Callback[dockerodeLib.dockerodeMod.DockerodeNs.PruneContainersInfo]
  ): scala.Unit = js.native
  def pruneImages(): js.Promise[dockerodeLib.dockerodeMod.DockerodeNs.PruneImagesInfo] = js.native
  def pruneImages(callback: dockerodeLib.Callback[dockerodeLib.dockerodeMod.DockerodeNs.PruneImagesInfo]): scala.Unit = js.native
  def pruneImages(options: js.Object): js.Promise[dockerodeLib.dockerodeMod.DockerodeNs.PruneImagesInfo] = js.native
  def pruneImages(
    options: js.Object,
    callback: dockerodeLib.Callback[dockerodeLib.dockerodeMod.DockerodeNs.PruneImagesInfo]
  ): scala.Unit = js.native
  def pruneNetworks(): js.Promise[dockerodeLib.dockerodeMod.DockerodeNs.PruneNetworksInfo] = js.native
  def pruneNetworks(callback: dockerodeLib.Callback[dockerodeLib.dockerodeMod.DockerodeNs.PruneNetworksInfo]): scala.Unit = js.native
  def pruneNetworks(options: js.Object): js.Promise[dockerodeLib.dockerodeMod.DockerodeNs.PruneNetworksInfo] = js.native
  def pruneNetworks(
    options: js.Object,
    callback: dockerodeLib.Callback[dockerodeLib.dockerodeMod.DockerodeNs.PruneNetworksInfo]
  ): scala.Unit = js.native
  def pruneVolumes(): js.Promise[dockerodeLib.dockerodeMod.DockerodeNs.PruneVolumesInfo] = js.native
  def pruneVolumes(callback: dockerodeLib.Callback[dockerodeLib.dockerodeMod.DockerodeNs.PruneVolumesInfo]): scala.Unit = js.native
  def pruneVolumes(options: js.Object): js.Promise[dockerodeLib.dockerodeMod.DockerodeNs.PruneVolumesInfo] = js.native
  def pruneVolumes(
    options: js.Object,
    callback: dockerodeLib.Callback[dockerodeLib.dockerodeMod.DockerodeNs.PruneVolumesInfo]
  ): scala.Unit = js.native
  def pull(repoTag: java.lang.String, options: js.Object): js.Promise[_] = js.native
  def pull(repoTag: java.lang.String, options: js.Object, auth: js.Object): js.Promise[_] = js.native
  def pull(repoTag: java.lang.String, options: js.Object, callback: dockerodeLib.Callback[_]): dockerodeLib.dockerodeMod.DockerodeNs.Image = js.native
  def pull(repoTag: java.lang.String, options: js.Object, callback: dockerodeLib.Callback[_], auth: js.Object): dockerodeLib.dockerodeMod.DockerodeNs.Image = js.native
  def run(
    image: java.lang.String,
    cmd: js.Array[java.lang.String],
    outputStream: js.Array[nodeLib.NodeJSNs.WritableStream]
  ): js.Promise[_] = js.native
  def run(
    image: java.lang.String,
    cmd: js.Array[java.lang.String],
    outputStream: js.Array[nodeLib.NodeJSNs.WritableStream],
    callback: dockerodeLib.Callback[_]
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
    callback: dockerodeLib.Callback[_]
  ): nodeLib.eventsMod.EventEmitter = js.native
  def run(
    image: java.lang.String,
    cmd: js.Array[java.lang.String],
    outputStream: js.Array[nodeLib.NodeJSNs.WritableStream],
    startOptions: js.Object,
    callback: dockerodeLib.Callback[_]
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
    callback: dockerodeLib.Callback[_]
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
    callback: dockerodeLib.Callback[_]
  ): nodeLib.eventsMod.EventEmitter = js.native
  def run(
    image: java.lang.String,
    cmd: js.Array[java.lang.String],
    outputStream: nodeLib.NodeJSNs.WritableStream,
    startOptions: js.Object,
    callback: dockerodeLib.Callback[_]
  ): nodeLib.eventsMod.EventEmitter = js.native
  def searchImages(options: js.Object): js.Promise[_] = js.native
  def searchImages(options: js.Object, callback: dockerodeLib.Callback[_]): scala.Unit = js.native
  def swarmInit(options: js.Object): js.Promise[_] = js.native
  def swarmInit(options: js.Object, callback: dockerodeLib.Callback[_]): scala.Unit = js.native
  def swarmInspect(): js.Promise[_] = js.native
  def swarmInspect(callback: dockerodeLib.Callback[_]): scala.Unit = js.native
  def swarmJoin(options: js.Object): js.Promise[_] = js.native
  def swarmJoin(options: js.Object, callback: dockerodeLib.Callback[_]): scala.Unit = js.native
  def swarmLeave(options: js.Object): js.Promise[_] = js.native
  def swarmLeave(options: js.Object, callback: dockerodeLib.Callback[_]): scala.Unit = js.native
  def swarmUpdate(options: js.Object): js.Promise[_] = js.native
  def swarmUpdate(options: js.Object, callback: dockerodeLib.Callback[_]): scala.Unit = js.native
  def version(): js.Promise[dockerodeLib.dockerodeMod.DockerodeNs.DockerVersion] = js.native
  def version(callback: dockerodeLib.Callback[dockerodeLib.dockerodeMod.DockerodeNs.DockerVersion]): scala.Unit = js.native
}

