package typings.doNotZip

import typings.node.bufferMod.global.Buffer
import typings.std.Blob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("do-not-zip", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def toArray(files: js.Array[File]): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(files.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  inline def toAuto(files: js.Array[File]): Buffer | Blob = ^.asInstanceOf[js.Dynamic].applyDynamic("toAuto")(files.asInstanceOf[js.Any]).asInstanceOf[Buffer | Blob]
  
  inline def toBlob(files: js.Array[File]): Blob = ^.asInstanceOf[js.Dynamic].applyDynamic("toBlob")(files.asInstanceOf[js.Any]).asInstanceOf[Blob]
  
  inline def toBuffer(files: js.Array[File]): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("toBuffer")(files.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  trait File extends StObject {
    
    var data: Any
    
    var path: String
  }
  object File {
    
    inline def apply(data: Any, path: String): File = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[File]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: File] (val x: Self) extends AnyVal {
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
}
