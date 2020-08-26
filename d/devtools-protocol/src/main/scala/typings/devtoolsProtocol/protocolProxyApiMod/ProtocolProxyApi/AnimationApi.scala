package typings.devtoolsProtocol.protocolProxyApiMod.ProtocolProxyApi

import typings.devtoolsProtocol.devtoolsProtocolStrings.animationCanceled
import typings.devtoolsProtocol.devtoolsProtocolStrings.animationCreated
import typings.devtoolsProtocol.devtoolsProtocolStrings.animationStarted
import typings.devtoolsProtocol.mod.Protocol.Animation.AnimationCanceledEvent
import typings.devtoolsProtocol.mod.Protocol.Animation.AnimationCreatedEvent
import typings.devtoolsProtocol.mod.Protocol.Animation.AnimationStartedEvent
import typings.devtoolsProtocol.mod.Protocol.Animation.GetCurrentTimeRequest
import typings.devtoolsProtocol.mod.Protocol.Animation.GetCurrentTimeResponse
import typings.devtoolsProtocol.mod.Protocol.Animation.GetPlaybackRateResponse
import typings.devtoolsProtocol.mod.Protocol.Animation.ReleaseAnimationsRequest
import typings.devtoolsProtocol.mod.Protocol.Animation.ResolveAnimationRequest
import typings.devtoolsProtocol.mod.Protocol.Animation.ResolveAnimationResponse
import typings.devtoolsProtocol.mod.Protocol.Animation.SeekAnimationsRequest
import typings.devtoolsProtocol.mod.Protocol.Animation.SetPausedRequest
import typings.devtoolsProtocol.mod.Protocol.Animation.SetPlaybackRateRequest
import typings.devtoolsProtocol.mod.Protocol.Animation.SetTimingRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnimationApi extends js.Object {
  /**
    * Disables animation domain notifications.
    */
  def disable(): js.Promise[Unit] = js.native
  /**
    * Enables animation domain notifications.
    */
  def enable(): js.Promise[Unit] = js.native
  /**
    * Returns the current time of the an animation.
    */
  def getCurrentTime(params: GetCurrentTimeRequest): js.Promise[GetCurrentTimeResponse] = js.native
  /**
    * Gets the playback rate of the document timeline.
    */
  def getPlaybackRate(): js.Promise[GetPlaybackRateResponse] = js.native
  /**
    * Event for when an animation has been cancelled.
    */
  @JSName("on")
  def on_animationCanceled(event: animationCanceled, listener: js.Function1[/* params */ AnimationCanceledEvent, Unit]): Unit = js.native
  /**
    * Event for each animation that has been created.
    */
  @JSName("on")
  def on_animationCreated(event: animationCreated, listener: js.Function1[/* params */ AnimationCreatedEvent, Unit]): Unit = js.native
  /**
    * Event for animation that has been started.
    */
  @JSName("on")
  def on_animationStarted(event: animationStarted, listener: js.Function1[/* params */ AnimationStartedEvent, Unit]): Unit = js.native
  /**
    * Releases a set of animations to no longer be manipulated.
    */
  def releaseAnimations(params: ReleaseAnimationsRequest): js.Promise[Unit] = js.native
  /**
    * Gets the remote object of the Animation.
    */
  def resolveAnimation(params: ResolveAnimationRequest): js.Promise[ResolveAnimationResponse] = js.native
  /**
    * Seek a set of animations to a particular time within each animation.
    */
  def seekAnimations(params: SeekAnimationsRequest): js.Promise[Unit] = js.native
  /**
    * Sets the paused state of a set of animations.
    */
  def setPaused(params: SetPausedRequest): js.Promise[Unit] = js.native
  /**
    * Sets the playback rate of the document timeline.
    */
  def setPlaybackRate(params: SetPlaybackRateRequest): js.Promise[Unit] = js.native
  /**
    * Sets the timing of an animation node.
    */
  def setTiming(params: SetTimingRequest): js.Promise[Unit] = js.native
}

