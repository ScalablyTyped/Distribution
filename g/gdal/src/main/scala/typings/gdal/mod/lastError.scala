package typings.gdal.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lastError {
  
  @JSImport("gdal", "lastError")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("gdal", "lastError.message")
  @js.native
  def message: Any = js.native
  inline def message_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("message")(x.asInstanceOf[js.Any])
  
  @JSImport("gdal", "lastError.number")
  @js.native
  def number: Any = js.native
  inline def number_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("number")(x.asInstanceOf[js.Any])
  
  @JSImport("gdal", "lastError.type")
  @js.native
  val `type`: Any = js.native
}
