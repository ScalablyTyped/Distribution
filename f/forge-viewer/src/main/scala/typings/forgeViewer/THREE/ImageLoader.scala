package typings.forgeViewer.THREE

import typings.std.HTMLImageElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageLoader extends StObject {
  
  var crossOrigin: String = js.native
  
  def load(url: String): HTMLImageElement = js.native
  def load(url: String, onLoad: js.Function1[/* image */ HTMLImageElement, Unit]): HTMLImageElement = js.native
  def load(
    url: String,
    onLoad: js.Function1[/* image */ HTMLImageElement, Unit],
    onProgress: js.Function1[/* event */ Any, Unit]
  ): HTMLImageElement = js.native
  def load(
    url: String,
    onLoad: js.Function1[/* image */ HTMLImageElement, Unit],
    onProgress: js.Function1[/* event */ Any, Unit],
    onError: js.Function1[/* event */ Any, Unit]
  ): HTMLImageElement = js.native
  def load(
    url: String,
    onLoad: js.Function1[/* image */ HTMLImageElement, Unit],
    onProgress: Unit,
    onError: js.Function1[/* event */ Any, Unit]
  ): HTMLImageElement = js.native
  def load(url: String, onLoad: Unit, onProgress: js.Function1[/* event */ Any, Unit]): HTMLImageElement = js.native
  def load(
    url: String,
    onLoad: Unit,
    onProgress: js.Function1[/* event */ Any, Unit],
    onError: js.Function1[/* event */ Any, Unit]
  ): HTMLImageElement = js.native
  def load(url: String, onLoad: Unit, onProgress: Unit, onError: js.Function1[/* event */ Any, Unit]): HTMLImageElement = js.native
  
  var manager: LoadingManager = js.native
  
  var path: String = js.native
  
  def setCrossOrigin(crossOrigin: String): ImageLoader = js.native
  
  def setPath(value: Any): ImageLoader = js.native
}
