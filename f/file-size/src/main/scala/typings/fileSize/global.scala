package typings.fileSize

import typings.fileSize.mod.Options
import typings.fileSize.mod.Result
import typings.std.Required
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  inline def filesize[T /* <: Options */](bytes: Double): Required[T] & Result = js.Dynamic.global.applyDynamic("filesize")(bytes.asInstanceOf[js.Any]).asInstanceOf[Required[T] & Result]
  inline def filesize[T /* <: Options */](bytes: Double, options: T): Required[T] & Result = (js.Dynamic.global.applyDynamic("filesize")(bytes.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Required[T] & Result]
}
