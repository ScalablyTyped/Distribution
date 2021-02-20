package typings.firebaseStorage

import typings.std.ArrayBuffer
import typings.std.Blob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fsMod {
  
  @JSImport("@firebase/storage/dist/src/implementation/fs", "getBlob")
  @js.native
  def getBlob(args: (String | Blob | ArrayBuffer)*): Blob = js.native
  
  @JSImport("@firebase/storage/dist/src/implementation/fs", "sliceBlob")
  @js.native
  def sliceBlob(blob: Blob, start: Double, end: Double): Blob | Null = js.native
}
