package typings.figma.mod.global

import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExportMixin extends StObject {
  
  def exportAsync(): js.Promise[Uint8Array] = js.native
  def exportAsync(settings: ExportSettings): js.Promise[Uint8Array] = js.native
  
  var exportSettings: js.Array[ExportSettings] = js.native
}
