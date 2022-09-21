package typings.extractFiles

import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Clone[TFile] extends StObject {
    
    @JSName("clone")
    var clone_FClone: Any
    
    var files: Map[TFile, js.Array[String]]
  }
  object Clone {
    
    inline def apply[TFile](clone_ : Any, files: Map[TFile, js.Array[String]]): Clone[TFile] = {
      val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any])
      __obj.updateDynamic("clone")(clone_.asInstanceOf[js.Any])
      __obj.asInstanceOf[Clone[TFile]]
    }
    
    extension [Self <: Clone[?], TFile](x: Self & Clone[TFile]) {
      
      inline def setClone_(value: Any): Self = StObject.set(x, "clone", value.asInstanceOf[js.Any])
      
      inline def setFiles(value: Map[TFile, js.Array[String]]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    }
  }
}
