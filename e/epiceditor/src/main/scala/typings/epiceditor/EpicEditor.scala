package typings.epiceditor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EpicEditor extends StObject {
  
  def edit(): Unit = js.native
  
  def emit(event: String): Unit = js.native
  
  def enterFullscreen(): Unit = js.native
  
  def exitFullscreen(): Unit = js.native
  
  def exportFile(): js.Any = js.native
  def exportFile(filename: String): js.Any = js.native
  def exportFile(filename: String, `type`: String): js.Any = js.native
  def exportFile(filename: Unit, `type`: String): js.Any = js.native
  
  def getElement(element: String): js.Any = js.native
  
  def getFiles(): js.Any = js.native
  def getFiles(filename: String): js.Any = js.native
  
  def importFile(): Unit = js.native
  def importFile(filename: String): Unit = js.native
  def importFile(filename: String, content: String): Unit = js.native
  def importFile(filename: Unit, content: String): Unit = js.native
  
  def is(state: String): Boolean = js.native
  
  def load(): EpicEditor = js.native
  def load(callback: js.Function): EpicEditor = js.native
  
  def on(event: String, handler: js.Function): Unit = js.native
  
  def open(filename: String): js.Any = js.native
  
  def preview(): Unit = js.native
  
  def reflow(): Unit = js.native
  def reflow(`type`: String): Unit = js.native
  
  def remove(filename: String): Unit = js.native
  
  def removeListener(event: String): Unit = js.native
  def removeListener(event: String, handler: js.Function): Unit = js.native
  
  def rename(oldName: String, newName: String): Unit = js.native
  
  def save(): Unit = js.native
  
  def unload(): EpicEditor = js.native
  def unload(callback: js.Function): EpicEditor = js.native
}
