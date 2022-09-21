package typings.domMediacaptureTransform

import typings.domWebcodecs.VideoFrame
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.std.EventTarget because Already inherited
- typings.std.MediaStreamTrack because Already inherited
- typings.domMediacaptureTransform.MediaStreamVideoTrack because var conflicts: contentHint, enabled, onended, onmute, onunmute. Inlined clone */ @js.native
trait MediaStreamVideoTrackGenerator
  extends StObject
     with MediaStreamTrackGenerator[VideoFrame]
