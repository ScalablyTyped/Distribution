package typings.gm.mod

import typings.node.bufferMod.global.Buffer
import typings.std.ReadableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubClass_ extends StObject {
  
  def apply(image: String): State = js.native
  def apply(stream: Buffer): State = js.native
  def apply(stream: Buffer, image: String): State = js.native
  def apply(stream: ReadableStream[Any]): State = js.native
  def apply(stream: ReadableStream[Any], image: String): State = js.native
  def apply(width: Double, height: Double): State = js.native
  def apply(width: Double, height: Double, color: String): State = js.native
}
