package typings.devtoolsProtocol.mod.Protocol.Animation

import typings.devtoolsProtocol.devtoolsProtocolStrings.CSSAnimation
import typings.devtoolsProtocol.devtoolsProtocolStrings.CSSTransition
import typings.devtoolsProtocol.devtoolsProtocolStrings.WebAnimation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Animation extends js.Object {
  /**
    * A unique ID for `Animation` representing the sources that triggered this CSS
    * animation/transition.
    */
  var cssId: js.UndefOr[String] = js.native
  /**
    * `Animation`'s current time.
    */
  var currentTime: Double = js.native
  /**
    * `Animation`'s id.
    */
  var id: String = js.native
  /**
    * `Animation`'s name.
    */
  var name: String = js.native
  /**
    * `Animation`'s internal paused state.
    */
  var pausedState: Boolean = js.native
  /**
    * `Animation`'s play state.
    */
  var playState: String = js.native
  /**
    * `Animation`'s playback rate.
    */
  var playbackRate: Double = js.native
  /**
    * `Animation`'s source animation node.
    */
  var source: js.UndefOr[AnimationEffect] = js.native
  /**
    * `Animation`'s start time.
    */
  var startTime: Double = js.native
  /**
    * Animation type of `Animation`. (AnimationType enum)
    */
  var `type`: CSSTransition | CSSAnimation | WebAnimation = js.native
}

object Animation {
  @scala.inline
  def apply(
    currentTime: Double,
    id: String,
    name: String,
    pausedState: Boolean,
    playState: String,
    playbackRate: Double,
    startTime: Double,
    `type`: CSSTransition | CSSAnimation | WebAnimation
  ): Animation = {
    val __obj = js.Dynamic.literal(currentTime = currentTime.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pausedState = pausedState.asInstanceOf[js.Any], playState = playState.asInstanceOf[js.Any], playbackRate = playbackRate.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Animation]
  }
  @scala.inline
  implicit class AnimationOps[Self <: typings.devtoolsProtocol.mod.Protocol.Animation.Animation] (val x: Self) extends AnyVal {
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
    def setCurrentTime(value: Double): Self = this.set("currentTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setPausedState(value: Boolean): Self = this.set("pausedState", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlayState(value: String): Self = this.set("playState", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlaybackRate(value: Double): Self = this.set("playbackRate", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartTime(value: Double): Self = this.set("startTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: CSSTransition | CSSAnimation | WebAnimation): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setCssId(value: String): Self = this.set("cssId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCssId: Self = this.set("cssId", js.undefined)
    @scala.inline
    def setSource(value: AnimationEffect): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
  }
  
}

