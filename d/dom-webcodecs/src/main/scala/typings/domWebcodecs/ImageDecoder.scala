package typings.domWebcodecs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Available only in secure contexts. */
@js.native
trait ImageDecoder extends StObject {
  
  def close(): Unit = js.native
  
  val complete: Boolean = js.native
  
  val completed: js.Promise[Unit] = js.native
  
  def decode(): js.Promise[ImageDecodeResult] = js.native
  def decode(options: ImageDecodeOptions): js.Promise[ImageDecodeResult] = js.native
  
  def reset(): Unit = js.native
  
  val tracks: ImageTrackList = js.native
  
  val `type`: String = js.native
}
