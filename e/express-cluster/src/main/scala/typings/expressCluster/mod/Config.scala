package typings.expressCluster.mod

import typings.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Config extends js.Object {
  var count: js.UndefOr[Double] = js.native
  var outputStream: js.UndefOr[WritableStream] = js.native
  var respawn: js.UndefOr[Boolean] = js.native
  var verbose: js.UndefOr[Boolean] = js.native
  var workerListener: js.UndefOr[js.Function0[Unit]] = js.native
}

object Config {
  @scala.inline
  def apply(): Config = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Config]
  }
  @scala.inline
  implicit class ConfigOps[Self <: Config] (val x: Self) extends AnyVal {
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
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    @scala.inline
    def setOutputStream(value: WritableStream): Self = this.set("outputStream", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutputStream: Self = this.set("outputStream", js.undefined)
    @scala.inline
    def setRespawn(value: Boolean): Self = this.set("respawn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRespawn: Self = this.set("respawn", js.undefined)
    @scala.inline
    def setVerbose(value: Boolean): Self = this.set("verbose", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerbose: Self = this.set("verbose", js.undefined)
    @scala.inline
    def setWorkerListener(value: () => Unit): Self = this.set("workerListener", js.Any.fromFunction0(value))
    @scala.inline
    def deleteWorkerListener: Self = this.set("workerListener", js.undefined)
  }
  
}

