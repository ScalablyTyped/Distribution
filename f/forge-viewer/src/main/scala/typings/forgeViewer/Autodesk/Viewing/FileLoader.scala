package typings.forgeViewer.Autodesk.Viewing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileLoader extends StObject {
  
  def is3d(): Boolean
  
  def loadFile(
    url: String,
    options: FileLoaderOptions,
    onSuccess: js.Function0[Unit],
    onError: js.Function0[Unit]
  ): Unit
}
object FileLoader {
  
  inline def apply(
    is3d: () => Boolean,
    loadFile: (String, FileLoaderOptions, js.Function0[Unit], js.Function0[Unit]) => Unit
  ): FileLoader = {
    val __obj = js.Dynamic.literal(is3d = js.Any.fromFunction0(is3d), loadFile = js.Any.fromFunction4(loadFile))
    __obj.asInstanceOf[FileLoader]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FileLoader] (val x: Self) extends AnyVal {
    
    inline def setIs3d(value: () => Boolean): Self = StObject.set(x, "is3d", js.Any.fromFunction0(value))
    
    inline def setLoadFile(value: (String, FileLoaderOptions, js.Function0[Unit], js.Function0[Unit]) => Unit): Self = StObject.set(x, "loadFile", js.Any.fromFunction4(value))
  }
}
