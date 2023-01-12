package typings.flashpointLauncher.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ZipProgress extends StObject {
  
  var file: String
  
  var fileCount: Double
  
  var percent: Double
}
object ZipProgress {
  
  inline def apply(file: String, fileCount: Double, percent: Double): ZipProgress = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], fileCount = fileCount.asInstanceOf[js.Any], percent = percent.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZipProgress]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ZipProgress] (val x: Self) extends AnyVal {
    
    inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setFileCount(value: Double): Self = StObject.set(x, "fileCount", value.asInstanceOf[js.Any])
    
    inline def setPercent(value: Double): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
  }
}
