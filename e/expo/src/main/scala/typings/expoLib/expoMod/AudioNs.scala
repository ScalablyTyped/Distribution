package typings
package expoLib.expoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo", "Audio")
@js.native
object AudioNs extends js.Object {
  trait AudioMode extends js.Object {
    /** Boolean selecting if recording is enabled on iOS. This value defaults to `false`. NOTE: when this flag is set to true, playback may be routed to the phone receiver instead of to the speaker. */
    var allowsRecordingIOS: scala.Boolean
    /** an enum selecting how your experience’s audio should interact with the audio from other apps on Android: */
    var interruptionModeAndroid: InterruptionModeAndroid
    /** Enum selecting how your experience’s audio should interact with the audio from other apps on iOS. */
    var interruptionModeIOS: InterruptionModeIos
    /** Boolean selecting if audio should go to earpiece (only on Android). */
    var playThroughEarpieceAndroid: scala.Boolean
    /** Boolean selecting if your experience’s audio should play in silent mode on iOS. This value defaults to `false`. */
    var playsInSilentModeIOS: scala.Boolean
    /** Boolean selecting if your experience’s audio should automatically be lowered in volume ("duck") if audio from another app interrupts your experience. This value defaults to true. If false, audio from other apps will pause your audio. */
    var shouldDuckAndroid: scala.Boolean
  }
  
  @js.native
  sealed trait InterruptionModeAndroid extends js.Object
  
  @js.native
  sealed trait InterruptionModeIos extends js.Object
  
  @js.native
  class Recording () extends js.Object {
    /**
      * Creates and loads a new `Sound` object to play back the `Recording`. Note that this will only succeed once the `Recording` is done recording (once `stopAndUnloadAsync()` has been called).
      *
      * @returns A Promise that is rejected if creation failed, or fulfilled with the following dictionary if creation succeeded:
      * - `sound`: the newly created and loaded Sound object.
      * - `status`: the PlaybackStatus of the Sound object.
      */
    def createNewLoadedSound(): js.Promise[expoLib.Anon_Sound] = js.native
    def createNewLoadedSound(
      /** The initial intended `PlaybackStatusToSet` of the sound, whose values will override the default initial playback status. This value defaults to `{}` if no parameter is passed. */
    initialStatus: expoLib.expoMod.PlaybackStatusToSet
    ): js.Promise[expoLib.Anon_Sound] = js.native
    def createNewLoadedSound(
      /** The initial intended `PlaybackStatusToSet` of the sound, whose values will override the default initial playback status. This value defaults to `{}` if no parameter is passed. */
    initialStatus: expoLib.expoMod.PlaybackStatusToSet,
      /** A function taking a single parameter `PlaybackStatus`. This value defaults to `null` if no parameter is passed. */
    onPlaybackStatusUpdate: js.Function1[/* status */ expoLib.expoMod.PlaybackStatus, scala.Unit]
    ): js.Promise[expoLib.Anon_Sound] = js.native
    /** Gets the `status` of the `Recording`. */
    def getStatusAsync(): js.Promise[RecordingStatus] = js.native
    /**
      * Gets the local URI of the Recording. Note that this will only succeed once the Recording is prepared to record.
      *
      * @returns A string with the local URI of the `Recording`, or `null` if the `Recording` is not prepared to record.
      */
    def getURI(): js.UndefOr[java.lang.String | scala.Null] = js.native
    /**
      * Pauses recording. This method can only be called if the Recording has been prepared.
      *
      * NOTE: This is only available on Android API version 24 and later.
      */
    def pauseAsync(): js.Promise[RecordingStatus] = js.native
    /** Loads the recorder into memory and prepares it for recording. This must be called before calling `startAsync()`. This method can only be called if the `Recording` instance has never yet been prepared. */
    def prepareToRecordAsync(): js.Promise[RecordingStatus] = js.native
    def prepareToRecordAsync(
      /** Options for the recording, including sample rate, bitrate, channels, format, encoder, and extension. If no options are passed to `prepareToRecordAsync()`, the recorder will be created with options `Expo.Audio.RECORDING_OPTIONS_PRESET_LOW_QUALITY`. */
    options: RecordingOptions
    ): js.Promise[RecordingStatus] = js.native
    /** Sets a function to be called regularly with the `status` of the `Recording`. */
    def setOnRecordingStatusUpdate(): scala.Unit = js.native
    def setOnRecordingStatusUpdate(onRecordingStatusUpdate: js.Function1[/* status */ RecordingStatus, scala.Unit]): scala.Unit = js.native
    /** Sets the interval with which onRecordingStatusUpdate is called while the recording can record. This value defaults to 500 milliseconds. */
    def setProgressUpdateInterval(progressUpdateIntervalMillis: scala.Double): scala.Unit = js.native
    /** Begins recording. This method can only be called if the `Recording` has been prepared. */
    def startAsync(): js.Promise[RecordingStatus] = js.native
    /** Stops the recording and deallocates the recorder from memory. This reverts the Recording instance to an unprepared state, and another Recording instance must be created in order to record again. This method can only be called if the `Recording` has been prepared. */
    def stopAndUnloadAsync(): js.Promise[RecordingStatus] = js.native
  }
  
