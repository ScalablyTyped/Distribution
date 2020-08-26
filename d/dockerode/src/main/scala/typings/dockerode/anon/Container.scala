package typings.dockerode.anon

import typings.dockerode.dockerodeStrings.config
import typings.dockerode.dockerodeStrings.container
import typings.dockerode.dockerodeStrings.daemon
import typings.dockerode.dockerodeStrings.image
import typings.dockerode.dockerodeStrings.local
import typings.dockerode.dockerodeStrings.network
import typings.dockerode.dockerodeStrings.node
import typings.dockerode.dockerodeStrings.plugin
import typings.dockerode.dockerodeStrings.secret
import typings.dockerode.dockerodeStrings.service
import typings.dockerode.dockerodeStrings.swarm
import typings.dockerode.dockerodeStrings.volume
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Container extends js.Object {
  var config: js.UndefOr[String] = js.native
  var container: js.UndefOr[js.Array[String]] = js.native
  var daemon: js.UndefOr[js.Array[String]] = js.native
  var event: js.UndefOr[js.Array[String]] = js.native
  var image: js.UndefOr[js.Array[String]] = js.native
  var label: js.UndefOr[js.Array[String]] = js.native
  var network: js.UndefOr[js.Array[String]] = js.native
  var node: js.UndefOr[js.Array[String]] = js.native
  var plugin: js.UndefOr[js.Array[String]] = js.native
  var scope: js.UndefOr[js.Array[local | swarm]] = js.native
  var secret: js.UndefOr[js.Array[String]] = js.native
  var service: js.UndefOr[js.Array[String]] = js.native
  var `type`: js.UndefOr[
    js.Array[
      container | image | volume | network | daemon | plugin | service | node | secret | config
    ]
  ] = js.native
  var volume: js.UndefOr[js.Array[String]] = js.native
}

object Container {
  @scala.inline
  def apply(): Container = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Container]
  }
  @scala.inline
  implicit class ContainerOps[Self <: Container] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setConfig(value: String): Self = this.set("config", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfig: Self = this.set("config", js.undefined)
    @scala.inline
    def setContainerVarargs(value: String*): Self = this.set("container", js.Array(value :_*))
    @scala.inline
    def setContainer(value: js.Array[String]): Self = this.set("container", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    @scala.inline
    def setDaemonVarargs(value: String*): Self = this.set("daemon", js.Array(value :_*))
    @scala.inline
    def setDaemon(value: js.Array[String]): Self = this.set("daemon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDaemon: Self = this.set("daemon", js.undefined)
    @scala.inline
    def setEventVarargs(value: String*): Self = this.set("event", js.Array(value :_*))
    @scala.inline
    def setEvent(value: js.Array[String]): Self = this.set("event", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvent: Self = this.set("event", js.undefined)
    @scala.inline
    def setImageVarargs(value: String*): Self = this.set("image", js.Array(value :_*))
    @scala.inline
    def setImage(value: js.Array[String]): Self = this.set("image", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    @scala.inline
    def setLabelVarargs(value: String*): Self = this.set("label", js.Array(value :_*))
    @scala.inline
    def setLabel(value: js.Array[String]): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setNetworkVarargs(value: String*): Self = this.set("network", js.Array(value :_*))
    @scala.inline
    def setNetwork(value: js.Array[String]): Self = this.set("network", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetwork: Self = this.set("network", js.undefined)
    @scala.inline
    def setNodeVarargs(value: String*): Self = this.set("node", js.Array(value :_*))
    @scala.inline
    def setNode(value: js.Array[String]): Self = this.set("node", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNode: Self = this.set("node", js.undefined)
    @scala.inline
    def setPluginVarargs(value: String*): Self = this.set("plugin", js.Array(value :_*))
    @scala.inline
    def setPlugin(value: js.Array[String]): Self = this.set("plugin", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlugin: Self = this.set("plugin", js.undefined)
    @scala.inline
    def setScopeVarargs(value: (local | swarm)*): Self = this.set("scope", js.Array(value :_*))
    @scala.inline
    def setScope(value: js.Array[local | swarm]): Self = this.set("scope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
    @scala.inline
    def setSecretVarargs(value: String*): Self = this.set("secret", js.Array(value :_*))
    @scala.inline
    def setSecret(value: js.Array[String]): Self = this.set("secret", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecret: Self = this.set("secret", js.undefined)
    @scala.inline
    def setServiceVarargs(value: String*): Self = this.set("service", js.Array(value :_*))
    @scala.inline
    def setService(value: js.Array[String]): Self = this.set("service", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteService: Self = this.set("service", js.undefined)
    @scala.inline
    def setTypeVarargs(
      value: (container | image | volume | network | daemon | plugin | service | node | secret | config)*
    ): Self = this.set("type", js.Array(value :_*))
    @scala.inline
    def setType(
      value: js.Array[
          container | image | volume | network | daemon | plugin | service | node | secret | config
        ]
    ): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setVolumeVarargs(value: String*): Self = this.set("volume", js.Array(value :_*))
    @scala.inline
    def setVolume(value: js.Array[String]): Self = this.set("volume", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVolume: Self = this.set("volume", js.undefined)
  }
  
}

