package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BootstrapUploadControlValidationSettings extends Control {
  
  val allowedFileExtensions: js.Array[String] = js.native
  
  val invalidFileNameCharacters: js.Array[String] = js.native
  
  val maxFileCount: Double = js.native
  
  val maxFileSize: Double = js.native
  
  def off(
    eventName: js.UndefOr[scala.Nothing],
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EventArgs], Unit]
  ): this.type = js.native
}