  trait RecordingOptions extends js.Object {
    var android: expoLib.Anon_BitRateSampleRate
    var ios: expoLib.Anon_BitRate
  }
  
  /** This class represents a sound corresponding to an Asset or URL. */
  @js.native
  class Sound ()
    extends expoLib.expoMod.PlaybackObject
  
  val INTERRUPTION_MODE_ANDROID_DO_NOT_MIX: expoLib.expoLibNumbers.`1` = js.native
  val INTERRUPTION_MODE_ANDROID_DUCK_OTHERS: expoLib.expoLibNumbers.`2` = js.native
  val INTERRUPTION_MODE_IOS_DO_NOT_MIX: expoLib.expoLibNumbers.`1` = js.native
  val INTERRUPTION_MODE_IOS_DUCK_OTHERS: expoLib.expoLibNumbers.`2` = js.native
  val INTERRUPTION_MODE_IOS_MIX_WITH_OTHERS: expoLib.expoLibNumbers.`0` = js.native
  val RECORDING_OPTIONS_PRESET_HIGH_QUALITY: RecordingOptions = js.native
  val RECORDING_OPTIONS_PRESET_LOW_QUALITY: RecordingOptions = js.native
  val RECORDING_OPTION_ANDROID_AUDIO_ENCODER_AAC: expoLib.expoLibNumbers.`3` = js.native
  val RECORDING_OPTION_ANDROID_AUDIO_ENCODER_AAC_ELD: expoLib.expoLibNumbers.`5` = js.native
  val RECORDING_OPTION_ANDROID_AUDIO_ENCODER_AMR_NB: expoLib.expoLibNumbers.`1` = js.native
  val RECORDING_OPTION_ANDROID_AUDIO_ENCODER_AMR_WB: expoLib.expoLibNumbers.`2` = js.native
  val RECORDING_OPTION_ANDROID_AUDIO_ENCODER_DEFAULT: expoLib.expoLibNumbers.`0` = js.native
  val RECORDING_OPTION_ANDROID_AUDIO_ENCODER_HE_AAC: expoLib.expoLibNumbers.`4` = js.native
  val RECORDING_OPTION_ANDROID_AUDIO_ENCODER_VORBIS: expoLib.expoLibNumbers.`6` = js.native
  val RECORDING_OPTION_ANDROID_OUTPUT_FORMAT_AAC_ADIF: expoLib.expoLibNumbers.`5` = js.native
  val RECORDING_OPTION_ANDROID_OUTPUT_FORMAT_AAC_ADTS: expoLib.expoLibNumbers.`6` = js.native
  val RECORDING_OPTION_ANDROID_OUTPUT_FORMAT_AMR_NB: expoLib.expoLibNumbers.`3` = js.native
  val RECORDING_OPTION_ANDROID_OUTPUT_FORMAT_AMR_WB: expoLib.expoLibNumbers.`4` = js.native
  val RECORDING_OPTION_ANDROID_OUTPUT_FORMAT_DEFAULT: expoLib.expoLibNumbers.`0` = js.native
  val RECORDING_OPTION_ANDROID_OUTPUT_FORMAT_MPEG2TS: expoLib.expoLibNumbers.`8` = js.native
  val RECORDING_OPTION_ANDROID_OUTPUT_FORMAT_MPEG_4: expoLib.expoLibNumbers.`2` = js.native
  val RECORDING_OPTION_ANDROID_OUTPUT_FORMAT_RTP_AVP: expoLib.expoLibNumbers.`7` = js.native
  val RECORDING_OPTION_ANDROID_OUTPUT_FORMAT_THREE_GPP: expoLib.expoLibNumbers.`1` = js.native
  val RECORDING_OPTION_ANDROID_OUTPUT_FORMAT_WEBM: expoLib.expoLibNumbers.`9` = js.native
  val RECORDING_OPTION_IOS_AUDIO_QUALITY_HIGH: expoLib.expoLibNumbers.`0x60` = js.native
  val RECORDING_OPTION_IOS_AUDIO_QUALITY_LOW: expoLib.expoLibNumbers.`0x20` = js.native
  val RECORDING_OPTION_IOS_AUDIO_QUALITY_MAX: expoLib.expoLibNumbers.`0x7f` = js.native
  val RECORDING_OPTION_IOS_AUDIO_QUALITY_MEDIUM: expoLib.expoLibNumbers.`0x40` = js.native
  val RECORDING_OPTION_IOS_AUDIO_QUALITY_MIN: expoLib.expoLibNumbers.`0` = js.native
  val RECORDING_OPTION_IOS_BIT_RATE_STRATEGY_CONSTANT: expoLib.expoLibNumbers.`0` = js.native
  val RECORDING_OPTION_IOS_BIT_RATE_STRATEGY_LONG_TERM_AVERAGE: expoLib.expoLibNumbers.`1` = js.native
  val RECORDING_OPTION_IOS_BIT_RATE_STRATEGY_VARIABLE: expoLib.expoLibNumbers.`3` = js.native
  val RECORDING_OPTION_IOS_BIT_RATE_STRATEGY_VARIABLE_CONSTRAINED: expoLib.expoLibNumbers.`2` = js.native
  val RECORDING_OPTION_IOS_OUTPUT_FORMAT_60958AC3: expoLib.expoLibStrings.cac3 = js.native
  val RECORDING_OPTION_IOS_OUTPUT_FORMAT_AC3: expoLib.expoLibStrings.`ac-3` = js.native
  val RECORDING_OPTION_IOS_OUTPUT_FORMAT_AES3: expoLib.expoLibStrings.aes3 = js.native
  val RECORDING_OPTION_IOS_OUTPUT_FORMAT_ALAW: expoLib.expoLibStrings.alaw = js.native
  val RECORDING_OPTION_IOS_OUTPUT_FORMAT_AMR: expoLib.expoLibStrings.samr = js.native
  val RECORDING_OPTION_IOS_OUTPUT_FORMAT_AMR_WB: expoLib.expoLibStrings.sawb = js.native
  val RECORDING_OPTION_IOS_OUTPUT_FORMAT_APPLEIMA4: expoLib.expoLibStrings.ima4 = js.native
  val RECORDING_OPTION_IOS_OUTPUT_FORMAT_APPLELOSSLESS: expoLib.expoLibStrings.alac = js.native
  val RECORDING_OPTION_IOS_OUTPUT_FORMAT_AUDIBLE: expoLib.expoLibStrings.AUDB = js.native
  val RECORDING_OPTION_IOS_OUTPUT_FORMAT_DVIINTELIMA: expoLib.expoLibNumbers.`0x6d730011` = js.native
  val RECORDING_OPTION_IOS_OUTPUT_FORMAT_ENHANCEDAC3: expoLib.expoLibStrings.`ec-3` = js.native
  val RECORDING_OPTION_IOS_OUTPUT_FORMAT_ILBC: expoLib.expoLibStrings.ilbc = js.native
  val RECORDING_OPTION_IOS_OUTPUT_FORMAT_LINEARPCM: expoLib.expoLibStrings.lpcm = js.native
  val RECORDING_OPTION_IOS_OUTPUT_FORMAT_MACE3: expoLib.expoLibStrings.MAC3 = js.native
  val RECORDING_OPTION_IOS_OUTPUT_FORMAT_MACE6: expoLib.expoLibStrings.MAC6 = js.native
  val RECORDING_OPTION_IOS_OUTPUT_FORMAT_MICROSOFTGSM: expoLib.expoLibNumbers.`0x6d730031` = js.native
  val RECORDING_OPTION_IOS_OUTPUT_FORMAT_MPEG4AAC: expoLib.expoLibStrings.`aac ` = js.native
  val RECORDING_OPTION_IOS_OUTPUT_FORMAT_MPEG4AAC_ELD: expoLib.expoLibStrings.aace = js.native
  val RECORDING_OPTION_IOS_OUTPUT_FORMAT_MPEG4AAC_ELD_SBR: expoLib.expoLibStrings.aacf = js.native
  val RECORDING_OPTION_IOS_OUTPUT_FORMAT_MPEG4AAC_ELD_V2: expoLib.expoLibStrings.aacg = js.native
  val RECORDING_OPTION_IOS_OUTPUT_FORMAT_MPEG4AAC_HE: expoLib.expoLibStrings.aach = js.native
  val RECORDING_OPTION_IOS_OUTPUT_FORMAT_MPEG4AAC_HE_V2: expoLib.expoLibStrings.aacp = js.native
  val RECORDING_OPTION_IOS_OUTPUT_FORMAT_MPEG4AAC_LD: expoLib.expoLibStrings.aacl = js.native
  val RECORDING_OPTION_IOS_OUTPUT_FORMAT_MPEG4AAC_SPATIAL: expoLib.expoLibStrings.aacs = js.native
  val RECORDING_OPTION_IOS_OUTPUT_FORMAT_MPEG4CELP: expoLib.expoLibStrings.celp = js.native
  val RECORDING_OPTION_IOS_OUTPUT_FORMAT_MPEG4HVXC: expoLib.expoLibStrings.hvxc = js.native
  val RECORDING_OPTION_IOS_OUTPUT_FORMAT_MPEG4TWINVQ: expoLib.expoLibStrings.twvq = js.native
  val RECORDING_OPTION_IOS_OUTPUT_FORMAT_MPEGLAYER1: expoLib.expoLibStrings.DOTmp1 = js.native
  val RECORDING_OPTION_IOS_OUTPUT_FORMAT_MPEGLAYER2: expoLib.expoLibStrings.DOTmp2 = js.native
  val RECORDING_OPTION_IOS_OUTPUT_FORMAT_MPEGLAYER3: expoLib.expoLibStrings.DOTmp3 = js.native
  val RECORDING_OPTION_IOS_OUTPUT_FORMAT_QDESIGN: expoLib.expoLibStrings.QDMC = js.native
  val RECORDING_OPTION_IOS_OUTPUT_FORMAT_QDESIGN2: expoLib.expoLibStrings.QDM2 = js.native
  val RECORDING_OPTION_IOS_OUTPUT_FORMAT_QUALCOMM: expoLib.expoLibStrings.Qclp = js.native
  val RECORDING_OPTION_IOS_OUTPUT_FORMAT_ULAW: expoLib.expoLibStrings.ulaw = js.native
  def setAudioModeAsync(mode: AudioMode): js.Promise[scala.Unit] = js.native
  def setIsEnabledAsync(value: scala.Boolean): js.Promise[scala.Unit] = js.native
  @js.native
  object InterruptionModeAndroid extends js.Object {
    /** If this option is set, your experience’s audio interrupts audio from other apps. */
    @js.native
    sealed trait INTERRUPTION_MODE_ANDROID_DO_NOT_MIX
      extends expoLib.expoMod.AudioNs.InterruptionModeAndroid
    
