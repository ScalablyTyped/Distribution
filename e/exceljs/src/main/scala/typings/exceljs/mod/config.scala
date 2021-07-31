package typings.exceljs.mod

import typings.exceljs.exceljsStrings.promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object config {
  
  @JSImport("exceljs", "config")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def setValue_promise(key: promise, promise: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setValue")(key.asInstanceOf[js.Any], promise.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
