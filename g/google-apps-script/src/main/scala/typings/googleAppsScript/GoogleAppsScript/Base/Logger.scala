package typings.googleAppsScript.GoogleAppsScript.Base

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This class allows the developer to write out text to the debugging logs.
  */
@js.native
trait Logger extends StObject {
  
  def clear(): Unit = js.native
  
  def getLog(): String = js.native
  
  def log(data: js.Any): Logger = js.native
  def log(format: String, values: js.Any*): Logger = js.native
}