    /** This is the default option. If this option is set, your experience’s audio lowers the volume ("ducks") of audio from other apps while your audio plays. */
    @js.native
    sealed trait INTERRUPTION_MODE_ANDROID_DUCK_OTHERS
      extends expoLib.expoMod.AudioNs.InterruptionModeAndroid
    
    /* 1 */ val INTERRUPTION_MODE_ANDROID_DO_NOT_MIX: INTERRUPTION_MODE_ANDROID_DO_NOT_MIX with scala.Double = js.native
    /* 2 */ val INTERRUPTION_MODE_ANDROID_DUCK_OTHERS: INTERRUPTION_MODE_ANDROID_DUCK_OTHERS with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[expoLib.expoMod.AudioNs.InterruptionModeAndroid with scala.Double] = js.native
  }
  
  @js.native
  object InterruptionModeIos extends js.Object {
    /** If this option is set, your experience’s audio interrupts audio from other apps. */
    @js.native
    sealed trait INTERRUPTION_MODE_IOS_DO_NOT_MIX
      extends expoLib.expoMod.AudioNs.InterruptionModeIos
    
    /** If this option is set, your experience’s audio lowers the volume ("ducks") of audio from other apps while your audio plays. */
    @js.native
    sealed trait INTERRUPTION_MODE_IOS_DUCK_OTHERS
      extends expoLib.expoMod.AudioNs.InterruptionModeIos
    
