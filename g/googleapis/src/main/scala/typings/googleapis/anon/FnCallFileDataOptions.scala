package typings.googleapis.anon

import typings.node.fsMod.PathOrFileDescriptor
import typings.node.fsMod.WriteFileOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallFileDataOptions extends StObject {
  
  def apply(file: PathOrFileDescriptor, data: String): scala.Unit = js.native
  def apply(file: PathOrFileDescriptor, data: String, options: WriteFileOptions): scala.Unit = js.native
  def apply(file: PathOrFileDescriptor, data: js.typedarray.ArrayBufferView): scala.Unit = js.native
  def apply(file: PathOrFileDescriptor, data: js.typedarray.ArrayBufferView, options: WriteFileOptions): scala.Unit = js.native
}
