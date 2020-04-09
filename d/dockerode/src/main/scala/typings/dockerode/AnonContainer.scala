package typings.dockerode

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

trait AnonContainer extends js.Object {
  var config: js.UndefOr[String] = js.undefined
  var container: js.UndefOr[js.Array[String]] = js.undefined
  var daemon: js.UndefOr[js.Array[String]] = js.undefined
  var event: js.UndefOr[js.Array[String]] = js.undefined
  var image: js.UndefOr[js.Array[String]] = js.undefined
  var label: js.UndefOr[js.Array[String]] = js.undefined
  var network: js.UndefOr[js.Array[String]] = js.undefined
  var node: js.UndefOr[js.Array[String]] = js.undefined
  var plugin: js.UndefOr[js.Array[String]] = js.undefined
  var scope: js.UndefOr[js.Array[local | swarm]] = js.undefined
  var secret: js.UndefOr[js.Array[String]] = js.undefined
  var service: js.UndefOr[js.Array[String]] = js.undefined
  var `type`: js.UndefOr[
    js.Array[
      container | image | volume | network | daemon | plugin | service | node | secret | config
    ]
  ] = js.undefined
  var volume: js.UndefOr[js.Array[String]] = js.undefined
}

object AnonContainer {
  @scala.inline
  def apply(
    config: String = null,
    container: js.Array[String] = null,
    daemon: js.Array[String] = null,
    event: js.Array[String] = null,
    image: js.Array[String] = null,
    label: js.Array[String] = null,
    network: js.Array[String] = null,
    node: js.Array[String] = null,
    plugin: js.Array[String] = null,
    scope: js.Array[local | swarm] = null,
    secret: js.Array[String] = null,
    service: js.Array[String] = null,
    `type`: js.Array[
      container | image | volume | network | daemon | plugin | service | node | secret | config
    ] = null,
    volume: js.Array[String] = null
  ): AnonContainer = {
    val __obj = js.Dynamic.literal()
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (daemon != null) __obj.updateDynamic("daemon")(daemon.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (network != null) __obj.updateDynamic("network")(network.asInstanceOf[js.Any])
    if (node != null) __obj.updateDynamic("node")(node.asInstanceOf[js.Any])
    if (plugin != null) __obj.updateDynamic("plugin")(plugin.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (secret != null) __obj.updateDynamic("secret")(secret.asInstanceOf[js.Any])
    if (service != null) __obj.updateDynamic("service")(service.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (volume != null) __obj.updateDynamic("volume")(volume.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContainer]
  }
}