    /** This is the default option. If this option is set, your experience’s audio is mixed with audio playing in background apps. */
    @js.native
    sealed trait INTERRUPTION_MODE_IOS_MIX_WITH_OTHERS
      extends expoLib.expoMod.AudioNs.InterruptionModeIos
    
    /* 1 */ val INTERRUPTION_MODE_IOS_DO_NOT_MIX: INTERRUPTION_MODE_IOS_DO_NOT_MIX with scala.Double = js.native
    /* 2 */ val INTERRUPTION_MODE_IOS_DUCK_OTHERS: INTERRUPTION_MODE_IOS_DUCK_OTHERS with scala.Double = js.native
    /* 0 */ val INTERRUPTION_MODE_IOS_MIX_WITH_OTHERS: INTERRUPTION_MODE_IOS_MIX_WITH_OTHERS with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[expoLib.expoMod.AudioNs.InterruptionModeIos with scala.Double] = js.native
  }
  
  /** This class represents a sound corresponding to an Asset or URL. */
  @js.native
  object Sound extends js.Object {
    /**
      * Creates and loads a sound from source, with optional `initialStatus`, `onPlaybackStatusUpdate`, and `downloadFirst`.
      *
      * @returns A `Promise` that is rejected if creation failed, or fulfilled with the following dictionary if creation succeeded:
      * - `sound`: The newly created and loaded Sound object.
      * - `status`: The PlaybackStatus of the Sound object. See the AV documentation for further information.
      */
    def create(
      /**
      * The source of the sound. The following forms are supported:
      *
      * - A dictionary of the form `{ uri: 'http://path/to/file' }` with a network URL pointing to an audio file on the web.
      * - `require('path/to/file')` for an audio file asset in the source code directory.
      * - An `Expo.Asset` object for an audio file asset.
      */
    source: expoLib.expoMod.PlaybackSource
    ): js.Promise[expoLib.Anon_Sound] = js.native
    def create(
      /**
      * The source of the sound. The following forms are supported:
      *
      * - A dictionary of the form `{ uri: 'http://path/to/file' }` with a network URL pointing to an audio file on the web.
      * - `require('path/to/file')` for an audio file asset in the source code directory.
      * - An `Expo.Asset` object for an audio file asset.
      */
    source: expoLib.expoMod.PlaybackSource,
      /** The initial intended PlaybackStatusToSet of the sound, whose values will override the default initial playback status. This value defaults to `{}` if no parameter is passed. */
    initialStatus: expoLib.expoMod.PlaybackStatusToSet
    ): js.Promise[expoLib.Anon_Sound] = js.native
    def create(
      /**
      * The source of the sound. The following forms are supported:
      *
      * - A dictionary of the form `{ uri: 'http://path/to/file' }` with a network URL pointing to an audio file on the web.
      * - `require('path/to/file')` for an audio file asset in the source code directory.
      * - An `Expo.Asset` object for an audio file asset.
      */
    source: expoLib.expoMod.PlaybackSource,
      /** The initial intended PlaybackStatusToSet of the sound, whose values will override the default initial playback status. This value defaults to `{}` if no parameter is passed. */
    initialStatus: expoLib.expoMod.PlaybackStatusToSet,
      /** A function taking a single parameter PlaybackStatus. This value defaults to `null` if no parameter is passed. */
    onPlaybackStatusUpdate: js.Function1[/* status */ expoLib.expoMod.PlaybackStatus, scala.Unit]
    ): js.Promise[expoLib.Anon_Sound] = js.native
    def create(
      /**
      * The source of the sound. The following forms are supported:
      *
      * - A dictionary of the form `{ uri: 'http://path/to/file' }` with a network URL pointing to an audio file on the web.
      * - `require('path/to/file')` for an audio file asset in the source code directory.
      * - An `Expo.Asset` object for an audio file asset.
      */
    source: expoLib.expoMod.PlaybackSource,
      /** The initial intended PlaybackStatusToSet of the sound, whose values will override the default initial playback status. This value defaults to `{}` if no parameter is passed. */
    initialStatus: expoLib.expoMod.PlaybackStatusToSet,
      /** A function taking a single parameter PlaybackStatus. This value defaults to `null` if no parameter is passed. */
    onPlaybackStatusUpdate: js.Function1[/* status */ expoLib.expoMod.PlaybackStatus, scala.Unit],
      /** If set to true, the system will attempt to download the resource to the device before loading. This value defaults to `true`. Note that at the moment, this will only work for `source`s of the form `require('path/to/file')` or `Asset` objects. */
    downloadFirst: scala.Boolean
    ): js.Promise[expoLib.Anon_Sound] = js.native
    def create(
      /**
      * The source of the sound. The following forms are supported:
      *
      * - A dictionary of the form `{ uri: 'http://path/to/file' }` with a network URL pointing to an audio file on the web.
      * - `require('path/to/file')` for an audio file asset in the source code directory.
      * - An `Expo.Asset` object for an audio file asset.
      */
    source: expoLib.expoMod.PlaybackSource,
      /** The initial intended PlaybackStatusToSet of the sound, whose values will override the default initial playback status. This value defaults to `{}` if no parameter is passed. */
    initialStatus: expoLib.expoMod.PlaybackStatusToSet,
      /** A function taking a single parameter PlaybackStatus. This value defaults to `null` if no parameter is passed. */
    onPlaybackStatusUpdate: scala.Null,
      /** If set to true, the system will attempt to download the resource to the device before loading. This value defaults to `true`. Note that at the moment, this will only work for `source`s of the form `require('path/to/file')` or `Asset` objects. */
    downloadFirst: scala.Boolean
    ): js.Promise[expoLib.Anon_Sound] = js.native
  }
  
  type RecordingStatus = expoLib.Anon_CanRecord | expoLib.Anon_CanRecordTrue | expoLib.Anon_CanRecordFalse
}

