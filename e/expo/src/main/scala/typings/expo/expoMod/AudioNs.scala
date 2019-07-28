package typings.expo.expoMod

import typings.expo.Anon_AudioEncoder
import typings.expo.Anon_AudioQuality
import typings.expo.Anon_Sound
import typings.expo.expoMod.AudioNs.AudioMode
import typings.expo.expoMod.AudioNs.InterruptionModeAndroid
import typings.expo.expoMod.AudioNs.InterruptionModeIos
import typings.expo.expoMod.AudioNs.RecordingStatus
import typings.expo.expoNumbers.`0`
import typings.expo.expoNumbers.`0x20`
import typings.expo.expoNumbers.`0x40`
import typings.expo.expoNumbers.`0x60`
import typings.expo.expoNumbers.`0x6d730011`
import typings.expo.expoNumbers.`0x6d730031`
import typings.expo.expoNumbers.`0x7f`
import typings.expo.expoNumbers.`1`
import typings.expo.expoNumbers.`2`
import typings.expo.expoNumbers.`3`
import typings.expo.expoNumbers.`4`
import typings.expo.expoNumbers.`5`
import typings.expo.expoNumbers.`6`
import typings.expo.expoNumbers.`7`
import typings.expo.expoNumbers.`8`
import typings.expo.expoNumbers.`9`
import typings.expo.expoNumbers.`false`
import typings.expo.expoNumbers.`true`
import typings.expo.expoStrings.AUDB
import typings.expo.expoStrings.DOTmp1
import typings.expo.expoStrings.DOTmp2
import typings.expo.expoStrings.DOTmp3
import typings.expo.expoStrings.MAC3
import typings.expo.expoStrings.MAC6
import typings.expo.expoStrings.QDM2
import typings.expo.expoStrings.QDMC
import typings.expo.expoStrings.Qclp
import typings.expo.expoStrings.`aac `
import typings.expo.expoStrings.`ac-3`
import typings.expo.expoStrings.`ec-3`
import typings.expo.expoStrings.aace
import typings.expo.expoStrings.aacf
import typings.expo.expoStrings.aacg
import typings.expo.expoStrings.aach
import typings.expo.expoStrings.aacl
import typings.expo.expoStrings.aacp
import typings.expo.expoStrings.aacs
import typings.expo.expoStrings.aes3
import typings.expo.expoStrings.alac
import typings.expo.expoStrings.alaw
import typings.expo.expoStrings.cac3
import typings.expo.expoStrings.celp
import typings.expo.expoStrings.hvxc
import typings.expo.expoStrings.ilbc
import typings.expo.expoStrings.ima4
import typings.expo.expoStrings.lpcm
import typings.expo.expoStrings.samr
import typings.expo.expoStrings.sawb
import typings.expo.expoStrings.twvq
import typings.expo.expoStrings.ulaw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo", "Audio")
@js.native
object AudioNs extends js.Object {
  trait AudioMode extends js.Object {
    /** Boolean selecting if recording is enabled on iOS. This value defaults to `false`. NOTE: when this flag is set to true, playback may be routed to the phone receiver instead of to the speaker. */
    var allowsRecordingIOS: Boolean
    /** an enum selecting how your experience’s audio should interact with the audio from other apps on Android: */
    var interruptionModeAndroid: InterruptionModeAndroid
    /** Enum selecting how your experience’s audio should interact with the audio from other apps on iOS. */
    var interruptionModeIOS: InterruptionModeIos
    /** Boolean selecting if your experience’s audio should route to earpiece on Android: */
    var playThroughEarpieceAndroid: Boolean
    /** Boolean selecting if your experience’s audio should play in silent mode on iOS. This value defaults to `false`. */
    var playsInSilentModeIOS: Boolean
    /** Boolean selecting if your experience’s audio should automatically be lowered in volume ("duck") if audio from another app interrupts your experience. This value defaults to true. If false, audio from other apps will pause your audio. */
    var shouldDuckAndroid: Boolean
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
    def createNewLoadedSound(): js.Promise[Anon_Sound] = js.native
    def createNewLoadedSound(
      /** The initial intended `PlaybackStatusToSet` of the sound, whose values will override the default initial playback status. This value defaults to `{}` if no parameter is passed. */
    initialStatus: PlaybackStatusToSet
    ): js.Promise[Anon_Sound] = js.native
    def createNewLoadedSound(
      /** The initial intended `PlaybackStatusToSet` of the sound, whose values will override the default initial playback status. This value defaults to `{}` if no parameter is passed. */
    initialStatus: PlaybackStatusToSet,
      /** A function taking a single parameter `PlaybackStatus`. This value defaults to `null` if no parameter is passed. */
    onPlaybackStatusUpdate: js.Function1[/* status */ PlaybackStatus, Unit]
    ): js.Promise[Anon_Sound] = js.native
    /** Gets the `status` of the `Recording`. */
    def getStatusAsync(): js.Promise[RecordingStatus] = js.native
    /**
      * Gets the local URI of the Recording. Note that this will only succeed once the Recording is prepared to record.
      *
      * @returns A string with the local URI of the `Recording`, or `null` if the `Recording` is not prepared to record.
      */
    def getURI(): js.UndefOr[String | Null] = js.native
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
    options: typings.expo.expoMod.AudioNs.RecordingOptions
    ): js.Promise[RecordingStatus] = js.native
    /** Sets a function to be called regularly with the `status` of the `Recording`. */
    def setOnRecordingStatusUpdate(): Unit = js.native
    def setOnRecordingStatusUpdate(onRecordingStatusUpdate: js.Function1[/* status */ RecordingStatus, Unit]): Unit = js.native
    /** Sets the interval with which onRecordingStatusUpdate is called while the recording can record. This value defaults to 500 milliseconds. */
    def setProgressUpdateInterval(progressUpdateIntervalMillis: Double): Unit = js.native
    /** Begins recording. This method can only be called if the `Recording` has been prepared. */
    def startAsync(): js.Promise[RecordingStatus] = js.native
    /** Stops the recording and deallocates the recorder from memory. This reverts the Recording instance to an unprepared state, and another Recording instance must be created in order to record again. This method can only be called if the `Recording` has been prepared. */
    def stopAndUnloadAsync(): js.Promise[RecordingStatus] = js.native
  }
  
  trait RecordingOptions extends js.Object {
    var android: Anon_AudioEncoder
    var ios: Anon_AudioQuality
  }
  
  trait RecordingStatus extends js.Object {
    var canRecord: js.UndefOr[`false` | `true`] = js.undefined
    var durationMillis: js.UndefOr[Double] = js.undefined
    var isDoneRecording: js.UndefOr[`false` | `true`] = js.undefined
    var isRecording: js.UndefOr[Boolean] = js.undefined
  }
  
  /** This class represents a sound corresponding to an Asset or URL. */
  @js.native
  class Sound () extends PlaybackObject
  
  val INTERRUPTION_MODE_ANDROID_DO_NOT_MIX: `1` = js.native
  val INTERRUPTION_MODE_ANDROID_DUCK_OTHERS: `2` = js.native
  val INTERRUPTION_MODE_IOS_DO_NOT_MIX: `1` = js.native
  val INTERRUPTION_MODE_IOS_DUCK_OTHERS: `2` = js.native
  val INTERRUPTION_MODE_IOS_MIX_WITH_OTHERS: `0` = js.native
  val RECORDING_OPTIONS_PRESET_HIGH_QUALITY: typings.expo.expoMod.AudioNs.RecordingOptions = js.native
  val RECORDING_OPTIONS_PRESET_LOW_QUALITY: typings.expo.expoMod.AudioNs.RecordingOptions = js.native
  val RECORDING_OPTION_ANDROID_AUDIO_ENCODER_AAC: `3` = js.native
  val RECORDING_OPTION_ANDROID_AUDIO_ENCODER_AAC_ELD: `5` = js.native
  val RECORDING_OPTION_ANDROID_AUDIO_ENCODER_AMR_NB: `1` = js.native
  val RECORDING_OPTION_ANDROID_AUDIO_ENCODER_AMR_WB: `2` = js.native
  val RECORDING_OPTION_ANDROID_AUDIO_ENCODER_DEFAULT: `0` = js.native
  val RECORDING_OPTION_ANDROID_AUDIO_ENCODER_HE_AAC: `4` = js.native
  val RECORDING_OPTION_ANDROID_AUDIO_ENCODER_VORBIS: `6` = js.native
  val RECORDING_OPTION_ANDROID_OUTPUT_FORMAT_AAC_ADIF: `5` = js.native
  val RECORDING_OPTION_ANDROID_OUTPUT_FORMAT_AAC_ADTS: `6` = js.native
  val RECORDING_OPTION_ANDROID_OUTPUT_FORMAT_AMR_NB: `3` = js.native
  val RECORDING_OPTION_ANDROID_OUTPUT_FORMAT_AMR_WB: `4` = js.native
  val RECORDING_OPTION_ANDROID_OUTPUT_FORMAT_DEFAULT: `0` = js.native
  val RECORDING_OPTION_ANDROID_OUTPUT_FORMAT_MPEG2TS: `8` = js.native
  val RECORDING_OPTION_ANDROID_OUTPUT_FORMAT_MPEG_4: `2` = js.native
  val RECORDING_OPTION_ANDROID_OUTPUT_FORMAT_RTP_AVP: `7` = js.native
  val RECORDING_OPTION_ANDROID_OUTPUT_FORMAT_THREE_GPP: `1` = js.native
  val RECORDING_OPTION_ANDROID_OUTPUT_FORMAT_WEBM: `9` = js.native
  val RECORDING_OPTION_IOS_AUDIO_QUALITY_HIGH: `0x60` = js.native
  val RECORDING_OPTION_IOS_AUDIO_QUALITY_LOW: `0x20` = js.native
  val RECORDING_OPTION_IOS_AUDIO_QUALITY_MAX: `0x7f` = js.native
  val RECORDING_OPTION_IOS_AUDIO_QUALITY_MEDIUM: `0x40` = js.native
  val RECORDING_OPTION_IOS_AUDIO_QUALITY_MIN: `0` = js.native
  val RECORDING_OPTION_IOS_BIT_RATE_STRATEGY_CONSTANT: `0` = js.native
  val RECORDING_OPTION_IOS_BIT_RATE_STRATEGY_LONG_TERM_AVERAGE: `1` = js.native
  val RECORDING_OPTION_IOS_BIT_RATE_STRATEGY_VARIABLE: `3` = js.native
  val RECORDING_OPTION_IOS_BIT_RATE_STRATEGY_VARIABLE_CONSTRAINED: `2` = js.native
  val RECORDING_OPTION_IOS_OUTPUT_FORMAT_60958AC3: cac3 = js.native
  val RECORDING_OPTION_IOS_OUTPUT_FORMAT_AC3: `ac-3` = js.native
  val RECORDING_OPTION_IOS_OUTPUT_FORMAT_AES3: aes3 = js.native
  val RECORDING_OPTION_IOS_OUTPUT_FORMAT_ALAW: alaw = js.native
  val RECORDING_OPTION_IOS_OUTPUT_FORMAT_AMR: samr = js.native
  val RECORDING_OPTION_IOS_OUTPUT_FORMAT_AMR_WB: sawb = js.native
  val RECORDING_OPTION_IOS_OUTPUT_FORMAT_APPLEIMA4: ima4 = js.native
  val RECORDING_OPTION_IOS_OUTPUT_FORMAT_APPLELOSSLESS: alac = js.native
  val RECORDING_OPTION_IOS_OUTPUT_FORMAT_AUDIBLE: AUDB = js.native
  val RECORDING_OPTION_IOS_OUTPUT_FORMAT_DVIINTELIMA: `0x6d730011` = js.native
  val RECORDING_OPTION_IOS_OUTPUT_FORMAT_ENHANCEDAC3: `ec-3` = js.native
  val RECORDING_OPTION_IOS_OUTPUT_FORMAT_ILBC: ilbc = js.native
  val RECORDING_OPTION_IOS_OUTPUT_FORMAT_LINEARPCM: lpcm = js.native
  val RECORDING_OPTION_IOS_OUTPUT_FORMAT_MACE3: MAC3 = js.native
  val RECORDING_OPTION_IOS_OUTPUT_FORMAT_MACE6: MAC6 = js.native
  val RECORDING_OPTION_IOS_OUTPUT_FORMAT_MICROSOFTGSM: `0x6d730031` = js.native
  val RECORDING_OPTION_IOS_OUTPUT_FORMAT_MPEG4AAC: `aac ` = js.native
  val RECORDING_OPTION_IOS_OUTPUT_FORMAT_MPEG4AAC_ELD: aace = js.native
  val RECORDING_OPTION_IOS_OUTPUT_FORMAT_MPEG4AAC_ELD_SBR: aacf = js.native
  val RECORDING_OPTION_IOS_OUTPUT_FORMAT_MPEG4AAC_ELD_V2: aacg = js.native
  val RECORDING_OPTION_IOS_OUTPUT_FORMAT_MPEG4AAC_HE: aach = js.native
  val RECORDING_OPTION_IOS_OUTPUT_FORMAT_MPEG4AAC_HE_V2: aacp = js.native
  val RECORDING_OPTION_IOS_OUTPUT_FORMAT_MPEG4AAC_LD: aacl = js.native
  val RECORDING_OPTION_IOS_OUTPUT_FORMAT_MPEG4AAC_SPATIAL: aacs = js.native
  val RECORDING_OPTION_IOS_OUTPUT_FORMAT_MPEG4CELP: celp = js.native
  val RECORDING_OPTION_IOS_OUTPUT_FORMAT_MPEG4HVXC: hvxc = js.native
  val RECORDING_OPTION_IOS_OUTPUT_FORMAT_MPEG4TWINVQ: twvq = js.native
  val RECORDING_OPTION_IOS_OUTPUT_FORMAT_MPEGLAYER1: DOTmp1 = js.native
  val RECORDING_OPTION_IOS_OUTPUT_FORMAT_MPEGLAYER2: DOTmp2 = js.native
  val RECORDING_OPTION_IOS_OUTPUT_FORMAT_MPEGLAYER3: DOTmp3 = js.native
  val RECORDING_OPTION_IOS_OUTPUT_FORMAT_QDESIGN: QDMC = js.native
  val RECORDING_OPTION_IOS_OUTPUT_FORMAT_QDESIGN2: QDM2 = js.native
  val RECORDING_OPTION_IOS_OUTPUT_FORMAT_QUALCOMM: Qclp = js.native
  val RECORDING_OPTION_IOS_OUTPUT_FORMAT_ULAW: ulaw = js.native
  def setAudioModeAsync(mode: AudioMode): js.Promise[Unit] = js.native
  def setIsEnabledAsync(value: Boolean): js.Promise[Unit] = js.native
  @js.native
  object InterruptionModeAndroid extends js.Object {
    /** If this option is set, your experience’s audio interrupts audio from other apps. */
    @js.native
    sealed trait INTERRUPTION_MODE_ANDROID_DO_NOT_MIX extends InterruptionModeAndroid
    
    /** This is the default option. If this option is set, your experience’s audio lowers the volume ("ducks") of audio from other apps while your audio plays. */
    @js.native
    sealed trait INTERRUPTION_MODE_ANDROID_DUCK_OTHERS extends InterruptionModeAndroid
    
    /* 1 */ val INTERRUPTION_MODE_ANDROID_DO_NOT_MIX: typings.expo.expoMod.AudioNs.InterruptionModeAndroid.INTERRUPTION_MODE_ANDROID_DO_NOT_MIX with Double = js.native
    /* 2 */ val INTERRUPTION_MODE_ANDROID_DUCK_OTHERS: typings.expo.expoMod.AudioNs.InterruptionModeAndroid.INTERRUPTION_MODE_ANDROID_DUCK_OTHERS with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[InterruptionModeAndroid with Double] = js.native
  }
  
  @js.native
  object InterruptionModeIos extends js.Object {
    /** If this option is set, your experience’s audio interrupts audio from other apps. */
    @js.native
    sealed trait INTERRUPTION_MODE_IOS_DO_NOT_MIX extends InterruptionModeIos
    
    /** If this option is set, your experience’s audio lowers the volume ("ducks") of audio from other apps while your audio plays. */
    @js.native
    sealed trait INTERRUPTION_MODE_IOS_DUCK_OTHERS extends InterruptionModeIos
    
    /** This is the default option. If this option is set, your experience’s audio is mixed with audio playing in background apps. */
    @js.native
    sealed trait INTERRUPTION_MODE_IOS_MIX_WITH_OTHERS extends InterruptionModeIos
    
    /* 1 */ val INTERRUPTION_MODE_IOS_DO_NOT_MIX: typings.expo.expoMod.AudioNs.InterruptionModeIos.INTERRUPTION_MODE_IOS_DO_NOT_MIX with Double = js.native
    /* 2 */ val INTERRUPTION_MODE_IOS_DUCK_OTHERS: typings.expo.expoMod.AudioNs.InterruptionModeIos.INTERRUPTION_MODE_IOS_DUCK_OTHERS with Double = js.native
    /* 0 */ val INTERRUPTION_MODE_IOS_MIX_WITH_OTHERS: typings.expo.expoMod.AudioNs.InterruptionModeIos.INTERRUPTION_MODE_IOS_MIX_WITH_OTHERS with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[InterruptionModeIos with Double] = js.native
  }
  
  /* static members */
  @js.native
  object Sound extends js.Object {
    /**
      * Creates and loads a sound from source, with optional `initialStatus`, `onPlaybackStatusUpdate`, and `downloadFirst`.
      *
      * @returns A `Promise` that is rejected if creation failed, or fulfilled with the following dictionary if creation succeeded:
      * - `sound`: The newly created and loaded Sound object.
      * - `status`: The PlaybackStatus of the Sound object. See the AV documentation for further information.
      */
    def createAsync(
      /**
      * The source of the sound. The following forms are supported:
      *
      * - A dictionary of the form `{ uri: 'http://path/to/file' }` with a network URL pointing to an audio file on the web.
      * - `require('path/to/file')` for an audio file asset in the source code directory.
      * - An `Expo.Asset` object for an audio file asset.
      */
    source: PlaybackSource
    ): js.Promise[Anon_Sound] = js.native
    def createAsync(
      /**
      * The source of the sound. The following forms are supported:
      *
      * - A dictionary of the form `{ uri: 'http://path/to/file' }` with a network URL pointing to an audio file on the web.
      * - `require('path/to/file')` for an audio file asset in the source code directory.
      * - An `Expo.Asset` object for an audio file asset.
      */
    source: PlaybackSource,
      /** The initial intended PlaybackStatusToSet of the sound, whose values will override the default initial playback status. This value defaults to `{}` if no parameter is passed. */
    initialStatus: PlaybackStatusToSet
    ): js.Promise[Anon_Sound] = js.native
    def createAsync(
      /**
      * The source of the sound. The following forms are supported:
      *
      * - A dictionary of the form `{ uri: 'http://path/to/file' }` with a network URL pointing to an audio file on the web.
      * - `require('path/to/file')` for an audio file asset in the source code directory.
      * - An `Expo.Asset` object for an audio file asset.
      */
    source: PlaybackSource,
      /** The initial intended PlaybackStatusToSet of the sound, whose values will override the default initial playback status. This value defaults to `{}` if no parameter is passed. */
    initialStatus: PlaybackStatusToSet,
      /** A function taking a single parameter PlaybackStatus. This value defaults to `null` if no parameter is passed. */
    onPlaybackStatusUpdate: js.Function1[/* status */ PlaybackStatus, Unit]
    ): js.Promise[Anon_Sound] = js.native
    def createAsync(
      /**
      * The source of the sound. The following forms are supported:
      *
      * - A dictionary of the form `{ uri: 'http://path/to/file' }` with a network URL pointing to an audio file on the web.
      * - `require('path/to/file')` for an audio file asset in the source code directory.
      * - An `Expo.Asset` object for an audio file asset.
      */
    source: PlaybackSource,
      /** The initial intended PlaybackStatusToSet of the sound, whose values will override the default initial playback status. This value defaults to `{}` if no parameter is passed. */
    initialStatus: PlaybackStatusToSet,
      /** A function taking a single parameter PlaybackStatus. This value defaults to `null` if no parameter is passed. */
    onPlaybackStatusUpdate: js.Function1[/* status */ PlaybackStatus, Unit],
      /** If set to true, the system will attempt to download the resource to the device before loading. This value defaults to `true`. Note that at the moment, this will only work for `source`s of the form `require('path/to/file')` or `Asset` objects. */
    downloadFirst: Boolean
    ): js.Promise[Anon_Sound] = js.native
    def createAsync(
      /**
      * The source of the sound. The following forms are supported:
      *
      * - A dictionary of the form `{ uri: 'http://path/to/file' }` with a network URL pointing to an audio file on the web.
      * - `require('path/to/file')` for an audio file asset in the source code directory.
      * - An `Expo.Asset` object for an audio file asset.
      */
    source: PlaybackSource,
      /** The initial intended PlaybackStatusToSet of the sound, whose values will override the default initial playback status. This value defaults to `{}` if no parameter is passed. */
    initialStatus: PlaybackStatusToSet,
      /** A function taking a single parameter PlaybackStatus. This value defaults to `null` if no parameter is passed. */
    onPlaybackStatusUpdate: Null,
      /** If set to true, the system will attempt to download the resource to the device before loading. This value defaults to `true`. Note that at the moment, this will only work for `source`s of the form `require('path/to/file')` or `Asset` objects. */
    downloadFirst: Boolean
    ): js.Promise[Anon_Sound] = js.native
  }
  
}

