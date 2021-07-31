package typings.genReadlines

import typings.node.Buffer
import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(fd: Double, filesize: Double): IterableIterator[Buffer] = (^.asInstanceOf[js.Dynamic].apply(fd.asInstanceOf[js.Any], filesize.asInstanceOf[js.Any])).asInstanceOf[IterableIterator[Buffer]]
  @scala.inline
  def apply(fd: Double, filesize: Double, bufferSize: Double): IterableIterator[Buffer] = (^.asInstanceOf[js.Dynamic].apply(fd.asInstanceOf[js.Any], filesize.asInstanceOf[js.Any], bufferSize.asInstanceOf[js.Any])).asInstanceOf[IterableIterator[Buffer]]
  @scala.inline
  def apply(fd: Double, filesize: Double, bufferSize: Double, position: Double): IterableIterator[Buffer] = (^.asInstanceOf[js.Dynamic].apply(fd.asInstanceOf[js.Any], filesize.asInstanceOf[js.Any], bufferSize.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[IterableIterator[Buffer]]
  @scala.inline
  def apply(fd: Double, filesize: Double, bufferSize: Unit, position: Double): IterableIterator[Buffer] = (^.asInstanceOf[js.Dynamic].apply(fd.asInstanceOf[js.Any], filesize.asInstanceOf[js.Any], bufferSize.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[IterableIterator[Buffer]]
  
  @JSImport("gen-readlines", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
