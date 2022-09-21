package typings.firefox

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Apps extends StObject {
  
  def checkInstalled(url: String): DOMRequest[App] = js.native
  
  def getInstalled(): DOMRequest[js.Array[App]] = js.native
  
  def getSelf(): DOMRequest[App] = js.native
  
  def install(url: String): DOMRequest[App] = js.native
  def install(url: String, receipts: js.Array[Any]): DOMRequest[App] = js.native
}
