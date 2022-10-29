package typings.exifReader

import typings.exifReader.anon.Exif
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /** Decode raw EXIF data from a `Buffer` */
  inline def apply(buffer: Buffer): Exif = ^.asInstanceOf[js.Dynamic].apply(buffer.asInstanceOf[js.Any]).asInstanceOf[Exif]
  
  @JSImport("exif-reader", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
