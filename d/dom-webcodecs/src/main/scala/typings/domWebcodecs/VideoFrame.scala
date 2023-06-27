package typings.domWebcodecs

import typings.std.DOMRectReadOnly
import typings.std.VideoPixelFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VideoFrame extends StObject {
  
  def allocationSize(): Double = js.native
  def allocationSize(options: VideoFrameCopyToOptions): Double = js.native
  
  def close(): Unit = js.native
  
  val codedHeight: Double = js.native
  
  val codedRect: DOMRectReadOnly | Null = js.native
  
  val codedWidth: Double = js.native
  
  val colorSpace: VideoColorSpace = js.native
  
  def copyTo(
    destination: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AllowSharedBufferSource */ Any
  ): js.Promise[js.Array[PlaneLayout]] = js.native
  def copyTo(
    destination: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AllowSharedBufferSource */ Any,
    options: VideoFrameCopyToOptions
  ): js.Promise[js.Array[PlaneLayout]] = js.native
  
  val displayHeight: Double = js.native
  
  val displayWidth: Double = js.native
  
  val duration: Double | Null = js.native
  
  val format: VideoPixelFormat | Null = js.native
  
  val timestamp: Double = js.native
  
  val visibleRect: DOMRectReadOnly | Null = js.native
}
