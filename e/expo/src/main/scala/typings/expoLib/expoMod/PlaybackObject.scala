package typings
package expoLib.expoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo", "PlaybackObject")
@js.native
class PlaybackObject () extends js.Object {
  /**
    * Gets the `PlaybackStatus` of the `playbackObject`.
    *
    * Returns a `Promise` that is fulfilled with the `PlaybackStatus` of the `playbackObject`.
    */
  def getStatusAsync(): js.Promise[PlaybackStatus] = js.native
  /**
    * Loads the media from source into memory and prepares it for playing. This must be called before calling setStatusAsync() or any of the convenience set status methods. This method can only be called if the playbackObject is in an unloaded state.
    *
    * Returns a `Promise` that is fulfilled with the `PlaybackStatus` of the `playbackObject` once it is loaded, or rejects if loading failed. The `Promise` will also reject if the `playbackObject` was already loaded. See below for details on `PlaybackStatus`.
    */
  def loadAsync(
    /**
    * The source of the media. The following forms are supported:
    * - A dictionary of the form `{ uri: 'http://path/to/file' }` with a network URL pointing to a media file on the web.
    * - `require('path/to/file')` for a media file asset in the source code directory.
    * - An `Expo.Asset object` for a media file asset.
    */
  source: PlaybackSource
  ): js.Promise[PlaybackStatus] = js.native
  def loadAsync(
    /**
    * The source of the media. The following forms are supported:
    * - A dictionary of the form `{ uri: 'http://path/to/file' }` with a network URL pointing to a media file on the web.
    * - `require('path/to/file')` for a media file asset in the source code directory.
    * - An `Expo.Asset object` for a media file asset.
    */
  source: PlaybackSource,
    /** The initial intended `PlaybackStatusToSet` of the `playbackObject`, whose values will override the default initial playback status. This value defaults to `{}` if no parameter is passed. See below for details on `PlaybackStatusToSet` and the default initial playback status. */
  initialStatus: PlaybackStatusToSet
  ): js.Promise[PlaybackStatus] = js.native
  def loadAsync(
    /**
    * The source of the media. The following forms are supported:
    * - A dictionary of the form `{ uri: 'http://path/to/file' }` with a network URL pointing to a media file on the web.
    * - `require('path/to/file')` for a media file asset in the source code directory.
    * - An `Expo.Asset object` for a media file asset.
    */
  source: PlaybackSource,
    /** The initial intended `PlaybackStatusToSet` of the `playbackObject`, whose values will override the default initial playback status. This value defaults to `{}` if no parameter is passed. See below for details on `PlaybackStatusToSet` and the default initial playback status. */
  initialStatus: PlaybackStatusToSet,
    /** If set to `true`, the system will attempt to download the resource to the device before loading. This value defaults to true. Note that at the moment, this will only work for sources of the form `require('path/to/file')` or `Expo.Asset` objects. */
  downloadFirst: scala.Boolean
  ): js.Promise[PlaybackStatus] = js.native
  /** This is equivalent to `playbackObject.setStatusAsync({ shouldPlay: false })`. */
  def pauseAsync(): js.Promise[PlaybackStatus] = js.native
  /**
    * This is equivalent to `playbackObject.setStatusAsync({ shouldPlay: true })`.
    *
    * Playback may not start immediately after calling this function for reasons such as buffering. Make sure to update your UI based on the `isPlaying` and `isBuffering` properties of the `PlaybackStatus`.
    */
  def playAsync(): js.Promise[PlaybackStatus] = js.native
  /**
    * This is equivalent to `playbackObject.setStatusAsync({ shouldPlay: true, positionMillis: millis })`.
    *
    * Playback may not start immediately after calling this function for reasons such as buffering. Make sure to update your UI based on the isPlaying and `isBuffering` properties of the `PlaybackStatus`.
    */
  def playFromPositionAsync(/** The desired position of playback in milliseconds. */
  positionMillis: scala.Double): js.Promise[PlaybackStatus] = js.native
  def playFromPositionAsync(
    /** The desired position of playback in milliseconds. */
  positionMillis: scala.Double,
    /** This is equivalent to `playbackObject.setStatusAsync({ positionMillis: millis, seekMillisToleranceBefore: toleranceMillisBefore, seekMillisToleranceAfter: toleranceMillisAfter })`. The tolerances are used only on iOS. */
  tolerances: expoLib.Anon_ToleranceMillisBefore
  ): js.Promise[PlaybackStatus] = js.native
  /**
    * Replays the item. When using `playFromPositionAsync(0)` the item is seeked to the position at `0` ms. On iOS this method uses internal implementation of the player and is able to play the item from the beginning immediately.
    *
    * Returns a `Promise` that is fulfilled with the `PlaybackStatus` of the `playbackObject` once the new status has been set successfully, or rejects if setting the new status failed.
    */
  def replayAsync(
    /** The new `PlaybackStatusToSet` of the `playbackObject`, whose values will override the current playback status. */
  status: PlaybackStatusToSet
  ): js.Promise[PlaybackStatus] = js.native
  /** This is equivalent to `playbackObject.setStatusAsync({ isLooping: value })`. */
  def setIsLoopingAsync(
    /** A boolean describing if the media should play once (`false`) or loop indefinitely (`true`). */
  isLooping: scala.Boolean
  ): js.Promise[PlaybackStatus] = js.native
  /** This is equivalent to `playbackObject.setStatusAsync({ isMuted: value })`. */
  def setIsMutedAsync(/**  A boolean describing if the audio of this media should be muted. */
  isMuted: scala.Boolean): js.Promise[PlaybackStatus] = js.native
  /**
    * Sets a function to be called regularly with the `PlaybackStatus` of the `playbackObject`. See below for details on `PlaybackStatus` and an example use case of this function.
    *
    * `onPlaybackStatusUpdate` will be called whenever a call to the API for this `playbackObject` completes (such as `setStatusAsync()`, `getStatusAsync()`, or `unloadAsync()`), and will also be called at regular intervals while the media is in the loaded state. Set `progressUpdateIntervalMillis` via `setStatusAsync()` or `setProgressUpdateIntervalAsync()` to modify the interval with which `onPlaybackStatusUpdate` is called while loaded.
    */
  def setOnPlaybackStatusUpdate(): scala.Unit = js.native
  def setOnPlaybackStatusUpdate(
    /** A function taking a single parameter `PlaybackStatus`. */
  onPlaybackStatusUpdate: js.Function1[/* status */ PlaybackStatus, scala.Unit]
  ): scala.Unit = js.native
  /** This is equivalent to `playbackObject.setStatusAsync({ positionMillis: millis })`. */
  def setPositionAsync(positionMillis: scala.Double): js.Promise[PlaybackStatus] = js.native
  def setPositionAsync(
    positionMillis: scala.Double,
    /** This is equivalent to `playbackObject.setStatusAsync({ positionMillis: millis, seekMillisToleranceBefore: toleranceMillisBefore, seekMillisToleranceAfter: toleranceMillisAfter })`. The tolerances are used only on iOS. */
  tolerances: expoLib.Anon_ToleranceMillisBefore
  ): js.Promise[PlaybackStatus] = js.native
  /** This is equivalent to `playbackObject.setStatusAsync({ progressUpdateIntervalMillis: millis })`. */
  def setProgressUpdateIntervalAsync(
    /** The new minimum interval in milliseconds between calls of `onPlaybackStatusUpdate`. */
  progressUpdateIntervalMillis: scala.Double
  ): js.Promise[PlaybackStatus] = js.native
  /** This is equivalent to `playbackObject.setStatusAsync({ rate: value, shouldCorrectPitch: shouldCorrectPitch })`. */
  def setRateAsync(
    /** The desired playback rate of the media. This value must be between `0.0` and `32.0`. Only available on Android API version 23 and later and iOS. */
  rate: scala.Double,
    /** A boolean describing if we should correct the pitch for a changed rate. If set to `true`, the pitch of the audio will be corrected (so a rate different than `1.0` will timestretch the audio). */
  shouldCorrectPitch: scala.Boolean
  ): js.Promise[PlaybackStatus] = js.native
  /** Sets a new `PlaybackStatusToSet` on the `playbackObject`. This method can only be called if the media has been loaded. Return a `Promise` that is fulfilled with the `PlaybackStatus` of the `playbackObject` once the new status has been set successfully, or rejects if setting the new status failed. */
  def setStatusAsync(
    /** The new `PlaybackStatusToSet` of the `playbackObject`, whose values will override the current playback status. */
  status: PlaybackStatusToSet
  ): js.Promise[PlaybackStatus] = js.native
  /** This is equivalent to `playbackObject.setStatusAsync({ volume: value })`. */
  def setVolumeAsync(/** A number between `0.0` (silence) and `1.0` (maximum volume). */
  volume: scala.Double): js.Promise[PlaybackStatus] = js.native
  /** This is equivalent to `playbackObject.setStatusAsync({ shouldPlay: false, positionMillis: 0 })`. */
  def stopAsync(): js.Promise[PlaybackStatus] = js.native
  /**
    * Unloads the media from memory. `loadAsync()` must be called again in order to be able to play the media.
    *
    * Returns a `Promise` that is fulfilled with the `PlaybackStatus` of the `playbackObject` once it is unloaded, or rejects if unloading failed. See below for details on `PlaybackStatus`.
    */
  def unloadAsync(): js.Promise[PlaybackStatus] = js.native
}

