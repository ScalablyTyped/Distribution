package typings.expoPlist

import typings.expoPlist.buildMod.PlistValue
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildOsxBinaryMod {
  
  @JSImport("@expo/plist/build/osxBinary", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@expo/plist/build/osxBinary", "UID")
  @js.native
  open class UID protected () extends StObject {
    def this(UID: Double) = this()
    
    var UID: Double = js.native
  }
  
  @JSImport("@expo/plist/build/osxBinary", "maxObjectCount")
  @js.native
  val maxObjectCount: /* 32768 */ Double = js.native
  
  @JSImport("@expo/plist/build/osxBinary", "maxObjectSize")
  @js.native
  val maxObjectSize: Double = js.native
  
  inline def parseBuffer(buffer: Buffer): js.Array[UID | PlistValue | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseBuffer")(buffer.asInstanceOf[js.Any]).asInstanceOf[js.Array[UID | PlistValue | Null]]
  
  inline def parseFile(fileNameOrBuffer: String): js.Promise[js.Array[UID | PlistValue | Null]] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseFile")(fileNameOrBuffer.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[UID | PlistValue | Null]]]
  inline def parseFile(fileNameOrBuffer: Buffer): js.Promise[js.Array[UID | PlistValue | Null]] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseFile")(fileNameOrBuffer.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[UID | PlistValue | Null]]]
}
