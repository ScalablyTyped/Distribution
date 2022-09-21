package typings.domMediacaptureTransform

import typings.domMediacaptureTransform.domMediacaptureTransformStrings.audio
import typings.std.MediaStreamTrack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Versioning:
// Until the above-mentioned spec is finalized, the major version number is 0. Although not
// necessary for version 0, consider incrementing the minor version number for breaking changes.
// The following modify existing DOM types to allow defining type-safe APIs on audio and video tracks.
/** Specialize MediaStreamTrack so that we can refer specifically to an audio track. */
@js.native
trait MediaStreamAudioTrack
  extends StObject
     with MediaStreamTrack {
  
  @JSName("kind")
  val kind_MediaStreamAudioTrack: audio = js.native
}
