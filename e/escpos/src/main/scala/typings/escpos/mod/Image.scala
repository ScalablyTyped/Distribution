package typings.escpos.mod

import typings.escpos.anon.Colors
import typings.escpos.anon.Data
import typings.escpos.anon.Height
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("escpos", "Image")
@js.native
open class Image protected () extends StObject {
  def this(pixels: Any) = this()
  
  def size(): Colors = js.native
  
  def toBitmap(): Data = js.native
  def toBitmap(density: Double): Data = js.native
  
  def toRaster(): Height = js.native
}
/* static members */
object Image {
  
  @JSImport("escpos", "Image")
  @js.native
  val ^ : js.Any = js.native
  
  inline def load(url: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(url.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def load(url: String, callback: js.Function1[/* result */ this.type | js.Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(url.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def load(url: String, `type`: MIME_TYPE): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(url.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def load(url: String, `type`: MIME_TYPE, callback: js.Function1[/* result */ this.type | js.Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(url.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
